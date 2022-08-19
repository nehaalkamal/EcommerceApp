package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P14_FollowUs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D14_FollowUsStepDef {
    P14_FollowUs follow_us = new P14_FollowUs();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));




    @And("user clicks twitter")
    public void click_twitter(){
        follow_us.twitter_link().click();
    }

    @Then("twitter is opened successfully")
    public void Twitter_success_msg(){
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabs.get(1));
        String url = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(url,"https://twitter.com/nopCommerce");
        Hooks.driver.switchTo().window(tabs.get(0));

    }
    @And("user clicks youtube")
    public void click_youtube() {
        follow_us.youtube_link().click();
    }

    @Then("youtube is opened successfully")
    public void Youtube_success_msg() {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabs.get(1));
        String url = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(url, "https://www.youtube.com/user/nopCommerce");
        Hooks.driver.switchTo().window(tabs.get(0));

    }
    @And("user clicks RSS")
    public void click_RSS(){
        follow_us.RSS_link().click();
    }

    @Then("RSS is opened successfully")
    public void RSS_success_msg(){
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabs.get(1));
        String url = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(url,"https://demo.nopcommerce.com/new-online-store-is-open");

        
        Hooks.driver.switchTo().window(tabs.get(0));

    }
    @And("user clicks facebook")
    public void click_facebook() {
        follow_us.facebook_link().click();
    }

    @Then("facebook is opened successfully")
    public void Facebook_success_msg() {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabs.get(1));
        String url = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(url, "https://www.facebook.com/nopCommerce");


        Hooks.driver.switchTo().window(tabs.get(0));

    }

}
