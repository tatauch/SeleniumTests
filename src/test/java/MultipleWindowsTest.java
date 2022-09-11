import Base.BaseTest;
import Model.MultipleWindowsPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleWindowsTest extends BaseTest {

    @Test
    public void testMultipleWindows() {
        MultipleWindowsPage newMultipleWindowsPage = new WelcomePage(getDriver())
                .goToMultipleWindowsPage();

        Assert.assertTrue(newMultipleWindowsPage.openInNewWindow());
    }

}
