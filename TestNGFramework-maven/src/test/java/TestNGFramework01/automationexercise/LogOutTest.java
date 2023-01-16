package TestNGFramework01.automationexercise;

import TestNGFramework01.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogOutTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void Test_Case04_Log_Out_User() {

        // Launch browser
        //Navigate to url 'http://automationexercise.com'

        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://automationexercise.com/");


        //Click on 'Signup / Login' button
        pages.getHomePage().clickSignupLoginButton();

        //Verify 'Login to your account!' is visible
        String loginAccountMessage = pages.getLoginPage().LoginAccountMessage();
        softAssert.assertEquals(loginAccountMessage, "Login to your account", "Test Case 2 - Verify 'Login to your account!' is visible");

        // Enter correct email address and password
        //Click 'login' button
        pages.getLoginPage().setLoginAccountEmailAddressBox("123@123");
        pages.getLoginPage().setLoginAccountPasswordBox("123");
        pages.getLoginPage().setLoginButton();


        //Verify that 'Logged in as username' is visible
        softAssert.assertEquals(pages.getHomePage().loggedMessage(), "Logged in as 123");

        // Click 'Logout' button
        pages.getHeader().clickLogOutButton();

        softAssert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://automationexercise.com/login");
        softAssert.assertAll();


    }


}
