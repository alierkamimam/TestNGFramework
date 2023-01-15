package TestNGFramework01.pages;

import TestNGFramework01.utilities.BrowserUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    @FindBy(css = ".navbar-nav a[href='/login']")
    private WebElement SignupLoginButton;

    @FindBy(css = ".navbar-nav a[href='/products']")
    private WebElement productButton;

    @FindBy(xpath = "//a[text()=' Cart']")
    private WebElement cartButton;

    @FindBy(xpath = "//a[text()=' Test Cases']")
    private WebElement testCasesButton;

    @FindBy(xpath = "//a[text()=' API Testing']")
    private WebElement apiTestingButton;

    @FindBy(xpath = "//li[10]//a[1]")
    private WebElement loggedInASName;

    @FindBy(css = "a[href='/delete_account']")
    private WebElement clickDeleteAccount;


    public void clickSignupLoginButton() {
        BrowserUtils.verifyElementDisplayed(SignupLoginButton);
        SignupLoginButton.click();
    }

    public void clickProductButton() {
        BrowserUtils.verifyElementDisplayed(productButton);
        productButton.click();
    }

    public String loggedMessage() {
        return loggedInASName.getText();
    }
    public void setClickDeleteAccount() {
        clickDeleteAccount.click();
    }


}