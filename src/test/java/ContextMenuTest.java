import Base.BaseTest;
import Model.ContextMenuPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenuAlertText(){
        String alertText = new WelcomePage(getDriver())
                .goToContextMenuPage()
                .rightClickBox()
                .getAlertText();

        Assert.assertEquals(alertText, "You selected a context menu");
    }
}
