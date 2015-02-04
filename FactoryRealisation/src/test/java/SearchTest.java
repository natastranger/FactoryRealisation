import helpers.BasicConfiguration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

/**
 * Created by Admin on 23.01.2015.
 */
public class SearchTest extends BasicConfiguration {

    @Test
    public void searchTest(){
        HomePage homePage = new HomePage(driver);
        homePage.search("xnj-nj");
    }
}
