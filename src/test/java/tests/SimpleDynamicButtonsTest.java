package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pageObjects.SimpleDynamicButtons;

import static org.testng.Assert.assertEquals;
import static pageObjects.SimpleDynamicButtons.THREE_BUTTON_ID;
import static pageObjects.SimpleDynamicButtons.TWO_BUTTON_ID;

public class SimpleDynamicButtonsTest extends BaseTest{


    @Test(description = "At the end will check the message displayed.")
    public void butons(){
        driver1.get("https://testpages.herokuapp.com/styled/dynamic-buttons-simple.html");
        SimpleDynamicButtons simpleDynamicButtons = new SimpleDynamicButtons((ChromeDriver) driver1);
        simpleDynamicButtons.getStartButton().click();
        simpleDynamicButtons.getOneButton().click();
        fluentWait(driver1).until(ExpectedConditions.visibilityOfElementLocated(By.id(TWO_BUTTON_ID)));
        simpleDynamicButtons.getTwoButton().click();
        fluentWait(driver1).until(ExpectedConditions.visibilityOfElementLocated(By.id(THREE_BUTTON_ID)));
        simpleDynamicButtons.getThreeButton().click();
        assertEquals(simpleDynamicButtons.getMessage().getText().toLowerCase(),
                "all buttons clicked", "The message is not displayed");
    }

}

