package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends AbstractPage {
    private static final String ELEMENT_XPATH = "//input[@name='q']";
    private static final String URL = "https://github.com/";
    @FindBy(xpath = ELEMENT_XPATH)
    Button search;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage open() {
        driver.get(URL);
        return this;
    }

    public SearchPage search(String text) {
        search.sendKeys(text);
        search.sendKeys(Keys.ENTER);
        return new SearchPage(driver);
    }
}
