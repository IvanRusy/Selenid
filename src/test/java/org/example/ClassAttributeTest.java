package org.example;

import org.testng.annotations.Test;
import pages.HomePage;

public class ClassAttributeTest extends BaseTest{
    @Test
    public void clickBlueButtonTest(){
        homePage.getTestDirectory(HomePage.Links.CLASS_ATTRIBUTE);
        classAttributePage.clickBlueButton(10);
    }

}
