package org.turna.consants;

import org.openqa.selenium.By;

public interface ConstantFlightPage {
    By OUTBOUND_COLS_CSS = By.cssSelector("div.departure-flight");
    By OUTBOUND_AIRPLANE_NAME_CSS=By.cssSelector("div.airline-name");
    By OUTBOUND_SELECT_BUTTON_CSS = By.cssSelector("input.from-in-button");
    By RETURN_COLS_CSS = By.cssSelector("div.return-flight");
    By RETURN_SELECT_BUTTON_CSS = By.cssSelector("input.to-in-button");
    By CONTINUE_BUTTON_CSS = By.cssSelector("button.bt-choose");
}
