package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.CSS;

import static com.testing.cucumber.Hooks.driver;

public class SignInAccountPagePO {

    // Element Locator

    @FindBy (id ="email")
    public static WebElement EmailField;

    @FindBy (id ="pass")
    public static WebElement PasswordField;

    @FindBy (css = "#send2 > span")
    public static WebElement SignInButton;


    // Initialised WebElement Using Selenium Web Driver
    public SignInAccountPagePO (WebDriver driver){
        PageFactory.initElements(driver, this);

    }


    // Page Element Method

    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void clickSignInButton(){
        SignInButton.click();
    }



}
