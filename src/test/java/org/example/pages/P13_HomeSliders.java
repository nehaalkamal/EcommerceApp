package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P13_HomeSliders {

    public WebElement first_slider(){
        By first_slider = By.xpath("//a[@style=\"display: block;\"]");
        return Hooks.driver.findElement(first_slider);
    }

    public WebElement second_slider(){
        By second_slider = By.xpath("//a[@style=\"display: none;\"]");
        return Hooks.driver.findElement(second_slider);
    }
}
