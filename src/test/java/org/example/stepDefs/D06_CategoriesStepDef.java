package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.P06_Categories;

public class D06_CategoriesStepDef {

    P06_Categories categoryPage = new P06_Categories();

    @When("user chooses Jewelry category")
    public void select_Jewel_category(){
        categoryPage.choose_Jewelry_category().click();
    }

    @And("user chooses Computers category then hover to Software subcategory")
    public void choose_Computers_Software_sub() throws InterruptedException {
        categoryPage.choose_Computers_Software_sub();
        Thread.sleep(2000);
    }

}
