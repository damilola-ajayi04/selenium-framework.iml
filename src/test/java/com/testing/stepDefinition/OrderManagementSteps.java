package com.testing.stepDefinition;

import com.testing.cucumber.Hooks;
import com.testing.pageObject.CreateOrderPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class OrderManagementSteps {
    WebDriver driver = Hooks.driver;

    @When("I Create new order {string}")
    public void iCreateNewOrder(String Product) {
        CreateOrderPagePO createOrderPO=new CreateOrderPagePO(driver);
        createOrderPO.enterProduct(Product);
    }

    @And("I Search for product")
    public void iSearchForProduct() {
        CreateOrderPagePO createOrderPO=new CreateOrderPagePO(driver);
        createOrderPO.ClickSearchButton();
    }

    @And("I add Product to order")
    public void iAddProductToOrder() {
        CreateOrderPagePO createOrderPO=new CreateOrderPagePO(driver);
        createOrderPO.ClickProductLink();
    }

    @And("I select order details page")
    public void iSelectOrderDetailsPage() {
        CreateOrderPagePO createOrderPO=new CreateOrderPagePO(driver);
        createOrderPO.ClickOrderField();
    }

    @And("I submit order")
    public void iSubmitOrder() {
        CreateOrderPagePO createOrderPO=new CreateOrderPagePO(driver);
        createOrderPO.ClickOrderSubmit();
    }

    @Then("My order summary should displayed")
    public void myOrderSummaryShouldDisplayed() {

    }


    @And("I login to my account")
    public void iLoginToMyAccount() {

    }
}
