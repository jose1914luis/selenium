import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.intellij.uiDesigner.core.GridConstraints;


import static javax.swing.JOptionPane.showMessageDialog;

public class AnmForm {

    public JButton loginButton;
    public JButton ejecutarButton;
    public JButton paso1Button;
    public JButton paso2Button;
    public JButton paso3Button;
    public JButton paso4Button;
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
    //endregion
    private ChromeDriver driver;
    private Properties props;
    private RobotConcesion robotConcesion;
    // Asumiendo que esto es parte de una clase que maneja la UI
    private ArrayList<JTextField> textFields = new ArrayList<>();
    private ArrayList<JComboBox> comboBoxs = new ArrayList<>();


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


            props.setProperty("declareIndId0", declareIndId0.getSelectedItem().toString());
            props.setProperty("additionalEthnicGroupsInSelectedAreaIndId", additionalEthnicGroupsInSelectedAreaIndId.getSelectedItem().toString());

            for (int i = 0; i < 17; i++) {

                if (i < 15) {
                    Util.setPropsValue(props, configPanel, "timer" + (i + 1), Constans.componentType.JTEXTFIELD);
                }

                Util.setPropsValue(props, explorerPanel, Constans.YEAROFEXECUTIONID + i, Constans.componentType.JCOMBOBOX);
                Util.setPropsValue(props, explorerPanel, Constans.YEAROFDELIVERYID + i, Constans.componentType.JCOMBOBOX);
                Util.setPropsValue(props, explorerPanel, Constans.LABORSUITABILITYID + i, Constans.componentType.JCOMBOBOX);

                Util.setPropsValue(props, ambientalPanel, Constans.ENVYEAROFEXECUTIONID + i, Constans.componentType.JCOMBOBOX);
                Util.setPropsValue(props, ambientalPanel, Constans.ENVYEAROFDELIVERYID + i, Constans.componentType.JCOMBOBOX);
                Util.setPropsValue(props, ambientalPanel, Constans.ENVLABORSUITABILITYID + i, Constans.componentType.JCOMBOBOX);
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
            props.setProperty("pdfCert", pdfCert.getText());
            props.setProperty("pdfGeo", pdfGeo.getText());

            props.setProperty("file0", file0.getText());
            props.setProperty("file1", file1.getText());
            props.setProperty("file2", file2.getText());
            props.setProperty("file3", file3.getText());
            props.setProperty("file4", file4.getText());
            props.setProperty("file5", file5.getText());
            props.setProperty("file6", file6.getText());
            props.setProperty("file7", file7.getText());


            for (int i = 0; i < textFields.size(); i++) {
                // Aquí asumimos que tienes una instancia de Properties llamada props
                // y que i+1 es el identificador único para cada campo de texto
                props.setProperty("generatedField" + (i + 1), textFields.get(i).getText());
                props.setProperty("generatedCombo" + (i + 1), comboBoxs.get(i).getSelectedItem().toString());

            }

            saveProperties(props);

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
                Component[] components = new Component[]{comboBox, textField, button, deleteButton};
                for (Component component : components) {
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
                props.remove(textFieldKey);
                props.remove(comboBoxKey);
                // Aquí asumimos que tienes un método para guardar las propiedades en el archivo
                saveProperties(props);
            });
            innerPanel.add(deleteButton, gbc);

            // Actualiza el panel y el JScrollPane
            innerPanel.revalidate();
            innerPanel.repaint();
            panelScroll.revalidate();
            panelScroll.repaint();

        });


    }

    public void saveProperties(Properties props) {
        try (FileOutputStream out = new FileOutputStream(Constans.ANM_PROPERTIES)) {
            props.store(out, "Updated properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
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

        pdfCert.setText(props.getProperty("pdfCert"));
        pdfGeo.setText(props.getProperty("pdfGeo"));


        // Reconstruye la interfaz de usuario
        for (int i = 1; props.containsKey("generatedField" + i); i++) {

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
            String comboBoxValue = props.getProperty(comboBoxKey, ""); // Default a cadena vacía si no existe
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
            String textFieldValue = props.getProperty(textFieldKey, ""); // Default a cadena vacía si no existe
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
                Component[] components = new Component[]{comboBox, textField, button, deleteButton};
                for (Component component : components) {
                    innerPanel.remove(component);
                }
                innerPanel.revalidate();
                innerPanel.repaint();

                // Elimina los componentes de las listas
                textFields.remove(textField);
                comboBoxs.remove(comboBox);

                // Elimina las entradas de las propiedades y actualiza el archivo si es necesario
                props.remove(textFieldKey);
                props.remove(comboBoxKey);
                // Aquí asumimos que tienes un método para guardar las propiedades en el archivo
                saveProperties(props);
            });
            innerPanel.add(deleteButton, gbc);

            // Actualiza el panel y el JScrollPane
            innerPanel.revalidate();
            innerPanel.repaint();

        }

        panelScroll.revalidate();
        panelScroll.repaint();


        file0.setText(props.getProperty("file0"));
        file1.setText(props.getProperty("file1"));
        file2.setText(props.getProperty("file2"));
        file3.setText(props.getProperty("file3"));
        file4.setText(props.getProperty("file4"));
        file5.setText(props.getProperty("file5"));
        file6.setText(props.getProperty("file6"));
        file7.setText(props.getProperty("file7"));


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

                Util.setComponentsValue(props, configPanel, "timer" + (i + 1), Constans.componentType.JTEXTFIELD);
            }

            Util.setComponentsValue(props, explorerPanel, Constans.YEAROFEXECUTIONID + i, Constans.componentType.JCOMBOBOX);
            Util.setComponentsValue(props, explorerPanel, Constans.YEAROFDELIVERYID + i, Constans.componentType.JCOMBOBOX);
            Util.setComponentsValue(props, explorerPanel, Constans.LABORSUITABILITYID + i, Constans.componentType.JCOMBOBOX);


            Util.setComponentsValue(props, ambientalPanel, Constans.ENVYEAROFEXECUTIONID + i, Constans.componentType.JCOMBOBOX);
            Util.setComponentsValue(props, ambientalPanel, Constans.ENVYEAROFDELIVERYID + i, Constans.componentType.JCOMBOBOX);
            Util.setComponentsValue(props, ambientalPanel, Constans.ENVLABORSUITABILITYID + i, Constans.componentType.JCOMBOBOX);
        }


    }


}
