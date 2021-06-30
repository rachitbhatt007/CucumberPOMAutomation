package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SavingPage {
    WebDriver driver;
    Boolean flag=false;
    @FindBy(xpath = "//input[@id='productFrm_product_descriptionname']")
    WebElement NameOfProduct;

    @FindBy(xpath = "//i[@class=\"fa fa-save fa-fw\"]")
    WebElement Savebutton;

    @FindBy(xpath="//li[@id=\"menu_product\"]")
    WebElement ProductPageLink;

    @FindBy(xpath = "//div[@class='success alert alert-success']")
    WebElement successalert;

    public SavingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public void inputName(){
        NameOfProduct.sendKeys(" Rachit");

    }
    public void saveProduct(){
        Savebutton.click();
    }

    public Boolean Assertsaved(){
        if(successalert!=null){
            flag=true;
        }
        return flag;
    }

    public void navigateToproductPage(){
        ProductPageLink.click();
    }
}
