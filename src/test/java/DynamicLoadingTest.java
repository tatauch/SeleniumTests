import Base.BaseTest;
import Model.DynamicLoading1Page;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTest extends BaseTest {

    @Test
    public void testDynamicLoadedElementsExample1() {
        DynamicLoading1Page newDynamicLoading1Page = new WelcomePage(getDriver())
                .goToDynamicLoadingPage()
                .goToDynamicLoading1Page()
                .clickStartButton();

        Assert.assertEquals(newDynamicLoading1Page.getHiddenText(), "Hello World!");
    }

    @Test
    public void testDynamicLoadedElementsExample2() {
        DynamicLoading1Page newDynamicLoading1Page = new WelcomePage(getDriver())
                .goToDynamicLoadingPage()
                .goToDynamicLoading2Page()
                .clickStartButton();

        Assert.assertEquals(newDynamicLoading1Page.getHiddenText(), "Hello World!");
    }
}
