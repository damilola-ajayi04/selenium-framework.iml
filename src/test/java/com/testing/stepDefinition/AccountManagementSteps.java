package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateAccountPagePO;
import com.testing.pageObject.HomePagePO;
import com.testing.pageObject.SignInAccountPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.testing.cucumber.Hooks.driver;

public class AccountManagementSteps {
  WebDriver driver = Hooks.driver;

    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
       HomePagePO homePagePO=new HomePagePO(driver);
       homePagePO.ClickCreateAccountLink();
    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        CreateAccountPagePO createAccountPagePO=new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);
        createAccountPagePO.enterLastName(LastName);
        createAccountPagePO.enterEmail(Email);
        createAccountPagePO.enterPassword(Password);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        CreateAccountPagePO createAccountPagePO=new CreateAccountPagePO(driver);
        createAccountPagePO.ClickCreateAccountButton();
    }

    @Then("My Account page is displayed")
    public void myAccountPageIsDisplayed() {

        String expectedResult = "My Account";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Then("Account already exist should displayed")
    public void accountAlreadyExistShouldDisplayed() {

        String expectedResult = "Create New Customer Account";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Given("I am on Login page")
    public void iAmOnLoginPage() {
        HomePagePO homePagePO=new HomePagePO(driver);
        homePagePO.ClickSignInLink();

    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        SignInAccountPagePO signInAccountPagePO=new SignInAccountPagePO(driver);
        signInAccountPagePO.enterEmail(Email);
        signInAccountPagePO.enterPassword(Password);
    }

    @And("I click sign in")
    public void iClickSignIn() {
        SignInAccountPagePO signInAccountPagePO=new SignInAccountPagePO(driver);
        signInAccountPagePO.clickSignInButton();
    }

    @Then("My dashboard is displayed")
    public void myDashboardIsDisplayed() {
        String expectedResult = "Magento 2 Commerce (Enterprise) Demo - Magebit";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("I click on dashboard")
    public void iClickOnDashboard() {
    }

    @And("I click on my account")
    public void iClickOnMyAccount() {
    }

    @And("I click change password")
    public void iClickChangePassword() {
    }

    @When("I enter {string} {string} {string}")
    public void iEnter(String CurrentPassword, String NewPassword, String ConfirmNewPassword) {
    }

    @And("I click save")
    public void iClickSave() {
    }

    @Then("My password should be Updated successfully")
    public void myPasswordShouldBeUpdatedSuccessfully() {
    }
}
