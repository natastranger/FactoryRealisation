package core;

import helpers.Singleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 30.01.2015.
 */
public class TestBase {
    protected static final String BASE_URL = "http://facebook.com";

    @BeforeMethod
    public void before() throws InterruptedException{
        String browser = System.getProperty("browser", "chrome");
        System.out.println("Current browser is " + browser);
        Singleton.initDriver(browser).get(BASE_URL);
    }

    @AfterMethod
    public void after(){
        Singleton.getDriver().quit();
    }

}
