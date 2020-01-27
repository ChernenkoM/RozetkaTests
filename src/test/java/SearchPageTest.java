import com.rozetka.qa.base.TestBase;
import com.rozetka.qa.pages.LoginPage;
import com.rozetka.qa.pages.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchPageTest extends TestBase {
    SearchPage searchPageObject;
    LoginPage loginPageObject;

    public SearchPageTest() {
        super();
    }

    @BeforeMethod

    public void setUp() {
        initialization();
        PageFactory.initElements(driver, SearchPage.class);
        searchPageObject = new SearchPage();
        loginPageObject = new LoginPage();
    }

    @Test
    public void search_page_test() {
        loginPageObject.login(prop.getProperty("username"), prop.getProperty("password"));
        searchPageObject.search();
        assertThat(driver.getPageSource().contains("PS4"));
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }

}
