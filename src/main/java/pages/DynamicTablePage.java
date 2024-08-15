package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicTablePage {
    private final SelenideElement expectedValue = $x("//p[@class='bg-warning']");
    private final ElementsCollection columnHeaders = $$x("//span[@role='columnheader']");
    private final ElementsCollection chromeRow = $$x("//div//span[text()='Chrome']/following-sibling::span");

    public String getExpectedValue() {
        String value = expectedValue.getText();
        return value.substring(12);
    }

    public int getCpuIndex() {
        for (int i = 0; i < columnHeaders.size(); i++) {
            if(columnHeaders.get(i).getText().equals("CPU")){
                return i;
            }
        }
        return 0;
    }

    public String getTableValue(){
        //List<WebElement> rows = driver.findElements(chromeRow);
        return chromeRow.get(getCpuIndex() - 1).getText();
    }

}
