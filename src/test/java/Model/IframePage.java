package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframePage extends BasePage{

    @FindBy(id = "mce_0_ifr")
    private WebElement iframe;

    @FindBy(id = "tinymce")
    private WebElement textArea;

    public IframePage(WebDriver driver) {
        super(driver);
    }

    public IframePage switchT0Iframe(){
        getDriver().switchTo().frame(iframe);

        return this;
    }

    public IframePage setTextToTextArea() {
        textArea.clear();
        textArea.sendKeys("New test");

        return this;
    }

    public String getTextFromTextArea() {
        return textArea.getText();
    }

}

