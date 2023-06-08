package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTable2 extends CommonMethods {
    public static void main(String[] args) {

        String url ="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        //        click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        // get all the ids from the table into the list
      List<WebElement> allIds= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

      // iterate through the ids and find id 53502A and click on associated check box

        for (int i = 0; i < allIds.size(); i++) {
          String id= allIds.get(i).getText();
          if (id.equals("53502A")){
              System.out.println("click on the check box row number : " + (i+1));
            WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]"));
            checkBox.click();
          }


        }








    }
}
