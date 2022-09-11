package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{

    @FindBy(xpath = "//a[contains(text(), 'Form Authentication')]")
    private WebElement linkFormAuthentication;

    @FindBy(xpath = "//a[contains(text(), 'Checkboxes')]")
    private WebElement linkCheckboxes;

    @FindBy(xpath = "//a[contains(text(), 'Context Menu')]")
    private WebElement linkContextMenu;

    @FindBy(xpath = "//a[contains(text(), 'Drag and Drop')]")
    private WebElement linkDragAndDrop;

    @FindBy(xpath = "//a[contains(text(), 'Dropdown')]")
    private WebElement linkDropdown;

    @FindBy(xpath = "//a[contains(text(), 'Dynamic Content')]")
    private WebElement linkDynamicContent;

    @FindBy(xpath = "//a[contains(text(), 'Dynamic Controls')]")
    private WebElement linkDynamicControls;

    @FindBy(xpath = "//a[contains(text(), 'Dynamic Loading')]")
    private WebElement linkDynamicLoading;

    @FindBy(xpath = "//a[contains(text(), 'File Download')]")
    private WebElement linkFileDownload;

    @FindBy(xpath = "//a[contains(text(), 'File Upload')]")
    private WebElement linkFileUpload;

    @FindBy(xpath = "//a[contains(text(), 'Floating Menu')]")
    private WebElement linkFloatingMenu;

    @FindBy(xpath = "//a[contains(text(), 'Frame')]")
    private WebElement linkFrame;

    @FindBy(xpath = "//a[contains(text(), 'Hovers')]")
    private WebElement linkHovers;

    @FindBy(xpath = "//a[contains(text(), 'JavaScript Alerts')]")
    private WebElement linkJavaScriptAlerts;

    @FindBy(xpath = "//a[contains(text(), 'JavaScript onload event error')]")
    private WebElement linkJavaScriptOnloadEventError;

    @FindBy(xpath = "//a[contains(text(), 'Multiple Windows')]")
    private WebElement linkMultipleWindows;

    @FindBy(xpath = "//a[contains(text(), 'Notification Messages')]")
    private WebElement linkNotificationMessages;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToFormAuthenticationPage(){
        linkFormAuthentication.click();

        return new LoginPage(getDriver());
    }

    public CheckboxesPage goToCheckboxesPage(){
        linkCheckboxes.click();

        return new CheckboxesPage(getDriver());
    }

    public ContextMenuPage goToContextMenuPage(){
        linkContextMenu.click();

        return new ContextMenuPage(getDriver());
    }

    public DragAndDropPage goToDragAndDropPage(){
        linkDragAndDrop.click();

        return new DragAndDropPage(getDriver());
    }

    public DropdownPage goToDropdownPage() {
        linkDropdown.click();

        return new DropdownPage(getDriver());
    }

    public DynamicContentPage goToDynamicContentPage() {
        linkDynamicContent.click();

        return new DynamicContentPage(getDriver());
    }

    public DynamicControlsPage goToDynamicControlsPage() {
        linkDynamicControls.click();

        return new DynamicControlsPage(getDriver());
    }

    public DynamicLoadingPage goToDynamicLoadingPage() {
        linkDynamicLoading.click();

        return new DynamicLoadingPage(getDriver());
    }

    public FileDownloadPage goToFileDownloadPage() {
        linkFileDownload.click();

        return new FileDownloadPage(getDriver());
    }

    public FileUploadPage goToFileUploadPage() {
        linkFileUpload.click();

        return new FileUploadPage(getDriver());
    }

    public FloatingMenuPage goToFloatingMenuPage() {
        linkFloatingMenu.click();

        return new FloatingMenuPage(getDriver());
    }

    public FramePage goToFramePage() {
        linkFrame.click();

        return new FramePage(getDriver());
    }

    public HoversPage goToHoversPage() {
        linkHovers.click();

        return new HoversPage(getDriver());
    }

    public JavaScriptAlertsPage goToJavaScriptAlertsPage() {
        linkJavaScriptAlerts.click();

        return new JavaScriptAlertsPage(getDriver());
    }

    public JavaScriptOnloadEventErrorPage goToJavaScriptOnloadEventErrorPage() {
        linkJavaScriptOnloadEventError.click();

        return new JavaScriptOnloadEventErrorPage(getDriver());
    }

    public MultipleWindowsPage goToMultipleWindowsPage() {
        linkMultipleWindows.click();

        return new MultipleWindowsPage(getDriver());
    }

    public NotificationMessagesPage goToNotificationMessagesPage() {
        linkNotificationMessages.click();

        return new NotificationMessagesPage(getDriver());
    }
}
