package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{
    @FindBy(id="column-a")
    private WebElement columnA;

    @FindBy(id = "column-b")
    private WebElement columnB;

    @FindBy(xpath = "//div[@id='column-a']/header")
    private WebElement headerColumnA;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public DragAndDropPage dragAAndDropToB(){
        getActions().dragAndDrop(columnA,columnB).build().perform();

        return this;
    }

    public String getColumnAHeaderText(){
        return headerColumnA.getText();
    }

}
