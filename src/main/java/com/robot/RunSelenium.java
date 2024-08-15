package main.java.com.robot;

import main.java.com.robot.forms.AnmForm;
import main.java.com.robot.forms.ConfigurationForm;
import main.java.com.robot.forms.Diferencial;
import main.java.com.robot.forms.Especial;
import main.java.com.robot.services.AnmPropertiesService;
import main.java.com.robot.services.WebDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import static javax.swing.JOptionPane.showMessageDialog;

@Component
public class RunSelenium extends JFrame {


    @Autowired
    public RunSelenium(Diferencial diferencialForm, Especial especialForm, AnmForm anmForm, ConfigurationForm configurationForm, WebDriverService webDriverService, AnmPropertiesService anmPropertiesService) throws IOException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        try{
            webDriverService.openUrl(anmPropertiesService.getProperty("url"));
        }catch (Exception e){

            showMessageDialog(null, "Error configuring web driver: " + e.getMessage());
        }

        JScrollPane scrollPane = new JScrollPane(configurationForm.getRootPanel());
        add(scrollPane);

        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);

        JButton button = new JButton("Contrato de concesión");
        button.addActionListener(e -> {
            scrollPane.setViewportView(anmForm.getRootPanel());
        });
        toolbar.add(button);

        toolbar.addSeparator();

        button = new JButton("Concesión diferencial");
        button.addActionListener(e -> {
            scrollPane.setViewportView(diferencialForm.getRootPanel());
        });
        toolbar.add(button);

        toolbar.addSeparator();


        button = new JButton("Radicacion especial");
        button.addActionListener(e -> {
            scrollPane.setViewportView(especialForm.getRootPanel());
        });
        toolbar.add(button);

        toolbar.addSeparator();

        button = new JButton("Configuración");
        button.addActionListener(e -> {
            scrollPane.setViewportView(configurationForm.getRootPanel());
        });
        toolbar.add(button);

        toolbar.addSeparator();

        add(toolbar, BorderLayout.NORTH);


        ImageIcon img = new ImageIcon("Resources/Button-Play-icon.png");
        setIconImage(img.getImage());

        // Obtiene el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Define las dimensiones de la ventana, manteniendo el ancho y ajustando la altura según el tamaño de la pantalla
        int windowWidth = 1100; // Ancho de la ventana
        int windowHeight = (int) screenSize.getHeight(); // Altura de la ventana

        setPreferredSize(new Dimension(windowWidth, windowHeight));

        setTitle("Radicador v. 4.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        JButton finalButton = button;
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                finalButton.requestFocus();
            }
        });
    }
}
