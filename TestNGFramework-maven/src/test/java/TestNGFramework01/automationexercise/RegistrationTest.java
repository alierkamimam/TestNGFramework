package TestNGFramework01.automationexercise;

import TestNGFramework01.utilities.BrowserUtils;
import TestNGFramework01.utilities.ConfigurationReader;
import TestNGFramework01.utilities.Driver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistrationTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert(); // We should use soft assertion because in this test case we have multiple cases to test

    @BeforeSuite
    public void setUpSuite() {
        // code that is executed before the entire test suite
        String URL = ConfigurationReader.getProperty("url");
        String browser = ConfigurationReader.getProperty("browser");
        String environment = ConfigurationReader.getProperty("environment");

        Driver.getDriver().get(URL);
        System.out.println(":::::: Test Information ::::::\n\tURL :\"" + URL + "\"\n\tBrowser :\"" + browser + "\"\n\tEnvironment :" + environment);
        BrowserUtils.wait(1);


    }

    @Test(priority = 0)
    public void Test_1_Register_User() {

        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Click on 'Signup / Login' button
        pages.getHomePage().clickSignupLoginButton();

        //Verify 'New User Signup!' is visible
        String newUserSignUpMessage = pages.getLoginPage().setNewUserSignUpMessage();
        softAssert.assertEquals(newUserSignUpMessage, "New User Signup!", "Test Case 1 - Verify 'New User Signup!' is visible");

        //Enter name and email address
        pages.getLoginPage().setSignupNameBox("testCase01");
        pages.getLoginPage().setSignupEmailAddressBox("testCase01@mail.com");

        // Click 'Signup' button
        pages.getLoginPage().setSignupButton();

        //Dismiss pop-ups by navigating back and forward page
        BrowserUtils.navigateBackAndForwardToDismissAds();

        //Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        pages.getSignupPage().setSelectButtonMen();
        pages.getSignupPage().setPasswordBox("12345");
        pages.getSignupPage().setDate("1", "Month", "1997");
        pages.getSignupPage().setFirstNameBox("x");
        pages.getSignupPage().setLastNameBox(":x");
        pages.getSignupPage().setCompanyBox("inar");
        pages.getSignupPage().setAddress1Box("abcd");
        pages.getSignupPage().setAddress2Box("123345");
        pages.getSignupPage().setCountryDropDown("Canada");
        pages.getSignupPage().setStateBox("Dallas");
        pages.getSignupPage().setCityBox("hulln");
        pages.getSignupPage().setZipCodeBox("0990");
        pages.getSignupPage().setMobileNumberBox("0555");
        BrowserUtils.wait(3);
        //Click 'Create Account button'
        pages.getAccountCreatedPage().createAccountButton();

        //Verify that 'ACCOUNT CREATED!' is visible
        String accountCreatedMessage = pages.getAccountCreatedPage().accountCreatedMessage();
        softAssert.assertEquals(accountCreatedMessage, "ACCOUNT CREATED!", "Test Case 1 - Verify 'Account Created!' is visible");

        //Click 'Continue' button
        pages.getAccountCreatedPage().continueButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();

        //Verify that 'Logged in as username' is visible.
        String loggedMessage = pages.getHomePage().loggedMessage();
        softAssert.assertEquals(loggedMessage, "Logged in as testCase01", "Test Case 1 - Verify 'Logged in as <name>' is visible");

        //Click 'Delete Account' button
        pages.getHomePage().setClickDeleteAccount();
        BrowserUtils.wait(3);

        //Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        String actualAccountDeletedMessage = pages.getAccountDeletePage().getAccountDeletedMessage();
        softAssert.assertEquals(actualAccountDeletedMessage, "ACCOUNT DELETED!", "Test Case 1 - Verify 'Account Deleted!' is visible");
        pages.getAccountDeletePage().getClickContinueButton();

        softAssert.assertAll();


    }


    @AfterSuite
    public void afterTest() {
        // Perform cleanup tasks or generate test reports here
        // Driver.getDriver().quit();
    }


}



