package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_FilterColour;

public class D07_FilterColourStepDef {
    P07_FilterColour filterColourPage = new P07_FilterColour();
    /*    When
    And

    Then */

    @When("user chooses Apparel category then hover to Shoes subcategory")
    public void choose_Apparel_category() {
        filterColourPage.choose_Apparel_category();
    }
    @And("user chooses Shoes subcategory")
    public void choose_Shoes_subcategory() {
        filterColourPage.choose_Shoes_subcategory().click();
    }
    @Then("user filtered by red colour successfully")
    public void filter_by_Colour() {
        filterColourPage.filter_by_Colour().click();
    }

}
