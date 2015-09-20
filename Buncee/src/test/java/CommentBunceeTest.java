import org.testng.annotations.Test;

/**
 * Created by mdalam on 9/19/15.
 */
public class CommentBunceeTest extends BunceeBase {
    @Test
    public void commentBuncee() throws Exception {
        signIn();
        clickByXpath(".//*[@id='recent-buncees']/div[3]/img");
        switchWindow();
        sleepfor(2);
        clickByXpath(".//*[@id='info-container']/span[3]/span[2]");
        sleepfor(2);
        typeByCssThenEnter("#input-tag", "nice-buncee");
        sleepfor(2);
    }
}
