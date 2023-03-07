import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static javax.swing.JOptionPane.showMessageDialog;

public class AnmForm {


    private enum componentType {
        JCOMBOBOX,
        JTEXTFIELD
    }

    //region Form components
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
    private JTabbedPane groupPanel;
    private JComboBox envYearOfExecutionId0;
    private JComboBox laborSuitabilityId3;
    private JComboBox envYearOfDeliveryId3;
    private JComboBox envLaborSuitabilityId3;
    private JComboBox comboBox3;
    private JTextArea txtCells;
    private JComboBox techProfessionalDesignationId;
    private JPanel configPanel;
    private JPanel ambientalPanel;
    private JPanel explorerPanel;
    private JPanel filesPanel;
    private JTextField pdfGeo;
    private JTextField pdfCert;
    private ChromeDriver driver;
    private Properties props;
    //endregion

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public AnmForm(Properties props, ChromeDriver driver) {

        this.driver = driver;
        this.props = props;


        createUIComponents();

        loginButton.addActionListener(e -> {
            try {

                executeANMLogin();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        ejecutarButton.addActionListener(e -> {
            try {
                stepOne();
                stepTwo();
                stepThree();
                stepFour();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso1Button.addActionListener(e -> {
            try {
                stepOne();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso2Button.addActionListener(e -> {
            try {
                stepTwo();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso3Button.addActionListener(e -> {
            try {
                stepThree();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso4Button.addActionListener(e -> {
            try {
                stepFour();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        guardarButton.addActionListener(actionEvent -> {


            try {

                FileOutputStream out = new FileOutputStream(radicationConstans.ANM_PROPERTIES);


                props.setProperty("declareIndId0", declareIndId0.getSelectedItem().toString());
                props.setProperty("additionalEthnicGroupsInSelectedAreaIndId", additionalEthnicGroupsInSelectedAreaIndId.getSelectedItem().toString());

                for (int i = 0; i < 17; i++) {

                    if (i < 15) {
                        setPropsValue(configPanel, "timer" + (i + 1), componentType.JTEXTFIELD);
                    }

                    setPropsValue(explorerPanel, radicationConstans.YEAROFEXECUTIONID + i, componentType.JCOMBOBOX);
                    setPropsValue(explorerPanel, radicationConstans.YEAROFDELIVERYID + i, componentType.JCOMBOBOX);
                    setPropsValue(explorerPanel, radicationConstans.LABORSUITABILITYID + i, componentType.JCOMBOBOX);

                    setPropsValue(ambientalPanel, radicationConstans.ENVYEAROFEXECUTIONID + i, componentType.JCOMBOBOX);
                    setPropsValue(ambientalPanel, radicationConstans.ENVYEAROFDELIVERYID + i, componentType.JCOMBOBOX);
                    setPropsValue(ambientalPanel, radicationConstans.ENVLABORSUITABILITYID + i, componentType.JCOMBOBOX);
                }

                props.setProperty("mineral", mineral.getText());

                props.setProperty("areaOfConcessionSlctId", areaOfConcessionSlctId.getSelectedItem().toString());

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


                props.setProperty("personClassificationId0", personClassificationId0.getSelectedItem().toString());
                props.setProperty("techProfessionalDesignationId", techProfessionalDesignationId.getSelectedItem().toString());
                props.setProperty("pdfCert",pdfCert.getText());
                props.setProperty("pdfGeo",pdfGeo.getText());

                props.store(out, null);
                out.close();

                showMessageDialog(null, "Datos guardados correctamente");
            } catch (IOException e) {
                e.printStackTrace();
                showMessageDialog(null, "Error guardando los datos");
            }

        });

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

    private void stepOne() throws InterruptedException {
        WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'Radicar solicitud de propuesta')]"));
        submenu.click();

        //Seleccionar usuario
        Select selectPIN = new Select(waitElement("pinSlctId", "id", "timer2"));
        selectPIN.selectByVisibleText(props.getProperty("pinSlctId"));

        WebElement buttonNext1 = driver.findElement(By.xpath("//span[@class='btn-label ng-binding']"));
        buttonNext1.click();

    }

    private void stepTwo() throws InterruptedException {

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

    private void stepThree() throws InterruptedException {


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
                if(index > 0) {
                    Select selectYOE1 = new Select(driver.findElement(By.id(radicationConstans.YEAROFEXECUTIONID + index)));
                    selectYOE1.selectByVisibleText(props.getProperty(radicationConstans.YEAROFEXECUTIONID + index));

                    Select selectYOD1 = new Select(driver.findElement(By.id(radicationConstans.YEAROFDELIVERYID + index)));
                    selectYOD1.selectByVisibleText(props.getProperty(radicationConstans.YEAROFDELIVERYID + index));

                    Select selectLS1 = new Select(driver.findElement(By.id(radicationConstans.LABORSUITABILITYID + index)));
                    selectLS1.selectByVisibleText(props.getProperty(radicationConstans.LABORSUITABILITYID + index));
                }

                if(index >= 0){

                    Select selectELS0 = new Select(driver.findElement(By.id(radicationConstans.ENVLABORSUITABILITYID + index)));
                    selectELS0.selectByVisibleText(props.getProperty(radicationConstans.ENVLABORSUITABILITYID + index));
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

    private void stepFour() throws InterruptedException {

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

        //ambiental certification
        WebElement tabCert = driver.findElement(By.xpath("//form[@name='p_CaaIataInputAreaDetailsForm']//li[5]"));
        tabCert.click();

        Thread.sleep(Integer.parseInt(props.getProperty("timer15")) * 1000);

        WebElement pikerFile = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId0")));
        pikerFile.sendKeys(props.getProperty("pdfGeo"));

        WebElement pikerCert = driver.findElement(By.id(("p_CaaCataMandatoryDocumentToAttachId1")));
        pikerCert.sendKeys(props.getProperty("pdfCert"));

        WebElement bntDeclare = driver.findElement(By.id(("acceptanceOfTermsId")));
        bntDeclare.click();
        Thread.sleep(Integer.parseInt(props.getProperty("timer15")) * 1000);

        WebElement buttonNext3 = driver.findElement(By.xpath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]"));
        buttonNext3.click();

    }

    private void executeANMLogin() throws InterruptedException {

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

        Select selectCambiarUsuario = new Select(driver.findElement(By.xpath("//select[@aria-label='Cambiar el usuario:']")));
        selectCambiarUsuario.selectByVisibleText(props.getProperty("cambiarUsuario"));
    }

    private void createUIComponents() {

        ejecutarButton.setIcon(new ImageIcon("Resources/Button-Play-icon.png"));
        loginButton.setIcon(new ImageIcon("Resources/cs-login-icon.png"));
        paso1Button.setIcon(new ImageIcon("Resources/Numbers-1-Black-icon.png"));
        paso2Button.setIcon(new ImageIcon("Resources/Numbers-2-Black-icon.png"));
        paso3Button.setIcon(new ImageIcon("Resources/Numbers-3-Black-icon.png"));
        paso4Button.setIcon(new ImageIcon("Resources/Numbers-4-Black-icon.png"));
        guardarButton.setIcon(new ImageIcon("Resources/Actions-document-save-icon.png"));

        pdfCert.setText(props.getProperty("pdfCert"));
        pdfGeo.setText(props.getProperty("pdfGeo"));
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


        for (int i = 0; i < 17; i++) {

            if (i < 15) {

                setComponentsValue(configPanel, "timer" + (i + 1), componentType.JTEXTFIELD);
            }

            setComponentsValue(explorerPanel, radicationConstans.YEAROFEXECUTIONID + i, componentType.JCOMBOBOX);
            setComponentsValue(explorerPanel, radicationConstans.YEAROFDELIVERYID + i, componentType.JCOMBOBOX);
            setComponentsValue(explorerPanel, radicationConstans.LABORSUITABILITYID + i, componentType.JCOMBOBOX);


            setComponentsValue(ambientalPanel, radicationConstans.ENVYEAROFEXECUTIONID + i, componentType.JCOMBOBOX);
            setComponentsValue(ambientalPanel, radicationConstans.ENVYEAROFDELIVERYID + i, componentType.JCOMBOBOX);
            setComponentsValue(ambientalPanel, radicationConstans.ENVLABORSUITABILITYID + i, componentType.JCOMBOBOX);
        }


    }

    private void setComponentsValue(JPanel panel, String value, componentType type) {
        Arrays.stream(panel.getComponents())
                .filter(component -> component.getName() != null && component.getName().equals(value))
                .forEach(component -> {
                    switch (type) {
                        case JTEXTFIELD:
                            ((JTextField) component).setText(props.getProperty(value));
                            break;
                        case JCOMBOBOX:
                            ((JComboBox) component).setSelectedItem(props.getProperty(value));
                            break;
                        default:
                            break;
                    }
                });
    }

    private void setPropsValue(JPanel panel, String value, componentType type) {
        Arrays.stream(panel.getComponents())
                .filter(component ->  component.getName() != null && component.getName().equals(value))
                .forEach(component -> {
                    switch (type) {
                        case JTEXTFIELD:
                            props.setProperty(value, ((JTextField) component).getText());
                            break;
                        case JCOMBOBOX:
                            props.setProperty(value, ((JComboBox) component).getSelectedItem().toString());
                            break;
                        default:
                            break;
                    }
                });
    }

}
