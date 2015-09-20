import org.testng.annotations.Test;

/**
 * Created by mdalam on 9/12/15.
 */
public class SignoutTest extends BunceeBase{

    @Test
    public void loginBuncee() throws Exception {
        signIn();
        signOut();
    }
}