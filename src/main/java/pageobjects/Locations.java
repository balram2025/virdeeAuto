package pageobjects;

import Utilities.Action;
import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locations extends BaseClass {

    public Locations(){PageFactory.initElements(driver,this);}

    Action action = new Action();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(css = "button[data-path='/locations']")
    WebElement locationsButton;

    @FindBy(css = "input[placeholder='Input']")
    WebElement inputLocations;

    @FindBy(css = "button[type='submit']")
    WebElement searchButton;

    @FindBy(xpath = "(//div[@class='sc-hKFyIo fUcMsa'])[2]")
    WebElement tickBox;

    @FindBy(xpath = "//a[text()='Hotel Virdee']")
    WebElement hotelVirdeeClick;

    @FindBy(xpath = "(//*[local-name()='svg' and @xmlns='http://www.w3.org/2000/svg'])[10]")
    WebElement backButton;

    @FindBy(xpath = "(//button[@class='Button-sc-1c6b8h1-0 jNIsRC'])[8]")
    WebElement logOut;


    /**
     * Checking Users Locations Dashboard Menu
     */

    public void goToLocations() throws InterruptedException{
        Thread.sleep(500);
        action.click2(locationsButton);
        action.type2(inputLocations,"Hotel Virdee");
        action.click2(searchButton);
//        action.click2(tickBox);
        action.click2(hotelVirdeeClick);
        js.executeScript("window.scrollBy(0,-250)","");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,250)","");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,550)","");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-1500)", "");
        Thread.sleep(1000);
        action.click2(backButton);

    }

    public void sortLocations() throws InterruptedException {
        action.sortIt("Name");
        action.sortIt("Phone");
        action.sortIt("Address");
    }

}