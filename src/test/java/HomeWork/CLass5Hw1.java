package HomeWork;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CLass5Hw1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url ="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";

        openBrowserAndLaunchApplication(url,browser);

       WebElement alertBox=driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
       alertBox.click();


       Alert alertThis= driver.switchTo().alert();
       Thread.sleep(2000);
       alertThis.sendKeys("hello");

        System.out.println(alertThis.getText());

        driver.quit();


    }
}
