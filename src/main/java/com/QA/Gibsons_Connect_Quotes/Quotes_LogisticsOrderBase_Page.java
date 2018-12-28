package com.QA.Gibsons_Connect_Quotes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


public class Quotes_LogisticsOrderBase_Page extends Generic_Service
{
	
	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='quote']/span[1]")
	private WebElement QuotesMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[5]/ul/li[2]/a/span")
	private WebElement QuotesMenuBarSalesLog;
	

	
	
	@FindBy(xpath="//div[@srname='ORDERS_WRITE'][contains(text(),'New Quote')]")
	private WebElement QuotesSaleLogNewQuotes;
	
	@FindBy(xpath="//div[@id='5611_Division']")
	private WebElement QuotesSaleLogNewQuotesLogisticsIcon;
	
	@FindBy(xpath="//input[@id='part1AAC']")
	private WebElement CreateQuotesLogiscticsSearchBar;

	@FindBy(xpath="//ul[@id='part1AAC_listbox']/li[1]")
	private WebElement CreateQuotesLogiscticsSearchBarAce;

	
	@FindBy(xpath="//div[@id='part1A']//div[contains(@style,'float: left;')]//div[@style='clear: both; text-align: right;']//div[@class='btn btn-primary k-button']")
	private WebElement CreateQuoteLogisticssGobutton;
	

	@FindBy(xpath="//div[@id='GibsonsDepotPickup']")
	private WebElement CreateQuotesLogiscticsPickupLocationGibsonsDepotPickUp;

	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header']/span[1])[1]")
	private WebElement CreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdown;
	
	@FindBy(xpath="//ul[@id='depotPickupDD_listbox']/li[5]")
	private WebElement CreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdownSelect;
	
	
	
	
	@FindBy(xpath="//div[@id='CustomerAddressPickup']")
	private WebElement CreateQuotesLogiscticsPickupLocationCustomerAddress;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-combobox k-header'])[1]/span/span")
	private WebElement CreateQuotesLogiscticsPickupLocationCustomerAddressDropdownSelectFarmdropdown;
	
	@FindBy(xpath="(//div[@id='pickupFarmDD-list'])[3]/ul/li[1]")
	private WebElement CreateQuotesLogiscticsPickupLocationCustomerAddressDropdownSelectFarm;
	
	
	
	
	
	
	
	@FindBy(xpath="//div[@id='NewLocationPickup']")
	private WebElement CreateQuotesLogiscticsLogisticsPickupLocationOtherLocation;
	

	@FindBy(xpath="//input[@id='pickupLocationNameAC']")
	private WebElement CreateQuotesLogiscticsPickupLocationOtherLocationSearchLocationBar;
	
	
	@FindBy(xpath="//ul[@id='pickupLocationNameAC_listbox']/li[5]")
	private WebElement CreateQuotesLogiscticsPickupLocationOtherLocationSearchLocationSelect;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement CreateQuotesLogiscticsPickupLocationOtherLocationRegistredwithcustomerCheckbox;
	


	
	
	
	
	@FindBy(xpath="//div[@id='GibsonsDepotDelivery']")
	private WebElement CreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUp;


	@FindBy(xpath="(//span[@class='k-dropdown-wrap k-state-default'])[4]")
	private WebElement CreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpDropdown;
	
	
	@FindBy(xpath="//ul[@id='depotDeliveryDD_listbox']/li[3]")
	private WebElement CreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpSelect;
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//div[@id='CustomerAddressDelivery']")
	private WebElement CreateQuotesLogiscticsDeliveryLocationCustomerAddress;
	
	@FindBy(xpath="(//span[@class='k-widget k-combobox k-header'])[2]/span/span")
	private WebElement CreateQuotesLogiscticsDeliveryLocationCustomerAddressDropdown;
	
	@FindBy(xpath="(//ul[@id='deliveryFarmDD_listbox'])[2]/li[1]")
	private WebElement CreateQuotesLogiscticsDeliveryLocationCustomerAddressSelect;
	
	
	
	@FindBy(xpath="//div[@id='NewLocationDelivery']")
	private WebElement CreateQuotesLogiscticsDeliveryLocationOtherLocation;
	
	@FindBy(xpath="//input[@type='checkbox'])[2]")
	private WebElement CreateQuotesLogiscticsDeliveryLocationOtherLocationcheckbox;
	
	
	@FindBy(xpath="(//div[@class='btn btn-primary k-button'])[3]")
	private WebElement CreateQuotesLogiscticsOrderSelectbothlocationGo;
	
	
	
	
	
	
	@FindBy(xpath="//div[@id='section4']")
	private WebElement  CreateQuotesLogiscticsOrderDelieveryBar;
	
	
	@FindBy(xpath="//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement  CreateQuotesLogiscticsDeliveryCalenderIcon;
	
	
	@FindBy(xpath="//div[@id='ee9cb678-e330-4bef-a21c-6a120bc1176c']")
	private WebElement  CreateQuotesLogiscticsDeliveryCalenderFullIcon;
	
	@FindBy(xpath="//td[@class='k-today k-state-focused']/a")
	private WebElement  CreateQuotesLogiscticsDeliveryCalenderFullIconTodaysfocausdate;
	
	
	
	
	
	
	
	
	@FindBy(xpath="//div[@id='section3']")
	private WebElement  CreateQuotesLogiscticsOrderConsignmentBar;
	
	@FindBy(xpath="(//div[@class='gb-panel-small-border']/div[2])[1]")
	private WebElement  CreateQuotesLogiscticsConsignmentProductAddButton;
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[7]")
	private WebElement  CreateQuotesLogiscticsConsignmentProductDropdown;
	
	
	@FindBy(xpath="//ul[@id='op_1_1_listbox']/li[5]")
	private WebElement  CreateQuotesLogiscticsConsignmentProductSelect;
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[8]")
	private WebElement  CreateQuotesLogiscticsConsignmentProductApplicationDropdown;
	
	@FindBy(xpath="//ul[@id='op_1_2_listbox']/li[2]")
	private WebElement  CreateQuotesLogiscticsConsignmentProductApplicationSelect;
	
	
	@FindBy(xpath="//input[@id='op_1_3']")
	private WebElement  CreateQuotesLogiscticsConsignmentProductWeight;
	
	
	@FindBy(xpath="//div[@id='btnCreateQuote']")
	private WebElement  CreateQuotesLogiscticsCreateQuotes;
	
	
	
	@FindBy(xpath="//div[@id='section5']")
	private WebElement  CreateQuotesLogiscticsQuotesNotesBar;


	@FindBy(xpath="//a[@class='k-button k-button-icontext k-add-button']")
	private WebElement CreateQuotesLogiscticsQuotesAddNotes;


	@FindBy(xpath="//div[@id='orderNotesList']/div/textarea")
	private WebElement CreateQuotesLogiscticsQuotesAddNotesTextArea;

	@FindBy(xpath="//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement CreateQuotesLogiscticsQuotesAddNotesSave;

	
	@FindBy(xpath="//div[@class='k-toolbar k-grid-toolbar']/div[1]/span[1]")
	private WebElement QuotesMainPageQoutesOderTypedropdown;
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[2]")
	private WebElement QuotesMainPageQoutesOderTypeSelect;
	

	@FindBy(xpath="//div[@id='depotDropDown']/span")
	private WebElement CreateQutesMainpageDepotdropdown;

	@FindBy(xpath="//ul[@id='depotList_listbox']/li[1]")
	private WebElement CreateQutesMainpageDepotAll;
	

	@FindBy(xpath="(//th[@class='k-header k-with-icon k-filterable'])[2]")
	private WebElement CreateQutesMainpageRefresh;
	
	@FindBy(xpath="(//button[@class='fa-sign-in fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
	private WebElement CreateQutesLogiscticsMainpageConvertToOrder;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement CreateQutesLogiscticsConvertToOrderToBeInOrder;
	
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Convert To Order')]")
	private WebElement CreateQutesLogiscticsConvertToOrderConvertToOrderComplete;
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button popup-button-right']")
	private WebElement CreateQutesLogiscticsConvertToOrderConvertToOrderYes;
	
	@FindBy(xpath="(//div[@class='btn btn-primary k-button'])[3]")
	private WebElement CreateQutesLogiscticsConvertToOrderConvertToOrderOk;
	
	
	
	
	@FindBy(xpath="//div[@id='wrapper']//div[1]/span[1]/span[1]")
	private WebElement OrderPageLogisticsOrderMainPageOrderTypeDropdown;
	
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[2]")
	private WebElement OrderPageLogisticsOrderMainPageOrderTypeDropdownLogistics;
	
	
	
	@FindBy(xpath="//div[@id='depotDropDown']/span")
	private WebElement OrderPageLogisticsMainpageDepotdropdown;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[1]")
	private WebElement OrderPageLogisticsMainpageDepotAll;
	
	@FindBy(xpath="//div[@id='freightGrid']//th[3]/a[2]")
	private WebElement OrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage;
	
	@FindBy(xpath="")
	private WebElement OrderPageCreateLogisticsMainPageCaptureOrderNumber;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[5]/ul/li[1]/a/span")
	private WebElement QuotesMenuBarQuotes;

	

	Generic_Service generic=new Generic_Service();
	  
  
    String filepath="./ExcelFile/Gibsons_Connect_TestData.xlsx";
 	String sheetname="Quotes";
 	

	public Quotes_LogisticsOrderBase_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void navigateToquotes()
	{
		generic.ExplicitWait(5);
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		QuotesMenuBar.click();
		generic.ExplicitWait(5);
		QuotesMenuBarQuotes.click();
		generic.ExplicitWait(5);
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
	}	
	
	public void createNewLogisticsQuotes()
	{
		QuotesSaleLogNewQuotes.click();
		QuotesSaleLogNewQuotesLogisticsIcon.click();
		generic.ExplicitWait(5);
		CreateQuotesLogiscticsSearchBar.sendKeys("ace");
		generic.ExplicitWait(5);
		CreateQuotesLogiscticsSearchBarAce.click();
		generic.ExplicitWait(3);
		CreateQuoteLogisticssGobutton.click();
		generic.ExplicitWait(3);

		CreateQuotesLogiscticsPickupLocationGibsonsDepotPickUp.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdown.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdownSelect.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUp.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpDropdown.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpSelect.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsOrderSelectbothlocationGo.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsOrderDelieveryBar.click();
		generic.ExplicitWait(5);
		CreateQuotesLogiscticsDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		act.clickAndHold(CreateQuotesLogiscticsDeliveryCalenderFullIcon);
		generic.ExplicitWait(10);
		CreateQuotesLogiscticsDeliveryCalenderFullIconTodaysfocausdate.click();
		generic.ExplicitWait(3);

		CreateQuotesLogiscticsOrderConsignmentBar.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsConsignmentProductAddButton.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsConsignmentProductDropdown.click();
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsConsignmentProductSelect.click();
		generic.ExplicitWait(5);
		CreateQuotesLogiscticsConsignmentProductApplicationDropdown.click();
		generic.ExplicitWait(5);
		CreateQuotesLogiscticsConsignmentProductApplicationSelect.click();
		generic.ExplicitWait(3);
		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 3, 3);
		System.out.println(weight);
		CreateQuotesLogiscticsConsignmentProductWeight.sendKeys(weight + "");
		generic.ExplicitWait(5);

		/*CreateQuotesLogiscticsQuotesNotesBar.click();
		generic.ExplicitWait(3);

		CreateQuotesLogiscticsQuotesAddNotes.click();
		generic.ExplicitWait(3);

		CreateQuotesLogiscticsQuotesAddNotesTextArea.sendKeys("mail to ab@gmial.com");
		generic.ExplicitWait(3);
		CreateQuotesLogiscticsQuotesAddNotesSave.click();
		generic.ExplicitWait(3);*/
		
		CreateQuotesLogiscticsCreateQuotes.click();
		generic.ExplicitWait(5);
		System.out.println("Logisctics qotes created successfully .plesae navigate to orders");

	}
	
	@FindBy(xpath="//a[@id='Orders']")
	private WebElement OrdersMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[4]/ul/li[1]/a/span")
	private WebElement OrdersMenuBarOrders;
	
	
	public void ConvertLogisticsQuotesToorder()
	{
		
		generic.ExplicitWait(5);
		QuotesMainPageQoutesOderTypedropdown.click();
		generic.ExplicitWait(3);
		QuotesMainPageQoutesOderTypeSelect.click();

		generic.ExplicitWait(3);
		CreateQutesMainpageDepotdropdown.click();
		generic.ExplicitWait(3);
		CreateQutesMainpageDepotAll.click();
		generic.ExplicitWait(3);
		CreateQutesMainpageRefresh.click();
		generic.ExplicitWait(3);
		CreateQutesMainpageRefresh.click();
		generic.ExplicitWait(3);
		CreateQutesLogiscticsMainpageConvertToOrder.click();
		generic.ExplicitWait(3);
		CreateQutesLogiscticsConvertToOrderToBeInOrder.click();
		generic.ExplicitWait(3);
		CreateQutesLogiscticsConvertToOrderConvertToOrderComplete.click();
		generic.ExplicitWait(3);
		CreateQutesLogiscticsConvertToOrderConvertToOrderYes.click();
		generic.ExplicitWait(3);
		CreateQutesLogiscticsConvertToOrderConvertToOrderOk.click();
		
		
		generic.ExplicitWait(3);
		OrdersMenuBar.click();
		generic.ExplicitWait(5);
		OrdersMenuBarOrders.click();
		generic.ExplicitWait(5);

		OrderPageLogisticsOrderMainPageOrderTypeDropdown.click();
		generic.ExplicitWait(3);

		OrderPageLogisticsOrderMainPageOrderTypeDropdownLogistics.click();
		generic.ExplicitWait(3);

		OrderPageLogisticsMainpageDepotdropdown.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsMainpageDepotAll.click();
		generic.ExplicitWait(3);

		OrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage.click();
		generic.ExplicitWait(3);
		OrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage.click();

		String OrderNumber = OrderPageCreateLogisticsMainPageCaptureOrderNumber.getText();
		generic.ExplicitWait(3);
		System.out.println("Logisctics qoutes is converted to order successfully .Order number is : " + OrderNumber);
		generic.ExplicitWait(5);

	}
	
	
	
	
	
}


