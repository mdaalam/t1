import org.testng.annotations.Test;

/**
 * Created by mdalam on 9/19/15.
 */
public class ShareInFacebookTest extends BunceeBase {
    @Test
    public void likePdf() throws Exception {
        signIn();
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window
        clickByXpath(".//*[@id='recent-buncees']/div[2]/img");
        sleepfor(2);

        // Switch to new window opened
        switchWindow();
        sleepfor(2);

        // Perform the actions on new window
        clickByXpath(".//*[@id='viewbuncee-toolbar']/div[2]/div[2]");
        clickByXpath(".//*[@id='buncee-modal']/div/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]");
        clickByXpath(".//*[@id='buncee-modal']/div/div[1]/div[2]/div[1]/span[5]");
        clickByXpath(".//*[@id='buncee-modal']/div/div[1]/div[2]/div[2]/div[2]/span[1]/img");
        String winHandleBefore2 = driver.getWindowHandle();

        // Switch to new window opened
        switchWindow();
        sleepfor(2);

        getElementByXpath(".//*[@id='email']", "md_a_alam@yahoo.com");
        getElementByXpath(".//*[@id='pass']", "selenium123");
        clickByXpath(".//*[@id='u_0_2']");
        clickByXpath(".//*[@id='sharerDialogButtons']/button[2]");

        driver.close();
        // Switch back to previous browser (first window)
        driver.switchTo().window(winHandleBefore2);
        // Continue with original browser (first window)
        clickByXpath(".//*[@id='buncee-modal']/div/div[1]/div[3]/div[1]");
        sleepfor(2);

        driver.close();
        // Switch back to previous browser (first window)
        driver.switchTo().window(winHandleBefore);

        signOut();
        sleepfor(3);
    }
}
