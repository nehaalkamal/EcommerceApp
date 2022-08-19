package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_SwitchCurrencies;
import org.testng.Assert;

public class D05_SwitchCurrenciesStepDef {


    P05_SwitchCurrencies switchPage = new P05_SwitchCurrencies();


    @And("user chooses Euro from dropdown menu")
    public void choose_Euro() {

        switchPage.chooseEuroCurrency();

    }
    @Then("Euro is switched successfully")
    public void success_Euro() {
        String ActualResult = switchPage.item_price().getText();
        String ExpectedResult = "€";
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

}
