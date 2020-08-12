package org.turna.page;

import org.openqa.selenium.By;

public interface IFlightReservationPage {
    void selectGenderOption(By by);
    void fillName(By by, String name);
    void fillSurname(By by, String name);
    void fillBirthDate(By byDay, String day, By byMonth, String month, By byYear, String year);
    void fillNationality(By by, String nationality);
    void fillNationalId(By by, String id);
    void fillHescode(By by, String hesCode);
    void fillMobile(By by, String mobileNumber);
    void fillMail(By by, String mail);
    void clickProceedToCheckOut(By by);
}
