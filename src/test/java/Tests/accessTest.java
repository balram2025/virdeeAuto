package Tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pageobjects.accessFilterPage;
import pageobjects.accessPage;

public class accessTest extends BaseClass {

    @Test()
    public void accessTest1() throws InterruptedException {
        accessPage ap = new accessPage();
        ap.navigateToAccessPage();
        ap.accessDetails();
    }
}
