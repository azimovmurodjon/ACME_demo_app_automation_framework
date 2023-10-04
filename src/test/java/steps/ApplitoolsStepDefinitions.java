package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplitoolsStepDefinitions {

    private WebDriver driver;

    @Given("I open the Applitools demo login page")
    public void iOpenLoginPage() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://demo.applitools.com/");
    }

    @When("I perform visual validation for the login page")
    public void iPerformVisualValidation() {
        // You can add your visual validation logic here using a different library if needed.
    }

    @Then("I close the browser")
    public void iCloseBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}