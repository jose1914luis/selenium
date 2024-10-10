package main.java.com.robot;

import main.java.com.robot.services.AnmPropertiesService;
import main.java.com.robot.services.WebDriverService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Component;

import java.util.Properties;

import static main.java.com.robot.Constans.SelectorType.*;

@Component
public class RobotDiferencial{

    private final WebDriverService webDriverService;
    private final AnmPropertiesService anmPropertiesService;
    public RobotDiferencial(WebDriverService webDriverService, AnmPropertiesService anmPropertiesService) {

        this.webDriverService = webDriverService;
        this.anmPropertiesService = anmPropertiesService;
    }
    public void stepOne() throws InterruptedException {

        WebElement submenu = webDriverService.findElement(By.xpath("//a[contains(text(),'Radicar solicitud de contrato de concesión diferencial')]"));
        submenu.click();

        Select selectPIN = new Select(webDriverService.waitElement("pinSlctId", ID));

        selectPIN.selectByVisibleText(anmPropertiesService.getProperty("pinSlctId"));

        WebElement buttonNext1 = webDriverService.findElement(By.xpath("//span[@class='btn-label ng-binding']"));
        buttonNext1.click();

    }
    public void stepTwo() throws InterruptedException {

        WebElement btnMineral = webDriverService.waitElement(".btn-default", CSS);
        btnMineral.click();


        WebElement labelMineral = webDriverService.waitElement("mineral", LINK);
        labelMineral.click();

        Select selectArea = new Select(webDriverService.findElement(By.id(("areaOfConcessionSlctId"))));
        selectArea.selectByVisibleText(anmPropertiesService.getProperty("areaOfConcessionSlctId"));

        WebElement tabInfoTec = webDriverService.waitElement("//li[@class='uib-tab nav-item ng-scope ng-isolate-scope']//a[@class='nav-link ng-binding']", XPATH);
        tabInfoTec.click();

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
            //Select selectTypeMap = new Select(webDriverService.findElementByXPath("//select[@data-gcx-form-item='ListBox1']"));
            Select selectTypeMap = new Select(webDriverService.findElement(By.xpath("//select[@data-gcx-form-item='ListBox1']")));
            selectTypeMap.selectByVisibleText(anmPropertiesService.getProperty("selectTypeMap"));

            WebElement btnContinue = webDriverService.findElement(By.cssSelector("form:nth-child(2) .button"));
            btnContinue.click();
            WebElement pikerLoad = webDriverService.waitElement("//input[@data-gcx-form-item='FilePicker1']", XPATH);
            pikerLoad.sendKeys(anmPropertiesService.getProperty("pikerLoad"));

            WebElement btnLoad = webDriverService.findElement(By.cssSelector("form:nth-child(2) .button"));
            btnLoad.click();

            Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer8")) * 1000);

            webDriverService.getDriver().switchTo().defaultContent();
            WebElement btnConfirm = webDriverService.findElement(By.id(("confirmBtnId")));
            btnConfirm.click();
        }

        if (anmPropertiesService.getProperty("earlyExploitationInd").toString().equals("SI")) {

            WebElement declareIndId0 = webDriverService.findElement(By.id(("earlyExploitationIndYesId")));
            declareIndId0.click();
        }else{
            WebElement declareIndId0 = webDriverService.findElement(By.id(("earlyExploitationIndNoId")));
            declareIndId0.click();
        }

        WebElement buttonNext2 = webDriverService.waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", XPATH);
        buttonNext2.click();
    }
    public void stepThree() throws InterruptedException {



        //WebElement tabEco = webDriverService.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]"));
        //tabEco.click();

        WebElement tabInfoDet = webDriverService.waitElement("//div[@id='main']//li[3]//a[1]", XPATH);
        tabInfoDet.click();

        if (anmPropertiesService.getProperty("earlyExploitationInd").toString().equals("SI")) {

            Select typeOfMiningId = new Select(webDriverService.waitElement("typeOfMiningId", ID));
            typeOfMiningId.selectByVisibleText(anmPropertiesService.getProperty("typeOfMiningId"));

            Select systemOfExploitationId = new Select(webDriverService.waitElement("systemOfExploitationId", ID));
            systemOfExploitationId.selectByVisibleText(anmPropertiesService.getProperty("systemOfExploitationId"));

            WebElement btnMineral = webDriverService.waitElement("//button[@class='dropdown-toggle ng-binding btn btn-default']", XPATH);
            btnMineral.click();

            WebElement labelMineral = webDriverService.waitElement("mineral2", LINK);
            labelMineral.click();

            //WebElement btnMineral = webDriverService.waitElement("//button[@class='dropdown-toggle ng-binding btn btn-default']", XPATH, "timer3");
            btnMineral.click();


            WebElement mineralPriceInptId0 = webDriverService.findElement(By.id(("mineralPriceInptId0")));
            mineralPriceInptId0.sendKeys(anmPropertiesService.getProperty("mineralPriceInptId0"));

            WebElement yearlyProduction1InptId0 = webDriverService.findElement(By.id(("yearlyProduction1InptId0")));
            yearlyProduction1InptId0.sendKeys(anmPropertiesService.getProperty("yearlyProduction1InptId0"));

            WebElement yearlyProduction2InptId0 = webDriverService.findElement(By.id(("yearlyProduction2InptId0")));
            yearlyProduction2InptId0.sendKeys(anmPropertiesService.getProperty("yearlyProduction2InptId0"));

            WebElement yearlyProduction3InptId0 = webDriverService.findElement(By.id(("yearlyProduction3InptId0")));
            yearlyProduction3InptId0.sendKeys(anmPropertiesService.getProperty("yearlyProduction3InptId0"));

            WebElement explorationInvestmentYear1InptId = webDriverService.findElement(By.id(("explorationInvestmentYear1InptId")));
            explorationInvestmentYear1InptId.sendKeys(anmPropertiesService.getProperty("explorationInvestmentYear1InptId"));

            WebElement explorationInvestmentYear2InptId = webDriverService.findElement(By.id(("explorationInvestmentYear2InptId")));
            explorationInvestmentYear2InptId.sendKeys(anmPropertiesService.getProperty("explorationInvestmentYear2InptId"));

            WebElement explorationInvestmentYear3InptId = webDriverService.findElement(By.id(("explorationInvestmentYear3InptId")));
            explorationInvestmentYear3InptId.sendKeys(anmPropertiesService.getProperty("explorationInvestmentYear3InptId"));


            //**********************************************************************************************//
            for (int i = 1; i < 18; i++) {

                if(Boolean.parseBoolean(anmPropertiesService.getProperty("checkB"+i))){
                    WebElement checkB1 = webDriverService.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[2]/input[1]"));
                    checkB1.click();
                }
                //************Aspectos Ambientales Etapa de Exploración************/
                if(Boolean.parseBoolean(anmPropertiesService.getProperty("checkC"+i))){
                    WebElement revision_ambientalCH = webDriverService.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[" + i + "]/td[2]/input[1]"));
                    revision_ambientalCH.click();
                }

            }


            for (int i = 0; i < 34; i++) {

                Select yearOfExecutionId = new Select(webDriverService.findElement(By.id("yearOfExecutionId" + i)));
                if(i<=16){
                    yearOfExecutionId.selectByVisibleText(anmPropertiesService.getProperty("txtActA" + (i+1)));
                }else{
                    //34-17
                    yearOfExecutionId.selectByVisibleText(anmPropertiesService.getProperty("txtActB" + (34-i)));
                }


            }


            Select selectTPD = new Select(webDriverService.findElement(By.id(("techProfessionalDesignationId"))));
            selectTPD.selectByVisibleText(anmPropertiesService.getProperty("techProfessionalDesignationId"));

            //Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty(""))*1000);

            WebElement techCheckboxId = webDriverService.findElement(By.id(("techCheckboxId")));
            techCheckboxId.click();

            Select selectTAN = new Select(webDriverService.waitElement("techApplicantNameId", ID));
            selectTAN.selectByValue(anmPropertiesService.getProperty("techApplicantNameId"));

            WebElement buttonAdd = webDriverService.findElement(By.xpath("//button[@data-ng-click='addApplicationContractor(applicantVO); applicantVO=null; professionalDesignationVO=null']"));
            buttonAdd.click();

            /**********************************************************
             * Información economica
             **********************************************************/

            //WebElement tabArea = webDriverService.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]"));
            //tabArea.click();
            WebElement tabInfoEco = webDriverService.waitElement("//div[@id='main']//li[4]//a[1]", XPATH);
            tabInfoEco.click();

            for (int i = 1; i < 4; i++) {
                WebElement operationIncomeYearInptId = webDriverService.findElement(By.id("operationIncomeYear" + i + "InptId"));
                operationIncomeYearInptId.sendKeys(anmPropertiesService.getProperty("operationIncomeYear" + i + "InptId"));
                for (int j = 0; j < 7; j++) {

                    WebElement yearInptId = webDriverService.findElement(By.id("year" + i + "InptId" + j));
                    yearInptId.sendKeys(anmPropertiesService.getProperty("year" + i + "InptId" + j));
                }

            }
            WebElement declarationOfLegalOriginOfFundsChbxId = webDriverService.findElement(By.id(("declarationOfLegalOriginOfFundsChbxId")));
            declarationOfLegalOriginOfFundsChbxId.click();

            pasoIntermedio();

            WebElement buttonContinuar = webDriverService.findElement(By.xpath("//button[@class='btn btn-labeled bg-color-greenDark txt-color-white ng-scope']"));
            buttonContinuar.click();

        }else{

            Select selectYOE0 = new Select(webDriverService.waitElement("yearOfExecutionId0", ID));
            selectYOE0.selectByVisibleText(anmPropertiesService.getProperty("yearOfExecutionId0"));
            Select selectYOD0 = new Select(webDriverService.findElement(By.id(("yearOfDeliveryId0"))));
            selectYOD0.selectByVisibleText(anmPropertiesService.getProperty("yearOfDeliveryId0"));
            Select selectLS0 = new Select(webDriverService.findElement(By.id(("laborSuitabilityId0"))));
            selectLS0.selectByVisibleText(anmPropertiesService.getProperty("laborSuitabilityId0"));

            for (int i = 1; i < 17; i++) {
                Select selectYOE1 = new Select(webDriverService.findElement(By.id("yearOfExecutionId"+i)));
                selectYOE1.selectByVisibleText(anmPropertiesService.getProperty("yearOfExecutionId"+i));
                Select selectYOD1 = new Select(webDriverService.findElement(By.id("yearOfDeliveryId"+i)));
                selectYOD1.selectByVisibleText(anmPropertiesService.getProperty("yearOfDeliveryId"+i));
                Select selectLS1 = new Select(webDriverService.findElement(By.id("laborSuitabilityId"+i)));
                selectLS1.selectByVisibleText(anmPropertiesService.getProperty("laborSuitabilityId"+i));
            }

            //#####################################################################################

            for (int i = 0; i < 17; i++) {
                Select selectELS0 = new Select(webDriverService.findElement(By.id("envLaborSuitabilityId"+i)));
                selectELS0.selectByVisibleText(anmPropertiesService.getProperty("envLaborSuitabilityId"+i));
            }

            Select selectTPD = new Select(webDriverService.findElement(By.id(("techProfessionalDesignationId"))));
            selectTPD.selectByVisibleText(anmPropertiesService.getProperty("techProfessionalDesignationId"));

            //Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty(""))*1000);

            WebElement checkboxAccept = webDriverService.findElement(By.id(("techCheckboxId")));
            checkboxAccept.click();

            Select selectTAN = new Select(webDriverService.waitElement("techApplicantNameId", ID));
            selectTAN.selectByValue(anmPropertiesService.getProperty("techApplicantNameId"));
            //selectTAN.selectByVisibleText(anmPropertiesService.getProperty("techApplicantNameId"));

            WebElement buttonAdd = webDriverService.findElement(By.xpath("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']"));
            buttonAdd.click();

            pasoIntermedio();

            WebElement tabEco = webDriverService.findElement(By.xpath("//li[4]//a[1]//uib-tab-heading[1]"));
            tabEco.click();

            //paso4();
        }

    }
    public void pasoIntermedio() throws InterruptedException {
        WebElement tabArea = webDriverService.findElement(By.xpath("//div[@id='main']//li[2]//a[1]"));
        tabArea.click();

        //Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer13"))*1000);

        if (anmPropertiesService.getProperty("additionalEthnicGroupsInSelectedAreaIndId") == "SI") {

            WebElement additionalEthnicGroupsInSelectedAreaIndId = webDriverService.waitElement("//div[@class='tab-pane ng-scope active']//input[1]", XPATH);
            additionalEthnicGroupsInSelectedAreaIndId.click();
        } else {
            WebElement additionalEthnicGroupsInSelectedAreaIndId = webDriverService.waitElement("//input[2]", XPATH);
            additionalEthnicGroupsInSelectedAreaIndId.click();
        }
    }
    public void stepFour() throws InterruptedException {

        if (anmPropertiesService.getProperty("declareIndId0").toString().equals("SI")) {

            WebElement declareIndId0 = webDriverService.findElement(By.id(("declareIndId0")));
            declareIndId0.click();
        }

        Select personClassificationId2 = new Select(webDriverService.findElement(By.id(("personClassificationId0"))));
        personClassificationId2.selectByVisibleText(anmPropertiesService.getProperty("personClassificationId2"));

        if(anmPropertiesService.getProperty("personClassificationId2").equals("Persona Natural no obligada a llevar contabilidad")){


            WebElement incomeId0 = webDriverService.findElement(By.id(("incomeId0")));
            incomeId0.sendKeys(anmPropertiesService.getProperty("incomeId0"));
        }else{

            WebElement currentAssetId0 = webDriverService.findElement(By.id(("currentAssetId0")));
            currentAssetId0.sendKeys(anmPropertiesService.getProperty("currentAssetId0"));

            WebElement currentLiabilitiesId0 = webDriverService.findElement(By.id(("currentLiabilitiesId0")));
            currentLiabilitiesId0.sendKeys(anmPropertiesService.getProperty("currentLiabilitiesId0"));

            WebElement totalAssetId0 = webDriverService.findElement(By.id(("totalAssetId0")));
            totalAssetId0.sendKeys(anmPropertiesService.getProperty("totalAssetId0"));

            WebElement totalLiabilitiesId0 = webDriverService.findElement(By.id(("totalLiabilitiesId0")));
            totalLiabilitiesId0.sendKeys(anmPropertiesService.getProperty("totalLiabilitiesId0"));
        }

        Select selectEPD = new Select(webDriverService.findElement(By.id(("ecoProfessionalDesignationId"))));
        selectEPD.selectByVisibleText(anmPropertiesService.getProperty("ecoProfessionalDesignationId"));

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer15")) * 1000);

        Select selectEAN = new Select(webDriverService.waitElement("ecoApplicantNameId", ID));
        //selectEAN.selectByVisibleText(anmPropertiesService.getProperty("ecoApplicantNameId"));
        selectEAN.selectByValue(anmPropertiesService.getProperty("ecoApplicantNameId"));

        WebElement buttonAdd2 = webDriverService.findElement(By.xpath(" //div[@class='tab-pane ng-scope active']//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]"));
        buttonAdd2.click();

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


        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer1")) * 1000L);

        WebElement menu = webDriverService.findElement(By.xpath("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]"));
        menu.click();

        Thread.sleep(5000);

        //Select selectCambiarUsuario = new Select(webDriverService.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        //selectCambiarUsuario.selectByVisibleText(anmPropertiesService.getProperty("cambiarUsuario"));
    }

}
