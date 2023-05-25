package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url= "https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        ///        click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);

        //1- find the element dropdown
        WebElement days=driver.findElement(By.xpath("//select[@id='day']"));

        //2- create an object of the class and pass in the parameters the dropdown
       Select sel= new Select(days);

        //3 - use method provided in select class to select the option that you desire
        sel.selectByVisibleText("8");

        // for observation
        Thread.sleep(2000);

        //another method
        sel.selectByValue("26");

        // for observation
        Thread.sleep(2000);

        //another method
        sel.selectByIndex(0);
    }
}
