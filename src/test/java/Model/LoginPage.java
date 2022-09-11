package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LoginPage extends BasePage{

    @FindBy(id = "username")
    private WebElement inputUsername;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy (className = "radius")
    private WebElement buttonLogin;

    @FindBy(id = "flash")
    private WebElement dataAlertError;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String username){
        inputUsername.clear();
        inputUsername.sendKeys(username);

        return this;
    }

    public LoginPage setPassword(String password) {
        inputPassword.clear();
        inputPassword.sendKeys(password);

        return this;
    }

    public <T extends BasePage> T clickLogin(Class<T> type) {
        buttonLogin.click();
        Constructor<T> cons = null;
        try {
            cons = type.getConstructor(WebDriver.class);
            return cons.newInstance(getDriver());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public String getTextDataAlert() {
        return dataAlertError.getText();
    }

}
