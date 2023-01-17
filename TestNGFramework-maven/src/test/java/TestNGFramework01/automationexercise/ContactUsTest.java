package TestNGFramework01.automationexercise;

import TestNGFramework01.utilities.BrowserUtils;
import TestNGFramework01.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ContactUsTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void Test_Case_06_Contact_Us_From() {
        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://automationexercise.com/");

        // Click on 'Contact Us' button
        pages.getHeader().clickContactUs();

        //Verify 'GET IN TOUCH' is visible
        String getIntouchMessage = pages.getContactUsPage().getGetInTouchMessage();
        softAssert.assertEquals(getIntouchMessage, "GET IN TOUCH");
        BrowserUtils.wait(1);
        BrowserUtils.scrollDown("200");

        //Enter name, email, subject and message
        pages.getContactUsPage().getNameBox("xxx");
        pages.getContactUsPage().getEmailBox("xxx@xxx");
        pages.getContactUsPage().getSubjectBox("abc");
        pages.getContactUsPage().getMessageBox("hello");

        //Check whether Upload file button is enable
        softAssert.assertTrue(pages.getContactUsPage().getUploadFileButtonIsEnable());

        // Click 'Submit' button
        pages.getContactUsPage().getInputSubmitButton();

        //Click OK button
        Driver.getDriver().switchTo().alert().accept();

        // Verify success message 'Success! Your details have been submitted successfully.' is visible
        String successMessage = pages.getContactUsPage().successMessage();
        softAssert.assertEquals(successMessage, "Success! Your details have been submitted successfully.",
                "Test Case 6 Verify success message 'Success! Your details have been submitted successfully.' is visible");

        //Click 'Home' button and verify that landed to home page successfully
        BrowserUtils.switchToWindow(" Home");
        softAssert.assertAll();


    }
}
