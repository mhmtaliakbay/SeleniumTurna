package org.turna.consants;

import org.openqa.selenium.By;

public interface ConstantReservationPage {
    By GENDER_RADIO_BUTTON_ID = By.id("rd-male");
    By NAME_TEXT_FIELD_CSS = By.cssSelector("input.firstname");
    By SURNAME_TEXT_FIELD_CSS = By.cssSelector("input.lastname");
    By BIRTHDATE_DAY_CSS = By.cssSelector("select.day-of-birth");

    By BIRTHDATE_MONTH_CSS = By.cssSelector("select.month-of-birth");
    By BIRTHDATE_YEAR_CSS = By.cssSelector("select.year-of-birth");
    By NATIONALITY_SELECT_ID = By.id("passenger-nationality");
    By NATIONALITY_ID_TEXT_BOX_CSS = By.cssSelector("input.citizenno");
    By HES_CODE_TEXT_BOX_NAME = By.name("hesCode");
    By MOBILE_TEXT_BOX_ID = By.cssSelector("input#txtPhone");
    By EMAIL_TEXT_BOX_ID = By.id("txtEmail");
}
