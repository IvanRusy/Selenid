package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ClassAtributePage {
    private final SelenideElement blueButton = $x("//button[contains(@class,'btn-primary')]");

    public void clickBlueButton(int count){
        for (int i = 0; i < count; i++) {
            blueButton.click();
            Selenide.switchTo().alert().accept();
        }
    }


}
