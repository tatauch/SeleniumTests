package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoadingPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(), 'Element on page that is hidden')]")
    private WebElement goToExample1;

    @FindBy(xpath = "//a[contains(text(), 'Example 2: Element rendered after the fact')]")
    private WebElement goToExample2;

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DynamicLoading1Page goToDynamicLoading1Page() {
        goToExample1.click();

        return new DynamicLoading1Page(getDriver());
    }

    public DynamicLoading2Page goToDynamicLoading2Page() {
        goToExample2.click();

        return new DynamicLoading2Page(getDriver());
    }
}



//        WebElement startButton = TestRunner.driver.findElement(By.xpath("//*[@id='start']/button"));
//        startButton.click();
//        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4")));
//
//    }
//    @Then("Test asserts that “Hello World!” text is displayed.")
//    public void test_asserts_that_Hello_World_text_is_displayed() {
//        // Write code here that turns the phrase above into concrete actions
//        Assert.assertEquals("Hello World!", TestRunner.driver.findElement(By.xpath("//*[@id='finish']/h4")).getText());
//    }