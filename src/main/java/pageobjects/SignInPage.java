
package pageobjects;

import Utilities.Action;
import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage extends BaseClass {
    Action action = new Action();

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[placeholder='Email']")
    WebElement email;

    @FindBy(css = "[placeholder='Password']")
    WebElement password;

    @FindBy(css = "input[value='Login']")
    WebElement login;



    public void firstCase() throws InterruptedException {
        Thread.sleep(4000);
        action.type(email,"balramadmin@virdee.co");
        action.type(password,"password");
        action.click2(login);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");
        js.executeScript("window.scrollBy(0,150)", "");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,300)", "");
        Thread.sleep(5000);

    }


}
