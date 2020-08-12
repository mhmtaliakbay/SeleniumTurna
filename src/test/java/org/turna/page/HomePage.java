package org.turna.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.turna.base.BasePage;

public class HomePage extends BasePage implements IHomePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void fillFromBox(By by, String text) {
        sendKeys(by,text);
       

    }

    @Override
    public void fillToBox(By by, String text) {
        sendKeys(by,text);
    }

    @Override
    public void openDateFromButton(By by) {
        click(by);
    }

    @Override
    public void clickRandomFromDate( By selectDate)  {

        clickRandomElement(selectDate);
    }

    @Override
    public void openDateToButton(By by) {
        click(by);
    }

    @Override
    public void clickRandomToDate( By selectDate) {
        clickRandomElement(selectDate);
    }

    @Override
    public void clickSearchButton(By by) {
        click(by);
    }


}























