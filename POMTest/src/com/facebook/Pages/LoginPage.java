package com.facebook.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.Page.Masterpage;

public class LoginPage extends Masterpage {
	//login, signup, create page, chagne language, forget password
	
		WebDriver driver = new FirefoxDriver();
		public LoginPage()
		{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		}
		public void doLogin()
		{
			//username
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("seleniumforsure@gmail.com");
			//password
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password_123");
			//click on login button
			
		}
		
		public void signUp()
		{
			
		}
}