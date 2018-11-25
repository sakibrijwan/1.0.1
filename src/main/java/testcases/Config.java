package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


/**
 * Created by Sakib on 7/12/2017.
 */
public class Config {
    //Declaration and initialize WebDriver
    public static WebDriver driver=null;
    //This method is called by TestNG framework using @BeforeSuite annotation before running any case.
    // It will initialize the Firefox Webdriver.
    @BeforeSuite
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver= new ChromeDriver();
    }
    //Close driver after finishing the test execution
    @AfterSuite
    public void driverQuite(){
        driver.quit();
    }
}
