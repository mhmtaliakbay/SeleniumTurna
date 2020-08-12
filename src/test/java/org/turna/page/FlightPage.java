package org.turna.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.turna.base.BasePage;

import java.util.List;

public class FlightPage extends BasePage implements IFlightPage {


    public FlightPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickOutboundButton(By byColumn, By byCell, By bySelect, String planeName) {
        findAndClickSelectButton(byColumn, byCell, bySelect, planeName);
    }

    private void findAndClickSelectButton(By byColumn, By byCell, By bySelect, String planeName) {
        List<WebElement> column = findElements(byColumn);

        for (WebElement cell : column) {
            untilPresenceOfElementLocated(byCell);
            String currentPlaneName = cell.findElement(byCell).getText();
            if (currentPlaneName.equals(planeName)) {
                untilElementToBeClickable(bySelect);
                cell.findElement(bySelect).click();
                System.out.println(currentPlaneName);
                break;
            }

        }
    }

    @Override
    public void clickReturnButton(By byColumn, By byCell, By bySelect, String planeName) {
        findAndClickSelectButton(byColumn, byCell, bySelect, planeName);
    }

    @Override
    public void clickContinueButton(By by) {
        click(by);

    }
}
