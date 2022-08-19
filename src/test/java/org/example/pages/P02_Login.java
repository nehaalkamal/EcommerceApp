package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

    public WebElement Email()
    {
        By email = By.name("Email");
        WebElement Email = Hooks.driver.findElement(email);
        return Email;
    }
    public WebElement Password()
    {
        By password = By.id("Password");
        WebElement Password = Hooks.driver.findElement(password);
        return Password;

    }
    public  WebElement LogIn()
    {
        By login = By.cssSelector("button[class=\"button-1 login-button\"]");
        WebElement LogIn = Hooks.driver.findElement(login);
        return LogIn;
    }

}
