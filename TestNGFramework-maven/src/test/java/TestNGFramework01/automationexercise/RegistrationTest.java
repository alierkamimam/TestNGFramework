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
        String newUserSignUpMessage = pages.getLoginPage().setNewUserSignUpMessage();

        //Verify 'New User Signup!' is visible
        softAssert.assertEquals(newUserSignUpMessage, "New User Signup!", "Test Case 1 - Verify 'New User Signup!' is visible");
        //LoginPage
        pages.getLoginPage().setSignupNameBox("erkam123");
        pages.getLoginPage().setSignupEmailAddressBox("erk123@mail.com");
        pages.getLoginPage().setSignupButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();

        //SignUpPage
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
        pages.getSignupPage().setCreateAccountButton();

        String accountCreatedMessage = pages.getSignupPage().accountCreatedMessage();
        softAssert.assertEquals(accountCreatedMessage, "ACCOUNT CREATED!", "Test Case 1 - Verify 'Account Created!' is visible");

        pages.getSignupPage().clickContinueButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();

        String loggedMessage = pages.getHomePage().loggedMessage();

        softAssert.assertEquals(loggedMessage,"Logged in as erkam123");

        pages.getHomePage().setClickDeleteAccount();
        String accountDeletedMessage=pages.getHomePage().accountDeletedMessage();
        softAssert.assertEquals(accountDeletedMessage,"ACCOUNT DELETED!","Test Case 1 - Verify 'Account Deleted!' is visible");

        softAssert.assertAll();


    }


    @AfterSuite
    public void afterTest() {
        // Perform cleanup tasks or generate test reports here
        Driver.getDriver().quit();
    }


}



