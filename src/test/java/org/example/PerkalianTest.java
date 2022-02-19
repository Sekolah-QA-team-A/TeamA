package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerkalianTest {
    @Test
    public void SamplePerkalian(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://greyli.github.io/calculator/");
        WebElement btn_8 = driver.findElement(By.xpath("//button[@value=\"8\"]"));
        WebElement btn_perkalian = driver.findElement(By.xpath("//button[@value=\"*\"]"));
        WebElement btn_9 = driver.findElement(By.xpath("//button[@value=\"9\"]"));
        WebElement equalss = driver.findElement(By.xpath("//button[@id=\"resultButton\"]"));
        btn_8.click();
        btn_perkalian.click();
        btn_9.click();
        equalss.click();
        String hasil = driver.findElement(By.xpath("//div[@id=\"output\"]")).getText();
        hasil = hasil.replaceAll("\\D+","");
        int hasil1 = Integer.parseInt(hasil);
        System.out.println(hasil1);
        Assert.assertEquals(72,hasil1);
    }
}
