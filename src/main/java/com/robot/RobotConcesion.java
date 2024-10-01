package main.java.com.robot;

import main.java.com.robot.services.AnmPropertiesService;
import main.java.com.robot.services.WebDriverService;
import org.openqa.selenium.By;
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

    public void stepOne() throws InterruptedException {
        webDriverService.findElement(By.xpath("//a[contains(text(),'Radicar solicitud de propuesta')]")).click();

        //Seleccionar usuario
        new Select(webDriverService.waitElement("pinSlctId", ID, "timer2"))
                .selectByVisibleText(anmPropertiesService.getProperty("pinSlctId"));

        webDriverService.findElement(By.xpath("//span[@class='btn-label ng-binding']")).click();

    }

    public void stepTwo() throws InterruptedException {

        //Ingresar detalles del área
        webDriverService.waitElement(".btn-default", CSS, "timer3").click();

        webDriverService.waitElement("mineral", LINK, "timer4").click();

        new Select(webDriverService.findElement(By.id(("areaOfConcessionSlctId"))))
                .selectByVisibleText(anmPropertiesService.getProperty("areaOfConcessionSlctId"));

        if (isDobleSol) {
            webDriverService.findElement(By.id(("applicantNameId"))).sendKeys(anmPropertiesService.getProperty("applicantNameId"));

            webDriverService.waitElement("applicantName", LINK, "timer4").click();

            webDriverService.waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]", XPATH, "timer9").click();

            Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000L);
        }


        webDriverService.waitElement("//li[@class='uib-tab nav-item ng-scope ng-isolate-scope']", XPATH, "timer5").click();

        Select selectTypeCoord = new Select(webDriverService.findElement(By.id(("selectedCellInputMethodSlctId"))));
        selectTypeCoord.selectByVisibleText(anmPropertiesService.getProperty("selectedCellInputMethodSlctId"));
        if (anmPropertiesService.getProperty("selectedCellInputMethodSlctId").equals("Usando el mapa de selección para dibujar un polígono o ingresar celdas")) {


            WebElement currentAssetId0 = webDriverService.findElement(By.id(("cellIdsTxtId")));
            currentAssetId0.sendKeys(anmPropertiesService.getProperty("cells"));

        } else {
            //old way

            webDriverService.findElement(By.id(("uploadShapeFileMapButtonId"))).click();

            Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer6")) * 1000);

            webDriverService.getDriver().switchTo().frame("mapIframeId");
            new Select(webDriverService.findElement(By.xpath("//select[@data-gcx-form-item='ListBox1']")))
                    .selectByVisibleText(anmPropertiesService.getProperty("selectTypeMap"));

            webDriverService.findElement(By.cssSelector("form:nth-child(2) .button")).click();

            WebElement pikerLoad = webDriverService.waitElement("//input[@data-gcx-form-item='FilePicker1']", XPATH, "timer7");
            pikerLoad.sendKeys(anmPropertiesService.getProperty("pikerLoad"));

            webDriverService.findElement(By.cssSelector("form:nth-child(2) .button")).click();

            Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer8")) * 1000);

            webDriverService.getDriver().switchTo().defaultContent();
            webDriverService.findElement(By.id(("confirmBtnId"))).click();
        }

        webDriverService.waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", XPATH, "timer9").click();

        webDriverService.waitElement("//div[@id='main']//li[3]//a[1]", XPATH, "timer10").click();
    }

    public void stepThree() throws InterruptedException {


        //Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer11"))*1000);
        new Select(webDriverService.waitElement("yearOfExecutionId0", ID, "timer11"))
                .selectByVisibleText(anmPropertiesService.getProperty("yearOfExecutionId0"));
        new Select(webDriverService.findElement(By.id(("yearOfDeliveryId0"))))
                .selectByVisibleText(anmPropertiesService.getProperty("yearOfDeliveryId0"));
        new Select(webDriverService.findElement(By.id(("laborSuitabilityId0"))))
                .selectByVisibleText(anmPropertiesService.getProperty("laborSuitabilityId0"));


        ExecutorService executor = Executors.newFixedThreadPool(4); // create a pool of 4 threads

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

        new Select(webDriverService.waitElement("techApplicantNameId", ID, "timer12"))
                .selectByValue(anmPropertiesService.getProperty("techApplicantNameId"));

        webDriverService.findElement(By.xpath("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']")).click();


        webDriverService.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]")).click();

        if (anmPropertiesService.getProperty("additionalEthnicGroupsInSelectedAreaIndId") == "SI") {

            webDriverService.waitElement("//div[@class='tab-pane ng-scope active']//input[1]", XPATH, "timer13").click();
        } else {
           webDriverService.waitElement("//input[2]", XPATH, "timer13").click();
        }

        webDriverService.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]")).click();
    }

    public void stepFour() throws InterruptedException {

        //Información economica
        if (Boolean.parseBoolean(anmPropertiesService.getProperty("declareIndId0"))) {

            webDriverService.findElement(By.id(("declareIndId0"))).click();
        }

        webDriverService.findElement(By.id(("currentAssetId0"))).sendKeys(anmPropertiesService.getProperty("currentAssetId0"));

        webDriverService.findElement(By.id(("currentLiabilitiesId0"))).sendKeys(anmPropertiesService.getProperty("currentLiabilitiesId0"));

        webDriverService.findElement(By.id(("totalAssetId0"))).sendKeys(anmPropertiesService.getProperty("totalAssetId0"));

        webDriverService.findElement(By.id(("totalLiabilitiesId0"))).sendKeys(anmPropertiesService.getProperty("totalLiabilitiesId0"));

        if (isDobleSol) {

            if (Boolean.parseBoolean(anmPropertiesService.getProperty("declareIndId1"))) {

                webDriverService.findElement(By.id(("declareIndId1"))).click();
            }

            webDriverService.findElement(By.id(("currentAssetId1")))
                    .sendKeys(anmPropertiesService.getProperty("currentAssetId1"));

            webDriverService.findElement(By.id(("currentLiabilitiesId1")))
                    .sendKeys(anmPropertiesService.getProperty("currentLiabilitiesId1"));

            webDriverService.findElement(By.id(("totalAssetId1")))
                    .sendKeys(anmPropertiesService.getProperty("totalAssetId1"));

            webDriverService.findElement(By.id(("totalLiabilitiesId1")))
                    .sendKeys(anmPropertiesService.getProperty("totalLiabilitiesId1"));
        }

        new Select(webDriverService.findElement(By.id(("ecoProfessionalDesignationId"))))
                .selectByVisibleText(anmPropertiesService.getProperty("ecoProfessionalDesignationId"));

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);

        new Select(webDriverService.waitElement("ecoApplicantNameId", ID, "timer15"))
                .selectByValue(anmPropertiesService.getProperty("ecoApplicantNameId"));

        webDriverService.findElement(By.xpath(" //div[@class='tab-pane ng-scope active']//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]")).click();

        webDriverService.findElement(By.xpath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]")).click();

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);

    }

    public void stepFive() throws InterruptedException {

        webDriverService.findElement(By.xpath("//form[@name='p_CaaIataAttachDocumentsForm']//li[5]")).click();

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);

        webDriverService.findElement(By.id(("p_CaaCataEnvMandatoryDocumentToAttachId0")))
                .sendKeys(anmPropertiesService.getProperty("pdfGeo"));

        webDriverService.findElement(By.id(("p_CaaCataEnvMandatoryDocumentToAttachId1")))
                .sendKeys(anmPropertiesService.getProperty("pdfCert"));

        webDriverService.findElement(By.id(("acceptanceOfTermsId"))).click();

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);


        webDriverService.findElement(By.xpath("//form[@name='p_CaaIataAttachDocumentsForm']//li[6]")).click();

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);

        webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId0")))
                .sendKeys(anmPropertiesService.getProperty("file0"));

        webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId1")))
                .sendKeys(anmPropertiesService.getProperty("file1"));

        webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId2")))
                .sendKeys(anmPropertiesService.getProperty("file2"));

        webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId3")))
                .sendKeys(anmPropertiesService.getProperty("file3"));

        webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId5")))
                .sendKeys(anmPropertiesService.getProperty("file4"));

        webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId6")))
                .sendKeys(anmPropertiesService.getProperty("file5"));

        webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId7")))
                .sendKeys(anmPropertiesService.getProperty("file6"));

        webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId8")))
                .sendKeys(anmPropertiesService.getProperty("file7"));

        if (isDobleSol) {
           webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId9")))
                   .sendKeys(anmPropertiesService.getProperty("file8"));

            webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId10")))
                    .sendKeys(anmPropertiesService.getProperty("file9"));

            webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId11")))
                    .sendKeys(anmPropertiesService.getProperty("file10"));

            webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId12")))
                    .sendKeys(anmPropertiesService.getProperty("file11"));
        }


        int counter = 10;
        for (int i = 1; anmPropertiesService.getProperties().containsKey("generatedField" + i); i++) {


            webDriverService.findElement(By.id(("p_CaaCataDocumentToAttachId")))
                    .sendKeys(anmPropertiesService.getProperty("generatedField" + i));

            Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);


            // Localiza el combobox por su ID y haz clic en él para abrir las opciones
           webDriverService.findElement(By.id("p_CaaCataDocumentTypeId" + counter)).click(); // Esto debería abrir las opciones si no están ya abiertas

            new WebDriverWait(webDriverService.getDriver(), Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-select-choices-row-inner")));

            webDriverService.findElement(By.xpath("//div[contains(@class, 'ui-select-choices-row-inner')]/span[normalize-space()='"
                    + anmPropertiesService.getProperty("generatedCombo" + i) + "']")).click(); // Selecciona la opción

            counter++;
        }

        webDriverService.findElement(By.xpath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]")).click();
    }

    public void executeANMLogin() throws InterruptedException {

        webDriverService.findElement(By.id("username"))
                .sendKeys(anmPropertiesService.getProperty("username"));

        webDriverService.findElement(By.id("password"))
                .sendKeys(anmPropertiesService.getProperty("password"));

        webDriverService.findElement(By.id("loginButton")).click();


        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer1")) * 1000);

        webDriverService.findElement(By.xpath("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]")).click();

    }
}
