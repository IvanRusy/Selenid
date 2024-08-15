package org.example;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FrameTest extends BaseTest{
    private  final SoftAssert softAssert = new SoftAssert();

    @Test
    public void frameTest(){
        Selenide.switchTo().newWindow(WindowType.TAB);
        Selenide.open(getFromProperties("framesUrl"));
        for (int i = 0; i <= 4; i++) {
            Selenide.switchTo().frame(i);
            framesPage.getFrameByIndex(i).sendKeys("This is frame " + (i + 1));
            Selenide.switchTo().defaultContent();
        }
        for (int i = 0; i <= 4; i++) {
            Selenide.switchTo().frame(i);
            softAssert.assertEquals("This is frame " + (i + 1), framesPage.getFrameByIndex(i).getAttribute("value"));
            Selenide.switchTo().defaultContent();
        }

        softAssert.assertAll();
    }

}
