import org.testng.annotations.Test;

/**
 * Created by mdalam on 9/19/15.
 */
public class DeleteBunceeTest extends BunceeBase {
    @Test
    public void deleteBuncee() throws Exception {
        signIn();

        clickByXpath(".//*[@id='bunceeFolder-cluster']/div[18]/div/div[3]");
        clickByXpath(".//*[@id='bunceeFolder-cluster']/div[18]/div/div[3]/ul/li[6]");
        sleepfor(2);
        clickByXpath(".//*[@id='deletePopUp-done']");

        signOut();
    }
}
