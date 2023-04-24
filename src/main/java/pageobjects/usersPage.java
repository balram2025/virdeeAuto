package pageobjects;

import Utilities.Action;
import Utilities.testData;
import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.time.Duration;

public class usersPage extends BaseClass {

    public usersPage() {
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

    @FindBy(css = "div.DataTable___StyledContainer3-sc-1wtqb4w-2 .Tooltip___StyledContainer-sc-1v0noqi-0:nth-of-type(4) button")
    WebElement deleteButton;

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

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    WebElement newCheckBox;


    public static final String  getMyUserName  =  "balram"+testData.getRandomNumeric(5);
    public static final String getMyEmail = "balram"+ testData.getRandomNumeric(5)+ "@a.co";
    public static final String getMobileNumber = testData.getRandomNumeric(10);


    public void userCreation() throws InterruptedException {
        Thread.sleep(5000);
        action.click2(Users);
        js.executeScript("window.scrollBy(0,-250)", "");
        Thread.sleep(5000);

        /**
         * creating user */

        action.JSClick(createButton);
        action.type2(nameInput, getMyUserName);
        action.type2(emailInput, getMyEmail);

        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveToElement(selectCountry).click().pause(Duration.ofSeconds(5)).sendKeys("India").moveToElement(selectIndia).pause(Duration.ofSeconds(5)).click().build().perform();
        Thread.sleep(2000);

        action.type2(numberInput, getMobileNumber);
        action.click2(selectRole);
        act.moveToElement(user).click().build().perform();
        action.type2(passwordInput, "Geron@219");
        action.type2(confirmPassword, "Geron@219");

        action.click2(nextButton);
        action.click2(location);
        locationInput.sendKeys("Hotel Virdee");
        Thread.sleep(5000);
        action.click(driver,ourLocation);
        action.click2(nextButton);
        action.click2(confirmAction);

        /**
         * search user after creation */
        Thread.sleep(2000);
        action.type2(searchUser, getMyUserName);
        Thread.sleep(5000);
        action.JSClick(searchButtonUser);
        newCheckBox.isDisplayed();
//        WebElement newCheckBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
//        action.click2(newCheckBox);
    }

//    public void editUser() throws InterruptedException {
        /**
//         * edit user */
//        action.click2(editButton);

//        action.type2(nameInput, "balram642");
//        action.type2(emailInput, "balram642@a.co");
//        action.type2(passwordInput, "Geron@123");
//        action.type2(confirmPassword, "Geron@123");
//
//        action.click2(nextButton);
//        action.click2(nextButton);
//        action.click2(confirmAction);
//
//        /**
//         * search user after editing */
//
//        action.type2(searchUser, "balram642");
//        Thread.sleep(6000);
//        action.click2(searchButtonUser);
//
   }
//
//
//
//
//
//
//
//