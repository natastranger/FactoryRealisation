import helpers.BasicConfiguration;
import org.testng.annotations.Test;
import pages.HomePage;


public class SearchTest extends BasicConfiguration {

    @Test
    public void searchTest(){
        HomePage homePage = new HomePage(driver);
        homePage.search("xnj-nj");
    }
}
