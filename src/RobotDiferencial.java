import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class RobotDiferencial extends RobotConcesion{

    RobotDiferencial(ChromeDriver driver, Properties props){
        super(driver,props);
    }
    public void stepOne() throws InterruptedException {

        WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'Radicar solicitud de contrato de concesión diferencial')]"));
        submenu.click();

        Select selectPIN = new Select(waitElement("pinSlctId", "id", "timer2"));

        selectPIN.selectByVisibleText(props.getProperty("pinSlctId"));

        WebElement buttonNext1 = driver.findElement(By.xpath("//span[@class='btn-label ng-binding']"));
        buttonNext1.click();

    }
    public void stepTwo() throws InterruptedException {

        WebElement btnMineral = waitElement(".btn-default", "css", "timer3");
        btnMineral.click();


        WebElement labelMineral = waitElement("mineral", "link", "timer4");
        labelMineral.click();

        Select selectArea = new Select(driver.findElement(By.id(("areaOfConcessionSlctId"))));
        selectArea.selectByVisibleText(props.getProperty("areaOfConcessionSlctId"));


        WebElement tabInfoTec = waitElement("//li[@class='uib-tab nav-item ng-scope ng-isolate-scope']//a[@class='nav-link ng-binding']", "path", "timer10");
        tabInfoTec.click();

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
            //Select selectTypeMap = new Select(driver.findElementByXPath("//select[@data-gcx-form-item='ListBox1']"));
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

        if (props.getProperty("earlyExploitationInd").toString().equals("SI")) {

            WebElement declareIndId0 = driver.findElement(By.id(("earlyExploitationIndYesId")));
            declareIndId0.click();
        }else{
            WebElement declareIndId0 = driver.findElement(By.id(("earlyExploitationIndNoId")));
            declareIndId0.click();
        }

        WebElement buttonNext2 = waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", "path", "timer9");
        buttonNext2.click();
    }
    public void stepThree() throws InterruptedException {



        //WebElement tabEco = driver.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]"));
        //tabEco.click();

        WebElement tabInfoDet = waitElement("//div[@id='main']//li[3]//a[1]", "path", "timer10");
        tabInfoDet.click();

        if (props.getProperty("earlyExploitationInd").toString().equals("SI")) {

            Select typeOfMiningId = new Select(waitElement("typeOfMiningId", "id", "timer11"));
            typeOfMiningId.selectByVisibleText(props.getProperty("typeOfMiningId"));

            Select systemOfExploitationId = new Select(waitElement("systemOfExploitationId", "id", "timer11"));
            systemOfExploitationId.selectByVisibleText(props.getProperty("systemOfExploitationId"));

            WebElement btnMineral = waitElement("//button[@class='dropdown-toggle ng-binding btn btn-default']", "path", "timer3");
            btnMineral.click();

            WebElement labelMineral = waitElement("mineral2", "link", "timer4");
            labelMineral.click();

            //WebElement btnMineral = waitElement("//button[@class='dropdown-toggle ng-binding btn btn-default']", "path", "timer3");
            btnMineral.click();


            WebElement mineralPriceInptId0 = driver.findElement(By.id(("mineralPriceInptId0")));
            mineralPriceInptId0.sendKeys(props.getProperty("mineralPriceInptId0"));

            WebElement yearlyProduction1InptId0 = driver.findElement(By.id(("yearlyProduction1InptId0")));
            yearlyProduction1InptId0.sendKeys(props.getProperty("yearlyProduction1InptId0"));

            WebElement yearlyProduction2InptId0 = driver.findElement(By.id(("yearlyProduction2InptId0")));
            yearlyProduction2InptId0.sendKeys(props.getProperty("yearlyProduction2InptId0"));

            WebElement yearlyProduction3InptId0 = driver.findElement(By.id(("yearlyProduction3InptId0")));
            yearlyProduction3InptId0.sendKeys(props.getProperty("yearlyProduction3InptId0"));

            WebElement explorationInvestmentYear1InptId = driver.findElement(By.id(("explorationInvestmentYear1InptId")));
            explorationInvestmentYear1InptId.sendKeys(props.getProperty("explorationInvestmentYear1InptId"));

            WebElement explorationInvestmentYear2InptId = driver.findElement(By.id(("explorationInvestmentYear2InptId")));
            explorationInvestmentYear2InptId.sendKeys(props.getProperty("explorationInvestmentYear2InptId"));

            WebElement explorationInvestmentYear3InptId = driver.findElement(By.id(("explorationInvestmentYear3InptId")));
            explorationInvestmentYear3InptId.sendKeys(props.getProperty("explorationInvestmentYear3InptId"));


            //**********************************************************************************************//
            for (int i = 1; i < 18; i++) {

                if(Boolean.parseBoolean(props.getProperty("checkB"+i))){
                    WebElement checkB1 = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[" + i + "]/td[2]/input[1]"));
                    checkB1.click();
                }
                //************Aspectos Ambientales Etapa de Exploración************/
                if(Boolean.parseBoolean(props.getProperty("checkC"+i))){
                    WebElement revision_ambientalCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[" + i + "]/td[2]/input[1]"));
                    revision_ambientalCH.click();
                }

            }


            for (int i = 0; i < 34; i++) {

                Select yearOfExecutionId = new Select(driver.findElement(By.id("yearOfExecutionId" + i)));
                if(i<=16){
                    yearOfExecutionId.selectByVisibleText(props.getProperty("txtActA" + (i+1)));
                }else{
                    //34-17
                    yearOfExecutionId.selectByVisibleText(props.getProperty("txtActB" + (34-i)));
                }


            }


            Select selectTPD = new Select(driver.findElement(By.id(("techProfessionalDesignationId"))));
            selectTPD.selectByVisibleText(props.getProperty("techProfessionalDesignationId"));

            //Thread.sleep(Integer.parseInt(props.getProperty(""))*1000);

            WebElement techCheckboxId = driver.findElement(By.id(("techCheckboxId")));
            techCheckboxId.click();

            Select selectTAN = new Select(waitElement("techApplicantNameId", "id", "timer12"));
            selectTAN.selectByValue(props.getProperty("techApplicantNameId"));

            WebElement buttonAdd = driver.findElement(By.xpath("//button[@data-ng-click='addApplicationContractor(applicantVO); applicantVO=null; professionalDesignationVO=null']"));
            buttonAdd.click();

            /**********************************************************
             * Información economica
             **********************************************************/

            //WebElement tabArea = driver.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]"));
            //tabArea.click();
            WebElement tabInfoEco = waitElement("//div[@id='main']//li[4]//a[1]", "path", "timer10");
            tabInfoEco.click();

            for (int i = 1; i < 4; i++) {
                WebElement operationIncomeYearInptId = driver.findElement(By.id("operationIncomeYear" + i + "InptId"));
                operationIncomeYearInptId.sendKeys(props.getProperty("operationIncomeYear" + i + "InptId"));
                for (int j = 0; j < 7; j++) {

                    WebElement yearInptId = driver.findElement(By.id("year" + i + "InptId" + j));
                    yearInptId.sendKeys(props.getProperty("year" + i + "InptId" + j));
                }

            }
            WebElement declarationOfLegalOriginOfFundsChbxId = driver.findElement(By.id(("declarationOfLegalOriginOfFundsChbxId")));
            declarationOfLegalOriginOfFundsChbxId.click();

            pasoIntermedio();

            WebElement buttonContinuar = driver.findElement(By.xpath("//button[@class='btn btn-labeled bg-color-greenDark txt-color-white ng-scope']"));
            buttonContinuar.click();

        }else{

            Select selectYOE0 = new Select(waitElement("yearOfExecutionId0", "id", "timer11"));
            selectYOE0.selectByVisibleText(props.getProperty("yearOfExecutionId0"));
            Select selectYOD0 = new Select(driver.findElement(By.id(("yearOfDeliveryId0"))));
            selectYOD0.selectByVisibleText(props.getProperty("yearOfDeliveryId0"));
            Select selectLS0 = new Select(driver.findElement(By.id(("laborSuitabilityId0"))));
            selectLS0.selectByVisibleText(props.getProperty("laborSuitabilityId0"));

            for (int i = 1; i < 17; i++) {
                Select selectYOE1 = new Select(driver.findElement(By.id("yearOfExecutionId"+i)));
                selectYOE1.selectByVisibleText(props.getProperty("yearOfExecutionId"+i));
                Select selectYOD1 = new Select(driver.findElement(By.id("yearOfDeliveryId"+i)));
                selectYOD1.selectByVisibleText(props.getProperty("yearOfDeliveryId"+i));
                Select selectLS1 = new Select(driver.findElement(By.id("laborSuitabilityId"+i)));
                selectLS1.selectByVisibleText(props.getProperty("laborSuitabilityId"+i));
            }

            //#####################################################################################

            for (int i = 0; i < 17; i++) {
                Select selectELS0 = new Select(driver.findElement(By.id("envLaborSuitabilityId"+i)));
                selectELS0.selectByVisibleText(props.getProperty("envLaborSuitabilityId"+i));
            }

            Select selectTPD = new Select(driver.findElement(By.id(("techProfessionalDesignationId"))));
            selectTPD.selectByVisibleText(props.getProperty("techProfessionalDesignationId"));

            //Thread.sleep(Integer.parseInt(props.getProperty(""))*1000);

            WebElement checkboxAccept = driver.findElement(By.id(("techCheckboxId")));
            checkboxAccept.click();

            Select selectTAN = new Select(waitElement("techApplicantNameId", "id", "timer12"));
            selectTAN.selectByValue(props.getProperty("techApplicantNameId"));
            //selectTAN.selectByVisibleText(props.getProperty("techApplicantNameId"));

            WebElement buttonAdd = driver.findElement(By.xpath("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']"));
            buttonAdd.click();

            pasoIntermedio();

            WebElement tabEco = driver.findElement(By.xpath("//li[4]//a[1]//uib-tab-heading[1]"));
            tabEco.click();

            //paso4();
        }





    }
    public void pasoIntermedio() throws InterruptedException {
        WebElement tabArea = driver.findElement(By.xpath("//div[@id='main']//li[2]//a[1]"));
        tabArea.click();

        //Thread.sleep(Integer.parseInt(props.getProperty("timer13"))*1000);

        if (props.getProperty("additionalEthnicGroupsInSelectedAreaIndId") == "SI") {

            WebElement additionalEthnicGroupsInSelectedAreaIndId = waitElement("//div[@class='tab-pane ng-scope active']//input[1]", "path", "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        } else {
            WebElement additionalEthnicGroupsInSelectedAreaIndId = waitElement("//input[2]", "path", "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        }
    }
    public void stepFour() throws InterruptedException {

        if (props.getProperty("declareIndId0").toString().equals("SI")) {

            WebElement declareIndId0 = driver.findElement(By.id(("declareIndId0")));
            declareIndId0.click();
        }

        Select personClassificationId2 = new Select(driver.findElement(By.id(("personClassificationId0"))));
        personClassificationId2.selectByVisibleText(props.getProperty("personClassificationId2"));

        if(props.getProperty("personClassificationId2").equals("Persona Natural no obligada a llevar contabilidad")){


            WebElement incomeId0 = driver.findElement(By.id(("incomeId0")));
            incomeId0.sendKeys(props.getProperty("incomeId0"));
        }else{

            WebElement currentAssetId0 = driver.findElement(By.id(("currentAssetId0")));
            currentAssetId0.sendKeys(props.getProperty("currentAssetId0"));

            WebElement currentLiabilitiesId0 = driver.findElement(By.id(("currentLiabilitiesId0")));
            currentLiabilitiesId0.sendKeys(props.getProperty("currentLiabilitiesId0"));

            WebElement totalAssetId0 = driver.findElement(By.id(("totalAssetId0")));
            totalAssetId0.sendKeys(props.getProperty("totalAssetId0"));

            WebElement totalLiabilitiesId0 = driver.findElement(By.id(("totalLiabilitiesId0")));
            totalLiabilitiesId0.sendKeys(props.getProperty("totalLiabilitiesId0"));
        }

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
    }

}
