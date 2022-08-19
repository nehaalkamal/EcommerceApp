package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_WishList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class D10_WishListStepDef {
    P10_WishList wishlistPage = new P10_WishList();

    @And("user chooses Apple macbook")
    public void choose_macbook() {
       wishlistPage.choose_macbook().click();
    }


    @And("user clicks on add to wishlist button")
    public void Add_To_Wishlist_1() {
        wishlistPage.Add_To_Wishlist_1().click();
    }

    @Then("product added successfully to wishlist")
    public void added_to_wish_successfully() {
        String ExpectedResult = "The product has been added to your wishlist";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
    @When("user chooses Books category")
    public void choose_books_cate() throws InterruptedException {
        wishlistPage.choose_books_cate();
        Thread.sleep(3000);

    }
    @And("user chooses Bradbury book")
    public void choose_Bradbury_book() {
        wishlistPage.choose_Bradbury_book().click();
    }

    @And("user clicks on add to wishlist button again")
    public void Add_To_Wishlist_2() {
        wishlistPage.Add_To_Wishlist_2().click();
    }
}
