package Tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pageobjects.accessFilterPage;

public class accessfilteringTest extends BaseClass {

    @Test()
    public void accessfilteringTest() throws InterruptedException {
        accessFilterPage ap = new accessFilterPage();
        ap.navigateToAccessPage();
        ap.searchFilterAccess();

    }
}
