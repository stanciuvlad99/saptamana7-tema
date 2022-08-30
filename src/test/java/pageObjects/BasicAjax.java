package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

import java.util.List;

public class BasicAjax extends BaseTest {

    public static final String CATEGORY_CSS = "#combo1 > option:nth-child(1)";
    public static final String LANGUAGE_CSS = "#combo2 > option:nth-child(2)";
    //option[@value='11']


    public BasicAjax(ChromeDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = CATEGORY_CSS)
    private WebElement category;

    public WebElement getCategory() {
        return category;
    }

    @FindBy(css = LANGUAGE_CSS)
    private WebElement language;

    public WebElement getLanguage() {
        return language;
    }

    @FindBy(css = ".styled-click-button")
    private WebElement codeInItButton;


    public WebElement getCodeInItButton() {
        return codeInItButton;
    }

    @FindBy(id = "_valueid")
    private WebElement categorryId;


    @FindBy(id = "_valuelanguage_id")
    private WebElement languageId;


    public WebElement getCategorryId() {
        return categorryId;
    }

    public WebElement getLanguageId() {
        return languageId;
    }




//    @FindBy(id = "combo1")
//    private List<WebElement>list;
//
//    public List<WebElement> getList() {
//        return list;
//    }
//



}
