package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseSteps {

    ProductPage productPage = new ProductPage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("demoblaze.url"));
    }

    @When("User adds {string} from {string}")
    public void user_adds_from(String product, String category) {
        productPage.navigateTo(product,category);
        productPage.addToCart();
        productPage.home.click();
    }

    @And("User navigates to cart and removes {string}")
    public void userNavigatesToCartAndRemoves(String product) {
        productPage.cart.click();
        productPage.deleteProduct(product);
    }

    @And("User cliks on place order")
    public void userCliksOnPlaceOrder() {
        productPage.cart.click();
        productPage.placeOrder.click();
    }

    @And("User fills the form for order and clicks on purchase button")
    public void userFillsTheFormForOrderAndClicksOnPurchaseButton() {


    }

    @Then("order ID and order amount should be as expected")
    public void orderIDAndOrderAmountShouldBeAsExpected() {
    }
}
