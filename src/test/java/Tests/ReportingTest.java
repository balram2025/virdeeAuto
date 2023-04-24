package Tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pageobjects.Reporting;
import pageobjects.ReportingPage;

public class ReportingTest extends BaseClass {

    @Test(priority = 1)
    public void reportingTest() throws InterruptedException{
       Reporting rp = new Reporting();
        rp.navigateToReportingPage();
       rp.userReporting();
        rp.filterReporting();
        rp.sortReporting();
    }
}
