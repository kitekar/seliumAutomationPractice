package com.facbook.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.facebook.Page.Masterpage;

public class LandingPage extends Masterpage {
	//like status, comment, search, find a friend, add story
	
	WebDriver driver = new FirefoxDriver();
	public LandingPage()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void likestatus()
	{
		System.out.println("Like status method");
	}
	

}
