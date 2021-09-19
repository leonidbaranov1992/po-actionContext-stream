package googleSearch;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BaseHooks;


public class UsingGoogleSearchPage extends BaseHooks {
    @Test
    public void googleSearch() {

        // Переход на страницу
        driver.get("http://www.google.com/");

        // Новый экземпляр класса

       GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);

        // And now do the search.
        page.searchFor("привет");

    }
}
