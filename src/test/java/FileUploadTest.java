import Base.BaseTest;
import Model.FileUploadPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){
        FileUploadPage newFileUploadPage = new WelcomePage(getDriver())
                .goToFileUploadPage()
                .uploadFile("C:\\Users\\tatsi\\New Text Document.txt")
                .clickSubmitButton();

        Assert.assertEquals(newFileUploadPage.getHeaderText(), "File Uploaded!");
    }
}
