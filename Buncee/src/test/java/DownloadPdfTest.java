import org.testng.annotations.Test;

/**
 * Created by mdalam on 9/19/15.
 */
public class DownloadPdfTest extends BunceeBase {
    @Test
    public void downloadPdf() throws Exception {

        signIn();
        clickByXpath(".//*[@id='recent-buncees']/div[2]/img");
        switchWindow();
        sleepfor(2);
        clickByXpath(".//*[@id='viewbuncee-toolbar']/div[2]/div[1]");
        sleepfor(3);
        clickByXpath(".//*[@id='buncee-modal']/div/div[1]/div[3]/div[1]/div[2]/div");
        sleepfor(3);
        //clickByXpath(".//*[@id='buncee-modal']/div/div[1]/div[4]/div");
    }
}
