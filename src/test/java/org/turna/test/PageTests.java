package org.turna.test;

import org.junit.Before;
import org.junit.Test;
import org.turna.base.BaseTest;
import org.turna.consants.ConstantFlightPage;
import org.turna.consants.ConstantHomePage;
import org.turna.consants.ConstantReservationPage;
import org.turna.page.FlightPage;
import org.turna.page.FlightReservationPage;
import org.turna.page.HomePage;

import java.util.concurrent.TimeUnit;

public class PageTests extends BaseTest {

    HomePage homePage;
    FlightPage flightPage;
    FlightReservationPage flightReservationPage;
    private final String outboundPlaneName = "Türk Hava Yolları";
    private final String returnPlaneName = "Anadolu Jet";
    private final String customerName = "Mehmet Ali";
    private final String customerSurname = "Akbay";

    @Before
    public void before(){
        homePage = new HomePage(getWebDriver());
        getWebDriver().navigate().to("https://www.turna.com/");
//        getWebDriver().navigate().to("https://www.turna.com/flight/istanbul-ankara-esenboga-airport/2020-08-12/2020-08-29");
        getWebDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void testHomePage() throws InterruptedException {
        scrollDown(500);
        homePage.fillFromBox(ConstantHomePage.FROM_INPUT_ID,"İstanbul (IST)");
        homePage.fillToBox(ConstantHomePage.TO_INPUT_ID,"Ankara");

        homePage.doubleClickWithActionClass(ConstantHomePage.OPEN_FROM_DATE_CSS);
        homePage.clickRandomFromDate(ConstantHomePage.SELECT_DATE_BOX_CSS);

        homePage.clickWithActionClass(ConstantHomePage.OPEN_TO_DATE_CSS);
        homePage.clickRandomToDate(ConstantHomePage.SELECT_DATE_BOX_CSS);

        homePage.clickSearchButton(ConstantHomePage.SEARCH_BUTTON_ID);


        TimeUnit.SECONDS.sleep(4);
        scrollDown(1000);
        flightPage = new FlightPage(getWebDriver());

        flightPage.clickOutboundButton(ConstantFlightPage.OUTBOUND_COLS_CSS,
                ConstantFlightPage.OUTBOUND_AIRPLANE_NAME_CSS,
                ConstantFlightPage.OUTBOUND_SELECT_BUTTON_CSS,outboundPlaneName);
        flightPage.clickReturnButton(ConstantFlightPage.RETURN_COLS_CSS,
                ConstantFlightPage.OUTBOUND_AIRPLANE_NAME_CSS,
                ConstantFlightPage.RETURN_SELECT_BUTTON_CSS,returnPlaneName);
        flightPage.clickContinueButton(ConstantFlightPage.CONTINUE_BUTTON_CSS);


        TimeUnit.SECONDS.sleep(3);

        scrollDown(1000);
        flightReservationPage = new FlightReservationPage(getWebDriver());
        flightReservationPage.selectGenderOption(ConstantReservationPage.GENDER_RADIO_BUTTON_ID);
        flightReservationPage.fillName(ConstantReservationPage.NAME_TEXT_FIELD_CSS,customerName);
        flightReservationPage.fillSurname(ConstantReservationPage.SURNAME_TEXT_FIELD_CSS,customerSurname);
        flightReservationPage.fillBirthDate(ConstantReservationPage.BIRTHDATE_DAY_CSS,"01"
                ,ConstantReservationPage.BIRTHDATE_MONTH_CSS,"08"
                ,ConstantReservationPage.BIRTHDATE_YEAR_CSS,"1900");

        TimeUnit.SECONDS.sleep(3);
        flightReservationPage.fillNationality(ConstantReservationPage.NATIONALITY_SELECT_ID,"Türkiye");
        flightReservationPage.fillNationalId(ConstantReservationPage.NATIONALITY_ID_TEXT_BOX_CSS,"123123123");
        flightReservationPage.fillHescode(ConstantReservationPage.HES_CODE_TEXT_BOX_NAME,"123124123");
        flightReservationPage.fillMobile(ConstantReservationPage.MOBILE_TEXT_BOX_ID,"1");
        flightReservationPage.fillMail(ConstantReservationPage.EMAIL_TEXT_BOX_ID,"myemail@gmail.com");

    }


}
