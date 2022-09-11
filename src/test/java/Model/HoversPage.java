package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoversPage extends BasePage{

    @FindBy(xpath = "//div[@id='content']/div/div[1]/img")
    private WebElement userAvatar1;

    @FindBy(xpath = "//div[@id='content']/div/div[1]/div/h5")
    private WebElement userAvatar1Name;

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    public HoversPage moveToUserAvatar1() {
        getActions().moveToElement(userAvatar1).perform();
        return this;
    }

    public String getUserAvatar1Name() {
        return userAvatar1Name.getText();
    }

    public boolean userAvatar1NameIsDisplayed() {
        return userAvatar1Name.isDisplayed();
    }
}
