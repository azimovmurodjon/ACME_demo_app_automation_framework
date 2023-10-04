package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;

public class ApplitoolsStepDefinitions {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("I open the Applitools demo login page")
    public void iOpenLoginPage() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://demo.applitools.com/");
    }

    @When("I perform visual validation for the login page")
    public void iPerformVisualValidation() {
        // You can add your visual validation logic here using a different library if needed.
    }

    @When("I enter the username {string} and password {string}")
    public void iEnterUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("I click the login button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should see the dashboard")
    public void iShouldSeeDashboard() {
        // You can add assertions or verification for the dashboard page here.
        // For example:
        // assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @Then("I close the browser")
    public void iCloseBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}