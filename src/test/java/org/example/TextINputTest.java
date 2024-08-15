package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class TextINputTest extends BaseTest{
    @Test(description = "INPUT TESTING")
    public void testTextInput(){
        homePage.getTestDirectory(HomePage.Links.TEXT_INPUT);
        String startButtonValue = textInputPage.getTextFromButton();

        String expectedText = textInputPage.setText("HelloWorld");
        String actualText = textInputPage.getTextFromButton();

        //Assert.assertEquals(actualText, expectedText);
        Assert.assertEquals(actualText, "FAIL");
        Assert.assertNotEquals(actualText, startButtonValue);
    }

}
