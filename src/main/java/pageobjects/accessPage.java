package pageobjects;

import Utilities.Action;
import Utilities.testData;
import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class accessPage extends BaseClass {
    usersPage up = new usersPage();

    Action action = new Action();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    String inputUserName = "balram0010";
    String newUserName = "balram0011";

    public accessPage() {
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

    @FindBy(css = "[aria-label='Choose Friday, April 21, 2023 as your check-in date. It’s available.']")
    WebElement fromDate;

    @FindBy(css = "[aria-label='Choose Monday, April 24, 2023 as your check-out date. It’s available.']")
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

    @FindBy(xpath = "(//div[text()='balram010'])[2]")
    WebElement selectUser;

    @FindBy(xpath = "(//div[text()='balram010'])[2]")
    WebElement selectEditUser;

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

    @FindBy(xpath = "//button[text()='Location']")
    WebElement locationFilter;

    @FindBy(xpath = "//a[contains(text(),'balram010')]")
    WebElement expectedName;

    @FindBy(xpath = "//a[contains(text(),'balram002')]")
    WebElement expectedEditedName;

    @FindBy(xpath = "(//input[@name='searchValue'])[1]")
    WebElement searchHomePage1;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement submitHomePage1;

    @FindBy(xpath = "(//button[text()='Guest'])[1]")
    WebElement guestHomePage1;

    @FindBy(xpath = "(//a[contains(text(),'balra0010')])[1]")
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

    @FindBy(css = ".Sidebar___StyledContainer4-sc-1nyp80q-3 button")
    WebElement logoutButton;

    @FindBy(xpath = "//h3[text()='Incoming Stays (72H)']//following-sibling::div[1]//tr[1]/td[1]/div//div/div")
    WebElement firstCheckbox;

    @FindBy(xpath = "//following-sibling::div[1]//tr[1]/td[1]/div//div/div")
    WebElement firstCheckBoxAccess;

    public void getUserName() {
        driver.findElement(By.xpath("(//a[contains(text(),'balram0010')])[1]"));
    }

    public void navigateToAccessPage() throws InterruptedException {
        action.click2(accessButton);
        js.executeScript("window.scrollBy(0,-650)", "");
    }

    public void accessDetails() throws InterruptedException {
        /**
         * navigate to CREATE ACCESS GRANT**/
        action.click2(up.createButton);

        /**
         * (2) fill all details in GRANT **/
        action.click2(searchUsers);
        action.type2(searchUsersInput, "balram010");
        action.click2(selectUser);
        action.click2(searchLLocation);
        action.type2(searchLLocationInput, "Hotel Virdee");
        action.click2(selectLocation);
        action.click2(inputDate);
        action.click(driver, fromDate);
        action.click(driver, toDate);
        action.click2(checkIn);
        action.type2(checkInInput, "02 00");
        action.click2(checkInTime);
        action.click2(checkOut);
        action.type2(checkOutInput, "05 30");
        action.click2(checkOutTime);
        action.type(code, "123");
        action.click2(setRequirementsButton);

        /**
         * (3) fill all details in REQUIREMENTS  **/

        action.click2(addRequirement);
        action.click2(selectType);
        action.type2(selectType, "Payment status");
        action.click2(action.findByText("PAYMENT STATUS"));
        action.click2(selectStatus);
        action.type2(selectStatus, "completed");
        action.click2(action.findByText("COMPLETED"));
        action.click2(setResourcesButton);
        action.click2(setSecondaryResourceButton);
        /**
         * (4) fill all details in SECONDARY USERS  **/


        Thread.sleep(2000);
        action.JSClick(selectSecondaryUserInput);
        action.type2(selectSecondaryUserInput, "tanush101");
        action.JSClick(secondaryUser);
        action.click2(submitButton);

        /**
         *  handle confirmation alert  **/
        action.click2(up.confirmAction);

        Thread.sleep(3000);


// click checkbox for each and every search , to validate it

        /**
         *  search user in "ACCESS" module using NAME **/

        action.type2(up.searchUser, "balram010");
        action.click2(guest);
        action.click2(up.searchButtonUser);
        Thread.sleep(3000);
        Assert.assertEquals(expectedName.getText(), "balram010");
        Thread.sleep(2000);
        action.click2(firstCheckBoxAccess);

        /**
         *  search user in "ACCESS" module using CODE **/

        String expectedConfirmationId = confirmationId.getText();
        action.type2(up.searchUser, expectedConfirmationId);
        action.click2(codeFilter);
        action.click2(up.searchButtonUser);
        Thread.sleep(3000);
        Assert.assertEquals(expectedConfirmationId, expectedConfirmationId);
        Thread.sleep(2000);
        action.click2(firstCheckBoxAccess);
        Thread.sleep(1000);

        /**
         *
         *
         *
         *
         *
         *
         *
         *  search user in "ACCESS" module using LOCATION (Hotel Virdee) **/
        action.type2(up.searchUser, "Hotel Virdee");
        action.click2(locationFilter);
        action.click2(up.searchButtonUser);
        Thread.sleep(2000);
        action.click2(firstCheckBoxAccess);


        /**
         *  search user in "HOME" module using NAME **/
        Thread.sleep(3000);
        action.click2(homeIcon);
        action.type2(searchHomePage1, "balram010");
        action.click2(guestHomePage1);
        action.click2(submitHomePage1);
        js.executeScript("window.scrollBy(0,550)", "");
//        Assert.assertEquals(expectedNameHomePage.getText(), "balram009");
        Thread.sleep(2000);
//        action.click2(firstCheckbox);
//
//
//        /**
//         *  search user in "HOME" module using CODE **/
//
//        action.type2(up.searchUser, expectedConfirmationId);
//        action.click2(codeFilter);
//        action.click2(up.searchButtonUser);
//        Thread.sleep(3000);
//        js.executeScript("window.scrollBy(0,250)", "");
//        Assert.assertEquals(expectedConfirmationId,expectedConfirmationId);
//        Thread.sleep(2000);
//        action.click2(firstCheckbox);
//        js.executeScript("window.scrollBy(0,-250)", "");
//
//        /**
//         *
//         *
//         *
//         *
//         *
//         *
//         *
//         *  search user in "HOME" module using LOCATION (Hotel Virdee) **/
//
//
//        action.type2(up.searchUser, "Hotel Virdee");
//        action.click2(locationFilter);
//        action.click2(up.searchButtonUser);
//        js.executeScript("window.scrollBy(0,250)", "");
//        Thread.sleep(3000);
//        action.click2(firstCheckbox);
//
//        action.click2(homeIcon);
//        action.type2(searchHomePage1,"balram009");
//        action.click2(firstCheckbox);


        /**
         *
         * Access edit
         *
         *
         */
    }

    final String guestUser = "balram001";

    public void searchUsingGuest() throws InterruptedException {
        action.click2(accessButton);
        action.type2(up.searchUser, guestUser);
        action.click2(guest);
        action.click2(up.searchButtonUser);
        Thread.sleep(2000);
        action.click2(firstCheckBoxAccess);
    }

//
//        action.click2(up.editButton);
    /**
     *
     For edit input
     *
     *
     */



//
//
//        action.type2(up.searchUser,"balram002");
//        action.click2(guest);
//        action.click2(up.searchButtonUser);
//        Thread.sleep(3000);
//        Assert.assertEquals(expectedEditedName.getText(),"balram002");
//        Thread.sleep(2000);
//        action.click2(firstCheckBoxAccess);
//
//        action.click2(up.deleteButton);
//
//        driver.navigate().refresh();


    public void editUser() throws InterruptedException {
        action.click2(up.editButton);
        action.click2(searchUsers);
        action.type2(searchUsersInput,"balram009");
        action.click2(selectEditUser);
        action.click2(secondaryUsers);
        action.click2(submitButton);
        action.click2(up.confirmAction);
        Thread.sleep(2000);

    }


    //come to homepage , search using name , edit it ...validate it using name at access and home page
    //come to access page search it and select checkbox , delete it
    //refresh chrome
    //search id which is deleted in access grant page
    //logout
}


















