import Base.BaseTest;
import Model.CheckboxesPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox1Checked(){
        CheckboxesPage newCheckboxesPage = new WelcomePage(getDriver())
                .goToCheckboxesPage()
                .checkCheckbox1();

        Assert.assertTrue(newCheckboxesPage.isCheckbox1Checked());
    }

    @Test
    public void testCheckbox2Checked(){
        CheckboxesPage newCheckboxesPage = new WelcomePage(getDriver())
                .goToCheckboxesPage()
                .checkCheckbox2();

        Assert.assertTrue(newCheckboxesPage.isCheckbox2Checked());
    }

    @Test
    public void testCheckboxesUnchecked(){
        CheckboxesPage newCheckboxesPage = new WelcomePage(getDriver())
                .goToCheckboxesPage()
                .unCheckCheckbox1()
                .unCheckCheckbox2();

        SoftAssert asserts = new SoftAssert();
        asserts.assertFalse(newCheckboxesPage.isCheckbox1Checked());
        asserts.assertFalse(newCheckboxesPage.isCheckbox2Checked());
        asserts.assertAll();
    }

}
