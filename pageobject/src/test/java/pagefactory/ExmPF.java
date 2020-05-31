package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPage;

public class ExmPF {
    private static final String URL = "https://github.com/";

    WebDriver driver;

    @FindBy
            (xpath ="//input[@name='q']")
    private WebElement search;

    public ExmPF (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public SearchPage search(String text) {
        search.sendKeys(text);
        search.sendKeys(Keys.ENTER);

        return new SearchPage(driver);
    }



}
