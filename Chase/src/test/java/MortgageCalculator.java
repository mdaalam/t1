import CommonApi.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.FileAssert;

/**
 * Created by KASHIFAHASAN on 9/1/15.
 */
public class MortgageCalculator extends Base{

    @Test

    public void mortgageTest()throws InterruptedException{
        getTitle();
        typeByCssThenEnter("#monthly_income", "25000");
        typeByCssThenEnter("#monthly_expenses", "15000");
        sleepfor(2);
        typeByCss("#down_payment", "50");
        typeByCss("#interest", "10");
        sleepfor(2);
        typeByCss("#property_taxes", "10");
        typeByCssThenEnter("#insurance", "5");
        //driver.findElement(By.cssSelector("#loan_term")).click();
        clickByXpath(".//*[@id='loan_term']/option[3]");
        sleepfor(4);
        log.info("Test case run successfully");
        //Than we need to click on the dropdown menu box to select the years we want to click.
        //OR How to get the locators of dropdown menu?
        //How to use Asserts with WebElements?
        //How to write in the excel file?





    }





}
