package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FloatingMenuPage extends BasePage{

    @FindBy(id = "page-footer")
    private WebElement pageFooter;

    @FindBy(id = "menu")
    private WebElement floatingMenu;

    public FloatingMenuPage(WebDriver driver) {
        super(driver);
    }

    public FloatingMenuPage goToFooter() {
        getActions().moveToElement(pageFooter).perform();

        return this;
    }

    public boolean isFloatingMenuDisplayed() {
       return pageFooter.isDisplayed() && floatingMenu.isDisplayed();
    }
}
