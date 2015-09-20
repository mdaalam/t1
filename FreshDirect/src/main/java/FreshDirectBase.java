import CommonApi.Base;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;

/**
 * Created by kashifa on 9/5/15.
 */
public class FreshDirectBase extends Base {

    public static String userName = "pntseleniumtests" + new Random().nextInt((1000 - 100) + 1) + 1;
    public static String userEmailAddress = userName + "@gmail.com";

}


