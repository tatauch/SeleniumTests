import Base.BaseTest;
import Model.IframePage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeTest extends BaseTest {

    @Test
    public void testIframe() throws InterruptedException {
        IframePage newIframePage = new WelcomePage(getDriver())
                .goToFramePage()
                .goToIframePage()
                .switchT0Iframe()
                .setTextToTextArea();

        Assert.assertEquals(newIframePage.getTextFromTextArea(), "New test");

    }
}
