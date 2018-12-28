package com.QA.Gibsons_Connect_Quotes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


public class Quotes_DarrimanLimeOrder_Base_Page extends Generic_Service

{
	@FindBy(xpath = "//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;

	@FindBy(xpath = "//a[@id='quote']/span[1]")
	private WebElement QuotesMenuBar;

	@FindBy(xpath = "//ul[@id='side-menu']/li[5]/ul/li[1]/a/span")
	private WebElement QuotesMenuBarQuotes;

	@FindBy(xpath = "//div[@srname='ORDERS_WRITE'][contains(text(),'New Quote')]")
	private WebElement QuotesMainPageNewQuotes;

	@FindBy(xpath = "//div[@id='5610_Division_RoleDiv']")
	private WebElement QuotesDrrimanLimeIcon;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement QuotesDrrimanLimeSeachbar;

	@FindBy(xpath = "//ul[@id='part1AAC_listbox']/li[1]") // du
	private WebElement QuotesDrrimanLimeCustomerSelect;

	@FindBy(xpath = "//div[@id='part1A']//div[contains(@style,'float: left;')]//div[@style='clear: both; text-align: right;']//div[@class='btn btn-primary k-button']")
	private WebElement QuotesDrrimanLimeCustomerSelectGOButton;

	@FindBy(xpath = "//div[@id='section2']")
	private WebElement QuotesDrrimanLimeCreateQouteFarmLocationBar;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[1]")
	private WebElement QuotesDrrimanLimeCreateQouteFarmLocationDropdown;

	@FindBy(xpath = "//ul[@id='farmsDD_listbox']/li[2]")
	private WebElement QuotesDrrimanLimeCreateQouteFarmLocationSelect;

	@FindBy(xpath = "//div[@id='section3']")
	private WebElement QuotesDrrimanLimeCreateQouteProductBar;

	@FindBy(xpath = "//div[@id='productHeaderDiv']/div[3]/div[2]")
	private WebElement QuotesDrrimanLimeCreateQouteProductAdd;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement QuotesDrrimanLimeCreateQouteProductDropdown;

	@FindBy(xpath = "//ul[@id='op_1_1_listbox']/li[4]")
	private WebElement QuotesDrrimanLimeCreateQouteProductSelect;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement QuotesDrrimanLimeCreateQouteApplicationDropdoown;

	@FindBy(xpath = "//ul[@id='op_1_2_listbox']/li[3]")
	private WebElement QuotesDrrimanLimeCreateQouteApplicationSelect;

	@FindBy(xpath = "//input[@id='op_1_3']")
	private WebElement QuotesDrrimanLimeCreateQouteWeight;

	@FindBy(xpath = "//div[@id='section4']")
	private WebElement QuotesDrrimanLimeCreateQouteDelievryBar;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement QuotesDrrimanLimeCreateQouteDelievryCalender;

	@FindBy(xpath = "//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
	private WebElement QuotesDrrimanLimeCreateQouteDelievryCalenderFull;

	@FindBy(xpath = "//td[@class='k-today k-state-focused']/a")
	private WebElement QuotesDrrimanLimeCreateQouteDelievryCalenderTodaysDate;

	@FindBy(xpath = "//div[@id='section5']")
	private WebElement QuotesDrrimanLimeCreateQouteQuoteNotesBar;

	@FindBy(xpath = "//a[@class='k-button k-button-icontext k-add-button']")
	private WebElement QuotesDrrimanLimeCreateQouteQuoteNotesAdd;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/textarea")
	private WebElement QuotesDrrimanLimeCreateQouteQuoteNotesTextArea;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement QuotesDrrimanLimeCreateQouteQuoteNotesSave;

	@FindBy(xpath = "//div[@id='btnCreateQuote']")
	private WebElement QuotesDrrimanLimeCreateQouteCreateQuoteButton;

	@FindBy(xpath = "//div[@class='k-toolbar k-grid-toolbar']/div[1]/span[1]")
	private WebElement QuotesMainPageQoutesOderTypedropdown;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[1]")
	private WebElement QuotesMainPageQoutesOderTypeSelect;

	@FindBy(xpath = "//div[@id='depotDropDown']/span")
	private WebElement CreateQutesMainpageDepotdropdown;

	@FindBy(xpath = "//ul[@id='depotList_listbox']/li[1]")
	private WebElement CreateQutesMainpageDepotAll;

	@FindBy(xpath = "(//th[@class='k-header k-with-icon k-filterable'])[2]")
	private WebElement CreateQutesMainpageRefresh;

	@FindBy(xpath = "(//button[@class='fa-sign-in fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
	private WebElement CreateQutesDarrimanConverToOrderIcon;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement CreateQutesDarrimanConverToOrderToBeInOrder;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Convert To Order')]")
	private WebElement CreateQutesDarrimanConverToOrderConvertToOrderButton;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button popup-button-right']")
	private WebElement CreateQutesDarrimanConverToOrderConvertToOrderyes;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[2]")
	private WebElement CreateQutesDarrimanConverToOrderConvertToOrderOk;


	String filepath = "./ExcelFile/Gibsons_Connect_TestData.xlsx";

	String sheetname = "Quotes";

	Generic_Service generic = new Generic_Service();

	public Quotes_DarrimanLimeOrder_Base_Page() {
		PageFactory.initElements(driver, this);
	}

	public void navigateToDarrimanLimequtes() {
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

	public void CreateDarrimanLImeQuotes()
	{

		QuotesMainPageNewQuotes.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeIcon.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeSeachbar.sendKeys("du");
		generic.ExplicitWait(5);

		QuotesDrrimanLimeCustomerSelect.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCustomerSelectGOButton.click();

		QuotesDrrimanLimeCreateQouteDelievryBar.click();
		generic.ExplicitWait(3);

		generic.ExplicitWait(5);
		QuotesDrrimanLimeCreateQouteDelievryCalender.click();
		Actions act = new Actions(driver);
		act.clickAndHold(QuotesDrrimanLimeCreateQouteDelievryCalenderFull);
		generic.ExplicitWait(10);
		QuotesDrrimanLimeCreateQouteDelievryCalenderTodaysDate.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCreateQouteFarmLocationBar.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCreateQouteFarmLocationDropdown.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCreateQouteFarmLocationSelect.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCreateQouteProductBar.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCreateQouteProductAdd.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCreateQouteProductDropdown.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCreateQouteProductSelect.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCreateQouteApplicationDropdoown.click();
		generic.ExplicitWait(3);

		QuotesDrrimanLimeCreateQouteApplicationSelect.click();
		generic.ExplicitWait(3);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 3, 3);
		System.out.println(weight);
		QuotesDrrimanLimeCreateQouteWeight.sendKeys(weight + "");
		generic.ExplicitWait(5);

		/*
		 * QuotesDrrimanLimeCreateQouteQuoteNotesBar.click();
		 * 
		 * 
		 * QuotesDrrimanLimeCreateQouteQuoteNotesAdd.click();
		 * 
		 * 
		 * QuotesDrrimanLimeCreateQouteQuoteNotesTextArea.sendKeys(
		 * "send mail to ayc@gmail.com");
		 * 
		 * 
		 * QuotesDrrimanLimeCreateQouteQuoteNotesSave.click();
		 */

		QuotesDrrimanLimeCreateQouteCreateQuoteButton.click();
		generic.ExplicitWait(15);

	}

	@FindBy(xpath = "//a[@id='Orders']")
	private WebElement OrdersMenuBar;

	@FindBy(xpath = "//ul[@id='side-menu']/li[4]/ul/li[1]/a/span")
	private WebElement OrdersMenuBarOrders;

	@FindBy(xpath = "//div[@id='wrapper']//div[1]/span[1]/span[1]")
	private WebElement OrderMainPageOrderTypeDropdown;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[1]")
	private WebElement OrderMainPageOrderTypeDropdownDarriman;

	@FindBy(xpath = "//div[@id='depotDropDown']/span")
	private WebElement OrderPageLogisticsMainpageDepotdropdown;

	@FindBy(xpath = "//ul[@id='depotList_listbox']/li[1]")
	private WebElement OrderPageLogisticsMainpageDepotAll;

	@FindBy(xpath = "//div[@id='freightGrid']//th[3]/a[2]")
	private WebElement OrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage;

	@FindBy(xpath = "(//tr[@data-uid='34782f5b-9cf1-49f0-a832-4bbbe0ec0b74'])[3]/td[3]")
	private WebElement OrderPageCreateDarrimanOrderMainPageCaptureOrderNumber;

	public void ConvertDarrimanLImeQuotesToOrder() {
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

		CreateQutesDarrimanConverToOrderIcon.click();
		generic.ExplicitWait(3);

		CreateQutesDarrimanConverToOrderToBeInOrder.click();
		generic.ExplicitWait(3);

		CreateQutesDarrimanConverToOrderConvertToOrderButton.click();
		generic.ExplicitWait(3);

		CreateQutesDarrimanConverToOrderConvertToOrderyes.click();
		generic.ExplicitWait(5);

		CreateQutesDarrimanConverToOrderConvertToOrderOk.click();
		generic.ExplicitWait(5);

		OrdersMenuBar.click();
		generic.ExplicitWait(3);

		OrdersMenuBarOrders.click();
		generic.ExplicitWait(3);

		OrderMainPageOrderTypeDropdown.click();
		generic.ExplicitWait(3);

		OrderMainPageOrderTypeDropdownDarriman.click();
		generic.ExplicitWait(3);

		OrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage.click();
		generic.ExplicitWait(3);
		OrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage.click();

		String OrderNumber = OrderPageCreateDarrimanOrderMainPageCaptureOrderNumber.getText();
		generic.ExplicitWait(3);
		System.out.println(OrderNumber);

	}

}
