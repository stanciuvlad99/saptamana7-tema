package tests;

import org.testng.annotations.Test;
import pageObjects.SimpleDynamicButtons;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class DisabledDynamicButtonsTest extends BaseTest{

    @Test
    public void buttons() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        SimpleDynamicButtons simpleDynamicButtons = new SimpleDynamicButtons(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        simpleDynamicButtons.getStartButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        simpleDynamicButtons.getOneButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        simpleDynamicButtons.getTwoButton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        simpleDynamicButtons.getThreeButton().click();
        System.out.println(simpleDynamicButtons.getMessage().getText());
        assertEquals(simpleDynamicButtons.getMessage().getText().toLowerCase(),
                "all buttons clicked", "The message is not displayed");
    }
}
