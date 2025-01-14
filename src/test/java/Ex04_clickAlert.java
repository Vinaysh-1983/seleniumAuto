import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex04_clickAlert {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vinaysh\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");


        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(1000);
        driver.quit();
    }
}
