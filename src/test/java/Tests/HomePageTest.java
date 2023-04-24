package Tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class HomePageTest extends BaseClass {


    @Test(priority = 1)
    public void homePageTests() throws InterruptedException {
        HomePage hp = new HomePage();
        hp.navigateToHomePage();
        hp.filterHomePage();
    }

}
