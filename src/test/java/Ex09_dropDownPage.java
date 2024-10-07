import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ex09_dropDownPage {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vinaysh\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuButton"));
        dropdownElement.click();

        WebElement KeyandMousePress =
                driver.findElement(By.partialLinkText("Key and Mouse Press"));
        KeyandMousePress.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement enterText = driver.findElement(By.id("name"));
        enterText.sendKeys("myName");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement clickButton = driver.findElement(By.id("button"));
        clickButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.quit();
    }
}
