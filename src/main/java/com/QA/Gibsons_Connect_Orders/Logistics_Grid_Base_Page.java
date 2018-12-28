package com.QA.Gibsons_Connect_Orders;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


public class Logistics_Grid_Base_Page extends Generic_Service
{

	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='Orders']")
	private WebElement OrdersMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[4]/ul/li[2]/a/span")
	private WebElement OrdersMenuBarLogistics;
	
	
	
	
	
     Generic_Service generic=new Generic_Service();
     
	public Logistics_Grid_Base_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToLogoisticsGrid()
	{
		
		
		    generic.ExplicitWait(5);
			ToggleMenuBar.click();
			generic.ExplicitWait(5);
			OrdersMenuBar.click();
			generic.ExplicitWait(5);
			OrdersMenuBarLogistics.click();
			generic.ExplicitWait(18);
			System.out.println("Navigate to Logistics grid page");
			ToggleMenuBar.click();
			generic.ExplicitWait(5);
		
	}
	
	@FindBy(xpath="(//span[@class='k-picker-wrap k-state-default']/span/span)[1]")
	private WebElement OrdersMenuBarLogistics_Grid_CalenderIcon;	
	
	@FindBy(xpath="(//div[@class='k-animation-container'])[1]/div/div")
	private WebElement OrdersMenuBarLogistics_Grid_CalenderFullIcon;	
	
	@FindBy(xpath="(//a[@class='k-link'])[32]")
	private WebElement OrdersMenuBarLogistics_Grid_Calenderpreviousdate;	
	
	
	
	@FindBy(xpath="//input[@id='part1AAC']")
	private WebElement OrdersMenuBarLogistics_Grid_Searchcustomer_bar_text;
	
	@FindBy(xpath="//ul[@id='part1AAC_listbox']/li[1]")
	private WebElement OrdersMenuBarLogistics_Grid_Searchcustomer_bar_CompanyName;
	

	@FindBy(xpath="//button[@id='searchCustomerOnLogistics']")
	private WebElement OrdersMenuBarLogistics_Grid_searchIcon;
	
	
	@FindBy(xpath="//div[@id='checkoffTickets']")
	private WebElement OrdersMenuBarLogistics_Grid_CheckOffTicketsButton;
	
	@FindBy(xpath="//button[@title='Clear Search']")
	private WebElement OrdersMenuBarLogistics_Grid_ClearIcon;
	
	
	@FindBy(xpath="//div[@id='btnexportPdf']")
	private WebElement OrdersMenuBarLogistics_Grid_Generatepdf;
	
	
	@FindBy(xpath="//div[@id='btnexportExcel']")
	private WebElement OrdersMenuBarLogistics_Grid_GenerateExcel;
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[7]")
	private WebElement OrdersMenuBarLogistics_Grid_Status_DropDown;
	
	@FindBy(xpath="//ul[@id='orderStatus_listbox']/li[2]")
	private WebElement OrdersMenuBarLogistics_Grid_Status_ChekOff;
	
	@FindBy(xpath="//ul[@id='orderStatus_listbox']/li[1]")
	private WebElement OrdersMenuBarLogistics_Grid_Status_NotChekOff;
	
	@FindBy(xpath="(//button[@class='btn btn-primary activateClass k-button'])[1]")
	private WebElement OrdersMenuBarLogistics_Grid_NotChekOff_Edit;
	
	@FindBy(xpath="//span[@data-bind='text:freightTotal.totalTonnage']")
	private WebElement OrdersMenuBarLogistics_Grid_Total_Tonnage;
	
	@FindBy(xpath="//span[@data-bind='text:freightTotal.totalIncomeFreight']")
	private WebElement OrdersMenuBarLogistics_Grid_Status_TotalIncome;
	
	
	@FindBy(xpath="(//button[@class='btn btn-primary k-button'])[1]")
	private WebElement OrdersMenuBarLogistics_Grid_Notcheckoff_View;
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button popup-button-right'][contains(text(),'OK')]")
	private WebElement OrdersMenuBarLogistics_Grid_View_Notcheckoff_Ok;
	
	@FindBy(xpath="(//button[@class='btn btn-primary activateClass k-button'])[1]")
	private WebElement OrdersMenuBarLogistics_Grid_Notcheckoff_Edit;
	
	@FindBy(xpath="//div[@class='k-button dashboarddeletebtn popup-button-left']")
	private WebElement OrdersMenuBarLogistics_Grid_Notcheckoff_Edit_Cancel;
	
	
	@FindBy(xpath="//input[@id='docketNumber']")
	private WebElement OrdersMenuBarLogistics_Grid_Edit_DocketNumber;
	
	
	
	@FindBy(xpath="//div[@id='modal-alert']//div[@class='modal-dialog']//div[@class='modal-content']//b//div[@class='modal-body']//ul")
	private WebElement OrdersMenuBarLogistics_Grid_Checkoff_Edit_update_Errormessage;
	
	@FindBy(xpath="//div[@id='modal-alert']//div[@class='modal-dialog']//div[@class='modal-content']//div[@class='modal-header']//button[@type='button']")
	private WebElement OrdersMenuBarLogistics_Grid_Checkoff_Edit_update_ErrormessageClose;
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button popup-button-right'][contains(text(),'Update')]")
	private WebElement OrdersMenuBarLogistics_Grid_Edit_Update;
	
	@FindBy(xpath="(//div[@class='btn btn-primary k-button'])[7]")
	private WebElement OrdersMenuBarLogistics_Grid_Edit_UpdateSuccessfullyOk;
	
	public void EditTicketsInNotChekoffStatus()
	{
		OrdersMenuBarLogistics_Grid_CalenderIcon.click();
		Actions act = new Actions(driver);

		act.clickAndHold(OrdersMenuBarLogistics_Grid_CalenderFullIcon);
		generic.ExplicitWait(10);

		OrdersMenuBarLogistics_Grid_Calenderpreviousdate.click();
		generic.ExplicitWait(5);
			
		
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Status_DropDown.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Status_NotChekOff.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Notcheckoff_View.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_View_Notcheckoff_Ok.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Notcheckoff_Edit.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Edit_DocketNumber.clear();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Edit_DocketNumber.sendKeys("5555");
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Edit_Update.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Edit_UpdateSuccessfullyOk.click();
		generic.ExplicitWait(5);
		System.out.println("Ticket is edited successfully");
		
	}
	
	public void DownloadSummaryReportInNotChekoffStatus()
	{
	generic.WebPageScrollDown(driver);
	generic.ExplicitWait(3);
	generic.WebPageScrollDown(driver);
		
	System.out.println("Total income is "+OrdersMenuBarLogistics_Grid_Status_TotalIncome.getText());
	System.out.println("Total Tonn is "+OrdersMenuBarLogistics_Grid_Total_Tonnage.getText());
	OrdersMenuBarLogistics_Grid_Generatepdf.click();
	generic.ExplicitWait(5);
	OrdersMenuBarLogistics_Grid_GenerateExcel.click();
	generic.ExplicitWait(5);
	System.out.println("Report is downloaded successfully for not checkoff status");
	
	
	}
	public void DownloadSummaryReportChekoffStatus()
	{
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Status_DropDown.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Status_ChekOff.click();
		generic.ExplicitWait(5);
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(3);
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(5);
		System.out.println("Total income is :"+OrdersMenuBarLogistics_Grid_Status_TotalIncome.getText());
		System.out.println("Total Tonn is :"+OrdersMenuBarLogistics_Grid_Total_Tonnage.getText());
		OrdersMenuBarLogistics_Grid_Generatepdf.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_GenerateExcel.click();
		generic.ExplicitWait(5);
		System.out.println("Report is downloaded successfully for checkoff status");
	}	
	
	public void DownloadSummaryReportForCompanyChekoffStatus()
	{
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Searchcustomer_bar_text.sendKeys("ACE OPERATIONS P/L 7");
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Searchcustomer_bar_text.sendKeys(Keys.ARROW_DOWN);
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Searchcustomer_bar_CompanyName.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_searchIcon.click();
		generic.ExplicitWait(5);
		System.out.println("Total income is :"+OrdersMenuBarLogistics_Grid_Status_TotalIncome.getText());
		System.out.println("Total Tonn is :"+OrdersMenuBarLogistics_Grid_Total_Tonnage.getText());
		OrdersMenuBarLogistics_Grid_Generatepdf.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_GenerateExcel.click();
		generic.ExplicitWait(5);
		System.out.println(" Selcted compny report is downloaded successfully for checkoff status");
		
	
	
	
}
	
	public void DownloadSummaryReportForCompanyNotChekoffStatus()
	{
	
	
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Status_DropDown.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Status_NotChekOff.click();
		generic.ExplicitWait(5);
		
		OrdersMenuBarLogistics_Grid_Generatepdf.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_GenerateExcel.click();
		generic.ExplicitWait(5);
		
		OrdersMenuBarLogistics_Grid_ClearIcon.click();
		generic.ExplicitWait(5);
		System.out.println(" Selcted compny report is downloaded successfully for not checkoff status");
	}
	
	@FindBy(xpath="(//span[@class='k-icon k-i-arrow-w'])[3]")
	private WebElement OrdersMenuBarLogistics_Grid_Calenderpreviousbutton;	
	
	@FindBy(xpath="(//td[5])[1]/a")
	private WebElement OrdersMenuBarLogistics_Grid_Calenderpreviousdate1march;	
	
	
	public void EditticketsinstatusCheckoff()
	{	
		
		
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_CalenderIcon.click();
		Actions act = new Actions(driver);

		act.clickAndHold(OrdersMenuBarLogistics_Grid_CalenderFullIcon);
		generic.ExplicitWait(10);

		OrdersMenuBarLogistics_Grid_Calenderpreviousbutton.click();
		generic.ExplicitWait(5);
		
		
		OrdersMenuBarLogistics_Grid_Calenderpreviousdate1march.click();
		generic.ExplicitWait(5);
		
		
		
			
		
	
		OrdersMenuBarLogistics_Grid_Status_DropDown.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Status_ChekOff.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Notcheckoff_Edit.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Edit_Update.click();
		generic.ExplicitWait(5);
	
		System.out.println("Error message: "+OrdersMenuBarLogistics_Grid_Checkoff_Edit_update_Errormessage.getText());
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Checkoff_Edit_update_ErrormessageClose.click();
		generic.ExplicitWait(5);
		System.out.println("checkoffed ticket cant be edited");
		
}
	@FindBy(xpath="(//input[@class='gb-dep-list-del-cb'])[1]")
	private WebElement OrdersMenuBarLogistics_Grid_Edit_SelectTicketToCheckOff;
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Yes')]")
	private WebElement OrdersMenuBarLogistics_Grid_Edit_SelectTicketToCheckOffYes;
	
	@FindBy(xpath="//form[@id='ticketChangedConfirmation']//div[@style='margin-left: 10%;margin-right: 10%;margin-bottom: 6%;']//div[@class='btn btn-primary k-button']")
	private WebElement OrdersMenuBarLogistics_Grid_Edit_SelectTicketToCheckOffYesOk;
	
	
	
	public void SelectTicketsToCheckoff()
	{

		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_CalenderIcon.click();
		Actions act = new Actions(driver);

		act.clickAndHold(OrdersMenuBarLogistics_Grid_CalenderFullIcon);
		generic.ExplicitWait(10);

		OrdersMenuBarLogistics_Grid_Calenderpreviousdate.click();
		generic.ExplicitWait(5);
		
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Status_DropDown.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Status_NotChekOff.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_Edit_SelectTicketToCheckOff.click();
		generic.ExplicitWait(5);
		OrdersMenuBarLogistics_Grid_CheckOffTicketsButton.click();
	    generic.ExplicitWait(5);
	   
	    OrdersMenuBarLogistics_Grid_Edit_SelectTicketToCheckOffYes.click();
	    generic.ExplicitWait(5);
	    OrdersMenuBarLogistics_Grid_Edit_SelectTicketToCheckOffYesOk.click();
	    generic.ExplicitWait(5);
	    System.out.println("Selected ticket is checoffed successfully");
	    
	
	}}


