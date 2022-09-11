package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage{

    @FindBy(id = "dropdown")
    private WebElement dropdownMenu;

    @FindBy(xpath = "//option[@value='1']")
    private WebElement option1;

    @FindBy(xpath = "//option[@value='2']")
    private WebElement option2;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public DropdownPage clickDropdownMenu() {
        dropdownMenu.click();

        return this;
    }

    public DropdownPage clickOption1() {
        option1.click();

        return this;
    }

    public DropdownPage clickOption2() {
        option2.click();

        return this;
    }

    public boolean isOption1selected(){
        return option1.isSelected();
    }

    public boolean isOption2selected() {
        return option2.isSelected();
    }
}
