package main.java.com.robot.services;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.java.com.robot.Constans;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static main.java.com.robot.Constans.SelectorType.ID;
import static main.java.com.robot.Constans.SelectorType.LINK;

@Service
public class WebDriverService {

    private final WebDriver driver;
    private final AnmPropertiesService propertiesService;

    @Autowired
    public WebDriverService(AnmPropertiesService propertiesService) throws Exception {
        this.propertiesService = propertiesService;
        this.driver = setupWebDriver();
    }

    private WebDriver setupWebDriver() throws Exception {
        try {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-gpu"); // Desactiva el uso de la GPU para rendimiento en algunos entornos
            options.addArguments("--no-sandbox"); // Necesario para entornos Linux y mejora la estabilidad
            options.addArguments("--disable-dev-shm-usage"); // Evita problemas de memoria compartida en contenedores
            options.addArguments("--disable-extensions"); // Desactiva extensiones para cargar más rápido
            options.addArguments("--start-maximized"); // Inicia el navegador maximizado para mejor visibilidad
            options.addArguments("--incognito"); // Inicia en modo incógnito para no utilizar caché
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // Para que no se detecte como bot
            options.setExperimentalOption("useAutomationExtension", false);

            return new ChromeDriver(options);
        } catch (Exception e) {
            throw new Exception("Error configuring WebDriver: " + e.getMessage(), e);
        }
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebElement findElement(By by){
        return this.driver.findElement(by);
    }

    public void sendKeys(By by, String value){

        this.driver.findElement(by).sendKeys(propertiesService.getProperties().getProperty(value));
    }

    public void selectOptionWhenReady(String elementId, String value, String type) {

        WebElement selectElement = waitElement(elementId, ID);
        int waitTime = Integer.parseInt(propertiesService.getProperties().getProperty("timerWait"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));

        if(type.equals("value")){
            wait.until(driver -> new Select(selectElement).getOptions().stream()
                    .anyMatch(option -> option.getAttribute("value").equals(value)));

            // Ahora que las opciones están cargadas, realiza la selección
            new Select(selectElement).selectByValue(value);

        } else if (type.equals("text")) {

            wait.until(driver -> new Select(selectElement).getOptions().stream()
                    .anyMatch(option -> option.getText().equals(value)));

            new Select(selectElement).selectByVisibleText(value);
        }

    }

    public WebElement waitElement(String search, Constans.SelectorType type) {
        int waitTime = Integer.parseInt(propertiesService.getProperties().getProperty("timerWait"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));

        try {
            return switch (type) {
                case ID -> wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(search)));
                case CSS -> wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(search)));
                case XPATH -> wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search)));
                case LINK -> wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(propertiesService.getProperties().getProperty(search))));
                default -> throw new IllegalArgumentException("Tipo de búsqueda no soportado: " + type);
            };
        } catch (Exception e) {
            throw new RuntimeException("Elemento no encontrado: " + search + " - Error: " + e.getMessage());
        }
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
