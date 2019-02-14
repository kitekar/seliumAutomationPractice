package com.facebook.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.Page.Masterpage;

public class LoginPage extends Masterpage {
	//login, signup, create page, change language, forget password
	
		WebDriver driver = new FirefoxDriver();
		
		public LoginPage()
		{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		}
		public boolean doLogin()
		{
			//username
			sendKeys("EmailOrPhone_txtBox","seleniumforsure@gmail.com");
			//password
			sendKeys("Password_txtBox","Password_123");
			
			//click on login button
			click("Login_Btn");
			return (isLinkPresent("Home_Link"));
			
		}
		
		public void signUp()
		{
			
		}
}