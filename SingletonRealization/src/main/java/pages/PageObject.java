package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Singleton.getDriver;


/**
 * Created by Admin on 30.01.2015.
 */
public class PageObject extends TestBase{

    public static void login(String user, String pass){
        getDriver().findElement(By.id("email")).sendKeys(user);
        getDriver().findElement(By.id("pass")).sendKeys(pass);
        getDriver().findElement(By.id("u_0_n")).click();
        }
}
