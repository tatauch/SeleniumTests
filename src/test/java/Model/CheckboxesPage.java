package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{

    @FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    private WebElement checkbox1;

    @FindBy(xpath = "//form[@id='checkboxes']/input[2]")
    private WebElement checkbox2;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCheckbox1Checked() {
        return Boolean.parseBoolean(checkbox1.getAttribute("checked"));
    }

    public CheckboxesPage checkCheckbox1(){
        if(!isCheckbox1Checked()){
            checkbox1.click();
        }
        return this;
    }

    public boolean isCheckbox2Checked() {
        return Boolean.parseBoolean(checkbox2.getAttribute("checked"));
    }

    public CheckboxesPage checkCheckbox2(){
        if(!isCheckbox2Checked()){
            checkbox2.click();
        }
        return this;
    }

    public CheckboxesPage unCheckCheckbox2(){
        if(isCheckbox2Checked()){
            checkbox2.click();
        }
        return this;
    }

    public CheckboxesPage unCheckCheckbox1(){
        if(isCheckbox1Checked()){
            checkbox1.click();
        }
        return this;
    }
}
