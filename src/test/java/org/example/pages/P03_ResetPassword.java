package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_ResetPassword {
    public WebElement forgot_Password()
    {
        By ForgotPassword= By.className("forgot-password");
        WebElement Forgot_password= Hooks.driver.findElement(ForgotPassword);
        return Forgot_password;
    }

    public WebElement Email()
    {
        By email= By.id("Email");
        WebElement Email= Hooks.driver.findElement(email);
        return Email;
    }
    public WebElement recover_password_btn()
    {
        By recoverPassword= By.xpath("//button[contains(@name,\"send-email\")]");
        WebElement recover_password_btn= Hooks.driver.findElement(recoverPassword);
        return recover_password_btn;
    }
}
