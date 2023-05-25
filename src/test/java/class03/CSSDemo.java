package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        //because the DOM does not have firstName by default,it only shows up after clicking
        //we add sleep
        Thread.sleep(2000);

        WebElement fName= driver.findElement(By.cssSelector("input[name=firstname]"));
      fName.sendKeys("Moazzam");




    }
}
