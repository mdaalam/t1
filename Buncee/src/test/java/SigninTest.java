import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by mdalam on 9/12/15.
 */
public class SigninTest extends BunceeBase{

    @Test
    public void loginBuncee() throws Exception {
        signIn();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/mdalam/Desktop/TeamOne/test.png"));

    }
}
