package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P09_ShoppingCart;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D09_ShoppingCartStepDef {
    P09_ShoppingCart shoppingCartPage = new P09_ShoppingCart();

    @And("user chooses Windows 8 Pro")
    public void choose_win8() {

//        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        shoppingCartPage.choose_win8().click();
        ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].scrollIntoView(true)", shoppingCartPage.choose_win8());
        shoppingCartPage.choose_win8().click();
//        Actions actions = new Actions(Hooks.driver);
//        new WebDriverWait(Hooks.driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(shoppingCartPage.choose_win8())).click();

    }

    @And("user clicks on add to cart button")
    public void add_to_cart_1() {
        shoppingCartPage.add_to_cart_1().click();
    }
    @Then("product added successfully message")
    public void added_successfully() {
        String ExpectedResult = "The product has been added to your shopping cart";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

    @And("user chooses flower girl bracelet")
    public void choose_bracelet() {
        ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].scrollIntoView(true)", shoppingCartPage.choose_bracelet());
        shoppingCartPage.choose_bracelet().click();
//        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        shoppingCartPage.choose_bracelet().click();
//        Actions actions = new Actions(Hooks.driver);
//        actions.moveToElement(shoppingCartPage.choose_bracelet());
//        actions.perform();
//        new WebDriverWait(Hooks.driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(shoppingCartPage.choose_bracelet())).click();
    }
    @And("user clicks on add to cart button again")
    public void add_to_cart_2() {
        shoppingCartPage.add_to_cart_2().click();
    }
}
