package org.turna.consants;

import org.openqa.selenium.By;

public interface ConstantHomePage {
    By FROM_INPUT_ID = By.id("flight-from");
    By TO_INPUT_ID = By.id("flight-to");
    By OPEN_FROM_DATE_CSS = By.cssSelector("input[name='fromdate']");
    By OPEN_TO_DATE_CSS = By.cssSelector("input[name='todate']");
    By SELECT_DATE_BOX_CSS = By.cssSelector("[data-handler='selectDay']");
    By SEARCH_BUTTON_ID = By.id("btnSearch");

}
