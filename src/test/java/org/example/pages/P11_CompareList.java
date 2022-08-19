package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P11_CompareList {

    public WebElement Add_To_Comparelist() {
        By comparelist = By.cssSelector("div div[class=\"compare-products\"]");
        WebElement Add_To_comparelist = Hooks.driver.findElement(comparelist);
        return Add_To_comparelist;
    }

    public WebElement choose_vintage_ring() {
        By ring = By.cssSelector("a[href=\"/vintage-style-engagement-ring\"]");
        WebElement vintage_ring = Hooks.driver.findElement(ring);
        return vintage_ring;
    }
    public WebElement choose_girl_braclet() {
        By bracelet = By.cssSelector("a[href=\"/flower-girl-bracelet\"]");
        WebElement girl_bracelet = Hooks.driver.findElement(bracelet);

        return girl_bracelet;
    }


    public WebElement choose_Jewel() {
        By jewelry = By.cssSelector("a[href=\"/jewelry\"]");
        WebElement jewelry_category = Hooks.driver.findElement(jewelry);
        return jewelry_category;
    }
    public WebElement select_Bradbury_book() {
        By Book = By.cssSelector("a[href=\"/fahrenheit-451-by-ray-bradbury\"]");
        return Hooks.driver.findElement(Book);
    }

    public WebElement select_books_cate() {
        By Books = By.cssSelector("a[href=\"/books\"]");
        WebElement BooksCategory = Hooks.driver.findElement(Books);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(BooksCategory).click().build().perform();
        return BooksCategory;
    }

    public WebElement Add_To_Comparelist_2() {
        By comparelist = By.cssSelector("div div[class=\"compare-products\"]");
        WebElement Add_To_comparelist = Hooks.driver.findElement(comparelist);
        return Add_To_comparelist;
    }
}
