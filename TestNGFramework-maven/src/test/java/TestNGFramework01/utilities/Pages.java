package TestNGFramework01.utilities;


import TestNGFramework01.pages.*;

public class Pages {
    private HomePage homePage;
    private SignupPage signupPage;
    private LoginPage loginPage;

    private ProductsPage productsPage;

    private AccountCreatedPage accountCreatedPage;

    private AccountDeletePage accountDeletePage;


    public Pages() {
        this.homePage = new HomePage();
        this.signupPage = new SignupPage();
        this.loginPage = new LoginPage();
        this.productsPage = new ProductsPage();
        this.accountCreatedPage=new AccountCreatedPage();
        this.accountDeletePage=new AccountDeletePage();
    }

    public AccountDeletePage getAccountDeletePage() {
        return accountDeletePage;
    }

    public AccountCreatedPage getAccountCreatedPage() {
        return accountCreatedPage;
    }

    public SignupPage getSignupPage() {

        return signupPage;
    }


    public HomePage getHomePage() {

        return homePage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public ProductsPage getProductsPage() {
        return productsPage;
    }
}

