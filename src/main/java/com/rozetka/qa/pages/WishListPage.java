package com.rozetka.qa.pages;

import com.rozetka.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage extends TestBase {
    @FindBy(xpath = "//a[contains(@class,'header-actions__button_type_wish')]")
    WebElement wishList;

    public void watch_wish_list() {
        PageFactory.initElements(driver, this);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", wishList);

    }

}


