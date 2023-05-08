package com.usercreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webages.*;

public class User_Creation 
{
	WebDriver driver;
	
	Landing_WebPages landingWebPages = new Landing_WebPages(driver);
	SignUp_WebPages signUpWebPages = new SignUp_WebPages(driver);
	
	String url = "https://www.utilsupfut.com/";
	
	public User_Creation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void getSuperFutureUrl_ChromeBrowser()
	{
		//setting up the Chrome driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Documents\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		
		//trying to launch SF Website
		driver.get(url);
	}
	
	public void userSignup()
	{
		//click and choose sign-up button on SF landing page
		landingWebPages.clickSignUp_Button();
		
		//fill up all the required fields
		signUpWebPages.
	}
}
