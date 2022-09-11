package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicContentPage extends BasePage{

    @FindBy(xpath = "//div[@id='content']/div[1]/div[2]")
    private WebElement firstTextBlock;

    public DynamicContentPage(WebDriver driver) {
        super(driver);
    }

    public String getTextFirstTextBlock() {
        return firstTextBlock.getText();
    }

    public DynamicContentPage refresh(){
        getDriver().navigate().refresh();

        return this;
    }

}
