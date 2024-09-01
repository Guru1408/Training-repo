package com.seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locwithbuttons{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\CHERRY\\OneDrive\\Desktop\\Training\\Seleniumtest\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				// Open the Udemy login page
		        driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F");

		        // Task 1: Check if the 'Remember Me' checkbox is selected, if not, select it
		        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @name='remember']"));
		        if (!checkbox.isSelected()) {
		            checkbox.click();
		        }
		        System.out.println("Remember Me checkbox selected: " + checkbox.isSelected());

		        // Enter email
		        driver.findElement(By.id("email")).sendKeys("charang1810@gmail.com");

		        // Enter password
		        driver.findElement(By.name("password")).sendKeys("Charan@1810");

		        // Task 2: Check if the 'Forgot Password?' link is present and click it
		        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
		        if (forgotPasswordLink.isDisplayed()) {
		            forgotPasswordLink.click();
		            System.out.println("Clicked on Forgot Password link.");
		        }

		        // Close the driver
		        driver.quit();
		    }
		}