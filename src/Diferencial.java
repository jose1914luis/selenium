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
    private RobotDiferencial robotDiferencial;

    public Diferencial(Properties props, ChromeDriver driver) {

        this.props = props;
        this.driver = driver;
        robotDiferencial = new RobotDiferencial(driver,props);

        createUIComponents();

        ejecutarButton.addActionListener(e -> {
            try {
                robotDiferencial.paso1();
                robotDiferencial.paso2();
                robotDiferencial.paso3();
                if (props.getProperty("earlyExploitationInd").toString().equals("NO")) {
                    robotDiferencial.paso4();
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
                robotDiferencial.paso1();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso2Button.addActionListener(e -> {
            try {
                robotDiferencial.paso2();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso3Button.addActionListener(e -> {
            try {
                robotDiferencial.paso3();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        paso4Button.addActionListener(e -> {
            try {
                robotDiferencial.paso4();
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


}
