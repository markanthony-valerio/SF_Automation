package com.usercreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webages.*;

public class User_Creation 
{
	WebDriver driver;
	
	Landing_WebPages landingWebPages = new Landing_WebPages(driver);
	SignUp_WebPages signUpWebPages = new SignUp_WebPages(driver);
	Login_WebPages loginWebPages = new Login_WebPages(driver);
	
	String url = "https://www.utilsupfut.com/";
	String username;
	String email;
	String password;
	String confirmPassword;
	
	public User_Creation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void testData_Setup(String username, String email, String password, String confirmPassword)
	{
		this.username = username;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	public void chromeBrowser_Setup()
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
		signUpWebPages.fillUsername_Field(username);
		signUpWebPages.fillEmail_Field(email);
		signUpWebPages.fillPassword_Field(password);
		signUpWebPages.fillConfirmPassword_Field(confirmPassword);
		
		//accept the terms and condition
		signUpWebPages.accetTermsAndCondition_Tickbox();
		
		//click sign up button
		signUpWebPages.clickSignUpButton();
	}
	
	public void userEmailVerificationAndCaptcha() throws InterruptedException
	{
		System.out.println("Please manually enter Email Verification and Captcha now!");
		Thread.sleep(200);
	}
	
	public void userLogin() throws InterruptedException
	{
		//fill up the credentials
		loginWebPages.fillUsername_Field(username);
		loginWebPages.fillPassword_Field(password);
		
		System.out.println("Please manually enter Captcha now!");
		Thread.sleep(100);
		
		loginWebPages.clickLogin_button();
	}
	
	public void accountInformationSetup()
	{
		
	}
}
