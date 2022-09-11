package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.List;

public class JavaScriptOnloadEventErrorPage extends BasePage {

    public JavaScriptOnloadEventErrorPage(WebDriver driver) {
        super(driver);
    }

    public boolean JavaScripOnloadEventErrorLogs() {
        LogEntries logEntries = getDriver().manage().logs().get(LogType.BROWSER);
        List<LogEntry> logs = logEntries.getAll();
        for (LogEntry log : logs) {
           if(log.getMessage().contains("Uncaught TypeError: Cannot read properties of undefined (reading 'xyz')")){
               return true;
           };
        }
        return false;
    }
}

