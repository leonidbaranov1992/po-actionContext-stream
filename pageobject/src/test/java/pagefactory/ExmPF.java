package pagefactory;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SearchPage;


@RequiredArgsConstructor
public class ExmPF {
    private static final String URL = "https://github.com/";

    WebDriver driver;
    @FindBy(id = "q")
    private WebElement newSearch;

    @FindBy(xpath = "//input[@name='q']")
    private WebElement search;



    @SneakyThrows
    public SearchPage search (String text){
        search.sendKeys(text);
        search.sendKeys(Keys.ENTER);

        return new SearchPage(driver);
    }


}
