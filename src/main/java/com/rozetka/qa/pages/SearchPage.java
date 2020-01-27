package com.rozetka.qa.pages;

import com.rozetka.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchPage extends TestBase {
    @FindBy(xpath = "//input[@name=\"search\"]")
    WebElement search_field;
    @FindBy(xpath = "//div[contains(@data-goods-id,'124309993')]")
    WebElement result_of_search;

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public SearchPage search() {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", search_field);
        search_field.sendKeys("PS4", Keys.ENTER);
        result_of_search.click();

        return new SearchPage();

    }

}
