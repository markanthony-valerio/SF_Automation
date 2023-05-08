package com.webages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_WebPages 
{
	WebDriver driver;
	
	By username_Field = By.xpath("//*[@id=\"username\"]/div/input");
	By password_Field = By.xpath("//*[@id=\"password\"]/div/input");
	By login_Button = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/button");
	
	public Login_WebPages(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void fillUsername_Field(String username)
	{
		driver.findElement(username_Field).sendKeys(username);
	}
	
	public void fillPassword_Field(String password)
	{
		driver.findElement(password_Field).sendKeys(password);
	}
	
	public void clickLogin_button()
	{
		driver.findElement(login_Button).click();
	}
}
