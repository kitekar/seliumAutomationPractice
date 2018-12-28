
package com.QA.Gibsons_Connect_Finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;

public class Finanace_General_Ledger_Base_Page extends Generic_Service
{
	String filepath="./ExcelFile/Gibsons_Connect_TestData.xlsx";
	String sheetname="GroundSpreadorder";
	
	
	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='ledgerEntryId']/span")
	private WebElement FinanaceMenuBar;
	

	Generic_Service generic=new Generic_Service();
	
	
	public Finanace_General_Ledger_Base_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToFinance()


	{  
		
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		FinanaceMenuBar.click();
	
	}
	
	

	@FindBy(xpath="//div[@id='ledgerEntryButton']")
	private WebElement FinanaceGeneralLedgerLedgerEntryButton;
	
	
	@FindBy(xpath="//input[@id='part1AAC']")
	private WebElement FinanaceGeneralLedgerLedgerEntrySeachACustomerTextBOX;
	
	
	
	
	
	@FindBy(xpath="//div[@id='searchCustomerForOrderByDisplayNameButton']")
	private WebElement FinanaceGeneralLedgerLedgerEntrySeachACustomerTextBOXByDisplayName;
	
	
	@FindBy(xpath="//i[@class='fa fa-university']")
	private WebElement FinanaceGeneralLedgerLedgerEntrySeachACustomerTextBOXByCompanyName;
	
	
	@FindBy(xpath="//div[@class='k-button dashboarddeletebtn']")
	private WebElement FinanaceGeneralLedgerLedgerEntrySeachACustomerBackButton;
	
	
	@FindBy(xpath="//div[contains(text(),'Go')]")
	private WebElement FinanaceGeneralLedgerLedgerEntrySeachACustomerGoButton;
	
	@FindBy(xpath="//span[@class='k-icon k-i-calendar']")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerCalendarIcon;
	
	
	@FindBy(xpath="//td[@class='clask-today k-state-selected k-state-focused']")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerCalendarIconDateSelect;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[1]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerEntityDropdown;
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[2]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerEntitySelect;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerTypeDropdown;
	
	
	@FindBy(xpath="//ul[@id='creditTypeDropDown_listbox']/li[2]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerSelectCredit;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerEntryDescriptionDropdown;
	
	
	@FindBy(xpath="//ul[@id='LedgerDescriptionDropDown_listbox']/li[3]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerEntryDescriptionBatchPayment;
	
	
	
	@FindBy(xpath="//span[@class='k-numeric-wrap k-state-default k-expand-padding']//input[1]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerAmnountTextBox;
	
	
	
	@FindBy(xpath="//textarea[@name='noteDetail']")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerCommentBox;
	
	
	
	@FindBy(xpath="//div[@class='k-button dashboarddeletebtn popup-button-left']")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerCancelButton;
	
	
	@FindBy(xpath="//div[contains(text(),'Save')]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerSaveButton;
	
	
	
	@FindBy(xpath="//div[contains(text(),'OK')]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCreateLedgerSaveSuccessfullyOkbUtoon;

	
	
	
	
	
	@FindBy(xpath="//li[contains(text(),'ACE OPERATIONS P/L 17')]")
	private WebElement FinanaceGeneralLedgerLedgerEntryCustomerSelect;
	
	
	
	
	
	
	
	
	
	
	
	
	public void createLedgerEntry()
	
	{
		generic.ExplicitWait(2);
		FinanaceGeneralLedgerLedgerEntryButton.click();
		
		generic.ExplicitWait(2);
		FinanaceGeneralLedgerLedgerEntrySeachACustomerTextBOX.sendKeys("ace");
		generic.ExplicitWait(5);
		
		FinanaceGeneralLedgerLedgerEntryCustomerSelect.click();
		generic.ExplicitWait(3);
		
		FinanaceGeneralLedgerLedgerEntrySeachACustomerGoButton.click();
		generic.ExplicitWait(5);
		
	   //FinanaceGeneralLedgerLedgerEntryCreateLedgerCalendarIcon.click();
		//generic.ExplicitWait(3);
		
		//FinanaceGeneralLedgerLedgerEntryCreateLedgerCalendarIconDateSelect.click();
		//generic.ExplicitWait(3);
		
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerEntityDropdown.click();
		generic.ExplicitWait(5);
		
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerEntitySelect.click();
		generic.ExplicitWait(5);
		
		
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerTypeDropdown.click();
		generic.ExplicitWait(5);
		
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerSelectCredit.click();
		generic.ExplicitWait(5);
		
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerEntryDescriptionDropdown.click();
		generic.ExplicitWait(5);
		
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerEntryDescriptionBatchPayment.click();
		generic.ExplicitWait(5);
		
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerAmnountTextBox.sendKeys("10000");
		generic.ExplicitWait(5);
		
		
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerCommentBox.sendKeys("Finace Section Automation");
		generic.ExplicitWait(5);	
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerSaveButton.click();
		generic.ExplicitWait(4);
		
		
		
		
		FinanaceGeneralLedgerLedgerEntryCreateLedgerSaveSuccessfullyOkbUtoon.click();
		generic.ExplicitWait(4);
		
		
		
		FinanaceGeneralLedgerLedgerEntrySeachACustomerBackButton.click();
		generic.ExplicitWait(4);
		
		
		
		
	}
	
	//--------------------Batch Payment----------------------//
	
	
	@FindBy(xpath="//div[@id='batchPaymentButton']")
	private WebElement FinanaceGeneralLedgerBatchPaymentButton;
	
	
	
	@FindBy(xpath="//span[@class='k-icon k-i-calendar']")
	private WebElement FinanaceGeneralLedgerBatchPaymentCalendarIcon;
	
	
	@FindBy(xpath="//td[@class='k-today k-state-selected k-state-focused']")
	private WebElement FinanaceGeneralLedgerBatchPaymentTodaysDate;
	
	@FindBy(xpath="//span[@class='k-input']")
	private WebElement FinanaceGeneralLedgerBatchPaymentEntity;
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[4]")
	private WebElement FinanaceGeneralLedgerBatchPaymentEntitySelect;
	
	
	@FindBy(xpath="//span[@data-bind='text: batchNumber']")
	private WebElement FinanaceGeneralLedgerBatchPaymentCaptureBatchPayment;
	
	
	
	@FindBy(xpath="//div[@id='addNewBtn']")
	private WebElement FinanaceGeneralLedgerBatchPaymentAddNewButton;
	
	@FindBy(xpath="//i[@class='k-assign-delete fa g-icon fa-times']")
	private WebElement FinanaceGeneralLedgerBatchPaymentCloseIcon;
	
	@FindBy(xpath="//input[@id='op_1_1']")
	private WebElement FinanaceGeneralLedgerBatchPaymentCustomerTextBox;
	
	@FindBy(xpath="//ul[@id='op_1_1_listbox']//li[2]")
	private WebElement FinanaceGeneralLedgerBatchPaymentCustomerSelect;
	
	
	
	@FindBy(xpath="//div[@id='op_1_10']")
	private WebElement FinanaceGeneralLedgerBatchPaymentCustomerTextBoxClearIcon;
	
	@FindBy(xpath="//i[@class='fa fa-university']")
	private WebElement FinanaceGeneralLedgerBatchPaymentCustomerByCompanyIcon;
	
	@FindBy(xpath="//i[@class='fa fa-male']")
	private WebElement FinanaceGeneralLedgerBatchPaymentCustomerByDisplayIcon;
	
	@FindBy(xpath="//input[@id='op_1_2']")
	private WebElement FinanaceGeneralLedgerBatchPayment_Cheque_Name;
	
	@FindBy(xpath="//span[contains(text(),'Select One')]")
	private WebElement FinanaceGeneralLedgerBatchPayment_Bank_NameDropdown;
	
	@FindBy(xpath="//ul[@id='op_1_3_listbox']/li[5]")
	private WebElement FinanaceGeneralLedgerBatchPayment_Bank_NameSelect;
	
	
	@FindBy(xpath="//input[@id='op_1_4']")
	private WebElement FinanaceGeneralLedgerBatchPayment_Select_Branch_BSB;
	
	
	@FindBy(xpath="//span[@class='k-numeric-wrap k-state-default']/input[1]")
	private WebElement FinanaceGeneralLedgerBatchPayment_SelectAmount;
	
	@FindBy(xpath="//input[@id='op_1_6']")
	private WebElement FinanaceGeneralLedgerBatchPayment_SelectStatement_Note;
	
	
	@FindBy(xpath="//div[contains(text(),'Back')]")
	private WebElement FinanaceGeneralLedgerBatchPayment_SelectBackButton;
	
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button popup-button-right']")
	private WebElement FinanaceGeneralLedgerBatchPayment_SaveButton;
	
	
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button popup-button-right']")
	private WebElement FinanaceGeneralLedgerBatchPayment_SavePopUpOkButton;
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button']")
	private WebElement FinanaceGeneralLedgerBatchPayment_SavePopUpPrintButton;
	
	
	@FindBy(xpath="//div[@class='k-button dashboarddeletebtn button-align']")
	private WebElement FinanaceGeneralLedgerBatchPayment_SavePopUpBack;
		
	

public void createBatchPaymnet()
{
	
	
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPaymentButton.click();
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPaymentCalendarIcon.click();
	generic.ExplicitWait(4);

	FinanaceGeneralLedgerBatchPaymentTodaysDate.click();
	generic.ExplicitWait(4);
	String BatchNumber=FinanaceGeneralLedgerBatchPaymentCaptureBatchPayment.getText();
	System.out.println(BatchNumber);
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPaymentEntity.click();
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPaymentEntitySelect.click();
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPaymentAddNewButton.click();
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPaymentCustomerTextBox.sendKeys("ace");
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPaymentCustomerSelect.click();
	generic.ExplicitWait(4);
	//FinanaceGeneralLedgerBatchPayment_Cheque_Name.click();
	
	FinanaceGeneralLedgerBatchPayment_Bank_NameDropdown.click();
	
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPayment_Bank_NameSelect.click();
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPayment_Select_Branch_BSB.sendKeys("1245");
	
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPayment_SelectAmount.sendKeys("12000");
	
	
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPayment_SelectStatement_Note.sendKeys("Note");
	
	
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPayment_SaveButton.click();
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPayment_SavePopUpPrintButton.click();
	generic.ExplicitWait(4);
	FinanaceGeneralLedgerBatchPayment_SavePopUpBack.click();
	generic.ExplicitWait(4);

}


@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[1]")
private WebElement FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberDropdwon;



@FindBy(xpath="//li[contains(text(),'4560')]")
private WebElement FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberSelect;



@FindBy(xpath="//div[contains(text(),'Edit')]")
private WebElement FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberEditButton;



@FindBy(xpath="//div[contains(text(),'Update')]")
private WebElement FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberEditUpdateButton;


@FindBy(xpath="(//div[@class='btn btn-primary k-button popup-button-right'])[2]")
private WebElement FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberEditUpdatedSuccefullyPoUPOk;




@FindBy(xpath="//div[contains(text(),'Print')]")
private WebElement FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberPrintButton;


public void EditBatchPayment()
{
	
generic.ExplicitWait(4);
FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberDropdwon.click();
generic.ExplicitWait(4);
FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberSelect.click();
generic.ExplicitWait(4);
FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberEditButton.click();
generic.ExplicitWait(4);
FinanaceGeneralLedgerBatchPayment_SelectStatement_Note.sendKeys("Update");
generic.ExplicitWait(4);
FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberEditUpdateButton.click();
generic.ExplicitWait(4);
FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberEditUpdatedSuccefullyPoUPOk.click();
generic.ExplicitWait(4);
}



@FindBy(xpath="//div[@class='k-button dashboarddeletebtn button-align']")
private WebElement FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberPrintBackButton;

public void printBatchPayment()
{
	
	generic.ExplicitWait(3);
	FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberPrintButton.click();
	generic.ExplicitWait(5);
	FinanaceGeneralLedgerBatchPaymentSelectAbatchNumberPrintBackButton.click();
	generic.ExplicitWait(4);



}
















}




