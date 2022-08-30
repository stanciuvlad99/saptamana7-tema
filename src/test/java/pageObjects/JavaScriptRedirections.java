package pageObjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

public class JavaScriptRedirections {

    public static final String EXPLANATION = "explanation";

    public JavaScriptRedirections(ChromeDriver driver){
        PageFactory.initElements( driver, this);
    }


    @FindBy(id = "delaygotobasic")
    private WebElement transportIn5Seconds;

    public WebElement getTransportIn5Seconds() {
        return transportIn5Seconds;
    }

    @FindBy(className = EXPLANATION)
    private WebElement explanation;

    public WebElement getExplanation() {
        return explanation;
    }

    @FindBy(className = "styled-click-button")
    private WebElement goBackButton;

    public WebElement getGoBackButton() {
        return goBackButton;
    }

    @FindBy(id = "delaygotobounce")
    private WebElement transportedIn2Seconds;

    public WebElement getTransportedIn2Seconds() {
        return transportedIn2Seconds;
    }
}
