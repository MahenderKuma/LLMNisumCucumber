package StepDefinitions;

import PageObjects.CheckoutPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;


public class CheckoutPageStepDefinition {



    public WebDriver driver;
    TestContextSetup testContextSetup;
    CheckoutPage checkoutPage;



    public CheckoutPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
    }

    @And("I select payment Option")
    public void iSelectPaymentOption() throws InterruptedException {
        checkoutPage.selectThePayMentOptions();
    }

    @And("I click on terms and conditions")
    public void iClickOnTermsAndConditions() {
        checkoutPage.selectTermsAndConditions();
    }

    @Then("I place an Order")
    public void iPlaceAnOrder() throws InterruptedException {
        checkoutPage.placeAnOrder();
    }

    @And("I enter the shipping address with the following details:")
    public void iEnterTheShippingAddressWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> addressDetails : rows) {
            checkoutPage.enterShippingAddress(addressDetails);
        }
    }
}
