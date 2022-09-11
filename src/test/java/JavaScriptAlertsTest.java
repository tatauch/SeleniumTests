import Base.BaseTest;
import Model.JavaScriptAlertsPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlertsTest extends BaseTest {

    @Test
    public void testJsAlertClick() {
        JavaScriptAlertsPage newJavaScriptAlertsPage = new WelcomePage(getDriver())
                .goToJavaScriptAlertsPage()
                .AlertClick()
                .AlertAccept();

        Assert.assertEquals(newJavaScriptAlertsPage.getResultText(), "You successfuly clicked an alert");
    }

    @Test
    public void testJsConfirmClickOk() {
        JavaScriptAlertsPage newJavaScriptAlertsPage = new WelcomePage(getDriver())
                .goToJavaScriptAlertsPage()
                .ConfirmClick()
                .AlertAccept();

        Assert.assertEquals(newJavaScriptAlertsPage.getResultText(), "You clicked: Ok");
    }

    @Test
    public void testJsConfirmClickCancel() {
        JavaScriptAlertsPage newJavaScriptAlertsPage = new WelcomePage(getDriver())
                .goToJavaScriptAlertsPage()
                .ConfirmClick()
                .AlertDecline();

        Assert.assertEquals(newJavaScriptAlertsPage.getResultText(), "You clicked: Cancel");
    }

    @Test
    public void testJsConfirmPromptSetTextAndOk() {
        JavaScriptAlertsPage newJavaScriptAlertsPage = new WelcomePage(getDriver())
                .goToJavaScriptAlertsPage()
                .PromptClick()
                .setAlertText("I am a JS prompt")
                .AlertAccept();

        Assert.assertEquals(newJavaScriptAlertsPage.getResultText(), "You entered: I am a JS prompt");
    }
    @Test
    public void testjsConfirmPromptCancel() {
        JavaScriptAlertsPage newJavaScriptAlertsPage = new WelcomePage(getDriver())
                .goToJavaScriptAlertsPage()
                .PromptClick()
                .setAlertText("I am a JS prompt")
                .AlertDecline();

        Assert.assertEquals(newJavaScriptAlertsPage.getResultText(), "You entered: null");
    }

}
