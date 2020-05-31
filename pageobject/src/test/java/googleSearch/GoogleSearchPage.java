package googleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class GoogleSearchPage {
    // Вот тут элемент
    //private WebElement q;
    @FindBy(name = "q")
    private WebElement saerchBox;

    public void searchFor(String text) {
        // А тут мы его используем. При этом мы его пока ещё не создали
        saerchBox.sendKeys(text);
        saerchBox.submit();

    }
}



