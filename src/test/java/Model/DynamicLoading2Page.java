package Model;

import org.openqa.selenium.WebDriver;

public class DynamicLoading2Page extends DynamicLoading1Page{

    public DynamicLoading2Page(WebDriver driver) {
        super(driver);
    }

    public DynamicLoading2Page clickStartButton() {
        buttonStart.click();

        return this;
    }
}
