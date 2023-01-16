package TestNGFramework01.automationexercise;

import TestNGFramework01.utilities.BrowserUtils;
import TestNGFramework01.utilities.ConfigurationReader;
import TestNGFramework01.utilities.Driver;
import TestNGFramework01.utilities.Pages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    protected Pages pages = new Pages();

    @BeforeSuite
    public void setUpSuite() {
        // code that is executed before the entire test suite
        String URL = ConfigurationReader.getProperty("url");
        String browser = ConfigurationReader.getProperty("browser");
        String environment = ConfigurationReader.getProperty("environment");

        Driver.getDriver().get(URL);
        System.out.println(":::::: Test Information ::::::\n\tURL :\"" + URL + "\"\n\tBrowser :\"" + browser + "\"\n\tEnvironment :" + environment);
        BrowserUtils.wait(1);


    }
    @AfterSuite
    public void afterTest() {
        // Perform cleanup tasks or generate test reports here
         Driver.getDriver().quit();
    }



    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png");
        FileUtils.copyFile(source, file);
        return System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";


    }



}
