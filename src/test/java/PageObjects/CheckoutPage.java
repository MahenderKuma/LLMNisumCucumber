package PageObjects;

import Utils.GenericUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class CheckoutPage {

    public WebDriver driver;
    public GenericUtils genericUtils;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.genericUtils=new GenericUtils(driver);

    }

    private final By firstName = By.cssSelector("#shipping_address-firstname");
    private final By secondName = By.cssSelector("#shipping_address-lastname");
    private final By streetAddress = By.cssSelector("#shipping_address-street_address");
    private final By postCode = By.cssSelector("#shipping_address-postcode");
    private final By city = By.cssSelector("#shipping_address-city");
    private final By country = By.cssSelector("div[id='s2id_shipping_address-country'] a[class='select2-choice']");
    private final By listOfCountries=By.xpath("//*[@id='select2-drop']/ul//li");
    private final By checkoutEmailAdress = By.cssSelector("#checkout-email_address");
    private final By cashOnDeliveryOption=By.cssSelector("input[value='cod']");
    private final By termsAndCondition=By.cssSelector("#checkout-terms");
    private final By placeAnOrderBtn=By.cssSelector(".btn-title");
    private final By orderSucessMsg=By.cssSelector(".page-success");

    public void enterShippingAddress(Map<String, String> dataTable) {
        genericUtils.sendKeys(dataTable.get("firstName"), firstName);
        genericUtils.sendKeys(dataTable.get("secondName"), secondName);
        genericUtils.sendKeys(dataTable.get("streetAddress"), streetAddress);
        genericUtils.sendKeys(dataTable.get("postCode"), postCode);
        genericUtils.sendKeys(dataTable.get("city"), city);
        genericUtils.click(country);
        List<WebElement> countrySize = driver.findElements(listOfCountries);
        for (int i = 1; i < countrySize.size(); i++) {
            WebElement countryList = driver.findElement(By.xpath("//div[@id='select2-drop']//li[" + i + "]//div[1]"));
            if (countryList.getText().equals(dataTable.get("country"))) {
                countryList.click();
                break;
            }
        }

        genericUtils.sendKeys(dataTable.get("emailAddress"), checkoutEmailAdress);
    }




    public void selectThePayMentOptions() {
        genericUtils.jsClick(cashOnDeliveryOption);
    }

    public void selectTermsAndConditions(){
        genericUtils.jsClick(termsAndCondition);
    }


    public void placeAnOrder() throws InterruptedException {
     Thread.sleep(2000);
        genericUtils.jsClick(placeAnOrderBtn);
        String actualSuccesMsg=driver.findElement(orderSucessMsg).getText();
        Assert.assertEquals("user is not landed on the order summary page", "THANK YOUs", actualSuccesMsg);

    }
}
