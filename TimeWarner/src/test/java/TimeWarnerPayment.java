import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by kashifa on 9/16/15.
 */
public class TimeWarnerPayment extends TimeWarnerBase {

    @Test

    public void makeapayment()throws Exception{
        tosignin();
        sleepfor(3);
        clickByCss("#start-pay-bill");
        sleepfor(2);
        // clickByCss("#onetime_opt");
        //clickByCss("#payment-method");
        sleepfor(4);
        clickByXpath(".//*[@id='payment-method']/option[2]");
        clickByXpath(".//*[@id='confirm-billpay-type']");
        sleepfor(5);
        clickByXpath(".//*[@id='agree-terms-checkbox']");
        clickByXpath(".//*[@id='agree-terms']");
        sleepfor(2);
        clickByCss(".label");
        //clickByXpath(".//*[@id='cardProcessingNetwork']/div/div[3]/div/ul/li[1]");
        typeByXpath(".//*[@id='cardName']", "Kashifa Hasan");
        typeByXpath(".//*[@id='cardNumber']", "1234567890123456");
        clickByXpath(".//*[@id='expiration_date_month']/option[3]");
        clickByXpath(".//*[@id='expiration_date_year']/option[5]");
        clickByXpath(".//*[@id='amountForm']/div[2]/div[2]/a[1]");
        //clickById("agree-terms-checkbox");
        //clickByXpath(".//*[@id='agree-terms']");

        //clickByXpath(".//*[@id='agree-terms-checkbox']");
        //clickByXpath(".//*[@id='agree-terms']");
        //clickByCss("#agree-terms-checkbox");
//        tosignout();


    }
}
