package main.resources.java.com.robot.core.services;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Service
public class AnmPropertiesService {

    private Properties properties;

    @EventListener(ContextRefreshedEvent.class)
    public void init() throws IOException {
        properties = new Properties();
        FileInputStream in = new FileInputStream("anm.properties");
        properties.load(in);
        in.close();
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public Properties getAllProperties() {
        return properties;
    }
}
