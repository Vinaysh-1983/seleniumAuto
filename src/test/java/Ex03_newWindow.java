import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03_newWindow {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vinaysh\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTab = driver.findElement(By.id("new-tab-button"));
        newTab.click();

        Thread.sleep(2000);
        String getHandles = driver.getWindowHandle();

        for(String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(getHandles);
        Thread.sleep(2000);


        driver.quit();
    }
}
