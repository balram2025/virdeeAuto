package pageobjects;

import Utilities.Action;
import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class usersFilterPage extends BaseClass {

    public usersFilterPage() {
        PageFactory.initElements(driver, this);
    }

    Action action = new Action();
    SignInPage sp;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//p[contains(text(),'Assistance')]")
    WebElement assistance;

    @FindBy(xpath = "//p[contains(text(),'Users')]")
    WebElement Users;

    @FindBy(xpath = "//p[contains(text(),'Last Seen')]")
    WebElement lastSeen;

    @FindBy(xpath = "//button[contains(text(),'2')]")
    WebElement usersPage2;

    @FindBy(css = "div[class='arrow down']")
    WebElement selectCountry;

    @FindBy(xpath = "//span[contains(text(),'India ')]")
    WebElement selectIndia;

    @FindBy(css = "input[type='tel']")
    WebElement numberInput;

    @FindBy(xpath = "//div[contains(@class,'css-gasbrm')]//div[contains(@class,'css-1hwfws3')]")
    WebElement selectRole;

    @FindBy(css = "div.DataTable___StyledContainer3-sc-1wtqb4w-2 .Tooltip___StyledContainer-sc-1v0noqi-0:nth-of-type(1) button")
    WebElement createButton;

    @FindBy(css = "div.DataTable___StyledContainer3-sc-1wtqb4w-2 .Tooltip___StyledContainer-sc-1v0noqi-0:nth-of-type(3) button")
    WebElement editButton;

    @FindBy(css = "input[name='name']")
    WebElement nameInput;

    @FindBy(css = "input[name='email']")
    WebElement emailInput;

    @FindBy(css = "input[type='submit']")
    WebElement nextButton;


    @FindBy(css = "input[name='password']")
    WebElement passwordInput;

    @FindBy(css = "input[name='confirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//div[contains(text(),'USER')]")
    WebElement user;

    @FindBy(css = "button[type='submit']")
    WebElement searchButtonUser;

    @FindBy(xpath = "//p[contains(text(),'Please confirm that you would like to perform this action')]//following-sibling::button[1]")
    WebElement confirmAction;

    @FindBy(css = "[name='searchValue']")
    WebElement searchUser;


    @FindBy(xpath = "//div//h3[contains(text(),'Select Locations')]/following-sibling::div")
    WebElement location;

    @FindBy(xpath = "//div//h3[contains(text(),'Select Locations')]/following-sibling::div//input")
    WebElement locationInput;

    @FindBy(xpath = "(//div[text()='Hotel Virdee'])[2]")
    WebElement ourLocation;

    @FindBy(xpath = "(//td[contains(text(),'balram579')]/preceding-sibling::td//div/div)[1]")
    WebElement newCheckBox;

    @FindBy(xpath = "//button[text()='Role']")
    WebElement roleFilter;

    @FindBy(css = "div.Checkbox___StyledContainer-sc-1hali8s-0 p")
    List<WebElement> rolesFilter;

    @FindBy(xpath = "//button[text()='Apply Filters']")
    WebElement applyFilters;


    public void userCreation() throws InterruptedException {
        action.click2(Users);

        js.executeScript("window.scrollBy(0,-250)", "");
        Thread.sleep(3000);

        /**
         * creating user */

        action.click2(createButton);
        action.type2(nameInput, "balram579");
        action.type2(emailInput, "balram579@a.co");

        Actions act = new Actions(driver);
        act.moveToElement(selectCountry).click().pause(Duration.ofSeconds(5)).sendKeys("India").moveToElement(selectIndia).pause(Duration.ofSeconds(5)).click().build().perform();
        Thread.sleep(2000);

        action.type2(numberInput, "6754093442");
        action.click2(selectRole);
        act.moveToElement(user).click().build().perform();
        action.type2(passwordInput, "Geron@222");
        action.type2(confirmPassword, "Geron@222");

        action.click2(nextButton);
        action.click2(location);
        action.type2(locationInput, "Hotel Virdee");

        action.click2(ourLocation);
        action.click2(nextButton);
        action.click2(confirmAction);

        /**
         * search user after creation */
        action.type2(searchUser, "balram579");
        Thread.sleep(6000);
        action.click2(searchButtonUser);
        action.click2(newCheckBox);
    }

    public void editUser() throws InterruptedException {
        /**
         * edit user */
        action.click2(editButton);

        action.type2(nameInput, "balram580");
        action.type2(emailInput, "balram580@a.co");
        action.type2(passwordInput, "Geron@123");
        action.type2(confirmPassword, "Geron@123");

        action.click2(nextButton);
        action.click2(nextButton);
        action.click2(confirmAction);

        /**
         * search user after editing */

        action.type2(searchUser, "balram580");
        Thread.sleep(6000);
        action.click2(searchButtonUser);

    }

    public void searchFilter() throws InterruptedException {
        Thread.sleep(5000);
        action.click2(Users);
        js.executeScript("window.scrollBy(0,-450)", "");
        Thread.sleep(3000);
        action.click2(roleFilter);

        Thread.sleep(5000);
//        WebElement checkbox3 = driver.findElement(with(By.tagName("div")).toLeftOf(rolesFilter.get(2)));
//        checkbox3.click();
        action.selectCheckBoxUsingName(rolesFilter,"User");
        action.selectCheckBoxUsingName(rolesFilter,"Admin");
        action.selectCheckBoxUsingName(rolesFilter,"Agent");
        Thread.sleep(3000);
        applyFilters.click();
        Thread.sleep(7000);
        js.executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(7000);
    }

    public void sortUsers() throws InterruptedException {
                js.executeScript("window.scrollBy(0,-950)", "");
        action.sortIt("Name");
        action.sortIt("Email");
        action.sortIt("Phone Number");
        action.sortIt("Last Seen");
    }
    @FindBy(css= ".Sidebar___StyledContainer4-sc-1nyp80q-3 button")
    WebElement  logoutButton;

    public void logout() throws InterruptedException {
        Thread.sleep(5000);
        action.click2(logoutButton);
        Thread.sleep(8000);
    }


}
