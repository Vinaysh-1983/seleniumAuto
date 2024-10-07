import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex05_execjs {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vinaysh\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement openModal = driver.findElement(By.id("modal-button"));
        openModal.click();

        WebElement clickClose = driver.findElement(By.id("close-button"));
        WebElement clickOk = driver.findElement(By.id("ok-button"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",clickOk);

        Thread.sleep(1000);

        driver.quit();
    }
}
