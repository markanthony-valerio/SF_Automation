package com.webages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landing_WebPages 
{
	WebDriver driver;
	
	By signUp_Button = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/button[1]");
	By logIn_Button = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/button[2]");
	
	public Landing_WebPages(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickSignUp_Button()
	{
		driver.findElement(signUp_Button).click();
	}
	
	public void clickLogin_Button()
	{
		driver.findElement(logIn_Button).click();
	}

}
