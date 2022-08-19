package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Registration;
import org.testng.Assert;

public class D01_RegistrationStepDef {

    P01_Registration registerPage = new P01_Registration();

    @When("user navigates to home page")
    public void navigateToRegistrationPage() throws InterruptedException {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
        Thread.sleep(2000);
    }

    @And("user clicks on register to open registration page")
    public void register_link()
    {
        registerPage.registrationLink().click();
    }
    @And("user enters her gender")
    public void Female_Gender() {
        registerPage.Gender().click();
    }
    @And("user enters birthdate")
    public void birthdate() {
        registerPage.day().selectByValue("12");
        registerPage.month().selectByValue("12");
        registerPage.year().selectByValue("1994");
    }


    @And("user enters valid first name")
    public void First_Name()
    {
        registerPage.Firstname().sendKeys("Nehal");
    }

    @And("user enters valid last name")
    public void Last_Name()
    {
        registerPage.Lastname().sendKeys("Kamal");
    }

    @And("user enters valid email")
    public void Email()
    {
        registerPage.Email().sendKeys("Nehaalkamal1@gmail.com");
    }

    @And("user enters valid password")
    public void EnterPassword()
    {
        registerPage.Password().sendKeys("Nehal123!");
        registerPage.confirmPassword().sendKeys("Nehal123!");
    }

    @And("user clicks on register button")
    public void register_button() {
        registerPage.regButton().click();
    }

    @Then("user registered successfully")
    public void success_Message()
    {
        String actualResult = registerPage.regCompletedMessage().getText();
        String expectedResult = "Your registration completed";
        Assert.assertTrue(actualResult.equalsIgnoreCase(expectedResult));

    }
}
