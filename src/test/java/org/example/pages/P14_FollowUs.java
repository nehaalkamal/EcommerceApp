package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P14_FollowUs {
    public WebElement facebook_link(){
        By facebook = By.linkText("Facebook");
        WebElement link = Hooks.driver.findElement(facebook);
        return link;
    }

    public WebElement twitter_link(){
        By twitter = By.linkText("Twitter");
        WebElement link = Hooks.driver.findElement(twitter);
        return link;
    }

    public WebElement youtube_link(){
        By youtube = By.linkText("YouTube");
        WebElement link = Hooks.driver.findElement(youtube);
        return link;
    }
    public WebElement RSS_link(){
        By RSS = By.linkText("RSS");
        WebElement link = Hooks.driver.findElement(RSS);
        return link;
    }
}
