package StepDefinitions;

import PageObjects.SearchPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LandingPageStepDefinition {

    TestContextSetup testContextSetup;
    SearchPage searchPage;


    public LandingPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.searchPage=testContextSetup.pageObjectManager.getSearchPage();
    }


    @Given("User is on Holbi Group Landing page")
    public void userIsOnGreenCartLandingPage() {
        Assert.assertTrue(searchPage.getTitleLandingPage().contains("Ecommerce platform - osCommerce by Holbi Group"));

    }


    @When("user entered {string} in the search bars")
    public void userEnteredInTheSearchBars(String product) {
        searchPage.searchItem(product);
        searchPage.clickOnSearchButton();
    }
}
