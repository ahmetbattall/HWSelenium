package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass3Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form
         */

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();

      WebElement firstName= driver.findElement(By.cssSelector("input[name='first_name']"));
      firstName.sendKeys("Ahmet");

      WebElement lastName = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Last')]"));
     lastName.sendKeys("Battal");


     WebElement email= driver.findElement(By.xpath("//input[contains(@name,'email')]"));
     email.sendKeys("Ahmetemreq@gmail.com");

     WebElement phoneNumber= driver.findElement(By.cssSelector("input[name='phone']"));
     phoneNumber.sendKeys("2131124252");

     WebElement address=driver.findElement(By.cssSelector("input[name='address']"));
     address.sendKeys("M124 block");

     WebElement city=driver.findElement(By.cssSelector("input[name$='city']"));
     city.sendKeys("Myrtle beach");

    WebElement state= driver.findElement(By.cssSelector("select[name='state']"));
    state.sendKeys("South Carolina");

    WebElement zipCode=driver.findElement(By.xpath("//input[@name='zip']"));
    zipCode.sendKeys("29577");

   WebElement webSiteDomain= driver.findElement(By.xpath("//input[@name='website']"));
    webSiteDomain.sendKeys("www.idonthaveone.com");

   WebElement hostingButton=driver.findElement(By.xpath("(//input[@name='hosting'])[1]"));
   hostingButton.click();

  WebElement projectDescription=driver.findElement(By.xpath("//textarea[@name='comment']"));
    projectDescription.sendKeys("Filling out the form");

    WebElement sendButton=driver.findElement(By.xpath("//button[text()='Send ']"));
    Thread.sleep(2000);
    sendButton.click();
    Thread.sleep(1000);

    driver.quit();





    }
}
