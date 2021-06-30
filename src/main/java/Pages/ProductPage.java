package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;
    @FindBy(xpath = "//tr[@id='123']//i[@class='fa fa-clone fa-lg']")
    WebElement cloneIcon;

    @FindBy(xpath = "//table[@id=\"product_grid\"]/tbody/tr[2]/td[5]//input")
    WebElement ProductPrice;

    @FindBy(xpath = "//table[@id=\"product_grid\"]/tbody/tr[2]/td[3]//input")
    WebElement ProductName;

    @FindBy(xpath = "//table[@id=\"product_grid\"]/tbody/tr[2]//i[@class=\"fa fa-save fa-lg\"]")
    WebElement saveButton;

    public ProductPage(WebDriver driver){//table[@id="product_grid"]/tbody/tr[2]/td[5]//input
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }


    public void cloneproduct(){
        cloneIcon.click();
    }

    public void changeprice(){
        ProductPrice.clear();
        ProductPrice.sendKeys("2000");
    }

    public Boolean AssertName(){
        String Name=ProductName.getAttribute("value");
        System.out.println("value is "+Name);
        if(Name.contains("Rachit")){
            return true;
        }
        else{
            return false;
        }
    }

    public void clickSave(){
        saveButton.click();
    }
}
