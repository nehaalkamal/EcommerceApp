
package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_Search {

    public WebElement searchProduct() {
        By SearchProduct = By.id("small-searchterms");
        WebElement searchProduct = Hooks.driver.findElement(SearchProduct);
        return searchProduct;

    }
    public WebElement clickSearch()
    {
        By SearchProduct1 = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        WebElement clickSearch= Hooks.driver.findElement(SearchProduct1);
        return clickSearch;
    }

    public List<WebElement> searchResult() {
        By result= By.cssSelector("div[class=\"picture\"]");
        List results = Hooks.driver.findElements(result);
        return results;
    }
    public WebElement result_SKU(){

        By sku0 =  By.xpath("//div[@class=\"sku\"]");
        WebElement sku = Hooks.driver.findElement(sku0);
        return sku;

    }

}
