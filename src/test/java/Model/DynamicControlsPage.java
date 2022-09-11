package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicControlsPage extends BasePage{

    @FindBy(xpath = "//form[1][@id='checkbox-example']/button")
    private WebElement buttonSwapCheckbox;

    @FindBy(xpath = "//form[2][@id='input-example']/button")
    private WebElement buttonSwapInput;

    @FindBy(id = "message")
    private WebElement itsChangedMessage;

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public DynamicControlsPage clickButtonSwapCheckbox() {
        buttonSwapCheckbox.click();

        return this;
    }

    public DynamicControlsPage clickButtonSwapInput() {
        buttonSwapInput.click();

        return this;
    }

    public String getChangedMessageText() {
        return getWait10().until(ExpectedConditions.visibilityOf(itsChangedMessage)).getText();
    }

}
