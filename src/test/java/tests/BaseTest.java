package tests;

import driver.BrowserConfigs;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    protected ChromeDriver driver = null;
    protected ChromeDriver driver1= null;

    @BeforeMethod
    public void beforeMethod(){
        driver= BrowserConfigs.getChromeDriverManager();
        ChromeOptions chromeOptions = new ChromeOptions();

    }

    @AfterMethod()
    public void afterMethod(){
        if (driver != null){
            driver.quit();
        }
    }


//    @BeforeMethod
//    public void beforeMethod1(){
//        driver1= BrowserConfigs.getChromeDriverManagerMobile();
//        ChromeOptions chromeOptions = new ChromeOptions();
//
//    }
//
//    @AfterMethod()
//    public void afterMethod1(){
//        if (driver1 != null){
//            driver1.quit();
//        }
//    }




    protected FluentWait<ChromeDriver> fluentWait(ChromeDriver driver){
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500));
    }

}
