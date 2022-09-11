package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.function.Function;

public abstract class BasePage {
    private WebDriver driver;
    private Actions actions;

    private WebDriverWait wait;

    protected WebDriver getDriver() {
        return driver;
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected Actions getActions() {
        if(actions == null) {
            actions = new Actions(driver);
        }

        return actions;
    }

    protected WebDriverWait getWait10() {
        if(wait == null) {
          wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        return wait;
    }

    protected WebDriverWait getWait30() {
        if (wait == null) {
            wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        }

        return wait;
    }

}
