package cases;

import org.junit.Test;
import pages.*;
import utils.BaseHooks;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GithubPageObjectTest extends BaseHooks {

    @Test
    public void githubPageObjectTest() {
        LoginPage loginPage = new LoginPage(driver);
        String title = loginPage.open()
                .search("Selenide")
                .clickFirstRepository()
                .openIssues()
                .clickIssuesByNumber(0)
                .getIssueTitle();

        assertThat(title, is("Status: Open"));
    }
}