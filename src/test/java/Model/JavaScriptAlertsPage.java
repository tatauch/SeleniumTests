package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage{

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    private WebElement buttonJsAlert;

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    private WebElement buttonJSConfirm;

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    private WebElement buttonJSPrompt;

    @FindBy(id = "result")
    private WebElement result;

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    public JavaScriptAlertsPage AlertClick() {
       buttonJsAlert.click();

        return this;
    }
    public JavaScriptAlertsPage ConfirmClick() {
        buttonJSConfirm.click();

        return this;
    }

    public JavaScriptAlertsPage PromptClick() {
        buttonJSPrompt.click();

        return this;
    }

    public JavaScriptAlertsPage AlertAccept() {
        getDriver().switchTo().alert().accept();

        return this;
    }

    public JavaScriptAlertsPage AlertDecline() {
        getDriver().switchTo().alert().dismiss();

        return this;
    }

    public JavaScriptAlertsPage setAlertText(String text) {
        getDriver().switchTo().alert().sendKeys(text);

        return this;
    }

    public String getResultText() {
        return result.getText();
    }

}
