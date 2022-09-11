import Base.BaseTest;
import Model.DynamicControlsPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void testRemoveCheckbox() {
        DynamicControlsPage newDynamicControlsPage = new WelcomePage(getDriver())
                .goToDynamicControlsPage()
                .clickButtonSwapCheckbox();

        Assert.assertEquals(newDynamicControlsPage.getChangedMessageText(), "It's gone!");
    }

    @Test
    public void testEnableDisable() {
        DynamicControlsPage newDynamicControlsPage = new WelcomePage(getDriver())
                .goToDynamicControlsPage()
                .clickButtonSwapInput();

        Assert.assertEquals(newDynamicControlsPage.getChangedMessageText(), "It's enabled!");
    }


}
