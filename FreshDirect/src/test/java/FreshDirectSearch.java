import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by kashifa on 9/12/15.
 */
public class FreshDirectSearch extends Base {

    @Test
    public void freshdirectsearch(){
      typeByCssThenEnter("#topSearchField","meat");
    }
}
