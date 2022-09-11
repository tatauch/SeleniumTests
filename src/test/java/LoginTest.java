import Base.BaseTest;
import Model.LoginPage;
import Model.SecureAreaPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginSuccess() {
        String successAlert = new WelcomePage(getDriver())
                .goToFormAuthenticationPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLogin(SecureAreaPage.class)
                .getTextDataAlert();

        Assert.assertTrue(successAlert.contains("You logged into a secure area!"));
    }

    @Test
    public void testLoginFailureInvalidUsername() {
        String newSecureAreaPage = new WelcomePage(getDriver())
                .goToFormAuthenticationPage()
                .setUsername("tomsmith1")
                .setPassword("SuperSecretPassword!")
                .clickLogin(LoginPage.class)
                .getTextDataAlert();

        Assert.assertTrue(newSecureAreaPage.contains("Your username is invalid!"));
    }

    @Test
    public void testLoginFailureInvalidPassword() {
        String newSecureAreaPage = new WelcomePage(getDriver())
                .goToFormAuthenticationPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!1")
                .clickLogin(LoginPage.class)
                .getTextDataAlert();

        Assert.assertTrue(newSecureAreaPage.contains("Your password is invalid!"));
    }

    @Test
    public void testLoginFailureEmptyTextAreas() {
        String newSecureAreaPage = new WelcomePage(getDriver())
                .goToFormAuthenticationPage()
                .setUsername("")
                .setPassword("")
                .clickLogin(LoginPage.class)
                .getTextDataAlert();

        Assert.assertTrue(newSecureAreaPage.contains("Your username is invalid!"));
    }

}

