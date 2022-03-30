import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class RunSelenium extends JFrame{

    private static Properties props= new Properties();

    private static ChromeDriver driver;

    private  AnmForm anmForm;

    public RunSelenium() throws IOException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        FileInputStream in = new FileInputStream("anm.properties");
        props.load(in);
        in.close();

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        anmForm = new AnmForm( props);
        ImageIcon img = new ImageIcon("Resources/Button-Play-icon.png");
        setIconImage(img.getImage());
        setPreferredSize(new Dimension(900, 650));
        JScrollPane scrollPane = new JScrollPane(anmForm.rootPanel);
        setTitle("Radicador v. 2.0");
        add(scrollPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);



        System.setProperty("webdriver.chrome.driver",props.getProperty("webdriver"));
        driver = new ChromeDriver();

        driver.get(props.getProperty("url"));




        anmForm.loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    executeANMLogin();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });


        anmForm.ejecutarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    paso1();
                    paso2();
                    paso3();
                    paso4();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        anmForm.paso1Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    paso1();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        anmForm.paso2Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    paso2();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        anmForm.paso3Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    paso3();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        anmForm.paso4Button.addActionListener(new ActionListener() {

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


    private static void executeANMLogin() throws InterruptedException{


        /**********************************************************
         * Login
         **********************************************************/
        
        //WebElement user=driver.findElement(By.id(("username");
        WebElement user=driver.findElement(By.id("username"));
        user.sendKeys( props.getProperty("username"));

        //WebElement password = driver.findElement(By.id(("password");
        WebElement password =driver.findElement(By.id("password"));
        password.sendKeys(props.getProperty("password"));

        //element.sendKeys("abc@gmail.com");
        //WebElement buttonLogin=driver.findElement(By.id(("loginButton");
        WebElement buttonLogin=driver.findElement(By.id("loginButton"));
        buttonLogin.click();


        /**********************************************************
         * Panel
         **********************************************************/
        Thread.sleep(Integer.parseInt(props.getProperty("timer1"))*1000);

        //WebElement menu = driver.findElement(By.xpath("//li[4]/a[2]/span"));

        WebElement menu = driver.findElement(By.xpath("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]"));
        menu.click();

        Thread.sleep(10000);

        //Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        //Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm dashboard-display-inline ng-pristine ng-valid ng-not-empty ng-touched']")));
        selectCambiarUsuario.selectByVisibleText(props.getProperty("cambiarUsuario"));
    }


    private static WebElement waitElement(String search, String type, String timer) throws InterruptedException {

        Thread.sleep(Integer.parseInt(props.getProperty(timer))*1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        switch (type){
            case "id":
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(search)));
            case "css":
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(search)));
            case "path":
                return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search)));
            case "link":
                return  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(props.getProperty(search))));
        }
        return null;
    }

    private static void paso1() throws InterruptedException{
        //WebElement submenu = driver.findElement(By.xpath("//li[4]//ul[1]//li[1]"));
        WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'Radicar solicitud de propuesta')]"));
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

    private static void paso2() throws InterruptedException {

        //Thread.sleep(Integer.parseInt(props.getProperty("timer3"))*1000);
        /**********************************************************
         * Ingresar detalles del área
         **********************************************************/

        WebElement btnMineral =  waitElement(".btn-default", "css", "timer3");
        btnMineral.click();

        //Thread.sleep(Integer.parseInt(props.getProperty("timer4"))*1000);

        WebElement labelMineral = waitElement("mineral", "link", "timer4");
        labelMineral.click();

        Select selectArea = new Select(driver.findElement(By.id(("areaOfConcessionSlctId"))));
        selectArea.selectByVisibleText(props.getProperty("areaOfConcessionSlctId"));

        //Thread.sleep(Integer.parseInt(props.getProperty("timer5"))*1000);


        WebElement tabMap = waitElement("//li[@class='uib-tab nav-item ng-scope ng-isolate-scope']", "path", "timer5");
        tabMap.click();

        Select selectTypeCoord = new Select(driver.findElement(By.id(("selectedCellInputMethodSlctId"))));
        selectTypeCoord.selectByVisibleText(props.getProperty("selectedCellInputMethodSlctId"));
        if(props.getProperty("selectedCellInputMethodSlctId").equals("Usando el mapa de selección para dibujar un polígono o ingresar celdas")){


            WebElement currentAssetId0=driver.findElement(By.id(("cellIdsTxtId")));
            currentAssetId0.sendKeys(props.getProperty("cells"));

        }else{
            //old way

            WebElement btnMap = driver.findElement(By.id(("uploadShapeFileMapButtonId")));
            btnMap.click();

            Thread.sleep(Integer.parseInt(props.getProperty("timer6"))*1000);

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

            Thread.sleep(Integer.parseInt(props.getProperty("timer8"))*1000);

            driver.switchTo().defaultContent();
            WebElement btnConfirm = driver.findElement(By.id(("confirmBtnId")));
            btnConfirm.click();
        }




        //Thread.sleep(Integer.parseInt(props.getProperty("timer9"))*1000);

        WebElement buttonNext2 = waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", "path", "timer9");
        buttonNext2.click();

        //Thread.sleep(Integer.parseInt(props.getProperty("timer10"))*1000);



        /*WebElement tabInfoDet = waitElement("//ul[@class='nav nav-tabs']//li[2]", "path", "timer10");
        tabInfoDet.click();

        WebElement checkGrupos = waitElement("additionalEthnicGroupsInSelectedAreaIndId", "id", "timer10");
        checkGrupos.click();*/



        /**********************************************************
         * Información técnica
         **********************************************************/


        WebElement tabInfoTec = waitElement("//div[@id='main']//li[3]//a[1]", "path", "timer10");
        tabInfoTec.click();
    }

    private static void paso3() throws InterruptedException {

        //Thread.sleep(Integer.parseInt(props.getProperty("timer11"))*1000);
        Select selectYOE0 = new Select(waitElement("yearOfExecutionId0", "id", "timer11"));
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

        /*Select selectEYOE0 = new Select(driver.findElement(By.id(("envYearOfExecutionId0"));
        selectEYOE0.selectByVisibleText(props.getProperty("envYearOfExecutionId0"));
        Select selectEYOD0 = new Select(driver.findElement(By.id(("envYearOfDeliveryId0"));
        selectEYOD0.selectByVisibleText(props.getProperty("envYearOfDeliveryId0"));*/
        Select selectELS0 = new Select(driver.findElement(By.id(("envLaborSuitabilityId0"))));
        selectELS0.selectByVisibleText(props.getProperty("envLaborSuitabilityId0"));

        /*Select selectEYOE1 = new Select(driver.findElement(By.id(("envYearOfExecutionId1"));
        selectEYOE1.selectByVisibleText(props.getProperty("envYearOfExecutionId1"));
        Select selectEYOD1 = new Select(driver.findElement(By.id(("envYearOfDeliveryId1"));
        selectEYOD1.selectByVisibleText(props.getProperty("envYearOfDeliveryId1"));*/
        Select selectELS1 = new Select(driver.findElement(By.id(("envLaborSuitabilityId1"))));
        selectELS1.selectByVisibleText(props.getProperty("envLaborSuitabilityId1"));

        /*Select selectEYOE2 = new Select(driver.findElement(By.id(("envYearOfExecutionId2"));
        selectEYOE2.selectByVisibleText(props.getProperty("envYearOfExecutionId2"));
        Select selectEYOD2 = new Select(driver.findElement(By.id(("envYearOfDeliveryId2"));
        selectEYOD2.selectByVisibleText(props.getProperty("envYearOfDeliveryId2"));*/
        Select selectELS2 = new Select(driver.findElement(By.id(("envLaborSuitabilityId2"))));
        selectELS2.selectByVisibleText(props.getProperty("envLaborSuitabilityId2"));

        /*Select selectEYOE3 = new Select(driver.findElement(By.id(("envYearOfExecutionId3"));
        selectEYOE3.selectByVisibleText(props.getProperty("envYearOfExecutionId3"));
        Select selectEYOD3 = new Select(driver.findElement(By.id(("envYearOfDeliveryId3"));
        selectEYOD3.selectByVisibleText(props.getProperty("envYearOfDeliveryId3"));*/
        Select selectELS3 = new Select(driver.findElement(By.id(("envLaborSuitabilityId3"))));
        selectELS3.selectByVisibleText(props.getProperty("envLaborSuitabilityId3"));

        /*Select selectEYOE4 = new Select(driver.findElement(By.id(("envYearOfExecutionId4"));
        selectEYOE4.selectByVisibleText(props.getProperty("envYearOfExecutionId4"));
        Select selectEYOD4 = new Select(driver.findElement(By.id(("envYearOfDeliveryId4"));
        selectEYOD4.selectByVisibleText(props.getProperty("envYearOfDeliveryId4"));*/
        Select selectELS4 = new Select(driver.findElement(By.id(("envLaborSuitabilityId4"))));
        selectELS4.selectByVisibleText(props.getProperty("envLaborSuitabilityId4"));

        /*Select selectEYOE5 = new Select(driver.findElement(By.id(("envYearOfExecutionId5"));
        selectEYOE5.selectByVisibleText(props.getProperty("envYearOfExecutionId5"));
        Select selectEYOD5 = new Select(driver.findElement(By.id(("envYearOfDeliveryId5"));
        selectEYOD5.selectByVisibleText(props.getProperty("envYearOfDeliveryId5"));*/
        Select selectELS5 = new Select(driver.findElement(By.id(("envLaborSuitabilityId5"))));
        selectELS5.selectByVisibleText(props.getProperty("envLaborSuitabilityId5"));

        /*Select selectEYOE6 = new Select(driver.findElement(By.id(("envYearOfExecutionId6"));
        selectEYOE6.selectByVisibleText(props.getProperty("envYearOfExecutionId6"));
        Select selectEYOD6 = new Select(driver.findElement(By.id(("envYearOfDeliveryId6"));
        selectEYOD6.selectByVisibleText(props.getProperty("envYearOfDeliveryId6"));*/
        Select selectELS6 = new Select(driver.findElement(By.id(("envLaborSuitabilityId6"))));
        selectELS6.selectByVisibleText(props.getProperty("envLaborSuitabilityId6"));

        /*Select selectEYOE7 = new Select(driver.findElement(By.id(("envYearOfExecutionId7"));
        selectEYOE7.selectByVisibleText(props.getProperty("envYearOfExecutionId7"));
        Select selectEYOD7 = new Select(driver.findElement(By.id(("envYearOfDeliveryId7"));
        selectEYOD7.selectByVisibleText(props.getProperty("envYearOfDeliveryId7"));*/
        Select selectELS7 = new Select(driver.findElement(By.id(("envLaborSuitabilityId7"))));
        selectELS7.selectByVisibleText(props.getProperty("envLaborSuitabilityId7"));

        /*Select selectEYOE8 = new Select(driver.findElement(By.id(("envYearOfExecutionId8"));
        selectEYOE8.selectByVisibleText(props.getProperty("envYearOfExecutionId8"));
        Select selectEYOD8 = new Select(driver.findElement(By.id(("envYearOfDeliveryId8"));
        selectEYOD8.selectByVisibleText(props.getProperty("envYearOfDeliveryId8"));*/
        Select selectELS8 = new Select(driver.findElement(By.id(("envLaborSuitabilityId8"))));
        selectELS8.selectByVisibleText(props.getProperty("envLaborSuitabilityId8"));

        /*Select selectEYOE9 = new Select(driver.findElement(By.id(("envYearOfExecutionId9"));
        selectEYOE9.selectByVisibleText(props.getProperty("envYearOfExecutionId9"));
        Select selectEYOD9 = new Select(driver.findElement(By.id(("envYearOfDeliveryId9"));
        selectEYOD9.selectByVisibleText(props.getProperty("envYearOfDeliveryId9"));*/
        Select selectELS9 = new Select(driver.findElement(By.id(("envLaborSuitabilityId9"))));
        selectELS9.selectByVisibleText(props.getProperty("envLaborSuitabilityId9"));

        /*Select selectEYOE10 = new Select(driver.findElement(By.id(("envYearOfExecutionId10"));
        selectEYOE10.selectByVisibleText(props.getProperty("envYearOfExecutionId10"));
        Select selectEYOD10 = new Select(driver.findElement(By.id(("envYearOfDeliveryId10"));
        selectEYOD10.selectByVisibleText(props.getProperty("envYearOfDeliveryId10"));*/
        Select selectELS10 = new Select(driver.findElement(By.id(("envLaborSuitabilityId10"))));
        selectELS10.selectByVisibleText(props.getProperty("envLaborSuitabilityId10"));

        /*Select selectEYOE11 = new Select(driver.findElement(By.id(("envYearOfExecutionId11"));
        selectEYOE11.selectByVisibleText(props.getProperty("envYearOfExecutionId11"));
        Select selectEYOD11 = new Select(driver.findElement(By.id(("envYearOfDeliveryId11"));
        selectEYOD11.selectByVisibleText(props.getProperty("envYearOfDeliveryId11"));*/
        Select selectELS11 = new Select(driver.findElement(By.id(("envLaborSuitabilityId11"))));
        selectELS11.selectByVisibleText(props.getProperty("envLaborSuitabilityId11"));

        /*Select selectEYOE12 = new Select(driver.findElement(By.id(("envYearOfExecutionId12"));
        selectEYOE12.selectByVisibleText(props.getProperty("envYearOfExecutionId12"));
        Select selectEYOD12 = new Select(driver.findElement(By.id(("envYearOfDeliveryId12"));
        selectEYOD12.selectByVisibleText(props.getProperty("envYearOfDeliveryId12"));*/
        Select selectELS12 = new Select(driver.findElement(By.id(("envLaborSuitabilityId12"))));
        selectELS12.selectByVisibleText(props.getProperty("envLaborSuitabilityId12"));

        /*Select selectEYOE13 = new Select(driver.findElement(By.id(("envYearOfExecutionId13"));
        selectEYOE13.selectByVisibleText(props.getProperty("envYearOfExecutionId13"));
        Select selectEYOD13 = new Select(driver.findElement(By.id(("envYearOfDeliveryId13"));
        selectEYOD13.selectByVisibleText(props.getProperty("envYearOfDeliveryId13"));*/
        Select selectELS13 = new Select(driver.findElement(By.id(("envLaborSuitabilityId13"))));
        selectELS13.selectByVisibleText(props.getProperty("envLaborSuitabilityId13"));

        /*Select selectEYOE14 = new Select(driver.findElement(By.id(("envYearOfExecutionId14"));
        selectEYOE14.selectByVisibleText(props.getProperty("envYearOfExecutionId14"));
        Select selectEYOD14 = new Select(driver.findElement(By.id(("envYearOfDeliveryId14"));
        selectEYOD14.selectByVisibleText(props.getProperty("envYearOfDeliveryId14"));*/
        Select selectELS14 = new Select(driver.findElement(By.id(("envLaborSuitabilityId14"))));
        selectELS14.selectByVisibleText(props.getProperty("envLaborSuitabilityId14"));

        /*Select selectEYOE15 = new Select(driver.findElement(By.id(("envYearOfExecutionId15"));
        selectEYOE15.selectByVisibleText(props.getProperty("envYearOfExecutionId15"));
        Select selectEYOD15 = new Select(driver.findElement(By.id(("envYearOfDeliveryId15"));
        selectEYOD15.selectByVisibleText(props.getProperty("envYearOfDeliveryId15"));*/
        Select selectELS15 = new Select(driver.findElement(By.id(("envLaborSuitabilityId15"))));
        selectELS15.selectByVisibleText(props.getProperty("envLaborSuitabilityId15"));

        /*Select selectEYOE16 = new Select(driver.findElement(By.id(("envYearOfExecutionId16"));
        selectEYOE16.selectByVisibleText(props.getProperty("envYearOfExecutionId16"));
        Select selectEYOD16 = new Select(driver.findElement(By.id(("envYearOfDeliveryId16"));
        selectEYOD16.selectByVisibleText(props.getProperty("envYearOfDeliveryId16"));*/
        Select selectELS16 = new Select(driver.findElement(By.id(("envLaborSuitabilityId16"))));
        selectELS16.selectByVisibleText(props.getProperty("envLaborSuitabilityId16"));

        Select selectTPD = new Select(driver.findElement(By.id(("techProfessionalDesignationId"))));
        selectTPD.selectByVisibleText(props.getProperty("techProfessionalDesignationId"));

        //Thread.sleep(Integer.parseInt(props.getProperty(""))*1000);

        WebElement checkboxAccept =driver.findElement(By.id(("technicalCheckboxId")));
        checkboxAccept.click();

        Select selectTAN = new Select(waitElement("techApplicantNameId", "id", "timer12"));
        selectTAN.selectByValue(props.getProperty("techApplicantNameId"));
        //selectTAN.selectByVisibleText(props.getProperty("techApplicantNameId"));

        WebElement buttonAdd =driver.findElement(By.xpath("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']"));
        buttonAdd.click();



        /**********************************************************
         * Información del area
         **********************************************************/

        WebElement tabArea = driver.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]"));
        tabArea.click();

        //Thread.sleep(Integer.parseInt(props.getProperty("timer13"))*1000);

        if(props.getProperty("additionalEthnicGroupsInSelectedAreaIndId") == "SI"){

            WebElement additionalEthnicGroupsInSelectedAreaIndId =waitElement("//div[@class='tab-pane ng-scope active']//input[1]", "path", "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        }else{
            WebElement additionalEthnicGroupsInSelectedAreaIndId =waitElement("//input[2]", "path", "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        }

        WebElement tabEco = driver.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]"));
        tabEco.click();
    }

    private static void paso4() throws InterruptedException {

        /**********************************************************
         * Información economica
         **********************************************************/

        //Thread.sleep(Integer.parseInt(props.getProperty("timer14"))*1000);

        //Select selectPC = new Select(waitElement("personClassificationId0", "id", "timer14"));
        //selectPC.selectByVisibleText(props.getProperty("personClassificationId0"));

        if(props.getProperty("declareIndId0").toString().equals("SI")){

            WebElement declareIndId0=driver.findElement(By.id(("declareIndId0")));
            declareIndId0.click();
        }


        WebElement currentAssetId0=driver.findElement(By.id(("currentAssetId0")));
        currentAssetId0.sendKeys(props.getProperty("currentAssetId0"));

        WebElement currentLiabilitiesId0=driver.findElement(By.id(("currentLiabilitiesId0")));
        currentLiabilitiesId0.sendKeys(props.getProperty("currentLiabilitiesId0"));

        WebElement totalAssetId0=driver.findElement(By.id(("totalAssetId0")));
        totalAssetId0.sendKeys(props.getProperty("totalAssetId0"));

        WebElement totalLiabilitiesId0=driver.findElement(By.id(("totalLiabilitiesId0")));
        totalLiabilitiesId0.sendKeys(props.getProperty("totalLiabilitiesId0"));

        Select selectEPD = new Select(driver.findElement(By.id(("ecoProfessionalDesignationId"))));
        selectEPD.selectByVisibleText(props.getProperty("ecoProfessionalDesignationId"));

        Thread.sleep(Integer.parseInt(props.getProperty("timer15"))*1000);


        Select selectEAN = new Select(waitElement("ecoApplicantNameId", "id", "timer15"));
        //selectEAN.selectByVisibleText(props.getProperty("ecoApplicantNameId"));
        selectEAN.selectByValue(props.getProperty("ecoApplicantNameId"));

        WebElement buttonAdd2 =driver.findElement(By.xpath(" //div[@class='tab-pane ng-scope active']//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]"));
        buttonAdd2.click();

        WebElement buttonNext3 =driver.findElement(By.xpath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]"));
        buttonNext3.click();

        /**********************************************************
         * Resumen
         **********************************************************/

        /*if(anmForm.radicarCheck.isSelected()){

            WebElement buttonRadicar =driver.findElementByXPath("//span[contains(text(),'Radicar')]");
            buttonRadicar.click();
        }*/
    }

}
