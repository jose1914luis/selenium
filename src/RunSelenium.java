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

        setPreferredSize(new Dimension(1200, 600));
        JScrollPane scrollPane = new JScrollPane(anmForm.rootPanel);
        setTitle("Radicador");
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
        WebElement user=driver.findElementById("username");
        user.sendKeys( props.getProperty("username"));

        WebElement password = driver.findElementById("password");
        password.sendKeys(props.getProperty("password"));

        //element.sendKeys("abc@gmail.com");
        WebElement buttonLogin=driver.findElementById("loginButton");
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
        WebDriverWait wait = new WebDriverWait(driver, 10);

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

        //Select selectPIN = new Select(driver.findElementById("pinSlctId"));
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

        Select selectArea = new Select(driver.findElementById("areaOfConcessionSlctId"));
        selectArea.selectByVisibleText(props.getProperty("areaOfConcessionSlctId"));

        //Thread.sleep(Integer.parseInt(props.getProperty("timer5"))*1000);


        WebElement tabMap = waitElement(".uib-tab:nth-child(2) > .nav-link > .ng-binding", "css", "timer5");
        tabMap.click();

        Select selectTypeCoord = new Select(driver.findElementById("selectedCellInputMethodSlctId"));
        selectTypeCoord.selectByVisibleText(props.getProperty("selectedCellInputMethodSlctId"));

        WebElement btnMap = driver.findElementById("uploadShapeFileMapButtonId");
        btnMap.click();

        Thread.sleep(Integer.parseInt(props.getProperty("timer6"))*1000);

        driver.switchTo().frame("mapIframeId");
        Select selectTypeMap = new Select(driver.findElementByXPath("//select[@data-gcx-form-item='ListBox1']"));
        selectTypeMap.selectByVisibleText(props.getProperty("selectTypeMap"));

        WebElement btnContinue = driver.findElementByCssSelector("form:nth-child(2) .button");
        btnContinue.click();

        //driver.switchTo().frame("mapIframeId");
        //Thread.sleep(Integer.parseInt(props.getProperty("timer7"))*1000);

        WebElement pikerLoad = waitElement("//input[@data-gcx-form-item='FilePicker1']", "path", "timer7");
        pikerLoad.sendKeys(props.getProperty("pikerLoad"));

        WebElement btnLoad = driver.findElementByCssSelector("form:nth-child(2) .button");
        btnLoad.click();

        Thread.sleep(Integer.parseInt(props.getProperty("timer8"))*1000);

        driver.switchTo().defaultContent();
        WebElement btnConfirm = driver.findElementById("confirmBtnId");
        btnConfirm.click();

        //Thread.sleep(Integer.parseInt(props.getProperty("timer9"))*1000);

        WebElement buttonNext2 = waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", "path", "timer9");
        buttonNext2.click();

        //Thread.sleep(Integer.parseInt(props.getProperty("timer10"))*1000);

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
        Select selectYOD0 = new Select(driver.findElementById("yearOfDeliveryId0"));
        selectYOD0.selectByVisibleText(props.getProperty("yearOfDeliveryId0"));
        Select selectLS0 = new Select(driver.findElementById("laborSuitabilityId0"));
        selectLS0.selectByVisibleText(props.getProperty("laborSuitabilityId0"));

        Select selectYOE1 = new Select(driver.findElementById("yearOfExecutionId1"));
        selectYOE1.selectByVisibleText(props.getProperty("yearOfExecutionId1"));
        Select selectYOD1 = new Select(driver.findElementById("yearOfDeliveryId1"));
        selectYOD1.selectByVisibleText(props.getProperty("yearOfDeliveryId1"));
        Select selectLS1 = new Select(driver.findElementById("laborSuitabilityId1"));
        selectLS1.selectByVisibleText(props.getProperty("laborSuitabilityId1"));

        Select selectYOE2 = new Select(driver.findElementById("yearOfExecutionId2"));
        selectYOE2.selectByVisibleText(props.getProperty("yearOfExecutionId2"));
        Select selectYOD2 = new Select(driver.findElementById("yearOfDeliveryId2"));
        selectYOD2.selectByVisibleText(props.getProperty("yearOfDeliveryId2"));
        Select selectLS2 = new Select(driver.findElementById("laborSuitabilityId2"));
        selectLS2.selectByVisibleText(props.getProperty("laborSuitabilityId2"));

        Select selectYOE3 = new Select(driver.findElementById("yearOfExecutionId3"));
        selectYOE3.selectByVisibleText(props.getProperty("yearOfExecutionId3"));
        Select selectYOD3 = new Select(driver.findElementById("yearOfDeliveryId3"));
        selectYOD3.selectByVisibleText(props.getProperty("yearOfDeliveryId3"));
        Select selectLS3 = new Select(driver.findElementById("laborSuitabilityId3"));
        selectLS3.selectByVisibleText(props.getProperty("laborSuitabilityId3"));

        Select selectYOE4 = new Select(driver.findElementById("yearOfExecutionId4"));
        selectYOE4.selectByVisibleText(props.getProperty("yearOfExecutionId4"));
        Select selectYOD4 = new Select(driver.findElementById("yearOfDeliveryId4"));
        selectYOD4.selectByVisibleText(props.getProperty("yearOfDeliveryId4"));
        Select selectLS4 = new Select(driver.findElementById("laborSuitabilityId4"));
        selectLS4.selectByVisibleText(props.getProperty("laborSuitabilityId4"));

        Select selectYOE5 = new Select(driver.findElementById("yearOfExecutionId5"));
        selectYOE5.selectByVisibleText(props.getProperty("yearOfExecutionId5"));
        Select selectYOD5 = new Select(driver.findElementById("yearOfDeliveryId5"));
        selectYOD5.selectByVisibleText(props.getProperty("yearOfDeliveryId5"));
        Select selectLS5 = new Select(driver.findElementById("laborSuitabilityId5"));
        selectLS5.selectByVisibleText(props.getProperty("laborSuitabilityId5"));

        Select selectYOE6 = new Select(driver.findElementById("yearOfExecutionId6"));
        selectYOE6.selectByVisibleText(props.getProperty("yearOfExecutionId6"));
        Select selectYOD6 = new Select(driver.findElementById("yearOfDeliveryId6"));
        selectYOD6.selectByVisibleText(props.getProperty("yearOfDeliveryId6"));
        Select selectLS6 = new Select(driver.findElementById("laborSuitabilityId6"));
        selectLS6.selectByVisibleText(props.getProperty("laborSuitabilityId6"));

        Select selectYOE7 = new Select(driver.findElementById("yearOfExecutionId7"));
        selectYOE7.selectByVisibleText(props.getProperty("yearOfExecutionId7"));
        Select selectYOD7 = new Select(driver.findElementById("yearOfDeliveryId7"));
        selectYOD7.selectByVisibleText(props.getProperty("yearOfDeliveryId7"));
        Select selectLS7 = new Select(driver.findElementById("laborSuitabilityId7"));
        selectLS7.selectByVisibleText(props.getProperty("laborSuitabilityId7"));

        Select selectYOE8 = new Select(driver.findElementById("yearOfExecutionId8"));
        selectYOE8.selectByVisibleText(props.getProperty("yearOfExecutionId8"));
        Select selectYOD8 = new Select(driver.findElementById("yearOfDeliveryId8"));
        selectYOD8.selectByVisibleText(props.getProperty("yearOfDeliveryId8"));
        Select selectLS8 = new Select(driver.findElementById("laborSuitabilityId8"));
        selectLS8.selectByVisibleText(props.getProperty("laborSuitabilityId8"));

        Select selectYOE9 = new Select(driver.findElementById("yearOfExecutionId9"));
        selectYOE9.selectByVisibleText(props.getProperty("yearOfExecutionId9"));
        Select selectYOD9 = new Select(driver.findElementById("yearOfDeliveryId9"));
        selectYOD9.selectByVisibleText(props.getProperty("yearOfDeliveryId9"));
        Select selectLS9 = new Select(driver.findElementById("laborSuitabilityId9"));
        selectLS9.selectByVisibleText(props.getProperty("laborSuitabilityId9"));

        Select selectYOE10 = new Select(driver.findElementById("yearOfExecutionId10"));
        selectYOE10.selectByVisibleText(props.getProperty("yearOfExecutionId10"));
        Select selectYOD10 = new Select(driver.findElementById("yearOfDeliveryId10"));
        selectYOD10.selectByVisibleText(props.getProperty("yearOfDeliveryId10"));
        Select selectLS10 = new Select(driver.findElementById("laborSuitabilityId10"));
        selectLS10.selectByVisibleText(props.getProperty("laborSuitabilityId10"));

        Select selectYOE11 = new Select(driver.findElementById("yearOfExecutionId11"));
        selectYOE11.selectByVisibleText(props.getProperty("yearOfExecutionId11"));
        Select selectYOD11 = new Select(driver.findElementById("yearOfDeliveryId11"));
        selectYOD11.selectByVisibleText(props.getProperty("yearOfDeliveryId11"));
        Select selectLS11 = new Select(driver.findElementById("laborSuitabilityId11"));
        selectLS11.selectByVisibleText(props.getProperty("laborSuitabilityId11"));

        Select selectYOE12 = new Select(driver.findElementById("yearOfExecutionId12"));
        selectYOE12.selectByVisibleText(props.getProperty("yearOfExecutionId12"));
        Select selectYOD12 = new Select(driver.findElementById("yearOfDeliveryId12"));
        selectYOD12.selectByVisibleText(props.getProperty("yearOfDeliveryId12"));
        Select selectLS12 = new Select(driver.findElementById("laborSuitabilityId12"));
        selectLS12.selectByVisibleText(props.getProperty("laborSuitabilityId12"));

        Select selectYOE13 = new Select(driver.findElementById("yearOfExecutionId13"));
        selectYOE13.selectByVisibleText(props.getProperty("yearOfExecutionId13"));
        Select selectYOD13 = new Select(driver.findElementById("yearOfDeliveryId13"));
        selectYOD13.selectByVisibleText(props.getProperty("yearOfDeliveryId13"));
        Select selectLS13 = new Select(driver.findElementById("laborSuitabilityId13"));
        selectLS13.selectByVisibleText(props.getProperty("laborSuitabilityId13"));

        Select selectYOE14 = new Select(driver.findElementById("yearOfExecutionId14"));
        selectYOE14.selectByVisibleText(props.getProperty("yearOfExecutionId14"));
        Select selectYOD14 = new Select(driver.findElementById("yearOfDeliveryId14"));
        selectYOD14.selectByVisibleText(props.getProperty("yearOfDeliveryId14"));
        Select selectLS14 = new Select(driver.findElementById("laborSuitabilityId14"));
        selectLS14.selectByVisibleText(props.getProperty("laborSuitabilityId14"));

        Select selectYOE15 = new Select(driver.findElementById("yearOfExecutionId15"));
        selectYOE15.selectByVisibleText(props.getProperty("yearOfExecutionId15"));
        Select selectYOD15 = new Select(driver.findElementById("yearOfDeliveryId15"));
        selectYOD15.selectByVisibleText(props.getProperty("yearOfDeliveryId15"));
        Select selectLS15 = new Select(driver.findElementById("laborSuitabilityId15"));
        selectLS15.selectByVisibleText(props.getProperty("laborSuitabilityId15"));

        Select selectYOE16 = new Select(driver.findElementById("yearOfExecutionId16"));
        selectYOE16.selectByVisibleText(props.getProperty("yearOfExecutionId16"));
        Select selectYOD16 = new Select(driver.findElementById("yearOfDeliveryId16"));
        selectYOD16.selectByVisibleText(props.getProperty("yearOfDeliveryId16"));
        Select selectLS16 = new Select(driver.findElementById("laborSuitabilityId16"));
        selectLS16.selectByVisibleText(props.getProperty("laborSuitabilityId16"));

        //#####################################################################################

        /*Select selectEYOE0 = new Select(driver.findElementById("envYearOfExecutionId0"));
        selectEYOE0.selectByVisibleText(props.getProperty("envYearOfExecutionId0"));
        Select selectEYOD0 = new Select(driver.findElementById("envYearOfDeliveryId0"));
        selectEYOD0.selectByVisibleText(props.getProperty("envYearOfDeliveryId0"));*/
        Select selectELS0 = new Select(driver.findElementById("envLaborSuitabilityId0"));
        selectELS0.selectByVisibleText(props.getProperty("envLaborSuitabilityId0"));

        /*Select selectEYOE1 = new Select(driver.findElementById("envYearOfExecutionId1"));
        selectEYOE1.selectByVisibleText(props.getProperty("envYearOfExecutionId1"));
        Select selectEYOD1 = new Select(driver.findElementById("envYearOfDeliveryId1"));
        selectEYOD1.selectByVisibleText(props.getProperty("envYearOfDeliveryId1"));*/
        Select selectELS1 = new Select(driver.findElementById("envLaborSuitabilityId1"));
        selectELS1.selectByVisibleText(props.getProperty("envLaborSuitabilityId1"));

        /*Select selectEYOE2 = new Select(driver.findElementById("envYearOfExecutionId2"));
        selectEYOE2.selectByVisibleText(props.getProperty("envYearOfExecutionId2"));
        Select selectEYOD2 = new Select(driver.findElementById("envYearOfDeliveryId2"));
        selectEYOD2.selectByVisibleText(props.getProperty("envYearOfDeliveryId2"));*/
        Select selectELS2 = new Select(driver.findElementById("envLaborSuitabilityId2"));
        selectELS2.selectByVisibleText(props.getProperty("envLaborSuitabilityId2"));

        /*Select selectEYOE3 = new Select(driver.findElementById("envYearOfExecutionId3"));
        selectEYOE3.selectByVisibleText(props.getProperty("envYearOfExecutionId3"));
        Select selectEYOD3 = new Select(driver.findElementById("envYearOfDeliveryId3"));
        selectEYOD3.selectByVisibleText(props.getProperty("envYearOfDeliveryId3"));*/
        Select selectELS3 = new Select(driver.findElementById("envLaborSuitabilityId3"));
        selectELS3.selectByVisibleText(props.getProperty("envLaborSuitabilityId3"));

        /*Select selectEYOE4 = new Select(driver.findElementById("envYearOfExecutionId4"));
        selectEYOE4.selectByVisibleText(props.getProperty("envYearOfExecutionId4"));
        Select selectEYOD4 = new Select(driver.findElementById("envYearOfDeliveryId4"));
        selectEYOD4.selectByVisibleText(props.getProperty("envYearOfDeliveryId4"));*/
        Select selectELS4 = new Select(driver.findElementById("envLaborSuitabilityId4"));
        selectELS4.selectByVisibleText(props.getProperty("envLaborSuitabilityId4"));

        /*Select selectEYOE5 = new Select(driver.findElementById("envYearOfExecutionId5"));
        selectEYOE5.selectByVisibleText(props.getProperty("envYearOfExecutionId5"));
        Select selectEYOD5 = new Select(driver.findElementById("envYearOfDeliveryId5"));
        selectEYOD5.selectByVisibleText(props.getProperty("envYearOfDeliveryId5"));*/
        Select selectELS5 = new Select(driver.findElementById("envLaborSuitabilityId5"));
        selectELS5.selectByVisibleText(props.getProperty("envLaborSuitabilityId5"));

        /*Select selectEYOE6 = new Select(driver.findElementById("envYearOfExecutionId6"));
        selectEYOE6.selectByVisibleText(props.getProperty("envYearOfExecutionId6"));
        Select selectEYOD6 = new Select(driver.findElementById("envYearOfDeliveryId6"));
        selectEYOD6.selectByVisibleText(props.getProperty("envYearOfDeliveryId6"));*/
        Select selectELS6 = new Select(driver.findElementById("envLaborSuitabilityId6"));
        selectELS6.selectByVisibleText(props.getProperty("envLaborSuitabilityId6"));

        /*Select selectEYOE7 = new Select(driver.findElementById("envYearOfExecutionId7"));
        selectEYOE7.selectByVisibleText(props.getProperty("envYearOfExecutionId7"));
        Select selectEYOD7 = new Select(driver.findElementById("envYearOfDeliveryId7"));
        selectEYOD7.selectByVisibleText(props.getProperty("envYearOfDeliveryId7"));*/
        Select selectELS7 = new Select(driver.findElementById("envLaborSuitabilityId7"));
        selectELS7.selectByVisibleText(props.getProperty("envLaborSuitabilityId7"));

        /*Select selectEYOE8 = new Select(driver.findElementById("envYearOfExecutionId8"));
        selectEYOE8.selectByVisibleText(props.getProperty("envYearOfExecutionId8"));
        Select selectEYOD8 = new Select(driver.findElementById("envYearOfDeliveryId8"));
        selectEYOD8.selectByVisibleText(props.getProperty("envYearOfDeliveryId8"));*/
        Select selectELS8 = new Select(driver.findElementById("envLaborSuitabilityId8"));
        selectELS8.selectByVisibleText(props.getProperty("envLaborSuitabilityId8"));

        /*Select selectEYOE9 = new Select(driver.findElementById("envYearOfExecutionId9"));
        selectEYOE9.selectByVisibleText(props.getProperty("envYearOfExecutionId9"));
        Select selectEYOD9 = new Select(driver.findElementById("envYearOfDeliveryId9"));
        selectEYOD9.selectByVisibleText(props.getProperty("envYearOfDeliveryId9"));*/
        Select selectELS9 = new Select(driver.findElementById("envLaborSuitabilityId9"));
        selectELS9.selectByVisibleText(props.getProperty("envLaborSuitabilityId9"));

        /*Select selectEYOE10 = new Select(driver.findElementById("envYearOfExecutionId10"));
        selectEYOE10.selectByVisibleText(props.getProperty("envYearOfExecutionId10"));
        Select selectEYOD10 = new Select(driver.findElementById("envYearOfDeliveryId10"));
        selectEYOD10.selectByVisibleText(props.getProperty("envYearOfDeliveryId10"));*/
        Select selectELS10 = new Select(driver.findElementById("envLaborSuitabilityId10"));
        selectELS10.selectByVisibleText(props.getProperty("envLaborSuitabilityId10"));

        /*Select selectEYOE11 = new Select(driver.findElementById("envYearOfExecutionId11"));
        selectEYOE11.selectByVisibleText(props.getProperty("envYearOfExecutionId11"));
        Select selectEYOD11 = new Select(driver.findElementById("envYearOfDeliveryId11"));
        selectEYOD11.selectByVisibleText(props.getProperty("envYearOfDeliveryId11"));*/
        Select selectELS11 = new Select(driver.findElementById("envLaborSuitabilityId11"));
        selectELS11.selectByVisibleText(props.getProperty("envLaborSuitabilityId11"));

        /*Select selectEYOE12 = new Select(driver.findElementById("envYearOfExecutionId12"));
        selectEYOE12.selectByVisibleText(props.getProperty("envYearOfExecutionId12"));
        Select selectEYOD12 = new Select(driver.findElementById("envYearOfDeliveryId12"));
        selectEYOD12.selectByVisibleText(props.getProperty("envYearOfDeliveryId12"));*/
        Select selectELS12 = new Select(driver.findElementById("envLaborSuitabilityId12"));
        selectELS12.selectByVisibleText(props.getProperty("envLaborSuitabilityId12"));

        /*Select selectEYOE13 = new Select(driver.findElementById("envYearOfExecutionId13"));
        selectEYOE13.selectByVisibleText(props.getProperty("envYearOfExecutionId13"));
        Select selectEYOD13 = new Select(driver.findElementById("envYearOfDeliveryId13"));
        selectEYOD13.selectByVisibleText(props.getProperty("envYearOfDeliveryId13"));*/
        Select selectELS13 = new Select(driver.findElementById("envLaborSuitabilityId13"));
        selectELS13.selectByVisibleText(props.getProperty("envLaborSuitabilityId13"));

        /*Select selectEYOE14 = new Select(driver.findElementById("envYearOfExecutionId14"));
        selectEYOE14.selectByVisibleText(props.getProperty("envYearOfExecutionId14"));
        Select selectEYOD14 = new Select(driver.findElementById("envYearOfDeliveryId14"));
        selectEYOD14.selectByVisibleText(props.getProperty("envYearOfDeliveryId14"));*/
        Select selectELS14 = new Select(driver.findElementById("envLaborSuitabilityId14"));
        selectELS14.selectByVisibleText(props.getProperty("envLaborSuitabilityId14"));

        /*Select selectEYOE15 = new Select(driver.findElementById("envYearOfExecutionId15"));
        selectEYOE15.selectByVisibleText(props.getProperty("envYearOfExecutionId15"));
        Select selectEYOD15 = new Select(driver.findElementById("envYearOfDeliveryId15"));
        selectEYOD15.selectByVisibleText(props.getProperty("envYearOfDeliveryId15"));*/
        Select selectELS15 = new Select(driver.findElementById("envLaborSuitabilityId15"));
        selectELS15.selectByVisibleText(props.getProperty("envLaborSuitabilityId15"));

        /*Select selectEYOE16 = new Select(driver.findElementById("envYearOfExecutionId16"));
        selectEYOE16.selectByVisibleText(props.getProperty("envYearOfExecutionId16"));
        Select selectEYOD16 = new Select(driver.findElementById("envYearOfDeliveryId16"));
        selectEYOD16.selectByVisibleText(props.getProperty("envYearOfDeliveryId16"));*/
        Select selectELS16 = new Select(driver.findElementById("envLaborSuitabilityId16"));
        selectELS16.selectByVisibleText(props.getProperty("envLaborSuitabilityId16"));

        Select selectTPD = new Select(driver.findElementById("techProfessionalDesignationId"));
        selectTPD.selectByVisibleText(props.getProperty("techProfessionalDesignationId"));

        //Thread.sleep(Integer.parseInt(props.getProperty(""))*1000);


        Select selectTAN = new Select(waitElement("techApplicantNameId", "id", "timer12"));
        selectTAN.selectByVisibleText(props.getProperty("techApplicantNameId"));

        WebElement buttonAdd =driver.findElementByXPath("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']");
        buttonAdd.click();

        WebElement checkboxAccept =driver.findElementById("technicalCheckboxId");
        checkboxAccept.click();

        /**********************************************************
         * Información del area
         **********************************************************/

        WebElement tabArea = driver.findElementByXPath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]");
        tabArea.click();

        //Thread.sleep(Integer.parseInt(props.getProperty("timer13"))*1000);

        if(props.getProperty("additionalEthnicGroupsInSelectedAreaIndId") == "SI"){

            WebElement additionalEthnicGroupsInSelectedAreaIndId =waitElement("//div[@class='tab-pane ng-scope active']//input[1]", "path", "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        }else{
            WebElement additionalEthnicGroupsInSelectedAreaIndId =waitElement("//input[2]", "path", "timer13");
            additionalEthnicGroupsInSelectedAreaIndId.click();
        }

        WebElement tabEco = driver.findElementByXPath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[4]");
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

            WebElement declareIndId0=driver.findElementById("declareIndId0");
            declareIndId0.click();
        }


        WebElement currentAssetId0=driver.findElementById("currentAssetId0");
        currentAssetId0.sendKeys(props.getProperty("currentAssetId0"));

        WebElement currentLiabilitiesId0=driver.findElementById("currentLiabilitiesId0");
        currentLiabilitiesId0.sendKeys(props.getProperty("currentLiabilitiesId0"));

        WebElement totalAssetId0=driver.findElementById("totalAssetId0");
        totalAssetId0.sendKeys(props.getProperty("totalAssetId0"));

        WebElement totalLiabilitiesId0=driver.findElementById("totalLiabilitiesId0");
        totalLiabilitiesId0.sendKeys(props.getProperty("totalLiabilitiesId0"));

        Select selectEPD = new Select(driver.findElementById("ecoProfessionalDesignationId"));
        selectEPD.selectByVisibleText(props.getProperty("ecoProfessionalDesignationId"));

        Thread.sleep(Integer.parseInt(props.getProperty("timer15"))*1000);


        Select selectEAN = new Select(waitElement("ecoApplicantNameId", "id", "timer15"));
        selectEAN.selectByVisibleText(props.getProperty("ecoApplicantNameId"));

        WebElement buttonAdd2 =driver.findElementByXPath(" //div[@class='tab-pane ng-scope active']//span[@class='btn-label ng-binding'][contains(text(),'Agregar')]");
        buttonAdd2.click();

        WebElement buttonNext3 =driver.findElementByXPath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]");
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
