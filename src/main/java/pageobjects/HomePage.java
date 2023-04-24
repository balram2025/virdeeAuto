package pageobjects;

import Utilities.Action;
import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.BaseClass.driver;

public class HomePage extends BaseClass {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }


    Action act = new Action();
    accessFilterPage afp = new accessFilterPage();



    @FindBy(xpath = "//p[text()='Home']")
    WebElement homeButton;



    public void navigateToHomePage() throws InterruptedException {
        Thread.sleep(5000);
        homeButton.click();
        Thread.sleep(4000);
    }

    public void filterHomePage() throws InterruptedException {

        afp.searchFilterAccess();
    }

    public void sortHomePage() throws InterruptedException {

//        afp.accessSortings();
    }

}
