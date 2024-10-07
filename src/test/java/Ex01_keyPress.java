import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_keyPress {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vinaysh\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");

       WebDriver driver = new ChromeDriver();
       driver.get("https://formy-project.herokuapp.com/keypress");
       Thread.sleep(1000);

       WebElement enterFullName = driver.findElement(By.id("name"));
       enterFullName.sendKeys("Vinay");

       WebElement clickButton = driver.findElement(By.id("button"));
       clickButton.click();

       driver.quit();

    }
}
