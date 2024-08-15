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
    private AnmPropertiesService anmPropertiesService;

    @Autowired
    public RobotConcesion(WebDriverService webDriverService, AnmPropertiesService anmPropertiesService) {

        this.webDriverService = webDriverService;
        this.anmPropertiesService = anmPropertiesService;
    }

    public void stepOne() throws InterruptedException {
        WebElement submenu = webDriverService.findElement(By.xpath("//a[contains(text(),'Radicar solicitud de propuesta')]"));
        submenu.click();

        //Seleccionar usuario
        Select selectPIN = new Select(webDriverService.waitElement("pinSlctId", ID, "timer2"));
        selectPIN.selectByVisibleText(anmPropertiesService.getProperty("pinSlctId"));

        WebElement buttonNext1 = webDriverService.findElement(By.xpath("//span[@class='btn-label ng-binding']"));
        buttonNext1.click();

    }

    public void stepTwo() throws InterruptedException {

        //Ingresar detalles del área
        WebElement btnMineral = webDriverService.waitElement(".btn-default", CSS, "timer3");
        btnMineral.click();

        WebElement labelMineral = webDriverService.waitElement("mineral", LINK, "timer4");
        labelMineral.click();

        Select selectArea = new Select(webDriverService.findElement(By.id(("areaOfConcessionSlctId"))));
        selectArea.selectByVisibleText(anmPropertiesService.getProperty("areaOfConcessionSlctId"));

        WebElement tabMap = webDriverService.waitElement("//li[@class='uib-tab nav-item ng-scope ng-isolate-scope']", XPATH, "timer5");
        tabMap.click();

        Select selectTypeCoord = new Select(webDriverService.findElement(By.id(("selectedCellInputMethodSlctId"))));
        selectTypeCoord.selectByVisibleText(anmPropertiesService.getProperty("selectedCellInputMethodSlctId"));
        if (anmPropertiesService.getProperty("selectedCellInputMethodSlctId").equals("Usando el mapa de selección para dibujar un polígono o ingresar celdas")) {


            WebElement currentAssetId0 = webDriverService.findElement(By.id(("cellIdsTxtId")));
            currentAssetId0.sendKeys(anmPropertiesService.getProperty("cells"));

        } else {
            //old way

            WebElement btnMap = webDriverService.findElement(By.id(("uploadShapeFileMapButtonId")));
            btnMap.click();

            Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer6")) * 1000);

           webDriverService.getDriver().switchTo().frame("mapIframeId");
            Select selectTypeMap = new Select(webDriverService.findElement(By.xpath("//select[@data-gcx-form-item='ListBox1']")));
            selectTypeMap.selectByVisibleText(anmPropertiesService.getProperty("selectTypeMap"));

            WebElement btnContinue = webDriverService.findElement(By.cssSelector("form:nth-child(2) .button"));
            btnContinue.click();

            WebElement pikerLoad = webDriverService.waitElement("//input[@data-gcx-form-item='FilePicker1']", XPATH, "timer7");
            pikerLoad.sendKeys(anmPropertiesService.getProperty("pikerLoad"));

            WebElement btnLoad = webDriverService.findElement(By.cssSelector("form:nth-child(2) .button"));
            btnLoad.click();

            Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer8")) * 1000);

           webDriverService.getDriver().switchTo().defaultContent();
            WebElement btnConfirm = webDriverService.findElement(By.id(("confirmBtnId")));
            btnConfirm.click();
        }


        WebElement buttonNext2 = webDriverService.waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", XPATH, "timer9");
        buttonNext2.click();


        //Información técnica
        WebElement tabInfoTec = webDriverService.waitElement("//div[@id='main']//li[3]//a[1]", XPATH, "timer10");
        tabInfoTec.click();
    }

    public void stepThree() throws InterruptedException {


        //Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer11"))*1000);
        Select selectYOE0 = new Select(webDriverService.waitElement("yearOfExecutionId0", ID, "timer11"));
        selectYOE0.selectByVisibleText(anmPropertiesService.getProperty("yearOfExecutionId0"));
        Select selectYOD0 = new Select(webDriverService.findElement(By.id(("yearOfDeliveryId0"))));
        selectYOD0.selectByVisibleText(anmPropertiesService.getProperty("yearOfDeliveryId0"));
        Select selectLS0 = new Select(webDriverService.findElement(By.id(("laborSuitabilityId0"))));
        selectLS0.selectByVisibleText(anmPropertiesService.getProperty("laborSuitabilityId0"));


        ExecutorService executor = Executors.newFixedThreadPool(4); // create a pool of 4 threads

        for (int i = 0; i < 17; i++) {

            final int index = i; // create a final variable for the current index to use inside the lambda expression
            executor.submit(() -> {
                if (index > 0) {
                    Select selectYOE1 = new Select(webDriverService.findElement(By.id(Constans.YEAROFEXECUTIONID + index)));
                    selectYOE1.selectByVisibleText(anmPropertiesService.getProperty(Constans.YEAROFEXECUTIONID + index));

                    Select selectYOD1 = new Select(webDriverService.findElement(By.id(Constans.YEAROFDELIVERYID + index)));
                    selectYOD1.selectByVisibleText(anmPropertiesService.getProperty(Constans.YEAROFDELIVERYID + index));

                    Select selectLS1 = new Select(webDriverService.findElement(By.id(Constans.LABORSUITABILITYID + index)));
                    selectLS1.selectByVisibleText(anmPropertiesService.getProperty(Constans.LABORSUITABILITYID + index));
                }

                if (index >= 0) {

                    Select selectELS0 = new Select(webDriverService.findElement(By.id(Constans.ENVLABORSUITABILITYID + index)));
                    selectELS0.selectByVisibleText(anmPropertiesService.getProperty(Constans.ENVLABORSUITABILITYID + index));
                }
            });

        }

        executor.shutdown(); // shut down the executor once all tasks are submitted
        executor.awaitTermination(1, TimeUnit.MINUTES); // wait for all tasks to complete

        System.out.println("All tasks have finished processing");

        Select selectTPD = new Select(webDriverService.findElement(By.id(("techProfessionalDesignationId"))));
        selectTPD.selectByVisibleText(anmPropertiesService.getProperty("techProfessionalDesignationId"));


        WebElement checkboxAccept = webDriverService.findElement(By.id(("technicalCheckboxId")));
        checkboxAccept.click();

        Select selectTAN = new Select(webDriverService.waitElement("techApplicantNameId", ID, "timer12"));
        selectTAN.selectByValue(anmPropertiesService.getProperty("techApplicantNameId"));

        WebElement buttonAdd = webDriverService.findElement(By.xpath("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']"));
        buttonAdd.click();


        //Información del area
        WebElement tabArea = webDriverService.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]"));
        tabArea.click();

        if (anmPropertiesService.getProperty("additionalEthnicGroupsInSelectedAreaIndId") == "SI") {

            WebElement additionalEthnicGroupsInSelectedAreaIndId = webDriverService.waitElement("//div[@class='tab-pane ng-scope active']//input[1]", XPATH, "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        } else {
            WebElement additionalEthnicGroupsInSelectedAreaIndId = webDriverService.waitElement("//input[2]", XPATH, "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        }

        WebElement tabEco = webDriverService.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]"));
        tabEco.click();
    }

    public void stepFour() throws InterruptedException {

        //Información economica
        if (anmPropertiesService.getProperty("declareIndId0").toString().equals("SI")) {

            WebElement declareIndId0 = webDriverService.findElement(By.id(("declareIndId0")));
            declareIndId0.click();
        }

        WebElement currentAssetId0 = webDriverService.findElement(By.id(("currentAssetId0")));
        currentAssetId0.sendKeys(anmPropertiesService.getProperty("currentAssetId0"));

        WebElement currentLiabilitiesId0 = webDriverService.findElement(By.id(("currentLiabilitiesId0")));
        currentLiabilitiesId0.sendKeys(anmPropertiesService.getProperty("currentLiabilitiesId0"));

        WebElement totalAssetId0 = webDriverService.findElement(By.id(("totalAssetId0")));
        totalAssetId0.sendKeys(anmPropertiesService.getProperty("totalAssetId0"));

        WebElement totalLiabilitiesId0 = webDriverService.findElement(By.id(("totalLiabilitiesId0")));
        totalLiabilitiesId0.sendKeys(anmPropertiesService.getProperty("totalLiabilitiesId0"));

        Select selectEPD = new Select(webDriverService.findElement(By.id(("ecoProfessionalDesignationId"))));
        selectEPD.selectByVisibleText(anmPropertiesService.getProperty("ecoProfessionalDesignationId"));

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);

        Select selectEAN = new Select(webDriverService.waitElement("ecoApplicantNameId", ID, "timer15"));
        //selectEAN.selectByVisibleText(anmPropertiesService.getProperty("ecoApplicantNameId"));
        selectEAN.selectByValue(anmPropertiesService.getProperty("ecoApplicantNameId"));

        WebElement buttonAdd2 = webDriverService.findElement(By.xpath(" //div[@class='tab-pane ng-scope active']//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]"));
        buttonAdd2.click();

        WebElement buttonNext3 = webDriverService.findElement(By.xpath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]"));
        buttonNext3.click();

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);

    }

    public void stepFive() throws InterruptedException {

        //ambiental certification
        WebElement tabCert = webDriverService.findElement(By.xpath("//form[@name='p_CaaIataAttachDocumentsForm']//li[5]"));
        tabCert.click();

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);

        WebElement pikerFile = webDriverService.findElement(By.id(("p_CaaCataEnvMandatoryDocumentToAttachId0")));
        pikerFile.sendKeys(anmPropertiesService.getProperty("pdfGeo"));

        WebElement pikerCert = webDriverService.findElement(By.id(("p_CaaCataEnvMandatoryDocumentToAttachId1")));
        pikerCert.sendKeys(anmPropertiesService.getProperty("pdfCert"));

        WebElement bntDeclare = webDriverService.findElement(By.id(("acceptanceOfTermsId")));
        bntDeclare.click();
        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);


        WebElement tabDoc = webDriverService.findElement(By.xpath("//form[@name='p_CaaIataAttachDocumentsForm']//li[6]"));
        tabDoc.click();

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);

        WebElement pikerFile0 = webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId0")));
        pikerFile0.sendKeys(anmPropertiesService.getProperty("file0"));

        WebElement pikerFile1 = webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId1")));
        pikerFile1.sendKeys(anmPropertiesService.getProperty("file1"));

        WebElement pikerFile2 = webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId2")));
        pikerFile2.sendKeys(anmPropertiesService.getProperty("file2"));

        WebElement pikerFile3 = webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId3")));
        pikerFile3.sendKeys(anmPropertiesService.getProperty("file3"));

        WebElement pikerFile5 = webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId5")));
        pikerFile5.sendKeys(anmPropertiesService.getProperty("file4"));

        WebElement pikerFile6 = webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId6")));
        pikerFile6.sendKeys(anmPropertiesService.getProperty("file5"));

        WebElement pikerFile7 = webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId7")));
        pikerFile7.sendKeys(anmPropertiesService.getProperty("file6"));

        WebElement pikerFile8 = webDriverService.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId8")));
        pikerFile8.sendKeys(anmPropertiesService.getProperty("file7"));

        int counter = 10;
        for (int i = 1; anmPropertiesService.getProperties().containsKey("generatedField" + i); i++) {


            WebElement pikerFileAgregar = webDriverService.findElement(By.id(("p_CaaCataDocumentToAttachId")));
            pikerFileAgregar.sendKeys(anmPropertiesService.getProperty("generatedField" + i));

            Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);


            // Localiza el combobox por su ID y haz clic en él para abrir las opciones
            WebElement tipoDoctDropdown = webDriverService.findElement(By.id("p_CaaCataDocumentTypeId" + counter));
            tipoDoctDropdown.click(); // Esto debería abrir las opciones si no están ya abiertas

            WebDriverWait wait = new WebDriverWait(webDriverService.getDriver(), Duration.ofSeconds(10)); // Ajusta el tiempo según sea necesario
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-select-choices-row-inner")));

            WebElement option = webDriverService.findElement(By.xpath("//div[contains(@class, 'ui-select-choices-row-inner')]/span[normalize-space()='" + anmPropertiesService.getProperty("generatedCombo" + i) + "']"));
            option.click(); // Selecciona la opción

            counter++;
        }

        WebElement buttonNext3 = webDriverService.findElement(By.xpath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]"));
        buttonNext3.click();
    }

    public void executeANMLogin() throws InterruptedException {

        //login
        WebElement user = webDriverService.findElement(By.id("username"));
        user.sendKeys(anmPropertiesService.getProperty("username"));

        WebElement password = webDriverService.findElement(By.id("password"));
        password.sendKeys(anmPropertiesService.getProperty("password"));

        WebElement buttonLogin = webDriverService.findElement(By.id("loginButton"));
        buttonLogin.click();


        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer1")) * 1000);

        WebElement menu = webDriverService.findElement(By.xpath("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]"));
        menu.click();

        Thread.sleep(5000);

        //Select selectCambiarUsuario = new Select(webDriverService.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        //selectCambiarUsuario.selectByVisibleText(anmPropertiesService.getProperty("cambiarUsuario"));
    }
}
