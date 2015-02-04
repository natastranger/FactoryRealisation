package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 30.01.2015.
 */
public class Singleton {

    private static WebDriver driver;
    private static final String BASE_URL = "https://github.com/login ";


    public static WebDriver getDriver() {
        if (driver != null)
            return driver;
        else
            return new ChromeDriver();

    }

    public static WebDriver initDriver(String browser) {
//        String remote = System.getProperty("remote", "");
//        if (remote.length() > 0) {
            switch (browser) {
                case "firefox": {
                    driver = new FirefoxDriver();
                    break;
                }
                case "chrome": {
                    driver = new ChromeDriver();
                    break;
                }
                case "ie": {
                    driver = new InternetExplorerDriver();
                    break;
                }
                default: {
                    driver = new ChromeDriver();
                }
            }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
        }
    }
//}
