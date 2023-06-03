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
}
