package com.facebook.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.Page.Masterpage;

public class LoginPage extends Masterpage {
	//login, signup, create page, change language, forget password
	
		WebDriver driver = new FirefoxDriver();
		
		public LoginPage() throws IOException
		{
		super();
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