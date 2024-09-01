package com.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advlocators {

    public static void main(String[] args) {
        // Set up the WebDriver
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\CHERRY\\OneDrive\\Desktop\\Training\\Seleniumtest\\Drivers\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();

        // Open the Udemy login page
        driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");

        // Using child axis to select the email input field
        driver.findElement(By.xpath("//div[@class='ud-main-content']/child::input[1]")).sendKeys("charang1810@gmail.com");

        // Using following-sibling to enter the password
        driver.findElement(By.xpath("//input[@id='email--1']/following-sibling::input")).sendKeys("Charan@1810");

        // Using preceding-sibling to check the 'Remember Me' checkbox
        driver.findElement(By.xpath("//input[@type='checkbox']/preceding-sibling::label")).click();

        // Using preceding to interact with elements before a certain label
        driver.findElement(By.xpath("//label[text()='Password']/preceding::input[1]")).sendKeys("Charan@1234");

        // Using following to enter a value in the password field
        driver.findElement(By.xpath("//label[text()='Password']/following::input[1]")).sendKeys("mypassword123");

        // Using descendant to click the login button within a container
        driver.findElement(By.xpath("//div[@class='ud-main-content']/descendant::button[2]")).click();

        // Close the driver
        driver.quit();
    }
}