package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;


    public WebDriver WebDriverManagers() throws IOException
    {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("QAUrl");
        String browser_properties = prop.getProperty("browser");
        String browser_maven=System.getProperty("browser");

        String browser = browser_maven!=null ? browser_maven : browser_properties;
        if(driver == null)
        {
            if(browser.equalsIgnoreCase("chrome"))
            {
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(url);
            }
            if(browser.equalsIgnoreCase("firefox"))
            {
                driver = new FirefoxDriver();
            }
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            driver.get(url);
        }
        return driver;

    }
}
