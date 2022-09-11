import Base.BaseTest;
import Model.HoversPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {

    @Test
    public void testHoversUser1() {
        HoversPage newHoversTest = new WelcomePage(getDriver())
                .goToHoversPage()
                .moveToUserAvatar1();

        Assert.assertEquals(newHoversTest.getUserAvatar1Name(), "name: user1");
        Assert.assertTrue(newHoversTest.userAvatar1NameIsDisplayed());
    }
}
