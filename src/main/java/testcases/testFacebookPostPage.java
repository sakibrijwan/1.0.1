package testcases;

import org.testng.annotations.Test;
import pages.facebookPostStatus;

import static testcases.Config.driver;

/**
 * Created by Sakib on 7/6/2017.
 */
public class testFacebookPostPage {
    //Declaration of facebookPostStatus object.
    facebookPostStatus objPost;

    //Test will be initiated from here by TestNG framework. This method will click on status box in facebook home page,
    // and write "Hello World" in the status box.
    @Test
    public void test_Post(){
        //Create Login Page object
        objPost = new facebookPostStatus(driver);
        //login to application
        objPost.setMessage("Hello World");
    }

    //Test will be initiated from here by TestNG framework. This method will click on post button to post "Hello World"
    // status message.
    @Test
    public void test_clickPostButton(){
        objPost = new facebookPostStatus(driver);
        objPost.clickPostButton();
    }


}
