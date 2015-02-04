import core.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObject;

import static helpers.Singleton.getDriver;


public class IncorrectFacebookLoginTest extends TestBase{

    WebDriver driver;

    @Test
    public void loginTest() throws InterruptedException {
        PageObject.login("user","name");
        Assert.assertTrue(getDriver().getPageSource().contains("Incorrect Email"));
        Thread.sleep(5000);
    }
}
