package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P04_Search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D04_SearchStepDef {

    P04_Search searchPage = new P04_Search();


    @And("user searches with name of product")
    public void search_product()
    {
        searchPage.searchProduct().sendKeys("Samsung");
        searchPage.clickSearch().click();
    }

    @Then("user could find product results")
    public void product_result()
    {
        int items_count = Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]")).size();
        System.out.println(items_count);
        Assert.assertTrue(items_count>0);
    }
    @And("user searches with sku of product")
    public void search_product_sku()
    {
        searchPage.searchProduct().sendKeys("SM_900_PU");
        searchPage.clickSearch().click();
    }

    @And("user selects the product")
    public void select_first_result()
    {
        WebElement item = searchPage.searchResult().get(0);
        item.click();
    }
    @Then("user could find product results with sku")
    public void product_result_with_sku()
    {
        String actualResult = searchPage.result_SKU().getText();
        String expectedResult =  "SM_900_PU";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }




}
