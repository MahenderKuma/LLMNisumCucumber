package StepDefinitions;

import PageObjects.CatalogPage;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class CatalogPageStepDefinition {

    public WebDriver driver;
    TestContextSetup testContextSetup;
    CatalogPage catalogPage;

    public CatalogPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.catalogPage= testContextSetup.pageObjectManager.getCatalogPage();
    }

    @Then("I select the product Name")
    public void iSelectTheProductName() {
        catalogPage.selectTheProductFromTheList();
    }
}
