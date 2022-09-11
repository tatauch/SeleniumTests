package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{

    @FindBy(xpath = "//a[contains(text(), 'iFrame')]")
    private WebElement linkIframe;

    public FramePage(WebDriver driver) {
        super(driver);
    }

    public IframePage goToIframePage() {
        linkIframe.click();

        return new IframePage(getDriver());
    }
}
