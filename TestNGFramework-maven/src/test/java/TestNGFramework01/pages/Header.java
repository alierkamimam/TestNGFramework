package TestNGFramework01.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    @FindBy(css = "a[href='/logout']")
    private WebElement logOutButton;

    @FindBy(css = "a[href='/contact_us']")
    private WebElement contactUs;


    public void clickLogOutButton() {
        logOutButton.click();
    }

    public void clickContactUs() {
        contactUs.click();


    }
}
