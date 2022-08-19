package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P07_FilterColour {
    public WebElement choose_Apparel_category() {
        By apparel = By.cssSelector("a[href=\"/apparel\"]");
        WebElement apparel_category = Hooks.driver.findElement(apparel);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(apparel_category).build().perform();
        return apparel_category;
    }
    public WebElement choose_Shoes_subcategory() {
        By shoes = By.cssSelector("a[href=\"/shoes\"]");
        WebElement shoes_subcategory = Hooks.driver.findElement(shoes);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(shoes_subcategory).build().perform();
        return shoes_subcategory;

    }

    public WebElement filter_by_Colour() {
        By colour = By.id("attribute-option-15");
        WebElement filter_colour = Hooks.driver.findElement(colour);
        return filter_colour;
    }
}
