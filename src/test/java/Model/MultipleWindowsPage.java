package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Click Here')]")
    private WebElement linkClickHere;

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    public boolean openInNewWindow() {
        linkClickHere.click();
        return getDriver().getWindowHandles().size() == 2;
    }

}
