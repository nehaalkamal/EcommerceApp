package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P06_Categories {
    public WebElement choose_Jewelry_category() {
        By jewelry = By.cssSelector("a[href=\"/jewelry\"]");
        WebElement jewelry_category = Hooks.driver.findElement(jewelry);
        return jewelry_category;
    }

    public WebElement choose_Computers_Software_sub() {
        By computers = By.cssSelector("a[href=\"/computers\"]");
        WebElement computers_category = Hooks.driver.findElement(computers);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(computers_category).build().perform();

        By software = By.cssSelector("a[href=\"/software\"]");
        WebElement software_subcategory = Hooks.driver.findElement(software);
        action.moveToElement(software_subcategory).click().build().perform();
        return software_subcategory;
    }
}
