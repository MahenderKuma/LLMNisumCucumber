package Utils;

import PageObjects.PageObjectManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContextSetup {


    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;


    public TestContextSetup() throws IOException {
        testBase=new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManagers());
        genericUtils=new GenericUtils(testBase.WebDriverManagers());

    }
}
