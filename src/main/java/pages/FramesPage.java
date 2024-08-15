package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class FramesPage {
    public final SelenideElement frame1Input = $x("//input[@name='mytext1']");
    public final SelenideElement frame2Input = $x("//input[@name='mytext2']");
    public final SelenideElement frame3Input = $x("//input[@name='mytext3']");
    public final SelenideElement frame4Input = $x("//input[@name='mytext4']");
    public final SelenideElement frame5Input = $x("//input[@name='mytext5']");
    public SelenideElement getFrameByIndex(int frameIndex){
        switch (frameIndex){
            case 0:
                return frame1Input;
            case 1:
                return frame2Input;
            case 2:
                return frame3Input;
            case 3:
                return frame4Input;
            case 4:
                return frame5Input;
            default:
                return null;
        }
    }
}
