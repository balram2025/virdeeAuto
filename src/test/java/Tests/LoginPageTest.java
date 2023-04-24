/**
 * 
 */
package Tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pageobjects.SignInPage;

public class LoginPageTest extends BaseClass {

    @Test()
    public void firstTest() throws InterruptedException {
        SignInPage hp = new SignInPage();
        hp.firstCase();
    }
}
