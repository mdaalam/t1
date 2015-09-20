import org.testng.annotations.Test;
import java.util.ArrayList;
/**
 * Created by mdalam on 9/12/15.
 */
public class CreateBunceeTest extends BunceeBase{

    @Test
    public void loginBuncee() throws Exception {
        signIn();

        String oldTab = driver.getWindowHandle();
        clickByXpath(".//*[@id='recent-buncee-add']/div[1]");
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
        clickByXpath(".//*[@id='slide']/div/div[2]/div[1]");
        sleepfor(2);
        clickByXpath(".//*[@id='panel-itemgateway']/div[1]/div[3]/div[8]");
        sleepfor(2);
        clickByXpath(".//*[@id='itembrowse-panels']/div/div[2]/div[1]/div[4]");
            sleepfor(2);
        clickByXpath(".//*[@id='itembrowse-panels']/div/div[2]/div[2]/div[2]/img");
            sleepfor(2);
        clickByXpath(".//*[@id='itembrowse-panels']/div/div[1]/div[3]/a[1]");
            sleepfor(2);
    }
}
