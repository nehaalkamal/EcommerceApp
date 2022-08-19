package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P12_SuccessfulOrder {

    public WebElement shopping_cart_page() {

        By cart = By.cssSelector("a[href=\"/cart\"]");
        WebElement shopping_cart = Hooks.driver.findElement(cart);
        return shopping_cart;
    }

    public WebElement agree_terms() {
        By terms = By.id("termsofservice");
        WebElement agree_terms = Hooks.driver.findElement(terms);
        return agree_terms;
    }

    public WebElement checkout_button() {

        By checkout = By.id("checkout");
        WebElement checkout_button = Hooks.driver.findElement(checkout);
        return checkout_button;
    }

    public WebElement Country() {
        By country = By.id("BillingNewAddress_CountryId");
        WebElement Country = Hooks.driver.findElement(country);
        Select select = new Select(Country);
        select.selectByValue("123");
        return Country;
    }

    public WebElement City() {
        By city = By.id("BillingNewAddress_City");
        WebElement City = Hooks.driver.findElement(city);
        return City;
    }

    public WebElement Address() {
        By address = By.id("BillingNewAddress_Address1");
        WebElement Address = Hooks.driver.findElement(address);
        return Address;
    }

    public WebElement ZipCode() {
        By zip_code = By.id("BillingNewAddress_ZipPostalCode");
        WebElement zipcode = Hooks.driver.findElement(zip_code);
        return zipcode;
    }

    public WebElement PhoneNum() {
        By phone = By.id("BillingNewAddress_PhoneNumber");
        WebElement Phone_num = Hooks.driver.findElement(phone);
        return Phone_num;
    }

    public WebElement userdata_continue_button() {
        By data_continue = By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button");
        WebElement data_cont =  Hooks.driver.findElement(data_continue);
        return data_cont;
    }

    public WebElement shipping_continue_button() {
        By shipping_cont_button = By.cssSelector("#shipping-method-buttons-container > button");
        WebElement shipping_cont =  Hooks.driver.findElement(shipping_cont_button);
        return shipping_cont;
    }

    public WebElement payment_method_continue_button() {
        By payment_method_continue_button = By.cssSelector("#payment-method-buttons-container > button");
        WebElement payment_method_cont_button = Hooks.driver.findElement(payment_method_continue_button);
        return payment_method_cont_button;
    }

    public WebElement payment_continue_button() {
        By payment_continue_button = By.cssSelector("#payment-info-buttons-container > button");
        WebElement payment_cont_button =  Hooks.driver.findElement(payment_continue_button);
        return payment_cont_button;
    }

    public WebElement confirm_button() {
        By confirm_order_button = By.cssSelector("#confirm-order-buttons-container > button");
        WebElement confirm_button = Hooks.driver.findElement(confirm_order_button);
        return confirm_button;
    }
}
