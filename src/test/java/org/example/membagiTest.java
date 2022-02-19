package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class membagiTest {
    @Test
    public void membagiTest() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://greyli.github.io/calculator/");

        driver.findElement(By.xpath("//button[.='9']")).click();
        driver.findElement(By.xpath("//button[.='9']")).click();
        driver.findElement(By.xpath("//button[.='/']")).click();
        driver.findElement(By.xpath("//button[.='1']")).click();
        driver.findElement(By.xpath("//button[.='1']")).click();
        driver.findElement(By.xpath("//button[@id='resultButton']")).click();
        driver.findElement(By.xpath("//div[@id='output']")).getText();


        String output3 = driver.findElement(By.xpath("//div[@id='output']")).getText();

        Assert.assertEquals("9", output3);

        driver.quit();
    }
}
