package HomeWork;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Class8HW1 extends CommonMethods {
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

        WebElement recBTN= driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recBTN.click();

        WebElement calender=driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
       calender.click();

        WebElement months= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select sel= new Select(months);
        sel.selectByVisibleText("Aug");

        WebElement years= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel1= new Select(years);
        sel1.selectByVisibleText("2001");


        boolean isfound=false;
        while (!isfound){
            List<WebElement> alldates=driver.findElements(By.xpath("//table/tbody/tr/td"));
            for (WebElement date : alldates) {
                String currentdate=date.getText();
                if(currentdate.equals("7")){
                    date.click();
                }
            }
            isfound=true;

        }


    }
}
