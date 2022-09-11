package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage{

    @FindBy(id = "file-upload")
    private WebElement inputChooseFile;

    @FindBy(id = "file-submit")
    private WebElement buttonSubmit;

    @FindBy(xpath = "//div/h3")
    private WebElement headFileUploaded;

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public FileUploadPage uploadFile(String filePath){
        inputChooseFile.sendKeys(filePath);
        return this;
    }

    public FileUploadPage clickSubmitButton() {
        buttonSubmit.click();

        return this;
    }

    public String getHeaderText() {
        return headFileUploaded.getText();
    }
}
