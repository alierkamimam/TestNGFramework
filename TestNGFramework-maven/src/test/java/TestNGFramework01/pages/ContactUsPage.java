package TestNGFramework01.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    private WebElement getInTouchMessage;

    @FindBy(css = "input[placeholder='Name']")
    private WebElement nameBox;

    @FindBy(css = "input[placeholder='Email']")
    private WebElement emailBox;

    @FindBy(css = "input[placeholder='Subject']")
    private WebElement subjectBox;

    @FindBy(id = "message")
    private WebElement messageBox;

    @FindBy(css = "input[name='upload_file']")
    private WebElement UploadFileButton;

    @FindBy(css = "input[value='Submit']")
    private WebElement inputSubmitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement SuccessMessage;


    public String successMessage(){
        return SuccessMessage.getText();
    }
    public String getGetInTouchMessage() {
        return getInTouchMessage.getText();
    }

    public void getNameBox(String name) {
        nameBox.sendKeys(name);
    }

    public void getEmailBox(String email) {
        emailBox.sendKeys(email);
    }

    public void getSubjectBox(String subject) {
        subjectBox.sendKeys(subject);
    }

    public void getMessageBox(String message) {
        messageBox.sendKeys(message);
    }

    public boolean getUploadFileButtonIsEnable() {
       return UploadFileButton.isEnabled();
    }

    public void getInputSubmitButton() {
        inputSubmitButton.click();
    }
}
