package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_ShoppingCart {
    public WebElement choose_win8() {
        By windows = By.cssSelector("a[href=\"/windows-8-pro\"]");
        WebElement windows8 = Hooks.driver.findElement(windows);
        return windows8;
    }

    public WebElement add_to_cart_1() {
        By cart_1 = By.id("add-to-cart-button-11");
        WebElement Add_To_Cart_1 = Hooks.driver.findElement(cart_1);
        return Add_To_Cart_1;
    }

    public WebElement choose_bracelet() {


        By bracelet = By.cssSelector("a[href=\"/flower-girl-bracelet\"]");
        WebElement girl_bracelet = Hooks.driver.findElement(bracelet);

        return girl_bracelet;
    }

    public WebElement add_to_cart_2() {
        By cart_2 = By.id("add-to-cart-button-41");
        WebElement Add_To_Cart_2 = Hooks.driver.findElement(cart_2);
        return Add_To_Cart_2;
    }
}
