package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage{

    @FindBy(id = "hot-spot")
    private WebElement box;

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public ContextMenuPage rightClickBox() {
        getActions().moveToElement(box).contextClick(box).build().perform();

        return this;
    }

    public String getAlertText() {
        return getDriver().switchTo().alert().getText();
    }
}
