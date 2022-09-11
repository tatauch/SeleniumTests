package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static java.lang.System.getProperties;

public abstract class BaseTest {
    private WebDriver driver;

    private static Properties properties = new Properties();

    protected WebDriver getDriver() {
        return driver;
    }

    public static void loginWeb(WebDriver driver) {
        InputStream inputStream = BaseTest.class.getClassLoader().getResourceAsStream("local.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.get(String.format("http://localhost:%s", properties.getProperty("default.port")));
    }

    @BeforeClass
    protected void before() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    protected void beforeTest() {
        driver = new ChromeDriver();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginWeb(getDriver());
        getDriver().manage().window().maximize();
    }

    @AfterMethod
    protected  void afterTest() {
        getDriver().quit();
    }

}
