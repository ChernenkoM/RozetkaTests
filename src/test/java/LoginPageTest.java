import com.google.common.base.Supplier;
import com.rozetka.qa.base.TestBase;

import com.rozetka.qa.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageTest extends TestBase {
    //LoginPage loginPage;
    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        // LoginPage loginPage = new LoginPage();
        PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void log_page_title_test() {
        String title = driver.getTitle();
        assertThat(title.contains("Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине"));
    }

    @Test
    public void login_form_test() {

    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
