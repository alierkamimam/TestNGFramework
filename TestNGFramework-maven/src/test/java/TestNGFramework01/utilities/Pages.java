package TestNGFramework01.utilities;


import TestNGFramework01.pages.HomePage;
import TestNGFramework01.pages.LoginPage;
import TestNGFramework01.pages.ProductsPage;
import TestNGFramework01.pages.SignupPage;

public class Pages {
    private HomePage homePage;
    private SignupPage signupPage;
    private LoginPage loginPage;

    private ProductsPage productsPage;


    public Pages() {
        this.homePage = new HomePage();
        this.signupPage = new SignupPage();
        this.loginPage = new LoginPage();
        this.productsPage = new ProductsPage();
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