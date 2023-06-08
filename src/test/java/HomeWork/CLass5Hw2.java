package HomeWork;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CLass5Hw2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url ="https://chercher.tech/practice/frames";
        String browser="chrome";

        openBrowserAndLaunchApplication(url,browser);
        driver.switchTo().frame(1);

       WebElement animals= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(animals);

        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        WebElement textBox =driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Ahmet");

        Thread.sleep(2000);
        driver.quit();



    }
}
