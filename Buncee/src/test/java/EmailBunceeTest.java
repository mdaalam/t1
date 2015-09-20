import org.testng.annotations.Test;

/**
 * Created by mdalam on 9/19/15.
 */

@Test
public class EmailBunceeTest extends BunceeBase{
    public void emailBuncee() throws Exception {
        signIn();

        clickByXpath(".//*[@id='recent-buncees']/div[2]/img");

        switchWindow();

        sleepfor(2);

        clickByXpath(".//*[@id='viewbuncee-toolbar']/div[2]/div[2]");
        sleepfor(2);
        clickByXpath(".//*[@id='buncee-modal']/div/div[1]/div[2]/div[1]/span[3]");
        sleepfor(2);
        typeByCssThenEnter("#newemail", "iamarfad@yahoo.com" );
        sleepfor(2);
        clickByXpath(".//*[@id='buncee-modal']/div/div[1]/div[3]/div[1]");
        sleepfor(3);
    }
}
