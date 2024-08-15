package main.resources.java.com.robot.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class RobotSolicitud extends RobotConcesion{

    public RobotSolicitud(ChromeDriver driver, Properties props){

        super(driver,props);
    }

    public void radicarSolicitudEspecial() throws InterruptedException {

        this.executeANMLogin();

        WebElement submenu = driver.findElement(By.xpath("//a[contains(text(),'Radicar solicitud de Área de Reserva Especial')]"));
        submenu.click();

        WebElement buttonNext2 = waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", "path", "timer9");
        buttonNext2.click();

        //Ingresar detalles del área
        WebElement btnMineral = waitElement(".btn-default", "css", "timer3");
        btnMineral.click();

        WebElement labelMineral = waitElement("mineral", "link", "timer4");
        labelMineral.click();

    }
}
