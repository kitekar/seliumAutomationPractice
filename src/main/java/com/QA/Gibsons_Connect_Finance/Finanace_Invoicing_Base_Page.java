package com.QA.Gibsons_Connect_Finance;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;
import com.QA.Gibsons_Connect_Finance_Test_Script.Finanace_General_Ledger_Test_Script;
import com.relevantcodes.extentreports.ExtentReports;

public class Finanace_Invoicing_Base_Page extends Generic_Service
{

	String filepath="./ExcelFile/Gibsons_Connect_TestData.xlsx";
	String sheetname="GroundSpreadorder";
	
	
	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='ledgerEntryId']/span")
	private WebElement FinanaceMenuBar;
	

	Generic_Service generic=new Generic_Service();
	

	public Finanace_Invoicing_Base_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToFinance()


	{  
		
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		FinanaceMenuBar.click();
	
	}
	
	@FindBy(xpath="//div[@id='currentButton']")
	private WebElement FinanaceInvoicingCurrentButton;
	
	
	
	@FindBy(xpath="//div[contains(text(),'Back')]")
	private WebElement FinanaceInvoicingCurrentBackButton;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[1]")
	private WebElement FinanaceInvoicingOrderTypeDropDown;
	
	
	@FindBy(xpath="//ul[@id='orderType_listbox']/li[3]")
	private WebElement FinanaceInvoicingOrderTypeGroundspread;
	
	
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement FinanaceInvoicingDepotType;
	
	@FindBy(xpath="//ul[@id='depots_listbox']/li[1]")
	private WebElement FinanaceInvoicingDepotTypeAsAll;
	
	
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement FinanaceInvoicingChooseStatusDropdown;
	
	
	@FindBy(xpath="//ul[@id='status_listbox']/li[1]")
	private WebElement FinanaceInvoicingStatusAsRedayToInvoivce;
	
	
	@FindBy(xpath="//ul[@id='status_listbox']/li[2]")
	private WebElement FinanaceInvoicingStatusAsInvoiced;
	
	
	@FindBy(xpath="(//button[@class='btn btn-primary k-button'])[1]")
	private WebElement FinanaceInvoicingStatusAsInvoicedView;
	
	
	
	
	
	
	@FindBy(xpath="(//td[@role='gridcell']/input)[1]")
	private WebElement FinanaceInvoicingTicketChcekbox;
	
	
	@FindBy(xpath="//input[@id='selectAllReady']")
	private WebElement FinanaceInvoicingTicketChcekboxSelectAll;
	
	
	
	@FindBy(xpath="(//button[@class='btn btn-primary k-button viewbtni'])[1]")
	private WebElement FinanaceInvoicingViewIcon;
	
	
	@FindBy(xpath="//div[contains(text(),'Back')]")
	private WebElement FinanaceInvoicingAfterViewBack;
	
	
	
	
	@FindBy(xpath="//div[contains(text(),'Generate Invoice')]")
	private WebElement FinanaceInvoicingInvoiceGenerateInvoice;
	
	
	
	@FindBy(xpath="//div[@id='genInvoices']")
	private WebElement FinanaceInvoicingINVOICEGenerateInvoices;
	
	
	
	@FindBy(xpath="//div[contains(text(),'Back')]")
	private WebElement FinanaceInvoicingINVOICEDBack;
	
	
	@FindBy(xpath="(//div[@class='k-button dashboarddeletebtn'][contains(text(),'No')])[1]")
	private WebElement FinanaceInvoicingAre_you_sure_you_want_to_continueNo;
	
	
	@FindBy(xpath="(//div[@class='btn btn-primary k-button'])[5]")
	private WebElement FinanaceInvoicingAre_you_sure_you_want_to_continueYes;
	
	
	@FindBy(xpath="//div[contains(text(),'Print Invoices')]")
	private WebElement FinanaceInvoicingPopup_print_invoice;
	
	@FindBy(xpath="//div[@class='k-button dashboarddeletebtn'][contains(text(),'OK')]")
	private WebElement FinanaceInvoicingPopup_print_invoiceok;
	
	

	@FindBy(xpath="//div[@class='btn btn-primary k-button button-align']")
	private WebElement FinanaceInvoicingStatusAsInvoicedChcekOff;
	
	
	
	@FindBy(xpath="(//div[@class='button-margin'])[6]/div[2]")
	private WebElement FinanaceInvoicingStatusAsInvoiced_you_want_to_checkoffYes;
	
	
	
	@FindBy(xpath="(//div[@class='button-margin'])[6]/div[1]")
	private WebElement FinanaceInvoicingStatusAsInvoiced_you_want_to_checkoffNo;
	
	
	
	
	@FindBy(xpath="//input[@value='current']")
	private WebElement FinanaceInvoicingStatusAsInvoicedDispatch_Invoices_via_emailCheckbox;
	
	
	
	@FindBy(xpath="//div[contains(text(),'Back')]")
	private WebElement FinanaceInvoicingInvoicedPageBack;
	
	
	
	
	
	
	
	public void invoicingCurrentTab()
	
	{
		generic.ExplicitWait(3);
		FinanaceInvoicingCurrentButton.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingCurrentBackButton.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingCurrentButton.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingOrderTypeDropDown.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingOrderTypeGroundspread.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingDepotType.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingDepotTypeAsAll.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingChooseStatusDropdown.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingStatusAsRedayToInvoivce.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingTicketChcekbox.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingViewIcon.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingAfterViewBack.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingTicketChcekbox.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingInvoiceGenerateInvoice.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingAre_you_sure_you_want_to_continueNo.click();
	
		generic.ExplicitWait(3);
		FinanaceInvoicingInvoiceGenerateInvoice.click();
		generic.ExplicitWait(3);
		
		FinanaceInvoicingAre_you_sure_you_want_to_continueYes.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingPopup_print_invoice.click();
		generic.ExplicitWait(5);
		
		Set <String> set1=driver.getWindowHandles();
		Iterator <String> win1=set1.iterator();
		String parent=win1.next();
		String child=win1.next();
		driver.switchTo().window(child);
		driver.close();
		driver.switchTo().window(parent);
		
		generic.ExplicitWait(3);
		
		FinanaceInvoicingChooseStatusDropdown.click();
		generic.ExplicitWait(3);
		FinanaceInvoicingStatusAsInvoiced.click();
		generic.ExplicitWait(3);
		
		
		generic.ExplicitWait(3);
		FinanaceInvoicingStatusAsInvoicedView.click();
		generic.ExplicitWait(4);
		
		FinanaceInvoicingINVOICEDBack.click();
		generic.ExplicitWait(4);
		
		FinanaceInvoicingStatusAsInvoicedView.click();
		generic.ExplicitWait(3);
		
		
		FinanaceInvoicingStatusAsInvoicedChcekOff.click();
		
		generic.ExplicitWait(4);
		
		FinanaceInvoicingStatusAsInvoiced_you_want_to_checkoffNo.click();
		
		generic.ExplicitWait(3);
		FinanaceInvoicingStatusAsInvoicedChcekOff.click();
		
		generic.ExplicitWait(3);
		FinanaceInvoicingStatusAsInvoicedDispatch_Invoices_via_emailCheckbox.click();
		
		generic.ExplicitWait(3);
		FinanaceInvoicingStatusAsInvoiced_you_want_to_checkoffYes.click();
		
		generic.ExplicitWait(5);
		
		FinanaceInvoicingInvoicedPageBack.click();
		
		generic.ExplicitWait(5);
		
	}
	
	
	@FindBy(xpath="//div[@id='archivedButton']")
	private WebElement FinanaceInvoicingArchievedButton;  
	  

	@FindBy(xpath="(//button[@class='btn btn-primary k-button'])[1]")
	private WebElement FinanaceInvoicingArchievedView;
	
	
	
	@FindBy(xpath="//div[contains(text(),'Back')]")
	private WebElement FinanaceInvoicingArchievedViewBack;
	
	
	@FindBy(xpath="//div[@class='k-button dashboarddeletebtn']")
	private WebElement FinanaceInvoicingArchievedInvoicePageBack;
	
	
	
        public void invoicingArchivedTab()
        
         {
		generic.ExplicitWait(4);
		FinanaceInvoicingArchievedButton.click();
		generic.ExplicitWait(4);
		FinanaceInvoicingOrderTypeDropDown.click();
		generic.ExplicitWait(4);
		FinanaceInvoicingOrderTypeGroundspread.click();
		generic.ExplicitWait(4);
		FinanaceInvoicingDepotType.click();
		generic.ExplicitWait(4);
		FinanaceInvoicingDepotTypeAsAll.click();
		generic.ExplicitWait(4);
		FinanaceInvoicingArchievedView.click();
		generic.ExplicitWait(4);
		FinanaceInvoicingArchievedViewBack.click();
		generic.ExplicitWait(4); 
		FinanaceInvoicingArchievedInvoicePageBack.click();	  
		generic.ExplicitWait(4); 
        	  
          }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	  }	

