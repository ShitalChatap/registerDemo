package com.automation.registerDemo;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegisterPageBean {
	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	private WebElement firstname;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	private WebElement lastname;
	@FindBy(how = How.XPATH, using = "//textarea[@ng-model='Adress']")
	private WebElement address;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='EmailAdress']")
	private WebElement email;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='Phone']")
	private WebElement phoneno;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='radiovalue'][1]")
	private WebElement radiobtn;
	@FindBy(how = How.ID, using = "checkbox1")
	private WebElement checkbox;
	@FindBy(how = How.ID, using = "msdd")
	private WebElement langdd;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Arabic']")
	private WebElement selectlang;
	@FindBy(how = How.ID, using = "Skills")
	private WebElement selectskills;
	@FindBy(how = How.XPATH, using = "//span[@aria-labelledby='select2-country-container']")
	private WebElement selectcountries;
	@FindBy(how = How.XPATH, using = "//input[@type='search']")
	private WebElement searchcount;
	
	public void setSelectcountries(String country) throws InterruptedException {
		this.selectcountries.click();
		Thread.sleep(1000);
		this.searchcount.sendKeys(country);
		this.searchcount.click();
		
	}
	public void setSelectskills() {
		Select se=new Select(this.selectskills);
		se.selectByIndex(10);
	}
	public void setSelectlang(WebElement selectlang) {
		this.selectlang = selectlang;
	}
	public String getFirstname() {
		return firstname.getText();
	}
	public void setFirstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}
	public String getLastname() {
		return lastname.getText();
	}
	public void setLastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}
	public String getAddress() {
		return address.getText();
	}
	public void setAddress(String address) {
		this.address.sendKeys(address);
	}
	public String getEmail() {
		return email.getText();
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public String getPhoneno() {
		return phoneno.getText();
	}
	public void setPhoneno(String phoneno) {
		this.phoneno.sendKeys(phoneno);
	}
	public void setRadiobtn() {
		this.radiobtn.click();;
	}
	public String getCheckbox() {
		return checkbox.getText();
	}
	public void setCheckbox() throws InterruptedException {
		this.checkbox.click();
	}
	public String getLangdd() {
		return langdd.getText();
	}
	public void setLangdd() throws InterruptedException {
		this.langdd.click();;
		Thread.sleep(3000);
		this.selectlang.click();
	}	
	
}
