package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P13_HomeSliders;
import org.testng.Assert;

public class D13_HomeSlidersStepDef {

    P13_HomeSliders slider = new P13_HomeSliders();

    @When("user clicks on first slider")
    public void click_slider_1(){
        slider.first_slider().click();

    }

    @When("user clicks on second slider")
    public void click_slider_2(){
        slider.second_slider().click();
    }
    @Then("slider opens first product")
    public void first_slider_success() throws InterruptedException {
        Thread.sleep(2000);
        String page = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(page,"https://demo.nopcommerce.com/nokia-lumia-1020");

    }

    @Then("slider opens second product")
    public void second_slider_success() throws InterruptedException {
        Thread.sleep(2000);
        String page2 = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(page2,"https://demo.nopcommerce.com/iphone-6");

    }

}
