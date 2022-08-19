package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P12_SuccessfulOrder;
import org.testng.Assert;

import java.time.Duration;

public class D12_SuccessfulOrderStepDef {

    P12_SuccessfulOrder orderPage = new P12_SuccessfulOrder();

    @Given("user clicks on shopping cart")
    public void shopping_cart_page() {
        orderPage.shopping_cart_page().click();
    }


    @And("user agreed on terms")
    public void agree_terms() {
        orderPage.agree_terms().click();
    }

    @When("user clicks on checkout")
    public void checkout_button() {
        orderPage.checkout_button().click();

    }

    @And("user fills user data")
    public void fills_data() {

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        orderPage.Country();
        orderPage.City().sendKeys("Cairo");
        orderPage.Address().sendKeys("New Cairo");
        orderPage.ZipCode().sendKeys("12345");
        orderPage.PhoneNum().sendKeys("01112345678");

    }

    @Then("user clicks on continue")
    public void userdata_continue_button() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        orderPage.userdata_continue_button().click();
    }

    @And("user chooses delivery and continue")
    public void shipping_continue_button() {

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        orderPage.shipping_continue_button().click();

    }

    @And("user select payment and continue")
    public void payment_method_continue_button() {

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        orderPage.payment_method_continue_button().click();

    }

    @And("user clicks continue")
    public void payment_continue_button() {

        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        orderPage.payment_continue_button().click();

    }

    @And("user clicks confirm")
    public void confirm_button() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        orderPage.confirm_button().click();
        Thread.sleep(2000);

    }
    @And("checkout is completed successfully")
    public void checkoutCompletedSuccessfully() {
        String expectedResult = "https://demo.nopcommerce.com/checkout/completed";
        Assert.assertTrue(Hooks.driver.getCurrentUrl().equalsIgnoreCase(expectedResult));
    }
}
