package Reusables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BrowserHandler {
    public static WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        configureLog4j();
        TestDataHandler testDataHandler = new TestDataHandler();
        String browser = testDataHandler.getBrowser();
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }

    public String getLog4JFilePath() {
        TestDataHandler testDataHandler = new TestDataHandler();
        return testDataHandler.getLog4JConfigFilePath();
    }

    public void configureLog4j() {
        PropertyConfigurator.configure(getLog4JFilePath());
    }

}
