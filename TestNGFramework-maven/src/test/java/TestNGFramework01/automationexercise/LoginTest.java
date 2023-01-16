package TestNGFramework01.automationexercise;

import TestNGFramework01.utilities.BrowserUtils;
import TestNGFramework01.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class LoginTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();
    // We should use soft assertion because in this test case we have multiple cases to test

    @Test(priority = 0)
    public void Test_Case02_LoginUser_Correct_Email_Password() throws IOException {
        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://automationexercise.com/");

        //Click on 'Signup / Login' button
        pages.getHomePage().clickSignupLoginButton();


        //Verify 'Login to your account!' is visible
        String loginAccountMessage = pages.getLoginPage().LoginAccountMessage();
        softAssert.assertEquals(loginAccountMessage, "Login to your account", "Test Case 2 - Verify 'Login to your account!' is visible");

        // Enter correct email address and password
        //Click 'login' button
        pages.getLoginPage().setLoginAccountEmailAddressBox("xxxx@gmail.com");
        pages.getLoginPage().setLoginAccountPasswordBox("12345");
        pages.getLoginPage().setLoginButton();

        //Verify that 'Logged in as username' is visible
        softAssert.assertEquals(pages.getHomePage().loggedMessage(), "Logged in as xxxx");
        getScreenshot("TestCase02", Driver.getDriver());

        //Click 'Delete Account' button
        pages.getHomePage().setClickDeleteAccount();
        BrowserUtils.navigateBackAndForwardToDismissAds();

        // Verify that 'ACCOUNT DELETED!' is visible
        String accountDeleted = pages.getAccountDeletePage().getAccountDeletedMessage();
        softAssert.assertEquals(accountDeleted, "ACCOUNT DELETED!");

        softAssert.assertAll();


    }

    @Test(priority = 1)
    public void Test_Case03_LoginUser_InCorrect_Email_Password() throws IOException {
        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://automationexercise.com/");

        //Click on 'Signup / Login' button
        pages.getHomePage().clickSignupLoginButton();


        //Verify 'Login to your account!' is visible
        String loginAccountMessage = pages.getLoginPage().LoginAccountMessage();
        softAssert.assertEquals(loginAccountMessage, "Login to your account", "Test Case 3 - Verify 'Login to your account!' is visible");

        // Enter correct email address and password
        //Click 'login' button
        pages.getLoginPage().setLoginAccountEmailAddressBox("xxxx@gmail.com");
        pages.getLoginPage().setLoginAccountPasswordBox("12345");
        pages.getLoginPage().setLoginButton();

        // Verify error 'Your email or password is incorrect!' is visible
        String inCorrectMessage=pages.getLoginPage().inCorrectMessage();
        softAssert.assertEquals(inCorrectMessage,"Your email or password is incorrect!");
        getScreenshot("TestCase03IncorrectMessage",Driver.getDriver());



        softAssert.assertAll();



    }


}
