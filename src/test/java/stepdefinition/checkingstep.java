package stepdefinition;

import Pages.ProductPage;
import Pages.SavingPage;
import Testcases.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class checkingstep extends BaseTest {
    WebDriver driver;
    ProductPage productPage;

    @Given("product is cloned")
    public void product_is_cloned() {
        driver=getDriver();
        SavingPage savingPage=new SavingPage(driver);
        savingPage.navigateToproductPage();
        productPage = new ProductPage(driver);


    }
    @When("user checks the added product name")
    public void user_checks_the_added_product_name() {
        Assert.assertTrue(productPage.AssertName());
    }
    @When("click on price and change its price")
    public void click_on_price_and_change_its_price() {
        productPage.changeprice();
    }
    @Then("click on save to save the item")
    public void click_on_save_to_save_the_item() {
        productPage.clickSave();
    }
    @After("@browser")
    public void teardown(){
        driver.quit();
    }

}
