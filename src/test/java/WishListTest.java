import com.rozetka.qa.base.TestBase;
import com.rozetka.qa.pages.LoginPage;
import com.rozetka.qa.pages.WishListPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WishListTest extends TestBase {
    WishListPage wishListPageObject;
    LoginPage loginPageObject;

    public WishListTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        PageFactory.initElements(driver, WishListPage.class);
        wishListPageObject = new WishListPage();
        loginPageObject = new LoginPage();
    }

    @Test
    public void wish_list_test() {
        loginPageObject.login(prop.getProperty("username"), prop.getProperty("password"));
        wishListPageObject.watch_wish_list();
        assertThat(driver.getPageSource().contains("PS4"));
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
