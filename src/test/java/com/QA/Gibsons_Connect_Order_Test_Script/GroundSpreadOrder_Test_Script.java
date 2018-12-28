package com.QA.Gibsons_Connect_Order_Test_Script;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.QA.Gibsons_Connect.Config.Constant;
import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;
import com.QA.Gibsons_Connect_Orders.DarrimanLimeBasePage;
import com.QA.Gibsons_Connect_Orders.GroundSpreadOders_Base_Page;
import com.QA.Gibsons_Connect_Orders.LogIn_Base_Page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class GroundSpreadOrder_Test_Script extends Generic_Service
	{
		LogIn_Base_Page loginbasePage;
		Generic_Service generic;
		GroundSpreadOders_Base_Page groundspreadbasepage;
		
		public GroundSpreadOrder_Test_Script()
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
		public void setUpForLogInToApplication() throws InvalidFormatException, IOException 
		{
			selectBrowser();
			loginbasePage = new LogIn_Base_Page();
			generic = new Generic_Service();
			loginbasePage.UrlOfGibsonsConnect();
			groundspreadbasepage=new GroundSpreadOders_Base_Page();
			String Username = Constant.username_gibsonConnect;
			String Password = Constant.password_gibsonConnect;
			System.out.println(Username);
			System.out.println(Password);

			loginbasePage.GibsonsConnectLogInToApp(Username, Password);
			loginbasePage.loginButton();

		}


	
	
		@Test(priority=1)
		public void GroundSpreadOrder() throws InvalidFormatException, IOException, AWTException, InterruptedException

		{   

		System.out.println("Ground spread Page");
		groundspreadbasepage.NavigateToOrders();
		groundspreadbasepage.CreatenewGroundSpreadOrder();
		groundspreadbasepage.editGroundspreadOrder();
		groundspreadbasepage.assignGroundspreadOrder();
		groundspreadbasepage.CreateMixticketGroundspreadOrder();
		    
		    
		}
		
		@Test(dependsOnMethods={"GroundSpreadOrder"})
		
	//	@Test(priority=2)
		
		public void CompleteGroundspreadOrder() throws InvalidFormatException, IOException
		{
				
			generic.OpenUrlInNewTab(driver,Constant.GibsonstConnectruckie_url);
			String Username = Constant.username_truckie;
			String Password = Constant.password_truckie;
			System.out.println(Username);
			System.out.println(Password);
			loginbasePage.GibsonsConnectLogInToTrukieApp(Username, Password);
			loginbasePage.loginButtonTrukie();
			generic.ExplicitWait(8);
			
			groundspreadbasepage.trukieComplete1stJobGroundspreadorder();
			
			groundspreadbasepage.trukieComplete2ndJobGroundspreadorder();
			
		}
	
	


		@AfterMethod

		public void AfterAllMethods()
		{
			
			driver.close();
			driver.quit();
		}
		}
		
		

