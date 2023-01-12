package TestNGFramework01.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    //New User Signup!
    @FindBy(css = "input[data-qa='login-email']")
    private WebElement loginAccountEmailAddressBox;

    @FindBy(css = "input[data-qa='login-password']")
    private WebElement loginAccountPasswordBox;

    @FindBy(css = "button[data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(css = "input[placeholder='Name']")
    private WebElement signupNameBox;

    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement signupEmailAddressBox;

    @FindBy(css = " button[data-qa='signup-button']")
    private WebElement signupButton;

    @FindBy(css = "div[class='signup-form'] h2")
    private WebElement newUserSignUpMessage;


    public void setLoginAccountEmailAddressBox(String loginEmail) {
        loginAccountEmailAddressBox.sendKeys(loginEmail);

    }

    public void setLoginAccountPasswordBox(String loginPassword) {
        loginAccountPasswordBox.sendKeys(loginPassword);

    }

    public void setLoginButton() {
        loginButton.click();

    }

    public void setSignupNameBox(String signupName) {
        signupNameBox.sendKeys(signupName);

    }


    public void setSignupEmailAddressBox(String signupEmail) {
        signupEmailAddressBox.sendKeys(signupEmail);

    }

    public void setSignupButton() {
        signupButton.click();

    }

    public String setNewUserSignUpMessage() {
        return newUserSignUpMessage.getText();


    }
}