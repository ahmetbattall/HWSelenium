package EmrahPractice;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class E1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://omayo.blogspot.com/";
        String browser = "chrome";

        openBrowserAndLaunchApplication(url,browser);

       WebElement dropDownLeft= driver.findElement(By.xpath("//select[@id='drop1']"));

        Select sel=new Select(dropDownLeft);
        sel.selectByVisibleText("doc 3");


      WebElement textArea1=driver.findElement(By.xpath("//div[@class='widget-content']//textarea[@id='ta1']"));
      textArea1.sendKeys("Ahmet and Emrah practicing together");

        WebElement maleBtn=driver.findElement(By.cssSelector("#radio1"));
        maleBtn.click();

        //WebElement btn1= driver.findElement(By.xpath("//input[@id='alert1']"));
      //btn1.click();

      WebElement orangeBtn= driver.findElement(By.xpath("//input[@id='checkbox1']"));
      orangeBtn.click();

     WebElement blueBtn=driver.findElement(By.xpath("//input[@id='checkbox2']"));
    blueBtn.click();

   WebElement usingName= driver.findElement(By.xpath("//input[@name='textboxn']"));
    usingName.sendKeys("AhmetEmre");


    }
}
