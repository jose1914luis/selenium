package main.resources.java.com.robot.core.forms;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import main.resources.java.com.robot.core.Constans;
import main.resources.java.com.robot.core.RobotDiferencial;
import main.resources.java.com.robot.core.Util;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

import static javax.swing.JOptionPane.showMessageDialog;

public class Diferencial {


    //region Form components
    private JButton guardarButton;
    private JButton ejecutarButton;
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
    private JPanel activityPanel;
    private JPanel economicPanel;
    private RobotDiferencial robotDiferencial;
    //endregion
    private ChromeDriver driver;
    private Properties props;

    public Diferencial(Properties props, ChromeDriver driver) {

        this.props = props;
        this.driver = driver;
        robotDiferencial = new RobotDiferencial(driver, props);

        createUIComponents();

        ejecutarButton.addActionListener(e -> {
            try {
                robotDiferencial.stepOne();
                robotDiferencial.stepTwo();
                robotDiferencial.stepThree();
                if (props.getProperty("earlyExploitationInd").toString().equals("NO")) {
                    robotDiferencial.stepFour();
                }

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        loginButton.addActionListener(e -> {
            try {

                robotDiferencial.executeANMLogin();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso1Button.addActionListener(e -> {
            try {
                robotDiferencial.stepOne();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso2Button.addActionListener(e -> {
            try {
                robotDiferencial.stepTwo();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso3Button.addActionListener(e -> {
            try {
                robotDiferencial.stepThree();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso4Button.addActionListener(e -> {
            try {
                robotDiferencial.stepFour();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        guardarButton.addActionListener(e -> saveData());

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

        for (int i = 1; i < 18; i++) {

            Util.setComponentsValue(props, activityPanel, Constans.CHECKB + i, Constans.componentType.JCHECKBOX);
            Util.setComponentsValue(props, activityPanel, Constans.CHECKC + i, Constans.componentType.JCHECKBOX);

            Util.setComponentsValue(props, activityPanel, Constans.TXTACTA + i, Constans.componentType.JCOMBOBOX);
            Util.setComponentsValue(props, activityPanel, Constans.TXTACTB + i, Constans.componentType.JCOMBOBOX);

            if (i <= 7) {
                Util.setComponentsValue(props, economicPanel, Constans.YEAR1INPTID + (i - 1), Constans.componentType.JTEXTFIELD);
                Util.setComponentsValue(props, economicPanel, Constans.YEAR2INPTID + (i - 1), Constans.componentType.JTEXTFIELD);
                Util.setComponentsValue(props, economicPanel, Constans.YEAR3INPTID + (i - 1), Constans.componentType.JTEXTFIELD);
            }


        }

        operationIncomeYear1InptId.setText(props.getProperty("operationIncomeYear1InptId"));
        operationIncomeYear2InptId.setText(props.getProperty("operationIncomeYear2InptId"));
        operationIncomeYear3InptId.setText(props.getProperty("operationIncomeYear3InptId"));
        earlyExploitationInd.setSelectedItem(props.getProperty("earlyExploitationInd"));
        personClassificationId2.setSelectedItem(props.getProperty("personClassificationId2"));

        incomeId0.setText(props.getProperty("incomeId0"));
    }

    private void saveData() {
        try {
            FileOutputStream out = new FileOutputStream("anm.properties");

            for (int i = 1; i < 18; i++) {


                Util.setPropsValue(props, activityPanel, Constans.CHECKB + i, Constans.componentType.JCHECKBOX);
                Util.setPropsValue(props, activityPanel, Constans.CHECKC + i, Constans.componentType.JCHECKBOX);

                Util.setPropsValue(props, activityPanel, Constans.TXTACTA + i, Constans.componentType.JCOMBOBOX);
                Util.setPropsValue(props, activityPanel, Constans.TXTACTB + i, Constans.componentType.JCOMBOBOX);

                if (i <= 7) {
                    Util.setPropsValue(props, economicPanel, Constans.YEAR1INPTID + (i - 1), Constans.componentType.JTEXTFIELD);
                    Util.setPropsValue(props, economicPanel, Constans.YEAR2INPTID + (i - 1), Constans.componentType.JTEXTFIELD);
                    Util.setPropsValue(props, economicPanel, Constans.YEAR3INPTID + (i - 1), Constans.componentType.JTEXTFIELD);
                }
            }

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
        } catch (IOException e) {
            e.printStackTrace();
            showMessageDialog(null, "Error guardando los datos");
        }
    }
    public JPanel getRootPanel() {
        return rootPanel;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1 = new JTabbedPane();
        rootPanel.add(tabbedPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(10, 5, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1.addTab("Información Tecnica", panel1);
        final JLabel label1 = new JLabel();
        label1.setText("Tipo de minería");
        panel1.add(label1, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Sistema de explotación");
        panel1.add(label2, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.BOLD, -1, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setText("Detalles de los minerales");
        panel1.add(label3, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Seleccionar minerales");
        panel1.add(label4, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Minerales seleccionados");
        panel1.add(label5, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Inversión de la exploración ");
        panel1.add(label6, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearlyProduction3InptId0 = new JTextField();
        panel1.add(yearlyProduction3InptId0, new GridConstraints(8, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label7 = new JLabel();
        Font label7Font = this.$$$getFont$$$(null, Font.BOLD, -1, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setText("Método de explotación");
        panel1.add(label7, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearlyProduction1InptId0 = new JTextField();
        panel1.add(yearlyProduction1InptId0, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        yearlyProduction2InptId0 = new JTextField();
        panel1.add(yearlyProduction2InptId0, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        mineralPriceInptId0 = new JTextField();
        panel1.add(mineralPriceInptId0, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        explorationInvestmentYear1InptId = new JTextField();
        panel1.add(explorationInvestmentYear1InptId, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        explorationInvestmentYear2InptId = new JTextField();
        panel1.add(explorationInvestmentYear2InptId, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        explorationInvestmentYear3InptId = new JTextField();
        panel1.add(explorationInvestmentYear3InptId, new GridConstraints(9, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        typeOfMiningId = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Cielo Abierto");
        defaultComboBoxModel1.addElement("Mixta");
        defaultComboBoxModel1.addElement("Subterráneo");
        typeOfMiningId.setModel(defaultComboBoxModel1);
        panel1.add(typeOfMiningId, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        systemOfExploitationId = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("Canales longitudinales");
        defaultComboBoxModel2.addElement("Cantera");
        defaultComboBoxModel2.addElement("Dársenas y Dragado");
        defaultComboBoxModel2.addElement("Graveras");
        defaultComboBoxModel2.addElement("Minería de cajón o descubiertas");
        defaultComboBoxModel2.addElement("Minería de contorno");
        defaultComboBoxModel2.addElement("Métodos mixtos o especiales");
        defaultComboBoxModel2.addElement("Tajo abierto");
        systemOfExploitationId.setModel(defaultComboBoxModel2);
        panel1.add(systemOfExploitationId, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mineral2 = new JTextField();
        panel1.add(mineral2, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setText("Desea realizar explotación anticipada?");
        panel1.add(label8, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        earlyExploitationInd = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement("SI");
        defaultComboBoxModel3.addElement("NO");
        earlyExploitationInd.setModel(defaultComboBoxModel3);
        panel1.add(earlyExploitationInd, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label9 = new JLabel();
        label9.setText("Clasificación de persona");
        panel1.add(label9, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        personClassificationId2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel4 = new DefaultComboBoxModel();
        defaultComboBoxModel4.addElement("Persona Natural no obligada a llevar contabilidad");
        defaultComboBoxModel4.addElement("Persona Natural obligada a llevar contabilidad");
        personClassificationId2.setModel(defaultComboBoxModel4);
        panel1.add(personClassificationId2, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        label10.setText("Ingreso anual");
        panel1.add(label10, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        incomeId0 = new JTextField();
        panel1.add(incomeId0, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        tabbedPane1.addTab("Actividades de exploración", scrollPane1);
        activityPanel = new JPanel();
        activityPanel.setLayout(new GridLayoutManager(36, 3, new Insets(0, 0, 0, 0), -1, -1));
        scrollPane1.setViewportView(activityPanel);
        final JLabel label11 = new JLabel();
        Font label11Font = this.$$$getFont$$$(null, Font.BOLD, -1, label11.getFont());
        if (label11Font != null) label11.setFont(label11Font);
        label11.setText("Actividades de exploración");
        activityPanel.add(label11, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label12 = new JLabel();
        label12.setText("Revisión bibliográfica");
        activityPanel.add(label12, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB1 = new JCheckBox();
        checkB1.setName("checkB1");
        checkB1.setText("");
        activityPanel.add(checkB1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        txtActA1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel5 = new DefaultComboBoxModel();
        defaultComboBoxModel5.addElement("");
        defaultComboBoxModel5.addElement("1");
        defaultComboBoxModel5.addElement("2");
        defaultComboBoxModel5.addElement("3");
        txtActA1.setModel(defaultComboBoxModel5);
        txtActA1.setName("txtActA1");
        activityPanel.add(txtActA1, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label13 = new JLabel();
        label13.setText("Contactos con la comunidad y enfoque social");
        activityPanel.add(label13, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB2 = new JCheckBox();
        checkB2.setName("checkB2");
        checkB2.setText("");
        activityPanel.add(checkB2, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label14 = new JLabel();
        label14.setText("Base topográfica del área");
        activityPanel.add(label14, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB3 = new JCheckBox();
        checkB3.setName("checkB3");
        checkB3.setText("");
        activityPanel.add(checkB3, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label15 = new JLabel();
        label15.setText("Cartografía geológica");
        activityPanel.add(label15, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB4 = new JCheckBox();
        checkB4.setName("checkB4");
        checkB4.setText("");
        activityPanel.add(checkB4, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label16 = new JLabel();
        label16.setText("Excavación de trincheras y apiques");
        activityPanel.add(label16, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB5 = new JCheckBox();
        checkB5.setName("checkB5");
        checkB5.setText("");
        activityPanel.add(checkB5, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label17 = new JLabel();
        label17.setText("Geoquímica y otros análisis");
        activityPanel.add(label17, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB6 = new JCheckBox();
        checkB6.setName("checkB6");
        checkB6.setText("");
        activityPanel.add(checkB6, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label18 = new JLabel();
        label18.setText("Geofísica");
        activityPanel.add(label18, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB7 = new JCheckBox();
        checkB7.setName("checkB7");
        checkB7.setText("");
        activityPanel.add(checkB7, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label19 = new JLabel();
        label19.setText("Estudio de dinámica fluvial del cauce");
        activityPanel.add(label19, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB8 = new JCheckBox();
        checkB8.setName("checkB8");
        checkB8.setText("");
        activityPanel.add(checkB8, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label20 = new JLabel();
        label20.setText("Características hidrológicas y sedimentológicas del cauce");
        activityPanel.add(label20, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB9 = new JCheckBox();
        checkB9.setName("checkB9");
        checkB9.setText("");
        activityPanel.add(checkB9, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label21 = new JLabel();
        label21.setText("Pozos y Galerías Exploratorias");
        activityPanel.add(label21, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB10 = new JCheckBox();
        checkB10.setName("checkB10");
        checkB10.setText("");
        activityPanel.add(checkB10, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label22 = new JLabel();
        label22.setText("Perforaciones profundas");
        activityPanel.add(label22, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB11 = new JCheckBox();
        checkB11.setName("checkB11");
        checkB11.setText("");
        activityPanel.add(checkB11, new GridConstraints(11, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label23 = new JLabel();
        label23.setText("Muestreo y análisis de calidad");
        activityPanel.add(label23, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB12 = new JCheckBox();
        checkB12.setName("checkB12");
        checkB12.setText("");
        activityPanel.add(checkB12, new GridConstraints(12, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label24 = new JLabel();
        label24.setText("Estudio geotécnico");
        activityPanel.add(label24, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB13 = new JCheckBox();
        checkB13.setName("checkB13");
        checkB13.setText("");
        activityPanel.add(checkB13, new GridConstraints(13, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label25 = new JLabel();
        label25.setText("Estudio Hidrológico");
        activityPanel.add(label25, new GridConstraints(14, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB14 = new JCheckBox();
        checkB14.setName("checkB14");
        checkB14.setText("");
        activityPanel.add(checkB14, new GridConstraints(14, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label26 = new JLabel();
        label26.setText("Estudio Hidrogeológico");
        activityPanel.add(label26, new GridConstraints(15, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB15 = new JCheckBox();
        checkB15.setName("checkB15");
        checkB15.setText("");
        activityPanel.add(checkB15, new GridConstraints(15, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label27 = new JLabel();
        label27.setText("Evaluación del modelo geológico");
        activityPanel.add(label27, new GridConstraints(16, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB16 = new JCheckBox();
        checkB16.setName("checkB16");
        checkB16.setText("");
        activityPanel.add(checkB16, new GridConstraints(16, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label28 = new JLabel();
        label28.setText("Actividades exploratorias adicionales (Se describe en el anexo Tecnico que se allegue)\t");
        activityPanel.add(label28, new GridConstraints(17, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkB17 = new JCheckBox();
        checkB17.setName("checkB17");
        checkB17.setText("");
        activityPanel.add(checkB17, new GridConstraints(17, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label29 = new JLabel();
        Font label29Font = this.$$$getFont$$$(null, Font.BOLD, -1, label29.getFont());
        if (label29Font != null) label29.setFont(label29Font);
        label29.setText("Aspectos Ambientales Etapa de Exploración");
        activityPanel.add(label29, new GridConstraints(18, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label30 = new JLabel();
        label30.setText("Selección optima de Sitios de Campamentos y Helipuertos");
        activityPanel.add(label30, new GridConstraints(19, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC1 = new JCheckBox();
        checkC1.setName("checkC1");
        checkC1.setText("");
        activityPanel.add(checkC1, new GridConstraints(19, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label31 = new JLabel();
        label31.setText("Manejo de Aguas Lluvias");
        activityPanel.add(label31, new GridConstraints(20, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC2 = new JCheckBox();
        checkC2.setName("checkC2");
        checkC2.setText("");
        activityPanel.add(checkC2, new GridConstraints(20, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label32 = new JLabel();
        label32.setText("Manejo de Aguas Residuales Domesticas");
        activityPanel.add(label32, new GridConstraints(21, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC3 = new JCheckBox();
        checkC3.setName("checkC3");
        checkC3.setText("");
        activityPanel.add(checkC3, new GridConstraints(21, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label33 = new JLabel();
        label33.setText("Manejo de Cuerpos de Agua");
        activityPanel.add(label33, new GridConstraints(22, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC4 = new JCheckBox();
        checkC4.setName("checkC4");
        checkC4.setText("");
        activityPanel.add(checkC4, new GridConstraints(22, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label34 = new JLabel();
        label34.setText("Manejo de Material Particulado y Gases");
        activityPanel.add(label34, new GridConstraints(23, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC5 = new JCheckBox();
        checkC5.setName("checkC5");
        checkC5.setText("");
        activityPanel.add(checkC5, new GridConstraints(23, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label35 = new JLabel();
        label35.setText("Manejo del Ruido");
        activityPanel.add(label35, new GridConstraints(24, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC6 = new JCheckBox();
        checkC6.setName("checkC6");
        checkC6.setText("");
        activityPanel.add(checkC6, new GridConstraints(24, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label36 = new JLabel();
        label36.setText("Manejo de Combustibles");
        activityPanel.add(label36, new GridConstraints(25, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC7 = new JCheckBox();
        checkC7.setName("checkC7");
        checkC7.setText("");
        activityPanel.add(checkC7, new GridConstraints(25, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label37 = new JLabel();
        label37.setText("Manejo de Taludes");
        activityPanel.add(label37, new GridConstraints(26, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC8 = new JCheckBox();
        checkC8.setName("checkC8");
        checkC8.setText("");
        activityPanel.add(checkC8, new GridConstraints(26, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label38 = new JLabel();
        label38.setText("Manejo de Accesos");
        activityPanel.add(label38, new GridConstraints(27, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC9 = new JCheckBox();
        checkC9.setName("checkC9");
        checkC9.setText("");
        activityPanel.add(checkC9, new GridConstraints(27, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label39 = new JLabel();
        label39.setText("Manejo de Residuos Solidos");
        activityPanel.add(label39, new GridConstraints(28, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC10 = new JCheckBox();
        checkC10.setName("checkC10");
        checkC10.setText("");
        activityPanel.add(checkC10, new GridConstraints(28, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label40 = new JLabel();
        label40.setText("Adecuación y Recuperación de Sitios de Uso Temporal");
        activityPanel.add(label40, new GridConstraints(29, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC11 = new JCheckBox();
        checkC11.setName("checkC11");
        checkC11.setText("");
        activityPanel.add(checkC11, new GridConstraints(29, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label41 = new JLabel();
        label41.setText("Manejo de Fauna y Flora");
        activityPanel.add(label41, new GridConstraints(30, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC12 = new JCheckBox();
        checkC12.setName("checkC12");
        checkC12.setText("");
        activityPanel.add(checkC12, new GridConstraints(30, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label42 = new JLabel();
        label42.setText("Plan de Gestión Social");
        activityPanel.add(label42, new GridConstraints(31, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC13 = new JCheckBox();
        checkC13.setName("checkC13");
        checkC13.setText("");
        activityPanel.add(checkC13, new GridConstraints(31, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label43 = new JLabel();
        label43.setText("capacitación de Personal");
        activityPanel.add(label43, new GridConstraints(32, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC14 = new JCheckBox();
        checkC14.setName("checkC14");
        checkC14.setText("");
        activityPanel.add(checkC14, new GridConstraints(32, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label44 = new JLabel();
        label44.setText("Contratación de Mano de Obra no Calificada");
        activityPanel.add(label44, new GridConstraints(33, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC15 = new JCheckBox();
        checkC15.setName("checkC15");
        checkC15.setText("");
        activityPanel.add(checkC15, new GridConstraints(33, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label45 = new JLabel();
        label45.setText("Rescate Arqueológico");
        activityPanel.add(label45, new GridConstraints(34, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC16 = new JCheckBox();
        checkC16.setName("checkC16");
        checkC16.setText("");
        activityPanel.add(checkC16, new GridConstraints(34, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label46 = new JLabel();
        label46.setText("Manejo de Hundimientos");
        activityPanel.add(label46, new GridConstraints(35, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        checkC17 = new JCheckBox();
        checkC17.setName("checkC17");
        checkC17.setText("");
        activityPanel.add(checkC17, new GridConstraints(35, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        txtActA2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel6 = new DefaultComboBoxModel();
        defaultComboBoxModel6.addElement("");
        defaultComboBoxModel6.addElement("1");
        defaultComboBoxModel6.addElement("2");
        defaultComboBoxModel6.addElement("3");
        txtActA2.setModel(defaultComboBoxModel6);
        txtActA2.setName("txtActA2");
        activityPanel.add(txtActA2, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA3 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel7 = new DefaultComboBoxModel();
        defaultComboBoxModel7.addElement("");
        defaultComboBoxModel7.addElement("1");
        defaultComboBoxModel7.addElement("2");
        defaultComboBoxModel7.addElement("3");
        txtActA3.setModel(defaultComboBoxModel7);
        txtActA3.setName("txtActA4");
        activityPanel.add(txtActA3, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA4 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel8 = new DefaultComboBoxModel();
        defaultComboBoxModel8.addElement("");
        defaultComboBoxModel8.addElement("1");
        defaultComboBoxModel8.addElement("2");
        defaultComboBoxModel8.addElement("3");
        txtActA4.setModel(defaultComboBoxModel8);
        activityPanel.add(txtActA4, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA5 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel9 = new DefaultComboBoxModel();
        defaultComboBoxModel9.addElement("");
        defaultComboBoxModel9.addElement("1");
        defaultComboBoxModel9.addElement("2");
        defaultComboBoxModel9.addElement("3");
        txtActA5.setModel(defaultComboBoxModel9);
        txtActA5.setName("txtActA5");
        activityPanel.add(txtActA5, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA6 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel10 = new DefaultComboBoxModel();
        defaultComboBoxModel10.addElement("");
        defaultComboBoxModel10.addElement("1");
        defaultComboBoxModel10.addElement("2");
        defaultComboBoxModel10.addElement("3");
        txtActA6.setModel(defaultComboBoxModel10);
        txtActA6.setName("txtActA6");
        activityPanel.add(txtActA6, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA7 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel11 = new DefaultComboBoxModel();
        defaultComboBoxModel11.addElement("");
        defaultComboBoxModel11.addElement("1");
        defaultComboBoxModel11.addElement("2");
        defaultComboBoxModel11.addElement("3");
        txtActA7.setModel(defaultComboBoxModel11);
        txtActA7.setName("txtActA7");
        activityPanel.add(txtActA7, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA8 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel12 = new DefaultComboBoxModel();
        defaultComboBoxModel12.addElement("");
        defaultComboBoxModel12.addElement("1");
        defaultComboBoxModel12.addElement("2");
        defaultComboBoxModel12.addElement("3");
        txtActA8.setModel(defaultComboBoxModel12);
        txtActA8.setName("txtActA8");
        activityPanel.add(txtActA8, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA9 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel13 = new DefaultComboBoxModel();
        defaultComboBoxModel13.addElement("");
        defaultComboBoxModel13.addElement("1");
        defaultComboBoxModel13.addElement("2");
        defaultComboBoxModel13.addElement("3");
        txtActA9.setModel(defaultComboBoxModel13);
        txtActA9.setName("txtActA9");
        activityPanel.add(txtActA9, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA10 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel14 = new DefaultComboBoxModel();
        defaultComboBoxModel14.addElement("");
        defaultComboBoxModel14.addElement("1");
        defaultComboBoxModel14.addElement("2");
        defaultComboBoxModel14.addElement("3");
        txtActA10.setModel(defaultComboBoxModel14);
        txtActA10.setName("txtActA10");
        activityPanel.add(txtActA10, new GridConstraints(10, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA11 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel15 = new DefaultComboBoxModel();
        defaultComboBoxModel15.addElement("");
        defaultComboBoxModel15.addElement("1");
        defaultComboBoxModel15.addElement("2");
        defaultComboBoxModel15.addElement("3");
        txtActA11.setModel(defaultComboBoxModel15);
        txtActA11.setName("txtActA11");
        activityPanel.add(txtActA11, new GridConstraints(11, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA12 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel16 = new DefaultComboBoxModel();
        defaultComboBoxModel16.addElement("");
        defaultComboBoxModel16.addElement("1");
        defaultComboBoxModel16.addElement("2");
        defaultComboBoxModel16.addElement("3");
        txtActA12.setModel(defaultComboBoxModel16);
        txtActA12.setName("txtActA12");
        activityPanel.add(txtActA12, new GridConstraints(12, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA13 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel17 = new DefaultComboBoxModel();
        defaultComboBoxModel17.addElement("");
        defaultComboBoxModel17.addElement("1");
        defaultComboBoxModel17.addElement("2");
        defaultComboBoxModel17.addElement("3");
        txtActA13.setModel(defaultComboBoxModel17);
        txtActA13.setName("txtActA13");
        activityPanel.add(txtActA13, new GridConstraints(13, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA14 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel18 = new DefaultComboBoxModel();
        defaultComboBoxModel18.addElement("");
        defaultComboBoxModel18.addElement("1");
        defaultComboBoxModel18.addElement("2");
        defaultComboBoxModel18.addElement("3");
        txtActA14.setModel(defaultComboBoxModel18);
        txtActA14.setName("txtActA14");
        activityPanel.add(txtActA14, new GridConstraints(14, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA15 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel19 = new DefaultComboBoxModel();
        defaultComboBoxModel19.addElement("");
        defaultComboBoxModel19.addElement("1");
        defaultComboBoxModel19.addElement("2");
        defaultComboBoxModel19.addElement("3");
        txtActA15.setModel(defaultComboBoxModel19);
        txtActA15.setName("txtActA15");
        activityPanel.add(txtActA15, new GridConstraints(15, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA16 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel20 = new DefaultComboBoxModel();
        defaultComboBoxModel20.addElement("");
        defaultComboBoxModel20.addElement("1");
        defaultComboBoxModel20.addElement("2");
        defaultComboBoxModel20.addElement("3");
        txtActA16.setModel(defaultComboBoxModel20);
        txtActA16.setName("txtActA16");
        activityPanel.add(txtActA16, new GridConstraints(16, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActA17 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel21 = new DefaultComboBoxModel();
        defaultComboBoxModel21.addElement("");
        defaultComboBoxModel21.addElement("1");
        defaultComboBoxModel21.addElement("2");
        defaultComboBoxModel21.addElement("3");
        txtActA17.setModel(defaultComboBoxModel21);
        txtActA17.setName("txtActA17");
        activityPanel.add(txtActA17, new GridConstraints(17, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel22 = new DefaultComboBoxModel();
        defaultComboBoxModel22.addElement("");
        defaultComboBoxModel22.addElement("1");
        defaultComboBoxModel22.addElement("2");
        defaultComboBoxModel22.addElement("3");
        txtActB1.setModel(defaultComboBoxModel22);
        txtActB1.setName("txtActB1");
        activityPanel.add(txtActB1, new GridConstraints(19, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel23 = new DefaultComboBoxModel();
        defaultComboBoxModel23.addElement("");
        defaultComboBoxModel23.addElement("1");
        defaultComboBoxModel23.addElement("2");
        defaultComboBoxModel23.addElement("3");
        txtActB2.setModel(defaultComboBoxModel23);
        txtActB2.setName("txtActB2");
        activityPanel.add(txtActB2, new GridConstraints(20, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB3 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel24 = new DefaultComboBoxModel();
        defaultComboBoxModel24.addElement("");
        defaultComboBoxModel24.addElement("1");
        defaultComboBoxModel24.addElement("2");
        defaultComboBoxModel24.addElement("3");
        txtActB3.setModel(defaultComboBoxModel24);
        txtActB3.setName("txtActB3");
        activityPanel.add(txtActB3, new GridConstraints(21, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB4 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel25 = new DefaultComboBoxModel();
        defaultComboBoxModel25.addElement("");
        defaultComboBoxModel25.addElement("1");
        defaultComboBoxModel25.addElement("2");
        defaultComboBoxModel25.addElement("3");
        txtActB4.setModel(defaultComboBoxModel25);
        txtActB4.setName("txtActB4");
        activityPanel.add(txtActB4, new GridConstraints(22, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB5 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel26 = new DefaultComboBoxModel();
        defaultComboBoxModel26.addElement("");
        defaultComboBoxModel26.addElement("1");
        defaultComboBoxModel26.addElement("2");
        defaultComboBoxModel26.addElement("3");
        txtActB5.setModel(defaultComboBoxModel26);
        txtActB5.setName("txtActB5");
        activityPanel.add(txtActB5, new GridConstraints(23, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB6 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel27 = new DefaultComboBoxModel();
        defaultComboBoxModel27.addElement("");
        defaultComboBoxModel27.addElement("1");
        defaultComboBoxModel27.addElement("2");
        defaultComboBoxModel27.addElement("3");
        txtActB6.setModel(defaultComboBoxModel27);
        txtActB6.setName("txtActB6");
        activityPanel.add(txtActB6, new GridConstraints(24, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB8 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel28 = new DefaultComboBoxModel();
        defaultComboBoxModel28.addElement("");
        defaultComboBoxModel28.addElement("1");
        defaultComboBoxModel28.addElement("2");
        defaultComboBoxModel28.addElement("3");
        txtActB8.setModel(defaultComboBoxModel28);
        txtActB8.setName("txtActB8");
        activityPanel.add(txtActB8, new GridConstraints(26, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB9 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel29 = new DefaultComboBoxModel();
        defaultComboBoxModel29.addElement("");
        defaultComboBoxModel29.addElement("1");
        defaultComboBoxModel29.addElement("2");
        defaultComboBoxModel29.addElement("3");
        txtActB9.setModel(defaultComboBoxModel29);
        txtActB9.setName("txtActB9");
        activityPanel.add(txtActB9, new GridConstraints(27, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB10 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel30 = new DefaultComboBoxModel();
        defaultComboBoxModel30.addElement("");
        defaultComboBoxModel30.addElement("1");
        defaultComboBoxModel30.addElement("2");
        defaultComboBoxModel30.addElement("3");
        txtActB10.setModel(defaultComboBoxModel30);
        txtActB10.setName("txtActB10");
        activityPanel.add(txtActB10, new GridConstraints(28, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB11 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel31 = new DefaultComboBoxModel();
        defaultComboBoxModel31.addElement("");
        defaultComboBoxModel31.addElement("1");
        defaultComboBoxModel31.addElement("2");
        defaultComboBoxModel31.addElement("3");
        txtActB11.setModel(defaultComboBoxModel31);
        txtActB11.setName("txtActB11");
        activityPanel.add(txtActB11, new GridConstraints(29, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB12 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel32 = new DefaultComboBoxModel();
        defaultComboBoxModel32.addElement("");
        defaultComboBoxModel32.addElement("1");
        defaultComboBoxModel32.addElement("2");
        defaultComboBoxModel32.addElement("3");
        txtActB12.setModel(defaultComboBoxModel32);
        txtActB12.setName("txtActB12");
        activityPanel.add(txtActB12, new GridConstraints(30, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB13 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel33 = new DefaultComboBoxModel();
        defaultComboBoxModel33.addElement("");
        defaultComboBoxModel33.addElement("1");
        defaultComboBoxModel33.addElement("2");
        defaultComboBoxModel33.addElement("3");
        txtActB13.setModel(defaultComboBoxModel33);
        txtActB13.setName("txtActB13");
        activityPanel.add(txtActB13, new GridConstraints(31, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB14 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel34 = new DefaultComboBoxModel();
        defaultComboBoxModel34.addElement("");
        defaultComboBoxModel34.addElement("1");
        defaultComboBoxModel34.addElement("2");
        defaultComboBoxModel34.addElement("3");
        txtActB14.setModel(defaultComboBoxModel34);
        txtActB14.setName("txtActB14");
        activityPanel.add(txtActB14, new GridConstraints(32, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB15 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel35 = new DefaultComboBoxModel();
        defaultComboBoxModel35.addElement("");
        defaultComboBoxModel35.addElement("1");
        defaultComboBoxModel35.addElement("2");
        defaultComboBoxModel35.addElement("3");
        txtActB15.setModel(defaultComboBoxModel35);
        txtActB15.setName("txtActB15");
        activityPanel.add(txtActB15, new GridConstraints(33, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB16 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel36 = new DefaultComboBoxModel();
        defaultComboBoxModel36.addElement("");
        defaultComboBoxModel36.addElement("1");
        defaultComboBoxModel36.addElement("2");
        defaultComboBoxModel36.addElement("3");
        txtActB16.setModel(defaultComboBoxModel36);
        txtActB16.setName("txtActB16");
        activityPanel.add(txtActB16, new GridConstraints(34, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB17 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel37 = new DefaultComboBoxModel();
        defaultComboBoxModel37.addElement("");
        defaultComboBoxModel37.addElement("1");
        defaultComboBoxModel37.addElement("2");
        defaultComboBoxModel37.addElement("3");
        txtActB17.setModel(defaultComboBoxModel37);
        txtActB17.setName("txtActB17");
        activityPanel.add(txtActB17, new GridConstraints(35, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        txtActB7 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel38 = new DefaultComboBoxModel();
        defaultComboBoxModel38.addElement("");
        defaultComboBoxModel38.addElement("1");
        defaultComboBoxModel38.addElement("2");
        defaultComboBoxModel38.addElement("3");
        txtActB7.setModel(defaultComboBoxModel38);
        txtActB7.setName("txtActB7");
        activityPanel.add(txtActB7, new GridConstraints(25, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        economicPanel = new JPanel();
        economicPanel.setLayout(new GridLayoutManager(10, 4, new Insets(0, 0, 0, 0), -1, -1));
        economicPanel.setName("economicPanel");
        tabbedPane1.addTab("Información económica", economicPanel);
        final JLabel label47 = new JLabel();
        Font label47Font = this.$$$getFont$$$(null, Font.BOLD, -1, label47.getFont());
        if (label47Font != null) label47.setFont(label47Font);
        label47.setText("Costos de la Operación");
        economicPanel.add(label47, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label48 = new JLabel();
        label48.setText("Costos de exploración adicional");
        economicPanel.add(label48, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label49 = new JLabel();
        label49.setText("Inversión en maquinaria y equipo");
        economicPanel.add(label49, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label50 = new JLabel();
        label50.setText("Costos de mano de obra directa");
        economicPanel.add(label50, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label51 = new JLabel();
        label51.setText("Costos de mano de obra indirecta");
        economicPanel.add(label51, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label52 = new JLabel();
        label52.setText("Costos ambientales");
        economicPanel.add(label52, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label53 = new JLabel();
        label53.setText("Honorarios administrativos");
        economicPanel.add(label53, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label54 = new JLabel();
        Font label54Font = this.$$$getFont$$$(null, Font.BOLD, -1, label54.getFont());
        if (label54Font != null) label54.setFont(label54Font);
        label54.setText("Ingresos de la Operación");
        economicPanel.add(label54, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label55 = new JLabel();
        label55.setText("Ingresos brutos");
        economicPanel.add(label55, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label56 = new JLabel();
        label56.setText("Costos de seguridad y salud en el trabajo");
        economicPanel.add(label56, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        year1InptId0 = new JTextField();
        year1InptId0.setName("year1InptId0");
        economicPanel.add(year1InptId0, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year1InptId1 = new JTextField();
        year1InptId1.setName("year1InptId1");
        economicPanel.add(year1InptId1, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year1InptId2 = new JTextField();
        year1InptId2.setName("year1InptId2");
        economicPanel.add(year1InptId2, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year1InptId3 = new JTextField();
        year1InptId3.setName("year1InptId3");
        economicPanel.add(year1InptId3, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year1InptId4 = new JTextField();
        year1InptId4.setName("year1InptId4");
        economicPanel.add(year1InptId4, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year1InptId5 = new JTextField();
        year1InptId5.setName("year1InptId5");
        economicPanel.add(year1InptId5, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year1InptId6 = new JTextField();
        year1InptId6.setName("year1InptId6");
        economicPanel.add(year1InptId6, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        operationIncomeYear1InptId = new JTextField();
        economicPanel.add(operationIncomeYear1InptId, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year2InptId0 = new JTextField();
        year2InptId0.setName("year2InptId0");
        economicPanel.add(year2InptId0, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year3InptId0 = new JTextField();
        year3InptId0.setName("year3InptId0");
        economicPanel.add(year3InptId0, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year2InptId1 = new JTextField();
        year2InptId1.setName("year2InptId1");
        economicPanel.add(year2InptId1, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year2InptId2 = new JTextField();
        year2InptId2.setName("year2InptId2");
        economicPanel.add(year2InptId2, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year2InptId3 = new JTextField();
        year2InptId3.setName("year2InptId3");
        economicPanel.add(year2InptId3, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year2InptId4 = new JTextField();
        year2InptId4.setName("year2InptId4");
        economicPanel.add(year2InptId4, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year2InptId5 = new JTextField();
        year2InptId5.setName("year2InptId5");
        economicPanel.add(year2InptId5, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year2InptId6 = new JTextField();
        year2InptId6.setName("year2InptId6");
        economicPanel.add(year2InptId6, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year3InptId1 = new JTextField();
        year3InptId1.setName("year3InptId1");
        economicPanel.add(year3InptId1, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year3InptId2 = new JTextField();
        year3InptId2.setName("year3InptId2");
        economicPanel.add(year3InptId2, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year3InptId3 = new JTextField();
        year3InptId3.setName("year3InptId3");
        economicPanel.add(year3InptId3, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year3InptId4 = new JTextField();
        year3InptId4.setName("year3InptId4");
        economicPanel.add(year3InptId4, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year3InptId5 = new JTextField();
        year3InptId5.setName("year3InptId5");
        economicPanel.add(year3InptId5, new GridConstraints(6, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        year3InptId6 = new JTextField();
        year3InptId6.setName("year3InptId6");
        economicPanel.add(year3InptId6, new GridConstraints(7, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        operationIncomeYear3InptId = new JTextField();
        economicPanel.add(operationIncomeYear3InptId, new GridConstraints(9, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        operationIncomeYear2InptId = new JTextField();
        economicPanel.add(operationIncomeYear2InptId, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(7, 1, new Insets(0, 0, 0, 0), -1, -1));
        rootPanel.add(panel2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        paso1Button = new JButton();
        paso1Button.setText("Paso 1");
        panel2.add(paso1Button, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paso2Button = new JButton();
        paso2Button.setText("Paso 2");
        panel2.add(paso2Button, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paso3Button = new JButton();
        paso3Button.setText("Paso 3");
        panel2.add(paso3Button, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paso4Button = new JButton();
        paso4Button.setText("Paso 4");
        panel2.add(paso4Button, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        loginButton = new JButton();
        loginButton.setText("Login");
        panel2.add(loginButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        guardarButton = new JButton();
        guardarButton.setText("Guardar");
        panel2.add(guardarButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ejecutarButton = new JButton();
        ejecutarButton.setText("Ejecutar");
        panel2.add(ejecutarButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
