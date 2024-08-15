package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    String linkPattern = "//h3//a[text()='%s']";

    @Step("Переход по ссылке {targetLinks.linkValue}")
    public void getTestDirectory(Links targetLinks){
        $x(String.format(linkPattern, targetLinks.linkValue)).click();
    }

    public enum Links{
        TEXT_INPUT("Text Input"),
        MOUSE_OVER("Mouse Over"),
        ALERTS("Alerts"),
        CLASS_ATTRIBUTE("Class Attribute");

        final String linkValue;

        Links(String linkValue) {
            this.linkValue = linkValue;
        }
    }

}
