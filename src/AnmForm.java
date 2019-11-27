import javax.swing.*;
import java.util.Properties;

public class AnmForm {
    protected JTextField username;
    protected JTextField password;
    protected JPanel rootPanel;
    private JTextField pinSlctId;
    private JTextField mineral;
    private JTextField areaOfConcessionSlctId;
    private JTextField selectedCellInputMethodSlctId;
    private JTextField selectTypeMap;
    private JTextField pikerLoad;
    private JComboBox comboBox1;
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
    private JComboBox envYearOfExecutionId0;
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
    private JComboBox laborSuitabilityId3;
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
    private JComboBox envYearOfDeliveryId3;
    private JComboBox envYearOfDeliveryId4;
    private JComboBox envLaborSuitabilityId1;
    private JComboBox envLaborSuitabilityId2;
    private JComboBox envLaborSuitabilityId3;
    private JComboBox envLaborSuitabilityId4;
    private JComboBox comboBox2;
    private JTextField textField7;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JComboBox comboBox3;

    public AnmForm(Properties props) {
        createUIComponents(props);
    }

    private void createUIComponents(Properties props) {
        // TODO: place custom component creation code here
        username.setText(props.getProperty("username"));
        password.setText(props.getProperty("password"));
        pinSlctId.setText(props.getProperty("pinSlctId"));
        mineral.setText(props.getProperty("mineral"));
        areaOfConcessionSlctId.setText(props.getProperty("areaOfConcessionSlctId"));
        selectedCellInputMethodSlctId.setText(props.getProperty("selectedCellInputMethodSlctId"));
        selectTypeMap.setText(props.getProperty("selectTypeMap"));
        pikerLoad.setText(props.getProperty("pikerLoad"));

        yearOfExecutionId0.addItem("1");
        yearOfExecutionId0.addItem("2");
        yearOfExecutionId0.addItem("3");
        yearOfExecutionId0.setSelectedItem(props.getProperty("yearOfExecutionId0"));

         yearOfExecutionId1.addItem("1");
         yearOfExecutionId2.addItem("1");
         yearOfExecutionId4.addItem("1");
         yearOfExecutionId5.addItem("1");
         yearOfExecutionId6.addItem("1");
         yearOfExecutionId7.addItem("1");
         yearOfExecutionId8.addItem("1");
         yearOfExecutionId9.addItem("1");
         yearOfExecutionId10.addItem("1");
         yearOfExecutionId11.addItem("1");
         yearOfExecutionId12.addItem("1");
         yearOfExecutionId13.addItem("1");
         yearOfExecutionId14.addItem("1");
         yearOfExecutionId15.addItem("1");
         yearOfExecutionId16.addItem("1");

        yearOfExecutionId1.addItem("2");
        yearOfExecutionId2.addItem("2");
        yearOfExecutionId4.addItem("2");
        yearOfExecutionId5.addItem("2");
        yearOfExecutionId6.addItem("2");
        yearOfExecutionId7.addItem("2");
        yearOfExecutionId8.addItem("2");
        yearOfExecutionId9.addItem("2");
        yearOfExecutionId10.addItem("2");
        yearOfExecutionId11.addItem("2");
        yearOfExecutionId12.addItem("2");
        yearOfExecutionId13.addItem("2");
        yearOfExecutionId14.addItem("2");
        yearOfExecutionId15.addItem("2");
        yearOfExecutionId16.addItem("2");

        yearOfExecutionId1.addItem("3");
        yearOfExecutionId2.addItem("3");
        yearOfExecutionId4.addItem("3");
        yearOfExecutionId5.addItem("3");
        yearOfExecutionId6.addItem("3");
        yearOfExecutionId7.addItem("3");
        yearOfExecutionId8.addItem("3");
        yearOfExecutionId9.addItem("3");
        yearOfExecutionId10.addItem("3");
        yearOfExecutionId11.addItem("3");
        yearOfExecutionId12.addItem("3");
        yearOfExecutionId13.addItem("3");
        yearOfExecutionId14.addItem("3");
        yearOfExecutionId15.addItem("3");
        yearOfExecutionId16.addItem("3");

        yearOfExecutionId1.setSelectedItem(props.getProperty("yearOfExecutionId1"));
        yearOfExecutionId2.setSelectedItem(props.getProperty("yearOfExecutionId2"));
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


        yearOfDeliveryId0.addItem("1");
        yearOfDeliveryId1.addItem("1");
        yearOfDeliveryId2.addItem("1");
        yearOfDeliveryId4.addItem("1");
        yearOfDeliveryId5.addItem("1");
        yearOfDeliveryId6.addItem("1");
        yearOfDeliveryId7.addItem("1");
        yearOfDeliveryId8.addItem("1");
        yearOfDeliveryId9.addItem("1");
        yearOfDeliveryId10.addItem("1");
        yearOfDeliveryId11.addItem("1");
        yearOfDeliveryId12.addItem("1");
        yearOfDeliveryId13.addItem("1");
        yearOfDeliveryId14.addItem("1");
        yearOfDeliveryId15.addItem("1");
        yearOfDeliveryId16.addItem("1");

        yearOfDeliveryId0.addItem("2");
        yearOfDeliveryId1.addItem("2");
        yearOfDeliveryId2.addItem("2");
        yearOfDeliveryId4.addItem("2");
        yearOfDeliveryId5.addItem("2");
        yearOfDeliveryId6.addItem("2");
        yearOfDeliveryId7.addItem("2");
        yearOfDeliveryId8.addItem("2");
        yearOfDeliveryId9.addItem("2");
        yearOfDeliveryId10.addItem("2");
        yearOfDeliveryId11.addItem("2");
        yearOfDeliveryId12.addItem("2");
        yearOfDeliveryId13.addItem("2");
        yearOfDeliveryId14.addItem("2");
        yearOfDeliveryId15.addItem("2");
        yearOfDeliveryId16.addItem("2");

        yearOfDeliveryId1.addItem("3");
        yearOfDeliveryId0.addItem("3");
        yearOfDeliveryId2.addItem("3");
        yearOfDeliveryId4.addItem("3");
        yearOfDeliveryId5.addItem("3");
        yearOfDeliveryId6.addItem("3");
        yearOfDeliveryId7.addItem("3");
        yearOfDeliveryId8.addItem("3");
        yearOfDeliveryId9.addItem("3");
        yearOfDeliveryId10.addItem("3");
        yearOfDeliveryId11.addItem("3");
        yearOfDeliveryId12.addItem("3");
        yearOfDeliveryId13.addItem("3");
        yearOfDeliveryId14.addItem("3");
        yearOfDeliveryId15.addItem("3");
        yearOfDeliveryId16.addItem("3");

        yearOfDeliveryId1.setSelectedItem(props.getProperty("yearOfDeliveryId1"));
        yearOfDeliveryId0.setSelectedItem(props.getProperty("yearOfDeliveryId0"));
        yearOfDeliveryId2.setSelectedItem(props.getProperty("yearOfDeliveryId2"));
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


        envYearOfExecutionId1.addItem("1");
        envYearOfExecutionId2.addItem("1");
        envYearOfExecutionId3.addItem("1");
        envYearOfExecutionId4.addItem("1");
        envYearOfExecutionId5.addItem("1");
        envYearOfExecutionId6.addItem("1");
        envYearOfExecutionId7.addItem("1");
        envYearOfExecutionId8.addItem("1");
        envYearOfExecutionId9.addItem("1");
        envYearOfExecutionId10.addItem("1");
        envYearOfExecutionId11.addItem("1");
        envYearOfExecutionId12.addItem("1");
        envYearOfExecutionId13.addItem("1");
        envYearOfExecutionId14.addItem("1");
        envYearOfExecutionId15.addItem("1");
        envYearOfExecutionId16.addItem("1");

        envYearOfExecutionId1.addItem("2");
        envYearOfExecutionId2.addItem("2");
        envYearOfExecutionId3.addItem("2");
        envYearOfExecutionId4.addItem("2");
        envYearOfExecutionId5.addItem("2");
        envYearOfExecutionId6.addItem("2");
        envYearOfExecutionId7.addItem("2");
        envYearOfExecutionId8.addItem("2");
        envYearOfExecutionId9.addItem("2");
        envYearOfExecutionId10.addItem("2");
        envYearOfExecutionId11.addItem("2");
        envYearOfExecutionId12.addItem("2");
        envYearOfExecutionId13.addItem("2");
        envYearOfExecutionId14.addItem("2");
        envYearOfExecutionId15.addItem("2");
        envYearOfExecutionId16.addItem("2");

        envYearOfExecutionId1.addItem("3");
        envYearOfExecutionId2.addItem("3");
        envYearOfExecutionId3.addItem("3");
        envYearOfExecutionId4.addItem("3");
        envYearOfExecutionId5.addItem("3");
        envYearOfExecutionId6.addItem("3");
        envYearOfExecutionId7.addItem("3");
        envYearOfExecutionId8.addItem("3");
        envYearOfExecutionId9.addItem("3");
        envYearOfExecutionId10.addItem("3");
        envYearOfExecutionId11.addItem("3");
        envYearOfExecutionId12.addItem("3");
        envYearOfExecutionId13.addItem("3");
        envYearOfExecutionId14.addItem("3");
        envYearOfExecutionId15.addItem("3");
        envYearOfExecutionId16.addItem("3");

        envYearOfExecutionId1.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId2.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId3.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId4.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId5.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId6.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId7.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId8.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId9.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId10.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId11.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId12.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId13.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId14.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId15.setSelectedItem(props.getProperty("envYearOfExecutionId16"));
        envYearOfExecutionId16.setSelectedItem(props.getProperty("envYearOfExecutionId16"));


        envYearOfDeliveryId0.addItem("1");
        envYearOfDeliveryId1.addItem("1");
        envYearOfDeliveryId2.addItem("1");
        envYearOfDeliveryId4.addItem("1");
        envYearOfDeliveryId5.addItem("1");
        envYearOfDeliveryId6.addItem("1");
        envYearOfDeliveryId7.addItem("1");
        envYearOfDeliveryId8.addItem("1");
        envYearOfDeliveryId9.addItem("1");
        envYearOfDeliveryId10.addItem("1");
        envYearOfDeliveryId11.addItem("1");
        envYearOfDeliveryId12.addItem("1");
        envYearOfDeliveryId13.addItem("1");
        envYearOfDeliveryId14.addItem("1");
        envYearOfDeliveryId15.addItem("1");
        envYearOfDeliveryId16.addItem("1");

        envYearOfDeliveryId0.addItem("2");
        envYearOfDeliveryId1.addItem("2");
        envYearOfDeliveryId2.addItem("2");
        envYearOfDeliveryId4.addItem("2");
        envYearOfDeliveryId5.addItem("2");
        envYearOfDeliveryId6.addItem("2");
        envYearOfDeliveryId7.addItem("2");
        envYearOfDeliveryId8.addItem("2");
        envYearOfDeliveryId9.addItem("2");
        envYearOfDeliveryId10.addItem("2");
        envYearOfDeliveryId11.addItem("2");
        envYearOfDeliveryId12.addItem("2");
        envYearOfDeliveryId13.addItem("2");
        envYearOfDeliveryId14.addItem("2");
        envYearOfDeliveryId15.addItem("2");
        envYearOfDeliveryId16.addItem("2");

        envYearOfDeliveryId1.addItem("3");
        envYearOfDeliveryId0.addItem("3");
        envYearOfDeliveryId2.addItem("3");
        envYearOfDeliveryId4.addItem("3");
        envYearOfDeliveryId5.addItem("3");
        envYearOfDeliveryId6.addItem("3");
        envYearOfDeliveryId7.addItem("3");
        envYearOfDeliveryId8.addItem("3");
        envYearOfDeliveryId9.addItem("3");
        envYearOfDeliveryId10.addItem("3");
        envYearOfDeliveryId11.addItem("3");
        envYearOfDeliveryId12.addItem("3");
        envYearOfDeliveryId13.addItem("3");
        envYearOfDeliveryId14.addItem("3");
        envYearOfDeliveryId15.addItem("3");
        envYearOfDeliveryId16.addItem("3");

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
    }
}
