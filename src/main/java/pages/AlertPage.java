package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AlertPage {
    private final SelenideElement alertButton = $x("//button[@id='alertButton']");
    private final SelenideElement alertConfirm = $x("//button[@id='confirmButton']");
    private final SelenideElement alertPrompt = $x("//button[@id='promptButton']");

    public void clickAlertButton() {
        alertButton.click();
    }

    public void clickAlertConfirm() {
        alertConfirm.click();
    }

    public void clickAlertPrompt() {
        alertPrompt.click();
    }

}
