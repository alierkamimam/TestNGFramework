package TestNGFramework01.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class SignupPage extends BasePage {

    //Fill details: Title, Name, Email, Password, Date of birth
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
    private WebElement enterAccountInformationTitle;

    @FindBy(id = "id_gender1")
    private WebElement selectButtonMen;

    @FindBy(id = "id_gender2")
    private WebElement selectButtonWomen;

    @FindBy(id = "password")
    private WebElement passwordBox;

    @FindBy(id = "days")
    private WebElement birthDateOf_DAYs;

    @FindBy(id = "months")
    private WebElement birthDateOf_MONTHs;

    @FindBy(id = "years")
    private WebElement birthDateOf_YEARs;

    @FindBy(id = "first_name")
    private WebElement firstNameBox;

    @FindBy(id = "last_name")
    private WebElement lastNameBox;

    @FindBy(id = "company")
    private WebElement companyBox;

    @FindBy(id = "address1")
    private WebElement address1Box;

    @FindBy(id = "address2")
    private WebElement address2Box;

    @FindBy(id = "country")
    private WebElement countryDropDown;

    @FindBy(id = "state")
    private WebElement stateBox;

    @FindBy(id = "city")
    private WebElement cityBox;

    @FindBy(id = "zipcode")
    private WebElement zipCodeBox;

    @FindBy(id = "mobile_number")
    private WebElement mobileNumberBox;



    public void setSelectButtonMen() {
        selectButtonMen.click();
    }

    public void setSelectButtonWomen() {
        selectButtonWomen.click();
    }

    public void setPasswordBox(String password) {
        passwordBox.sendKeys(password);
    }

    public void setDate(String day, String month, String year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    private void setYear(String year) {
        Select select = new Select(birthDateOf_YEARs);
        select.selectByVisibleText(year);

    }

    private void setMonth(String month) {
        Select select = new Select(birthDateOf_MONTHs);
        select.selectByVisibleText(month);
    }

    private void setDay(String day) {
        Select select = new Select(birthDateOf_DAYs);
        select.selectByVisibleText(day);
    }

    public void setFirstNameBox(String firstName) {
        firstNameBox.sendKeys(firstName);
    }

    public void setLastNameBox(String lastName) {
        lastNameBox.sendKeys(lastName);
    }

    public void setCompanyBox(String companyName) {
        companyBox.sendKeys(companyName);
    }

    public void setAddress1Box(String address1) {
        address1Box.sendKeys(address1);
    }

    public void setAddress2Box(String address2) {
        address2Box.sendKeys(address2);
    }

    public void setCountryDropDown(String country) {
        Select select = new Select(countryDropDown);
        select.selectByVisibleText(country);

    }

    public void setStateBox(String stateName) {
        stateBox.sendKeys(stateName);
    }

    public void setCityBox(String cityName) {
        cityBox.sendKeys(cityName);
    }

    public void setZipCodeBox(String zipCode) {
        zipCodeBox.sendKeys(zipCode);

    }


    public void setMobileNumberBox(String mobileNumber) {
        mobileNumberBox.sendKeys(mobileNumber);
    }

}





