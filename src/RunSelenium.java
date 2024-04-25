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

            showMessageDialog(null, "Error configuring web driver: " + e.getMessage());
        }
        configurationForm = new ConfigurationForm(props);
        anmForm = new AnmForm(props, driver);
        diferencialForm = new Diferencial(props, driver);

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
