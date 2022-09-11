import Base.BaseTest;
import Model.FileDownloadPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownloadTest extends BaseTest {

    @Test
    public void testDownloadFile() {
        FileDownloadPage newFileDownloadPage = new WelcomePage(getDriver())
                .goToFileDownloadPage()
                .clickToDownloadFile();

        Assert.assertTrue(newFileDownloadPage.isFileDownloaded("C:\\Users\\tatsi\\Downloads", "some-file.txt"));
    }

}
