package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
@FindBy(css = "#loginFrm_username")
    WebElement username;
@FindBy(css = "#loginFrm_password")
    WebElement password;

@FindBy(tagName = "button")
WebElement submitButton;

public LoginPage(WebDriver driver){
    PageFactory.initElements(driver,this);
    this.driver=driver;
}

public void login(){
    username.sendKeys("demo");
    password.sendKeys("demo");
    submitButton.click();
}
public void assertDashboard(){
    Assert.assertEquals("Dashboard",driver.getTitle());
}
}



//tr[@id='123']/td[8]/a[4]/i[1]
//input[@id='productFrm_product_descriptionname']
//i[@class="fa fa-save fa-fw"]