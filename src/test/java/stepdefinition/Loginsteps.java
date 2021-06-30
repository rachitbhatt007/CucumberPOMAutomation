package stepdefinition;

import Pages.DashboardPage;
import Pages.LoginPage;
import Testcases.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Loginsteps extends BaseTest {
    WebDriver driver =getDriver();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://demo.abantecart.com/?s=demo_admin");
        Assert.assertEquals(driver.getTitle(),"Administration");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login();
    }
    @Then("user is logged in")
    public void user_is_logged_in() {
        Assert.assertEquals(driver.getTitle(),"Dashboard");
    }


}
