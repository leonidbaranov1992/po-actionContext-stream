package googleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static utils.BaseHooks.pause;
import static utils.BaseHooks.setActionsBuilder;


public class GoogleSearchPage {
    // Вот тут элемент
    //private WebElement q;
    @FindBy(name = "q")
    private WebElement saerchBox;

    public void searchFor(String text) {
        // А тут мы его используем. При этом мы его пока ещё не создали

//        saerchBox.sendKeys(text);
//        saerchBox.submit();
        actionContext(saerchBox,text);

    }

    public static void actionContext(WebElement element,String text){
        Actions builder = setActionsBuilder();
        builder.contextClick(element).sendKeys(text).pause(1000).
                sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ARROW_DOWN).
                pause(1000).sendKeys(Keys.RETURN).build().perform();
    }
}



