package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PembagianTest {

    @Test
    public void pembagianTest() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://greyli.github.io/calculator/");
    }

}
