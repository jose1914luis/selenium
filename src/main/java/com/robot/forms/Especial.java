package main.java.com.robot.forms;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import main.java.com.robot.RobotSolicitud;
import main.java.com.robot.services.AnmPropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

@Component
public class Especial {
    private JButton btnLogin;
    private JTextField mineral;
    private JPanel rootPanel;
    private JButton btnEjecutar;
    private JTextField applicantCoordinateEastingTxtId0;
    private JTextField applicantCoordinateEastingTxtId1;
    private JTextField applicantCoordinateNorthingTxtId0;
    private JTextField applicantCoordinateNorthingTxtId1;
    private JTextField file0;
    private JButton btnSeleccionar1;
    private JTextField fileDescripcionCua;
    private JTextField fileDescripcionGen;
    private JTextField file1;
    private JTextField fileMedios;
    private JButton btnSelccionar2;
    private JButton btnSelccionar3;
    private JButton btnSelccionar4;
    private JButton btnSelccionar5;
    private JButton guardarButton;
    private JTextArea textArea;
    private AnmPropertiesService anmPropertiesService;

    @Autowired
    public Especial(RobotSolicitud robotSolicitud, AnmPropertiesService anmPropertiesService) {

        this.anmPropertiesService = anmPropertiesService;
        createUIComponents();

        btnLogin.addActionListener(e -> {
                    try {
                        robotSolicitud.executeANMLogin();
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
        );

        btnEjecutar.addActionListener(e -> {
                    try {
                        robotSolicitud.radicarSolicitudEspecial();
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
        );

        btnSeleccionar1.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file0.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });


        btnSelccionar4.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file1.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        btnSelccionar2.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                fileDescripcionCua.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        btnSelccionar3.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                fileDescripcionGen.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });


        btnSelccionar5.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                fileMedios.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        guardarButton.addActionListener(actionEvent -> {

            try {
                guardaPropiedades();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private void guardaPropiedades() throws IOException {

        anmPropertiesService.setProperty("file1", file1.getText());
        anmPropertiesService.setProperty("file0", file0.getText());
        anmPropertiesService.setProperty("fileDescripcionCua", fileDescripcionCua.getText());
        anmPropertiesService.setProperty("fileMedios", fileMedios.getText());
        anmPropertiesService.setProperty("fileDescripcionGen", fileDescripcionGen.getText());
        anmPropertiesService.setProperty("0applicantCoordinateEastingTxtId", applicantCoordinateEastingTxtId0.getText());
        anmPropertiesService.setProperty("1applicantCoordinateEastingTxtId", applicantCoordinateEastingTxtId1.getText());
        anmPropertiesService.setProperty("0applicantCoordinateNorthingTxtId", applicantCoordinateNorthingTxtId0.getText());
        anmPropertiesService.setProperty("1applicantCoordinateNorthingTxtId", applicantCoordinateNorthingTxtId1.getText());
        anmPropertiesService.setProperty("mineral", mineral.getText());
        anmPropertiesService.setProperty("cells", textArea.getText());

        anmPropertiesService.saveProperties();
    }

    private void createUIComponents() {

        file1.setText(anmPropertiesService.getProperty("file1"));
        file0.setText(anmPropertiesService.getProperty("file0"));
        fileDescripcionCua.setText(anmPropertiesService.getProperty("fileDescripcionCua"));
        fileMedios.setText(anmPropertiesService.getProperty("fileMedios"));
        fileDescripcionGen.setText(anmPropertiesService.getProperty("fileDescripcionGen"));

        applicantCoordinateEastingTxtId0.setText(anmPropertiesService.getProperty("0applicantCoordinateEastingTxtId"));
        applicantCoordinateEastingTxtId1.setText(anmPropertiesService.getProperty("1applicantCoordinateEastingTxtId"));
        applicantCoordinateNorthingTxtId0.setText(anmPropertiesService.getProperty("0applicantCoordinateNorthingTxtId"));
        applicantCoordinateNorthingTxtId1.setText(anmPropertiesService.getProperty("1applicantCoordinateNorthingTxtId"));

        mineral.setText(anmPropertiesService.getProperty("mineral"));
        textArea.setText(anmPropertiesService.getProperty("cells"));
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
        rootPanel.setLayout(new GridLayoutManager(11, 4, new Insets(0, 0, 0, 0), -1, -1));
        final JLabel label1 = new JLabel();
        label1.setText("Mineral");
        rootPanel.add(label1, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mineral = new JTextField();
        rootPanel.add(mineral, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        btnEjecutar = new JButton();
        btnEjecutar.setText("Ejecutar");
        rootPanel.add(btnEjecutar, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnLogin = new JButton();
        btnLogin.setText("Login");
        rootPanel.add(btnLogin, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Longitud");
        rootPanel.add(label2, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        applicantCoordinateEastingTxtId0 = new JTextField();
        applicantCoordinateEastingTxtId0.setText("");
        rootPanel.add(applicantCoordinateEastingTxtId0, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Latitud");
        rootPanel.add(label3, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        applicantCoordinateNorthingTxtId0 = new JTextField();
        rootPanel.add(applicantCoordinateNorthingTxtId0, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("Longitud");
        rootPanel.add(label4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        applicantCoordinateEastingTxtId1 = new JTextField();
        rootPanel.add(applicantCoordinateEastingTxtId1, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        applicantCoordinateNorthingTxtId1 = new JTextField();
        rootPanel.add(applicantCoordinateNorthingTxtId1, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Latitud");
        rootPanel.add(label5, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Certificado de existencia y representación legal");
        rootPanel.add(label6, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        file0 = new JTextField();
        rootPanel.add(file0, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        btnSeleccionar1 = new JButton();
        btnSeleccionar1.setText("Seleccionar");
        rootPanel.add(btnSeleccionar1, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setText("Descripcion y cuantificacion frente de explotacion ");
        rootPanel.add(label7, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setText("Descripción general de la infraestructura");
        rootPanel.add(label8, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label9 = new JLabel();
        label9.setText("Fotococopia documento de identificacion");
        rootPanel.add(label9, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        label10.setText("Medios de prueba ");
        rootPanel.add(label10, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        fileDescripcionCua = new JTextField();
        rootPanel.add(fileDescripcionCua, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        fileDescripcionGen = new JTextField();
        rootPanel.add(fileDescripcionGen, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file1 = new JTextField();
        rootPanel.add(file1, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        fileMedios = new JTextField();
        rootPanel.add(fileMedios, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        btnSelccionar2 = new JButton();
        btnSelccionar2.setText("Seleccionar");
        rootPanel.add(btnSelccionar2, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnSelccionar3 = new JButton();
        btnSelccionar3.setText("Seleccionar");
        rootPanel.add(btnSelccionar3, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnSelccionar4 = new JButton();
        btnSelccionar4.setText("Seleccionar");
        rootPanel.add(btnSelccionar4, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnSelccionar5 = new JButton();
        btnSelccionar5.setText("Seleccionar");
        rootPanel.add(btnSelccionar5, new GridConstraints(10, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        guardarButton = new JButton();
        guardarButton.setText("Guardar");
        rootPanel.add(guardarButton, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        label11.setText("Celdas");
        rootPanel.add(label11, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textArea = new JTextArea();
        rootPanel.add(textArea, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_NORTH, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 50), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }

}
