package pageobjects;

import Utilities.Action;
import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reporting extends BaseClass {

    public Reporting(){PageFactory.initElements(driver,this);}

    Action action = new Action();

    accessFilterPage afp = new accessFilterPage();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(css = "button[data-path='/reporting']")
    WebElement reportingButton;

    @FindBy(css = "input[placeholder='Input']")
    WebElement inputOnArrivals;

    @FindBy(xpath = "//button[text()='Guest']")
    WebElement guestButton;

    @FindBy(xpath = "//button[text()='Search']")
    WebElement searchButton;

    @FindBy(xpath = "//*[local-name()='div' and @class='sc-hKFyIo fUcMsa']")
    WebElement tickButton;

    @FindBy(xpath = "//a[contains(text(),'BALRAM KUMAR')]")
    WebElement balram001Click;

    @FindBy(xpath = "(//*[local-name()='svg' and @xmlns='http://www.w3.org/2000/svg'])[10]")
    WebElement backButton;

    @FindBy(xpath = "//button[contains(text(),'Call Records')]")
    WebElement callRecords;

    @FindBy(xpath = "//button[contains(text(),'Arrivals By Day')]")
    WebElement arrivalsByDay;

    @FindBy(xpath = "//button[contains(text(),'Room Not Ready Queue')]")
    WebElement roomNotReadyQueuer;

    @FindBy(xpath = "(//button[@class='Button-sc-1c6b8h1-0 jNIsRC'])[8]")
    WebElement logOut;

    public void navigateToReportingPage() throws InterruptedException {
        Thread.sleep(1000);
        action.click2(reportingButton);
    }

    public void filterReporting() throws InterruptedException {
        afp.searchFilterAccess();
    }

    public void sortReporting() throws InterruptedException {
        action.findButtonUsingText("Arrivals");
        Thread.sleep(2000);
//        afp.accessSortings("State","Start","End");
    }


    public void userReporting() throws InterruptedException{
        /**
         * Checking users Reporting Arrivals
         */

        action.type2(inputOnArrivals ,"BALRAM KUMAR");
        action.click2(guestButton);
        action.click2(searchButton);
        js.executeScript("window.scrollBy(0,950)", "");
        js.executeScript("window.scrollBy(0,-150)", "");
//        Thread.sleep(2000);
//        action.click2(tickButton);
//        action.click2(balram001Click);
//        js.executeScript("window.scrollBy(0,-250)", "");
//        Thread.sleep(500);
//        action.click2(backButton);
//        action.click2(reportingButton);

        /**
         * Checking users Reporting CallRecords
         */
        action.JSClick(callRecords);
        action.scrollDownAndUp();

        /**
         * Checking Users Reporting Arrivals By Day
         */
        action.click2(arrivalsByDay);
        action.scrollDownAndUp();
        action.findLinkUsingText("Download CSV");

        /**
         * Checking users Reporting Room Not Ready Queue
         */
        action.click2(roomNotReadyQueuer);
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);

        /**
         * Checking DashBoard LogOut
         */
//        action.click2(logOut);
//        Thread.sleep(1000);
    }


}
