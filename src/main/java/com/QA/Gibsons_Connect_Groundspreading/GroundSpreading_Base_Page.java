package com.QA.Gibsons_Connect_Groundspreading;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;

public class GroundSpreading_Base_Page extends Generic_Service
{

	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='Orders']")
	private WebElement OrdersMenuBar;
}
