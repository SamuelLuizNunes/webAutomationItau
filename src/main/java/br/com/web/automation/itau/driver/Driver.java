package br.com.web.automation.itau.driver;

import br.com.web.automation.itau.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public Driver(Browser browser) {
        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case IE:
                driver = new InternetExplorerDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public static void visibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void invisibilityOf(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
