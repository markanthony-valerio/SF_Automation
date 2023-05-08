package com.webages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp_WebPages 
{
	WebDriver driver;
	
	By username_Field = By.xpath("//*[@id=\"username\"]/div/input");
	By email_Field = By.xpath("//*[@id=\"email\"]/div/input");
	By password_Field = By.xpath("//*[@id=\"password\"]/div/input");
	By confirmPassword_Field = By.xpath("//*[@id=\"confirm-password\"]/div/input");
	By termsAndCondition_TickBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/div/div/div[5]/div/div/div/div[1]/div/label/div[1]");
	
	public SignUp_WebPages(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void fillUsername_Field(String username)
	{
		driver.findElement(username_Field).sendKeys(username);
	}
	
	public void fillEmail_Field(String email)
	{
		driver.findElement(email_Field).sendKeys(email);
	}
	
	public void fillPassword_Field(String password)
	{
		driver.findElement(password_Field).sendKeys(password);
	}
	
	public void fillConfirmPassword_Field(String confirmPassword)
	{
		driver.findElement(confirmPassword_Field).sendKeys(confirmPassword);
	}
	
	public void accetTermsAndCondition_Tickbox()
	{
		driver.findElement(termsAndCondition_TickBox).click();
	}
	
	
	
	
	
	
}
