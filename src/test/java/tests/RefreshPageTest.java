package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.RefreshPage;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.assertEquals;

public class RefreshPageTest extends BaseTest{

    @Test
   public void refresh() throws InterruptedException {
       driver.get("https://testpages.herokuapp.com/styled/refresh");
       RefreshPage refreshPage = new RefreshPage(driver);
       System.out.println(refreshPage.getRefreshDate().getText());
       int actual = Integer.parseInt(refreshPage.getRefreshDate().getText());
       int expected = Integer.parseInt(refreshPage.getRefreshDate1().getText());
       int b = 200;
       int a = 199;
       Thread.sleep(2000);
       driver.navigate().refresh();
       Thread.sleep(2000);
       System.out.println(refreshPage.getRefreshDate1().getText());
        Date timestamp = new Date();
        System.out.println(timestamp.getTime());
        long time = timestamp.getTime();
        Timestamp ts = new Timestamp(time);
        System.out.println(ts);
        assertEquals(actual, expected, 1);
   }

}
