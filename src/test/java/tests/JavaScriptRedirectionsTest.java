package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.JavaScriptRedirections;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static pageObjects.JavaScriptRedirections.EXPLANATION;


public class JavaScriptRedirectionsTest extends BaseTest {


    @Test(description = "Check buttons that redirect to a new page, using wait and windowHandles")
    public void transportInSeconds() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        JavaScriptRedirections javaScriptRedirections = new JavaScriptRedirections(driver);


        javaScriptRedirections.getTransportIn5Seconds().click();
//        fluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(By.className(EXPLANATION)));
        Thread.sleep(5000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        assertEquals(javaScriptRedirections.getExplanation().getText().toLowerCase(),
                "you have been successfully redirected.", "You have not been successfully redirected.");
        javaScriptRedirections.getGoBackButton().click();
        javaScriptRedirections.getTransportedIn2Seconds();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        assertEquals(javaScriptRedirections.getExplanation().getText().toLowerCase(),
                "you have been successfully redirected.", "You have not been successfully redirected.");
        javaScriptRedirections.getGoBackButton().click();


    }

}
