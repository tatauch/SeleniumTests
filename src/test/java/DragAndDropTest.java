import Base.BaseTest;
import Model.DragAndDropPage;
import Model.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseTest {

    @Test
    public void testDragAndDrop() {
        DragAndDropPage newDragAndDropPage = new WelcomePage(getDriver())
                .goToDragAndDropPage()
                .dragAAndDropToB();

        Assert.assertEquals(newDragAndDropPage.getColumnAHeaderText(), "A");

    }
}
