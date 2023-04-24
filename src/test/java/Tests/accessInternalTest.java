package Tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pageobjects.accessInternalPage;
import pageobjects.accessPage;

public class accessInternalTest extends BaseClass {

    @Test()
    public void accessTest1() throws InterruptedException {
       accessInternalPage ap = new accessInternalPage();
       ap.navigatetoInternal();
    }
}
