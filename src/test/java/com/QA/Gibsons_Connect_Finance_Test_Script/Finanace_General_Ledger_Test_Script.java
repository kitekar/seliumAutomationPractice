package com.QA.Gibsons_Connect_Finance_Test_Script;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.QA.Gibsons_Connect.Config.Constant;
import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;
import com.QA.Gibsons_Connect_Finance.Finanace_General_Ledger_Base_Page;
import com.QA.Gibsons_Connect_Orders.LogIn_Base_Page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Finanace_General_Ledger_Test_Script  extends Generic_Service
{
	LogIn_Base_Page loginbasePage;
	Generic_Service generic;
	Finanace_General_Ledger_Base_Page ledgbase;
	
	 
	public Finanace_General_Ledger_Test_Script()
	{
		super();
	}
	public static ExtentReports extent;
	public static ExtentTest test;

	
	@BeforeSuite
	public void beforeSuite() 
	{
		extent = new ExtentReports("./Reports/AutomationTesting.html", true);

		extent.loadConfig(new File("./extent-config.xml"));

	}

	@AfterSuite
	public void afterSuite()
	{
		extent.flush();
		extent.close();

	}

	@BeforeMethod
	public void beforeMethod(Method method)
	{
		test = extent.startTest(this.getClass().getSimpleName() + " :: " + method.getName(), method.getName());

	}

	@BeforeClass
	public void setUpForLogInToApplication() throws InvalidFormatException, IOException {
		selectBrowser();
		loginbasePage = new LogIn_Base_Page();
		generic = new Generic_Service();
		loginbasePage.UrlOfGibsonsConnect();
		ledgbase=new Finanace_General_Ledger_Base_Page();
		String Username = Constant.username_gibsonConnect;
		String Password = Constant.password_gibsonConnect;
		System.out.println(Username);
		System.out.println(Password);

		loginbasePage.GibsonsConnectLogInToApp(Username, Password);
		loginbasePage.loginButton();

	}

	

	@Test
	public void Invoice() 

	{   

	
		ledgbase.NavigateToFinance();
		ledgbase.createLedgerEntry();
		ledgbase.createBatchPaymnet();
		ledgbase.EditBatchPayment();
		ledgbase.printBatchPayment();
		
		
			
	
	}



	@AfterClass

	public void AfterAllMethods()
	{
		
		driver.close();
		driver.quit();
	}
	
	




	
}
