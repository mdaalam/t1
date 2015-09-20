
import org.testng.annotations.Test;
import CommonApi.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.FileAssert;
import java.lang.Math;
import java.util.Random;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
/**
 * Created by mdalam on 9/12/15.
 */
public class BunceeBase extends Base {

    public static String userName = "TestUser" + new Random().nextInt((1000 - 100) + 1) + 1;
    public static String userEmailAddress = userName + "@gmail.com";

    public void signUp() throws Exception {
        clickByXpath(".//*[@id='sign-up']/a");
        clickByXpath(".//*[@id='complete']/div[8]/div/div[1]/div[2]/a");
        getElementByXpath(".//*[@id='firstName']", userName);
        getElementByXpath(".//*[@id='lastName']", userName);
        getElementByXpath(".//*[@id='email']", userEmailAddress);
        getElementByXpath(".//*[@id='password']",userName);
        getElementByXpath(".//*[@id='confirmPassword']",userName);
        clickCheckBox("termsAccept");
        clickCheckBox("ageVerification");
        clickByXpath(".//*[@id='button-submit']");
        sleepfor(5);
    }

    public void signIn() throws Exception {
        clickByXpath(".//*[@id='user-stuff']/a");
        getElementByXpath(".//*[@id='signin-box-for-user']/div[3]/form/input[3]", "md_a_alam@yahoo.com");
        getElementByXpath(".//*[@id='signin-box-for-user']/div[3]/form/input[4]", "Buncee12");
        sleepfor(2);
        clickByXpath(".//*[@id='signin-box-for-user']/div[3]/form/a");
        sleepfor(2);
    }

    public void signOut() throws Exception {
        clickByXpath(".//*[@id='header-avatar']");
        clickByXpath(".//*[@id='signin-type-selection']/div[8]/a[2]");
    }
}
