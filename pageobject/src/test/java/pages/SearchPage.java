package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage {
    @FindBy(xpath = "//a[@href='/selenide/selenide']")
    WebElement firstRepository;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public RepositoryTopBarElement clickFirstRepository() {
        firstRepository.click();

        return new RepositoryTopBarElement(driver);
    }

}
