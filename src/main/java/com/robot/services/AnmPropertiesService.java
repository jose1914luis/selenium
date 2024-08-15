package main.java.com.robot.services;

import main.java.com.robot.Constans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;

import static main.java.com.robot.Constans.ANM_PROPERTIES;

@Service
public class AnmPropertiesService {

    private static final Logger logger = LoggerFactory.getLogger(AnmPropertiesService.class);

    private final Properties properties = new Properties();
    // Definir la ruta absoluta para el archivo de propiedades
    private final String propertiesFilePath = Paths.get(System.getProperty("user.dir"), ANM_PROPERTIES).toString();

    public AnmPropertiesService() {
        try (InputStream input = new FileInputStream(propertiesFilePath)) {
            if (input == null) {
                logger.error("No se pudo encontrar el archivo {}", propertiesFilePath);
                return;
            }
            properties.load(input);
            logger.info("Archivo de propiedades cargado exitosamente.");

            // Imprimir todas las propiedades cargadas para verificar
            properties.forEach((key, value) -> logger.info("Clave: {}, Valor: {}", key, value));
        } catch (IOException ex) {
            logger.error("Error cargando el archivo de propiedades", ex);
        }
    }

    public Properties getProperties() {
        return properties;
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }

    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }

    public void saveProperties() throws IOException {
        try (FileOutputStream out = new FileOutputStream(propertiesFilePath)) {
            properties.store(out, null);
            logger.info("Propiedades guardadas exitosamente en {}", propertiesFilePath);
        } catch (IOException ex) {
            logger.error("Error guardando las propiedades en el archivo {}", propertiesFilePath, ex);
            throw ex;
        }
    }

    public void setPropsValue(JPanel panel, String value, Constans.componentType type) {
        Arrays.stream(panel.getComponents())
                .filter(component -> component.getName() != null && component.getName().equals(value))
                .forEach(component -> {
                    switch (type) {
                        case JTEXTFIELD:
                            setProperty(value, ((JTextField) component).getText());
                            break;
                        case JCOMBOBOX:
                            setProperty(value, ((JComboBox<?>) component).getSelectedItem().toString());
                            break;
                        default:
                            break;
                    }
                });
    }

    public void setComponentsValue(JPanel panel, String value, Constans.componentType type) {
        Arrays.stream(panel.getComponents())
                .filter(component -> component.getName() != null && component.getName().equals(value))
                .forEach(component -> {
                    switch (type) {
                        case JTEXTFIELD:
                            ((JTextField) component).setText(properties.getProperty(value));
                            break;
                        case JCOMBOBOX:
                            ((JComboBox<?>) component).setSelectedItem(properties.getProperty(value));
                            break;
                        case JCHECKBOX:
                            ((JCheckBox) component).setSelected(Boolean.parseBoolean(properties.getProperty(value)));
                            break;
                        default:
                            break;
                    }
                });
    }
}
