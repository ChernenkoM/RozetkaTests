package com.rozetka.qa.pages;

import com.rozetka.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {


    //Page Factory -OR

    @FindBy(xpath = "//a[@class='header-topline__user-link link-dashed']")
    WebElement login_form_btn;
    @FindBy(xpath = "//button[contains(@class,'auth-modal__submit')]")
    WebElement login_submit;
    @FindBy(id = "auth_email")
    WebElement user_name;
    @FindBy(id = "auth_pass")
    WebElement pass_word;

    public LoginPage() {
        PageFactory.initElements(driver, this);

    }

    public LoginPage login(String usr_name, String pswrd) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", login_form_btn);
        user_name.sendKeys(usr_name);
        pass_word.sendKeys(pswrd);
        login_submit.click();
        return new LoginPage();
    }

}