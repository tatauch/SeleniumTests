package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessagesPage extends BasePage{

    @FindBy(id = "flash")
    private WebElement notificationMessage;

    @FindBy(xpath = "//a[contains(text(),'Click Here')]")
    private WebElement linkClickHere;

    public NotificationMessagesPage(WebDriver driver) {
        super(driver);
    }

    public String getTextFromNotificationMessage() {
       return notificationMessage.getText();
    }

    public NotificationMessagesPage clickToChangeNotificationMessage(){
        if(getTextFromNotificationMessage().contains("Action successful")){
            linkClickHere.click();
        }
        return this;
    }
}
