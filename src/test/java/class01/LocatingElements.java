package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();

        //go to facebook.com
        driver.get("https://www.facebook.com");

        //maximize the window
        driver.manage().window().maximize();

        //send some text in the mail
        // find the element        .send some text
        driver.findElement(By.id("email")).sendKeys("moazam@gmail.com");

        // send some text to the password field
        driver.findElement(By.name("pass")).sendKeys("abracadabra");

        // printing the url and title
        String url = driver.getCurrentUrl();
        System.out.println("The current url is of website is : " + url);

        String title = driver.getTitle();
        System.out.println("The current title of website is : " + title);

        //confirm that the title is Facebook - log in or sign up

        if (title.equals("Facebook - log in or sign up")){
            System.out.println("title is true");
        }else {
            System.out.println("title is not true");
        }
        //close
        driver.quit();






    }
}
