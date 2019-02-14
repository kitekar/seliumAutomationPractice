package com.facbook.Testcases;

import org.testng.annotations.Test;

import com.facebook.Pages.LoginPage;

public class LoginTestcase {

	@Test
	public void loginTest()
	{
	
		if(ExcelReadingUtility.isTestRunnable("LoginTestCase"))
		LoginPage lp= new LoginPage();
		Assert.assetTrue(lp.doLogin();
		
		
		
	}

}
