package TestNGFramework01.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletePage extends BasePage{


    @FindBy(css = "h2[class='title text-center'] b")
    private WebElement accountDeleted;

    @FindBy(css = "a[class*='btn btn-primary']")
    private WebElement clickContinueButton;




    public String getAccountDeletedMessage() {
        return accountDeleted.getText();

    }
    public void getClickContinueButton() {
        clickContinueButton.click();
    }
}
