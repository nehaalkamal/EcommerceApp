package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P08_Tags;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class D08_TagsStepDef {

    P08_Tags Tags = new P08_Tags();

    @Given("user chooses apparel category")
    public void open_cat() {
        String url = "https://demo.nopcommerce.com/apparel";
        Hooks.driver.navigate().to(url);

    }

    @When("user selects jewelry tag")
    public void jewel() {
        Tags.select_jewelry_tag();
    }

    @And("user selects jeans tag")

    public void jeans() {
        Tags.select_jeans_tag();
    }

}
