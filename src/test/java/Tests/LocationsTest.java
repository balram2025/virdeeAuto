package Tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pageobjects.Locations;

public class LocationsTest extends BaseClass {

     @Test
        public void locationsTest() throws InterruptedException{
            Locations lp = new Locations();
            lp.goToLocations();
            lp.sortLocations();
        }
}
