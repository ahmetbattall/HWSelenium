package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver = new ChromeDriver();

        //navigate to the HRMS
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        // maximize the screen
        driver.manage().window().maximize();

        // find the element
        //They both the same
        // driver.findElement(By.id("txtUsername")).sendKeys("Admin")
       WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));

       userNameTextBox.sendKeys("Admin");

       //slow down so ı can observe it
        Thread.sleep(2000);

        // after sending the username to the textbox clear the text box
        userNameTextBox.clear();

        // send it again
        userNameTextBox.sendKeys("Admin");

        //find the password
        WebElement pass = driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        // find the login button
       WebElement loginBtn =  driver.findElement(By.className("button"));
       loginBtn.click();

       driver.findElement(By.partialLinkText("Recru")).click();

       // get the welcome message
       WebElement message= driver.findElement(By.linkText("Welcome Admin"));
       String text= message.getText();
        System.out.println(text);

    }
}
