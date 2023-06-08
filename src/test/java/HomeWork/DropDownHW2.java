package HomeWork;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url= "https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

       WebElement createNewAccBTN= driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccBTN.click();
        Thread.sleep(2000);

     WebElement months= driver.findElement(By.xpath("//select[@id='month']"));

        Select sel= new Select(months);

        sel.selectByVisibleText("Aug");

       WebElement days= driver.findElement(By.xpath("//select[@id='day']"));
        Select sel1= new Select(days);
        sel1.selectByValue("7");

      WebElement years=driver.findElement(By.xpath("//select[@id='year']"));
        Select sel2= new Select(years);

        sel2.selectByVisibleText("2001");

        Thread.sleep(2000);
        driver.quit();



    }}
