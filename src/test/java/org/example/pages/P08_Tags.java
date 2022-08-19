package org.example.pages;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P08_Tags {
    public WebElement select_jewelry_tag() {

        By Jewelry = By.cssSelector("a[href=\"/jewelry\"]");
        WebElement select_jewelry_tag = Hooks.driver.findElement(Jewelry);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement(select_jewelry_tag).click().build().perform();
        return select_jewelry_tag;
    }


    public WebElement select_jeans_tag() {
        By Jeans = By.cssSelector("a[href=\"/jeans\"]");
        WebElement  select_jeans_tag = Hooks.driver.findElement(Jeans);
        Actions actionProvider = new Actions(Hooks.driver);
        actionProvider.moveToElement( select_jeans_tag).click().build().perform();
        return  select_jeans_tag;
    }

}
