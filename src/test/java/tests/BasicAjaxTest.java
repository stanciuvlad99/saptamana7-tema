package tests;

import driver.BrowserConfigs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.BasicAjax;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static pageObjects.BasicAjax.CATEGORY_CSS;
import static pageObjects.BasicAjax.LANGUAGE_CSS;

public class BasicAjaxTest extends BaseTest{

    @Test(description = "The items will be checked for correctness on the next page after pressing the Code it in button.")
    public void testCodeIn () {
        driver1.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");
        BasicAjax basicAjax = new BasicAjax( driver1);
//        basicAjax.getCategory().selectByIndex(1);


//        basicAjax.getList().get(0).click();

        fluentWait(driver1).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CATEGORY_CSS)));
        basicAjax.getCategory().click();
        fluentWait(driver1).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(LANGUAGE_CSS)));
        basicAjax.getLanguage().click();
        basicAjax.getCodeInItButton().click();
        System.out.println(basicAjax.getCategorryId().getText());
        assertEquals(basicAjax.getCategorryId().getText(), "1", "Id incorrect.");
        System.out.println(basicAjax.getLanguageId().getText());
        assertEquals(basicAjax.getLanguageId().getText(),"2", "Id incorrect.");




    }
}
