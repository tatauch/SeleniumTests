package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.List;

public class FileDownloadPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'some-file.txt')]")
    private WebElement fileToDownload;

    public FileDownloadPage(WebDriver driver) {
        super(driver);
    }

    public FileDownloadPage clickToDownloadFile() {
        fileToDownload.click();

        return this;
    }

    public boolean isFileDownloaded(String path, String fileName) {
        File file = new File(path);
        List<File> files = List.of(file.listFiles());
        for (File f:files) {
           if(f.getName().equals(fileName)){
           }return true;
        }
        return false;
        }

    }
