package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url= "https://www.facebook.com/";
        String browser="chrome";

        // declaring the implicit wait in the start as it is global wait, and we want it
        // to be implemented on all webelements
        openBrowserAndLaunchApplication(url,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // click on create new account

        WebElement createNewAccountBTN=driver.findElement(By.xpath("//a[text()='Create new account']"));
       createNewAccountBTN.click();

        //        Send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("abracadabra",firstName);








    }
}
