package StepDefinitions;

import PageObjects.ProductPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class ProductPageStepDefinition {



    public WebDriver driver;
    TestContextSetup testContextSetup;
    ProductPage productPage;

    public ProductPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.productPage=testContextSetup.pageObjectManager.getProductPage();

    }


    @And("I add Product to cart")
    public void productToCart()  {
        productPage.addToCart();
        productPage.goToShoppingCart();
    }
}
