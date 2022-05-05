import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import static javax.swing.JOptionPane.showMessageDialog;

public class AnmForm {


    private JPanel rootPanel;
    private JTextField mineral;

    private JComboBox selectedCellInputMethodSlctId;
    private JComboBox selectTypeMap;
    private JTextField pikerLoad;
    private JComboBox additionalEthnicGroupsInSelectedAreaIndId;
    private JComboBox yearOfExecutionId0;
    private JComboBox yearOfExecutionId1;
    private JComboBox yearOfExecutionId2;
    private JComboBox yearOfExecutionId4;
    private JComboBox yearOfExecutionId5;
    private JComboBox yearOfExecutionId6;
    private JComboBox yearOfExecutionId7;
    private JComboBox yearOfExecutionId8;
    private JComboBox yearOfExecutionId9;
    private JComboBox yearOfExecutionId10;
    private JComboBox yearOfExecutionId11;
    private JComboBox yearOfExecutionId12;
    private JComboBox yearOfExecutionId13;
    private JComboBox yearOfExecutionId14;
    private JComboBox yearOfExecutionId15;
    private JComboBox yearOfExecutionId16;
    private JComboBox envYearOfDeliveryId0;
    private JComboBox envLaborSuitabilityId0;
    private JComboBox envYearOfDeliveryId5;
    private JComboBox envLaborSuitabilityId5;
    private JComboBox envYearOfExecutionId6;
    private JComboBox envYearOfDeliveryId6;
    private JComboBox envLaborSuitabilityId6;
    private JComboBox envYearOfExecutionId7;
    private JComboBox envYearOfDeliveryId7;
    private JComboBox envLaborSuitabilityId7;
    private JComboBox envYearOfExecutionId8;
    private JComboBox envYearOfDeliveryId8;
    private JComboBox envLaborSuitabilityId8;
    private JComboBox envYearOfExecutionId9;
    private JComboBox envYearOfDeliveryId9;
    private JComboBox envLaborSuitabilityId9;
    private JComboBox envYearOfExecutionId10;
    private JComboBox envYearOfDeliveryId10;
    private JComboBox envLaborSuitabilityId10;
    private JComboBox envYearOfExecutionId11;
    private JComboBox envYearOfDeliveryId11;
    private JComboBox envLaborSuitabilityId11;
    private JComboBox envYearOfExecutionId12;
    private JComboBox envYearOfExecutionId13;
    private JComboBox envYearOfDeliveryId12;
    private JComboBox envLaborSuitabilityId12;
    private JComboBox envYearOfDeliveryId13;
    private JComboBox envLaborSuitabilityId13;
    private JComboBox envYearOfExecutionId14;
    private JComboBox envYearOfDeliveryId14;
    private JComboBox envLaborSuitabilityId14;
    private JComboBox envLaborSuitabilityId16;
    private JComboBox envLaborSuitabilityId15;
    private JComboBox envYearOfDeliveryId15;
    private JComboBox envYearOfExecutionId15;
    private JComboBox envYearOfDeliveryId16;
    private JComboBox envYearOfExecutionId16;
    private JComboBox yearOfExecutionId3;
    private JComboBox yearOfDeliveryId0;
    private JComboBox yearOfDeliveryId1;
    private JComboBox yearOfDeliveryId2;
    private JComboBox yearOfDeliveryId3;
    private JComboBox yearOfDeliveryId4;
    private JComboBox yearOfDeliveryId5;
    private JComboBox yearOfDeliveryId6;
    private JComboBox yearOfDeliveryId7;
    private JComboBox yearOfDeliveryId8;
    private JComboBox yearOfDeliveryId9;
    private JComboBox yearOfDeliveryId10;
    private JComboBox yearOfDeliveryId11;
    private JComboBox yearOfDeliveryId12;
    private JComboBox yearOfDeliveryId13;
    private JComboBox yearOfDeliveryId14;
    private JComboBox yearOfDeliveryId15;
    private JComboBox yearOfDeliveryId16;
    private JComboBox laborSuitabilityId0;
    private JComboBox laborSuitabilityId1;
    private JComboBox laborSuitabilityId2;
    private JComboBox laborSuitabilityId4;
    private JComboBox laborSuitabilityId5;
    private JComboBox laborSuitabilityId6;
    private JComboBox laborSuitabilityId7;
    private JComboBox laborSuitabilityId8;
    private JComboBox laborSuitabilityId9;
    private JComboBox laborSuitabilityId10;
    private JComboBox laborSuitabilityId11;
    private JComboBox laborSuitabilityId12;
    private JComboBox laborSuitabilityId13;
    private JComboBox laborSuitabilityId14;
    private JComboBox laborSuitabilityId15;
    private JComboBox laborSuitabilityId16;
    private JComboBox envYearOfExecutionId1;
    private JComboBox envYearOfExecutionId2;
    private JComboBox envYearOfExecutionId3;
    private JComboBox envYearOfExecutionId4;
    private JComboBox envYearOfExecutionId5;
    private JComboBox envYearOfDeliveryId1;
    private JComboBox envYearOfDeliveryId2;
    private JComboBox envYearOfDeliveryId4;
    private JComboBox envLaborSuitabilityId1;
    private JComboBox envLaborSuitabilityId2;
    private JComboBox envLaborSuitabilityId4;
    private JComboBox areaOfConcessionSlctId;
    private JComboBox declareIndId0;
    private JTextField currentAssetId0;
    private JTextField ecoApplicantNameId;
    private JTextField totalLiabilitiesId0;
    private JTextField totalAssetId0;
    private JTextField currentLiabilitiesId0;
    private JButton guardarButton;
    public JButton loginButton;
    private JComboBox personClassificationId0;
    private JTextField timer1;
    private JTextField timer2;
    private JTextField timer3;
    private JTextField timer4;
    private JTextField timer5;
    private JTextField timer6;
    private JTextField timer7;
    private JTextField timer8;
    private JTextField timer9;
    private JTextField timer10;
    private JTextField timer11;
    private JTextField timer12;
    private JTextField timer13;
    private JTextField timer14;
    private JTextField timer15;
    public JButton ejecutarButton;
    public JButton paso1Button;
    public JButton paso2Button;
    public JButton paso3Button;
    public JButton paso4Button;
    private JTextField techApplicantNameId;
    private JTabbedPane tabbedPane1;
    private JComboBox envYearOfExecutionId0;
    private JComboBox laborSuitabilityId3;
    private JComboBox envYearOfDeliveryId3;
    private JComboBox envLaborSuitabilityId3;
    private JComboBox comboBox3;
    private JCheckBox radicarCheck;
    private JTextArea txtCells;
    private JComboBox techProfessionalDesignationId;
    private ChromeDriver driver;
    private Properties props;

    public JPanel getRootPanel() {
        return rootPanel;
    }
    public AnmForm(Properties props, ChromeDriver driver) {

        this.driver = driver;
        this.props = props;




        createUIComponents();

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

        ejecutarButton.addActionListener(new ActionListener() {

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

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


                try {

                    FileOutputStream out = new FileOutputStream("anm.properties");


                    props.setProperty("declareIndId0", declareIndId0.getSelectedItem().toString());
                    props.setProperty("additionalEthnicGroupsInSelectedAreaIndId", additionalEthnicGroupsInSelectedAreaIndId.getSelectedItem().toString());
                    props.setProperty("timer1", timer1.getText());
                    props.setProperty("timer2", timer2.getText());
                    props.setProperty("timer3", timer3.getText());
                    props.setProperty("timer4", timer4.getText());
                    props.setProperty("timer5", timer5.getText());
                    props.setProperty("timer6", timer6.getText());
                    props.setProperty("timer7", timer7.getText());
                    props.setProperty("timer8", timer8.getText());
                    props.setProperty("timer9", timer9.getText());
                    props.setProperty("timer10", timer10.getText());
                    props.setProperty("timer11", timer11.getText());
                    props.setProperty("timer12", timer12.getText());
                    props.setProperty("timer13", timer13.getText());
                    props.setProperty("timer14", timer14.getText());
                    props.setProperty("timer15", timer15.getText());

                    props.setProperty("mineral", mineral.getText());

                    props.setProperty("areaOfConcessionSlctId",areaOfConcessionSlctId.getSelectedItem().toString());

                    props.setProperty("selectedCellInputMethodSlctId", selectedCellInputMethodSlctId.getSelectedItem().toString());
                    props.setProperty("selectTypeMap", selectTypeMap.getSelectedItem().toString());
                    props.setProperty("pikerLoad", pikerLoad.getText());

                    props.setProperty("currentAssetId0", currentAssetId0.getText());
                    props.setProperty("totalLiabilitiesId0", totalLiabilitiesId0.getText());
                    props.setProperty("totalAssetId0", totalAssetId0.getText());
                    props.setProperty("currentLiabilitiesId0", currentLiabilitiesId0.getText());
                    props.setProperty("ecoApplicantNameId", ecoApplicantNameId.getText());
                    props.setProperty("techApplicantNameId", techApplicantNameId.getText());

                    props.setProperty("cells", txtCells.getText());

                    props.setProperty("yearOfExecutionId0", yearOfExecutionId0.getSelectedItem().toString());
                    props.setProperty("personClassificationId0", personClassificationId0.getSelectedItem().toString());
                    props.setProperty("techProfessionalDesignationId", techProfessionalDesignationId.getSelectedItem().toString());


                    props.setProperty("yearOfExecutionId1", yearOfExecutionId1.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId2", yearOfExecutionId2.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId2", yearOfExecutionId2.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId4", yearOfExecutionId4.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId5", yearOfExecutionId5.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId6", yearOfExecutionId6.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId7", yearOfExecutionId7.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId8", yearOfExecutionId8.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId9", yearOfExecutionId9.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId10", yearOfExecutionId10.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId11", yearOfExecutionId11.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId12", yearOfExecutionId12.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId13", yearOfExecutionId13.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId14", yearOfExecutionId14.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId15", yearOfExecutionId15.getSelectedItem().toString());
                    props.setProperty("yearOfExecutionId16", yearOfExecutionId16.getSelectedItem().toString());


                    props.setProperty("yearOfDeliveryId1", yearOfDeliveryId1.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId0", yearOfDeliveryId0.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId2", yearOfDeliveryId2.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId3", yearOfDeliveryId3.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId4", yearOfDeliveryId4.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId5", yearOfDeliveryId5.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId6", yearOfDeliveryId6.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId7", yearOfDeliveryId7.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId8", yearOfDeliveryId8.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId9", yearOfDeliveryId9.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId10", yearOfDeliveryId10.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId11", yearOfDeliveryId11.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId12", yearOfDeliveryId12.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId13", yearOfDeliveryId13.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId14", yearOfDeliveryId14.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId15", yearOfDeliveryId15.getSelectedItem().toString());
                    props.setProperty("yearOfDeliveryId16", yearOfDeliveryId16.getSelectedItem().toString());

                    props.setProperty("envYearOfExecutionId1", envYearOfExecutionId1.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId2", envYearOfExecutionId2.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId3", envYearOfExecutionId3.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId4", envYearOfExecutionId4.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId5", envYearOfExecutionId5.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId6", envYearOfExecutionId6.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId7", envYearOfExecutionId7.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId8", envYearOfExecutionId8.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId9", envYearOfExecutionId9.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId10", envYearOfExecutionId10.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId11", envYearOfExecutionId11.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId12", envYearOfExecutionId12.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId13", envYearOfExecutionId13.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId14", envYearOfExecutionId14.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId15", envYearOfExecutionId15.getSelectedItem().toString());
                    props.setProperty("envYearOfExecutionId16", envYearOfExecutionId16.getSelectedItem().toString());


                    props.setProperty("envYearOfDeliveryId1", envYearOfDeliveryId1.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId0", envYearOfDeliveryId0.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId2", envYearOfDeliveryId2.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId4", envYearOfDeliveryId4.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId5", envYearOfDeliveryId5.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId6", envYearOfDeliveryId6.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId7", envYearOfDeliveryId7.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId8", envYearOfDeliveryId8.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId9", envYearOfDeliveryId9.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId10", envYearOfDeliveryId10.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId11", envYearOfDeliveryId11.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId12", envYearOfDeliveryId12.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId13", envYearOfDeliveryId13.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId14", envYearOfDeliveryId14.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId15", envYearOfDeliveryId15.getSelectedItem().toString());
                    props.setProperty("envYearOfDeliveryId16", envYearOfDeliveryId16.getSelectedItem().toString());


                    props.setProperty("laborSuitabilityId1", laborSuitabilityId1.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId0", laborSuitabilityId0.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId2", laborSuitabilityId2.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId4", laborSuitabilityId4.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId5", laborSuitabilityId5.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId6", laborSuitabilityId6.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId7", laborSuitabilityId7.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId8", laborSuitabilityId8.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId9", laborSuitabilityId9.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId10", laborSuitabilityId10.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId11", laborSuitabilityId11.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId12", laborSuitabilityId12.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId13", laborSuitabilityId13.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId14", laborSuitabilityId14.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId15", laborSuitabilityId15.getSelectedItem().toString());
                    props.setProperty("laborSuitabilityId16", laborSuitabilityId16.getSelectedItem().toString());


                    props.setProperty("envLaborSuitabilityId1", envLaborSuitabilityId1.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId0", envLaborSuitabilityId0.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId2", envLaborSuitabilityId2.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId4", envLaborSuitabilityId4.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId5", envLaborSuitabilityId5.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId6", envLaborSuitabilityId6.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId7", envLaborSuitabilityId7.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId8", envLaborSuitabilityId8.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId9", envLaborSuitabilityId9.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId10",envLaborSuitabilityId10.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId11",envLaborSuitabilityId11.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId12",envLaborSuitabilityId12.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId13", envLaborSuitabilityId13.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId14", envLaborSuitabilityId14.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId15", envLaborSuitabilityId15.getSelectedItem().toString());
                    props.setProperty("envLaborSuitabilityId16", envLaborSuitabilityId16.getSelectedItem().toString());

                    props.store(out, null);
                    out.close();

                    showMessageDialog(null, "Datos guardados correctamente");
                } catch (IOException e) {
                    e.printStackTrace();
                    showMessageDialog(null, "Error guardando los datos");
                }

            }
        });
        selectedCellInputMethodSlctId.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String selected = selectedCellInputMethodSlctId.getSelectedItem().toString();

            }
        });

        ///
    }


    private WebElement waitElement(String search, String type, String timer) throws InterruptedException {

        Thread.sleep(Integer.parseInt(props.getProperty(timer)) * 1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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
        return null;
    }

    private void paso1() throws InterruptedException {
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

    private void paso2() throws InterruptedException {

        //Thread.sleep(Integer.parseInt(props.getProperty("timer3"))*1000);
        /**********************************************************
         * Ingresar detalles del área
         **********************************************************/

        WebElement btnMineral = waitElement(".btn-default", "css", "timer3");
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

    private void paso3() throws InterruptedException {



        //Thread.sleep(Integer.parseInt(props.getProperty("timer11"))*1000);
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

        WebElement checkboxAccept = driver.findElement(By.id(("technicalCheckboxId")));
        checkboxAccept.click();

        Select selectTAN = new Select(waitElement("techApplicantNameId", "id", "timer12"));
        selectTAN.selectByValue(props.getProperty("techApplicantNameId"));
        //selectTAN.selectByVisibleText(props.getProperty("techApplicantNameId"));

        WebElement buttonAdd = driver.findElement(By.xpath("//div[@class='tab-pane ng-scope active']//button[@class='btn btn-labeled bg-color-greenDark txt-color-white']"));
        buttonAdd.click();


        /**********************************************************
         * Información del area
         **********************************************************/

        WebElement tabArea = driver.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[2]"));
        tabArea.click();

        //Thread.sleep(Integer.parseInt(props.getProperty("timer13"))*1000);

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

    private void paso4() throws InterruptedException {

        /**********************************************************
         * Información economica
         **********************************************************/

        //Thread.sleep(Integer.parseInt(props.getProperty("timer14"))*1000);

        //Select selectPC = new Select(waitElement("personClassificationId0", "id", "timer14"));
        //selectPC.selectByVisibleText(props.getProperty("personClassificationId0"));

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

        /**********************************************************
         * Resumen
         **********************************************************/

        /*if(anmForm.radicarCheck.isSelected()){

            WebElement buttonRadicar =driver.findElementByXPath("//span[contains(text(),'Radicar')]");
            buttonRadicar.click();
        }*/
    }

    private void executeANMLogin() throws InterruptedException {


        /**********************************************************
         * Login
         **********************************************************/

        //WebElement user=driver.findElement(By.id(("username");
        WebElement user = driver.findElement(By.id("username"));
        user.sendKeys(props.getProperty("username"));

        //WebElement password = driver.findElement(By.id(("password");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(props.getProperty("password"));

        //element.sendKeys("abc@gmail.com");
        //WebElement buttonLogin=driver.findElement(By.id(("loginButton");
        WebElement buttonLogin = driver.findElement(By.id("loginButton"));
        buttonLogin.click();


        /**********************************************************
         * Panel
         **********************************************************/
        Thread.sleep(Integer.parseInt(props.getProperty("timer1")) * 1000);

        //WebElement menu = driver.findElement(By.xpath("//li[4]/a[2]/span"));

        WebElement menu = driver.findElement(By.xpath("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]"));
        menu.click();

        Thread.sleep(10000);

        //Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        //Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@class='form-control input-sm dashboard-display-inline ng-pristine ng-valid ng-not-empty ng-touched']")));
        selectCambiarUsuario.selectByVisibleText(props.getProperty("cambiarUsuario"));
    }

    private void createUIComponents() {

        //rootPanel.setAutoscrolls(true);
        /*JScrollPane jScrollPane = new JScrollPane(rootPanel);
        rootPanel.add(jScrollPane);*/

        ejecutarButton.setIcon(new ImageIcon("Resources/Button-Play-icon.png"));
        loginButton.setIcon(new ImageIcon("Resources/cs-login-icon.png"));
        paso1Button.setIcon(new ImageIcon("Resources/Numbers-1-Black-icon.png"));
        paso2Button.setIcon(new ImageIcon("Resources/Numbers-2-Black-icon.png"));
        paso3Button.setIcon(new ImageIcon("Resources/Numbers-3-Black-icon.png"));
        paso4Button.setIcon(new ImageIcon("Resources/Numbers-4-Black-icon.png"));
        guardarButton.setIcon(new ImageIcon("Resources/Actions-document-save-icon.png"));


        timer1.setText(props.getProperty("timer1"));
        timer2.setText(props.getProperty("timer2"));
        timer3.setText(props.getProperty("timer3"));
        timer4.setText(props.getProperty("timer4"));
        timer5.setText(props.getProperty("timer5"));
        timer6.setText(props.getProperty("timer6"));
        timer7.setText(props.getProperty("timer7"));
        timer8.setText(props.getProperty("timer8"));
        timer9.setText(props.getProperty("timer9"));
        timer10.setText(props.getProperty("timer10"));
        timer11.setText(props.getProperty("timer11"));
        timer12.setText(props.getProperty("timer12"));
        timer13.setText(props.getProperty("timer13"));
        timer14.setText(props.getProperty("timer14"));
        timer15.setText(props.getProperty("timer15"));
        //timer.setText(props.getProperty("timer"));

        mineral.setText(props.getProperty("mineral"));
        areaOfConcessionSlctId.setSelectedItem(props.getProperty("areaOfConcessionSlctId"));
        selectedCellInputMethodSlctId.setSelectedItem(props.getProperty("selectedCellInputMethodSlctId"));
        selectTypeMap.setSelectedItem(props.getProperty("selectTypeMap"));
        declareIndId0.setSelectedItem(props.getProperty("declareIndId0"));
        additionalEthnicGroupsInSelectedAreaIndId.setSelectedItem(props.getProperty("additionalEthnicGroupsInSelectedAreaIndId"));
        personClassificationId0.setSelectedItem(props.getProperty("personClassificationId0"));
        pikerLoad.setText(props.getProperty("pikerLoad"));

        txtCells.setText(props.getProperty("cells"));

        techProfessionalDesignationId.setSelectedItem(props.getProperty("techProfessionalDesignationId"));

        currentAssetId0.setText(props.getProperty("currentAssetId0"));
        totalLiabilitiesId0.setText(props.getProperty("totalLiabilitiesId0"));
        totalAssetId0.setText(props.getProperty("totalAssetId0"));
        currentLiabilitiesId0.setText(props.getProperty("currentLiabilitiesId0"));

        ecoApplicantNameId.setText(props.getProperty("ecoApplicantNameId"));
        techApplicantNameId.setText(props.getProperty("techApplicantNameId"));

        yearOfExecutionId0.setSelectedItem(props.getProperty("yearOfExecutionId0"));



        yearOfExecutionId1.setSelectedItem(props.getProperty("yearOfExecutionId1"));
        yearOfExecutionId2.setSelectedItem(props.getProperty("yearOfExecutionId2"));
        yearOfExecutionId3.setSelectedItem(props.getProperty("yearOfExecutionId2"));
        yearOfExecutionId4.setSelectedItem(props.getProperty("yearOfExecutionId4"));
        yearOfExecutionId5.setSelectedItem(props.getProperty("yearOfExecutionId5"));
        yearOfExecutionId6.setSelectedItem(props.getProperty("yearOfExecutionId6"));
        yearOfExecutionId7.setSelectedItem(props.getProperty("yearOfExecutionId7"));
        yearOfExecutionId8.setSelectedItem(props.getProperty("yearOfExecutionId8"));
        yearOfExecutionId9.setSelectedItem(props.getProperty("yearOfExecutionId9"));
        yearOfExecutionId10.setSelectedItem(props.getProperty("yearOfExecutionId10"));
        yearOfExecutionId11.setSelectedItem(props.getProperty("yearOfExecutionId11"));
        yearOfExecutionId12.setSelectedItem(props.getProperty("yearOfExecutionId12"));
        yearOfExecutionId13.setSelectedItem(props.getProperty("yearOfExecutionId13"));
        yearOfExecutionId14.setSelectedItem(props.getProperty("yearOfExecutionId14"));
        yearOfExecutionId15.setSelectedItem(props.getProperty("yearOfExecutionId15"));
        yearOfExecutionId16.setSelectedItem(props.getProperty("yearOfExecutionId16"));


        yearOfDeliveryId1.setSelectedItem(props.getProperty("yearOfDeliveryId1"));
        yearOfDeliveryId0.setSelectedItem(props.getProperty("yearOfDeliveryId0"));
        yearOfDeliveryId2.setSelectedItem(props.getProperty("yearOfDeliveryId2"));
        yearOfDeliveryId3.setSelectedItem(props.getProperty("yearOfDeliveryId2"));
        yearOfDeliveryId4.setSelectedItem(props.getProperty("yearOfDeliveryId4"));
        yearOfDeliveryId5.setSelectedItem(props.getProperty("yearOfDeliveryId5"));
        yearOfDeliveryId6.setSelectedItem(props.getProperty("yearOfDeliveryId6"));
        yearOfDeliveryId7.setSelectedItem(props.getProperty("yearOfDeliveryId7"));
        yearOfDeliveryId8.setSelectedItem(props.getProperty("yearOfDeliveryId8"));
        yearOfDeliveryId9.setSelectedItem(props.getProperty("yearOfDeliveryId9"));
        yearOfDeliveryId10.setSelectedItem(props.getProperty("yearOfDeliveryId10"));
        yearOfDeliveryId11.setSelectedItem(props.getProperty("yearOfDeliveryId11"));
        yearOfDeliveryId12.setSelectedItem(props.getProperty("yearOfDeliveryId12"));
        yearOfDeliveryId13.setSelectedItem(props.getProperty("yearOfDeliveryId13"));
        yearOfDeliveryId14.setSelectedItem(props.getProperty("yearOfDeliveryId14"));
        yearOfDeliveryId15.setSelectedItem(props.getProperty("yearOfDeliveryId15"));
        yearOfDeliveryId16.setSelectedItem(props.getProperty("yearOfDeliveryId16"));

        envYearOfExecutionId1.setSelectedItem(props.getProperty("envYearOfExecutionId1"));
        envYearOfExecutionId2.setSelectedItem(props.getProperty("envYearOfExecutionId2"));
        envYearOfExecutionId3.setSelectedItem(props.getProperty("envYearOfExecutionId3"));
        envYearOfExecutionId4.setSelectedItem(props.getProperty("envYearOfExecutionId4"));
        envYearOfExecutionId5.setSelectedItem(props.getProperty("envYearOfExecutionId5"));
        envYearOfExecutionId6.setSelectedItem(props.getProperty("envYearOfExecutionId6"));
        envYearOfExecutionId7.setSelectedItem(props.getProperty("envYearOfExecutionId7"));
        envYearOfExecutionId8.setSelectedItem(props.getProperty("envYearOfExecutionId8"));
        envYearOfExecutionId9.setSelectedItem(props.getProperty("envYearOfExecutionId9"));
        envYearOfExecutionId10.setSelectedItem(props.getProperty("envYearOfExecutionId10"));
        envYearOfExecutionId11.setSelectedItem(props.getProperty("envYearOfExecutionId11"));
        envYearOfExecutionId12.setSelectedItem(props.getProperty("envYearOfExecutionId12"));
        envYearOfExecutionId13.setSelectedItem(props.getProperty("envYearOfExecutionId13"));
        envYearOfExecutionId14.setSelectedItem(props.getProperty("envYearOfExecutionId14"));
        envYearOfExecutionId15.setSelectedItem(props.getProperty("envYearOfExecutionId15"));
        envYearOfExecutionId16.setSelectedItem(props.getProperty("envYearOfExecutionId16"));


        envYearOfDeliveryId1.setSelectedItem(props.getProperty("envYearOfDeliveryId1"));
        envYearOfDeliveryId0.setSelectedItem(props.getProperty("envYearOfDeliveryId0"));
        envYearOfDeliveryId2.setSelectedItem(props.getProperty("envYearOfDeliveryId2"));
        envYearOfDeliveryId4.setSelectedItem(props.getProperty("envYearOfDeliveryId4"));
        envYearOfDeliveryId5.setSelectedItem(props.getProperty("envYearOfDeliveryId5"));
        envYearOfDeliveryId6.setSelectedItem(props.getProperty("envYearOfDeliveryId6"));
        envYearOfDeliveryId7.setSelectedItem(props.getProperty("envYearOfDeliveryId7"));
        envYearOfDeliveryId8.setSelectedItem(props.getProperty("envYearOfDeliveryId8"));
        envYearOfDeliveryId9.setSelectedItem(props.getProperty("envYearOfDeliveryId9"));
        envYearOfDeliveryId10.setSelectedItem(props.getProperty("envYearOfDeliveryId10"));
        envYearOfDeliveryId11.setSelectedItem(props.getProperty("envYearOfDeliveryId11"));
        envYearOfDeliveryId12.setSelectedItem(props.getProperty("envYearOfDeliveryId12"));
        envYearOfDeliveryId13.setSelectedItem(props.getProperty("envYearOfDeliveryId13"));
        envYearOfDeliveryId14.setSelectedItem(props.getProperty("envYearOfDeliveryId14"));
        envYearOfDeliveryId15.setSelectedItem(props.getProperty("envYearOfDeliveryId15"));
        envYearOfDeliveryId16.setSelectedItem(props.getProperty("envYearOfDeliveryId16"));


        laborSuitabilityId1.setSelectedItem(props.getProperty("laborSuitabilityId1"));
        laborSuitabilityId0.setSelectedItem(props.getProperty("laborSuitabilityId0"));
        laborSuitabilityId2.setSelectedItem(props.getProperty("laborSuitabilityId2"));
        laborSuitabilityId4.setSelectedItem(props.getProperty("laborSuitabilityId4"));
        laborSuitabilityId5.setSelectedItem(props.getProperty("laborSuitabilityId5"));
        laborSuitabilityId6.setSelectedItem(props.getProperty("laborSuitabilityId6"));
        laborSuitabilityId7.setSelectedItem(props.getProperty("laborSuitabilityId7"));
        laborSuitabilityId8.setSelectedItem(props.getProperty("laborSuitabilityId8"));
        laborSuitabilityId9.setSelectedItem(props.getProperty("laborSuitabilityId9"));
        laborSuitabilityId10.setSelectedItem(props.getProperty("laborSuitabilityId10"));
        laborSuitabilityId11.setSelectedItem(props.getProperty("laborSuitabilityId11"));
        laborSuitabilityId12.setSelectedItem(props.getProperty("laborSuitabilityId12"));
        laborSuitabilityId13.setSelectedItem(props.getProperty("laborSuitabilityId13"));
        laborSuitabilityId14.setSelectedItem(props.getProperty("laborSuitabilityId14"));
        laborSuitabilityId15.setSelectedItem(props.getProperty("laborSuitabilityId15"));
        laborSuitabilityId16.setSelectedItem(props.getProperty("laborSuitabilityId16"));


        envLaborSuitabilityId1.setSelectedItem(props.getProperty("envLaborSuitabilityId1"));
        envLaborSuitabilityId0.setSelectedItem(props.getProperty("envLaborSuitabilityId0"));
        envLaborSuitabilityId2.setSelectedItem(props.getProperty("envLaborSuitabilityId2"));
        envLaborSuitabilityId4.setSelectedItem(props.getProperty("envLaborSuitabilityId4"));
        envLaborSuitabilityId5.setSelectedItem(props.getProperty("envLaborSuitabilityId5"));
        envLaborSuitabilityId6.setSelectedItem(props.getProperty("envLaborSuitabilityId6"));
        envLaborSuitabilityId7.setSelectedItem(props.getProperty("envLaborSuitabilityId7"));
        envLaborSuitabilityId8.setSelectedItem(props.getProperty("envLaborSuitabilityId8"));
        envLaborSuitabilityId9.setSelectedItem(props.getProperty("envLaborSuitabilityId9"));
        envLaborSuitabilityId10.setSelectedItem(props.getProperty("envLaborSuitabilityId10"));
        envLaborSuitabilityId11.setSelectedItem(props.getProperty("envLaborSuitabilityId11"));
        envLaborSuitabilityId12.setSelectedItem(props.getProperty("envLaborSuitabilityId12"));
        envLaborSuitabilityId13.setSelectedItem(props.getProperty("envLaborSuitabilityId13"));
        envLaborSuitabilityId14.setSelectedItem(props.getProperty("envLaborSuitabilityId14"));
        envLaborSuitabilityId15.setSelectedItem(props.getProperty("envLaborSuitabilityId15"));
        envLaborSuitabilityId16.setSelectedItem(props.getProperty("envLaborSuitabilityId16"));

    }

}
