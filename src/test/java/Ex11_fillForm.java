import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex11_fillForm {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vinaysh\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("firstName");

        WebElement secondName = driver.findElement(By.id("last-name"));
        secondName.sendKeys("lastName");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("jobName");

        WebElement education = driver.findElement(By.id("radio-button-3"));
        education.click();

        WebElement sex = driver.findElement(By.id("checkbox-1"));
        sex.click();

        driver.findElement(By.cssSelector("option[value='4']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("03/03/2024");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        WebElement submitButton = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement alert = wait.until((ExpectedConditions.
                visibilityOfElementLocated(By.className("alert")));

        String alertText = alert.getText();
        AssertEq
    }
