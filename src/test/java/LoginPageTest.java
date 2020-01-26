
import com.rozetka.qa.base.TestBase;

import com.rozetka.qa.pages.HomePage;
import com.rozetka.qa.pages.LoginPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageTest extends TestBase {
    LoginPage loginPageObject;
    HomePage homePageObject;

    public LoginPageTest() {

        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        PageFactory.initElements(driver, LoginPage.class);
        loginPageObject = new LoginPage();

    }

    @Test(priority = 1)
    public void log_page_title_test() {
        String title = driver.getTitle();
        assertThat(title.contains("Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине"));

    }

    @Test(priority = 2)
    public void login_form_test() {
        homePageObject = loginPageObject.login(prop.getProperty("username"), prop.getProperty("password"));

    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
