import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static javax.swing.JOptionPane.showMessageDialog;

public class RunSelenium extends JFrame {

    private static Properties props = new Properties();

    private static ChromeDriver driver;

    private AnmForm anmForm;
    private ConfigurationForm configurationForm;
    private Diferencial diferencialForm;

    public RunSelenium() throws IOException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        FileInputStream in = new FileInputStream("anm.properties");
        props.load(in);
        in.close();

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        try{
            System.setProperty("webdriver.chrome.driver", props.getProperty("webdriver"));
            driver = new ChromeDriver();
            this.driver.get(props.getProperty("url"));
        }catch (Exception e){

            showMessageDialog(null, "Error configuring web driver");
        }
        configurationForm = new ConfigurationForm(props);
        anmForm = new AnmForm(props, driver);
        diferencialForm = new Diferencial(props, driver);

        JScrollPane scrollPane = new JScrollPane(configurationForm.getRootPanel());
        add(scrollPane);

        //Where the GUI is created:
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Radicar");
        menuBar.add(menu);

        menuItem = new JMenuItem("Configuración");
        menuItem.getAccessibleContext().setAccessibleDescription("Configuración general del sistema");
        menuItem.addActionListener(e -> {

            scrollPane.setViewportView(configurationForm.getRootPanel());
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Contrato de concesión");
        menuItem.getAccessibleContext().setAccessibleDescription("Radicar solicitud de propuesta de contrato de concesión");
        menuItem.addActionListener(e -> {

            scrollPane.setViewportView(anmForm.getRootPanel());
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Concesión diferencial");
        menuItem.getAccessibleContext().setAccessibleDescription("Radicar solicitud de contrato de concesión diferencial");
        menuItem.addActionListener(e -> {

            scrollPane.setViewportView(diferencialForm.getRootPanel());
        });
        menu.add(menuItem);

        setJMenuBar(menuBar);

        ImageIcon img = new ImageIcon("Resources/Button-Play-icon.png");
        setIconImage(img.getImage());
        setPreferredSize(new Dimension(1100, 700));

        setTitle("Radicador v. 2.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);








    }



}
