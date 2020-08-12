package org.turna.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.turna.base.BasePage;

public class FlightReservationPage extends BasePage implements IFlightReservationPage {

    public FlightReservationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void selectGenderOption(By by) {
        clickRadioButton(by);

    }

    @Override
    public void fillName(By by, String name) {
        sendKeys(by, name);
    }

    @Override
    public void fillSurname(By by, String name) {
        sendKeys(by, name);
    }

    @Override
    public void fillBirthDate(By byDay, String day, By byMonth, String month, By byYear, String year) {
        selectByVisibleText(byDay, day);
        selectByVisibleText(byMonth, month);
        selectByVisibleText(byYear, year);

    }

    @Override
    public void fillNationality(By by, String nationality) {
        selectByVisibleText(by,nationality);
    }

    @Override
    public void fillNationalId(By by, String id) {
        sendKeys(by,id);
    }

    @Override
    public void fillHescode(By by, String hesCode) {
        sendKeys(by,hesCode);
    }

    @Override
    public void fillMobile(By by, String mobileNumber) {
        sendKeys(by,mobileNumber);
    }

    @Override
    public void fillMail(By by, String mail) {
        sendKeys(by,mail);
    }

    @Override
    public void clickProceedToCheckOut(By by) {
        click(by);
    }


}
