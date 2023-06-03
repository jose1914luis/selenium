import javax.swing.*;
import java.util.Arrays;
import java.util.Properties;

public class Util {


    static public void setComponentsValue(Properties props, JPanel panel, String value, Constans.componentType type) {
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
                        case JCHECKBOX:
                            ((JCheckBox) component).setSelected(Boolean.parseBoolean(props.getProperty(value)));
                        default:
                            break;
                    }
                });
    }
    static public void setPropsValue(Properties props, JPanel panel, String value, Constans.componentType type) {
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
