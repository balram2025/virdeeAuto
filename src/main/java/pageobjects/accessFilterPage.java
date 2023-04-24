package pageobjects;

import Utilities.Action;
import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class accessFilterPage extends BaseClass {
    usersFilterPage up = new usersFilterPage();

    Action action = new Action();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public accessFilterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[text()='Access']")
    WebElement accessButton;

    @FindBy(xpath = "//label[text()='Search Users']//following-sibling::div")
    WebElement searchUsers;

    @FindBy(xpath = "//label[text()='Search Users']//following-sibling::div//input")
    WebElement searchUsersInput;

    @FindBy(xpath = "//label[text()='Search Locations']//following-sibling::div")
    WebElement searchLLocation;

    @FindBy(xpath = "//label[text()='Search Locations']//following-sibling::div//input")
    WebElement searchLLocationInput;

    @FindBy(css = "[aria-label='Choose Tuesday, December 13, 2022 as your check-in date. It’s available.']")
    WebElement fromDate;

    @FindBy(css = "[aria-label='Choose Friday, December 23, 2022 as your check-out date. It’s available.']")
    WebElement toDate;

    @FindBy(xpath = "//label[text()='Check-in']//following-sibling::div")
    WebElement checkIn;
    @FindBy(xpath = "//label[text()='Check-in']//following-sibling::div//input")
    WebElement checkInInput;

    @FindBy(xpath = "//label[text()='Check-out']//following-sibling::div")
    WebElement checkOut;
    @FindBy(xpath = "//label[text()='Check-out']//following-sibling::div//input")
    WebElement checkOutInput;

    @FindBy(css = "[name='code']")
    WebElement code;

    @FindBy(css = "input#date-picker-start")
    WebElement inputDate;

    @FindBy(xpath = "(//div[text()='BALRAM KUMAR'])[2]")
    WebElement selectUser;

    @FindBy(xpath = "(//div[text()='Hotel Virdee'])[2]")
    WebElement selectLocation;

    @FindBy(xpath = "(//div[text()='02 00'])[2]")
    WebElement checkInTime;

    @FindBy(xpath = "(//div[text()='05 30'])[2]")
    WebElement checkOutTime;

    @FindBy(css = "input[value='Set Requirements']")
    WebElement setRequirementsButton;

    @FindBy(xpath = "//span[text()='Secondary Users']")
    WebElement secondaryUsers;

    @FindBy(css = "input[type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "//button[text()='Guest']")
    WebElement guest;

    @FindBy(xpath = "//button[text()='Code']")
    WebElement codeFilter;

    @FindBy(xpath = "//a[contains(text(),'BALRAM KUMAR')]")
    WebElement expectedName;

    @FindBy(xpath = "(//input[@name='searchValue'])[1]")
    WebElement searchHomePage1;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement submitHomePage1;

    @FindBy(xpath = "(//button[text()='Guest'])[1]")
    WebElement guestHomePage1;

    @FindBy(xpath = "(//a[contains(text(),'BALRAM KUMAR')])[1]")
    WebElement expectedNameHomePage;

    @FindBy(xpath = "//p[text()='Home']")
    WebElement homeIcon;

    @FindBy(xpath = "//button[text()='Add Requirement']")
    WebElement addRequirement;

    @FindBy(xpath = "//label[text()='Type']//following-sibling::div//input")
    WebElement selectType;

    @FindBy(xpath = "//label[text()='Status']//following-sibling::div//input")
    WebElement selectStatus;

    @FindBy(xpath = "(//div[text()='PAYMENT STATUS'])[1]")
    WebElement paymentStatus;

    @FindBy(xpath = "(//div[text()='COMPLETED'])[1]")
    WebElement completed;

    @FindBy(xpath = "(//div[text()='tanush101'])[1]")
    WebElement secondaryUser;

    @FindBy(css = "input[value='Set Resources']")
    WebElement setResourcesButton;

    @FindBy(css = "input[value='Set Secondary Users']")
    WebElement setSecondaryResourceButton;

    @FindBy(xpath = "//div[text()='Select...']//following-sibling::div//input")
    WebElement selectSecondaryUserInput;

    @FindBy(xpath = "//div[text()='Select...']//following-sibling::div")
    WebElement selectSecondaryUser;

    @FindBy(css = "tbody tr:nth-of-type(1) td:nth-of-type(4) a")
    WebElement confirmationId;


    @FindBy(xpath = "(//button[text()='Location'])[2]")
    WebElement locationFilter;

    @FindBy(xpath = "(//button[text()='ID Verification Status'])[1]")
    WebElement IdVerification;

    @FindBy(xpath = "(//button[text()='Check-in'])[1]")
    WebElement checkInFilter;

    @FindBy(xpath = "(//button[text()='Check-out'])[1]")
    WebElement checkOutFilter;

    @FindBy(xpath = "(//button[text()='Status'])[1]")
    WebElement statusFilter;

    @FindBy(xpath = "(//button[text()='State'])[1]")
    WebElement stateFilter;

    @FindBy(css = "div.Checkbox___StyledContainer-sc-1hali8s-0 p")
    List<WebElement> rolesFilter;

    @FindBy(xpath = "//button[text()='Apply Filters']")
    WebElement applyFilters;

    @FindBy(xpath = "//button[text()='Reset']")
    WebElement resetButton;


    @FindBy(xpath = "//*[text()='Hotel Dream']")
    WebElement hotelVirdee;

    public void navigateToAccessPage() throws InterruptedException {
                action.click2(accessButton);
    Thread.sleep(4000);}




//
//    public void abc() throws InterruptedException {
//        /**
//         * navigate to CREATE ACCESS GRANT**/
//
//        action.click2(accessButton);
//        js.executeScript("window.scrollBy(0,-250)", "");
//        action.click2(up.createButton);
//
//        /**
//         * (2) fill all details in GRANT **/
//        action.click2(searchUsers);
//        action.type2(searchUsersInput, "BALRAM KUMAR");
//        action.click2(selectUser);
//        action.click2(searchLLocation);
//        action.type2(searchLLocationInput, "Hotel Virdee");
//        action.click2(selectLocation);
//        action.click2(inputDate);
//        action.click(driver, fromDate);
//        action.click(driver, toDate);
//        action.click2(checkIn);
//        action.type2(checkInInput, "02 00");
//        action.click2(checkInTime);
//        action.click2(checkOut);
//        action.type2(checkOutInput, "05 30");
//        action.click2(checkOutTime);
//        action.type(code, "123");
//        action.click2(setRequirementsButton);
//
//        /**
//         * (3) fill all details in REQUIREMENTS  **/
//
//        action.click2(addRequirement);
//        action.click2(selectType);
//        action.type2(selectType, "Payment status");
//        action.click2(action.findByText("PAYMENT STATUS"));
//        action.click2(selectStatus);
//        action.type2(selectStatus, "completed");
//        action.click2(action.findByText("COMPLETED"));
//        action.click2(setResourcesButton);
//        action.click2(setSecondaryResourceButton);
//        /**
//         * (4) fill all details in SECONDARY USERS  **/
//
//
//        Thread.sleep(2000);
//        action.JSClick(driver, selectSecondaryUserInput);
//        action.type2(selectSecondaryUserInput, "tanush101");
//        action.JSClick(driver, secondaryUser);
//        action.click2(submitButton);
//
//        /**
//         *  handle confirmation alert  **/
//        action.click2(up.confirmAction);
//
//
//        /**
//         *  search user in "ACCESS" module using NAME **/
//
//        action.type2(up.searchUser, "BALRAM KUMAR");
//        action.click2(guest);
//        action.click2(up.searchButtonUser);
//        Thread.sleep(3000);
//        Assert.assertEquals(expectedName.getText(), "BALRAM KUMAR");
//
//        String expectedConfirmationId = confirmationId.getText();
//        action.type2(up.searchUser, expectedConfirmationId);
//        action.click2(codeFilter);
//        action.click2(up.searchButtonUser);
//        Thread.sleep(3000);
//        Assert.assertEquals(expectedConfirmationId, expectedConfirmationId);
//
//        /**
//         *  search user in "HOME" module using NAME **/
//        Thread.sleep(3000);
//        action.click2(homeIcon);
//        action.type2(searchHomePage1, "BALRAM KUMAR");
//        action.click2(guestHomePage1);
//        action.click2(submitHomePage1);
//        js.executeScript("window.scrollBy(0,250)", "");
//        Assert.assertEquals(expectedNameHomePage.getText(), "BALRAM KUMAR");
//
//        action.type2(up.searchUser, expectedConfirmationId);
//        action.click2(codeFilter);
//        action.click2(up.searchButtonUser);
//        Thread.sleep(3000);
//        Assert.assertEquals(expectedConfirmationId, expectedConfirmationId);
//        js.executeScript("window.scrollBy(0,250)", "");

//    }
        public void searchFilterAccess() throws InterruptedException {
            Thread.sleep(5000);
//            action.click2(accessButton);
            js.executeScript("window.scrollBy(0,-250)", "");

            Thread.sleep(5000);

//            locationFilter.click();

//            action.scrollByVisibilityOfElement(driver,hotelVirdee);
//            Thread.sleep(2000);
//            action.selectCheckBoxUsingName(rolesFilter, "Hotel Virdee");
//            Thread.sleep(2000);
//            applyFilters.click();
//            Thread.sleep(5000);
//            js.executeScript("window.scrollBy(0,-1250)", "");
            Thread.sleep(5000);
            IdVerification.click();
            js.executeScript("window.scrollBy(0,250)", "");
            Thread.sleep(1000);
            action.selectCheckBoxUsingName(rolesFilter, "COMPLETED");
            action.selectCheckBoxUsingName(rolesFilter, "CONTACT_USER");
            js.executeScript("window.scrollBy(0,150)", "");
//            js.executeScript("window.scrollBy(0,-150)", "");
//            action.selectCheckBoxUsingName(rolesFilter, "FAILED");
            Thread.sleep(2000);
            applyFilters.click();
            Thread.sleep(5000);
            js.executeScript("window.scrollBy(0,-150)", "");
            Thread.sleep(3000);
            checkInFilter.click();
            action.selectCheckBoxUsingName(rolesFilter, "+1d");
            action.selectCheckBoxUsingName(rolesFilter, "+1w");
//            action.selectCheckBoxUsingName(rolesFilter, "+1y");
            Thread.sleep(2000);
            applyFilters.click();
            Thread.sleep(5000);

            checkOutFilter.click();
            action.selectCheckBoxUsingName(rolesFilter, "+1d");
            action.selectCheckBoxUsingName(rolesFilter, "+1w");
//            action.selectCheckBoxUsingName(rolesFilter, "+1y");
            Thread.sleep(2000);
            applyFilters.click();
            Thread.sleep(5000);

            stateFilter.click();
            action.selectCheckBoxUsingName(rolesFilter,"CANCELED");
            action.selectCheckBoxUsingName(rolesFilter,"CHECKED_OUT");
            Thread.sleep(2000);
            applyFilters.click();
            Thread.sleep(5000);

            statusFilter.click();
            action.selectCheckBoxUsingName(rolesFilter,"CANCELED");
            Thread.sleep(2000);
            applyFilters.click();

            Thread.sleep(5000);
            resetButton.click();
            Thread.sleep(5000);
            driver.get(driver.getCurrentUrl());
            Thread.sleep(5000);



        }

        public void accessSortings(String State, String Confirmation,String Start,String End ) throws InterruptedException {
            action.sortIt(State);
            action.sortIt(Confirmation);
            action.sortIt(Start);
            action.sortIt(End);
        }
    public void accessSortings(String State,String Start,String End ) throws InterruptedException {
        action.sortIt(State);
        action.sortIt(Start);
        action.sortIt(End);
    }



}
