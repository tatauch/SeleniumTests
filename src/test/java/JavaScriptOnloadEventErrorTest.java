import Base.BaseTest;
import Model.JavaScriptOnloadEventErrorPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptOnloadEventErrorTest extends BaseTest {

    @Test
    public void testJavaScriptOnloadEventError() {
        JavaScriptOnloadEventErrorPage newJavaScriptOnloadEventErrorPage = new WelcomePage(getDriver())
                .goToJavaScriptOnloadEventErrorPage();

        Assert.assertTrue(newJavaScriptOnloadEventErrorPage.JavaScripOnloadEventErrorLogs());

    }
}
