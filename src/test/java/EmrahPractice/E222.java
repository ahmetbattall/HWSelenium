package EmrahPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E222 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("#txtPassword"));
        password.sendKeys("Hum@nhrm123");
    }
}
