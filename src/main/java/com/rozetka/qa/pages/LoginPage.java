package com.rozetka.qa.pages;

import com.rozetka.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //Page Factory -OR
    @FindBy(xpath = "//span[@class='exponea-close-cross']")
    WebElement banner;
    @FindBy(xpath = "//a[@class='header-topline__user-link link-dashed']")
    WebElement login_form_btn;
    @FindBy(xpath = "//button[@class='modal__close']")
    WebElement Login_form_exit;
    @FindBy(xpath = "//input[@name=\"search\"]")
    WebElement search_field;
    @FindBy(xpath = "//button[contains(@class,'search-form__submit')]")
    WebElement search_submit_btn;
    @FindBy(xpath = "//p[contains(@class,'error-message')]")
    WebElement actual_error_msg;
    @FindBy(xpath = "auth-modal__remember-checkbox")
    WebElement check_box_elem;
    @FindBy(id = "auth_email")
    WebElement username;
    @FindBy(id = "auth_pass")
    WebElement password;
    public LoginPage() {
        PageFactory.initElements(driver, this);

    }
    //Actions
public HomePage login(String usr_name, String pswrd){
        username.sendKeys(usr_name);
        password.sendKeys(pswrd);
        //loginbtn click
return  new HomePage();
    }


}

