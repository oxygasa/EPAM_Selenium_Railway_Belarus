package pages.base;

import commons.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static commons.Config.PLATFORM_AND_BROWSER;
import static commons.CommonActions.getDriver;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage() {
    }

    /**
     * The method to navigate to specific url address.
     **/
    public void goToUrl(String url) {
       getDriver().get(url);
    }

    /**
     * The method is to find element By locator.
     **/
    public WebElement find(By locator) {
        return getDriver().findElement(locator);
    }

    /**
     * The method is to find element By locator and type text into it.
     **/
    public void typeText(By locator, String anyTextForInput) {
        getDriver().findElement(locator).sendKeys(anyTextForInput);
    }

    /**
     * The method is to find element By locator and click it.
     **/
    public void clickTheElement(By locator) {
        CommonActions.getDriver().findElement(locator).click();
    }

    /*** Wait for visibility element in DOM model.*/
    public void waitElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), IMPLICIT_WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /*** Assert the element is actually displayed.*/
    public void assertElementIsDisplayed(By locator) {
        Assert.assertTrue(getDriver().findElement(locator).isDisplayed());
    }

    /***Assert the list of elements are actually displayed.*/
    public void assertElementsAreDisplayed(By locator) {
        List<WebElement> allElements = CommonActions.getDriver().findElements(locator);
        for (WebElement element : allElements) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    /*** Assert the element contains text*/
    public void assertElementContainsText(By locator, String textForAssert) {
        WebElement element = CommonActions.getDriver().findElement(locator);
        String actualTextForAssertion = element.getText();
        Assert.assertEquals(actualTextForAssertion, textForAssert);
    }
}