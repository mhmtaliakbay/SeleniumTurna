package org.turna.page;

import org.openqa.selenium.By;

public interface IHomePage {
    void fillFromBox(By by,String text);
    void fillToBox(By by, String text);
    void openDateFromButton(By by);
    void clickRandomFromDate(By selectDate);
    void openDateToButton(By by);
    void clickRandomToDate(By selectDate);
    void clickSearchButton(By by);


}
