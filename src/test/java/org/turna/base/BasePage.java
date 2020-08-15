package org.turna.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);

    }

    public WebElement findElement(By by) {
        untilPresenceOfElementLocated(by);
        return driver.findElement(by);
    }


    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void click(By by) {

        untilElementToBeClickable(by);
        findElement(by).click();
    }

    public void doubleClickWithActionClass(By by) {
        untilElementToBeClickable(by);
        new Actions(driver).doubleClick(findElement(by)).perform();
    }

    public void clickWithActionClass(By by) {
        untilElementToBeClickable(by);
        new Actions(driver).moveToElement(findElement(by)).click().perform();
    }

    public void clickWithJavascriptExecutor(By by) {
        untilElementToBeClickable(by);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", by);
    }


    public List<WebElement> findElements(By by) {
        untilPresenceOfAllElementsLocatedBy(by);
        return driver.findElements(by);
    }

    public void clickRandomElement(By by) {
        untilElementToBeClickable(by);
        List<WebElement> elements = findElements(by);
        int size = elements.size();
        int random = new Random().nextInt(size);
        elements.get(random).click();
    }

    public void clickRadioButton(By by) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", findElement(by));
    }


    public void selectByVisibleText(By by, String visibleText) {
        Select select = new Select(findElement(by));
        select.selectByVisibleText(visibleText);
    }

    public void untilPresenceOfAllElementsLocatedBy(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void untilElementToBeClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void untilPresenceOfElementLocated(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}














