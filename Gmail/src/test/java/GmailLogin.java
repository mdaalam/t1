import CommonApi.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

/**
 * Created by KASHIFAHASAN on 9/3/15.
 */

/**
 * Tc#01 Login to Gamil and click on the compose button and send an email
 *
 */
public class GmailLogin extends Base {

@Test
    public void logintoGmail() throws Exception{
        getElementByCss("#Email", "pntseleniumtests@gmail.com");
        clickByCss("#next");
        getElementByCss("#Passwd", "test1234567890");
        clickByCss("#signIn");
        clickByXpath(".//*[@id=':4s']/div/div");
        driver.findElement(By.xpath(".//*[@id=':9v']")).sendKeys("kashifagirl@yahoo.com");
        driver.findElement(By.xpath(".//*[@id=':9g'")).sendKeys("Hi");

        //getElementByXpath(".//*[@id=':9v']", "kashifagirl@yahoo.com");
        //getElementByXpath(".//*[@id=':9g']", "Hi");
    clickByXpath(".//*[@id=':8r']");
        clickByXpath(".//*[@id='gb']/div[1]/div[1]/div/div[4]/div[1]/a");
        clickByXpath(".//*[@id='gb_71']");
        try {
            sleepfor(2);
        }catch(Exception e){
        }
    }

//
}
