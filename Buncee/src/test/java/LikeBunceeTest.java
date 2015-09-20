import org.testng.annotations.Test;

/**
 * Created by mdalam on 9/19/15.
 */
public class LikeBunceeTest extends BunceeBase {
    @Test
    public void likeBuncee() throws Exception {
        signIn();
        clickByXpath(".//*[@id='recent-buncees']/div[3]/img");
        switchWindow();
        sleepfor(2);
        clickByXpath(".//*[@id='info-container']/span[3]/span[1]");
        sleepfor(2);

    }
}
