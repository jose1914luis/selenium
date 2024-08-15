package main.java.com.robot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.r2dbc.R2dbcRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcTransactionManagerAutoConfiguration;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.io.IOException;

@SpringBootApplication(exclude = {
        R2dbcAutoConfiguration.class,
        R2dbcDataAutoConfiguration.class,
        R2dbcRepositoriesAutoConfiguration.class,
        R2dbcTransactionManagerAutoConfiguration.class
})
public class Principal {

    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        System.setProperty("java.awt.headless", "false");

        // Iniciar Spring Boot
        ApplicationContext context = SpringApplication.run(Principal.class, args);

        // Obtener el bean main.java.com.robot.RunSelenium desde el contexto de Spring
        RunSelenium runSelenium = context.getBean(RunSelenium.class);

        // Ahora puedes utilizar runSelenium como antes
        runSelenium.setVisible(true);
    }
}
