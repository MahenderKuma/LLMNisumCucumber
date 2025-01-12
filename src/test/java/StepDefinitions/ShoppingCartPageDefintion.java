package StepDefinitions;

import PageObjects.ShoppingCartPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPageDefintion {



    public WebDriver driver;
    TestContextSetup testContextSetup;
    ShoppingCartPage shoppingCartPage;


    public ShoppingCartPageDefintion(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.shoppingCartPage=testContextSetup.pageObjectManager.getShoppingCartPage();
    }


    @And("I select payWithCard as option for payment")
    public void iSelectPayWithCardAsOptionForPayment() {
        shoppingCartPage.clickOnPayWitCartBtn();
    }

}
