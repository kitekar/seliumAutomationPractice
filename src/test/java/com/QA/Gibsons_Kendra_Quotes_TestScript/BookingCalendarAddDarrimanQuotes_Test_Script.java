package com.QA.Gibsons_Kendra_Quotes_TestScript;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QA.Gibsons_Connect.Config.Constant;
import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;

import com.QA.Gibsons_Connect_Orders.LogIn_Base_Page;
import com.QA.Gibsons_Kendra_BookingCalender_AddQuotes.Booking_CalenderAdd_Quotes_BasePage;

public class BookingCalendarAddDarrimanQuotes_Test_Script extends Generic_Service
{
	
	LogIn_Base_Page loginbasePage;
	Generic_Service generic;
	Booking_CalenderAdd_Quotes_BasePage quotescalebndar;
	
	public BookingCalendarAddDarrimanQuotes_Test_Script()
	{
		super();
	}
	

	@BeforeMethod
	public void setUpForLogInToApplication() throws InvalidFormatException, IOException
	{
		selectBrowser();
		loginbasePage = new LogIn_Base_Page();
		generic = new Generic_Service();
		loginbasePage.UrlOfGibsonsKendra();
		quotescalebndar=new Booking_CalenderAdd_Quotes_BasePage();
		String Username = Constant.username_Kendra;
		String Password = Constant.password_Kendra;
		System.out.println(Username);
		System.out.println(Password);
	
		loginbasePage.GibsonsConnectLogInKendra(Username,Password);
		loginbasePage.loginButtonKendra();

	}
	@Test
	public void BookingCalendarAddQuotesDarriman() throws InvalidFormatException, IOException, InterruptedException

	{   
		
		
		
		System.out.println("Login Successfully to Gibsons_Kendra");
		
		quotescalebndar.NavigateToBookings();
	    
		quotescalebndar.CreateDarrimanQuotesFromBookingClaendar();
		
	    
	    
	    
	}
	@Test(priority=2)
	public void BookingCalendarCancleDarriamnQuote()
	{
		
	System.out.println("Login Successfully to Gibsons_Kendra");
		
	quotescalebndar.NavigateToBookings();
	quotescalebndar.CancelDarrimanQuotesFromBookingClaendar();
		
		
	}

	@AfterMethod

	public void AfterAllMethods()
	{
		
		driver.close();
		driver.quit();
	}
	














}
