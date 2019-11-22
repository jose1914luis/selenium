import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestSelenium {
    public static void main(String [] args) throws InterruptedException, IOException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        //AnmForm anmForm = new AnmForm();


        FileInputStream in = new FileInputStream("anm.properties");
        Properties props = new Properties();
        props.load(in);
        in.close();

        AnmForm anmForm = new AnmForm();
        anmForm.username.setText(props.getProperty("username"));
        anmForm.password.setText(props.getProperty("password"));
        JFrame jFrame = new JFrame("ANM");
        jFrame.setContentPane(anmForm.rootPanel);
        //jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");


        jFrame.setVisible(true);
        //executeANMLogin();

/*
        FileOutputStream out = new FileOutputStream("anm.properties");
        props.setProperty("country", "peru2");
        props.store(out, null);
        out.close();*/
    }


    private static void executeANMLogin() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jose\\Downloads\\chromedriver_win32\\chromedriver.exe");


        ChromeDriver driver = new ChromeDriver();

        driver.get("http://ambprubsigm.anm.gov.co/sigm/externalLogin?lang=es");

        //WebElement user=driver.findElement(By.xpath("//input[@id='username']"));

        /**********************************************************
         * Login
         **********************************************************/
        WebElement user=driver.findElementById("username");
        user.sendKeys("70321");

        WebElement password = driver.findElementById("password");
        password.sendKeys("Juancho1-2345");

        //element.sendKeys("abc@gmail.com");
        WebElement buttonLogin=driver.findElementById("loginButton");
        buttonLogin.click();

        /**********************************************************
         * Panel
         **********************************************************/
        Thread.sleep(5000);

        WebElement menu = driver.findElement(By.xpath("//li[4]/a[2]/span"));
        menu.click();

        WebElement submenu = driver.findElement(By.linkText("Radicar solicitud de propuesta de contrato de concesión"));
        submenu.click();

        Thread.sleep(2000);

        /**********************************************************
         * Seleccionar usuario
         **********************************************************/

        Select selectPIN = new Select(driver.findElementById("pinSlctId"));
        selectPIN.selectByVisibleText("2710151, 19/NOV/2020");

        WebElement buttonNext1 =driver.findElementByCssSelector(".btn > .ng-binding");
        buttonNext1.click();

        Thread.sleep(4000);
        /**********************************************************
         * Ingresar detalles del área
         **********************************************************/
        WebElement btnMineral = driver.findElementByCssSelector(".btn-default");
        btnMineral.click();

        Thread.sleep(1000);
        WebElement labelMineral = driver.findElement(By.linkText("CARBÓN"));
        labelMineral.click();

        Select selectArea = new Select(driver.findElementById("areaOfConcessionSlctId"));
        selectArea.selectByVisibleText("Otro tipo de terreno");

        Thread.sleep(2000);

        WebElement tabMap = driver.findElementByCssSelector(".uib-tab:nth-child(2) > .nav-link > .ng-binding");
        tabMap.click();

        Select selectTypeCoord = new Select(driver.findElementById("selectedCellInputMethodSlctId"));
        selectTypeCoord.selectByVisibleText("Cargando archivo 'Shapefile' o 'KML'");

        WebElement btnMap = driver.findElementById("uploadShapeFileMapButtonId");
        btnMap.click();

        Thread.sleep(30000);

        driver.switchTo().frame("mapIframeId");
        Select selectTypeMap = new Select(driver.findElementByXPath("//select[@data-gcx-form-item='ListBox1']"));
        selectTypeMap.selectByVisibleText("Shapefile");

        WebElement btnContinue = driver.findElementByCssSelector("form:nth-child(2) .button");
        btnContinue.click();

        //driver.switchTo().frame("mapIframeId");
        Thread.sleep(2000);
        WebElement pikerLoad = driver.findElementByXPath("//input[@data-gcx-form-item='FilePicker1']");
        pikerLoad.sendKeys("C:\\Users\\jose\\Downloads\\RI9-15531 Pros.zip");

        WebElement btnLoad = driver.findElementByCssSelector("form:nth-child(2) .button");
        btnLoad.click();

        Thread.sleep(10000);

        driver.switchTo().defaultContent();
        WebElement btnConfirm = driver.findElementById("confirmBtnId");
        btnConfirm.click();

        Thread.sleep(1000);
        WebElement buttonNext2 =driver.findElementByXPath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]");
        buttonNext2.click();

        Thread.sleep(3000);

        /**********************************************************
         * Información técnica
         **********************************************************/

        WebElement tabInfoTec = driver.findElementByXPath(" //div[@id='main']//li[3]//a[1]");
        tabInfoTec.click();

        Thread.sleep(1000);
        Select selectYOE0 = new Select(driver.findElementById("yearOfExecutionId0"));
        selectYOE0.selectByVisibleText("1");
        Select selectYOD0 = new Select(driver.findElementById("yearOfDeliveryId0"));
        selectYOD0.selectByVisibleText("1");
        Select selectLS0 = new Select(driver.findElementById("laborSuitabilityId0"));
        selectLS0.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE1 = new Select(driver.findElementById("yearOfExecutionId1"));
        selectYOE1.selectByVisibleText("1");
        Select selectYOD1 = new Select(driver.findElementById("yearOfDeliveryId1"));
        selectYOD1.selectByVisibleText("1");
        Select selectLS1 = new Select(driver.findElementById("laborSuitabilityId1"));
        selectLS1.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE2 = new Select(driver.findElementById("yearOfExecutionId2"));
        selectYOE2.selectByVisibleText("1");
        Select selectYOD2 = new Select(driver.findElementById("yearOfDeliveryId2"));
        selectYOD2.selectByVisibleText("1");
        Select selectLS2 = new Select(driver.findElementById("laborSuitabilityId2"));
        selectLS2.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE3 = new Select(driver.findElementById("yearOfExecutionId3"));
        selectYOE3.selectByVisibleText("1");
        Select selectYOD3 = new Select(driver.findElementById("yearOfDeliveryId3"));
        selectYOD3.selectByVisibleText("1");
        Select selectLS3 = new Select(driver.findElementById("laborSuitabilityId3"));
        selectLS3.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE4 = new Select(driver.findElementById("yearOfExecutionId4"));
        selectYOE4.selectByVisibleText("1");
        Select selectYOD4 = new Select(driver.findElementById("yearOfDeliveryId4"));
        selectYOD4.selectByVisibleText("1");
        Select selectLS4 = new Select(driver.findElementById("laborSuitabilityId4"));
        selectLS4.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE5 = new Select(driver.findElementById("yearOfExecutionId5"));
        selectYOE5.selectByVisibleText("1");
        Select selectYOD5 = new Select(driver.findElementById("yearOfDeliveryId5"));
        selectYOD5.selectByVisibleText("1");
        Select selectLS5 = new Select(driver.findElementById("laborSuitabilityId5"));
        selectLS5.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE6 = new Select(driver.findElementById("yearOfExecutionId6"));
        selectYOE6.selectByVisibleText("1");
        Select selectYOD6 = new Select(driver.findElementById("yearOfDeliveryId6"));
        selectYOD6.selectByVisibleText("1");
        Select selectLS6 = new Select(driver.findElementById("laborSuitabilityId6"));
        selectLS6.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE7 = new Select(driver.findElementById("yearOfExecutionId7"));
        selectYOE7.selectByVisibleText("1");
        Select selectYOD7 = new Select(driver.findElementById("yearOfDeliveryId7"));
        selectYOD7.selectByVisibleText("1");
        Select selectLS7 = new Select(driver.findElementById("laborSuitabilityId7"));
        selectLS7.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE8 = new Select(driver.findElementById("yearOfExecutionId8"));
        selectYOE8.selectByVisibleText("1");
        Select selectYOD8 = new Select(driver.findElementById("yearOfDeliveryId8"));
        selectYOD8.selectByVisibleText("1");
        Select selectLS8 = new Select(driver.findElementById("laborSuitabilityId8"));
        selectLS8.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE9 = new Select(driver.findElementById("yearOfExecutionId9"));
        selectYOE9.selectByVisibleText("1");
        Select selectYOD9 = new Select(driver.findElementById("yearOfDeliveryId9"));
        selectYOD9.selectByVisibleText("1");
        Select selectLS9 = new Select(driver.findElementById("laborSuitabilityId9"));
        selectLS9.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE10 = new Select(driver.findElementById("yearOfExecutionId10"));
        selectYOE10.selectByVisibleText("1");
        Select selectYOD10 = new Select(driver.findElementById("yearOfDeliveryId10"));
        selectYOD10.selectByVisibleText("1");
        Select selectLS10 = new Select(driver.findElementById("laborSuitabilityId10"));
        selectLS10.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE11 = new Select(driver.findElementById("yearOfExecutionId11"));
        selectYOE11.selectByVisibleText("1");
        Select selectYOD11 = new Select(driver.findElementById("yearOfDeliveryId11"));
        selectYOD11.selectByVisibleText("1");
        Select selectLS11 = new Select(driver.findElementById("laborSuitabilityId11"));
        selectLS11.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE12 = new Select(driver.findElementById("yearOfExecutionId12"));
        selectYOE12.selectByVisibleText("1");
        Select selectYOD12 = new Select(driver.findElementById("yearOfDeliveryId12"));
        selectYOD12.selectByVisibleText("1");
        Select selectLS12 = new Select(driver.findElementById("laborSuitabilityId12"));
        selectLS12.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE13 = new Select(driver.findElementById("yearOfExecutionId13"));
        selectYOE13.selectByVisibleText("1");
        Select selectYOD13 = new Select(driver.findElementById("yearOfDeliveryId13"));
        selectYOD13.selectByVisibleText("1");
        Select selectLS13 = new Select(driver.findElementById("laborSuitabilityId13"));
        selectLS13.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE14 = new Select(driver.findElementById("yearOfExecutionId14"));
        selectYOE14.selectByVisibleText("1");
        Select selectYOD14 = new Select(driver.findElementById("yearOfDeliveryId14"));
        selectYOD14.selectByVisibleText("1");
        Select selectLS14 = new Select(driver.findElementById("laborSuitabilityId14"));
        selectLS14.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE15 = new Select(driver.findElementById("yearOfExecutionId15"));
        selectYOE15.selectByVisibleText("1");
        Select selectYOD15 = new Select(driver.findElementById("yearOfDeliveryId15"));
        selectYOD15.selectByVisibleText("1");
        Select selectLS15 = new Select(driver.findElementById("laborSuitabilityId15"));
        selectLS15.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        Select selectYOE16 = new Select(driver.findElementById("yearOfExecutionId16"));
        selectYOE16.selectByVisibleText("1");
        Select selectYOD16 = new Select(driver.findElementById("yearOfDeliveryId16"));
        selectYOD16.selectByVisibleText("1");
        Select selectLS16 = new Select(driver.findElementById("laborSuitabilityId16"));
        selectLS16.selectByVisibleText("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");

        //#####################################################################################

        Select selectEYOE0 = new Select(driver.findElementById("envYearOfExecutionId0"));
        selectEYOE0.selectByVisibleText("1");
        Select selectEYOD0 = new Select(driver.findElementById("envYearOfDeliveryId0"));
        selectEYOD0.selectByVisibleText("1");
        Select selectELS0 = new Select(driver.findElementById("envLaborSuitabilityId0"));
        selectELS0.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE1 = new Select(driver.findElementById("envYearOfExecutionId1"));
        selectEYOE1.selectByVisibleText("1");
        Select selectEYOD1 = new Select(driver.findElementById("envYearOfDeliveryId1"));
        selectEYOD1.selectByVisibleText("1");
        Select selectELS1 = new Select(driver.findElementById("envLaborSuitabilityId1"));
        selectELS1.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE2 = new Select(driver.findElementById("envYearOfExecutionId2"));
        selectEYOE2.selectByVisibleText("1");
        Select selectEYOD2 = new Select(driver.findElementById("envYearOfDeliveryId2"));
        selectEYOD2.selectByVisibleText("1");
        Select selectELS2 = new Select(driver.findElementById("envLaborSuitabilityId2"));
        selectELS2.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE3 = new Select(driver.findElementById("envYearOfExecutionId3"));
        selectEYOE3.selectByVisibleText("1");
        Select selectEYOD3 = new Select(driver.findElementById("envYearOfDeliveryId3"));
        selectEYOD3.selectByVisibleText("1");
        Select selectELS3 = new Select(driver.findElementById("envLaborSuitabilityId3"));
        selectELS3.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE4 = new Select(driver.findElementById("envYearOfExecutionId4"));
        selectEYOE4.selectByVisibleText("1");
        Select selectEYOD4 = new Select(driver.findElementById("envYearOfDeliveryId4"));
        selectEYOD4.selectByVisibleText("1");
        Select selectELS4 = new Select(driver.findElementById("envLaborSuitabilityId4"));
        selectELS4.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE5 = new Select(driver.findElementById("envYearOfExecutionId5"));
        selectEYOE5.selectByVisibleText("1");
        Select selectEYOD5 = new Select(driver.findElementById("envYearOfDeliveryId5"));
        selectEYOD5.selectByVisibleText("1");
        Select selectELS5 = new Select(driver.findElementById("envLaborSuitabilityId5"));
        selectELS5.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE6 = new Select(driver.findElementById("envYearOfExecutionId6"));
        selectEYOE6.selectByVisibleText("1");
        Select selectEYOD6 = new Select(driver.findElementById("envYearOfDeliveryId6"));
        selectEYOD6.selectByVisibleText("1");
        Select selectELS6 = new Select(driver.findElementById("envLaborSuitabilityId6"));
        selectELS6.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE7 = new Select(driver.findElementById("envYearOfExecutionId7"));
        selectEYOE7.selectByVisibleText("1");
        Select selectEYOD7 = new Select(driver.findElementById("envYearOfDeliveryId7"));
        selectEYOD7.selectByVisibleText("1");
        Select selectELS7 = new Select(driver.findElementById("envLaborSuitabilityId7"));
        selectELS7.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE8 = new Select(driver.findElementById("envYearOfExecutionId8"));
        selectEYOE8.selectByVisibleText("1");
        Select selectEYOD8 = new Select(driver.findElementById("envYearOfDeliveryId8"));
        selectEYOD8.selectByVisibleText("1");
        Select selectELS8 = new Select(driver.findElementById("envLaborSuitabilityId8"));
        selectELS8.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE9 = new Select(driver.findElementById("envYearOfExecutionId9"));
        selectEYOE9.selectByVisibleText("1");
        Select selectEYOD9 = new Select(driver.findElementById("envYearOfDeliveryId9"));
        selectEYOD9.selectByVisibleText("1");
        Select selectELS9 = new Select(driver.findElementById("envLaborSuitabilityId9"));
        selectELS9.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE10 = new Select(driver.findElementById("envYearOfExecutionId10"));
        selectEYOE10.selectByVisibleText("1");
        Select selectEYOD10 = new Select(driver.findElementById("envYearOfDeliveryId10"));
        selectEYOD10.selectByVisibleText("1");
        Select selectELS10 = new Select(driver.findElementById("envLaborSuitabilityId10"));
        selectELS10.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE11 = new Select(driver.findElementById("envYearOfExecutionId11"));
        selectEYOE11.selectByVisibleText("1");
        Select selectEYOD11 = new Select(driver.findElementById("envYearOfDeliveryId11"));
        selectEYOD11.selectByVisibleText("1");
        Select selectELS11 = new Select(driver.findElementById("envLaborSuitabilityId11"));
        selectELS11.selectByVisibleText("Ingeniero forestal, Ecologo o Biologo");

        Select selectEYOE12 = new Select(driver.findElementById("envYearOfExecutionId12"));
        selectEYOE12.selectByVisibleText("1");
        Select selectEYOD12 = new Select(driver.findElementById("envYearOfDeliveryId12"));
        selectEYOD12.selectByVisibleText("1");
        Select selectELS12 = new Select(driver.findElementById("envLaborSuitabilityId12"));
        selectELS12.selectByVisibleText("Trabajador social o Comunicador o Antropologo");

        Select selectEYOE13 = new Select(driver.findElementById("envYearOfExecutionId13"));
        selectEYOE13.selectByVisibleText("1");
        Select selectEYOD13 = new Select(driver.findElementById("envYearOfDeliveryId13"));
        selectEYOD13.selectByVisibleText("1");
        Select selectELS13 = new Select(driver.findElementById("envLaborSuitabilityId13"));
        selectELS13.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE14 = new Select(driver.findElementById("envYearOfExecutionId14"));
        selectEYOE14.selectByVisibleText("1");
        Select selectEYOD14 = new Select(driver.findElementById("envYearOfDeliveryId14"));
        selectEYOD14.selectByVisibleText("1");
        Select selectELS14 = new Select(driver.findElementById("envLaborSuitabilityId14"));
        selectELS14.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectEYOE15 = new Select(driver.findElementById("envYearOfExecutionId15"));
        selectEYOE15.selectByVisibleText("1");
        Select selectEYOD15 = new Select(driver.findElementById("envYearOfDeliveryId15"));
        selectEYOD15.selectByVisibleText("1");
        Select selectELS15 = new Select(driver.findElementById("envLaborSuitabilityId15"));
        selectELS15.selectByVisibleText("Arquelogo");

        Select selectEYOE16 = new Select(driver.findElementById("envYearOfExecutionId16"));
        selectEYOE16.selectByVisibleText("1");
        Select selectEYOD16 = new Select(driver.findElementById("envYearOfDeliveryId16"));
        selectEYOD16.selectByVisibleText("1");
        Select selectELS16 = new Select(driver.findElementById("envLaborSuitabilityId16"));
        selectELS16.selectByVisibleText("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");

        Select selectTPD = new Select(driver.findElementById("techProfessionalDesignationId"));
        selectTPD.selectByVisibleText("Geólogo");

        Thread.sleep(2000);

        Select selectTAN = new Select(driver.findElementById("techApplicantNameId"));
        selectTAN.selectByVisibleText("Pepito  Pérez  (70314)");

        WebElement buttonAdd =driver.findElementByXPath("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']");
        buttonAdd.click();

        WebElement checkboxAccept =driver.findElementById("technicalCheckboxId");
        checkboxAccept.click();

        /**********************************************************
         * Información del area
         **********************************************************/

        WebElement tabArea = driver.findElementByXPath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]");
        tabArea.click();

        Thread.sleep(2000);

        WebElement additionalEthnicGroupsInSelectedAreaIndId =driver.findElementById("additionalEthnicGroupsInSelectedAreaIndId");
        additionalEthnicGroupsInSelectedAreaIndId.click();

        /**********************************************************
         * Información economica
         **********************************************************/

        WebElement tabEco = driver.findElementByXPath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]");
        tabEco.click();

        Thread.sleep(2000);

        Select selectPC = new Select(driver.findElementById("personClassificationId0"));
        selectPC.selectByVisibleText("Persona jurídica");

        WebElement currentAssetId0=driver.findElementById("currentAssetId0");
        currentAssetId0.sendKeys("1000000");

        WebElement currentLiabilitiesId0=driver.findElementById("currentLiabilitiesId0");
        currentLiabilitiesId0.sendKeys("1000000");

        WebElement totalAssetId0=driver.findElementById("totalAssetId0");
        totalAssetId0.sendKeys("1000000");

        WebElement totalLiabilitiesId0=driver.findElementById("totalLiabilitiesId0");
        totalLiabilitiesId0.sendKeys("1000000");

        Select selectEPD = new Select(driver.findElementById("ecoProfessionalDesignationId"));
        selectEPD.selectByVisibleText("Contador");

        Thread.sleep(2000);

        Select selectEAN = new Select(driver.findElementById("ecoApplicantNameId"));
        selectEAN.selectByVisibleText("Pepito  Pérez  (70314)");

        WebElement buttonAdd2 =driver.findElementByXPath(" //div[@class='tab-pane ng-scope active']//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]");
        buttonAdd2.click();

        WebElement buttonNext3 =driver.findElementByXPath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]");
        buttonNext3.click();

        /**********************************************************
         * Resumen
         **********************************************************/

        //WebElement buttonRadicar =driver.findElementByXPath("//span[contains(text(),'Radicar')]");
        //buttonRadicar.click();
    }
}
