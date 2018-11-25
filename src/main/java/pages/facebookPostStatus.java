package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Sakib on 7/6/2017.
 */
public class facebookPostStatus {

    //Declaration of WebDriver
    WebDriver driver;

    //Find post field on Home page by name and create a Webelement object
    @FindBy(name ="xhpc_message")
    WebElement postBox;
    //Find post button by name and create a Webelement object
    @FindBy(xpath = "//button[contains(.,'Post')]")
    WebElement postButton;

    //Constructor of this class to get the webdriver and initialize webelements
    public facebookPostStatus(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);

    }
    //Method for clicking on the post element
    public void clickOnPostBox(){postBox.click();}
    //Method for sending text to post element
    public void postMessage(String post){postBox.sendKeys(post);}
    //Method for clicking on the post button
    public void clickOnPostButton(){postButton.click();}
    //Method called from facebookPostPage, this method is the testcase which will assert the review that was posted
    //in the post review section.
    public void setMessage(String strPost){

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Click on post field
        this.clickOnPostBox();
        //Write "Hello World" message passed by "strPost"
        this.postMessage(strPost);
    }

    //Click on login button
    public void clickPostButton(){
        this.clickOnPostButton();

    }

}
