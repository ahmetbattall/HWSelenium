package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url= "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement alertBtn1 =driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertBtn1.click();

        Thread.sleep(2000);

        // switch the focus of the driver to the alert
       Alert confirmationAlert1 = driver.switchTo().alert();
       confirmationAlert1.accept();

       Thread.sleep(1000);

       // find the other alert button and click on it
        WebElement alert2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();

        Thread.sleep(1000);

       Alert confirmationAlert2= driver.switchTo().alert();
        confirmationAlert2.dismiss();



    }
}
