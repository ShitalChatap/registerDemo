package com.github.driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hemantt\\Downloads\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setBinary("C:\\Users\\hemantt\\Downloads\\chrome-win64\\chrome.exe");
	options.addArguments("disable-infobars");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//driver.get("https://www.google.co.in/");
	System.out.println("Browser opened");
	return driver;
}
}
