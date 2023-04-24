package Tests;
import base.BaseClass;
import org.testng.annotations.Test;
import pageobjects.usersPage;

public class UsersPageTest extends BaseClass {

    @Test()
    public void userCreation() throws Exception {
        usersPage up = new usersPage();
        up.userCreation();

    }
}
