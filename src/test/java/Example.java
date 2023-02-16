package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    @Test
    public void test(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://outlook.office365.com/mail/");
        driver.findElement(By.name("loginfmt")).sendKeys("2000030273@kluniversity.in");
        driver.findElement(By.name("commit")).click();
        //driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.id("password")).sendKeys("Nithin12@");
        //driver.findElement(By.name("commit")).click();
        driver.findElement(By.id("idSIButton9")).click();
        driver.findElement(By.tagName("h1"));
        driver.findElement(By.className("header-logo"));
        driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Create an account")).click();
    }

}
