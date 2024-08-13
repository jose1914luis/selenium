import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RobotConcesion implements Robot {
    public ChromeDriver driver;
    public Properties props;

    RobotConcesion(ChromeDriver driver, Properties props) {

        this.driver = driver;
        this.props = props;
    }

    public WebElement waitElement(String search, String type, String timer) throws InterruptedException {

        int times = 10;

        do {
            try {

                //Thread.sleep(Integer.parseInt(props.getProperty(timer)) * 1000);
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(props.getProperty(timer))));

                switch (type) {
                    case "id":
                        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(search)));
                    case "css":
                        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(search)));
                    case "path":
                        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search)));
                    case "link":
                        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(props.getProperty(search))));
                }

            } catch (Exception e) {

                System.out.println(e.getMessage());
            } finally {

                times--;
            }

        } while (times > 0);

        return null;
    }

    public void stepOne() throws InterruptedException {
        WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'Radicar solicitud de propuesta')]"));
        submenu.click();

        //Seleccionar usuario
        Select selectPIN = new Select(waitElement("pinSlctId", "id", "timer2"));
        selectPIN.selectByVisibleText(props.getProperty("pinSlctId"));

        WebElement buttonNext1 = driver.findElement(By.xpath("//span[@class='btn-label ng-binding']"));
        buttonNext1.click();

    }

    public void stepTwo() throws InterruptedException {

        //Ingresar detalles del área
        WebElement btnMineral = waitElement(".btn-default", "css", "timer3");
        btnMineral.click();

        WebElement labelMineral = waitElement("mineral", "link", "timer4");
        labelMineral.click();

        Select selectArea = new Select(driver.findElement(By.id(("areaOfConcessionSlctId"))));
        selectArea.selectByVisibleText(props.getProperty("areaOfConcessionSlctId"));

        WebElement tabMap = waitElement("//li[@class='uib-tab nav-item ng-scope ng-isolate-scope']", "path", "timer5");
        tabMap.click();

        Select selectTypeCoord = new Select(driver.findElement(By.id(("selectedCellInputMethodSlctId"))));
        selectTypeCoord.selectByVisibleText(props.getProperty("selectedCellInputMethodSlctId"));
        if (props.getProperty("selectedCellInputMethodSlctId").equals("Usando el mapa de selección para dibujar un polígono o ingresar celdas")) {


            WebElement currentAssetId0 = driver.findElement(By.id(("cellIdsTxtId")));
            currentAssetId0.sendKeys(props.getProperty("cells"));

        } else {
            //old way

            WebElement btnMap = driver.findElement(By.id(("uploadShapeFileMapButtonId")));
            btnMap.click();

            Thread.sleep(Integer.parseInt(props.getProperty("timer6")) * 1000);

            driver.switchTo().frame("mapIframeId");
            Select selectTypeMap = new Select(driver.findElement(By.xpath("//select[@data-gcx-form-item='ListBox1']")));
            selectTypeMap.selectByVisibleText(props.getProperty("selectTypeMap"));

            WebElement btnContinue = driver.findElement(By.cssSelector("form:nth-child(2) .button"));
            btnContinue.click();

            WebElement pikerLoad = waitElement("//input[@data-gcx-form-item='FilePicker1']", "path", "timer7");
            pikerLoad.sendKeys(props.getProperty("pikerLoad"));

            WebElement btnLoad = driver.findElement(By.cssSelector("form:nth-child(2) .button"));
            btnLoad.click();

            Thread.sleep(Integer.parseInt(props.getProperty("timer8")) * 1000);

            driver.switchTo().defaultContent();
            WebElement btnConfirm = driver.findElement(By.id(("confirmBtnId")));
            btnConfirm.click();
        }


        WebElement buttonNext2 = waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", "path", "timer9");
        buttonNext2.click();


        //Información técnica
        WebElement tabInfoTec = waitElement("//div[@id='main']//li[3]//a[1]", "path", "timer10");
        tabInfoTec.click();
    }

    public void stepThree() throws InterruptedException {


        //Thread.sleep(Integer.parseInt(props.getProperty("timer11"))*1000);
        Select selectYOE0 = new Select(waitElement("yearOfExecutionId0", "id", "timer11"));
        selectYOE0.selectByVisibleText(props.getProperty("yearOfExecutionId0"));
        Select selectYOD0 = new Select(driver.findElement(By.id(("yearOfDeliveryId0"))));
        selectYOD0.selectByVisibleText(props.getProperty("yearOfDeliveryId0"));
        Select selectLS0 = new Select(driver.findElement(By.id(("laborSuitabilityId0"))));
        selectLS0.selectByVisibleText(props.getProperty("laborSuitabilityId0"));


        ExecutorService executor = Executors.newFixedThreadPool(4); // create a pool of 4 threads

        for (int i = 0; i < 17; i++) {

            final int index = i; // create a final variable for the current index to use inside the lambda expression
            executor.submit(() -> {
                if (index > 0) {
                    Select selectYOE1 = new Select(driver.findElement(By.id(Constans.YEAROFEXECUTIONID + index)));
                    selectYOE1.selectByVisibleText(props.getProperty(Constans.YEAROFEXECUTIONID + index));

                    Select selectYOD1 = new Select(driver.findElement(By.id(Constans.YEAROFDELIVERYID + index)));
                    selectYOD1.selectByVisibleText(props.getProperty(Constans.YEAROFDELIVERYID + index));

                    Select selectLS1 = new Select(driver.findElement(By.id(Constans.LABORSUITABILITYID + index)));
                    selectLS1.selectByVisibleText(props.getProperty(Constans.LABORSUITABILITYID + index));
                }

                if (index >= 0) {

                    Select selectELS0 = new Select(driver.findElement(By.id(Constans.ENVLABORSUITABILITYID + index)));
                    selectELS0.selectByVisibleText(props.getProperty(Constans.ENVLABORSUITABILITYID + index));
                }
            });

        }

        executor.shutdown(); // shut down the executor once all tasks are submitted
        executor.awaitTermination(1, TimeUnit.MINUTES); // wait for all tasks to complete

        System.out.println("All tasks have finished processing");

        Select selectTPD = new Select(driver.findElement(By.id(("techProfessionalDesignationId"))));
        selectTPD.selectByVisibleText(props.getProperty("techProfessionalDesignationId"));


        WebElement checkboxAccept = driver.findElement(By.id(("technicalCheckboxId")));
        checkboxAccept.click();

        Select selectTAN = new Select(waitElement("techApplicantNameId", "id", "timer12"));
        selectTAN.selectByValue(props.getProperty("techApplicantNameId"));

        WebElement buttonAdd = driver.findElement(By.xpath("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']"));
        buttonAdd.click();


        //Información del area
        WebElement tabArea = driver.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]"));
        tabArea.click();

        if (props.getProperty("additionalEthnicGroupsInSelectedAreaIndId") == "SI") {

            WebElement additionalEthnicGroupsInSelectedAreaIndId = waitElement("//div[@class='tab-pane ng-scope active']//input[1]", "path", "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        } else {
            WebElement additionalEthnicGroupsInSelectedAreaIndId = waitElement("//input[2]", "path", "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        }

        WebElement tabEco = driver.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]"));
        tabEco.click();
    }

    public void stepFour() throws InterruptedException {

        //Información economica
        if (props.getProperty("declareIndId0").toString().equals("SI")) {

            WebElement declareIndId0 = driver.findElement(By.id(("declareIndId0")));
            declareIndId0.click();
        }

        WebElement currentAssetId0 = driver.findElement(By.id(("currentAssetId0")));
        currentAssetId0.sendKeys(props.getProperty("currentAssetId0"));

        WebElement currentLiabilitiesId0 = driver.findElement(By.id(("currentLiabilitiesId0")));
        currentLiabilitiesId0.sendKeys(props.getProperty("currentLiabilitiesId0"));

        WebElement totalAssetId0 = driver.findElement(By.id(("totalAssetId0")));
        totalAssetId0.sendKeys(props.getProperty("totalAssetId0"));

        WebElement totalLiabilitiesId0 = driver.findElement(By.id(("totalLiabilitiesId0")));
        totalLiabilitiesId0.sendKeys(props.getProperty("totalLiabilitiesId0"));

        Select selectEPD = new Select(driver.findElement(By.id(("ecoProfessionalDesignationId"))));
        selectEPD.selectByVisibleText(props.getProperty("ecoProfessionalDesignationId"));

        Thread.sleep(Integer.parseInt(props.getProperty("timer15")) * 1000);

        Select selectEAN = new Select(waitElement("ecoApplicantNameId", "id", "timer15"));
        //selectEAN.selectByVisibleText(props.getProperty("ecoApplicantNameId"));
        selectEAN.selectByValue(props.getProperty("ecoApplicantNameId"));

        WebElement buttonAdd2 = driver.findElement(By.xpath(" //div[@class='tab-pane ng-scope active']//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]"));
        buttonAdd2.click();

        WebElement buttonNext3 = driver.findElement(By.xpath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]"));
        buttonNext3.click();

        Thread.sleep(Integer.parseInt(props.getProperty("timer15")) * 1000);

    }

    public void stepFive() throws InterruptedException {

        //ambiental certification
        WebElement tabCert = driver.findElement(By.xpath("//form[@name='p_CaaIataAttachDocumentsForm']//li[5]"));
        tabCert.click();

        Thread.sleep(Integer.parseInt(props.getProperty("timer15")) * 1000);

        WebElement pikerFile = driver.findElement(By.id(("p_CaaCataEnvMandatoryDocumentToAttachId0")));
        pikerFile.sendKeys(props.getProperty("pdfGeo"));

        WebElement pikerCert = driver.findElement(By.id(("p_CaaCataEnvMandatoryDocumentToAttachId1")));
        pikerCert.sendKeys(props.getProperty("pdfCert"));

        WebElement bntDeclare = driver.findElement(By.id(("acceptanceOfTermsId")));
        bntDeclare.click();
        Thread.sleep(Integer.parseInt(props.getProperty("timer15")) * 1000);


        WebElement tabDoc = driver.findElement(By.xpath("//form[@name='p_CaaIataAttachDocumentsForm']//li[6]"));
        tabDoc.click();

        Thread.sleep(Integer.parseInt(props.getProperty("timer15")) * 1000);

        WebElement pikerFile0 = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId0")));
        pikerFile0.sendKeys(props.getProperty("file0"));

        WebElement pikerFile1 = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId1")));
        pikerFile1.sendKeys(props.getProperty("file1"));

        WebElement pikerFile2 = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId2")));
        pikerFile2.sendKeys(props.getProperty("file2"));

        WebElement pikerFile3 = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId3")));
        pikerFile3.sendKeys(props.getProperty("file3"));

        WebElement pikerFile5 = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId5")));
        pikerFile5.sendKeys(props.getProperty("file4"));

        WebElement pikerFile6 = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId6")));
        pikerFile6.sendKeys(props.getProperty("file5"));

        WebElement pikerFile7 = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId7")));
        pikerFile7.sendKeys(props.getProperty("file6"));

        WebElement pikerFile8 = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId8")));
        pikerFile8.sendKeys(props.getProperty("file7"));

        int counter = 10;
        for (int i = 1; props.containsKey("generatedField" + i); i++) {


            WebElement pikerFileAgregar = driver.findElement(By.id(("p_CaaCataDocumentToAttachId")));
            pikerFileAgregar.sendKeys(props.getProperty("generatedField" + i));

            Thread.sleep(Integer.parseInt(props.getProperty("timer15")) * 1000);


            // Localiza el combobox por su ID y haz clic en él para abrir las opciones
            WebElement tipoDoctDropdown = driver.findElement(By.id("p_CaaCataDocumentTypeId" + counter));
            tipoDoctDropdown.click(); // Esto debería abrir las opciones si no están ya abiertas

            // Espera hasta que las opciones estén visibles
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Ajusta el tiempo según sea necesario
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ui-select-choices-row-inner")));


            WebElement option = driver.findElement(By.xpath("//div[contains(@class, 'ui-select-choices-row-inner')]/span[normalize-space()='" + props.getProperty("generatedCombo" + i) + "']"));
            option.click(); // Selecciona la opción

            counter++;
        }

        WebElement buttonNext3 = driver.findElement(By.xpath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]"));
        buttonNext3.click();
    }

    public void executeANMLogin() throws InterruptedException {

        //login
        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys(props.getProperty("username"));

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(props.getProperty("password"));

        WebElement buttonLogin = driver.findElement(By.id("loginButton"));
        buttonLogin.click();


        Thread.sleep(Integer.parseInt(props.getProperty("timer1")) * 1000);

        WebElement menu = driver.findElement(By.xpath("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]"));
        menu.click();

        Thread.sleep(5000);

        //Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        //selectCambiarUsuario.selectByVisibleText(props.getProperty("cambiarUsuario"));
    }
}
