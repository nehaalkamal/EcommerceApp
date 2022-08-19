package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_Login;
import org.testng.Assert;

public class D02_LoginStepDef {
    P02_Login loginPage = new P02_Login();

    @Given("user navigates to log in page")
    public void navigateToLoginPage() {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        Hooks.driver.navigate().to(url);
    }

    @And("user fills his email")
    public void Email() {
        loginPage.Email().sendKeys("Nehaalkamal1@gmail.com");

    }

    @And("user fills his password")
    public void Password() {
        loginPage.Password().sendKeys("Nehal123!");

    }

    @And("user clicks on log in button")
    public void Login_button() {
        loginPage.LogIn().click();
    }


    @Then("user logged in successfully")
    public void loginSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F"));
    }
}
