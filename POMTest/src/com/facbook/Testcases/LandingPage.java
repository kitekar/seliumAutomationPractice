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
		super();
	}
	public void likestatus()
	{
		System.out.println("Like status method");
	}
	

}
