package com.facebook.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.Page.Masterpage;

public class LoginPage extends Masterpage {
	//login, signup, create page, change language, forget password,Validation on login page.
	
	
	WebDriver driver;
	
	public void doLogin()
	{
	try{
		System.out.println("Hi Team");
		
	//Username
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pramodkitekar@gmail.com");}
	catch(Exception e){
	//Password
		System.out.println(e.getMessage());
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("22323233");
	}
	//Click on login button.
	
	}
	
	public void signUp()
	{
		
	}
}