package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.RefreshPage;

public class RefreshPageTest extends BaseTest{

    @Test
   public void refresh() throws InterruptedException {
       driver.get("https://testpages.herokuapp.com/styled/refresh");
       RefreshPage refreshPage = new RefreshPage(driver);
       System.out.println(refreshPage.getRefreshDate().getText());
       Thread.sleep(5000);
       driver.navigate().refresh();
       Thread.sleep(5000);
       System.out.println(refreshPage.getRefreshDate1().getText());

   }

}
