package PageObjects;

import Utils.GenericUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    public WebDriver driver;
    public GenericUtils genericUtils;

    public ShoppingCartPage(WebDriver driver){
        this.driver=driver;
        this.genericUtils=new GenericUtils(driver);

    }
    private final By payWithCartBtn=By.cssSelector(".btn-2.btn-to-checkout");

    public void clickOnPayWitCartBtn(){

        genericUtils.jsClick(payWithCartBtn);

    }
}
