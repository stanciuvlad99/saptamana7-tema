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

    @BeforeMethod
    public void beforeMethod(){
        driver= BrowserConfigs.getChromeDriverManager();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
    }

    @AfterMethod()
    public void afterMethod(){
        if (driver != null){
            driver.quit();
        }
    }






    protected FluentWait<ChromeDriver> fluentWait(ChromeDriver driver){
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500));
    }

}
