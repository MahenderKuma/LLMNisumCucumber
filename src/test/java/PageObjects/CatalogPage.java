package PageObjects;

import Utils.GenericUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {

    public WebDriver driver;

    public GenericUtils genericUtils;

    public  CatalogPage(WebDriver driver){

        this.driver=driver;
        this.genericUtils=new GenericUtils(driver);
    }

    private final By productName=By.cssSelector("img[title='BERRY 3 SEATER WITH CHAISE']");


    public void selectTheProductFromTheList(){
        genericUtils.jsClick(productName);
    }
}
