package pageobjects;

import Utilities.Action;
import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accessInternalPage extends BaseClass {

    public accessInternalPage(){
        PageFactory.initElements(driver,this);
    }
    accessPage ap = new accessPage();
    Action act = new Action();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//*[contains(text(),'Please confirm that you would like to perform this action')]//following-sibling::button")
    WebElement confirmPopup;

    @FindBy(css = "button.AccessGrantAuthenticationCredentials___StyledButton-sc-1304ubi-0")
    WebElement cancelPopupButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div[3]/div/button")
    WebElement emailsend;

    public void navigatetoInternal() throws InterruptedException {
        Thread.sleep(5000);
        ap.navigateToAccessPage();
        Thread.sleep(3000);
        ap.searchUsingGuest();
        act.findLinkUsingText(ap.guestUser);
        js.executeScript("window.scrollBy(0,350)","");
        Thread.sleep(3000);
        ap.confirmationId.click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,250)","");
        act.findButtonUsingText("Credentials");

        act.findButtonUsingText("Requirements");
        act.findButtonUsingText("Resources");
        act.findButtonUsingText("Payment Transactions");
        act.findButtonUsingText("Emails");
        Thread.sleep(3000);
        act.click2(emailsend);
        act.click2(confirmPopup);
        act.findButtonUsingText("Access Setup");

        act.findByGenericText("Get authentication credentials");
        act.click2(confirmPopup);
        act.click2(cancelPopupButton);
        Thread.sleep(5000);


    }

}
