package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrderPagePO {
    @FindBy(id = "search")
    public static WebElement ProductNameField;

    @FindBy(className = "action search")
    public static WebElement SearchButton;

    @FindBy(css = "#product-item-info_8 > div > div.product-item-inner > div > div.actions-primary > form > button > span")
    public static WebElement ProductLink;

    @FindBy(css = "body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a > span.counter.qty > span.counter-number")
    public static WebElement OrderField;

    @FindBy(id = "top-cart-btn-checkout")
    public static WebElement OrderSubmitButton;


    public CreateOrderPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterProduct (String Product) {
        ProductNameField.sendKeys(Product);
    }

    public void ClickSearchButton() {
        SearchButton.click();
    }

    public void ClickProductLink() {
        ProductLink.click();
    }

    public void ClickOrderField(){
        OrderField.click();
    }

    public void ClickOrderSubmit(){
        OrderSubmitButton.click();
    }
}
