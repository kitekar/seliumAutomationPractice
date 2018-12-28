package com.QA.Gibsons_Connect_Order_Test_Script;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QA.Gibsons_Connect.Config.Constant;
import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;

import com.QA.Gibsons_Connect_Orders.LogIn_Base_Page;
import com.QA.Gibsons_Connect_Orders.MavyValeLime_BasePage;

public class MaryvaleLimeOrder_Test_Script  extends Generic_Service
{
	LogIn_Base_Page loginbasePage;
	Generic_Service generic;
	MavyValeLime_BasePage maryvalebase;
	
	public MaryvaleLimeOrder_Test_Script()
	{
		super();
	}
	

	@BeforeMethod
	public void setUpForLogInToApplication() throws InvalidFormatException, IOException
	{
		selectBrowser();
		loginbasePage = new LogIn_Base_Page();
		generic = new Generic_Service();
		loginbasePage.UrlOfGibsonsConnect();
	    maryvalebase=new MavyValeLime_BasePage();
	    String Username = Constant.username_gibsonConnect;
		String Password = Constant.password_gibsonConnect;
		System.out.println(Username);
		System.out.println(Password);
	
		loginbasePage.GibsonsConnectLogInToApp(Username, Password);
		loginbasePage.loginButton();

	}
	
	@Test
	public void DarrimanLimeOrder() throws InvalidFormatException, IOException, AWTException, InterruptedException

	{   
		maryvalebase.NavigateToOrders();
		maryvalebase.CreateMaryvaleLimeOrder();
		maryvalebase.EditMaryvaleLimeOrder();
		maryvalebase.assignMaryvaleLimeOrder();
		maryvalebase.CreateMixTicketsMaryvaleOrder();
	    
	}
	
	
	


	@AfterMethod

	public void AfterAllMethods()
	{
		
		driver.close();
		driver.quit();
	}
	}
	
	



