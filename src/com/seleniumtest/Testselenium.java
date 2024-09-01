package com.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\CHERRY\\OneDrive\\Desktop\\Training\\Seleniumtest\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				// Launch Website
				driver.get("http://www.radixsoft.net/");
	}

}
