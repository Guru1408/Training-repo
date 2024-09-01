package com.seleniumtest;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

    public static void main(String[] args) {
        // Set up the WebDriver
        System.setProperty(
            "webdriver.chrome.driver",
            "C:\\Users\\CHERRY\\OneDrive\\Desktop\\Training\\Seleniumtest\\Drivers\\chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to UnitedHealthcare sign-in page
            driver.get("https://www.uhc.com/sign-in");

            // Introduce explicit wait to ensure the element is loaded
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

            // Use a modified XPath or other locator strategy to find the sign-in button
            WebElement signInButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, 'signin-button')]"))
            );
            signInButton.click();

            // Continue with the rest of your script

            // Enter username
            driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("exampleuser@email.com");

            // Enter password
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("examplepassword");

            // Click on "Forgot username?" link
            driver.findElement(By.xpath("//a[contains(text(), 'Forgot username?')]")).click();

            // Go back to the previous page
            driver.navigate().back();

            // Click on "Forgot password?" link
            driver.findElement(By.xpath("//a[contains(text(), 'Forgot password?')]")).click();

            // Go back to the main sign-in page
            driver.navigate().to("https://www.uhc.com/sign-in");

            // Click on "Register now" button
            driver.findElement(By.xpath("//a[contains(@class, 'register-button') and contains(text(), 'Register now')]")).click();

            // Click on "Find your plan to get started" button
            driver.findElement(By.xpath("//button[contains(text(), 'Find your plan to get started')]")).click();

            // Click on "Employer" option
            driver.findElement(By.xpath("//button[contains(text(), 'Employer')]")).click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}