import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.util.Properties;

import static javax.swing.JOptionPane.showMessageDialog;

public class Diferencial {
    private JButton guardarButton;
    private JButton ejecutarButton;
    public JPanel getRootPanel() {
        return rootPanel;
    }
    private JPanel rootPanel;
    private JButton loginButton;
    private JButton paso1Button;
    private JButton paso2Button;
    private JButton paso3Button;
    private JButton paso4Button;
    private ChromeDriver driver;
    private Properties props;

    public Diferencial(Properties props, ChromeDriver driver) {

        this.props = props;
        this.driver = driver;

        ejecutarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    executeANMLogin();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        paso1Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    paso1();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        paso2Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    paso2();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        paso3Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    paso3();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        paso4Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    paso4();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });


    }


    private void paso1() throws InterruptedException {
        //WebElement submenu = driver.findElement(By.xpath("//li[4]//ul[1]//li[1]"));
        WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'Radicar solicitud de contrato de concesión diferencial')]"));
        submenu.click();

        /**********************************************************
         * Seleccionar usuario
         **********************************************************/

        Select selectPIN = new Select(waitElement("pinSlctId", "id", "timer2"));

        //Select selectPIN = new Select(driver.findElement(By.id(("pinSlctId"));
        selectPIN.selectByVisibleText(props.getProperty("pinSlctId"));

        //Thread.sleep(1000);


        //WebElement buttonNext1 =driver.findElementByCssSelector(".btn > .ng-binding");
        WebElement buttonNext1 = driver.findElement(By.xpath("//span[@class='btn-label ng-binding']"));
        buttonNext1.click();

    }

    private void paso2() throws InterruptedException {

        //Thread.sleep(Integer.parseInt(props.getProperty("timer3"))*1000);
        /**********************************************************
         * Informacion solicitud
         **********************************************************/

        WebElement btnMineral = waitElement(".btn-default", "css", "timer3");
        btnMineral.click();

        //Thread.sleep(Integer.parseInt(props.getProperty("timer4"))*1000);

        WebElement labelMineral = waitElement("CARBÓN", "link", "timer4");
        labelMineral.click();

        Select selectArea = new Select(driver.findElement(By.id(("areaOfConcessionSlctId"))));
        selectArea.selectByVisibleText(props.getProperty("areaOfConcessionSlctId"));

        /**********************************************************
         * Detalles del area
         **********************************************************/


        //WebElement tabInfoTec = waitElement("//div[@id='main']//li[3]//a[1]", "path", "timer10");
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

            //driver.switchTo().frame("mapIframeId");
            //Thread.sleep(Integer.parseInt(props.getProperty("timer7"))*1000);

            WebElement pikerLoad = waitElement("//input[@data-gcx-form-item='FilePicker1']", "path", "timer7");
            pikerLoad.sendKeys(props.getProperty("pikerLoad"));

            WebElement btnLoad = driver.findElement(By.cssSelector("form:nth-child(2) .button"));
            btnLoad.click();

            Thread.sleep(Integer.parseInt(props.getProperty("timer8")) * 1000);

            driver.switchTo().defaultContent();
            WebElement btnConfirm = driver.findElement(By.id(("confirmBtnId")));
            btnConfirm.click();
        }


        //Thread.sleep(Integer.parseInt(props.getProperty("timer9"))*1000);

        //earlyExploitationIndYesId

        //if (props.getProperty("declareIndId0").toString().equals("SI")) {

            WebElement declareIndId0 = driver.findElement(By.id(("earlyExploitationIndYesId")));
            declareIndId0.click();
        //}

        WebElement buttonNext2 = waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", "path", "timer9");
        buttonNext2.click();
    }

    private void paso3() throws InterruptedException {

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

        //WebElement tabEco = driver.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]"));
        //tabEco.click();

        WebElement tabInfoDet = waitElement("//div[@id='main']//li[3]//a[1]", "path", "timer10");
        tabInfoDet.click();


        Select selectYOE0 = new Select(waitElement("typeOfMiningId", "id", "timer11"));
        selectYOE0.selectByVisibleText("Cielo Abierto");

        Select systemOfExploitationId = new Select(waitElement("systemOfExploitationId", "id", "timer11"));
        systemOfExploitationId.selectByVisibleText("Cantera");

        WebElement btnMineral = waitElement("//button[@class='dropdown-toggle ng-binding btn btn-default']", "path", "timer3");
        btnMineral.click();

        WebElement labelMineral = waitElement("ANTRACITA", "link", "timer4");
        labelMineral.click();

        //WebElement btnMineral = waitElement("//button[@class='dropdown-toggle ng-binding btn btn-default']", "path", "timer3");
        btnMineral.click();


        WebElement mineralPriceInptId0 = driver.findElement(By.id(("mineralPriceInptId0")));
        mineralPriceInptId0.sendKeys("1000000");

        WebElement yearlyProduction1InptId0 = driver.findElement(By.id(("yearlyProduction1InptId0")));
        yearlyProduction1InptId0.sendKeys("1000000");

        WebElement yearlyProduction2InptId0 = driver.findElement(By.id(("yearlyProduction2InptId0")));
        yearlyProduction2InptId0.sendKeys("1000000");

        WebElement yearlyProduction3InptId0 = driver.findElement(By.id(("yearlyProduction3InptId0")));
        yearlyProduction3InptId0.sendKeys("1000000");

        WebElement explorationInvestmentYear1InptId = driver.findElement(By.id(("explorationInvestmentYear1InptId")));
        explorationInvestmentYear1InptId.sendKeys("1000000");

        WebElement explorationInvestmentYear2InptId = driver.findElement(By.id(("explorationInvestmentYear2InptId")));
        explorationInvestmentYear2InptId.sendKeys("1000000");

        WebElement explorationInvestmentYear3InptId = driver.findElement(By.id(("explorationInvestmentYear3InptId")));
        explorationInvestmentYear3InptId.sendKeys("1000000");


        //**********************************************************************************************//
        WebElement revision_bibliograficaCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
        revision_bibliograficaCH.click();

        WebElement enfoque_socialCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
        enfoque_socialCH.click();

        WebElement  base_topogrAficaCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]"));
        base_topogrAficaCH.click();
        WebElement cartografía_geologicaCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"));
        cartografía_geologicaCH.click();

        WebElement excavacion_trincherasCH  = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]"));
        excavacion_trincherasCH.click();

        WebElement geoquimicaCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]"));
        geoquimicaCH.click();

        WebElement geofisicaCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[7]/td[2]/input[1]"));
        geofisicaCH.click();
        WebElement  fluvial_cauceCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[8]/td[2]/input[1]"));
        fluvial_cauceCH.click();

        WebElement sedimentologicasCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[9]/td[2]/input[1]"));
        sedimentologicasCH.click();

        WebElement  galerias_ExploratoriasCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[10]/td[2]/input[1]"));
        galerias_ExploratoriasCH.click();

        WebElement perforaciones_profundasCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[11]/td[2]/input[1]"));
        perforaciones_profundasCH.click();

        WebElement  analisis_calidadCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[12]/td[2]/input[1]"));
        analisis_calidadCH.click();

        WebElement estudio_geotecnicoCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[13]/td[2]/input[1]"));
        estudio_geotecnicoCH.click();

        WebElement estudio_HidrologicoCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[14]/td[2]/input[1]"));
        estudio_HidrologicoCH.click();

        WebElement estudio_HidrogeologicoCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[15]/td[2]/input[1]"));
        estudio_HidrogeologicoCH.click();

        WebElement modelo_geologicoCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[16]/td[2]/input[1]"));
        modelo_geologicoCH.click();

        WebElement actividades_exploratoriasCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[1]/tr[17]/td[2]/input[1]"));
        actividades_exploratoriasCH.click();

        //************Aspectos Ambientales Etapa de Exploración************/

        WebElement helipuertosCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[1]/td[2]/input[1]"));
        helipuertosCH.click();
        WebElement  aguas_LluviasCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[2]/td[2]/input[1]"));
        aguas_LluviasCH.click();

        WebElement  aguasresidualesCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[3]/td[2]/input[1]"));
        aguasresidualesCH.click();

        WebElement  cuerpos_AguaCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[4]/td[2]/input[1]"));
        cuerpos_AguaCH.click();
        WebElement materialParticuladoCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[5]/td[2]/input[1]"));
        materialParticuladoCH.click();
        WebElement manejoRuidoCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[6]/td[2]/input[1]"));
        manejoRuidoCH.click();

        WebElement manejoCombustiblesCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[7]/td[2]/input[1]"));
        manejoCombustiblesCH.click();
        WebElement manejoTaludesCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[8]/td[2]/input[1]"));
        manejoTaludesCH.click();
        WebElement manejoAccesosCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[9]/td[2]/input[1]"));
        manejoAccesosCH.click();
        WebElement manejoResiduosCH  = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[10]/td[2]/input[1]"));
        manejoResiduosCH.click();
        WebElement adecuaciónCH  = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[11]/td[2]/input[1]"));
        adecuaciónCH.click();
        WebElement manejoFaunaCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[12]/td[2]/input[1]"));
        manejoFaunaCH.click();
        WebElement planGestiónCH  = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[13]/td[2]/input[1]"));
        planGestiónCH.click();
        WebElement capacitaciónPersonalCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[14]/td[2]/input[1]"));
        capacitaciónPersonalCH.click();
        WebElement contrataciónManoCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[15]/td[2]/input[1]"));
        contrataciónManoCH.click();
        WebElement rescateArqueológicoCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[16]/td[2]/input[1]"));
        rescateArqueológicoCH.click();
        WebElement manejoHundimientosCH = driver.findElement(By.xpath("//body[1]/div[2]/div[3]/form[1]/p-pccd-xacd-title-acquisition-detail[1]/article[1]/div[1]/div[1]/div[1]/div[3]/div[1]/p-pccd-xacd-exploration-activities[1]/ext-panel[1]/article[1]/div[1]/div[1]/ng-transclude[1]/div[1]/table[1]/tbody[2]/tr[17]/td[2]/input[1]"));
        manejoHundimientosCH.click();

        for (int i = 0; i < 34; i++){

            Select yearOfExecutionId =new Select(driver.findElement(By.id("yearOfExecutionId" + i)));
            //yearOfExecutionId.selectByVisibleText(props.getProperty("yearOfExecutionId" + i));
            yearOfExecutionId.selectByVisibleText("1");
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

        for(int i = 1; i < 4; i++){
            WebElement operationIncomeYearInptId = driver.findElement(By.id("operationIncomeYear"+i+"InptId"));
            operationIncomeYearInptId.sendKeys("1000000");
            for(int j = 0; j < 7; j++){

                WebElement yearInptId = driver.findElement(By.id(("year"+i+"InptId" + j)));
                yearInptId.sendKeys("1000000");
            }

        }

        //for(int i  =0;i<4;i++){

        //}

        WebElement declarationOfLegalOriginOfFundsChbxId = driver.findElement(By.id(("declarationOfLegalOriginOfFundsChbxId")));
        declarationOfLegalOriginOfFundsChbxId.click();



        WebElement buttonContinuar = driver.findElement(By.xpath("//button[@class='btn btn-labeled bg-color-greenDark txt-color-white ng-scope']"));
        buttonContinuar.click();

        //WebElement tabInfoEco = waitElement("//div[@id='main']//li[4]//a[1]", "path", "timer10");
        //tabInfoEco.click();
        //******************************************
        /*Select selectYOE0 = new Select(waitElement("yearOfExecutionId0", "id", "timer11"));
        selectYOE0.selectByVisibleText(props.getProperty("yearOfExecutionId0"));
        Select selectYOD0 = new Select(driver.findElement(By.id(("yearOfDeliveryId0"))));
        selectYOD0.selectByVisibleText(props.getProperty("yearOfDeliveryId0"));
        Select selectLS0 = new Select(driver.findElement(By.id(("laborSuitabilityId0"))));
        selectLS0.selectByVisibleText(props.getProperty("laborSuitabilityId0"));

        Select selectYOE1 = new Select(driver.findElement(By.id(("yearOfExecutionId1"))));
        selectYOE1.selectByVisibleText(props.getProperty("yearOfExecutionId1"));
        Select selectYOD1 = new Select(driver.findElement(By.id(("yearOfDeliveryId1"))));
        selectYOD1.selectByVisibleText(props.getProperty("yearOfDeliveryId1"));
        Select selectLS1 = new Select(driver.findElement(By.id(("laborSuitabilityId1"))));
        selectLS1.selectByVisibleText(props.getProperty("laborSuitabilityId1"));

        Select selectYOE2 = new Select(driver.findElement(By.id(("yearOfExecutionId2"))));
        selectYOE2.selectByVisibleText(props.getProperty("yearOfExecutionId2"));
        Select selectYOD2 = new Select(driver.findElement(By.id(("yearOfDeliveryId2"))));
        selectYOD2.selectByVisibleText(props.getProperty("yearOfDeliveryId2"));
        Select selectLS2 = new Select(driver.findElement(By.id(("laborSuitabilityId2"))));
        selectLS2.selectByVisibleText(props.getProperty("laborSuitabilityId2"));

        Select selectYOE3 = new Select(driver.findElement(By.id(("yearOfExecutionId3"))));
        selectYOE3.selectByVisibleText(props.getProperty("yearOfExecutionId3"));
        Select selectYOD3 = new Select(driver.findElement(By.id(("yearOfDeliveryId3"))));
        selectYOD3.selectByVisibleText(props.getProperty("yearOfDeliveryId3"));
        Select selectLS3 = new Select(driver.findElement(By.id(("laborSuitabilityId3"))));
        selectLS3.selectByVisibleText(props.getProperty("laborSuitabilityId3"));

        Select selectYOE4 = new Select(driver.findElement(By.id(("yearOfExecutionId4"))));
        selectYOE4.selectByVisibleText(props.getProperty("yearOfExecutionId4"));
        Select selectYOD4 = new Select(driver.findElement(By.id(("yearOfDeliveryId4"))));
        selectYOD4.selectByVisibleText(props.getProperty("yearOfDeliveryId4"));
        Select selectLS4 = new Select(driver.findElement(By.id(("laborSuitabilityId4"))));
        selectLS4.selectByVisibleText(props.getProperty("laborSuitabilityId4"));

        Select selectYOE5 = new Select(driver.findElement(By.id(("yearOfExecutionId5"))));
        selectYOE5.selectByVisibleText(props.getProperty("yearOfExecutionId5"));
        Select selectYOD5 = new Select(driver.findElement(By.id(("yearOfDeliveryId5"))));
        selectYOD5.selectByVisibleText(props.getProperty("yearOfDeliveryId5"));
        Select selectLS5 = new Select(driver.findElement(By.id(("laborSuitabilityId5"))));
        selectLS5.selectByVisibleText(props.getProperty("laborSuitabilityId5"));

        Select selectYOE6 = new Select(driver.findElement(By.id(("yearOfExecutionId6"))));
        selectYOE6.selectByVisibleText(props.getProperty("yearOfExecutionId6"));
        Select selectYOD6 = new Select(driver.findElement(By.id(("yearOfDeliveryId6"))));
        selectYOD6.selectByVisibleText(props.getProperty("yearOfDeliveryId6"));
        Select selectLS6 = new Select(driver.findElement(By.id(("laborSuitabilityId6"))));
        selectLS6.selectByVisibleText(props.getProperty("laborSuitabilityId6"));

        Select selectYOE7 = new Select(driver.findElement(By.id(("yearOfExecutionId7"))));
        selectYOE7.selectByVisibleText(props.getProperty("yearOfExecutionId7"));
        Select selectYOD7 = new Select(driver.findElement(By.id(("yearOfDeliveryId7"))));
        selectYOD7.selectByVisibleText(props.getProperty("yearOfDeliveryId7"));
        Select selectLS7 = new Select(driver.findElement(By.id(("laborSuitabilityId7"))));
        selectLS7.selectByVisibleText(props.getProperty("laborSuitabilityId7"));

        Select selectYOE8 = new Select(driver.findElement(By.id(("yearOfExecutionId8"))));
        selectYOE8.selectByVisibleText(props.getProperty("yearOfExecutionId8"));
        Select selectYOD8 = new Select(driver.findElement(By.id(("yearOfDeliveryId8"))));
        selectYOD8.selectByVisibleText(props.getProperty("yearOfDeliveryId8"));
        Select selectLS8 = new Select(driver.findElement(By.id(("laborSuitabilityId8"))));
        selectLS8.selectByVisibleText(props.getProperty("laborSuitabilityId8"));

        Select selectYOE9 = new Select(driver.findElement(By.id(("yearOfExecutionId9"))));
        selectYOE9.selectByVisibleText(props.getProperty("yearOfExecutionId9"));
        Select selectYOD9 = new Select(driver.findElement(By.id(("yearOfDeliveryId9"))));
        selectYOD9.selectByVisibleText(props.getProperty("yearOfDeliveryId9"));
        Select selectLS9 = new Select(driver.findElement(By.id(("laborSuitabilityId9"))));
        selectLS9.selectByVisibleText(props.getProperty("laborSuitabilityId9"));

        Select selectYOE10 = new Select(driver.findElement(By.id(("yearOfExecutionId10"))));
        selectYOE10.selectByVisibleText(props.getProperty("yearOfExecutionId10"));
        Select selectYOD10 = new Select(driver.findElement(By.id(("yearOfDeliveryId10"))));
        selectYOD10.selectByVisibleText(props.getProperty("yearOfDeliveryId10"));
        Select selectLS10 = new Select(driver.findElement(By.id(("laborSuitabilityId10"))));
        selectLS10.selectByVisibleText(props.getProperty("laborSuitabilityId10"));

        Select selectYOE11 = new Select(driver.findElement(By.id(("yearOfExecutionId11"))));
        selectYOE11.selectByVisibleText(props.getProperty("yearOfExecutionId11"));
        Select selectYOD11 = new Select(driver.findElement(By.id(("yearOfDeliveryId11"))));
        selectYOD11.selectByVisibleText(props.getProperty("yearOfDeliveryId11"));
        Select selectLS11 = new Select(driver.findElement(By.id(("laborSuitabilityId11"))));
        selectLS11.selectByVisibleText(props.getProperty("laborSuitabilityId11"));

        Select selectYOE12 = new Select(driver.findElement(By.id(("yearOfExecutionId12"))));
        selectYOE12.selectByVisibleText(props.getProperty("yearOfExecutionId12"));
        Select selectYOD12 = new Select(driver.findElement(By.id(("yearOfDeliveryId12"))));
        selectYOD12.selectByVisibleText(props.getProperty("yearOfDeliveryId12"));
        Select selectLS12 = new Select(driver.findElement(By.id(("laborSuitabilityId12"))));
        selectLS12.selectByVisibleText(props.getProperty("laborSuitabilityId12"));

        Select selectYOE13 = new Select(driver.findElement(By.id(("yearOfExecutionId13"))));
        selectYOE13.selectByVisibleText(props.getProperty("yearOfExecutionId13"));
        Select selectYOD13 = new Select(driver.findElement(By.id(("yearOfDeliveryId13"))));
        selectYOD13.selectByVisibleText(props.getProperty("yearOfDeliveryId13"));
        Select selectLS13 = new Select(driver.findElement(By.id(("laborSuitabilityId13"))));
        selectLS13.selectByVisibleText(props.getProperty("laborSuitabilityId13"));

        Select selectYOE14 = new Select(driver.findElement(By.id(("yearOfExecutionId14"))));
        selectYOE14.selectByVisibleText(props.getProperty("yearOfExecutionId14"));
        Select selectYOD14 = new Select(driver.findElement(By.id(("yearOfDeliveryId14"))));
        selectYOD14.selectByVisibleText(props.getProperty("yearOfDeliveryId14"));
        Select selectLS14 = new Select(driver.findElement(By.id(("laborSuitabilityId14"))));
        selectLS14.selectByVisibleText(props.getProperty("laborSuitabilityId14"));

        Select selectYOE15 = new Select(driver.findElement(By.id(("yearOfExecutionId15"))));
        selectYOE15.selectByVisibleText(props.getProperty("yearOfExecutionId15"));
        Select selectYOD15 = new Select(driver.findElement(By.id(("yearOfDeliveryId15"))));
        selectYOD15.selectByVisibleText(props.getProperty("yearOfDeliveryId15"));
        Select selectLS15 = new Select(driver.findElement(By.id(("laborSuitabilityId15"))));
        selectLS15.selectByVisibleText(props.getProperty("laborSuitabilityId15"));

        Select selectYOE16 = new Select(driver.findElement(By.id(("yearOfExecutionId16"))));
        selectYOE16.selectByVisibleText(props.getProperty("yearOfExecutionId16"));
        Select selectYOD16 = new Select(driver.findElement(By.id(("yearOfDeliveryId16"))));
        selectYOD16.selectByVisibleText(props.getProperty("yearOfDeliveryId16"));
        Select selectLS16 = new Select(driver.findElement(By.id(("laborSuitabilityId16"))));
        selectLS16.selectByVisibleText(props.getProperty("laborSuitabilityId16"));

        //#####################################################################################

        Select selectELS0 = new Select(driver.findElement(By.id(("envLaborSuitabilityId0"))));
        selectELS0.selectByVisibleText(props.getProperty("envLaborSuitabilityId0"));

        Select selectELS1 = new Select(driver.findElement(By.id(("envLaborSuitabilityId1"))));
        selectELS1.selectByVisibleText(props.getProperty("envLaborSuitabilityId1"));

        Select selectELS2 = new Select(driver.findElement(By.id(("envLaborSuitabilityId2"))));
        selectELS2.selectByVisibleText(props.getProperty("envLaborSuitabilityId2"));

        Select selectELS3 = new Select(driver.findElement(By.id(("envLaborSuitabilityId3"))));
        selectELS3.selectByVisibleText(props.getProperty("envLaborSuitabilityId3"));

        Select selectELS4 = new Select(driver.findElement(By.id(("envLaborSuitabilityId4"))));
        selectELS4.selectByVisibleText(props.getProperty("envLaborSuitabilityId4"));


        Select selectELS5 = new Select(driver.findElement(By.id(("envLaborSuitabilityId5"))));
        selectELS5.selectByVisibleText(props.getProperty("envLaborSuitabilityId5"));


        Select selectELS6 = new Select(driver.findElement(By.id(("envLaborSuitabilityId6"))));
        selectELS6.selectByVisibleText(props.getProperty("envLaborSuitabilityId6"));


        Select selectELS7 = new Select(driver.findElement(By.id(("envLaborSuitabilityId7"))));
        selectELS7.selectByVisibleText(props.getProperty("envLaborSuitabilityId7"));


        Select selectELS8 = new Select(driver.findElement(By.id(("envLaborSuitabilityId8"))));
        selectELS8.selectByVisibleText(props.getProperty("envLaborSuitabilityId8"));


        Select selectELS9 = new Select(driver.findElement(By.id(("envLaborSuitabilityId9"))));
        selectELS9.selectByVisibleText(props.getProperty("envLaborSuitabilityId9"));


        Select selectELS10 = new Select(driver.findElement(By.id(("envLaborSuitabilityId10"))));
        selectELS10.selectByVisibleText(props.getProperty("envLaborSuitabilityId10"));


        Select selectELS11 = new Select(driver.findElement(By.id(("envLaborSuitabilityId11"))));
        selectELS11.selectByVisibleText(props.getProperty("envLaborSuitabilityId11"));


        Select selectELS12 = new Select(driver.findElement(By.id(("envLaborSuitabilityId12"))));
        selectELS12.selectByVisibleText(props.getProperty("envLaborSuitabilityId12"));


        Select selectELS13 = new Select(driver.findElement(By.id(("envLaborSuitabilityId13"))));
        selectELS13.selectByVisibleText(props.getProperty("envLaborSuitabilityId13"));


        Select selectELS14 = new Select(driver.findElement(By.id(("envLaborSuitabilityId14"))));
        selectELS14.selectByVisibleText(props.getProperty("envLaborSuitabilityId14"));


        Select selectELS15 = new Select(driver.findElement(By.id(("envLaborSuitabilityId15"))));
        selectELS15.selectByVisibleText(props.getProperty("envLaborSuitabilityId15"));


        Select selectELS16 = new Select(driver.findElement(By.id(("envLaborSuitabilityId16"))));
        selectELS16.selectByVisibleText(props.getProperty("envLaborSuitabilityId16"));*/

    }

    private void paso4() throws InterruptedException {


    }



    private void executeANMLogin() throws InterruptedException {


        /**********************************************************
         * Login
         **********************************************************/

        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys(props.getProperty("username"));

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(props.getProperty("password"));

        WebElement buttonLogin = driver.findElement(By.id("loginButton"));
        buttonLogin.click();


        /**********************************************************
         * Panel
         **********************************************************/
        Thread.sleep(2000);


        WebElement menu = driver.findElement(By.xpath("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]"));
        menu.click();

        Thread.sleep(10000);

        Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        selectCambiarUsuario.selectByVisibleText(props.getProperty("cambiarUsuario"));
    }




    private WebElement waitElement(String search, String type, String timer) throws InterruptedException {

        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        switch (type) {
            case "id":
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(search)));
            case "css":
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(search)));
            case "path":
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search)));
            case "link":
                //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(props.getProperty(search))));
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(search)));
        }
        return null;
    }
}
