package org.turna.page;

import org.openqa.selenium.By;

public interface IFlightPage {
    void clickOutboundButton(By byRows, By byCell,By bySelect,String planeName);
    void clickReturnButton(By byColumn, By byCell, By bySelect, String planeName);
    void clickContinueButton(By by);
}
