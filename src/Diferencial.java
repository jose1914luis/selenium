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
    private JTabbedPane tabbedPane1;
    private JComboBox systemOfExploitationId;
    private JTextField yearlyProduction3InptId0;
    private JCheckBox checkB1;
    private JComboBox txtActA1;
    private JTextField year1InptId0;
    private JComboBox typeOfMiningId;
    private JTextField mineralPriceInptId0;
    private JTextField yearlyProduction1InptId0;
    private JTextField yearlyProduction2InptId0;
    private JTextField explorationInvestmentYear1InptId;
    private JTextField explorationInvestmentYear2InptId;
    private JTextField explorationInvestmentYear3InptId;
    private JTextField mineral2;
    private JCheckBox checkB2;
    private JCheckBox checkB3;
    private JCheckBox checkB4;
    private JCheckBox checkB5;
    private JCheckBox checkB6;
    private JCheckBox checkB7;
    private JCheckBox checkB8;
    private JCheckBox checkB9;
    private JCheckBox checkB10;
    private JCheckBox checkB11;
    private JCheckBox checkB12;
    private JCheckBox checkB13;
    private JCheckBox checkB14;
    private JCheckBox checkB15;
    private JCheckBox checkB16;
    private JCheckBox checkB17;
    private JCheckBox checkC1;
    private JCheckBox checkC2;
    private JCheckBox checkC3;
    private JCheckBox checkC4;
    private JCheckBox checkC5;
    private JCheckBox checkC6;
    private JCheckBox checkC7;
    private JCheckBox checkC8;
    private JCheckBox checkC9;
    private JCheckBox checkC10;
    private JCheckBox checkC11;
    private JCheckBox checkC12;
    private JCheckBox checkC13;
    private JCheckBox checkC14;
    private JCheckBox checkC15;
    private JCheckBox checkC16;
    private JCheckBox checkC17;
    private JComboBox txtActA11;
    private JComboBox txtActA2;
    private JComboBox txtActA3;
    private JComboBox txtActA4;
    private JComboBox txtActA5;
    private JComboBox txtActA6;
    private JComboBox txtActA7;
    private JComboBox txtActA8;
    private JComboBox txtActA9;
    private JComboBox txtActA10;
    private JComboBox txtActA12;
    private JComboBox txtActA13;
    private JComboBox txtActA14;
    private JComboBox txtActA15;
    private JComboBox txtActA16;
    private JComboBox txtActA17;
    private JComboBox txtActB1;
    private JComboBox txtActB2;
    private JComboBox txtActB3;
    private JComboBox txtActB4;
    private JComboBox txtActB5;
    private JComboBox txtActB6;
    private JComboBox txtActB7;
    private JComboBox txtActB8;
    private JComboBox txtActB9;
    private JComboBox txtActB10;
    private JComboBox txtActB11;
    private JComboBox txtActB12;
    private JComboBox txtActB13;
    private JComboBox txtActB14;
    private JComboBox txtActB15;
    private JComboBox txtActB16;
    private JComboBox txtActB17;
    private JTextField year2InptId0;
    private JTextField year3InptId0;
    private JTextField year1InptId1;
    private JTextField year2InptId1;
    private JTextField year3InptId1;
    private JTextField year1InptId2;
    private JTextField year2InptId2;
    private JTextField year3InptId2;
    private JTextField year1InptId3;
    private JTextField year1InptId4;
    private JTextField year1InptId5;
    private JTextField year1InptId6;
    private JTextField year2InptId3;
    private JTextField year2InptId4;
    private JTextField year2InptId5;
    private JTextField year2InptId6;
    private JTextField year3InptId3;
    private JTextField year3InptId4;
    private JTextField year3InptId5;
    private JTextField year3InptId6;
    private JTextField operationIncomeYear1InptId;
    private JTextField operationIncomeYear2InptId;
    private JTextField operationIncomeYear3InptId;
    private JComboBox earlyExploitationInd;
    private JComboBox personClassificationId2;
    private JTextField incomeId0;
    private ChromeDriver driver;
    private Properties props;

    public Diferencial(Properties props, ChromeDriver driver) {

        this.props = props;
        this.driver = driver;

        createUIComponents();

        ejecutarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    paso1();
                    paso2();
                    paso3();
                    if (props.getProperty("earlyExploitationInd").toString().equals("NO")) {
                        paso4();
                    }

                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
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

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveData();
            }
        });

    }

    private void createUIComponents() {
        ejecutarButton.setIcon(new ImageIcon("Resources/Button-Play-icon.png"));
        loginButton.setIcon(new ImageIcon("Resources/cs-login-icon.png"));
        paso1Button.setIcon(new ImageIcon("Resources/Numbers-1-Black-icon.png"));
        paso2Button.setIcon(new ImageIcon("Resources/Numbers-2-Black-icon.png"));
        paso3Button.setIcon(new ImageIcon("Resources/Numbers-3-Black-icon.png"));
        paso4Button.setIcon(new ImageIcon("Resources/Numbers-4-Black-icon.png"));
        guardarButton.setIcon(new ImageIcon("Resources/Actions-document-save-icon.png"));

        typeOfMiningId.setSelectedItem(props.getProperty("typeOfMiningId"));
        systemOfExploitationId.setSelectedItem(props.getProperty("systemOfExploitationId"));
        mineral2.setText(props.getProperty("mineral2"));
        mineralPriceInptId0.setText(props.getProperty("mineralPriceInptId0"));
        yearlyProduction1InptId0.setText(props.getProperty("yearlyProduction1InptId0"));
        yearlyProduction2InptId0.setText(props.getProperty("yearlyProduction2InptId0"));
        yearlyProduction3InptId0.setText(props.getProperty("yearlyProduction3InptId0"));
        explorationInvestmentYear1InptId.setText(props.getProperty("explorationInvestmentYear1InptId"));
        explorationInvestmentYear2InptId.setText(props.getProperty("explorationInvestmentYear2InptId"));
        explorationInvestmentYear3InptId.setText(props.getProperty("explorationInvestmentYear3InptId"));

        checkB1.setSelected(Boolean.parseBoolean(props.getProperty("checkB1")));
        checkB2.setSelected(Boolean.parseBoolean(props.getProperty("checkB2")));
        checkB3.setSelected(Boolean.parseBoolean(props.getProperty("checkB3")));
        checkB4.setSelected(Boolean.parseBoolean(props.getProperty("checkB4")));
        checkB5.setSelected(Boolean.parseBoolean(props.getProperty("checkB5")));
        checkB6.setSelected(Boolean.parseBoolean(props.getProperty("checkB6")));
        checkB7.setSelected(Boolean.parseBoolean(props.getProperty("checkB7")));
        checkB8.setSelected(Boolean.parseBoolean(props.getProperty("checkB8")));
        checkB9.setSelected(Boolean.parseBoolean(props.getProperty("checkB9")));
        checkB10.setSelected(Boolean.parseBoolean(props.getProperty("checkB10")));
        checkB11.setSelected(Boolean.parseBoolean(props.getProperty("checkB11")));
        checkB12.setSelected(Boolean.parseBoolean(props.getProperty("checkB12")));
        checkB13.setSelected(Boolean.parseBoolean(props.getProperty("checkB13")));
        checkB14.setSelected(Boolean.parseBoolean(props.getProperty("checkB14")));
        checkB15.setSelected(Boolean.parseBoolean(props.getProperty("checkB15")));
        checkB16.setSelected(Boolean.parseBoolean(props.getProperty("checkB16")));
        checkB17.setSelected(Boolean.parseBoolean(props.getProperty("checkB17")));

        checkC1.setSelected(Boolean.parseBoolean(props.getProperty("checkC1")));
        checkC2.setSelected(Boolean.parseBoolean(props.getProperty("checkC2")));
        checkC3.setSelected(Boolean.parseBoolean(props.getProperty("checkC3")));
        checkC4.setSelected(Boolean.parseBoolean(props.getProperty("checkC4")));
        checkC5.setSelected(Boolean.parseBoolean(props.getProperty("checkC5")));
        checkC6.setSelected(Boolean.parseBoolean(props.getProperty("checkC6")));
        checkC7.setSelected(Boolean.parseBoolean(props.getProperty("checkC7")));
        checkC8.setSelected(Boolean.parseBoolean(props.getProperty("checkC8")));
        checkC9.setSelected(Boolean.parseBoolean(props.getProperty("checkC9")));
        checkC10.setSelected(Boolean.parseBoolean(props.getProperty("checkC10")));
        checkC11.setSelected(Boolean.parseBoolean(props.getProperty("checkC11")));
        checkC12.setSelected(Boolean.parseBoolean(props.getProperty("checkC12")));
        checkC13.setSelected(Boolean.parseBoolean(props.getProperty("checkC13")));
        checkC14.setSelected(Boolean.parseBoolean(props.getProperty("checkC14")));
        checkC15.setSelected(Boolean.parseBoolean(props.getProperty("checkC15")));
        checkC16.setSelected(Boolean.parseBoolean(props.getProperty("checkC16")));
        checkC17.setSelected(Boolean.parseBoolean(props.getProperty("checkC17")));

        txtActA1.setSelectedItem(props.getProperty("txtActA1"));
        txtActA2.setSelectedItem(props.getProperty("txtActA2"));
        txtActA3.setSelectedItem(props.getProperty("txtActA3"));
        txtActA4.setSelectedItem(props.getProperty("txtActA4"));
        txtActA5.setSelectedItem(props.getProperty("txtActA5"));
        txtActA6.setSelectedItem(props.getProperty("txtActA6"));
        txtActA7.setSelectedItem(props.getProperty("txtActA7"));
        txtActA8.setSelectedItem(props.getProperty("txtActA8"));
        txtActA9.setSelectedItem(props.getProperty("txtActA9"));
        txtActA10.setSelectedItem(props.getProperty("txtActA10"));
        txtActA11.setSelectedItem(props.getProperty("txtActA11"));
        txtActA12.setSelectedItem(props.getProperty("txtActA12"));
        txtActA13.setSelectedItem(props.getProperty("txtActA13"));
        txtActA14.setSelectedItem(props.getProperty("txtActA14"));
        txtActA15.setSelectedItem(props.getProperty("txtActA15"));
        txtActA16.setSelectedItem(props.getProperty("txtActA16"));
        txtActA17.setSelectedItem(props.getProperty("txtActA17"));

        txtActB1.setSelectedItem(props.getProperty("txtActB1"));
        txtActB2.setSelectedItem(props.getProperty("txtActB2"));
        txtActB3.setSelectedItem(props.getProperty("txtActB3"));
        txtActB4.setSelectedItem(props.getProperty("txtActB4"));
        txtActB5.setSelectedItem(props.getProperty("txtActB5"));
        txtActB6.setSelectedItem(props.getProperty("txtActB6"));
        txtActB7.setSelectedItem(props.getProperty("txtActB7"));
        txtActB8.setSelectedItem(props.getProperty("txtActB8"));
        txtActB9.setSelectedItem(props.getProperty("txtActB9"));
        txtActB10.setSelectedItem(props.getProperty("txtActB10"));
        txtActB11.setSelectedItem(props.getProperty("txtActB11"));
        txtActB12.setSelectedItem(props.getProperty("txtActB12"));
        txtActB13.setSelectedItem(props.getProperty("txtActB13"));
        txtActB14.setSelectedItem(props.getProperty("txtActB14"));
        txtActB15.setSelectedItem(props.getProperty("txtActB15"));
        txtActB16.setSelectedItem(props.getProperty("txtActB16"));
        txtActB17.setSelectedItem(props.getProperty("txtActB17"));

        year1InptId0.setText(props.getProperty("year1InptId0"));
        year1InptId1.setText(props.getProperty("year1InptId1"));
        year1InptId2.setText(props.getProperty("year1InptId2"));
        year1InptId3.setText(props.getProperty("year1InptId3"));
        year1InptId4.setText(props.getProperty("year1InptId4"));
        year1InptId5.setText(props.getProperty("year1InptId5"));
        year1InptId6.setText(props.getProperty("year1InptId6"));

        year2InptId0.setText(props.getProperty("year2InptId0"));
        year2InptId1.setText(props.getProperty("year2InptId1"));
        year2InptId2.setText(props.getProperty("year2InptId2"));
        year2InptId3.setText(props.getProperty("year2InptId3"));
        year2InptId4.setText(props.getProperty("year2InptId4"));
        year2InptId5.setText(props.getProperty("year2InptId5"));
        year2InptId6.setText(props.getProperty("year2InptId6"));

        year3InptId0.setText(props.getProperty("year3InptId0"));
        year3InptId1.setText(props.getProperty("year3InptId1"));
        year3InptId2.setText(props.getProperty("year3InptId2"));
        year3InptId3.setText(props.getProperty("year3InptId3"));
        year3InptId4.setText(props.getProperty("year3InptId4"));
        year3InptId5.setText(props.getProperty("year3InptId5"));
        year3InptId6.setText(props.getProperty("year3InptId6"));

        operationIncomeYear1InptId.setText(props.getProperty("operationIncomeYear1InptId"));
        operationIncomeYear2InptId.setText(props.getProperty("operationIncomeYear2InptId"));
        operationIncomeYear3InptId.setText(props.getProperty("operationIncomeYear3InptId"));
        earlyExploitationInd.setSelectedItem(props.getProperty("earlyExploitationInd"));
        personClassificationId2.setSelectedItem(props.getProperty("personClassificationId2"));

        incomeId0.setText(props.getProperty("incomeId0"));
    }


    private void saveData(){
        try {
            FileOutputStream out = new FileOutputStream("anm.properties");
            props.setProperty("checkB1", Boolean.toString(checkB1.isSelected()));
            props.setProperty("checkB2", Boolean.toString(checkB2.isSelected()));
            props.setProperty("checkB3", Boolean.toString(checkB3.isSelected()));
            props.setProperty("checkB4", Boolean.toString(checkB4.isSelected()));
            props.setProperty("checkB5", Boolean.toString(checkB5.isSelected()));
            props.setProperty("checkB6", Boolean.toString(checkB6.isSelected()));
            props.setProperty("checkB7", Boolean.toString(checkB7.isSelected()));
            props.setProperty("checkB8", Boolean.toString(checkB8.isSelected()));
            props.setProperty("checkB9", Boolean.toString(checkB9.isSelected()));
            props.setProperty("checkB10", Boolean.toString(checkB10.isSelected()));
            props.setProperty("checkB11", Boolean.toString(checkB11.isSelected()));
            props.setProperty("checkB12", Boolean.toString(checkB12.isSelected()));
            props.setProperty("checkB13", Boolean.toString(checkB13.isSelected()));
            props.setProperty("checkB14", Boolean.toString(checkB14.isSelected()));
            props.setProperty("checkB15", Boolean.toString(checkB15.isSelected()));
            props.setProperty("checkB16", Boolean.toString(checkB16.isSelected()));
            props.setProperty("checkB17", Boolean.toString(checkB17.isSelected()));

            props.setProperty("checkC1", Boolean.toString(checkC1.isSelected()));
            props.setProperty("checkC2", Boolean.toString(checkC2.isSelected()));
            props.setProperty("checkC3", Boolean.toString(checkC3.isSelected()));
            props.setProperty("checkC4", Boolean.toString(checkC4.isSelected()));
            props.setProperty("checkC5", Boolean.toString(checkC5.isSelected()));
            props.setProperty("checkC6", Boolean.toString(checkC6.isSelected()));
            props.setProperty("checkC7", Boolean.toString(checkC7.isSelected()));
            props.setProperty("checkC8", Boolean.toString(checkC8.isSelected()));
            props.setProperty("checkC9", Boolean.toString(checkC9.isSelected()));
            props.setProperty("checkC10", Boolean.toString(checkC10.isSelected()));
            props.setProperty("checkC11", Boolean.toString(checkC11.isSelected()));
            props.setProperty("checkC12", Boolean.toString(checkC12.isSelected()));
            props.setProperty("checkC13", Boolean.toString(checkC13.isSelected()));
            props.setProperty("checkC14", Boolean.toString(checkC14.isSelected()));
            props.setProperty("checkC15", Boolean.toString(checkC15.isSelected()));
            props.setProperty("checkC16", Boolean.toString(checkC16.isSelected()));
            props.setProperty("checkC17", Boolean.toString(checkC17.isSelected()));

            props.setProperty("txtActA1", txtActA1.getSelectedItem().toString());
            props.setProperty("txtActA2", txtActA2.getSelectedItem().toString());
            props.setProperty("txtActA3", txtActA3.getSelectedItem().toString());
            props.setProperty("txtActA4", txtActA4.getSelectedItem().toString());
            props.setProperty("txtActA5", txtActA5.getSelectedItem().toString());
            props.setProperty("txtActA6", txtActA6.getSelectedItem().toString());
            props.setProperty("txtActA7", txtActA7.getSelectedItem().toString());
            props.setProperty("txtActA8", txtActA8.getSelectedItem().toString());
            props.setProperty("txtActA9", txtActA9.getSelectedItem().toString());
            props.setProperty("txtActA10", txtActA10.getSelectedItem().toString());
            props.setProperty("txtActA11", txtActA11.getSelectedItem().toString());
            props.setProperty("txtActA12", txtActA12.getSelectedItem().toString());
            props.setProperty("txtActA13", txtActA13.getSelectedItem().toString());
            props.setProperty("txtActA14", txtActA14.getSelectedItem().toString());
            props.setProperty("txtActA15", txtActA15.getSelectedItem().toString());
            props.setProperty("txtActA16", txtActA16.getSelectedItem().toString());
            props.setProperty("txtActA17", txtActA17.getSelectedItem().toString());

            props.setProperty("txtActB1", txtActB1.getSelectedItem().toString());
            props.setProperty("txtActB2", txtActB2.getSelectedItem().toString());
            props.setProperty("txtActB3", txtActB3.getSelectedItem().toString());
            props.setProperty("txtActB4", txtActB4.getSelectedItem().toString());
            props.setProperty("txtActB5", txtActB5.getSelectedItem().toString());
            props.setProperty("txtActB6", txtActB6.getSelectedItem().toString());
            props.setProperty("txtActB7", txtActB7.getSelectedItem().toString());
            props.setProperty("txtActB8", txtActB8.getSelectedItem().toString());
            props.setProperty("txtActB9", txtActB9.getSelectedItem().toString());
            props.setProperty("txtActB10", txtActB10.getSelectedItem().toString());
            props.setProperty("txtActB11", txtActB11.getSelectedItem().toString());
            props.setProperty("txtActB12", txtActB12.getSelectedItem().toString());
            props.setProperty("txtActB13", txtActB13.getSelectedItem().toString());
            props.setProperty("txtActB14", txtActB14.getSelectedItem().toString());
            props.setProperty("txtActB15", txtActB15.getSelectedItem().toString());
            props.setProperty("txtActB16", txtActB16.getSelectedItem().toString());
            props.setProperty("txtActB17", txtActB17.getSelectedItem().toString());


            props.setProperty("year1InptId0", year1InptId0.getText());
            props.setProperty("year1InptId1", year1InptId1.getText());
            props.setProperty("year1InptId2", year1InptId2.getText());
            props.setProperty("year1InptId3", year1InptId3.getText());
            props.setProperty("year1InptId4", year1InptId4.getText());
            props.setProperty("year1InptId5", year1InptId5.getText());
            props.setProperty("year1InptId6", year1InptId6.getText());

            props.setProperty("year2InptId0", year2InptId0.getText());
            props.setProperty("year2InptId1", year2InptId1.getText());
            props.setProperty("year2InptId2", year2InptId2.getText());
            props.setProperty("year2InptId3", year2InptId3.getText());
            props.setProperty("year2InptId4", year2InptId4.getText());
            props.setProperty("year2InptId5", year2InptId5.getText());
            props.setProperty("year2InptId6", year2InptId6.getText());

            props.setProperty("year3InptId0", year3InptId0.getText());
            props.setProperty("year3InptId1", year3InptId1.getText());
            props.setProperty("year3InptId2", year3InptId2.getText());
            props.setProperty("year3InptId3", year3InptId3.getText());
            props.setProperty("year3InptId4", year3InptId4.getText());
            props.setProperty("year3InptId5", year3InptId5.getText());
            props.setProperty("year3InptId6", year3InptId6.getText());

            props.setProperty("operationIncomeYear1InptId", operationIncomeYear1InptId.getText());
            props.setProperty("operationIncomeYear2InptId", operationIncomeYear2InptId.getText());
            props.setProperty("operationIncomeYear3InptId", operationIncomeYear3InptId.getText());

            props.setProperty("systemOfExploitationId", systemOfExploitationId.getSelectedItem().toString());
            props.setProperty("typeOfMiningId", typeOfMiningId.getSelectedItem().toString());

            props.setProperty("mineral2", mineral2.getText());
            props.setProperty("mineralPriceInptId0", mineralPriceInptId0.getText());

            props.setProperty("yearlyProduction1InptId0", yearlyProduction1InptId0.getText());
            props.setProperty("yearlyProduction2InptId0", yearlyProduction2InptId0.getText());
            props.setProperty("yearlyProduction3InptId0", yearlyProduction3InptId0.getText());

            props.setProperty("explorationInvestmentYear1InptId", explorationInvestmentYear1InptId.getText());
            props.setProperty("explorationInvestmentYear2InptId", explorationInvestmentYear2InptId.getText());
            props.setProperty("explorationInvestmentYear3InptId", explorationInvestmentYear3InptId.getText());

            props.setProperty("earlyExploitationInd", earlyExploitationInd.getSelectedItem().toString());

            props.setProperty("personClassificationId2", personClassificationId2.getSelectedItem().toString());

            props.setProperty("incomeId0", incomeId0.getText());

            props.store(out, null);
            out.close();
            showMessageDialog(null, "Datos guardados correctamente");
        }catch (IOException e){
            e.printStackTrace();
            showMessageDialog(null, "Error guardando los datos");
        }
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

        WebElement labelMineral = waitElement("mineral", "link", "timer4");
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

    private void paso3() throws InterruptedException {



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

    private void pasoIntermedio() throws InterruptedException {
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
        Thread.sleep(Integer.parseInt(props.getProperty("timer1")) * 1000);


        WebElement menu = driver.findElement(By.xpath("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]"));
        menu.click();

        Thread.sleep(5000);

        Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        selectCambiarUsuario.selectByVisibleText(props.getProperty("cambiarUsuario"));
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
            //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(search)));
        }
        return null;
    }
}
