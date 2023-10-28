package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class testNGExample {
    /*
testcase1:
goto syntax Hrms
enter the password and username
click login
close the browser
*/
    public  static WebDriver driver;
    @BeforeMethod
    public void SetupBrowser(){

         driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void login(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement pasword = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        pasword.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        loginBtn.click();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
