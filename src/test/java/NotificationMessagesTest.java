import Base.BaseTest;
import Model.NotificationMessagesPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessagesTest extends BaseTest {

    @Test
    public void testNotificationMessage() {
        NotificationMessagesPage newNotificationMessage = new WelcomePage(getDriver())
                .goToNotificationMessagesPage()
                .clickToChangeNotificationMessage();

        Assert.assertTrue(newNotificationMessage.getTextFromNotificationMessage()
                .contains("Action unsuccesful, please try again"));
    }
}
