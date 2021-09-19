package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IssuePage extends AbstractPage {
    @FindBy (xpath="//div[@class='TableObject-item']/span")
    private WebElement issueTitle;

    public IssuePage(WebDriver driver) {
        super(driver);
    }

    public String getIssueTitle() {
        return issueTitle.getAttribute("title");
    }

}
