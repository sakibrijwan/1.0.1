package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sakib on 7/6/2017.
 */
public class facebookLogin {
    //Declaration of WebDriver
    WebDriver driver;
    //Find emil element on Login page by name and create a Webelement object
    @FindBy(name="email")
    WebElement email;
    //Find password element on Login page by name and create a Webelement object
    @FindBy(name="pass")
    WebElement password;
    //Find login button element on Login page by name and create a Webelement object
    @FindBy(id="loginbutton")
    WebElement loginButton;

    //Constructor of this class to get the webdriver and initialize webelements
    public facebookLogin(WebDriver driver){

        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

    }
    //Method to set email address to email address field
    public void setUserName(String strUserName){email.sendKeys(strUserName);
    }

    //Method to set password to password field
    public void setPassword(String strPassword){password.sendKeys(strPassword);
    }

    //Method for clicking on login button
    public void clickLogin(){loginButton.click();

    }
    //Method called from testFacebookLoginPage, this method is the testcase which will set email,password and
    //click on login button.
    public void loginToFacebook(String strUserName,String strPassword){

        //Fill user name
        this.setUserName(strUserName);

        //Fill password
        this.setPassword(strPassword);

        //Click Login button
        this.clickLogin();
    }

}
