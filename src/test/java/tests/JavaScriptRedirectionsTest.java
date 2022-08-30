package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        driver.navigate().to("https://testpages.herokuapp.com/styled/javascript-redirect-test.html");
        JavaScriptRedirections javaScriptRedirections = new JavaScriptRedirections(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

        javaScriptRedirections.getTransportIn5Seconds().click();
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Thread.sleep(1000);

        while (true){
            if (wait.until(ExpectedConditions.textToBePresentInElement(javaScriptRedirections.explanation,
                    "You have been successfully redirected." )));
            break;
        }
        String text = javaScriptRedirections.explanation.getText();
        System.out.println(text);
        assertEquals(javaScriptRedirections.getExplanation().getText(),
                "You have been successfully redirected.", "You have not been successfully redirected.");
        driver.navigate().back();
        javaScriptRedirections.getTransportedIn2Seconds().click();
        while (true) {
            if (wait.until(ExpectedConditions.textToBePresentInElement(javaScriptRedirections.explanation,
                    "You have been successfully redirected."))) ;
            break;
        }
        assertEquals(javaScriptRedirections.getExplanation().getText(),
                "You have been successfully redirected.", "You have not been successfully redirected.");
        javaScriptRedirections.getGoBackButton().click();


    }

}
