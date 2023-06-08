package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {
        String url= "http://accounts.google.com/signup";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

       WebElement helpBTN= driver.findElement(By.linkText("Help"));
       helpBTN.click();

      WebElement privacyBTN = driver.findElement(By.xpath("//a[text()='Privacy']"));
      privacyBTN.click();

      // get the window handle of the main page and print on console
      //also save it for later use

      String mainPageHandle=driver.getWindowHandle();
        System.out.println("Main page handle is : " + mainPageHandle );

      // get all the window handles and print the titles associated with each window handle
      // on the console

        //switch the focus of
      Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
           String title=driver.getTitle();
           if (title.equals("Google Account Help")){
               break;
           }
          //  System.out.println("the title associated with " + handle + " is " + title );
        }
        //when the focus is shifted to correct page
        System.out.println("The current page under focus is :" + driver.getTitle());

        //after switching to the page google account help, we can deal with any element we want to in


        //switch my focus back to the main page
        driver.switchTo().window(mainPageHandle);

        // check the focus
        System.out.println("the focus is on : " + driver.getTitle());





    }
}
