import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium {
    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jose\\Downloads\\chromedriver_win32\\chromedriver.exe");


        ChromeDriver driver = new ChromeDriver();

        driver.get("http://ambprubsigm.anm.gov.co/sigm/externalLogin?lang=es");

        //WebElement user=driver.findElement(By.xpath("//input[@id='username']"));

        /**********************************************************
         * Login
         **********************************************************/
        WebElement user=driver.findElementById("username");
        user.sendKeys("70146");

        WebElement password = driver.findElementById("password");
        password.sendKeys("Jvelasquez1-");

        //element.sendKeys("abc@gmail.com");
        WebElement buttonLogin=driver.findElementById("loginButton");
        buttonLogin.click();

        /**********************************************************
         * Panel
         **********************************************************/
        Thread.sleep(5000);

        WebElement menu = driver.findElement(By.xpath("//li[4]/a[2]/span"));
        menu.click();

        WebElement submenu = driver.findElement(By.linkText("Radicar solicitud de propuesta de contrato de concesión"));
        submenu.click();

        Thread.sleep(2000);

        /**********************************************************
         * Seleccionar usuario
         **********************************************************/

        Select selectPIN = new Select(driver.findElementById("pinSlctId"));
        selectPIN.selectByVisibleText("2701406, 06/NOV/2020");

        WebElement buttonNext1 =driver.findElementByCssSelector(".btn > .ng-binding");
        buttonNext1.click();

        Thread.sleep(3000);
        /**********************************************************
         * Ingresar detalles del área
         **********************************************************/
        WebElement btnMineral = driver.findElementByCssSelector(".btn-default");
        btnMineral.click();

        Thread.sleep(1000);
        WebElement labelMineral = driver.findElement(By.linkText("CARBÓN"));
        labelMineral.click();

        Select selectArea = new Select(driver.findElementById("areaOfConcessionSlctId"));
        selectArea.selectByVisibleText("Otro tipo de terreno");

        Thread.sleep(2000);

        WebElement tabMap = driver.findElementByCssSelector(".uib-tab:nth-child(2) > .nav-link > .ng-binding");
        tabMap.click();

        Select selectTypeCoord = new Select(driver.findElementById("selectedCellInputMethodSlctId"));
        selectTypeCoord.selectByVisibleText("Cargando archivo 'Shapefile' o 'KML'");

        WebElement btnMap = driver.findElementById("uploadShapeFileMapButtonId");
        btnMap.click();

        Thread.sleep(25000);

        driver.switchTo().frame("mapIframeId");
        Select selectTypeMap = new Select(driver.findElementByXPath("//select[@data-gcx-form-item='ListBox1']"));
        selectTypeMap.selectByVisibleText("Shapefile");

        WebElement btnContinue = driver.findElementByCssSelector("form:nth-child(2) .button");
        btnContinue.click();

        //driver.switchTo().frame("mapIframeId");
        Thread.sleep(2000);
        WebElement pikerLoad = driver.findElementByXPath("//input[@data-gcx-form-item='FilePicker1']");
        pikerLoad.sendKeys(" C:\\Users\\jose\\Downloads\\RI9-15531 Pros.zip");

        WebElement btnLoad = driver.findElementByCssSelector("form:nth-child(2) .button");
        btnLoad.click();

        Thread.sleep(6000);

        driver.switchTo().defaultContent();
        WebElement btnConfirm = driver.findElementById("confirmBtnId");
        btnConfirm.click();

        WebElement buttonNext2 =driver.findElementByXPath("//span[@class='btn-label ng-binding'][contains(text(),'Continuar')]");
        buttonNext2.click();

        Thread.sleep(3000);

        /**********************************************************
         * Información técnica
         **********************************************************/

        WebElement tabInfoTec = driver.findElementByXPath(" //div[@id='main']//li[3]//a[1]");
        tabInfoTec.click();
    }
}
