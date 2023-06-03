import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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

        try {
            WebDriverManager.chromedriver().setup();
            //System.setProperty("webdriver.chrome.driver", props.getProperty("webdriver"));
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            this.driver.get(props.getProperty("url"));
        } catch (Exception e) {

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

        JButton button = new JButton("Contrato de concesión");
        button.addActionListener(e -> {
            scrollPane.setViewportView(anmForm.getRootPanel());
        });
        menuBar.add(button);

        button = new JButton("Concesión diferencial");
        button.addActionListener(e -> {
            scrollPane.setViewportView(diferencialForm.getRootPanel());
        });
        menuBar.add(button);

        button = new JButton("Configuración");
        button.addActionListener(e -> {
            scrollPane.setViewportView(configurationForm.getRootPanel());
        });
        menuBar.add(button);

        setJMenuBar(menuBar);

        ImageIcon img = new ImageIcon("Resources/Button-Play-icon.png");
        setIconImage(img.getImage());
        setPreferredSize(new Dimension(1100, 700));

        setTitle("Radicador v. 3.0");
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
