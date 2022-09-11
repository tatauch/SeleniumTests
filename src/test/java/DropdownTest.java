import Base.BaseTest;
import Model.DropdownPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption1() {
        DropdownPage newDropdownPage = new WelcomePage(getDriver())
                .goToDropdownPage()
                .clickDropdownMenu()
                .clickOption1();

        Assert.assertTrue(newDropdownPage.isOption1selected());

    }

    @Test
    public void testSelectOption2() {
        DropdownPage newDropdownPage = new WelcomePage(getDriver())
                .goToDropdownPage()
                .clickDropdownMenu()
                .clickOption2();

        Assert.assertTrue(newDropdownPage.isOption2selected());

    }
}
