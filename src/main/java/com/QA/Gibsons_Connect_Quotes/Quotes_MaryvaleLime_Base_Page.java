package com.QA.Gibsons_Connect_Quotes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


public class Quotes_MaryvaleLime_Base_Page  extends Generic_Service
{
	
	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='quote']/span[1]")
	private WebElement QuotesMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[5]/ul/li[1]/a/span")
	private WebElement QuotesMenuBarQuotes;
	
	@FindBy(xpath="//div[@srname='ORDERS_WRITE'][contains(text(),'New Quote')]")
	private WebElement QuotesMainPageNewQuotes;
	
	@FindBy(xpath="//div[@id='5614_Division_RoleDiv']")
	private WebElement QuotesMaryvaleLimeIcon;
	
	@FindBy(xpath="//input[@id='part1AAC']")
	private WebElement QuotesMaryvaleLimeSeachbar;
	
	@FindBy(xpath="//ul[@id='part1AAC_listbox']/li[1]") //du
	private WebElement QuotesMaryvaleLimeCustomerSelect;
	
	@FindBy(xpath="//div[@id='part1A']//div[contains(@style,'float: left;')]//div[@style='clear: both; text-align: right;']//div[@class='btn btn-primary k-button']")
	private WebElement QuotesMaryvaleLimeCustomerSelectGOButton;
	
	@FindBy(xpath="//div[@id='section2']") 
	private WebElement QuotesMaryvaleLimeCreateQouteFarmLocationBar;
	

	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[1]") 
	private WebElement QuotesMaryvaleLimeCreateQouteFarmLocationDropdown;
	
	
	@FindBy(xpath="//ul[@id='farmsDD_listbox']/li[2]") 
	private WebElement QuotesMaryvaleLimeCreateQouteFarmLocationSelect;
	
	@FindBy(xpath="//div[@id='section3']")
	private WebElement QuotesMaryvaleLimeCreateQouteProductBar;
	
	@FindBy(xpath="//div[@id='productHeaderDiv']/div[3]/div[2]") 
	private WebElement QuotesMaryvaleLimeCreateQouteProductAdd;
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[2]") 
	private WebElement QuotesMaryvaleLimeCreateQouteProductDropdown;
	
	
	@FindBy(xpath="//ul[@id='op_1_1_listbox']/li[4]") 
	private WebElement QuotesMaryvaleLimeCreateQouteProductSelect;
	
	

	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[3]") 
	private WebElement QuotesMaryvaleLimeCreateQouteApplicationDropdoown;
	
	@FindBy(xpath="//ul[@id='op_1_2_listbox']/li[3]") 
	private WebElement QuotesMaryvaleLimeCreateQouteApplicationSelect;
	
	@FindBy(xpath="//input[@id='op_1_3']") 
	private WebElement QuotesMaryvaleLimeCreateQouteWeight;
	
	
	@FindBy(xpath="//div[@id='section4']")
	private WebElement QuotesMaryvaleLimeCreateQouteDelievryBar;
	
	@FindBy(xpath="//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement QuotesMaryvaleLimeCreateQouteDelievryCalender;
	
	
	@FindBy(xpath="//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
	private WebElement QuotesMaryvaleLimeCreateQouteDelievryCalenderFull;
	
	
	@FindBy(xpath="//td[@class='k-today k-state-focused']/a")
	private WebElement QuotesMaryvaleLimeCreateQouteDelievryCalenderTodaysDate;
	
	
	@FindBy(xpath="//div[@id='section5']")
	private WebElement QuotesMaryvaleLimeCreateQouteQuoteNotesBar;
	
	
	@FindBy(xpath="//a[@class='k-button k-button-icontext k-add-button']")
	private WebElement QuotesMaryvaleLimeCreateQouteQuoteNotesAdd;
	
	
	@FindBy(xpath="//div[@id='orderNotesList']/div/textarea")
	private WebElement QuotesMaryvaleLimeCreateQouteQuoteNotesTextArea;
	
	
	@FindBy(xpath="//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement QuotesMaryvaleLimeCreateQouteQuoteNotesSave;
	
	
	@FindBy(xpath="//div[@id='btnCreateQuote']")
	private WebElement QuotesMaryvaleLimeCreateQouteCreateQuoteButton;
	
	
	
	
	@FindBy(xpath="//div[@class='k-toolbar k-grid-toolbar']/div[1]/span[1]")
	private WebElement QuotesMainPageQoutesOderTypedropdown;
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[4]")
	private WebElement QuotesMainPageQoutesOderTypeSelect;
	

	@FindBy(xpath="//div[@id='depotDropDown']/span")
	private WebElement CreateQutesMainpageDepotdropdown;

	@FindBy(xpath="//ul[@id='depotList_listbox']/li[4]")
	private WebElement CreateQutesMainpageDepotAll;
	

	@FindBy(xpath="(//th[@class='k-header k-with-icon k-filterable'])[2]")
	private WebElement CreateQutesMainpageRefresh;
	
	@FindBy(xpath="(//button[@class='fa-sign-in fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
	private WebElement CreateQutesConverToOrderIcon;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement CreateQutesMaryvaleConverToOrderToBeInOrder;
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Convert To Order')]")
	private WebElement CreateQutesMaryvaleConverToOrderConvertToOrderButton;
	
	
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button popup-button-right']")
	private WebElement CreateQutesMaryvaleConverToOrderConvertToOrderyes;
	
	
	@FindBy(xpath="(//div[@class='btn btn-primary k-button'])[2]")
	private WebElement CreateQutesMaryvaleConverToOrderConvertToOrderOk;
	
	
	//String filepath="C:\\Users\\riti raj\\Desktop\\Gibsons_Connect_TestData.xlsx";
	String filepath="./ExcelFile/Gibsons_Connect_TestData.xlsx";
	String sheetname="Quotes";
	
	Generic_Service generic=new Generic_Service();


	public Quotes_MaryvaleLime_Base_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void navigateToMaryvaleLimequtes()
	{
		generic.ExplicitWait(3);
		ToggleMenuBar.click();
		generic.ExplicitWait(3);
		
		QuotesMenuBar.click();
		generic.ExplicitWait(3);
		
		QuotesMenuBarQuotes.click();
		generic.ExplicitWait(3);
		
		ToggleMenuBar.click();
		generic.ExplicitWait(3);
	}
	
	public void CreatequotesMaryvaleLImeQuotes()
	{
		
		QuotesMainPageNewQuotes.click();
		generic.ExplicitWait(3);
	
		 QuotesMaryvaleLimeIcon.click();
		 generic.ExplicitWait(3);
		
		
		QuotesMaryvaleLimeSeachbar.sendKeys("ra");
		generic.ExplicitWait(5);
		
		QuotesMaryvaleLimeCustomerSelect.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCustomerSelectGOButton.click();
		
		
		QuotesMaryvaleLimeCreateQouteDelievryBar.click();
		generic.ExplicitWait(3);
	
		
		generic.ExplicitWait(5);
		QuotesMaryvaleLimeCreateQouteDelievryCalender.click();
		Actions act = new Actions(driver);
		act.clickAndHold(QuotesMaryvaleLimeCreateQouteDelievryCalenderFull);
		generic.ExplicitWait(10);
		QuotesMaryvaleLimeCreateQouteDelievryCalenderTodaysDate.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCreateQouteFarmLocationBar.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCreateQouteFarmLocationDropdown.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCreateQouteFarmLocationSelect.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCreateQouteProductBar.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCreateQouteProductAdd.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCreateQouteProductDropdown.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCreateQouteProductSelect.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCreateQouteApplicationDropdoown.click();
		generic.ExplicitWait(3);
		
		QuotesMaryvaleLimeCreateQouteApplicationSelect.click();
		generic.ExplicitWait(3);
		
		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 3, 3);
		System.out.println(weight);
		QuotesMaryvaleLimeCreateQouteWeight.sendKeys(weight+"");
		generic.ExplicitWait(5);
		
		
		/*
		 * QuotesMaryvaleLimeCreateQouteQuoteNotesBar.click();
		 * 
		 * 
		 * QuotesMaryvaleLimeCreateQouteQuoteNotesAdd.click();
		 * 
		 * 
		 * QuotesMaryvaleLimeCreateQouteQuoteNotesTextArea.sendKeys(
		 * "send mail to ayc@gmail.com");
		 * 
		 * 
		 * QuotesDrrimanLimeCreateQouteQuoteNotesSave.click();
		 */
		
		 QuotesMaryvaleLimeCreateQouteCreateQuoteButton.click();
		 generic.ExplicitWait(15);
			
		
		
		
	}
	
	@FindBy(xpath="//a[@id='Orders']")
	private WebElement OrdersMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[4]/ul/li[1]/a/span")
	private WebElement OrdersMenuBarOrders;
	
	@FindBy(xpath="//div[@id='wrapper']//div[1]/span[1]/span[1]")
	private WebElement OrderMainPageOrderTypeDropdown;
	
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[4]")
	private WebElement OrderMainPageOrderTypeDropdownMaryvale;
	
	@FindBy(xpath="//div[@id='depotDropDown']/span")
	private WebElement OrderPageLogisticsMainpageDepotdropdown;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[1]")
	private WebElement OrderPageLogisticsMainpageDepotAll;
	
	@FindBy(xpath="//div[@id='freightGrid']//th[3]/a[2]")
	private WebElement OrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage;
	
	@FindBy(xpath="(//tr[@data-uid='34782f5b-9cf1-49f0-a832-4bbbe0ec0b74'])[3]/td[3]")
	private WebElement OrderPageCreateMaryvaleOrderMainPageCaptureOrderNumber;
	
	
	public void ConvertMaryvaleLImeQuotesToOrder()
	{ 
	    generic.ExplicitWait(8);
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
		

		CreateQutesConverToOrderIcon.click();
		generic.ExplicitWait(3);
		

		CreateQutesMaryvaleConverToOrderToBeInOrder.click();
		generic.ExplicitWait(3);
		
		CreateQutesMaryvaleConverToOrderConvertToOrderButton.click();
		generic.ExplicitWait(3);
		
		CreateQutesMaryvaleConverToOrderConvertToOrderyes.click();
		generic.ExplicitWait(5);
		
		CreateQutesMaryvaleConverToOrderConvertToOrderOk.click();
		generic.ExplicitWait(5);
		
		OrdersMenuBar.click();
		generic.ExplicitWait(3);
		
		OrdersMenuBarOrders.click();
		generic.ExplicitWait(3);
		
		OrderMainPageOrderTypeDropdown.click();
		generic.ExplicitWait(3);
		
		OrderMainPageOrderTypeDropdownMaryvale.click();
		generic.ExplicitWait(3);
		
		OrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage.click();
		generic.ExplicitWait(3);
		OrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage.click();
		
		
		String OrderNumber = OrderPageCreateMaryvaleOrderMainPageCaptureOrderNumber.getText();
		generic.ExplicitWait(3);
		System.out.println("Maryvale qoutes is converted to order successfully .Order number is : " + OrderNumber);
		generic.ExplicitWait(5);
		

	
			 
}}
