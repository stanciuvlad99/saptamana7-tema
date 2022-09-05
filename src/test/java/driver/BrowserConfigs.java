package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BrowserConfigs {

    public static ChromeDriver getChromeDriverManager(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        return new ChromeDriver(chromeOptions);
    }

    public static ChromeDriver getChromeDriverManagerMobile(){
        ChromeOptions chromeOptions = new ChromeOptions();
        Map<String, String> map = new HashMap<>();
        map.put("deviceName", "iPhone X");
        chromeOptions.setExperimentalOption("mobileEmulation", map);
        chromeOptions.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
    public static RemoteWebDriver getRemoteDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL("http://localhost:4444/"), new ChromeOptions());
    }

}
