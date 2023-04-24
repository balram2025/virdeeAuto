package Tests;

import base.BaseClass;
import org.testng.annotations.Test;
import pageobjects.usersFilterPage;

public class usersFilteringTest extends BaseClass {

    @Test
    public void searchUserUsingValidFilters() throws InterruptedException {
        usersFilterPage up = new usersFilterPage();
        up.searchFilter();
        up.sortUsers();
        up.logout();
    }
}
