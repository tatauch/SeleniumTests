package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicLoading1Page extends BasePage{

    @FindBy(xpath = "//button[contains(text(),'Start')]")
    protected WebElement buttonStart;

    @FindBy(id = "finish")
    private WebElement hiddenText;

    public DynamicLoading1Page(WebDriver driver) {
        super(driver);
    }

    public DynamicLoading1Page clickStartButton() {
        buttonStart.click();

        return this;
    }

    public String getHiddenText() {
        return getWait30().until(ExpectedConditions.visibilityOf(hiddenText)).getText();
    }

}
