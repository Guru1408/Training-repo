package com.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Advlocators {

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

            // Explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Click on "Member sign in" button
            WebElement signInButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, 'signin-button')]"))
            );
            signInButton.click();

            // Enter username (removed wait condition for simplicity)
            WebElement usernameField = driver.findElement(By.xpath("//input[@name='userLoginId']"));
            usernameField.sendKeys("exampleuser@email.com");

            // Enter password (removed wait condition for simplicity)
            WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
            passwordField.sendKeys("examplepassword");

            // Click on "Sign In" button
            WebElement signInSubmitButton = driver.findElement(By.xpath("//button[@type='submit' and contains(text(), 'Sign In')]"));
            signInSubmitButton.click();

            // Click on "Forgot username?" link
            WebElement forgotUsernameLink = driver.findElement(By.xpath("//a[contains(text(), 'Forgot username?')]"));
            forgotUsernameLink.click();

            driver.navigate().back();

            // Click on "Forgot password?" link
            WebElement forgotPasswordLink = driver.findElement(By.xpath("//a[contains(text(), 'Forgot password?')]"));
            forgotPasswordLink.click();

            driver.navigate().to("https://www.uhc.com/sign-in");

            // Click on "Register now" button
            WebElement registerNowButton = driver.findElement(By.xpath("//a[contains(@class, 'register-button') and contains(text(), 'Register now')]"));
            registerNowButton.click();

            // Click on "Find your plan to get started" button
            WebElement findPlanButton = driver.findElement(By.xpath("//button[contains(text(), 'Find your plan to get started')]"));
            findPlanButton.click();

            // Click on "Employer" option
            WebElement employerButton = driver.findElement(By.xpath("//button[contains(text(), 'Employer')]"));
            employerButton.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}