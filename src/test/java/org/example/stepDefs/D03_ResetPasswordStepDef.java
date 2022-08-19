package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_ResetPassword;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_ResetPasswordStepDef {
    P03_ResetPassword resetPage = new P03_ResetPassword();

    @Given("user navigates to login page")
    public void navigateToLoginPage() {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Hooks.driver.navigate().to(url);
    }

    @And("user clicks on forgot password")
    public void forgot_password_link() {

        resetPage.forgot_Password().click();
    }


    @And("user fills his Email")
    public void Email() {

        resetPage.Email().sendKeys("nehaalkamal1@gmail.com");
    }


    @Then("user clicks on Recover button")
    public void recover_password_button() {
        resetPage.recover_password_btn().click();

    }

    @Then("user reset his password successfully")
    public void ResetSuccessfully() {

        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        String ExpectedResult = "Email with instructions has been sent to you";
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

}
