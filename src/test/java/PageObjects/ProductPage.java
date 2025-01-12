package PageObjects;

import Utils.GenericUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    public WebDriver driver;
   public GenericUtils genericUtils;
    private final By addToCart=By.cssSelector(".btn-2.add-to-cart.b_atc_74");
    private By goToShoppingCart=By.cssSelector("a[class='btn-2']");


    public ProductPage(WebDriver driver){

        this.driver=driver;
        this.genericUtils=new GenericUtils(driver);
    }

    public void addToCart(){
        genericUtils.jsClick(addToCart);
    }

    public void goToShoppingCart() {
        genericUtils.jsClick(goToShoppingCart);
    }
}
