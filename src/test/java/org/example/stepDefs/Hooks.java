package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {


    public static WebDriver driver =null;

    @Before
    public static void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After

        public void quiteDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();


    }
}
