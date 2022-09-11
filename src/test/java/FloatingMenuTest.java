import Base.BaseTest;
import Model.FloatingMenuPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FloatingMenuTest extends BaseTest {

    @Test
    public void testFloatingMenu() {
        FloatingMenuPage newFloatingMenuPage = new WelcomePage(getDriver())
                .goToFloatingMenuPage()
                .goToFooter();

        Assert.assertTrue(newFloatingMenuPage.isFloatingMenuDisplayed());
    }
}
