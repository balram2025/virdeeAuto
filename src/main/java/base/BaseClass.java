package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;


    @BeforeSuite
    public void launchApp() {

        ExtentManager.setExtent();

//			System.setProperty("webdriver.chrome.driver","C:\\Users\\Devendra\\newonex\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized"); // open Browser in maximized mode
//		options.addArguments("disable-infobars"); // disabling infobars
//		options.addArguments("--disable-extensions"); // disabling extensions
//		options.addArguments("--disable-gpu"); // applicable to windows os only
//		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//		options.addArguments("--no-sandbox"); // Bypass OS security model
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);


//			WebDriver driver = new ChromeDriver();
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://dashboard-dev.virdee.co/login");
//        https://dashboard-dev.virdee.co/login
//        https://dashboard-stage-backend-prd4964.virdee.co/users
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite()
    public void afterSuite() {
        ExtentManager.endReport();
        driver.quit();
    }
}
