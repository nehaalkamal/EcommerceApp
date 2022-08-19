package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.xml.stream.XMLStreamReader;

public class P05_SwitchCurrencies {
    public WebElement chooseEuroCurrency()
    {
        By curr_menu= By.id("customerCurrency");
        WebElement chooseEuro= Hooks.driver.findElement(curr_menu);
        Select select = new Select(chooseEuro);
        select.selectByVisibleText("Euro");
        return chooseEuro;
    }


    public WebElement chooseUSDollarCurrency()
    {
        By curr_menu= By.id("customerCurrency");
        WebElement chooseUS= Hooks.driver.findElement(curr_menu);
        Select select = new Select(chooseUS);
        select.selectByVisibleText("US Dollar");
        return chooseUS;
    }

    public WebElement item_price() {
            By price = By.cssSelector("div:nth-child(1) > div > div.details > div.add-info > div.prices > span");
            WebElement item_price = Hooks.driver.findElement(price);
            return item_price;

    }
}
