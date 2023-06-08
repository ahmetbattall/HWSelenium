package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    public static void main(String[] args) {

        String url= "https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        // task1: print animal on screen
        // and select Babycat from drop down

      // step1:  //as the webElement is inside an iframe
        //first we need to switch to it

        driver.switchTo().frame(1);

      WebElement animals= driver.findElement(By.xpath("//b[text()='Animals :']"));
      System.out.println(animals.getText());

     WebElement animalsDD =driver.findElement(By.xpath("//select[@id='animals']"));
        Select select= new Select(animalsDD);
        select.selectByVisibleText("Baby Cat");

        // switch the focus to the main page

        driver.switchTo().defaultContent();

        // switch to frame containing text box

        driver.switchTo().frame("frame1");
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Abracadabra");

        //click on the checkbox
       WebElement frame3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();




    }
}
