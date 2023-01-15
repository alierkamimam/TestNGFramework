package TestNGFramework01.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage {

    @FindBy(css = "button[data-qa='create-account']")
    private WebElement createAccountButton;

    @FindBy(css = "h2[class='title text-center'] b")
    private WebElement accountCreatedMessage;

    @FindBy(css = ".btn.btn-primary")
    private WebElement continueButton;

    public void createAccountButton() {
        createAccountButton.click();
    }

    public String accountCreatedMessage() {
        return accountCreatedMessage.getText();

    }

    public void continueButton() {
        continueButton.click();
    }


}
