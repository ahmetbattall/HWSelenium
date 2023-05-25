package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ahmet");
       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Battal");

       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Ahmetbttlll@gmail.com");
       driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Ahmetbttlll@gmail.com");
       driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("AlooooNameeerr");

       Thread.sleep(1000);
       driver.quit();



    }
}
