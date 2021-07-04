package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver = null;
	
	public WebDriver initialization()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Krutarth\\Selenium Files\\Offline Website\\Offline Website\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Krutarth/Selenium%20Files/Offline%20Website/Offline%20Website/index.html");
		return driver;
	}
}
