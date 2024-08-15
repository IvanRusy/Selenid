package org.example;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.LocalDate;

public class AlertTest extends BaseTest{
    @Test
    public void testAlert() {
        homePage.getTestDirectory(HomePage.Links.ALERTS);
        alertsPage.clickAlertButton();
        Selenide.switchTo().alert().accept();

        alertsPage.clickAlertConfirm();
        int day = LocalDate.now().getDayOfWeek().getValue();
        if(day == 5){
            Selenide.switchTo().alert().accept();
        } else {
            Selenide.switchTo().alert().dismiss();
            Selenide.switchTo().alert().accept();
        }

        alertsPage.clickAlertPrompt();

        String expectedText = "test-test";
        Selenide.switchTo().alert().sendKeys(expectedText);
        Selenide.switchTo().alert().accept();

        String actualText = Selenide.switchTo().alert().getText();
        actualText = actualText.replaceAll("User value: ", "");
        Selenide.switchTo().alert().accept();
        Assert.assertEquals(actualText,expectedText);
    }

}
