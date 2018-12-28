package com.QA.Gibsons_Connect_Quotes;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


public class Sales_Log_Base_Page extends Generic_Service
{
	
	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='quote']/span[1]")
	private WebElement QuotesMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[5]/ul/li[2]/a/span")
	private WebElement QuotesMenuBarSalesLog;
	

	
	Generic_Service generic=new Generic_Service();


	public Sales_Log_Base_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToSalesLog()
	{
		generic.ExplicitWait(5);
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		QuotesMenuBar.click();
		generic.ExplicitWait(5);
		QuotesMenuBarSalesLog.click();

		ToggleMenuBar.click();
		generic.ExplicitWait(5);

	}
	
	@FindBy(xpath="//div[@srname='SALES_LOG_WRITE']")
	private WebElement QuotesMenuBarSalesLogNewVisit;
	
	@FindBy(xpath="//input[@id='part1AAC']")
	private WebElement QuotesSalesLogSearchBar;
	
	@FindBy(xpath="//ul[@id='part1AAC_listbox']/li[4]")
	private WebElement QuotesSalesLogSearchBarAce3;
	
	@FindBy(xpath="//div[@id='part1A']//div[contains(@style,'float: left;')]//div[@style='clear: both; text-align: right;']//div[@class='btn btn-primary k-button']")
	private WebElement QuotesSalesLogGobutton;
	
	@FindBy(xpath="//span[@class='k-picker-wrap k-state-default k-state-hover']/span/span")
	private WebElement QuotesSalesLogDatePicker ;
	
	@FindBy(xpath="//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
	private WebElement QuotesSaleLogDeliveryCalenderFullIcon;

	@FindBy(xpath="//td[@class='k-today k-state-focused']/a")
	private WebElement QuotesSaleLogDeliveryCalenderFullIconTodaysfocausdate;
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[1]")
	private WebElement QuotesSaleLogNextVisitDropDown;
	
	@FindBy(xpath="//ul[@id='nextVisitDate_listbox']/li[5]")
	private WebElement QuotesSaleLogNextVisitSelect;
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement QuotesSaleLogVisitTypeDropdown;
	
	@FindBy(xpath="//div[@id='salesLogTypeId-list']/ul/li[3]")
	private WebElement QuotesSaleLogVisitTypeSelectFarm;
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement QuotesSaleLogBeenUsingDropdown;
	
	@FindBy(xpath="//div[@id='supplierBeenId-list']/ul/li[3]")
	private WebElement QuotesSaleLogBeenUsingSelectBrown;
	
	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	private WebElement QuotesSaleLogServiceDiscussed;
	
	@FindBy(xpath="//ul[@id='salesLogServiceId_listbox']/li[4]")
	private WebElement QuotesSaleLogServiceDiscussedSelectFarmmap;
	
	
	@FindBy(xpath="//textarea[@id='txtComments']")
	private WebElement QuotesSaleLogsCommentsSection;
	
	@FindBy(xpath="//input[@id='Checklist_0']")
	private WebElement QuotesSaleLogsChecklistWasanappointmentmade;
	
	@FindBy(xpath="//input[@id='Checklist_1']")
	private WebElement QuotesSaleLogsChecklistDidthecustomerorder;
	
	@FindBy(xpath="//input[@id='Checklist_2']")
	private WebElement QuotesSaleLogsChecklistDidthecustomersaytheywouldorder;
	
	@FindBy(xpath="//input[@id='Checklist_3']")
	private WebElement QuotesSaleLogsChecklistHasthecustomerbeenhappy;
	
	@FindBy(xpath="//input[@id='Checklist_4']")
	private WebElement QuotesSaleLogsChecklistHastherebeenaprobleminthepast;
	@FindBy(xpath="//input[@id='Checklist_5']")
	private WebElement QuotesSaleLogsChecklistWasapricegivenout;
	@FindBy(xpath="//input[@id='Checklist_6']")
	private WebElement QuotesSaleLogsChecklistWasasoiltestdone;
	@FindBy(xpath="//input[@id='Checklist_7']")
	private WebElement QuotesSaleLogsChecklistWereyoureturningasoiltest;
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Log Visit')]")
	private WebElement QuotesSaleLogsLogVisit;
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement QuotesSaleLogsMainPageDepotDropDown;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[1]")
	private WebElement QuotesSaleLogsMainPageAllSelect;
	
	
	public void LogNewVisit()
	{
		    QuotesMenuBarSalesLogNewVisit.click();
			generic.ExplicitWait(3);
			QuotesSalesLogSearchBar.sendKeys("ace");
			generic.ExplicitWait(3);
			QuotesSalesLogSearchBarAce3.click();
			generic.ExplicitWait(3);
			QuotesSalesLogGobutton.click();
			generic.ExplicitWait(3);
		    
		 QuotesSaleLogNextVisitDropDown.click();
		generic.ExplicitWait(3);
			
		QuotesSaleLogNextVisitSelect.click();
		generic.ExplicitWait(3);

		QuotesSaleLogVisitTypeDropdown.click();
		generic.ExplicitWait(3);

		QuotesSaleLogVisitTypeSelectFarm.click();
		generic.ExplicitWait(3);

		QuotesSaleLogBeenUsingDropdown.click();
		generic.ExplicitWait(3);

		QuotesSaleLogBeenUsingSelectBrown.click();
		generic.ExplicitWait(3);

		QuotesSaleLogServiceDiscussed.click();
		generic.ExplicitWait(3);

		QuotesSaleLogServiceDiscussedSelectFarmmap.click();
		generic.ExplicitWait(3);

		QuotesSaleLogsCommentsSection.sendKeys("A Good visit");
		
		QuotesSaleLogsChecklistWasanappointmentmade.click();
		generic.ExplicitWait(3);

		QuotesSaleLogsChecklistDidthecustomerorder.click();
		generic.ExplicitWait(3);

		QuotesSaleLogsChecklistDidthecustomersaytheywouldorder.click();

		QuotesSaleLogsChecklistHasthecustomerbeenhappy.click();
		generic.ExplicitWait(3);

		QuotesSaleLogsChecklistHastherebeenaprobleminthepast.click();
		generic.ExplicitWait(3);

		QuotesSaleLogsChecklistWasapricegivenout.click();
		generic.ExplicitWait(3);

		QuotesSaleLogsChecklistWasasoiltestdone.click();
		generic.ExplicitWait(3);

		QuotesSaleLogsChecklistWereyoureturningasoiltest.click();
		generic.ExplicitWait(3);

		
		QuotesSaleLogsLogVisit.click();
		generic.ExplicitWait(10);

	


}
	
	@FindBy(xpath="(//button[@class='fa-sign-in fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
	private WebElement QuotesSaleLogsMainPageLogVisitDetalis;
	
	
	@FindBy(xpath="//span[@class='gb-text-upperCase']")
	private WebElement QuotesSaleLogsMainPageLogVisitDetalisPageCaptureCompnyName;
	
	@FindBy(xpath="//span[@data-bind='text: salesman.userName']")
	private WebElement QuotesSaleLogsMainPageLogVisitDetalisPageCaptureSalesLogcreatedUserName;
	
	@FindBy(xpath="//span[@data-bind='text: creationDate']")
	private WebElement QuotesSaleLogsMainPageLogVisitDetalisPageCaptureSalesLogcreatedbyDate;
	
	@FindBy(xpath="//div[@class='btn btn-motif dashboarddeletebtn k-button']")
	private WebElement QuotesSaleLogsMainPageLogVisitDetalisPageBack;
	
	
	
	public void CaptureTheInformationOfNewLogVisit()
	{
		QuotesSaleLogsMainPageDepotDropDown.click();
		generic.ExplicitWait(3);


		QuotesSaleLogsMainPageAllSelect.click();
		generic.ExplicitWait(30);	
		
		 try {
		    
		  driver.findElement(By.xpath("(//button[@class='fa-sign-in fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")).click();
		 
		  } 
		 catch (TimeoutException e)
		 {
		      System.out.println("Page:did not load within 40 seconds!");
		   
		  }
		
	//generic.ExplicitWait(5);
	//QuotesSaleLogsMainPageLogVisitDetalis.click();
	generic.ExplicitWait(5);
	String saleslogcompnyname=QuotesSaleLogsMainPageLogVisitDetalisPageCaptureCompnyName.getText();
	System.out.println("Sale log of :"+saleslogcompnyname);
	generic.ExplicitWait(5);
	String saleslogUsername=QuotesSaleLogsMainPageLogVisitDetalisPageCaptureSalesLogcreatedUserName.getText();
	System.out.println("Sale log created by :"+saleslogUsername);
	generic.ExplicitWait(5);
	String saleslogDate=QuotesSaleLogsMainPageLogVisitDetalisPageCaptureSalesLogcreatedbyDate.getText();
	System.out.println("Sale log created by :"+saleslogDate);
	generic.ExplicitWait(5);
}
	
	public void CaptureTheInformationOfOldexistingLogVisit()
	{
		generic.ExplicitWait(5);
		QuotesSaleLogsMainPageLogVisitDetalis.click();
		generic.ExplicitWait(5);
		String saleslogcompnyname=QuotesSaleLogsMainPageLogVisitDetalisPageCaptureCompnyName.getText();
		System.out.println("Sale log of :"+saleslogcompnyname);
		generic.ExplicitWait(5);
		String saleslogUsername=QuotesSaleLogsMainPageLogVisitDetalisPageCaptureSalesLogcreatedUserName.getText();
		System.out.println("Sale log created by :"+saleslogUsername);
		generic.ExplicitWait(5);
		String saleslogDate=QuotesSaleLogsMainPageLogVisitDetalisPageCaptureSalesLogcreatedbyDate.getText();
		System.out.println("Sale log created On :"+saleslogDate);
		generic.ExplicitWait(5);
		QuotesSaleLogsMainPageLogVisitDetalisPageBack.click();
		generic.ExplicitWait(5);
		
		
	
}}
	
	
	
	
