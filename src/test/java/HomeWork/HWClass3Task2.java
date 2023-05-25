package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass3Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.cssSelector("input[name=txtUsername]"));
        userName.sendKeys("Admin");

       WebElement loginBtn= driver.findElement(By.cssSelector("input[name=Submit]"));
        loginBtn.click();

      WebElement textPassword= driver.findElement(By.cssSelector("span[id=spanMessage]"));
        System.out.println( textPassword.getText());

        Thread.sleep(1000);

        driver.quit();

    }
}
