import org.testng.annotations.Test;

/**
 * Created by kashifa on 9/16/15.
 */
public class ClickingOnOtherOptions extends TimeWarnerBase {


    @Test

    public void toclickonotheroptions(){
        tosignin();
        clickByCss(".active.profile>span>a");
        clickByXpath(".//*[@id='mys-mid-nav']/div/div/ul/li[3]/span/a");
        clickByXpath(".//*[@id='mys-mid-nav']/div/div/ul/li[4]/a");
        clickByXpath(".//*[@id='usage-tracker']/div/div/ul/li/div[3]/ul/li/a");
    }
}
