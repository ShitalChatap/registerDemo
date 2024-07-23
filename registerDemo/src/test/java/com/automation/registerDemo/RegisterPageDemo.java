package com.automation.registerDemo;

import org.testng.annotations.Test;

import com.github.driverfactory.DriverFactory;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class RegisterPageDemo {
	private WebDriver driver;
	private RegisterPageBean pagebean;
  @Test
  public void RegisterPage() throws InterruptedException {
	  pagebean.setFirstname("Ram");
	  pagebean.setLastname("Shyam");
	  pagebean.setAddress("Rajasthan");
	  pagebean.setEmail("ram@gmail.com");
	  pagebean.setPhoneno("9833388849");
	  pagebean.setRadiobtn();
	  Thread.sleep(3000);
	  pagebean.setCheckbox();
	  Thread.sleep(3000);
	  pagebean.setLangdd();
	  pagebean.setSelectskills();
	  Thread.sleep(2000);
	  pagebean.setSelectcountries("India");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriver driver=DriverFactory.getDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		pagebean=PageFactory.initElements(driver,RegisterPageBean.class);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
