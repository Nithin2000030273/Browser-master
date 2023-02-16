package Browser;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static class Exampleurl {
        @Test
        public void test(){
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://outlook.office365.com/mail/");
            driver.findElement(By.id("login_field")).sendKeys("2000030273@kluniversity.in");
            driver.findElement(By.name("commit")).click();
        }

    }
}
