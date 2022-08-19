package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_Registration {

    public WebElement registrationLink() {
        By register = By.className("ico-register");
        WebElement registrationLink = Hooks.driver.findElement(register);
        return registrationLink;
    }

    public WebElement Firstname() {
        By FirstName = By.cssSelector("input[id^=\"FirstName\"]");
        WebElement Firstname = Hooks.driver.findElement(FirstName);
        return Firstname;
    }

    public WebElement Lastname() {
        By LastName = By.cssSelector("input[id^=\"LastName\"]");
        WebElement Lastname = Hooks.driver.findElement(LastName);
        return Lastname;
    }
    public WebElement Gender() {
        By gender = By.id("gender-female");
        WebElement gen = Hooks.driver.findElement(gender);
        return gen;
    }

    public WebElement Email() {
        By email = By.name("Email");
        WebElement Email = Hooks.driver.findElement(email);
        return Email;
    }

    public WebElement Password() {
        By password = By.id("Password");
        WebElement Password = Hooks.driver.findElement(password);
        return Password;

    }

    public WebElement confirmPassword() {
        By password = By.id("ConfirmPassword");
        WebElement confirmPassword = Hooks.driver.findElement(password);
        return confirmPassword;
    }

    public WebElement regButton() {

        By register1 = By.xpath("//button[contains(@name,\"register-butt\")]");
        WebElement regButton = Hooks.driver.findElement(register1);
        return regButton;
    }
    public Select day() {
        By Day = By.name("DateOfBirthDay");
        Select sDay = new Select(Hooks.driver.findElement(Day));
        return sDay;
    }
    public Select month() {
        By Month = By.name("DateOfBirthMonth");
        Select sMonth = new Select(Hooks.driver.findElement(Month));
        return sMonth;
    }
    public Select year() {
        By Year = By.name("DateOfBirthYear");
        Select sYear = new Select(Hooks.driver.findElement(Year));
    	return sYear;
    }


    public WebElement regCompletedMessage() {
        By regResultMsg = By.cssSelector("div[class=\"result\"]");
        WebElement regCompletedMsg = Hooks.driver.findElement(regResultMsg);
        return regCompletedMsg;
    }
}
