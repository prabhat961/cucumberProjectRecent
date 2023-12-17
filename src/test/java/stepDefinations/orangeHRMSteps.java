package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class orangeHRMSteps {

    WebDriver driver;

    @Given("I launch chrome Browser")
    public void i_launch_chrome_browser() {
        driver = new ChromeDriver();
    }
    @When("I open hrm home page")
    public void i_open_hrm_home_page() {
        driver .get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Then("I verify that the logo is present or not")
    public void i_verify_that_the_logo_is_present_or_not() {
    boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(true, status );
    }
    @Then("close Browser")
    public void close_browser() {
        driver.quit();
    }
}
