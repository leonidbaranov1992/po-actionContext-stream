package utils;

import lombok.Value;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BaseHooks {
    protected static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = WebDriverFactory.createDriver(WebDriverType.CHROME);

        if (driver != null) {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
    }

    @AfterClass
    public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    public static Actions setActionsBuilder(){
        return new Actions(driver);
    }

    public static void pause(){
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

}
