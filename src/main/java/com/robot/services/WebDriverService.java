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

import java.time.Duration;

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

    public WebElement waitElement(String search, Constans.SelectorType type, String timer) throws InterruptedException {
        int retries = 10;
        int waitTime = Integer.parseInt(propertiesService.getProperties().getProperty(timer));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));

        while (retries > 0) {
            try {
                return switch (type) {
                    case ID -> wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(search)));
                    case CSS -> wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(search)));
                    case XPATH -> wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(search)));
                    case LINK ->
                            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(propertiesService.getProperties().getProperty(search))));
                    default -> throw new IllegalArgumentException("Tipo de búsqueda no soportado: " + type);
                };
            } catch (Exception e) {
                System.out.println("Error encontrando el elemento: " + e.getMessage());
                retries--;
                Thread.sleep(1000); // Esperar antes de reintentar
            }
        }

        throw new RuntimeException("Elemento no encontrado después de múltiples intentos: " + search);
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
