import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by kashifa on 9/19/15.
 */
public class AboutGeico extends Base {

    @Test

    public void clickonaboutgeicotab(){
        clickByCss("#about>a>span");
        clickByXpath(".//*[@id='index-list']/li[12]/div/h2/a");
        clickByXpath(".//*[@id='content']/ul/li[1]/div[1]");
        clickByCss("#facebook>h3>a");

    }
}
