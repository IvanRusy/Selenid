package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class TextInputPage {
    private final SelenideElement inputText = $x("//input[@id='newButtonName']");
    private final SelenideElement button = $x("//button[@id='updatingButton']");

    @Step("Изменение текста кнопки на {textToType}")
    public String setText(String textToType){
        inputText.sendKeys(textToType);
        button.click();
        return textToType;
    }

    @Step("Получение текста с кнопки")
    public String getTextFromButton(){
        return button.getText();
    }

}
