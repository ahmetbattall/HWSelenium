package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiDD extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url= "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        // is to select multiple options from multiple dropdown
        // approach

       WebElement DD= driver.findElement(By.xpath("//select[@name='States']"));
//     create an object of the select class and pass in the parameters the element dropdown
        Select sel= new Select(DD);

        //check if the dropdown multiselect
       boolean isMul=sel.isMultiple();
       System.out.println("the dropdown is multiselect : " + isMul);

       //select by visible text
        sel.selectByVisibleText("California");

        //select by value
        sel.selectByValue("Ohio");

        //select by index
        sel.selectByIndex(7);

        Thread.sleep(2000);

        // deselect methods also available for multi select drop down
        sel.deselectByVisibleText("Ohio");








    }

}
