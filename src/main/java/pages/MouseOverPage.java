package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MouseOverPage {
    private final SelenideElement clickCount = $x("//div//p//span[@id='clickCount']");
    private final SelenideElement linkClick = $x("//div//a[text()='Click me']");

    public String getClickCount(){
        return clickCount.getText();
    }

    public void doubleClick(int countDoubleClick){
        for (int i = 0; i < countDoubleClick; i++) {
            linkClick.doubleClick();
        }
    }

}
