package main.java.com.robot;

import main.java.com.robot.services.AnmPropertiesService;
import main.java.com.robot.services.SmsNotificationService;
import main.java.com.robot.services.WebDriverService;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Properties;

import static main.java.com.robot.Constans.SelectorType.*;

@Component
public class RobotSolicitud{

    private final WebDriverService webDriverService;
    private AnmPropertiesService anmPropertiesService;
    private SmsNotificationService smsNotificationService;
    @Autowired
    public RobotSolicitud(SmsNotificationService smsNotificationService, WebDriverService webDriverService, AnmPropertiesService anmPropertiesService) {

        this.smsNotificationService = smsNotificationService;
        this.webDriverService = webDriverService;
        this.anmPropertiesService = anmPropertiesService;
    }

    public void radicarSolicitudEspecial() throws InterruptedException {

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer1")) * 1000L);

        WebElement menu = webDriverService.findElement(By.xpath("//a[@class='cata-collapse-click menu ng-scope']//span[@class='menu-item-parent ng-binding'][contains(text(),'Solicitudes')]"));
        menu.click();

        WebElement submenu = webDriverService.waitElement("//a[contains(text(),'Radicar solicitud de Área de Reserva Especial')]", XPATH, "timer9");
        submenu.click();

        WebElement buttonNext2 = webDriverService.waitElement("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]", XPATH, "timer9");
        buttonNext2.click();

        //Ingresar detalles del área
        WebElement btnMineral = webDriverService.waitElement(".btn-default", CSS, "timer3");
        btnMineral.click();

        WebElement labelMineral = webDriverService.waitElement("mineral", LINK, "timer4");
        labelMineral.click();

        Select selectArea = new Select(webDriverService.findElement(By.id(("areaOfConcessionSlctId"))));
        selectArea.selectByVisibleText(anmPropertiesService.getProperty("areaOfConcessionSlctId"));


        WebElement totalAssetId0 = webDriverService.findElement(By.id(("selectedApplicantInputId")));
        totalAssetId0.sendKeys(anmPropertiesService.getProperty("username"));

        //

        WebElement solicitante = webDriverService.waitElement("//a[@title='GEMA VERDE SAS (55127)']", XPATH, "timer4");
        solicitante.click();

        WebElement bntAgregar = webDriverService.findElement(By.xpath(("//button[@data-ng-click='addApplicantInfoVO(selectedApplicantInfoVO)']//i[@class='fa fa-plus']")));
        bntAgregar.click();

        Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer1")) * 1000L);


        WebElement applicantCoordinateEastingTxtId0 = webDriverService.findElement(By.id(("0applicantCoordinateEastingTxtId")));
        applicantCoordinateEastingTxtId0.sendKeys(anmPropertiesService.getProperty("0applicantCoordinateEastingTxtId"));

        WebElement applicantCoordinateEastingTxtId1 = webDriverService.findElement(By.id(("1applicantCoordinateEastingTxtId")));
        applicantCoordinateEastingTxtId1.sendKeys(anmPropertiesService.getProperty("1applicantCoordinateEastingTxtId"));

        WebElement applicantCoordinateNorthingTxtId0 = webDriverService.findElement(By.id(("0applicantCoordinateNorthingTxtId")));
        applicantCoordinateNorthingTxtId0.sendKeys(anmPropertiesService.getProperty("0applicantCoordinateNorthingTxtId"));

        WebElement applicantCoordinateNorthingTxtId1 = webDriverService.findElement(By.id(("1applicantCoordinateNorthingTxtId")));
        applicantCoordinateNorthingTxtId1.sendKeys(anmPropertiesService.getProperty("1applicantCoordinateNorthingTxtId"));

        Select selectTypeCoord = new Select(webDriverService.findElement(By.id(("selectedCellInputMethodSlctId"))));
        selectTypeCoord.selectByVisibleText(anmPropertiesService.getProperty("selectedCellInputMethodSlctId"));

        WebElement cellIdsTxtId = webDriverService.waitElement("cellIdsInptId", ID, "timer4");
        cellIdsTxtId.sendKeys(anmPropertiesService.getProperty("cells"));

        WebElement pikerFile0 = webDriverService.findElement(By.id(("p_PsraRsraMandatoryDocumentToAttachId0")));
        pikerFile0.sendKeys(anmPropertiesService.getProperty("file0"));

        WebElement pikerFile1 = webDriverService.findElement(By.id(("p_PsraRsraMandatoryDocumentToAttachId1")));
        pikerFile1.sendKeys(anmPropertiesService.getProperty("fileDescripcionCua"));

        WebElement pikerFile2 = webDriverService.findElement(By.id(("p_PsraRsraMandatoryDocumentToAttachId2")));
        pikerFile2.sendKeys(anmPropertiesService.getProperty("fileDescripcionGen"));

        WebElement pikerFile3 = webDriverService.findElement(By.id(("p_PsraRsraMandatoryDocumentToAttachId3")));
        pikerFile3.sendKeys(anmPropertiesService.getProperty("file1"));

        WebElement pikerFile4 = webDriverService.findElement(By.id(("p_PsraRsraMandatoryDocumentToAttachId4")));
        pikerFile4.sendKeys(anmPropertiesService.getProperty("fileMedios"));

        // Desplaza la página hasta el final
        JavascriptExecutor js = (JavascriptExecutor) webDriverService.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        boolean terminar = false;
        while (!terminar){
            WebElement bntContinuar =webDriverService.findElement(By.xpath("//span[normalize-space()='Continuar']"));
            bntContinuar.click();

            try{
                WebElement bntConfirmar = webDriverService.waitElement("//span[normalize-space()='Confirmar']", XPATH, "timer4");
                if (bntConfirmar != null) {
                    checkElementAndNotify();
                    terminar = true;
                }
            }catch (Exception e){

                System.out.println("El botón 'Confirmar' no existe en la página.");
            }

            Thread.sleep(Integer.parseInt(anmPropertiesService.getProperty("timer1")) * 5000L);

        }


    }
    public void checkElementAndNotify() {
        String phoneNumber = anmPropertiesService.getProperty("notificationNumber"); // Número de teléfono al que deseas enviar el SMS
        String message = "SIGMIN - URGENTE: EL ÁREA HA SIDO LIBERADA y el botón 'Confirmar' está habilitado. " +
                "Por favor, proceda a confirmar de inmediato para continuar con el proceso.";
        smsNotificationService.sendSms(phoneNumber, message);
    }


    public void executeANMLogin() throws InterruptedException {

        //login
        WebElement user = webDriverService.findElement(By.id("username"));
        user.sendKeys(anmPropertiesService.getProperty("username"));

        WebElement password = webDriverService.findElement(By.id("password"));
        password.sendKeys(anmPropertiesService.getProperty("password"));

        WebElement buttonLogin = webDriverService.findElement(By.id("loginButton"));
        buttonLogin.click();

        Thread.sleep(5000);
    }
}
