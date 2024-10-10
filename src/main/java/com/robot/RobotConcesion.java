package main.java.com.robot;

import main.java.com.robot.services.AnmPropertiesService;
import main.java.com.robot.services.WebDriverService;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static main.java.com.robot.Constans.SelectorType.*;

@Component
public class RobotConcesion {
    private final WebDriverService webDriverService;
    private final AnmPropertiesService anmPropertiesService;
    private final boolean isDobleSol;

    @Autowired
    public RobotConcesion(WebDriverService webDriverService, AnmPropertiesService anmPropertiesService) {

        this.webDriverService = webDriverService;
        this.anmPropertiesService = anmPropertiesService;
        isDobleSol = Boolean.parseBoolean(anmPropertiesService.getProperty("secondSol"));
    }

    public void stepOne(){

        try{

            webDriverService.waitElement("//a[contains(text(),'Radicar solicitud de propuesta')]",XPATH).click();

            webDriverService.selectOptionWhenReady("pinSlctId", anmPropertiesService.getProperty("pinSlctId"), "text");

            webDriverService.waitElement("//span[@class='btn-label ng-binding']",XPATH).click();

        }catch (NoSuchElementException | TimeoutException e){

            System.err.println("Error en stepOne: " + e.getMessage());
        }
    }

    public void stepTwo(){

        try{
            //Ingresar detalles del área
            webDriverService.waitElement(".btn-default", CSS).click();

            webDriverService.waitElement("mineral", LINK).click();

            webDriverService.selectOptionWhenReady("areaOfConcessionSlctId",
                    anmPropertiesService.getProperty("areaOfConcessionSlctId"), "text");


            if (isDobleSol) {
                webDriverService.waitElement("applicantNameId", ID).sendKeys(anmPropertiesService.getProperty("applicantNameId"));

                webDriverService.waitElement("applicantName", LINK).click();

                webDriverService.waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]", XPATH).click();

            }


            webDriverService.waitElement("//li[@class='uib-tab nav-item ng-scope ng-isolate-scope']", XPATH).click();

            webDriverService.selectOptionWhenReady("selectedCellInputMethodSlctId",
                    anmPropertiesService.getProperty("selectedCellInputMethodSlctId"), "text");

            if (anmPropertiesService.getProperty("selectedCellInputMethodSlctId").equals("Usando el mapa de selección para dibujar un polígono o ingresar celdas")) {


                webDriverService.waitElement("cellIdsTxtId", ID).sendKeys(anmPropertiesService.getProperty("cells"));

            } else {
                //old way

                webDriverService.findElement(By.id(("uploadShapeFileMapButtonId"))).click();

                webDriverService.getDriver().switchTo().frame("mapIframeId");
                new Select(webDriverService.waitElement("//select[@data-gcx-form-item='ListBox1']",XPATH))
                        .selectByVisibleText(anmPropertiesService.getProperty("selectTypeMap"));

                webDriverService.findElement(By.cssSelector("form:nth-child(2) .button")).click();

                webDriverService.waitElement("//input[@data-gcx-form-item='FilePicker1']", XPATH).sendKeys(anmPropertiesService.getProperty("pikerLoad"));

                webDriverService.findElement(By.cssSelector("form:nth-child(2) .button")).click();

                webDriverService.getDriver().switchTo().defaultContent();
                webDriverService.findElement(By.id(("confirmBtnId"))).click();
            }

            webDriverService.waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", XPATH).click();

            webDriverService.waitElement("//div[@id='main']//li[3]//a[1]", XPATH).click();

        }catch (NoSuchElementException | TimeoutException e){

            System.err.println("Error en stepTwo: " + e.getMessage());
        }

    }

    public void stepThree() throws InterruptedException {


        new Select(webDriverService.waitElement("yearOfExecutionId0", ID))
                .selectByVisibleText(anmPropertiesService.getProperty("yearOfExecutionId0"));
        new Select(webDriverService.findElement(By.id(("yearOfDeliveryId0"))))
                .selectByVisibleText(anmPropertiesService.getProperty("yearOfDeliveryId0"));
        new Select(webDriverService.findElement(By.id(("laborSuitabilityId0"))))
                .selectByVisibleText(anmPropertiesService.getProperty("laborSuitabilityId0"));


        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(availableProcessors); // pool de hilos basado en los núcleos de la CPU


        for (int i = 0; i < 17; i++) {

            final int index = i; // create a final variable for the current index to use inside the lambda expression
            executor.submit(() -> {
                if (index > 0) {
                    new Select(webDriverService.findElement(By.id(Constans.YEAROFEXECUTIONID + index)))
                            .selectByVisibleText(anmPropertiesService.getProperty(Constans.YEAROFEXECUTIONID + index));

                    new Select(webDriverService.findElement(By.id(Constans.YEAROFDELIVERYID + index)))
                            .selectByVisibleText(anmPropertiesService.getProperty(Constans.YEAROFDELIVERYID + index));

                    new Select(webDriverService.findElement(By.id(Constans.LABORSUITABILITYID + index)))
                            .selectByVisibleText(anmPropertiesService.getProperty(Constans.LABORSUITABILITYID + index));
                }

                if (index >= 0) {

                    new Select(webDriverService.findElement(By.id(Constans.ENVLABORSUITABILITYID + index)))
                            .selectByVisibleText(anmPropertiesService.getProperty(Constans.ENVLABORSUITABILITYID + index));
                }
            });

        }

        executor.shutdown(); // shut down the executor once all tasks are submitted
        executor.awaitTermination(1, TimeUnit.MINUTES); // wait for all tasks to complete

        System.out.println("All tasks have finished processing");

        new Select(webDriverService.findElement(By.id(("techProfessionalDesignationId"))))
                .selectByVisibleText(anmPropertiesService.getProperty("techProfessionalDesignationId"));


        webDriverService.findElement(By.id(("technicalCheckboxId"))).click();

        new Select(webDriverService.waitElement("techApplicantNameId", ID))
                .selectByValue(anmPropertiesService.getProperty("techApplicantNameId"));

        webDriverService.waitElement("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']",XPATH).click();


        webDriverService.waitElement("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]",XPATH).click();

        if (anmPropertiesService.getProperty("additionalEthnicGroupsInSelectedAreaIndId") == "SI") {

            webDriverService.waitElement("//div[@class='tab-pane ng-scope active']//input[1]", XPATH).click();
        } else {
           webDriverService.waitElement("//input[2]", XPATH).click();
        }

        webDriverService.waitElement("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]",XPATH).click();
    }

    public void stepFour() {

        try{
            //Información economica
            if (Boolean.parseBoolean(anmPropertiesService.getProperty("declareIndId0"))) {

                webDriverService.findElement(By.id(("declareIndId0"))).click();
            }

            webDriverService.sendKeys(By.id("currentAssetId0"),"currentAssetId0");

            webDriverService.sendKeys(By.id("currentLiabilitiesId0"),"currentLiabilitiesId0");

            webDriverService.sendKeys(By.id("totalAssetId0"),"totalAssetId0");

            webDriverService.sendKeys(By.id("totalLiabilitiesId0"),"totalLiabilitiesId0");

            if (isDobleSol) {

                if (Boolean.parseBoolean(anmPropertiesService.getProperty("declareIndId1"))) {

                    webDriverService.findElement(By.id(("declareIndId1"))).click();
                }

                webDriverService.sendKeys(By.id("currentAssetId1"),"currentAssetId1");

                webDriverService.sendKeys(By.id("currentLiabilitiesId1"),"currentLiabilitiesId1");

                webDriverService.sendKeys(By.id("totalAssetId1"),"totalAssetId1");

                webDriverService.sendKeys(By.id("totalLiabilitiesId1"),"totalLiabilitiesId1");
            }

            new Select(webDriverService.findElement(By.id(("ecoProfessionalDesignationId"))))
                    .selectByVisibleText(anmPropertiesService.getProperty("ecoProfessionalDesignationId"));


            webDriverService.selectOptionWhenReady("ecoApplicantNameId", anmPropertiesService.getProperty("ecoApplicantNameId"), "value");

            webDriverService.waitElement(" //div[@class='tab-pane ng-scope active']//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]",XPATH).click();

            webDriverService.waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]",XPATH).click();


        }catch (NoSuchElementException | TimeoutException e){

            System.err.println("Error en stepFour: " + e.getMessage());
        }

    }

    public void stepFive(){

        try{
            webDriverService.waitElement("//form[@name='p_CaaIataAttachDocumentsForm']//li[5]",XPATH).click();


            webDriverService.sendKeys(By.id("p_CaaCataEnvMandatoryDocumentToAttachId0"),"pdfGeo");

            webDriverService.sendKeys(By.id("p_CaaCataEnvMandatoryDocumentToAttachId1"),"pdfCert");

            webDriverService.findElement(By.id(("acceptanceOfTermsId"))).click();



            webDriverService.waitElement("//form[@name='p_CaaIataAttachDocumentsForm']//li[6]",XPATH).click();


            webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId0"),"file0");

            webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId1"),"file1");

            webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId2"),"file2");

            webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId3"),"file3");

            webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId5"),"file4");

            webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId6"),"file5");

            webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId7"),"file6");

            webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId8"),"file7");

            if (isDobleSol) {
                webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId9"),"file8");

                webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId10"),"file9");

                webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId11"),"file10");

                webDriverService.sendKeys(By.id("p_CaaCataMandatoryDocumentToAttachId12"),"file11");
            }


            int counter = 10;
            for (int i = 1; anmPropertiesService.getProperties().containsKey("generatedField" + i); i++) {


                webDriverService.sendKeys(By.id("p_CaaCataDocumentToAttachId"),"generatedField" + i);


                // Localiza el combobox por su ID y haz clic en él para abrir las opciones
                webDriverService.findElement(By.id("p_CaaCataDocumentTypeId" + counter)).click(); // Esto debería abrir las opciones si no están ya abiertas

                new WebDriverWait(webDriverService.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-select-choices-row-inner")));

                webDriverService.findElement(By.xpath("//div[contains(@class, 'ui-select-choices-row-inner')]/span[normalize-space()='"
                        + anmPropertiesService.getProperty("generatedCombo" + i) + "']")).click(); // Selecciona la opción

                counter++;
            }

            webDriverService.waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]",XPATH).click();

        }catch (NoSuchElementException | TimeoutException e){

            System.err.println("Error en stepFive: " + e.getMessage());
        }

    }

    public void executeANMLogin() {

        try{
            webDriverService.sendKeys(By.id("username"),"username");

            webDriverService.sendKeys(By.id("password"),"password");

            webDriverService.findElement(By.id("loginButton")).click();


            webDriverService.waitElement("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]", XPATH).click();

        }catch (NoSuchElementException | TimeoutException e){

            System.err.println("Error en executeANMLogin: " + e.getMessage());
        }



    }
}
