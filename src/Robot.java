import org.openqa.selenium.WebElement;

public interface Robot {

    void stepOne() throws InterruptedException;
    void stepTwo() throws InterruptedException;
    void stepThree() throws InterruptedException;
    void stepFour() throws InterruptedException;
    void executeANMLogin() throws InterruptedException;
    WebElement waitElement(String search, String type, String timer) throws InterruptedException;
}
