package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class P10_WishList {

    public WebElement Add_To_Wishlist_1() {
        By wishlist = By.id("add-to-wishlist-button-4");
        WebElement Add_To_wishlist_1 = Hooks.driver.findElement(wishlist);
        return Add_To_wishlist_1;

    }
    public WebElement Add_To_Wishlist_2() {
        By wishlist = By.id("add-to-wishlist-button-37");
        WebElement Add_To_wishlist_2 = Hooks.driver.findElement(wishlist);
        return Add_To_wishlist_2;

    }

    public WebElement choose_macbook() {
        By MacBook = By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]");
        WebElement apple = Hooks.driver.findElement(MacBook);
        return apple;
    }

    public WebElement choose_Bradbury_book() {
        By Book = By.cssSelector("a[href=\"/fahrenheit-451-by-ray-bradbury\"]");
        return Hooks.driver.findElement(Book);
    }

    public WebElement choose_books_cate() {
        By Books = By.cssSelector("a[href=\"/books\"]");
        WebElement BooksCategory = Hooks.driver.findElement(Books);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(BooksCategory).click().build().perform();
        return BooksCategory;
    }
}
