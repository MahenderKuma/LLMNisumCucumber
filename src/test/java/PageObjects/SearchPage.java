package PageObjects;

import Utils.GenericUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    public WebDriver driver;

    public GenericUtils genericUtils;

    public SearchPage(WebDriver driver){
        this.driver=driver;
        this.genericUtils=new GenericUtils(driver);

    }

    private final By searchBar= By.cssSelector("input[placeholder='Enter your keywords']");
    private final By searchBtn=By.cssSelector("button[class='button-search']");


    public void searchItem(String name)
    {
        genericUtils.sendKeys(name,searchBar);
    }

    public void clickOnSearchButton(){
        genericUtils.jsClick(searchBtn);
    }

    public String getTitleLandingPage()
    {
        return driver.getTitle();
    }

}
