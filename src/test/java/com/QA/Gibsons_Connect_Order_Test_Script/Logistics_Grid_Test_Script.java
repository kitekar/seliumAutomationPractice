package com.QA.Gibsons_Connect_Order_Test_Script;

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
import com.QA.Gibsons_Connect_Orders.LogIn_Base_Page;
import com.QA.Gibsons_Connect_Orders.Logistics_Grid_Base_Page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Logistics_Grid_Test_Script extends Generic_Service
{
	
	LogIn_Base_Page loginbasePage;
	Generic_Service generic;
	Logistics_Grid_Base_Page logiscticsgridebase;
	
	public Logistics_Grid_Test_Script()
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
		logiscticsgridebase= new Logistics_Grid_Base_Page();
		String Username = Constant.username_gibsonConnect;
		String Password = Constant.password_gibsonConnect;
		System.out.println(Username);
		System.out.println(Password);

		loginbasePage.GibsonsConnectLogInToApp(Username, Password);
		loginbasePage.loginButton();

	}



@Test
public void LogisticsGridnpage() throws InvalidFormatException, IOException

{   logiscticsgridebase.NavigateToLogoisticsGrid();
    logiscticsgridebase.EditTicketsInNotChekoffStatus();
    logiscticsgridebase.DownloadSummaryReportInNotChekoffStatus();
    logiscticsgridebase.DownloadSummaryReportForCompanyChekoffStatus();
    logiscticsgridebase.DownloadSummaryReportForCompanyNotChekoffStatus();
    logiscticsgridebase.EditticketsinstatusCheckoff();
    logiscticsgridebase.SelectTicketsToCheckoff();
    
}


@AfterMethod

public void AfterAllMethods()
{
	
	driver.close();
	driver.quit();
}


}
