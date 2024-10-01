package main.java.com.robot.forms;

import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import main.java.com.robot.Constans;
import main.java.com.robot.RobotConcesion;
import main.java.com.robot.services.AnmPropertiesService;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.intellij.uiDesigner.core.GridConstraints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import static javax.swing.JOptionPane.showMessageDialog;

@Component
public class AnmForm {

    //region Form components
    public JButton loginButton;
    public JButton ejecutarButton;
    public JButton paso1Button;
    public JButton paso2Button;
    public JButton paso3Button;
    public JButton paso4Button;
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
    private JTextField currentAssetId0;
    private JTextField ecoApplicantNameId;
    private JTextField totalLiabilitiesId0;
    private JTextField totalAssetId0;
    private JTextField currentLiabilitiesId0;
    private JButton guardarButton;
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
    private JButton paso5Button;
    private JTextField file0;
    private JTextField file1;
    private JTextField file2;
    private JTextField file3;
    private JTextField file4;
    private JTextField file5;
    private JTextField file6;
    private JTextField file7;
    private JButton seleccionarButton;
    private JButton seleccionarButton1;
    private JButton seleccionarButton2;
    private JButton seleccionarButton3;
    private JButton seleccionarButton4;
    private JButton seleccionarButton5;
    private JButton seleccionarButton6;
    private JButton seleccionarButton7;
    private JButton agregarButton;
    private JScrollPane panelScroll;
    private JCheckBox secondSol;
    private JTextField currentAssetId1;
    private JTextField currentLiabilitiesId1;
    private JTextField totalAssetId1;
    private JTextField totalLiabilitiesId1;
    private JTextField applicantName;
    private JTextField applicantNameId;
    private JCheckBox declareIndId1;
    private JTextField file8;
    private JTextField file9;
    private JTextField file10;
    private JTextField file11;
    private JButton seleccionarButton8;
    private JButton seleccionarButton9;
    private JButton seleccionarButton10;
    private JButton seleccionarButton11;
    private JCheckBox declareIndId0;
    //endregion

    // Asumiendo que esto es parte de una clase que maneja la UI
    private ArrayList<JTextField> textFields = new ArrayList<>();
    private ArrayList<JComboBox> comboBoxs = new ArrayList<>();
    private AnmPropertiesService anmPropertiesService;

    @Autowired
    public AnmForm(AnmPropertiesService anmPropertiesService, RobotConcesion robotConcesion) {

        this.anmPropertiesService = anmPropertiesService;

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
                robotConcesion.stepFive();
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

        paso5Button.addActionListener(e -> {

            try {

                robotConcesion.stepFive();
            } catch (InterruptedException ex) {

                ex.printStackTrace();
            }

        });

        guardarButton.addActionListener(actionEvent -> {


            anmPropertiesService.setProperty("declareIndId0", Boolean.toString(declareIndId0.isSelected()));
            anmPropertiesService.setProperty("declareIndId1", Boolean.toString(declareIndId1.isSelected()));
            anmPropertiesService.setProperty("additionalEthnicGroupsInSelectedAreaIndId", additionalEthnicGroupsInSelectedAreaIndId.getSelectedItem().toString());

            for (int i = 0; i < 17; i++) {

                if (i < 15) {
                    anmPropertiesService.setPropsValue(configPanel, "timer" + (i + 1), Constans.componentType.JTEXTFIELD);
                }

                anmPropertiesService.setPropsValue(explorerPanel, Constans.YEAROFEXECUTIONID + i, Constans.componentType.JCOMBOBOX);
                anmPropertiesService.setPropsValue(explorerPanel, Constans.YEAROFDELIVERYID + i, Constans.componentType.JCOMBOBOX);
                anmPropertiesService.setPropsValue(explorerPanel, Constans.LABORSUITABILITYID + i, Constans.componentType.JCOMBOBOX);

                anmPropertiesService.setPropsValue(ambientalPanel, Constans.ENVYEAROFEXECUTIONID + i, Constans.componentType.JCOMBOBOX);
                anmPropertiesService.setPropsValue(ambientalPanel, Constans.ENVYEAROFDELIVERYID + i, Constans.componentType.JCOMBOBOX);
                anmPropertiesService.setPropsValue(ambientalPanel, Constans.ENVLABORSUITABILITYID + i, Constans.componentType.JCOMBOBOX);
            }

            anmPropertiesService.setProperty("mineral", mineral.getText());

            anmPropertiesService.setProperty("areaOfConcessionSlctId", areaOfConcessionSlctId.getSelectedItem().toString());

            anmPropertiesService.setProperty("selectedCellInputMethodSlctId", selectedCellInputMethodSlctId.getSelectedItem().toString());
            anmPropertiesService.setProperty("selectTypeMap", selectTypeMap.getSelectedItem().toString());
            anmPropertiesService.setProperty("pikerLoad", pikerLoad.getText());

            anmPropertiesService.setProperty("currentAssetId0", currentAssetId0.getText());
            anmPropertiesService.setProperty("totalLiabilitiesId0", totalLiabilitiesId0.getText());
            anmPropertiesService.setProperty("totalAssetId0", totalAssetId0.getText());
            anmPropertiesService.setProperty("currentLiabilitiesId0", currentLiabilitiesId0.getText());
            anmPropertiesService.setProperty("ecoApplicantNameId", ecoApplicantNameId.getText());
            anmPropertiesService.setProperty("techApplicantNameId", techApplicantNameId.getText());

            anmPropertiesService.setProperty("cells", txtCells.getText());

            anmPropertiesService.setProperty("personClassificationId0", personClassificationId0.getSelectedItem().toString());
            anmPropertiesService.setProperty("techProfessionalDesignationId", techProfessionalDesignationId.getSelectedItem().toString());
            anmPropertiesService.setProperty("pdfCert", pdfCert.getText());
            anmPropertiesService.setProperty("pdfGeo", pdfGeo.getText());

            anmPropertiesService.setProperty("file0", file0.getText());
            anmPropertiesService.setProperty("file1", file1.getText());
            anmPropertiesService.setProperty("file2", file2.getText());
            anmPropertiesService.setProperty("file3", file3.getText());
            anmPropertiesService.setProperty("file4", file4.getText());
            anmPropertiesService.setProperty("file5", file5.getText());
            anmPropertiesService.setProperty("file6", file6.getText());
            anmPropertiesService.setProperty("file7", file7.getText());
            anmPropertiesService.setProperty("file8", file8.getText());
            anmPropertiesService.setProperty("file9", file9.getText());
            anmPropertiesService.setProperty("file10", file10.getText());
            anmPropertiesService.setProperty("file11", file11.getText());


            for (int i = 0; i < textFields.size(); i++) {
                // Aquí asumimos que tienes una instancia de Properties llamada anmPropertiesService
                // y que i+1 es el identificador único para cada campo de texto
                anmPropertiesService.setProperty("generatedField" + (i + 1), textFields.get(i).getText());
                anmPropertiesService.setProperty("generatedCombo" + (i + 1), comboBoxs.get(i).getSelectedItem().toString());

            }

            try {
                anmPropertiesService.saveProperties();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            showMessageDialog(null, "Datos guardados correctamente");

        });

        seleccionarBtn.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                pdfGeo.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarBtn2.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                pdfCert.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file0.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton1.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file1.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton2.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file2.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton3.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file3.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton4.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file4.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton5.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file5.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton6.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file6.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton7.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file7.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton8.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file8.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });
        seleccionarButton9.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file9.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });
        seleccionarButton10.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file10.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        seleccionarButton11.addActionListener(actionEvent -> {

            JFileChooser jfc = new JFileChooser();
            int rVal = jfc.showOpenDialog(this.getRootPanel());
            if (rVal == JFileChooser.APPROVE_OPTION) {
                file11.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
            }
        });

        agregarButton.addActionListener(e -> {
            // Asegúrate de obtener el panel interno del JScrollPane
            GridBagConstraints gbc = new GridBagConstraints();
            JPanel innerPanel = (JPanel) panelScroll.getViewport().getView();
// Calcula el número de filas actuales basado en el número de componentes y el número de columnas.
            int numComponents = innerPanel.getComponentCount();
            int numRows = numComponents / 3;  // asumiendo 3 componentes por fila

            gbc.gridx = 0; // columna
            gbc.gridy = numRows; // fila, incrementamos según la cantidad de filas existentes
            gbc.insets = new Insets(2, 2, 2, 2); // márgenes para un espaciado uniforme
            gbc.fill = GridBagConstraints.HORIZONTAL;
            // Añadir la primera columna de la nueva fila
            JComboBox<String> comboBox = new JComboBox<>(new String[]{"Certificado de Ingresos por Contador Publico",
                    "Certificado de existencia y representación legal",
                    "Certificado de ingresos y retenciones emitido por el empleador imediatamente anterior a la fecha de vigencia"
                    , "Consultas en SIRI"
                    , "Declaración de renta"
                    , "Estado financiero de las empresas subordinadas o controladas",
                    "Estados Financieros Propios Certificados y o Dictaminados Proponente"
                    , "Extractos Bancarios Proponente"
                    , "Fotococopia documento de identificacion"
                    , "Fotocopia Tarjeta Profesional del Contador"
                    , "Fotocopia tarjeta profesional"
                    , "Matrícula mercantil"
                    , "Plano General"
                    , "Registro Único Tributario DIAN/RUT actualizado"
            });

            // Asigna un tercio del ancho del JScrollPane al JComboBox
            Dimension comboBoxSize = new Dimension(430, comboBox.getPreferredSize().height);
            comboBox.setPreferredSize(comboBoxSize);
            comboBox.setMaximumSize(comboBoxSize);
            comboBoxs.add(comboBox);
            innerPanel.add(comboBox, gbc);

            // Añadir la segunda columna de la nueva fila
            gbc.gridx = 1; // segunda columna
            gbc.weightx = 0.8; // Da más espacio al JTextField en relación a los otros componentes
            JTextField textField = new JTextField(10);

            Dimension textFieldSize = new Dimension(200, textField.getPreferredSize().height); // Puedes ajustar esto según tus necesidades
            textField.setPreferredSize(textFieldSize); // Esto definirá el tamaño preferido del JTextField
            textField.setMinimumSize(textFieldSize); // Esto garantizará que el JTextField no sea más pequeño que el tamaño preferido

            textFields.add(textField);
            innerPanel.add(textField, gbc);

            // Restablecer weightx para otros componentes que se añadirán después
            gbc.weightx = 0;

            // Añadir la tercera columna de la nueva fila
            gbc.gridx = 2; // tercera columna
            JButton button = new JButton("Seleccionar");
            button.addActionListener(actionEvent -> {

                JFileChooser jfc = new JFileChooser();
                int rVal = jfc.showOpenDialog(this.getRootPanel());
                if (rVal == JFileChooser.APPROVE_OPTION) {
                    textField.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
                }
            });
            innerPanel.add(button, gbc);

            // Configura el cuarto componente (Botón Eliminar)
            gbc.gridx = 3; // Cuarta columna
            JButton deleteButton = new JButton("Eliminar");
            deleteButton.addActionListener(actionEvent -> {
                // Elimina la fila de la interfaz gráfica
                JComponent[] components = new JComponent[]{comboBox, textField, button, deleteButton};
                for (JComponent component : components) {
                    innerPanel.remove(component);
                }
                innerPanel.revalidate();
                innerPanel.repaint();

                // Elimina los componentes de las listas
                textFields.remove(textField);
                comboBoxs.remove(comboBox);

                // Elimina las entradas de las propiedades y actualiza el archivo si es necesario
                String textFieldKey = "generatedField" + textFields.indexOf(textField);
                String comboBoxKey = "generatedCombo" + comboBoxs.indexOf(comboBox);
                anmPropertiesService.getProperties().remove(textFieldKey);
                anmPropertiesService.getProperties().remove(comboBoxKey);
                // Aquí asumimos que tienes un método para guardar las propiedades en el archivo
                try {
                    anmPropertiesService.saveProperties();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            innerPanel.add(deleteButton, gbc);

            // Actualiza el panel y el JScrollPane
            innerPanel.revalidate();
            innerPanel.repaint();
            panelScroll.revalidate();
            panelScroll.repaint();

        });


    }


    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createUIComponents() {

        ejecutarButton.setIcon(new ImageIcon("Resources/Button-Play-icon.png"));
        loginButton.setIcon(new ImageIcon("Resources/cs-login-icon.png"));
        paso1Button.setIcon(new ImageIcon("Resources/Numbers-1-Black-icon.png"));
        paso2Button.setIcon(new ImageIcon("Resources/Numbers-2-Black-icon.png"));
        paso3Button.setIcon(new ImageIcon("Resources/Numbers-3-Black-icon.png"));
        paso4Button.setIcon(new ImageIcon("Resources/Numbers-4-Black-icon.png"));
        paso5Button.setIcon(new ImageIcon("Resources/Numbers-5-Black-icon.png"));
        guardarButton.setIcon(new ImageIcon("Resources/Actions-document-save-icon.png"));

        pdfCert.setText(anmPropertiesService.getProperty("pdfCert"));
        pdfGeo.setText(anmPropertiesService.getProperty("pdfGeo"));


        // Reconstruye la interfaz de usuario
        for (int i = 1; anmPropertiesService.getProperties().containsKey("generatedField" + i); i++) {

            JPanel innerPanel = (JPanel) panelScroll.getViewport().getView();
            GridBagConstraints gbc = new GridBagConstraints();
// Calcula el número de filas actuales basado en el número de componentes y el número de columnas.
            int numComponents = innerPanel.getComponentCount();
            int numRows = numComponents / 3;  // asumiendo 3 componentes por fila

            gbc.gridx = 0; // columna
            gbc.gridy = numRows; // fila, incrementamos según la cantidad de filas existentes
            gbc.insets = new Insets(2, 2, 2, 2); // márgenes para un espaciado uniforme
            gbc.fill = GridBagConstraints.HORIZONTAL;

            // Crea el JComboBox con los valores anteriores
            String comboBoxKey = "generatedCombo" + i;
            String comboBoxValue = anmPropertiesService.getProperty(comboBoxKey); // Default a cadena vacía si no existe
            // Añadir la primera columna de la nueva fila
            JComboBox<String> comboBox = new JComboBox<>(new String[]{"Certificado de Ingresos por Contador Publico",
                    "Certificado de existencia y representación legal",
                    "Certificado de ingresos y retenciones emitido por el empleador imediatamente anterior a la fecha de vigencia"
                    , "Consultas en SIRI"
                    , "Declaración de renta"
                    , "Estado financiero de las empresas subordinadas o controladas",
                    "Estados Financieros Propios Certificados y o Dictaminados Proponente"
                    , "Extractos Bancarios Proponente"
                    , "Fotococopia documento de identificacion"
                    , "Fotocopia Tarjeta Profesional del Contador"
                    , "Fotocopia tarjeta profesional"
                    , "Matrícula mercantil"
                    , "Plano General"
                    , "Registro Único Tributario DIAN/RUT actualizado"
            });
            comboBox.setSelectedItem(comboBoxValue); // Selecciona el valor guardado

            // Asigna un tercio del ancho del JScrollPane al JComboBox
            Dimension comboBoxSize = new Dimension(430, comboBox.getPreferredSize().height);
            comboBox.setPreferredSize(comboBoxSize);
            comboBox.setMaximumSize(comboBoxSize);
            comboBoxs.add(comboBox);
            innerPanel.add(comboBox, gbc);


            // Añadir la segunda columna de la nueva fila
            gbc.gridx = 1; // segunda columna
            gbc.weightx = 0.8; // Da más espacio al JTextField en relación a los otros componentes

            // Crea el JTextField con los valores anteriores
            String textFieldKey = "generatedField" + i;
            String textFieldValue = anmPropertiesService.getProperty(textFieldKey); // Default a cadena vacía si no existe
            JTextField textField = new JTextField(textFieldValue, 10);
            Dimension textFieldSize = new Dimension(200, textField.getPreferredSize().height); // Puedes ajustar esto según tus necesidades
            textField.setPreferredSize(textFieldSize); // Esto definirá el tamaño preferido del JTextField
            textField.setMinimumSize(textFieldSize); // Esto garantizará que el JTextField no sea más pequeño que el tamaño preferido

            textFields.add(textField);
            innerPanel.add(textField, gbc);

            // Restablecer weightx para otros componentes que se añadirán después
            gbc.weightx = 0;

            // Añadir la tercera columna de la nueva fila
            gbc.gridx = 2; // tercera columna

            // Crea el botón "Seleccionar"
            JButton button = new JButton("Seleccionar");
            button.addActionListener(actionEvent -> {

                JFileChooser jfc = new JFileChooser();
                int rVal = jfc.showOpenDialog(this.getRootPanel());
                if (rVal == JFileChooser.APPROVE_OPTION) {
                    textField.setText(jfc.getCurrentDirectory().toString() + File.separator + jfc.getSelectedFile().getName());
                }
            });
            innerPanel.add(button, gbc);

            // Configura el cuarto componente (Botón Eliminar)
            gbc.gridx = 3; // Cuarta columna
            JButton deleteButton = new JButton("Eliminar");
            deleteButton.addActionListener(actionEvent -> {
                // Elimina la fila de la interfaz gráfica
                JComponent[] components = new JComponent[]{comboBox, textField, button, deleteButton};
                for (JComponent component : components) {
                    innerPanel.remove(component);
                }
                innerPanel.revalidate();
                innerPanel.repaint();

                // Elimina los componentes de las listas
                textFields.remove(textField);
                comboBoxs.remove(comboBox);

                // Elimina las entradas de las propiedades y actualiza el archivo si es necesario
                anmPropertiesService.getProperties().remove(textFieldKey);
                anmPropertiesService.getProperties().remove(comboBoxKey);
                // Aquí asumimos que tienes un método para guardar las propiedades en el archivo
                try {
                    anmPropertiesService.saveProperties();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            innerPanel.add(deleteButton, gbc);

            // Actualiza el panel y el JScrollPane
            innerPanel.revalidate();
            innerPanel.repaint();

        }

        panelScroll.revalidate();
        panelScroll.repaint();


        file0.setText(anmPropertiesService.getProperty("file0"));
        file1.setText(anmPropertiesService.getProperty("file1"));
        file2.setText(anmPropertiesService.getProperty("file2"));
        file3.setText(anmPropertiesService.getProperty("file3"));
        file4.setText(anmPropertiesService.getProperty("file4"));
        file5.setText(anmPropertiesService.getProperty("file5"));
        file6.setText(anmPropertiesService.getProperty("file6"));
        file7.setText(anmPropertiesService.getProperty("file7"));


        mineral.setText(anmPropertiesService.getProperty("mineral"));

        areaOfConcessionSlctId.setSelectedItem(anmPropertiesService.getProperty("areaOfConcessionSlctId"));
        selectedCellInputMethodSlctId.setSelectedItem(anmPropertiesService.getProperty("selectedCellInputMethodSlctId"));
        selectTypeMap.setSelectedItem(anmPropertiesService.getProperty("selectTypeMap"));
        declareIndId0.setSelected(Boolean.parseBoolean(anmPropertiesService.getProperty("declareIndId0")));
        additionalEthnicGroupsInSelectedAreaIndId.setSelectedItem(anmPropertiesService.getProperty("additionalEthnicGroupsInSelectedAreaIndId"));
        personClassificationId0.setSelectedItem(anmPropertiesService.getProperty("personClassificationId0"));
        pikerLoad.setText(anmPropertiesService.getProperty("pikerLoad"));
        txtCells.setText(anmPropertiesService.getProperty("cells"));

        techProfessionalDesignationId.setSelectedItem(anmPropertiesService.getProperty("techProfessionalDesignationId"));

        currentAssetId0.setText(anmPropertiesService.getProperty("currentAssetId0"));
        totalLiabilitiesId0.setText(anmPropertiesService.getProperty("totalLiabilitiesId0"));
        totalAssetId0.setText(anmPropertiesService.getProperty("totalAssetId0"));
        currentLiabilitiesId0.setText(anmPropertiesService.getProperty("currentLiabilitiesId0"));
        ecoApplicantNameId.setText(anmPropertiesService.getProperty("ecoApplicantNameId"));
        techApplicantNameId.setText(anmPropertiesService.getProperty("techApplicantNameId"));

        secondSol.setSelected(Boolean.parseBoolean(anmPropertiesService.getProperty("secondSol")));
        applicantNameId.setText(anmPropertiesService.getProperty("applicantNameId"));
        applicantName.setText(anmPropertiesService.getProperty("applicantName"));
        declareIndId1.setSelected(Boolean.parseBoolean(anmPropertiesService.getProperty("declareIndId1")));
        currentAssetId1.setText(anmPropertiesService.getProperty("currentAssetId1"));
        currentLiabilitiesId1.setText(anmPropertiesService.getProperty("currentLiabilitiesId1"));
        totalAssetId1.setText(anmPropertiesService.getProperty("totalAssetId1"));
        totalLiabilitiesId1.setText(anmPropertiesService.getProperty("totalLiabilitiesId1"));


        for (int i = 0; i < 17; i++) {

            if (i < 15) {

                anmPropertiesService.setComponentsValue(configPanel, "timer" + (i + 1), Constans.componentType.JTEXTFIELD);
            }

            anmPropertiesService.setComponentsValue(explorerPanel, Constans.YEAROFEXECUTIONID + i, Constans.componentType.JCOMBOBOX);
            anmPropertiesService.setComponentsValue(explorerPanel, Constans.YEAROFDELIVERYID + i, Constans.componentType.JCOMBOBOX);
            anmPropertiesService.setComponentsValue(explorerPanel, Constans.LABORSUITABILITYID + i, Constans.componentType.JCOMBOBOX);


            anmPropertiesService.setComponentsValue(ambientalPanel, Constans.ENVYEAROFEXECUTIONID + i, Constans.componentType.JCOMBOBOX);
            anmPropertiesService.setComponentsValue(ambientalPanel, Constans.ENVYEAROFDELIVERYID + i, Constans.componentType.JCOMBOBOX);
            anmPropertiesService.setComponentsValue(ambientalPanel, Constans.ENVLABORSUITABILITYID + i, Constans.componentType.JCOMBOBOX);
        }


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
        rootPanel.setLayout(new GridLayoutManager(1, 2, new Insets(10, 10, 10, 10), -1, -1));
        rootPanel.setAutoscrolls(true);
        rootPanel.setMinimumSize(new Dimension(-1, -1));
        rootPanel.putClientProperty("html.disable", Boolean.FALSE);
        groupPanel = new JTabbedPane();
        rootPanel.add(groupPanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        groupPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(17, 2, new Insets(5, 5, 5, 5), -1, -1));
        groupPanel.addTab("Informacion Personal", panel1);
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JLabel label1 = new JLabel();
        label1.setText("Mineral");
        panel1.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        mineral = new JTextField();
        panel1.add(mineral, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(200, -1), 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("Área de concesión");
        panel1.add(label2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("Área de interés");
        panel1.add(label3, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        areaOfConcessionSlctId = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Cauce");
        defaultComboBoxModel1.addElement("Cauce y Ribera");
        defaultComboBoxModel1.addElement("Otro tipo de terreno");
        areaOfConcessionSlctId.setModel(defaultComboBoxModel1);
        panel1.add(areaOfConcessionSlctId, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(200, -1), 0, false));
        selectedCellInputMethodSlctId = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("Cargando o ingresando coordenadas");
        defaultComboBoxModel2.addElement("Usando el mapa de selección para dibujar un polígono o ingresar celdas");
        defaultComboBoxModel2.addElement("Cargando archivo 'Shapefile' o 'KML'");
        selectedCellInputMethodSlctId.setModel(defaultComboBoxModel2);
        panel1.add(selectedCellInputMethodSlctId, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText(" Tipo de archivo");
        panel1.add(label4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        selectTypeMap = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement("KML");
        defaultComboBoxModel3.addElement("Shapefile");
        selectTypeMap.setModel(defaultComboBoxModel3);
        panel1.add(selectTypeMap, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(200, -1), 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("Ruta del archivo");
        panel1.add(label5, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pikerLoad = new JTextField();
        panel1.add(pikerLoad, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(200, -1), 0, false));
        final JLabel label6 = new JLabel();
        label6.setText("Hay grupos étnicos?");
        panel1.add(label6, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        additionalEthnicGroupsInSelectedAreaIndId = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel4 = new DefaultComboBoxModel();
        defaultComboBoxModel4.addElement("SI");
        defaultComboBoxModel4.addElement("NO");
        additionalEthnicGroupsInSelectedAreaIndId.setModel(defaultComboBoxModel4);
        panel1.add(additionalEthnicGroupsInSelectedAreaIndId, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(50, -1), 0, false));
        final JLabel label7 = new JLabel();
        label7.setText("Clasificación de persona");
        panel1.add(label7, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setText("Activo corriente");
        panel1.add(label8, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label9 = new JLabel();
        label9.setText("Pasivo corriente");
        panel1.add(label9, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        label10.setText("Activo total");
        panel1.add(label10, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        label11.setText("Pasivo total");
        panel1.add(label11, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label12 = new JLabel();
        label12.setText("Profesión");
        panel1.add(label12, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        currentAssetId0 = new JTextField();
        panel1.add(currentAssetId0, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(200, -1), 0, false));
        totalLiabilitiesId0 = new JTextField();
        panel1.add(totalLiabilitiesId0, new GridConstraints(12, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(200, -1), 0, false));
        totalAssetId0 = new JTextField();
        panel1.add(totalAssetId0, new GridConstraints(11, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(200, -1), 0, false));
        currentLiabilitiesId0 = new JTextField();
        panel1.add(currentLiabilitiesId0, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(200, -1), 0, false));
        comboBox3 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel5 = new DefaultComboBoxModel();
        defaultComboBoxModel5.addElement("Contador");
        comboBox3.setModel(defaultComboBoxModel5);
        panel1.add(comboBox3, new GridConstraints(13, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(200, -1), 0, false));
        personClassificationId0 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel6 = new DefaultComboBoxModel();
        defaultComboBoxModel6.addElement("Persona jurídica");
        defaultComboBoxModel6.addElement("Persona natural régimen común");
        defaultComboBoxModel6.addElement("Persona natural régimen simplificado");
        personClassificationId0.setModel(defaultComboBoxModel6);
        panel1.add(personClassificationId0, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(200, -1), 0, false));
        final JLabel label13 = new JLabel();
        label13.setText("Seleccione Profesional");
        panel1.add(label13, new GridConstraints(14, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ecoApplicantNameId = new JTextField();
        ecoApplicantNameId.setText("");
        panel1.add(ecoApplicantNameId, new GridConstraints(14, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(200, -1), 0, false));
        final JLabel label14 = new JLabel();
        label14.setText("Seleccione Profesional (Código)");
        panel1.add(label14, new GridConstraints(16, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        techApplicantNameId = new JTextField();
        techApplicantNameId.setText("");
        panel1.add(techApplicantNameId, new GridConstraints(16, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(-1, 20), null, new Dimension(200, -1), 0, false));
        final JLabel label15 = new JLabel();
        label15.setText("Ingresar celdas");
        panel1.add(label15, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        panel1.add(scrollPane1, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        txtCells = new JTextArea();
        txtCells.setEditable(true);
        txtCells.setEnabled(true);
        txtCells.setLineWrap(true);
        txtCells.setWrapStyleWord(true);
        scrollPane1.setViewportView(txtCells);
        techProfessionalDesignationId = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel7 = new DefaultComboBoxModel();
        defaultComboBoxModel7.addElement("Geólogo");
        defaultComboBoxModel7.addElement("Ingeniero Geólogo");
        defaultComboBoxModel7.addElement("Ingeniero de Minas");
        techProfessionalDesignationId.setModel(defaultComboBoxModel7);
        panel1.add(techProfessionalDesignationId, new GridConstraints(15, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(200, -1), 0, false));
        final JLabel label16 = new JLabel();
        label16.setText("Refendado por");
        panel1.add(label16, new GridConstraints(15, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        declareIndId0 = new JCheckBox();
        declareIndId0.setText("CheckBox");
        panel1.add(declareIndId0, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        explorerPanel = new JPanel();
        explorerPanel.setLayout(new GridLayoutManager(17, 4, new Insets(5, 5, 5, 5), -1, -1));
        groupPanel.addTab("Actividades exploratorias", explorerPanel);
        final JLabel label17 = new JLabel();
        label17.setText("Cartografía geológica");
        explorerPanel.add(label17, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId3 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel8 = new DefaultComboBoxModel();
        defaultComboBoxModel8.addElement("1");
        defaultComboBoxModel8.addElement("2");
        defaultComboBoxModel8.addElement("3");
        yearOfExecutionId3.setModel(defaultComboBoxModel8);
        yearOfExecutionId3.setName("yearOfExecutionId3");
        explorerPanel.add(yearOfExecutionId3, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label18 = new JLabel();
        label18.setText("Excavación de trincheras y apiques ");
        explorerPanel.add(label18, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId4 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel9 = new DefaultComboBoxModel();
        defaultComboBoxModel9.addElement("1");
        defaultComboBoxModel9.addElement("2");
        defaultComboBoxModel9.addElement("3");
        yearOfExecutionId4.setModel(defaultComboBoxModel9);
        yearOfExecutionId4.setName("yearOfExecutionId4");
        explorerPanel.add(yearOfExecutionId4, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfExecutionId5 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel10 = new DefaultComboBoxModel();
        defaultComboBoxModel10.addElement("1");
        defaultComboBoxModel10.addElement("2");
        defaultComboBoxModel10.addElement("3");
        yearOfExecutionId5.setModel(defaultComboBoxModel10);
        yearOfExecutionId5.setName("yearOfExecutionId5");
        explorerPanel.add(yearOfExecutionId5, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label19 = new JLabel();
        label19.setText("Geoquímica y otros análisis");
        explorerPanel.add(label19, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfDeliveryId3 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel11 = new DefaultComboBoxModel();
        defaultComboBoxModel11.addElement("1");
        defaultComboBoxModel11.addElement("2");
        defaultComboBoxModel11.addElement("3");
        yearOfDeliveryId3.setModel(defaultComboBoxModel11);
        yearOfDeliveryId3.setName("yearOfDeliveryId3");
        explorerPanel.add(yearOfDeliveryId3, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId4 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel12 = new DefaultComboBoxModel();
        defaultComboBoxModel12.addElement("1");
        defaultComboBoxModel12.addElement("2");
        defaultComboBoxModel12.addElement("3");
        yearOfDeliveryId4.setModel(defaultComboBoxModel12);
        yearOfDeliveryId4.setName("yearOfDeliveryId4");
        explorerPanel.add(yearOfDeliveryId4, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId5 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel13 = new DefaultComboBoxModel();
        defaultComboBoxModel13.addElement("1");
        defaultComboBoxModel13.addElement("2");
        defaultComboBoxModel13.addElement("3");
        yearOfDeliveryId5.setModel(defaultComboBoxModel13);
        yearOfDeliveryId5.setName("yearOfDeliveryId5");
        explorerPanel.add(yearOfDeliveryId5, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        laborSuitabilityId3 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel14 = new DefaultComboBoxModel();
        defaultComboBoxModel14.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId3.setModel(defaultComboBoxModel14);
        laborSuitabilityId3.setName("laborSuitabilityId3");
        explorerPanel.add(laborSuitabilityId3, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId4 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel15 = new DefaultComboBoxModel();
        defaultComboBoxModel15.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId4.setModel(defaultComboBoxModel15);
        laborSuitabilityId4.setName("laborSuitabilityId4");
        explorerPanel.add(laborSuitabilityId4, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId5 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel16 = new DefaultComboBoxModel();
        defaultComboBoxModel16.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId5.setModel(defaultComboBoxModel16);
        laborSuitabilityId5.setName("laborSuitabilityId5");
        explorerPanel.add(laborSuitabilityId5, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId6 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel17 = new DefaultComboBoxModel();
        defaultComboBoxModel17.addElement("1");
        defaultComboBoxModel17.addElement("2");
        defaultComboBoxModel17.addElement("3");
        yearOfExecutionId6.setModel(defaultComboBoxModel17);
        yearOfExecutionId6.setName("yearOfExecutionId6");
        explorerPanel.add(yearOfExecutionId6, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfExecutionId7 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel18 = new DefaultComboBoxModel();
        defaultComboBoxModel18.addElement("1");
        defaultComboBoxModel18.addElement("2");
        defaultComboBoxModel18.addElement("3");
        yearOfExecutionId7.setModel(defaultComboBoxModel18);
        yearOfExecutionId7.setName("yearOfExecutionId7");
        explorerPanel.add(yearOfExecutionId7, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label20 = new JLabel();
        label20.setText("Geofísica");
        explorerPanel.add(label20, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label21 = new JLabel();
        label21.setText("Estudio de dinámica fluvial del cauce");
        explorerPanel.add(label21, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label22 = new JLabel();
        label22.setText("Características hidrológicas");
        explorerPanel.add(label22, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId8 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel19 = new DefaultComboBoxModel();
        defaultComboBoxModel19.addElement("1");
        defaultComboBoxModel19.addElement("2");
        defaultComboBoxModel19.addElement("3");
        yearOfExecutionId8.setModel(defaultComboBoxModel19);
        yearOfExecutionId8.setName("yearOfExecutionId8");
        explorerPanel.add(yearOfExecutionId8, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label23 = new JLabel();
        label23.setText("Pozos y Galerías Exploratorias \t");
        explorerPanel.add(label23, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId9 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel20 = new DefaultComboBoxModel();
        defaultComboBoxModel20.addElement("1");
        defaultComboBoxModel20.addElement("2");
        defaultComboBoxModel20.addElement("3");
        yearOfExecutionId9.setModel(defaultComboBoxModel20);
        yearOfExecutionId9.setName("yearOfExecutionId9");
        explorerPanel.add(yearOfExecutionId9, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label24 = new JLabel();
        label24.setText("Perforaciones profundas");
        explorerPanel.add(label24, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId10 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel21 = new DefaultComboBoxModel();
        defaultComboBoxModel21.addElement("1");
        defaultComboBoxModel21.addElement("2");
        defaultComboBoxModel21.addElement("3");
        yearOfExecutionId10.setModel(defaultComboBoxModel21);
        yearOfExecutionId10.setName("yearOfExecutionId10");
        explorerPanel.add(yearOfExecutionId10, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label25 = new JLabel();
        label25.setText("Muestreo y análisis de calidad");
        explorerPanel.add(label25, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId11 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel22 = new DefaultComboBoxModel();
        defaultComboBoxModel22.addElement("1");
        defaultComboBoxModel22.addElement("2");
        defaultComboBoxModel22.addElement("3");
        yearOfExecutionId11.setModel(defaultComboBoxModel22);
        yearOfExecutionId11.setName("yearOfExecutionId11");
        explorerPanel.add(yearOfExecutionId11, new GridConstraints(11, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label26 = new JLabel();
        label26.setText("Estudio geotécnico ");
        explorerPanel.add(label26, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId12 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel23 = new DefaultComboBoxModel();
        defaultComboBoxModel23.addElement("1");
        defaultComboBoxModel23.addElement("2");
        defaultComboBoxModel23.addElement("3");
        yearOfExecutionId12.setModel(defaultComboBoxModel23);
        yearOfExecutionId12.setName("yearOfExecutionId12");
        explorerPanel.add(yearOfExecutionId12, new GridConstraints(12, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label27 = new JLabel();
        label27.setText("Estudio Hidrológico ");
        explorerPanel.add(label27, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId13 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel24 = new DefaultComboBoxModel();
        defaultComboBoxModel24.addElement("1");
        defaultComboBoxModel24.addElement("2");
        defaultComboBoxModel24.addElement("3");
        yearOfExecutionId13.setModel(defaultComboBoxModel24);
        yearOfExecutionId13.setName("yearOfExecutionId13");
        explorerPanel.add(yearOfExecutionId13, new GridConstraints(13, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label28 = new JLabel();
        label28.setText("Estudio Hidrogeológico ");
        explorerPanel.add(label28, new GridConstraints(14, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId14 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel25 = new DefaultComboBoxModel();
        defaultComboBoxModel25.addElement("1");
        defaultComboBoxModel25.addElement("2");
        defaultComboBoxModel25.addElement("3");
        yearOfExecutionId14.setModel(defaultComboBoxModel25);
        yearOfExecutionId14.setName("yearOfExecutionId14");
        explorerPanel.add(yearOfExecutionId14, new GridConstraints(14, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId6 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel26 = new DefaultComboBoxModel();
        defaultComboBoxModel26.addElement("1");
        defaultComboBoxModel26.addElement("2");
        defaultComboBoxModel26.addElement("3");
        yearOfDeliveryId6.setModel(defaultComboBoxModel26);
        yearOfDeliveryId6.setName("yearOfDeliveryId6");
        explorerPanel.add(yearOfDeliveryId6, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId7 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel27 = new DefaultComboBoxModel();
        defaultComboBoxModel27.addElement("1");
        defaultComboBoxModel27.addElement("2");
        defaultComboBoxModel27.addElement("3");
        yearOfDeliveryId7.setModel(defaultComboBoxModel27);
        yearOfDeliveryId7.setName("yearOfDeliveryId7");
        explorerPanel.add(yearOfDeliveryId7, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId8 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel28 = new DefaultComboBoxModel();
        defaultComboBoxModel28.addElement("1");
        defaultComboBoxModel28.addElement("2");
        defaultComboBoxModel28.addElement("3");
        yearOfDeliveryId8.setModel(defaultComboBoxModel28);
        yearOfDeliveryId8.setName("yearOfDeliveryId8");
        explorerPanel.add(yearOfDeliveryId8, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId9 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel29 = new DefaultComboBoxModel();
        defaultComboBoxModel29.addElement("1");
        defaultComboBoxModel29.addElement("2");
        defaultComboBoxModel29.addElement("3");
        yearOfDeliveryId9.setModel(defaultComboBoxModel29);
        yearOfDeliveryId9.setName("yearOfDeliveryId9");
        explorerPanel.add(yearOfDeliveryId9, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId10 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel30 = new DefaultComboBoxModel();
        defaultComboBoxModel30.addElement("1");
        defaultComboBoxModel30.addElement("2");
        defaultComboBoxModel30.addElement("3");
        yearOfDeliveryId10.setModel(defaultComboBoxModel30);
        yearOfDeliveryId10.setName("yearOfDeliveryId10");
        explorerPanel.add(yearOfDeliveryId10, new GridConstraints(10, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId11 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel31 = new DefaultComboBoxModel();
        defaultComboBoxModel31.addElement("1");
        defaultComboBoxModel31.addElement("2");
        defaultComboBoxModel31.addElement("3");
        yearOfDeliveryId11.setModel(defaultComboBoxModel31);
        yearOfDeliveryId11.setName("yearOfDeliveryId11");
        explorerPanel.add(yearOfDeliveryId11, new GridConstraints(11, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId12 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel32 = new DefaultComboBoxModel();
        defaultComboBoxModel32.addElement("1");
        defaultComboBoxModel32.addElement("2");
        defaultComboBoxModel32.addElement("3");
        yearOfDeliveryId12.setModel(defaultComboBoxModel32);
        yearOfDeliveryId12.setName("yearOfDeliveryId12");
        explorerPanel.add(yearOfDeliveryId12, new GridConstraints(12, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId13 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel33 = new DefaultComboBoxModel();
        defaultComboBoxModel33.addElement("1");
        defaultComboBoxModel33.addElement("2");
        defaultComboBoxModel33.addElement("3");
        yearOfDeliveryId13.setModel(defaultComboBoxModel33);
        yearOfDeliveryId13.setName("yearOfDeliveryId13");
        explorerPanel.add(yearOfDeliveryId13, new GridConstraints(13, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId14 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel34 = new DefaultComboBoxModel();
        defaultComboBoxModel34.addElement("1");
        defaultComboBoxModel34.addElement("2");
        defaultComboBoxModel34.addElement("3");
        yearOfDeliveryId14.setModel(defaultComboBoxModel34);
        yearOfDeliveryId14.setName("yearOfDeliveryId14");
        explorerPanel.add(yearOfDeliveryId14, new GridConstraints(14, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        laborSuitabilityId6 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel35 = new DefaultComboBoxModel();
        defaultComboBoxModel35.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId6.setModel(defaultComboBoxModel35);
        laborSuitabilityId6.setName("laborSuitabilityId");
        explorerPanel.add(laborSuitabilityId6, new GridConstraints(6, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), null, null, 0, false));
        laborSuitabilityId7 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel36 = new DefaultComboBoxModel();
        defaultComboBoxModel36.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        defaultComboBoxModel36.addElement("Hidrogeologo");
        defaultComboBoxModel36.addElement("Hidrologo");
        defaultComboBoxModel36.addElement("Topografo");
        laborSuitabilityId7.setModel(defaultComboBoxModel36);
        laborSuitabilityId7.setName("laborSuitabilityId7");
        explorerPanel.add(laborSuitabilityId7, new GridConstraints(7, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId8 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel37 = new DefaultComboBoxModel();
        defaultComboBoxModel37.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        defaultComboBoxModel37.addElement("Hidrogeologo");
        defaultComboBoxModel37.addElement("Hidrologo");
        laborSuitabilityId8.setModel(defaultComboBoxModel37);
        laborSuitabilityId8.setName("laborSuitabilityId8");
        explorerPanel.add(laborSuitabilityId8, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId9 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel38 = new DefaultComboBoxModel();
        defaultComboBoxModel38.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId9.setModel(defaultComboBoxModel38);
        laborSuitabilityId9.setName("laborSuitabilityId9");
        explorerPanel.add(laborSuitabilityId9, new GridConstraints(9, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId10 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel39 = new DefaultComboBoxModel();
        defaultComboBoxModel39.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId10.setModel(defaultComboBoxModel39);
        laborSuitabilityId10.setName("laborSuitabilityId10");
        explorerPanel.add(laborSuitabilityId10, new GridConstraints(10, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId11 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel40 = new DefaultComboBoxModel();
        defaultComboBoxModel40.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId11.setModel(defaultComboBoxModel40);
        laborSuitabilityId11.setName("laborSuitabilityId11");
        explorerPanel.add(laborSuitabilityId11, new GridConstraints(11, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId12 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel41 = new DefaultComboBoxModel();
        defaultComboBoxModel41.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        defaultComboBoxModel41.addElement("Geotecnista");
        laborSuitabilityId12.setModel(defaultComboBoxModel41);
        laborSuitabilityId12.setName("laborSuitabilityId12");
        explorerPanel.add(laborSuitabilityId12, new GridConstraints(12, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(200, -1), null, null, 0, false));
        laborSuitabilityId13 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel42 = new DefaultComboBoxModel();
        defaultComboBoxModel42.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        defaultComboBoxModel42.addElement("Hidrogeologo");
        defaultComboBoxModel42.addElement("Hidrologo");
        laborSuitabilityId13.setModel(defaultComboBoxModel42);
        laborSuitabilityId13.setName("laborSuitabilityId13");
        explorerPanel.add(laborSuitabilityId13, new GridConstraints(13, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId14 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel43 = new DefaultComboBoxModel();
        defaultComboBoxModel43.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        defaultComboBoxModel43.addElement("Hidrogeologo");
        laborSuitabilityId14.setModel(defaultComboBoxModel43);
        laborSuitabilityId14.setName("laborSuitabilityId14");
        explorerPanel.add(laborSuitabilityId14, new GridConstraints(14, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label29 = new JLabel();
        label29.setText("Evaluación del modelo geológico");
        explorerPanel.add(label29, new GridConstraints(15, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId15 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel44 = new DefaultComboBoxModel();
        defaultComboBoxModel44.addElement("1");
        defaultComboBoxModel44.addElement("2");
        defaultComboBoxModel44.addElement("3");
        yearOfExecutionId15.setModel(defaultComboBoxModel44);
        yearOfExecutionId15.setName("yearOfExecutionId15");
        explorerPanel.add(yearOfExecutionId15, new GridConstraints(15, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label30 = new JLabel();
        label30.setText("Actividades exploratorias adicionales");
        explorerPanel.add(label30, new GridConstraints(16, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId16 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel45 = new DefaultComboBoxModel();
        defaultComboBoxModel45.addElement("1");
        defaultComboBoxModel45.addElement("2");
        defaultComboBoxModel45.addElement("3");
        yearOfExecutionId16.setModel(defaultComboBoxModel45);
        yearOfExecutionId16.setName("yearOfExecutionId16");
        explorerPanel.add(yearOfExecutionId16, new GridConstraints(16, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId15 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel46 = new DefaultComboBoxModel();
        defaultComboBoxModel46.addElement("1");
        defaultComboBoxModel46.addElement("2");
        defaultComboBoxModel46.addElement("3");
        yearOfDeliveryId15.setModel(defaultComboBoxModel46);
        yearOfDeliveryId15.setName("yearOfDeliveryId15");
        explorerPanel.add(yearOfDeliveryId15, new GridConstraints(15, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId16 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel47 = new DefaultComboBoxModel();
        defaultComboBoxModel47.addElement("1");
        defaultComboBoxModel47.addElement("2");
        defaultComboBoxModel47.addElement("3");
        yearOfDeliveryId16.setModel(defaultComboBoxModel47);
        yearOfDeliveryId16.setName("yearOfDeliveryId16");
        explorerPanel.add(yearOfDeliveryId16, new GridConstraints(16, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        laborSuitabilityId15 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel48 = new DefaultComboBoxModel();
        defaultComboBoxModel48.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId15.setModel(defaultComboBoxModel48);
        laborSuitabilityId15.setName("laborSuitabilityId15");
        explorerPanel.add(laborSuitabilityId15, new GridConstraints(15, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId16 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel49 = new DefaultComboBoxModel();
        defaultComboBoxModel49.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId16.setModel(defaultComboBoxModel49);
        laborSuitabilityId16.setName("laborSuitabilityId16");
        explorerPanel.add(laborSuitabilityId16, new GridConstraints(16, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label31 = new JLabel();
        label31.setText("Base topográfica del área");
        explorerPanel.add(label31, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel50 = new DefaultComboBoxModel();
        defaultComboBoxModel50.addElement("1");
        defaultComboBoxModel50.addElement("2");
        defaultComboBoxModel50.addElement("3");
        yearOfExecutionId2.setModel(defaultComboBoxModel50);
        yearOfExecutionId2.setName("yearOfExecutionId2");
        explorerPanel.add(yearOfExecutionId2, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel51 = new DefaultComboBoxModel();
        defaultComboBoxModel51.addElement("1");
        defaultComboBoxModel51.addElement("2");
        defaultComboBoxModel51.addElement("3");
        yearOfDeliveryId2.setModel(defaultComboBoxModel51);
        yearOfDeliveryId2.setName("yearOfDeliveryId2");
        explorerPanel.add(yearOfDeliveryId2, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        final JLabel label32 = new JLabel();
        label32.setText("Contactos con la comunidad");
        explorerPanel.add(label32, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label33 = new JLabel();
        label33.setText("Revisión bibliográfica ");
        explorerPanel.add(label33, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        yearOfExecutionId1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel52 = new DefaultComboBoxModel();
        defaultComboBoxModel52.addElement("1");
        defaultComboBoxModel52.addElement("2");
        defaultComboBoxModel52.addElement("3");
        yearOfExecutionId1.setModel(defaultComboBoxModel52);
        yearOfExecutionId1.setName("yearOfExecutionId1");
        explorerPanel.add(yearOfExecutionId1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfExecutionId0 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel53 = new DefaultComboBoxModel();
        defaultComboBoxModel53.addElement("1");
        defaultComboBoxModel53.addElement("2");
        defaultComboBoxModel53.addElement("3");
        yearOfExecutionId0.setModel(defaultComboBoxModel53);
        yearOfExecutionId0.setName("yearOfExecutionId0");
        explorerPanel.add(yearOfExecutionId0, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel54 = new DefaultComboBoxModel();
        defaultComboBoxModel54.addElement("1");
        defaultComboBoxModel54.addElement("2");
        defaultComboBoxModel54.addElement("3");
        yearOfDeliveryId1.setModel(defaultComboBoxModel54);
        yearOfDeliveryId1.setName("yearOfDeliveryId1");
        explorerPanel.add(yearOfDeliveryId1, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        yearOfDeliveryId0 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel55 = new DefaultComboBoxModel();
        defaultComboBoxModel55.addElement("1");
        defaultComboBoxModel55.addElement("2");
        defaultComboBoxModel55.addElement("3");
        yearOfDeliveryId0.setModel(defaultComboBoxModel55);
        yearOfDeliveryId0.setName("yearOfDeliveryId0");
        explorerPanel.add(yearOfDeliveryId0, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, new Dimension(60, -1), null, null, 0, false));
        laborSuitabilityId2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel56 = new DefaultComboBoxModel();
        defaultComboBoxModel56.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        defaultComboBoxModel56.addElement("Topografo");
        laborSuitabilityId2.setModel(defaultComboBoxModel56);
        laborSuitabilityId2.setName("laborSuitabilityId2");
        explorerPanel.add(laborSuitabilityId2, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel57 = new DefaultComboBoxModel();
        defaultComboBoxModel57.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        defaultComboBoxModel57.addElement("Trabajador social o Comunicador o Antropologo");
        laborSuitabilityId1.setModel(defaultComboBoxModel57);
        laborSuitabilityId1.setName("laborSuitabilityId1");
        explorerPanel.add(laborSuitabilityId1, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        laborSuitabilityId0 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel58 = new DefaultComboBoxModel();
        defaultComboBoxModel58.addElement("Ingeniero de Minas, Ingeniero Geólogo o Geólogo");
        laborSuitabilityId0.setModel(defaultComboBoxModel58);
        laborSuitabilityId0.setName("laborSuitabilityId0");
        explorerPanel.add(laborSuitabilityId0, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ambientalPanel = new JPanel();
        ambientalPanel.setLayout(new GridLayoutManager(17, 4, new Insets(5, 5, 5, 5), -1, -1));
        groupPanel.addTab("Actividades Ambientales", ambientalPanel);
        final JLabel label34 = new JLabel();
        label34.setText("Selección optima de Sitios");
        ambientalPanel.add(label34, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId0 = new JComboBox();
        envYearOfDeliveryId0.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel59 = new DefaultComboBoxModel();
        defaultComboBoxModel59.addElement("1");
        defaultComboBoxModel59.addElement("2");
        defaultComboBoxModel59.addElement("3");
        envYearOfDeliveryId0.setModel(defaultComboBoxModel59);
        envYearOfDeliveryId0.setName("envYearOfDeliveryId0");
        ambientalPanel.add(envYearOfDeliveryId0, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId0 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel60 = new DefaultComboBoxModel();
        defaultComboBoxModel60.addElement("Ingeniero ambiental");
        defaultComboBoxModel60.addElement("Ingeniero civil");
        defaultComboBoxModel60.addElement("Ingeniero forestal, Ecologo o Biologo");
        defaultComboBoxModel60.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        defaultComboBoxModel60.addElement("Profesional (GIS)SIG");
        envLaborSuitabilityId0.setModel(defaultComboBoxModel60);
        envLaborSuitabilityId0.setName("envLaborSuitabilityId0");
        ambientalPanel.add(envLaborSuitabilityId0, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label35 = new JLabel();
        label35.setText("Manejo de Aguas Lluvias ");
        ambientalPanel.add(label35, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId0 = new JComboBox();
        envYearOfExecutionId0.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel61 = new DefaultComboBoxModel();
        defaultComboBoxModel61.addElement("1");
        defaultComboBoxModel61.addElement("2");
        defaultComboBoxModel61.addElement("3");
        envYearOfExecutionId0.setModel(defaultComboBoxModel61);
        envYearOfExecutionId0.setName("envYearOfExecutionId0");
        ambientalPanel.add(envYearOfExecutionId0, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId1 = new JComboBox();
        envYearOfExecutionId1.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel62 = new DefaultComboBoxModel();
        defaultComboBoxModel62.addElement("1");
        defaultComboBoxModel62.addElement("2");
        defaultComboBoxModel62.addElement("3");
        envYearOfExecutionId1.setModel(defaultComboBoxModel62);
        envYearOfExecutionId1.setName("envYearOfExecutionId1");
        ambientalPanel.add(envYearOfExecutionId1, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId1 = new JComboBox();
        envYearOfDeliveryId1.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel63 = new DefaultComboBoxModel();
        defaultComboBoxModel63.addElement("1");
        defaultComboBoxModel63.addElement("2");
        defaultComboBoxModel63.addElement("3");
        envYearOfDeliveryId1.setModel(defaultComboBoxModel63);
        envYearOfDeliveryId1.setName("envYearOfDeliveryId1");
        ambientalPanel.add(envYearOfDeliveryId1, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel64 = new DefaultComboBoxModel();
        defaultComboBoxModel64.addElement("Hidrogeologo");
        defaultComboBoxModel64.addElement("Hidrologo");
        defaultComboBoxModel64.addElement("Ingeniero ambiental");
        defaultComboBoxModel64.addElement("Ingeniero civil");
        defaultComboBoxModel64.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId1.setModel(defaultComboBoxModel64);
        envLaborSuitabilityId1.setName("envLaborSuitabilityId1");
        ambientalPanel.add(envLaborSuitabilityId1, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label36 = new JLabel();
        label36.setText("Manejo de Aguas Residuales");
        ambientalPanel.add(label36, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label37 = new JLabel();
        label37.setText("Manejo de Cuerpos de Agua");
        ambientalPanel.add(label37, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId2 = new JComboBox();
        envYearOfExecutionId2.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel65 = new DefaultComboBoxModel();
        defaultComboBoxModel65.addElement("1");
        defaultComboBoxModel65.addElement("2");
        defaultComboBoxModel65.addElement("3");
        envYearOfExecutionId2.setModel(defaultComboBoxModel65);
        envYearOfExecutionId2.setName("envYearOfExecutionId2");
        ambientalPanel.add(envYearOfExecutionId2, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId3 = new JComboBox();
        envYearOfExecutionId3.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel66 = new DefaultComboBoxModel();
        defaultComboBoxModel66.addElement("1");
        defaultComboBoxModel66.addElement("2");
        defaultComboBoxModel66.addElement("3");
        envYearOfExecutionId3.setModel(defaultComboBoxModel66);
        envYearOfExecutionId3.setName("envYearOfExecutionId3");
        ambientalPanel.add(envYearOfExecutionId3, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId2 = new JComboBox();
        envYearOfDeliveryId2.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel67 = new DefaultComboBoxModel();
        defaultComboBoxModel67.addElement("1");
        defaultComboBoxModel67.addElement("2");
        defaultComboBoxModel67.addElement("3");
        envYearOfDeliveryId2.setModel(defaultComboBoxModel67);
        envYearOfDeliveryId2.setName("envYearOfDeliveryId2");
        ambientalPanel.add(envYearOfDeliveryId2, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId3 = new JComboBox();
        envYearOfDeliveryId3.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel68 = new DefaultComboBoxModel();
        defaultComboBoxModel68.addElement("1");
        defaultComboBoxModel68.addElement("2");
        defaultComboBoxModel68.addElement("3");
        envYearOfDeliveryId3.setModel(defaultComboBoxModel68);
        envYearOfDeliveryId3.setName("envYearOfDeliveryId3");
        ambientalPanel.add(envYearOfDeliveryId3, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId2 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel69 = new DefaultComboBoxModel();
        defaultComboBoxModel69.addElement("Hidrologo");
        defaultComboBoxModel69.addElement("Ingeniero ambiental");
        defaultComboBoxModel69.addElement("Ingeniero civil");
        defaultComboBoxModel69.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId2.setModel(defaultComboBoxModel69);
        envLaborSuitabilityId2.setName("envLaborSuitabilityId2");
        ambientalPanel.add(envLaborSuitabilityId2, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId3 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel70 = new DefaultComboBoxModel();
        defaultComboBoxModel70.addElement("Hidrogeologo");
        defaultComboBoxModel70.addElement("Hidrologo");
        defaultComboBoxModel70.addElement("Ingeniero ambiental");
        defaultComboBoxModel70.addElement("Ingeniero civil");
        defaultComboBoxModel70.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId3.setModel(defaultComboBoxModel70);
        envLaborSuitabilityId3.setName("envLaborSuitabilityId3");
        ambientalPanel.add(envLaborSuitabilityId3, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label38 = new JLabel();
        label38.setText("Manejo de Material Particulado");
        ambientalPanel.add(label38, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label39 = new JLabel();
        label39.setText("Manejo del Ruido");
        ambientalPanel.add(label39, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label40 = new JLabel();
        label40.setText("Manejo de Combustibles");
        ambientalPanel.add(label40, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label41 = new JLabel();
        label41.setText("Manejo de Taludes ");
        ambientalPanel.add(label41, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label42 = new JLabel();
        label42.setText("Manejo de Accesos ");
        ambientalPanel.add(label42, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label43 = new JLabel();
        label43.setText("Manejo de Residuos Solidos");
        ambientalPanel.add(label43, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label44 = new JLabel();
        label44.setText("Adecuación y Recuperación");
        ambientalPanel.add(label44, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId4 = new JComboBox();
        envYearOfExecutionId4.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel71 = new DefaultComboBoxModel();
        defaultComboBoxModel71.addElement("1");
        defaultComboBoxModel71.addElement("2");
        defaultComboBoxModel71.addElement("3");
        envYearOfExecutionId4.setModel(defaultComboBoxModel71);
        envYearOfExecutionId4.setName("envYearOfExecutionId4");
        ambientalPanel.add(envYearOfExecutionId4, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId5 = new JComboBox();
        envYearOfExecutionId5.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel72 = new DefaultComboBoxModel();
        defaultComboBoxModel72.addElement("1");
        defaultComboBoxModel72.addElement("2");
        defaultComboBoxModel72.addElement("3");
        envYearOfExecutionId5.setModel(defaultComboBoxModel72);
        envYearOfExecutionId5.setName("envYearOfExecutionId5");
        ambientalPanel.add(envYearOfExecutionId5, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId6 = new JComboBox();
        envYearOfExecutionId6.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel73 = new DefaultComboBoxModel();
        defaultComboBoxModel73.addElement("1");
        defaultComboBoxModel73.addElement("2");
        defaultComboBoxModel73.addElement("3");
        envYearOfExecutionId6.setModel(defaultComboBoxModel73);
        envYearOfExecutionId6.setName("envYearOfExecutionId6");
        ambientalPanel.add(envYearOfExecutionId6, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId7 = new JComboBox();
        envYearOfExecutionId7.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel74 = new DefaultComboBoxModel();
        defaultComboBoxModel74.addElement("1");
        defaultComboBoxModel74.addElement("2");
        defaultComboBoxModel74.addElement("3");
        envYearOfExecutionId7.setModel(defaultComboBoxModel74);
        envYearOfExecutionId7.setName("envYearOfExecutionId7");
        ambientalPanel.add(envYearOfExecutionId7, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId8 = new JComboBox();
        envYearOfExecutionId8.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel75 = new DefaultComboBoxModel();
        defaultComboBoxModel75.addElement("1");
        defaultComboBoxModel75.addElement("2");
        defaultComboBoxModel75.addElement("3");
        envYearOfExecutionId8.setModel(defaultComboBoxModel75);
        envYearOfExecutionId8.setName("envYearOfExecutionId8");
        ambientalPanel.add(envYearOfExecutionId8, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId9 = new JComboBox();
        envYearOfExecutionId9.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel76 = new DefaultComboBoxModel();
        defaultComboBoxModel76.addElement("1");
        defaultComboBoxModel76.addElement("2");
        defaultComboBoxModel76.addElement("3");
        envYearOfExecutionId9.setModel(defaultComboBoxModel76);
        envYearOfExecutionId9.setName("envYearOfExecutionId9");
        ambientalPanel.add(envYearOfExecutionId9, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId10 = new JComboBox();
        envYearOfExecutionId10.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel77 = new DefaultComboBoxModel();
        defaultComboBoxModel77.addElement("1");
        defaultComboBoxModel77.addElement("2");
        defaultComboBoxModel77.addElement("3");
        envYearOfExecutionId10.setModel(defaultComboBoxModel77);
        envYearOfExecutionId10.setName("envYearOfExecutionId10");
        ambientalPanel.add(envYearOfExecutionId10, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId4 = new JComboBox();
        envYearOfDeliveryId4.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel78 = new DefaultComboBoxModel();
        defaultComboBoxModel78.addElement("1");
        defaultComboBoxModel78.addElement("2");
        defaultComboBoxModel78.addElement("3");
        envYearOfDeliveryId4.setModel(defaultComboBoxModel78);
        envYearOfDeliveryId4.setName("envYearOfDeliveryId4");
        ambientalPanel.add(envYearOfDeliveryId4, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId5 = new JComboBox();
        envYearOfDeliveryId5.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel79 = new DefaultComboBoxModel();
        defaultComboBoxModel79.addElement("1");
        defaultComboBoxModel79.addElement("2");
        defaultComboBoxModel79.addElement("3");
        envYearOfDeliveryId5.setModel(defaultComboBoxModel79);
        envYearOfDeliveryId5.setName("envYearOfDeliveryId5");
        ambientalPanel.add(envYearOfDeliveryId5, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId6 = new JComboBox();
        envYearOfDeliveryId6.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel80 = new DefaultComboBoxModel();
        defaultComboBoxModel80.addElement("1");
        defaultComboBoxModel80.addElement("2");
        defaultComboBoxModel80.addElement("3");
        envYearOfDeliveryId6.setModel(defaultComboBoxModel80);
        envYearOfDeliveryId6.setName("envYearOfDeliveryId6");
        ambientalPanel.add(envYearOfDeliveryId6, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId7 = new JComboBox();
        envYearOfDeliveryId7.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel81 = new DefaultComboBoxModel();
        defaultComboBoxModel81.addElement("1");
        defaultComboBoxModel81.addElement("2");
        defaultComboBoxModel81.addElement("3");
        envYearOfDeliveryId7.setModel(defaultComboBoxModel81);
        envYearOfDeliveryId7.setName("envYearOfDeliveryId7");
        ambientalPanel.add(envYearOfDeliveryId7, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId8 = new JComboBox();
        envYearOfDeliveryId8.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel82 = new DefaultComboBoxModel();
        defaultComboBoxModel82.addElement("1");
        defaultComboBoxModel82.addElement("2");
        defaultComboBoxModel82.addElement("3");
        envYearOfDeliveryId8.setModel(defaultComboBoxModel82);
        envYearOfDeliveryId8.setName("envYearOfDeliveryId8");
        ambientalPanel.add(envYearOfDeliveryId8, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId9 = new JComboBox();
        envYearOfDeliveryId9.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel83 = new DefaultComboBoxModel();
        defaultComboBoxModel83.addElement("1");
        defaultComboBoxModel83.addElement("2");
        defaultComboBoxModel83.addElement("3");
        envYearOfDeliveryId9.setModel(defaultComboBoxModel83);
        envYearOfDeliveryId9.setName("envYearOfDeliveryId9");
        ambientalPanel.add(envYearOfDeliveryId9, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId10 = new JComboBox();
        envYearOfDeliveryId10.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel84 = new DefaultComboBoxModel();
        defaultComboBoxModel84.addElement("1");
        defaultComboBoxModel84.addElement("2");
        defaultComboBoxModel84.addElement("3");
        envYearOfDeliveryId10.setModel(defaultComboBoxModel84);
        envYearOfDeliveryId10.setName("envYearOfDeliveryId10");
        ambientalPanel.add(envYearOfDeliveryId10, new GridConstraints(10, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId4 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel85 = new DefaultComboBoxModel();
        defaultComboBoxModel85.addElement("Ingeniero ambiental");
        defaultComboBoxModel85.addElement("Ingeniero civil");
        defaultComboBoxModel85.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId4.setModel(defaultComboBoxModel85);
        envLaborSuitabilityId4.setName("envLaborSuitabilityId4");
        ambientalPanel.add(envLaborSuitabilityId4, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId5 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel86 = new DefaultComboBoxModel();
        defaultComboBoxModel86.addElement("Ingeniero ambiental");
        defaultComboBoxModel86.addElement("Ingeniero civil");
        defaultComboBoxModel86.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId5.setModel(defaultComboBoxModel86);
        envLaborSuitabilityId5.setName("envLaborSuitabilityId5");
        ambientalPanel.add(envLaborSuitabilityId5, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId6 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel87 = new DefaultComboBoxModel();
        defaultComboBoxModel87.addElement("Ingeniero ambiental");
        defaultComboBoxModel87.addElement("Ingeniero civil");
        defaultComboBoxModel87.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId6.setModel(defaultComboBoxModel87);
        envLaborSuitabilityId6.setName("envLaborSuitabilityId6");
        ambientalPanel.add(envLaborSuitabilityId6, new GridConstraints(6, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId7 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel88 = new DefaultComboBoxModel();
        defaultComboBoxModel88.addElement("Ingeniero civil");
        defaultComboBoxModel88.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId7.setModel(defaultComboBoxModel88);
        envLaborSuitabilityId7.setName("envLaborSuitabilityId7");
        ambientalPanel.add(envLaborSuitabilityId7, new GridConstraints(7, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId8 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel89 = new DefaultComboBoxModel();
        defaultComboBoxModel89.addElement("Ingeniero ambiental");
        defaultComboBoxModel89.addElement("Ingeniero civil");
        defaultComboBoxModel89.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId8.setModel(defaultComboBoxModel89);
        envLaborSuitabilityId8.setName("envLaborSuitabilityId8");
        ambientalPanel.add(envLaborSuitabilityId8, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId9 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel90 = new DefaultComboBoxModel();
        defaultComboBoxModel90.addElement("Ingeniero ambiental");
        defaultComboBoxModel90.addElement("Ingeniero civil");
        defaultComboBoxModel90.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId9.setModel(defaultComboBoxModel90);
        envLaborSuitabilityId9.setName("envLaborSuitabilityId9");
        ambientalPanel.add(envLaborSuitabilityId9, new GridConstraints(9, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId10 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel91 = new DefaultComboBoxModel();
        defaultComboBoxModel91.addElement("Ingeniero ambiental");
        defaultComboBoxModel91.addElement("Ingeniero civil");
        defaultComboBoxModel91.addElement("Ingeniero forestal, Ecologo o Biologo");
        defaultComboBoxModel91.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId10.setModel(defaultComboBoxModel91);
        envLaborSuitabilityId10.setName("envLaborSuitabilityId10");
        ambientalPanel.add(envLaborSuitabilityId10, new GridConstraints(10, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label45 = new JLabel();
        label45.setText("Manejo de Fauna y Flora");
        ambientalPanel.add(label45, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label46 = new JLabel();
        label46.setText("Plan de Gestión Social");
        ambientalPanel.add(label46, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label47 = new JLabel();
        label47.setText("capacitación de Personal ");
        ambientalPanel.add(label47, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label48 = new JLabel();
        label48.setText("Contratación de Mano de Obra");
        ambientalPanel.add(label48, new GridConstraints(14, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label49 = new JLabel();
        label49.setText("Rescate Arqueológico");
        ambientalPanel.add(label49, new GridConstraints(15, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId11 = new JComboBox();
        envYearOfExecutionId11.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel92 = new DefaultComboBoxModel();
        defaultComboBoxModel92.addElement("1");
        defaultComboBoxModel92.addElement("2");
        defaultComboBoxModel92.addElement("3");
        envYearOfExecutionId11.setModel(defaultComboBoxModel92);
        envYearOfExecutionId11.setName("envYearOfExecutionId11");
        ambientalPanel.add(envYearOfExecutionId11, new GridConstraints(11, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId12 = new JComboBox();
        envYearOfExecutionId12.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel93 = new DefaultComboBoxModel();
        defaultComboBoxModel93.addElement("1");
        defaultComboBoxModel93.addElement("2");
        defaultComboBoxModel93.addElement("3");
        envYearOfExecutionId12.setModel(defaultComboBoxModel93);
        envYearOfExecutionId12.setName("envYearOfExecutionId12");
        ambientalPanel.add(envYearOfExecutionId12, new GridConstraints(12, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId13 = new JComboBox();
        envYearOfExecutionId13.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel94 = new DefaultComboBoxModel();
        defaultComboBoxModel94.addElement("1");
        defaultComboBoxModel94.addElement("2");
        defaultComboBoxModel94.addElement("3");
        envYearOfExecutionId13.setModel(defaultComboBoxModel94);
        envYearOfExecutionId13.setName("envYearOfExecutionId13");
        ambientalPanel.add(envYearOfExecutionId13, new GridConstraints(13, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId14 = new JComboBox();
        envYearOfExecutionId14.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel95 = new DefaultComboBoxModel();
        defaultComboBoxModel95.addElement("1");
        defaultComboBoxModel95.addElement("2");
        defaultComboBoxModel95.addElement("3");
        envYearOfExecutionId14.setModel(defaultComboBoxModel95);
        envYearOfExecutionId14.setName("envYearOfExecutionId14");
        ambientalPanel.add(envYearOfExecutionId14, new GridConstraints(14, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId15 = new JComboBox();
        envYearOfExecutionId15.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel96 = new DefaultComboBoxModel();
        defaultComboBoxModel96.addElement("1");
        defaultComboBoxModel96.addElement("2");
        defaultComboBoxModel96.addElement("3");
        envYearOfExecutionId15.setModel(defaultComboBoxModel96);
        envYearOfExecutionId15.setName("envYearOfExecutionId15");
        ambientalPanel.add(envYearOfExecutionId15, new GridConstraints(15, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfExecutionId16 = new JComboBox();
        envYearOfExecutionId16.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel97 = new DefaultComboBoxModel();
        defaultComboBoxModel97.addElement("1");
        defaultComboBoxModel97.addElement("2");
        defaultComboBoxModel97.addElement("3");
        envYearOfExecutionId16.setModel(defaultComboBoxModel97);
        envYearOfExecutionId16.setName("envYearOfExecutionId16");
        ambientalPanel.add(envYearOfExecutionId16, new GridConstraints(16, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label50 = new JLabel();
        label50.setText("Manejo de Hundimientos ");
        ambientalPanel.add(label50, new GridConstraints(16, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId11 = new JComboBox();
        envYearOfDeliveryId11.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel98 = new DefaultComboBoxModel();
        defaultComboBoxModel98.addElement("1");
        defaultComboBoxModel98.addElement("2");
        defaultComboBoxModel98.addElement("3");
        envYearOfDeliveryId11.setModel(defaultComboBoxModel98);
        envYearOfDeliveryId11.setName("envYearOfDeliveryId11");
        ambientalPanel.add(envYearOfDeliveryId11, new GridConstraints(11, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId12 = new JComboBox();
        envYearOfDeliveryId12.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel99 = new DefaultComboBoxModel();
        defaultComboBoxModel99.addElement("1");
        defaultComboBoxModel99.addElement("2");
        defaultComboBoxModel99.addElement("3");
        envYearOfDeliveryId12.setModel(defaultComboBoxModel99);
        envYearOfDeliveryId12.setName("envYearOfDeliveryId12");
        ambientalPanel.add(envYearOfDeliveryId12, new GridConstraints(12, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId13 = new JComboBox();
        envYearOfDeliveryId13.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel100 = new DefaultComboBoxModel();
        defaultComboBoxModel100.addElement("1");
        defaultComboBoxModel100.addElement("2");
        defaultComboBoxModel100.addElement("3");
        envYearOfDeliveryId13.setModel(defaultComboBoxModel100);
        envYearOfDeliveryId13.setName("envYearOfDeliveryId13");
        ambientalPanel.add(envYearOfDeliveryId13, new GridConstraints(13, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId14 = new JComboBox();
        envYearOfDeliveryId14.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel101 = new DefaultComboBoxModel();
        defaultComboBoxModel101.addElement("1");
        defaultComboBoxModel101.addElement("2");
        defaultComboBoxModel101.addElement("3");
        envYearOfDeliveryId14.setModel(defaultComboBoxModel101);
        envYearOfDeliveryId14.setName("envYearOfDeliveryId14");
        ambientalPanel.add(envYearOfDeliveryId14, new GridConstraints(14, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId15 = new JComboBox();
        envYearOfDeliveryId15.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel102 = new DefaultComboBoxModel();
        defaultComboBoxModel102.addElement("1");
        defaultComboBoxModel102.addElement("2");
        defaultComboBoxModel102.addElement("3");
        envYearOfDeliveryId15.setModel(defaultComboBoxModel102);
        envYearOfDeliveryId15.setName("envYearOfDeliveryId15");
        ambientalPanel.add(envYearOfDeliveryId15, new GridConstraints(15, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envYearOfDeliveryId16 = new JComboBox();
        envYearOfDeliveryId16.setEnabled(false);
        final DefaultComboBoxModel defaultComboBoxModel103 = new DefaultComboBoxModel();
        defaultComboBoxModel103.addElement("1");
        defaultComboBoxModel103.addElement("2");
        defaultComboBoxModel103.addElement("3");
        envYearOfDeliveryId16.setModel(defaultComboBoxModel103);
        envYearOfDeliveryId16.setName("envYearOfDeliveryId16");
        ambientalPanel.add(envYearOfDeliveryId16, new GridConstraints(16, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId11 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel104 = new DefaultComboBoxModel();
        defaultComboBoxModel104.addElement("Ingeniero forestal, Ecologo o Biologo");
        envLaborSuitabilityId11.setModel(defaultComboBoxModel104);
        envLaborSuitabilityId11.setName("envLaborSuitabilityId11");
        ambientalPanel.add(envLaborSuitabilityId11, new GridConstraints(11, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId12 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel105 = new DefaultComboBoxModel();
        defaultComboBoxModel105.addElement("Trabajador social o Comunicador o Antropologo");
        envLaborSuitabilityId12.setModel(defaultComboBoxModel105);
        envLaborSuitabilityId12.setName("envLaborSuitabilityId12");
        ambientalPanel.add(envLaborSuitabilityId12, new GridConstraints(12, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId13 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel106 = new DefaultComboBoxModel();
        defaultComboBoxModel106.addElement("Ingeniero civil");
        defaultComboBoxModel106.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        defaultComboBoxModel106.addElement("Trabajador social o Comunicador o Antropologo");
        envLaborSuitabilityId13.setModel(defaultComboBoxModel106);
        envLaborSuitabilityId13.setName("envLaborSuitabilityId13");
        ambientalPanel.add(envLaborSuitabilityId13, new GridConstraints(13, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId14 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel107 = new DefaultComboBoxModel();
        defaultComboBoxModel107.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        defaultComboBoxModel107.addElement("Trabajador social o Comunicador o Antropologo");
        envLaborSuitabilityId14.setModel(defaultComboBoxModel107);
        envLaborSuitabilityId14.setName("envLaborSuitabilityId14");
        ambientalPanel.add(envLaborSuitabilityId14, new GridConstraints(14, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId15 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel108 = new DefaultComboBoxModel();
        defaultComboBoxModel108.addElement("Arquelogo");
        envLaborSuitabilityId15.setModel(defaultComboBoxModel108);
        envLaborSuitabilityId15.setName("envLaborSuitabilityId15");
        ambientalPanel.add(envLaborSuitabilityId15, new GridConstraints(15, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        envLaborSuitabilityId16 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel109 = new DefaultComboBoxModel();
        defaultComboBoxModel109.addElement("Geotecnista");
        defaultComboBoxModel109.addElement("Ingeniero civil");
        defaultComboBoxModel109.addElement("Ing. De minas, Ing. Geologo,Geologo,Ing. Civil,Ing. Ambiental");
        envLaborSuitabilityId16.setModel(defaultComboBoxModel109);
        envLaborSuitabilityId16.setName("envLaborSuitabilityId16");
        ambientalPanel.add(envLaborSuitabilityId16, new GridConstraints(16, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        configPanel = new JPanel();
        configPanel.setLayout(new GridLayoutManager(15, 2, new Insets(5, 5, 5, 5), -1, -1));
        groupPanel.addTab("Configuración", configPanel);
        configPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        timer3 = new JTextField();
        timer3.setName("timer3");
        configPanel.add(timer3, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer2 = new JTextField();
        timer2.setName("timer2");
        configPanel.add(timer2, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer1 = new JTextField();
        timer1.setName("timer1");
        configPanel.add(timer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer9 = new JTextField();
        timer9.setName("timer9");
        configPanel.add(timer9, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer8 = new JTextField();
        timer8.setName("timer8");
        configPanel.add(timer8, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer7 = new JTextField();
        timer7.setName("timer7");
        configPanel.add(timer7, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer6 = new JTextField();
        timer6.setName("timer6");
        configPanel.add(timer6, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer5 = new JTextField();
        timer5.setName("timer5");
        configPanel.add(timer5, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer13 = new JTextField();
        timer13.setName("timer13");
        configPanel.add(timer13, new GridConstraints(12, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer14 = new JTextField();
        timer14.setName("timer14");
        configPanel.add(timer14, new GridConstraints(13, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer15 = new JTextField();
        timer15.setName("timer15");
        configPanel.add(timer15, new GridConstraints(14, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer12 = new JTextField();
        timer12.setName("timer12");
        configPanel.add(timer12, new GridConstraints(11, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer11 = new JTextField();
        timer11.setName("timer11");
        configPanel.add(timer11, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer4 = new JTextField();
        timer4.setName("timer4");
        configPanel.add(timer4, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        timer10 = new JTextField();
        timer10.setName("timer10");
        configPanel.add(timer10, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), new Dimension(50, -1), 0, false));
        final JLabel label51 = new JLabel();
        label51.setText("Timer 1 - menu lateral");
        configPanel.add(label51, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label52 = new JLabel();
        label52.setText("Timer 2 - seleccion PIN*");
        configPanel.add(label52, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label53 = new JLabel();
        label53.setText("Timer 3 - carga mineral*");
        configPanel.add(label53, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label54 = new JLabel();
        label54.setText("Timer 4 - seleccion mineral*");
        configPanel.add(label54, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label55 = new JLabel();
        label55.setText("Timer 5 - seleccion tipo mapa");
        configPanel.add(label55, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label56 = new JLabel();
        label56.setText("Timer 6 - entra mapa*");
        configPanel.add(label56, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label57 = new JLabel();
        label57.setText("Timer 15 - profesional");
        configPanel.add(label57, new GridConstraints(14, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label58 = new JLabel();
        label58.setText("Timer 14 - tag economico");
        configPanel.add(label58, new GridConstraints(13, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label59 = new JLabel();
        label59.setText("Timer 13 - grupo etnico*");
        configPanel.add(label59, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label60 = new JLabel();
        label60.setText("Timer 12 - sel tec");
        configPanel.add(label60, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label61 = new JLabel();
        label61.setText("Timer 11 - pri sel / Tipo de minería");
        configPanel.add(label61, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label62 = new JLabel();
        label62.setText("Timer 10 - tag info");
        configPanel.add(label62, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label63 = new JLabel();
        label63.setText("Timer 9 - sale mapa");
        configPanel.add(label63, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label64 = new JLabel();
        label64.setText("Timer 8 - cargar area*");
        configPanel.add(label64, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label65 = new JLabel();
        label65.setText("Timer 7 - ruta mapa*");
        configPanel.add(label65, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        filesPanel = new JPanel();
        filesPanel.setLayout(new GridLayoutManager(13, 3, new Insets(0, 0, 0, 0), -1, -1));
        groupPanel.addTab("Archivos", filesPanel);
        final JLabel label66 = new JLabel();
        label66.setText("Archivo Ambiental (.pdf)");
        filesPanel.add(label66, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pdfCert = new JTextField();
        pdfCert.setName("pdfCert");
        filesPanel.add(pdfCert, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label67 = new JLabel();
        label67.setText("Archivo Geográfico (.zip)");
        filesPanel.add(label67, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pdfGeo = new JTextField();
        pdfGeo.setName("pdfGeo");
        filesPanel.add(pdfGeo, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        seleccionarBtn = new JButton();
        seleccionarBtn.setText("Seleccionar");
        filesPanel.add(seleccionarBtn, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarBtn2 = new JButton();
        seleccionarBtn2.setText("Seleccionar");
        filesPanel.add(seleccionarBtn2, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label68 = new JLabel();
        label68.setText("Certificado de existencia y representación legal");
        filesPanel.add(label68, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label69 = new JLabel();
        label69.setText("Fotococopia documento de identificacion");
        filesPanel.add(label69, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label70 = new JLabel();
        label70.setText("Fotocopia Tarjeta Profesional del Contador");
        filesPanel.add(label70, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        file0 = new JTextField();
        filesPanel.add(file0, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file1 = new JTextField();
        filesPanel.add(file1, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file2 = new JTextField();
        filesPanel.add(file2, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file3 = new JTextField();
        filesPanel.add(file3, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file4 = new JTextField();
        filesPanel.add(file4, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file5 = new JTextField();
        filesPanel.add(file5, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file6 = new JTextField();
        filesPanel.add(file6, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file7 = new JTextField();
        filesPanel.add(file7, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        seleccionarButton = new JButton();
        seleccionarButton.setText("Seleccionar");
        filesPanel.add(seleccionarButton, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton1 = new JButton();
        seleccionarButton1.setText("Seleccionar");
        filesPanel.add(seleccionarButton1, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton2 = new JButton();
        seleccionarButton2.setText("Seleccionar");
        filesPanel.add(seleccionarButton2, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton3 = new JButton();
        seleccionarButton3.setText("Seleccionar");
        filesPanel.add(seleccionarButton3, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton4 = new JButton();
        seleccionarButton4.setText("Seleccionar");
        filesPanel.add(seleccionarButton4, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton5 = new JButton();
        seleccionarButton5.setText("Seleccionar");
        filesPanel.add(seleccionarButton5, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton6 = new JButton();
        seleccionarButton6.setText("Seleccionar");
        filesPanel.add(seleccionarButton6, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton7 = new JButton();
        seleccionarButton7.setText("Seleccionar");
        filesPanel.add(seleccionarButton7, new GridConstraints(10, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label71 = new JLabel();
        label71.setText("Declaración de renta ");
        filesPanel.add(label71, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label72 = new JLabel();
        label72.setText("Registro Único Tributario DIAN/RUT actualizado");
        filesPanel.add(label72, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label73 = new JLabel();
        label73.setText("Estados Financieros Propios Certificados  ");
        filesPanel.add(label73, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label74 = new JLabel();
        label74.setText("Certificado de existencia y representación legal");
        filesPanel.add(label74, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label75 = new JLabel();
        label75.setText("Fotocopia tarjeta profesional");
        filesPanel.add(label75, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        agregarButton = new JButton();
        agregarButton.setText("Agregar");
        filesPanel.add(agregarButton, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panelScroll = new JScrollPane();
        filesPanel.add(panelScroll, new GridConstraints(12, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panelScroll.setViewportView(panel2);
        final Spacer spacer1 = new Spacer();
        filesPanel.add(spacer1, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        filesPanel.add(spacer2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        filesPanel.add(spacer3, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(12, 3, new Insets(0, 0, 0, 0), -1, -1));
        groupPanel.addTab("Doble Solicitante", panel3);
        secondSol = new JCheckBox();
        secondSol.setText("Activar");
        panel3.add(secondSol, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label76 = new JLabel();
        label76.setText("Solicitante");
        panel3.add(label76, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label77 = new JLabel();
        label77.setText("Solicitante Id");
        panel3.add(label77, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label78 = new JLabel();
        label78.setText("Activo corriente");
        panel3.add(label78, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label79 = new JLabel();
        label79.setText("Pasivo corriente");
        panel3.add(label79, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label80 = new JLabel();
        label80.setText("Activo total");
        panel3.add(label80, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label81 = new JLabel();
        label81.setText("Pasivo total");
        panel3.add(label81, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        currentAssetId1 = new JTextField();
        panel3.add(currentAssetId1, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        currentLiabilitiesId1 = new JTextField();
        panel3.add(currentLiabilitiesId1, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        totalAssetId1 = new JTextField();
        panel3.add(totalAssetId1, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        totalLiabilitiesId1 = new JTextField();
        panel3.add(totalLiabilitiesId1, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        applicantName = new JTextField();
        panel3.add(applicantName, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        applicantNameId = new JTextField();
        panel3.add(applicantNameId, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        declareIndId1 = new JCheckBox();
        declareIndId1.setText("Declarante");
        panel3.add(declareIndId1, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label82 = new JLabel();
        label82.setText("Certificado de existencia");
        panel3.add(label82, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label83 = new JLabel();
        label83.setText("Estados Financieros Propios");
        panel3.add(label83, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label84 = new JLabel();
        label84.setText("Registro Único Tributario ");
        panel3.add(label84, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label85 = new JLabel();
        label85.setText(" Declaración de renta");
        panel3.add(label85, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        file8 = new JTextField();
        panel3.add(file8, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file9 = new JTextField();
        panel3.add(file9, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file10 = new JTextField();
        panel3.add(file10, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        file11 = new JTextField();
        panel3.add(file11, new GridConstraints(11, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        seleccionarButton8 = new JButton();
        seleccionarButton8.setText("Seleccionar");
        panel3.add(seleccionarButton8, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton9 = new JButton();
        seleccionarButton9.setText("Seleccionar");
        panel3.add(seleccionarButton9, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton10 = new JButton();
        seleccionarButton10.setText("Seleccionar");
        panel3.add(seleccionarButton10, new GridConstraints(10, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        seleccionarButton11 = new JButton();
        seleccionarButton11.setText("Seleccionar");
        panel3.add(seleccionarButton11, new GridConstraints(11, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(8, 1, new Insets(5, 5, 5, 5), -1, -1));
        rootPanel.add(panel4, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        guardarButton = new JButton();
        guardarButton.setText("Guardar");
        panel4.add(guardarButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paso1Button = new JButton();
        paso1Button.setText("Paso 1");
        panel4.add(paso1Button, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paso2Button = new JButton();
        paso2Button.setText("Paso 2");
        panel4.add(paso2Button, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paso3Button = new JButton();
        paso3Button.setText("Paso 3");
        panel4.add(paso3Button, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paso4Button = new JButton();
        paso4Button.setText("Paso 4");
        panel4.add(paso4Button, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        loginButton = new JButton();
        loginButton.setText("Login");
        panel4.add(loginButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ejecutarButton = new JButton();
        ejecutarButton.setText("Ejecutar");
        panel4.add(ejecutarButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        paso5Button = new JButton();
        paso5Button.setText("Paso 5");
        panel4.add(paso5Button, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }

}
