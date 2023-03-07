import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import static javax.swing.JOptionPane.showMessageDialog;

public class ConfigurationForm {
    private JTextField url;
    private JTextField password;
    private JTextField pinSlctId;
    private JTextField cambiarUsuario;
    private JTextField username;
    private JTextField webdriver;
    private JLabel Webdriver;
    private Properties props;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public ConfigurationForm(Properties props) {

        this.props = props;
        createUIComponents(props);
        guardarButton.addActionListener(e -> saveData());
    }

    private void saveData(){
        try {
            FileOutputStream out = new FileOutputStream("anm.properties");
            props.setProperty("webdriver", webdriver.getText());
            props.setProperty("url", url.getText());
            props.setProperty("cambiarUsuario", cambiarUsuario.getText());
            props.setProperty("username", username.getText());
            props.setProperty("password", password.getText());
            props.setProperty("pinSlctId", pinSlctId.getText());
            props.store(out, null);
            out.close();
            showMessageDialog(null, "Datos guardados correctamente");
        }catch (IOException e){
            e.printStackTrace();
            showMessageDialog(null, "Error guardando los datos");
        }
    }
    private void createUIComponents(Properties props) {

        guardarButton.setIcon(new ImageIcon("Resources/Actions-document-save-icon.png"));

        //setting properties
        webdriver.setText(props.getProperty("webdriver"));
        cambiarUsuario.setText(props.getProperty("cambiarUsuario"));
        url.setText(props.getProperty("url"));
        username.setText(props.getProperty("username"));
        password.setText(props.getProperty("password"));
        pinSlctId.setText(props.getProperty("pinSlctId"));
    }

    private JPanel rootPanel;
    private JButton guardarButton;
}
