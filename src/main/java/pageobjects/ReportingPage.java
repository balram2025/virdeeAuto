package pageobjects;

import Utilities.Action;
import base.BaseClass;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportingPage extends BaseClass {

    public ReportingPage(){PageFactory.initElements(driver,this);}

    Action action = new Action();

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


    public void userReporting() throws InterruptedException{
        /**
         * Checking users Reporting Arrivals
         */
        Thread.sleep(1000);
    action.click2(reportingButton);
    action.type2(inputOnArrivals ,"BALRAM KUMAR");
    action.click2(guestButton);
    action.click2(searchButton);
    js.executeScript("window.scrollBy(0,250)", "");
    Thread.sleep(500);
    action.click2(tickButton);
    action.click2(balram001Click);
    js.executeScript("window.scrollBy(0,-250)", "");
    Thread.sleep(500);
    action.click2(backButton);
    action.click2(reportingButton);

        /**
         * Checking users Reporting CallRecords
         */
    action.click2(callRecords);
    js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);
    js.executeScript("window.scrollBy(0,550)", "");
        Thread.sleep(1000);
    js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(1000);
    js.executeScript("window.scrollBy(0,-1500)", "");
        Thread.sleep(1000);

        /**
         * Checking Users Reporting Arrivals By Day
         */
        action.click2(arrivalsByDay);
    js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);
    js.executeScript("window.scrollBy(0,550)", "");
        Thread.sleep(4500);
    js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(1000);
    js.executeScript("window.scrollBy(0,-1500)", "");
        Thread.sleep(1000);

        /**
         * Checking users Reporting Room Not Ready Queue
         */
        action.click2(roomNotReadyQueuer);
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);

    }


}
