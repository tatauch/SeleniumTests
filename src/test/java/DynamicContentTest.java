import Base.BaseTest;
import Model.DynamicContentPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicContentTest extends BaseTest {

    @Test
    public void testDynamicContent() {
        DynamicContentPage newDynamicContentPage = new WelcomePage(getDriver())
                .goToDynamicContentPage();

        Assert.assertNotEquals(newDynamicContentPage.getTextFirstTextBlock(),
                newDynamicContentPage.refresh().getTextFirstTextBlock());
    }

}
