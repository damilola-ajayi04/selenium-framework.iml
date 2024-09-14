package com.testing.pageObject;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.testing.cucumber.Hooks.driver;

public class HomePagePO {

    // Element Locators

    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;

    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;



    // Initialise web elements using selenium web driver

    public HomePagePO(WebDriver Driver){
        PageFactory.initElements(driver, this);

    }

    // Home Specific Method

    public void ClickCreateAccountLink(){
        CreateAccountLink.click();
    }

    public void ClickSignInLink(){
        SignInLink.click();
    }

}

