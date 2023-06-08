package class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tables extends CommonMethods {
    public static void main(String[] args) {

        String url ="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

   //  **************** TABLE LEVEL ACCESS************************

        // get the whole table
      WebElement wholeTable= driver.findElement(By.xpath("//table[@id='customers']"));
      String allText=wholeTable.getText();
        System.out.println(allText);

        System.out.println("-------------------------------------");


   // *************** LEVEL ACCESS OF TABLE ****************
        // print all the rows of the table
// modified= print the row that contains google as company

        List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : allRows) {
            String rowText=row.getText();
            if (rowText.contains("Google")){
                System.out.println(rowText);}

        }

        System.out.println("---------------------------------");

        //      ******************* COLUMN LEVEL ACCESS****************
//          print each and every data in the table


       List<WebElement>allCellData=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement cell : allCellData) {
           String cellData= cell.getText();
            System.out.println(cellData);


        }









    }
}
