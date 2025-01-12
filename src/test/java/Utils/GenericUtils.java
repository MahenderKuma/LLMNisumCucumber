package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class GenericUtils {

    public static WebDriver driver;

    public GenericUtils(WebDriver driver) {
        this.driver = driver;
    }


    public void SwitchWindowToChild() {
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
    }


    public void jsClick(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(locator));
    }

    public static Wait<WebDriver> getWaitTime() {
        FluentWait<WebDriver> webDriverFluentWait = new FluentWait<>(driver);
        webDriverFluentWait.withTimeout(Duration.ofSeconds(50));
        webDriverFluentWait.pollingEvery(Duration.ofSeconds(5));
        webDriverFluentWait.ignoring(NoSuchElementException.class);
        return webDriverFluentWait;
    }

    public void sendKeys(String text, By locator) {
        getElement(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        getElement(locator);
        driver.findElement(locator).click();
    }

    public WebElement getElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
