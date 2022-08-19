package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P11_CompareList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

public class D11_CompareListStepDef {
    P11_CompareList comparelistPage = new P11_CompareList();
    @When("user chooses Jewel")
    public void choose_Jewel() {
        comparelistPage.choose_Jewel().click();

    }

    @And("user chooses vintage ring")
    public void choose_vintage_ring() {
        comparelistPage.choose_vintage_ring().click();
    }
    @And("user clicks on add to comparelist button")
    public void Add_To_Comparelist() {
        comparelistPage.Add_To_Comparelist().click();
    }
    @And("user chooses girl bracelet")
    public void choose_girl_braclet() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        comparelistPage.choose_girl_braclet().click();
    }


    @Then("product added successfully to comparelist")
    public void added_to_compare_successfully() {
        String ExpectedResult = "The product has been added to your product comparison";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
    @And("user selects Books")
    public void select_books_cate() throws InterruptedException {
        String url = "https://demo.nopcommerce.com/books";
        Hooks.driver.navigate().to(url);
//        comparelistPage.select_books_cate();
//        Thread.sleep(3000);
    }
    @And("user selects Bradbury book")
    public void select_Bradbury_book() {
        comparelistPage.select_Bradbury_book().click();
    }

    @And("user clicks on add to comparelist button again")
    public void Add_To_Comparelist_2() {
        comparelistPage.Add_To_Comparelist_2().click();
    }
}
