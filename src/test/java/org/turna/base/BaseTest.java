package org.turna.base;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","properties/driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("start-maximized");
        options.addArguments("test-type");
        options.addArguments("disable-translate");
        options.addArguments("disable-popup-blocking");
        options.setExperimentalOption("useAutomationExtension", false);
        setWebDriver(new ChromeDriver(options));
        getWebDriver().manage().deleteAllCookies();
    }

    private void setWebDriver(ChromeDriver chromeDriver) {
        this.driver = chromeDriver;
    }

    public  WebDriver getWebDriver(){
        return driver;
    }

    public void scrollDown(int scrollNumber){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        String script = "window.scrollBy(0,"+scrollNumber+")";
        javascriptExecutor.executeScript(script);
    }
}






