import CommonApi.Base;

/**
 * Created by kashifa on 9/16/15.
 */
public class TimeWarnerBase extends Base {

    public void tosignin(){
        typeByXpath(".//*[@id='mys-page']/div/div[1]/div[1]/form/input[1]","kashifahasan");
        typeByXpath(".//*[@id='mys-page']/div/div[1]/div[1]/form/input[2]", "maliha1220");
        clickByCss(".sign-in-btn.mys-btn");
    }

    public void tosignout(){
        clickByCss(".sign-out-link");
    }
}
