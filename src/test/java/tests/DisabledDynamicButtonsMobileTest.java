package tests;

import driver.BrowserConfigs;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.SimpleDynamicButtons;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class DisabledDynamicButtonsMobileTest extends BaseTest{

    @Test
    public void buttons() throws InterruptedException {
        driver1.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        SimpleDynamicButtons simpleDynamicButtons = new SimpleDynamicButtons((ChromeDriver) driver1);
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        simpleDynamicButtons.getStartButton().click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//        simpleDynamicButtons.getOneButton().click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//        simpleDynamicButtons.getTwoButton().click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//        simpleDynamicButtons.getThreeButton().click();
//        System.out.println(simpleDynamicButtons.getMessage().getText());

        if (simpleDynamicButtons.getOneButton().isEnabled()){
            simpleDynamicButtons.getOneButton().click();
        }if (simpleDynamicButtons.getTwoButton().isEnabled()){
            simpleDynamicButtons.getTwoButton().click();
        }if (simpleDynamicButtons.getThreeButton().isEnabled()){
            simpleDynamicButtons.getThreeButton().click();
//            while (true) {
//                WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//                if (wait.until(ExpectedConditions.textToBePresentInElement(simpleDynamicButtons.message,
//                        "All Buttons Clicked")));
            assertEquals(simpleDynamicButtons.getMessage().getText(),
                    "All Buttons Clicked", "The message is not displayed");
//                break;
//            }
        }




    }
}
