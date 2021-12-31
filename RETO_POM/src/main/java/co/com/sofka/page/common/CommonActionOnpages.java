package co.com.sofka.page.common;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

import static co.com.sofka.util.TiemposEspera.TIME10;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.util.concurrent.TimeUnit;

public class CommonActionOnpages extends BaseSikulix
{
    private WebDriver driver;
    private WebDriverWait wait;

    public CommonActionOnpages(WebDriver driver) {
        this.driver = driver;
        explicitWaitInit();
    }

    protected void typeInto(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }

    protected void clearText(By locator){driver.findElement(locator).clear();}

    protected void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    protected void click(By locator){
        driver.findElement(locator).click();
    }

    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    protected void scrollTo(By locator){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
    }

    protected void pressEnter(By locator) {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    protected void pathFile(By locator, String path){
        driver.findElement(locator).sendKeys(path);
    }

    // Usado PAGE FACTORY mediante polimorfismo de sobrecarga
    protected void typeInto(WebElement webElement, String value){
        webElement.sendKeys(value);
    }

    protected void clearText(WebElement webElement){
        webElement.clear();
    }

    protected void click(WebElement webElement){
        webElement.click();
    }

    protected void pathFile(WebElement webElement, String path){
        webElement.sendKeys(path);
    }

    protected void pressEnter(WebElement webElement) {
        webElement.sendKeys(Keys.ENTER);
    }

    public void scrollTo(WebElement webElement){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", webElement);
    }

    protected  String getText (WebElement webElement){

        return webElement.getText();
    }
    protected void implicitWaitTime(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds , TimeUnit.SECONDS);}

    protected void explicitWaitTime(By locator){
        wait =new WebDriverWait(driver,70);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void arrowDown(By locator){
        driver.findElement(locator).sendKeys(Keys.DOWN);
    }

    protected void tab(By locator){
        driver.findElement(locator).sendKeys(Keys.TAB);
    }

    protected void explicitWaitInit () {
        wait = new WebDriverWait(driver, TIME10.getValue());
    }
    protected void waitClick (By locator) {
        wait.until(elementToBeClickable(locator)).click();
    }

    protected void waitUntilInvisibility (By locator) {
        var element = driver.findElement(locator);
        this.wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public boolean isElementPresent(By locator) {
        try {
            var element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    protected void waitToBeClickable(By locator){
        this.wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
