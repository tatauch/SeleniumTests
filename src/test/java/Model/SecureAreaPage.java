package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends BasePage{

    @FindBy(id = "flash")
    private WebElement dataAlertSuccess;

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public String getTextDataAlert() {
        return dataAlertSuccess.getText();
    }
}
