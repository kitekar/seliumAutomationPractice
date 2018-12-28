package com.QA.Gibsons_Connect_Maintanance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mentenance_Base_Page {
	
	@FindBy(xpath="//div[contains(text(),'Add fault')]")
	private WebElement Addfault;

	@FindBy(xpath="//*[contains(text(),'Export to excel')]")
	private WebElement Exporttoexcel;
	
	@FindBy(xpath="//*[contains(text(),'Generate PDF')]")
	private WebElement GeneratePDF;
	
	@FindBy(xpath="//*[contains(text(),'Add to existing jobcard')]")
	private WebElement Addtoexistingjobcard;
	
	@FindBy(xpath="//*[contains(text(),'Create jobcard')]")
	private WebElement Createjobcard;
	
	@FindBy(xpath="//*[contains(text(),'Delete')]")
	private WebElement Delete;
	
	
	
	// .....................AddFault page..............//
	
	@FindBy(xpath="//*[@id='Breakdown_Division_RoleDiv']")
	private WebElement PriorityBreakdown;
	
	@FindBy(xpath="//*[@id='Major_Division_RoleDiv']")
	private WebElement PriorityMajor;
	
	@FindBy(xpath="//*[@id='Minor_Division_RoleDiv']")
	private WebElement PriorityMinor;
	
	@FindBy(xpath="//*[@id='Servicing_Division_RoleDiv']")
	private WebElement PriorityServicing;
	
	@FindBy(xpath="//*[@id='Parts_Division_RoleDiv']")
	private WebElement PriorityParts;
	
	@FindBy(xpath="//*[@id='Part1A']/div[2]/div")
	private WebElement Back;
	
	
	
	
	
	
}
