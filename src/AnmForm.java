import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import static javax.swing.JOptionPane.showMessageDialog;

public class AnmForm {

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
    private JButton seleccionarBtn;
    private JButton seleccionarBtn2;
    //endregion
    private ChromeDriver driver;
    private Properties props;
    private RobotConcesion robotConcesion;
    public JPanel getRootPanel() {
        return rootPanel;
    }
    public AnmForm(Properties props, ChromeDriver driver) {

        this.driver = driver;
        this.props = props;

        robotConcesion = new RobotConcesion(driver, props);

        createUIComponents();

        loginButton.addActionListener(e -> {
            try {

                robotConcesion.executeANMLogin();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        ejecutarButton.addActionListener(e -> {
            try {
                robotConcesion.stepOne();
                robotConcesion.stepTwo();
                robotConcesion.stepThree();
                robotConcesion.stepFour();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso1Button.addActionListener(e -> {
            try {
                robotConcesion.stepOne();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso2Button.addActionListener(e -> {
            try {
                robotConcesion.stepTwo();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso3Button.addActionListener(e -> {
            try {
                robotConcesion.stepThree();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso4Button.addActionListener(e -> {
            try {
                robotConcesion.stepFour();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        guardarButton.addActionListener(actionEvent -> {


            try {

                FileOutputStream out = new FileOutputStream(RadicationConstans.ANM_PROPERTIES);


                props.setProperty("declareIndId0", declareIndId0.getSelectedItem().toString());
                props.setProperty("additionalEthnicGroupsInSelectedAreaIndId", additionalEthnicGroupsInSelectedAreaIndId.getSelectedItem().toString());

                for (int i = 0; i < 17; i++) {

                    if (i < 15) {
                        Util.setPropsValue(props,configPanel, "timer" + (i + 1), Util.componentType.JTEXTFIELD);
                    }

                    Util.setPropsValue(props,explorerPanel, RadicationConstans.YEAROFEXECUTIONID + i, Util.componentType.JCOMBOBOX);
                    Util.setPropsValue(props,explorerPanel, RadicationConstans.YEAROFDELIVERYID + i, Util.componentType.JCOMBOBOX);
                    Util.setPropsValue(props,explorerPanel, RadicationConstans.LABORSUITABILITYID + i, Util.componentType.JCOMBOBOX);

                    Util.setPropsValue(props,ambientalPanel, RadicationConstans.ENVYEAROFEXECUTIONID + i, Util.componentType.JCOMBOBOX);
                    Util.setPropsValue(props,ambientalPanel, RadicationConstans.ENVYEAROFDELIVERYID + i, Util.componentType.JCOMBOBOX);
                    Util.setPropsValue(props,ambientalPanel, RadicationConstans.ENVLABORSUITABILITYID + i, Util.componentType.JCOMBOBOX);
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

        seleccionarBtn.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                pdfGeo.setText(jfc.getCurrentDirectory().toString() + "\\" +jfc.getSelectedFile().getName());
            }
        });

        seleccionarBtn2.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                pdfCert.setText(jfc.getCurrentDirectory().toString() + "\\" +jfc.getSelectedFile().getName());
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

                Util.setComponentsValue(props, configPanel, "timer" + (i + 1), Util.componentType.JTEXTFIELD);
            }

            Util.setComponentsValue(props,explorerPanel, RadicationConstans.YEAROFEXECUTIONID + i, Util.componentType.JCOMBOBOX);
            Util.setComponentsValue(props,explorerPanel, RadicationConstans.YEAROFDELIVERYID + i, Util.componentType.JCOMBOBOX);
            Util.setComponentsValue(props,explorerPanel, RadicationConstans.LABORSUITABILITYID + i, Util.componentType.JCOMBOBOX);


            Util.setComponentsValue(props,ambientalPanel, RadicationConstans.ENVYEAROFEXECUTIONID + i, Util.componentType.JCOMBOBOX);
            Util.setComponentsValue(props,ambientalPanel, RadicationConstans.ENVYEAROFDELIVERYID + i, Util.componentType.JCOMBOBOX);
            Util.setComponentsValue(props,ambientalPanel, RadicationConstans.ENVLABORSUITABILITYID + i, Util.componentType.JCOMBOBOX);
        }


    }


}
