package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public CatalogPage catalogPage;
    public CheckoutPage checkoutPage;
    public ProductPage productPage;
    public SearchPage searchPage;
    public ShoppingCartPage shoppingCartPage;
    public WebDriver driver;


    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public CatalogPage getCatalogPage(){
        catalogPage=new CatalogPage(driver);
        return catalogPage;
    }

    public CheckoutPage getCheckoutPage(){
        checkoutPage=new CheckoutPage(driver);
        return checkoutPage;
    }
    public ProductPage getProductPage(){
        productPage=new ProductPage(driver);
        return productPage;
    }

    public SearchPage getSearchPage(){
        searchPage=new SearchPage(driver);
        return searchPage;
    }

    public ShoppingCartPage getShoppingCartPage(){
        shoppingCartPage=new ShoppingCartPage(driver);
        return shoppingCartPage;
    }
}
