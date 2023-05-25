package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Ahmet");
        driver.findElement(By.id("customer.lastName")).sendKeys("Battal");
        driver.findElement(By.name("customer.address.street")).sendKeys("Crenshaw blvd");
        driver.findElement(By.name("customer.address.state")).sendKeys("CA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("90005");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2133353636");
        driver.findElement(By.id("customer.ssn")).sendKeys("55522211");
        driver.findElement(By.id("customer.username")).sendKeys("Ahmet_emre");
        driver.findElement(By.id("customer.password")).sendKeys("AmmoEsoyaGötten");
        driver.findElement(By.id("repeatedPassword")).sendKeys("AmmoEsoyaGötten");
        Thread.sleep(3000);
        driver.quit();









    }
}
