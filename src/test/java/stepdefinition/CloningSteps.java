package stepdefinition;

import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.SavingPage;
import Testcases.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CloningSteps extends BaseTest {
    WebDriver driver ;
    SavingPage savingPage;
    @Given("user is on product page")
    public void user_is_on_product_page() {
        driver=getDriver();
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.navigateToProductpage();
    }
    @When("user click on clone icon")
    public void user_click_on_clone_icon() {
        ProductPage productPage=new ProductPage(driver);
        productPage.cloneproduct();
    }

    @When("save the product with new name")
    public void save_the_product_with_new_name() {
       savingPage = new SavingPage(driver);
       savingPage.inputName();
       savingPage.saveProduct();


    }

    @Then("a success alert is shown on top of the page")
    public void a_success_alert_is_shown_on_top_of_the_page() {
        Boolean Isalertpresent = savingPage.Assertsaved();
        Assert.assertTrue(Isalertpresent);
    }

}
