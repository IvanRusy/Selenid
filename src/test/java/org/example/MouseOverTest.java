package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class MouseOverTest extends BaseTest{
    @Test
    public void testMouseOver() {
        homePage.getTestDirectory(HomePage.Links.MOUSE_OVER);
        int clickCount = 6;
        int expectedClickCount = clickCount * 2;
        mouseOverPage.doubleClick(clickCount);
        String actual = mouseOverPage.getClickCount();
        Assert.assertEquals(actual, Integer.toString(expectedClickCount));
    }

}
