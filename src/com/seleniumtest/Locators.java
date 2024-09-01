package com.seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        // Set up the WebDriver
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\CHERRY\\OneDrive\\Desktop\\Training\\Seleniumtest\\Drivers\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
     // Open the Udemy login page
        driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");
        driver.manage().window().maximize();

        // Enter email using ID locator
        driver.findElement(By.id("email--1")).sendKeys("charang1810@gmail.com");

        // Enter password using Name locator
        driver.findElement(By.name("password")).sendKeys("Charan@1810");

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Click login button using XPath
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Close the driver
        driver.quit();
    }
}