package com.QA.Gibsons_Connect_Orders;

import java.awt.AWTException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class GroundSpreadOders_Base_Page extends Generic_Service

{
	// .............OrderPageHomePage Xpath...............//

	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement OrderPageTextcatch;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement OrderPageSelectACustomerSearchbar;

	@FindBy(xpath = "//div[@id='searchCustomerForOrderByDisplayNameButton']")
	private WebElement OrderPageSearchACustomerByCompanyNameTab;

	@FindBy(xpath = "//div[@id='searchCustomerForOrderByCompanyNameButton']")
	private WebElement OrderPageSearchACustomerByDisplayNameTab;

	@FindBy(xpath = "//div[@id='ExistingCustomerContentDiv']/div[5]/button")
	private WebElement OrderPageClearSearch;

	@FindBy(xpath = "//span[@unselectable='on'][contains(text(),'GroundSpread')]")
	private WebElement OrderPageOrderTypeDropDown;

	@FindBy(xpath = "//span[@unselectable='on'][contains(text(),'BAYLES')]")
	private WebElement OrderPageDepotTypeDropDown;

	@FindBy(xpath = "//span[@unselectable='on'][contains(text(),'Ready For Assignment')]")
	private WebElement OrderPageOrderStatusDropDown;

	@FindBy(xpath = "//div[@srname='ORDERS_WRITE'][contains(text(),'Create a New Order')]")
	private WebElement OrderPageCreateNewOrder;

	@FindBy(xpath = "//div[@srname='ORDERS_WRITE'][contains(text(),'Delete Order')]")
	private WebElement OrderPageDeleteOrder;

	// .....................Groundspread page..............//

	@FindBy(xpath = "//div[@id='groundspreadGrid']/div[1]/div/table/thead/tr/th[3]/a[2]")
	private WebElement OrderPageRefreshByNumber;

	@FindBy(xpath = "//div[@id='groundspreadGrid']/div[3]/a[3]/span")
	private WebElement OrderPageGoToNextPage;

	@FindBy(xpath = "//div[@id='groundspreadGrid']/div[3]/a[4]/span")
	private WebElement OrderPageGoToLastPage;

	// ..............Xpath for Assign Edit delegate Autoticktet
	// order....................//

	@FindBy(xpath = "//div[@id='groundspreadGrid']/div[2]/table/tbody/tr[1]/td[11]/button[3]")
	private WebElement OrderPageAssignExistingOrder;

	@FindBy(xpath = "//div[@id='groundspreadGrid']/div[2]/table/tbody/tr[1]/td[11]/button[4]")
	private WebElement OrderPageEditExistingOrder;

	@FindBy(xpath = "//div[@id='groundspreadGrid']/div[2]/table/tbody/tr[1]/td[11]/button[2]")
	private WebElement OrderPageDelegateExistingOrder;

	@FindBy(xpath = "//div[@id='groundspreadGrid']/div[2]/table/tbody/tr[1]/td[11]/button[5]")
	private WebElement OrderPageAutoticktetsExistingOrder;

	// ..............Xpath for GroundspreadGrid order....................//

	@FindBy(xpath = "//div[@id='5612_Division']")
	private WebElement OrderPageGroundspreadIcon;

	@FindBy(xpath = "//div[@class='btn btn-motif k-button']")
	private WebElement OrderPageGroundspreadIconCancel;

	@FindBy(xpath = "//div[@class='panel-heading clearfix']")
	private WebElement OrderPageCreateGroundspreadOrderText;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement OrderPageCreateGroundspreadSearchBar;

	@FindBy(xpath = "//ul[@id='part1AAC_listbox']/li[4]")
	private WebElement OrderPageCreateGroundspreadSearchBarAce3;

	@FindBy(xpath = "//div[@id='searchCustomerByCompanyNameButton']")
	private WebElement OrderPageCreateGroundspreadSearchCustomerByCompanyname;

	@FindBy(xpath = "//div[@id='searchCustomerByDisplayNameButton']")
	private WebElement OrderPageCreateGroundspreadSearchCustomerByDisplayname;

	@FindBy(xpath = "//div[@id='part1A']/div[2]/div/div[1]")
	private WebElement OrderPageCreateGroundspreadBack;

	@FindBy(xpath = "//div[@class='go_back']/div[2]")
	private WebElement OrderPageCreateGroundspreadGobutton;

	@FindBy(xpath = "//div[@class='panel-heading clearfix']")
	private WebElement OrderPageCreateGroundspreadCreatetext;

	@FindBy(xpath = "//div[@id='section1']")
	private WebElement OrderPageCreateGroundspreadCustomerDetailsBar;

	@FindBy(xpath = "//div[@id='createOrderBtn']")
	private WebElement OrderPageCreateGroundspreadCreatePageCancelOrder;

	@FindBy(xpath = "//div[@id='cancelOrderBtn']")
	private WebElement OrderPageCreateGroundspreadCreatePageCreateOrder;

	// ...........Farm and
	// Location...................................................//

	@FindBy(xpath = "//div[@id='section2']")
	private WebElement OrderPageCreateGroundspreadCreatePageFarmAndLocationBar;

	@FindBy(xpath = "//div[@id='fDIV']/span/span/span[2]/span")
	private WebElement OrderPageCreateGroundspreadCreatePageFarmAndLocationSelectFarmLocation;

	@FindBy(xpath = "//ul[@id='farmsDD_listbox']/li[2]")
	private WebElement OrderPageCreateGroundspreadCreatePageFarmAndLocationSelectFarmLocationAce3;

	@FindBy(xpath = "//div[@id='btnFarmMap']")
	private WebElement OrderPageCreateGroundspreadCreatePageFarmAndLocationFramMap;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Farm History')]")
	private WebElement OrderPageCreateGroundspreadCreatePageFarmAndLocationFarmHistorytab;

	@FindBy(xpath = "//div[@class='btn btn-primary center-block k-button']")
	private WebElement OrderPageCreateGroundspreadCreatePageFarmAndLocationFarmHistorytabclose;

	@FindBy(xpath = "//div[@class='clearfix gb-panel-small-border'][contains(text(),'Select Paddocks')]")
	private WebElement OrderPageCreateGroundspreadCreatePagePaddocktext;

	@FindBy(xpath = "//input[@id='selectAllPaddockCB']")
	private WebElement OrderPageCreateGroundspreadCreatePageSelectPaddocks;

	@FindBy(xpath = "//div[@id='pCDIV']/textarea")
	private WebElement OrderPageCreateGroundspreadCreatePagePaddockComments;

	@FindBy(xpath = "//div[@id='farmsAndLocationContentDiv']/div[5]")
	private WebElement OrderPageCreateGroundspreadCreatePageCaptureTotalAreaPaddock;

	// ........................Products.................................................//

	@FindBy(xpath = "//div[@id='section3']")
	private WebElement OrderPageCreateGroundspreadCreatePageProductbar;

	@FindBy(xpath = "//div[@id='productHeaderDiv']/div[2]/div[2]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAddbutton;

	@FindBy(xpath = "//div[@id='productHeaderDiv']/div[2]/div[3]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductDeletebutton;

	@FindBy(xpath = "//input[@id='op_1_1']")
	private WebElement OrderPageCreateGroundspreadCreatePageProductSearchAProductByName;

	@FindBy(xpath = "//ul[@id='op_1_1_listbox']/li[4]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductSearchAProductFocuslist;

	@FindBy(xpath = "//li[contains(text(),'0-0-25-10 Mg7.5')]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductSearchAProductByName10;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductApplication;
	
	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductApplicationDropdown;
	

	@FindBy(xpath = "//ul[@id='op_1_2_listbox']/li[3]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductApplication100;

	@FindBy(xpath = "//input[@id='op_1_3']")
	private WebElement OrderPageCreateGroundspreadCreatePageProductWeight;

	@FindBy(xpath = "//tr[@id='op_row_1']/td[4]")
	private WebElement OrderPageCreateGroundspreadCreatePageCaptureTotalPrice;

	@FindBy(xpath = "//div[@id='orderAdditionalCostDIV']/div[1]/div[2]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostAdd;

	@FindBy(xpath = "//div[@id='orderAdditionalCostDIV']/div[1]/div[3]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostDelete;

	@FindBy(xpath = "//tr[@id='op_1_6_row_1']/td[1]/span/span/span[2]/span")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostType;

	@FindBy(xpath = "//ul[@id='op_1_6_row_1_1_listbox']/li[3]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostTypeSelect;

	@FindBy(xpath = "//tr[@id='op_1_6_row_1']/td[2]/span/span/span[2]/span")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostRate;

	@FindBy(xpath = "//ul[@id='op_1_6_row_1_3_listbox']/li[5]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostRateSelect;

	@FindBy(xpath = "//input[@id='op_1_6_row_1_4']")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostUnits;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[5]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostPaymentTerms;

	@FindBy(xpath = "//input[@id='op_1_6_row_1_2']")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostUnitCosts;

	@FindBy(xpath = "//input[@id='op_1_6_row_1_5']")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalCostNetCost;

	@FindBy(xpath = "//ul[@id='paymentTermsDD_listbox']/li[4]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductAdditionalPaymentTermSelect;

	@FindBy(xpath = "//div[@id='productFooterDiv']/div[3]/textarea")
	private WebElement OrderPageCreateGroundspreadCreatePageProductInvoiceComments;

	@FindBy(xpath = "//div[@id='productFooterDiv']/div[4]")
	private WebElement OrderPageCreateGroundspreadCreatePageProductOrderTotal_ex_GST_and_Including;

	@FindBy(xpath = "//div[@id='section4']")
	private WebElement OrderPageCreateGroundspreadCreatePageDeliveryBar;

	@FindBy(xpath = "//input[@id='deliveryDtPicker']")
	private WebElement OrderPageCreateGroundspreadCreatePageDeliverySelectDate;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']//span[@unselectable='on']//span[@unselectable='on']")
	private WebElement OrderPageCreateGroundspreadCreatePageDeliveryCalender;

	@FindBy(xpath = "//a[@tabindex='-1'][contains(text(),'27')]")
	private WebElement OrderPageCreateGroundspreadCreatePageDeliveryCalenderTodaydate;

	// .....................Notes.........................//

	@FindBy(xpath = "//div[@id='section5']")
	private WebElement OrderPageCreateGroundspreadCreatePageNotesBar;

	@FindBy(xpath = "//div[@id='notesContentDiv']/a")
	private WebElement OrderPageCreateGroundspreadCreatePageAddNotes;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/textarea")
	private WebElement OrderPageCreateGroundspreadCreatePageAddNotesTextArea;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[2]")
	private WebElement OrderPageCreateGroundspreadCreatePageAddNotesCancel;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement OrderPageCreateGroundspreadCreatePageAddNotesSave;

	@FindBy(xpath = "//div[@id='createOrderBtn']")
	private WebElement OrderPageCreateGroundspreadCreatePageCreateOrderButton;

	@FindBy(xpath = "//html//div[@id='groundspreadGrid']//th[3]/a[2]")
	private WebElement OrderPageCreateGroundspreadClickonNumberrefresh;

	@FindBy(xpath = "//div[@id='groundspreadGrid']/div[2]/table/tbody/tr[1]/td[3]")
	private WebElement OrderPageCreateGroundspreadCreatedordernumber;

	@FindBy(xpath = "//a[@id='totop']")
	private WebElement OrderPageCreateGroundspreadCreatePageGoOnTop;

	@FindBy(xpath = "//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;

	@FindBy(xpath = "//span[@class='menu-title'][contains(text(),'Orders')]")
	private WebElement OrdersMenuBar;

	@FindBy(xpath = "(//span[@class='submenu-title'][contains(text(),'Orders')])[1]")
	private WebElement OrdersMenuBarOrders;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement OrderPageCreateGroundspreadDeliveryCalenderIcon;

	@FindBy(xpath = "//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
	private WebElement OrderPageCreateGroundspreadDeliveryCalenderFullIcon;

	@FindBy(xpath = "//td[@class='k-today k-state-focused']/a")
	private WebElement OrderPageCreateGroundspreadDeliveryCalenderFullIconTodaysfocausdate;

	String filepath = "./ExcelFile/Gibsons_Connect_TestData.xlsx";
	String sheetname = "GroundSpreadorder";

	Generic_Service generic = new Generic_Service();

	public GroundSpreadOders_Base_Page() {
		PageFactory.initElements(driver, this);
	}

	public void NavigateToOrders()

	{

		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		OrdersMenuBar.click();
		generic.ExplicitWait(8);
		OrdersMenuBarOrders.click();
		generic.ExplicitWait(7);
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		
		

	}

	@FindBy(xpath = "(//span[@class='k-input'][contains(text(),'Select One')])[1]")
	private WebElement OrderPageCreateGroundspreadOrderSelectaDivison;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[4]")
	private WebElement OrderPageCreateOrderGroundspreadDivison;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[5]")
	private WebElement OrderPageCreateOrderLogisticsDivison;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[2]")
	private WebElement OrderPageCreateOrderDarrimanLimeDivison;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[7]")
	private WebElement OrderPageCreateOrderMaryvaleDivison;

	public void CreatenewGroundSpreadOrder()
			throws AWTException, InvalidFormatException, IOException, InterruptedException 
	{

		

		// -----------Change in order flow---------------------------//

		/*
		 * @FindBy(xpath=
		 * "//span[@class='menu-title'][contains(text(),'Orders')]") private
		 * WebElement OrdersMenuBar;
		 * 
		 * 
		 * @FindBy(xpath=
		 * "(//span[@class='submenu-title'][contains(text(),'Orders')])[1]")
		 * private WebElement OrdersMenuBarOrders;
		 * 
		 * @FindBy(xpath=
		 * "(//span[@class='k-input'][contains(text(),'Select One')])[1]")
		 * private WebElement OrderPageCreateGroundspreadOrderSelectaDivison;
		 * 
		 * 
		 * @FindBy(xpath="//ul[@id='entityList_listbox']/li[4]") private
		 * WebElement OrderPageCreateOrderGroundspreadDivison;
		 * 
		 * @FindBy(xpath="//ul[@id='entityList_listbox']/li[5]") private
		 * WebElement OrderPageCreateOrderLogisticsDivison;
		 * 
		 * 
		 * @FindBy(xpath="//ul[@id='entityList_listbox']/li[2]") private
		 * WebElement OrderPageCreateOrderDarrimanLimeDivison;
		 * 
		 * @FindBy(xpath="//ul[@id='entityList_listbox']/li[7]") private
		 * WebElement OrderPageCreateOrderMaryvaleDivison;
		 */
		
		
		
		
		
		

		generic.ExplicitWait(5);
		OrderPageCreateNewOrder.click();
		generic.ExplicitWait(5);
		OrderPageGroundspreadIcon.click();
		generic.ExplicitWait(7);
		OrderPageCreateGroundspreadSearchBar.sendKeys("ace");
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadSearchBarAce3.click();
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadGobutton.click();
		generic.ExplicitWait(5);
		
		

		// ---------------------------------------------------------//

		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageDeliveryBar.click();

		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		act.clickAndHold(OrderPageCreateGroundspreadDeliveryCalenderFullIcon);
		generic.ExplicitWait(10);
		OrderPageCreateGroundspreadDeliveryCalenderFullIconTodaysfocausdate.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageFarmAndLocationBar.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageFarmAndLocationSelectFarmLocation.click();
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadCreatePageFarmAndLocationSelectFarmLocationAce3.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageSelectPaddocks.click();
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(5);

		String comment = generic.GetExcelSheetStringCellValue(filepath, sheetname, 6, 3);
		System.out.println(comment);
		OrderPageCreateGroundspreadCreatePagePaddockComments.sendKeys(comment);
		generic.ExplicitWait(5);

		String totalarea = OrderPageCreateGroundspreadCreatePageCaptureTotalAreaPaddock.getText();
		System.out.println("Peddocks :" + totalarea);
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageProductbar.click();
		generic.ExplicitWait(3);
		OrderPageCreateGroundspreadCreatePageProductAddbutton.click();
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadCreatePageProductSearchAProductByName.sendKeys("0-0-25-10 Mg7.5");
		generic.ExplicitWait(10);

		OrderPageCreateGroundspreadCreatePageProductSearchAProductByName10.click();
		generic.ExplicitWait(7);
		OrderPageCreateGroundspreadCreatePageProductApplication.click();
		generic.ExplicitWait(6);

		OrderPageCreateGroundspreadCreatePageProductApplication100.click();
		generic.ExplicitWait(7);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 4, 3);
		System.out.println(weight);
		OrderPageCreateGroundspreadCreatePageProductWeight.sendKeys(weight + "");
		generic.ExplicitWait(5);

		String Price = OrderPageCreateGroundspreadCreatePageCaptureTotalPrice.getText();
		System.out.println("Total Price is " + Price);
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageNotesBar.click();
		generic.ExplicitWait(3);
		OrderPageCreateGroundspreadCreatePageAddNotes.click();
		generic.ExplicitWait(3);

		String ordernotes = generic.GetExcelSheetStringCellValue(filepath, sheetname, 7, 3);
		System.out.println(ordernotes);
		OrderPageCreateGroundspreadCreatePageAddNotesTextArea.sendKeys(ordernotes);
		generic.ExplicitWait(3);

		OrderPageCreateGroundspreadCreatePageAddNotesSave.click();
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);

		OrderPageCreateGroundspreadCreatePageCreateOrderButton.click();
		generic.ExplicitWait(5);

		System.out.println("Ground spread Order created successfully");

	}

	@FindBy(xpath = "//div[@id='depotDropDown']/span")
	private WebElement OrderPageGroundspraedorderMainpageDepotdropdown;

	@FindBy(xpath = "//ul[@id='depotList_listbox']/li[1]")
	private WebElement OrderPageGroundspraedorderMainpageDepotAll;

	@FindBy(xpath = "(//button[@class='fa-edit fa g-icon grid-button-style-edit gb-or-edi-btn'])[21]")
	private WebElement OrderPageGroundspraedorderMainpageEditorder;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Update Order')]")
	private WebElement OrderPageGroundspraedorderMainpageUpdateorder;

	public void editGroundspreadOrder() {

		OrderPageGroundspraedorderMainpageDepotdropdown.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageDepotAll.click();
		generic.ExplicitWait(7);
		OrderPageGroundspraedorderMainpageEditorder.click();
		generic.ExplicitWait(7);
		OrderPageCreateGroundspreadCreatePageProductbar.click();
		generic.ExplicitWait(7);
		OrderPageCreateGroundspreadCreatePageProductWeight.clear();
		int newweight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 8, 3);
		System.out.println(newweight);
		OrderPageCreateGroundspreadCreatePageProductWeight.sendKeys(newweight + "");
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageUpdateorder.click();

	}

	@FindBy(xpath = "(//button[@class='fa-clipboard fa g-icon grid-button-style gb-or-ass-btn'])[21]")
	private WebElement OrderPageGroundspraedorderMainpageClickAssignorder;

	@FindBy(xpath = "//div[@id='product_1']/div")
	private WebElement OrderPageGroundspraedorderMainpageClickBookorder;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[8]")
	private WebElement OrderPageGroundspraedorderMainpageEquipmentforbooking;

	@FindBy(xpath = "//ul[@id='equipmentName_listbox']/li[6]")
	private WebElement OrderPageGroundspraedorderMainpageSelect1stEquipmentforbooking;

	@FindBy(xpath = "//ul[@id='equipmentName_listbox']/li[5]")
	private WebElement OrderPageGroundspraedorderMainpageSelect2ndEquipmentforbooking;

	@FindBy(xpath = "//span[@class='k-dropdown-wrap k-state-default k-state-hover']")
	private WebElement OrderPageGroundspraedorderMainpageDriverforbooking;

	@FindBy(xpath = "//ul[@id='driverName_listbox']/li[4]")
	private WebElement OrderPageGroundspraedorderMainpageSelectDriverforbooking;

	@FindBy(xpath = "")
	private WebElement OrderPageGroundspraedorderMainpageweightforbooking;

	@FindBy(xpath = "(//div[@id='product_'])[2]")
	private WebElement OrderPageGroundspraedorderMainpageWeightoutsideclick;

	@FindBy(xpath = "//input[@id='mgrEstimatedTime']")
	private WebElement OrderPageGroundspraedorderMainpageManagerEstimatedDuration;

	@FindBy(xpath = "(//input[@type='checkbox'])[18]")
	private WebElement OrderPageGroundspraedorderMainpageManagerConfirmwithcustomer;

	@FindBy(xpath = "//input[@id='tonsRemaining']")
	private WebElement OrderPageGroundspraedorderMainpageTonnsremaining;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'][contains(text(),'Done')])[2]")
	private WebElement OrderPageGroundspraedorderMainpageDone;

	@FindBy(xpath = "//span[@id='t_42321_0_4']")
	private WebElement OrderPageGroundspraedorderTonnsRemainingafterassigment;

	@FindBy(xpath = "//div[@id='btnAssignOrder']")
	private WebElement OrderPageGroundspraedorderAssignOrderButton;

	public void assignGroundspreadOrder() {
		int TotalweightofOrder = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 8, 3);
		System.out.println(TotalweightofOrder);

		int orderdivide = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 9, 3);
		System.out.println(orderdivide);

		int order1 = TotalweightofOrder / orderdivide;
		System.out.println(order1);

		int managertime = 100;
		OrderPageGroundspraedorderMainpageDepotdropdown.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageDepotAll.click();
		generic.ExplicitWait(7);

		OrderPageGroundspraedorderMainpageClickAssignorder.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageClickBookorder.click();
		generic.ExplicitWait(8);
		OrderPageGroundspraedorderMainpageEquipmentforbooking.click();
		generic.ExplicitWait(8);
		OrderPageGroundspraedorderMainpageSelect1stEquipmentforbooking.click();
		generic.ExplicitWait(5);

		generic.ExplicitWait(8);
		WebElement ele = driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[2]"));
		Actions act = new Actions(driver);
		act.doubleClick(ele);
		generic.ExplicitWait(5);
		act.click().sendKeys(Keys.BACK_SPACE);
		act.sendKeys("" + order1).build().perform();

		OrderPageGroundspraedorderMainpageWeightoutsideclick.click();

		generic.ExplicitWait(8);
		WebElement ele1 = driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[3]"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(ele1);
		generic.ExplicitWait(5);
		act1.sendKeys("" + managertime).build().perform();

		OrderPageGroundspraedorderMainpageWeightoutsideclick.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageManagerConfirmwithcustomer.click();
		generic.ExplicitWait(5);
		String remainingweight = OrderPageGroundspraedorderMainpageTonnsremaining.getAttribute("value");
		generic.ExplicitWait(8);
		System.out.println("Remaining weight is: " + remainingweight);
		generic.ExplicitWait(8);
		OrderPageGroundspraedorderMainpageDone.click();

		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageClickBookorder.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageEquipmentforbooking.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageSelect2ndEquipmentforbooking.click();
		generic.ExplicitWait(5);

		generic.ExplicitWait(8);
		WebElement ele2 = driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[2]"));
		Actions act2 = new Actions(driver);
		act2.doubleClick(ele2);
		generic.ExplicitWait(5);
		act2.click().sendKeys(Keys.BACK_SPACE);
		act2.sendKeys("" + remainingweight).build().perform();

		OrderPageGroundspraedorderMainpageWeightoutsideclick.click();

		generic.ExplicitWait(8);
		WebElement elen = driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[3]"));
		Actions actn = new Actions(driver);
		actn.doubleClick(elen);
		generic.ExplicitWait(5);
		actn.sendKeys("" + managertime).build().perform();

		OrderPageGroundspraedorderMainpageManagerConfirmwithcustomer.click();
		generic.ExplicitWait(5);

		OrderPageGroundspraedorderMainpageDone.click();
		generic.ExplicitWait(5);

		OrderPageGroundspraedorderAssignOrderButton.click();
		generic.ExplicitWait(5);

	}

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement OrderPageGroundspraedorderMainpageorderstatusdropdown;

	@FindBy(xpath = "//ul[@id='ReadyForAssignment_listbox']/li[3]")
	private WebElement OrderPageGroundspraedorderMainpageorderstatusreadyfordelievrySelect;

	@FindBy(xpath = "(//button[@class='fa-truck fa g-icon grid-button-style gb-or-dis-btn'])[21]")
	private WebElement OrderPageGroundspraedorderMainpagedispatch;

	@FindBy(xpath = "(//button[@class='btn btn-primary k-button'])[3]")
	private WebElement OrderPageGroundspraedorderMainpagedispatchCreateEditticket1;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Enter Ticket')]")
	private WebElement OrderPageGroundspraedorderMainpagedispatchCreateEntertticket;

	@FindBy(xpath = "//div[@class='k-button dashboarddeletebtn'][contains(text(),'Back')]")
	private WebElement OrderPageGroundspraedorderMainpagedispatchCreateBacktticket;

	@FindBy(xpath = "(//button[@class='btn btn-primary k-button'])[1]")
	private WebElement OrderPageGroundspraedorderMainpagedispatchCreateEditticket2;
	
	
	@FindBy(xpath = "//span[@class='k-icon k-i-clock']")
	private WebElement OrderPageGroundspraedorderMainpagedispatchCreateEditticketDispatchTimeClockIcon;
	
	
	
	@FindBy(xpath = "//ul[@id='dispatchDt_timeview']/li[15]")
	private WebElement OrderPageGroundspraedorderMainpagedispatchCreateEditticketDispatchTimeSelect;
	
	

	public void CreateMixticketGroundspreadOrder() {

		OrderPageGroundspraedorderMainpageDepotdropdown.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageDepotAll.click();
		generic.ExplicitWait(7);

		OrderPageGroundspraedorderMainpageorderstatusdropdown.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpageorderstatusreadyfordelievrySelect.click();
		generic.ExplicitWait(5);

		OrderPageGroundspraedorderMainpagedispatch.sendKeys(Keys.ENTER);
		generic.ExplicitWait(5);

		OrderPageGroundspraedorderMainpagedispatchCreateEditticket1.click();
		generic.ExplicitWait(5);

		
		
		
		OrderPageGroundspraedorderMainpagedispatchCreateEditticketDispatchTimeClockIcon.click();
		generic.ExplicitWait(5);
		
		
		
		OrderPageGroundspraedorderMainpagedispatchCreateEditticketDispatchTimeSelect.click();
		
		generic.ExplicitWait(5);
		
		
		
		
		
		OrderPageGroundspraedorderMainpagedispatchCreateEntertticket.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpagedispatchCreateBacktticket.click();
		generic.ExplicitWait(5);

		OrderPageGroundspraedorderMainpagedispatchCreateEditticket2.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpagedispatchCreateEntertticket.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderMainpagedispatchCreateBacktticket.click();

	}

	@FindBy(xpath = "//span[@class='k-widget k-dropdown k-header']/span[1]")
	private WebElement OrderPageGroundspraedorderTrukietruckdropdown;

	@FindBy(xpath = "//ul[@id='truckSelector_listbox']/li[7]")
	private WebElement OrderPageGroundspraedorderTrukietruck1stdropdownSelect;

	@FindBy(xpath = "//ul[@id='truckSelector_listbox']/li[8]")
	private WebElement OrderPageGroundspraedorderTrukietruck2nddropdownSelect;

	@FindBy(xpath = "//input[@id='rdBtnYesAssignAdditionalEquipment']")
	private WebElement OrderPageGroundspraedorderTrukietrailerloaderfloateryesbutton;

	@FindBy(xpath = "//select[@id='loaderSelector_0']")
	private WebElement OrderPageGroundspraedorderTrukieifyesforloaderfloterdropdown;

	@FindBy(xpath = "//select[@id='loaderSelector_0']//option[@value='1186']")
	private WebElement OrderPageGroundspraedorderTrukieifyesforloaderfloterSelect;

	@FindBy(xpath = "//div[@class='btn btn-primary button-size k-button'][contains(text(),'Start Your Day')]")
	private WebElement OrderPageGroundspraedorderTrukieStartYourDay;

	@FindBy(xpath = "(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleStartHour;

	@FindBy(xpath = "(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleStartKm;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[3]/button[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleBrakesSteeringOperatingYes;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[3]/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleBrakesSteeringOperatingNo;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[4]/button[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleGaugesLightsYes;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[4]/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleGaugesLightsNo;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[5]/button[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleWindscreenMirrorsWindowsYes;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[5]/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleWindscreenMirrorsWindowsNo;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[6]/button[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleAccessEgressYes;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[6]/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleAccessEgressNo;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[7]/button[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleSeatSeatbeltYes;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[7]/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleSeatSeatbeltNo;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[8]/button[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleWheelsTyresNutsDamageWearYes;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[8]/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleWheelsTyresNutsDamageWearNo;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[9]/button[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleHydraulics_RamsHosesDamageWearYes;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[9]/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleHydraulics_RamsHosesDamageWearNo;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[10]/button[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleOil_CoolantLevelsYes;

	@FindBy(xpath = "(//td[@class='checklist-style-td'])[10]/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleOil_CoolantLevelsNo;

	@FindBy(xpath = "//div[@id='btnCompleteChecklist']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompleteCHecklistNext;

	@FindBy(xpath = "//button[@id='12_cq_yes']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompleteCHecklistNextLoaderprestartchceklistq1Yes;

	@FindBy(xpath = "//button[@id='12_cq_no']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompleteCHecklistNextLoaderprestartchceklistq1No;

	@FindBy(xpath = "//a[@type='button']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompleteCHecklistNextLoaderprestartchceklistqBack;

	@FindBy(xpath = "//div[@id='btnCompleteChecklist']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompleteCHecklistNextLoaderprestartchceklistComplete;

	@FindBy(xpath = "//a[@type='button']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompleteCHecklistBack;

	@FindBy(xpath = "//div[@id='jobsDiv']//td[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleJob;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button button-size'][contains(text(),'Navigate to Pickup')]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleNavigateToPickUp;

	@FindBy(xpath = "//div[@id='onLeavingDepotStatus']/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleNavigateToPickUpBack;

	@FindBy(xpath = "//div[@id='onLeavingDepotStatus']/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleJobLeaveBack;

	@FindBy(xpath = "//div[@id='leavingDepotConfirmation']/div[2]/div[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobstartYes;

	@FindBy(xpath = "//div[@id='leavingDepotConfirmation']/div[2]/div[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobstartNo;

	@FindBy(xpath = "//div[@id='btnArrivedOnSite']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobArivedOnSite;

	@FindBy(xpath = "//div[@id='arrivedOnSiteSection']/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobArivedOnSiteBack;

	@FindBy(xpath = "(//button[@class='k-button dashboarddeletebtn'])[8]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistqBack;

	@FindBy(xpath = "//button[@id='227_cq_yes']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq1Yes;

	@FindBy(xpath = "//button[@id='227_cq_no']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq1No;

	@FindBy(xpath = "//button[@id='228_cq_yes']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq2Yes;

	@FindBy(xpath = "//button[@id='228_cq_no']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq2No;

	@FindBy(xpath = "//button[@id='229_cq_yes']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq3Yes;

	@FindBy(xpath = "//button[@id='229_cq_no']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq3No;

	@FindBy(xpath = "//button[@id='230_cq_yes']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq4Yes;

	@FindBy(xpath = "//button[@id='230_cq_no']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq4No;

	@FindBy(xpath = "//button[@id='231_cq_yes']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq5Yes;

	@FindBy(xpath = "//button[@id='231_cq_no']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq5No;

	@FindBy(xpath = "//button[@id='232_cq_yes']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq6Yes;

	@FindBy(xpath = "//button[@id='232_cq_no']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq6No;

	@FindBy(xpath = "//button[@id='233_cq_yes']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq7Yes;

	@FindBy(xpath = "//button[@id='233_cq_no']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq7No;

	@FindBy(xpath = "//div[@id='startJob']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJob;

	@FindBy(xpath = "//a[@class='k-link'][contains(text(),'Job Details')]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJobJobDetails;

	@FindBy(xpath = "//div[@id='part7Tab']//li[3]/a[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJobGoogleMap;

	@FindBy(xpath = "(//li[@class='k-item k-state-default k-last'])[1]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJobFarmMap;

	@FindBy(xpath = "//div[@id='addPadocksId']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJobAddPaddock;

	@FindBy(xpath = "//input[@id='9351_pd_cq_sp_cb']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJobAddPaddockP1;

	@FindBy(xpath = "//input[@id='9352_pd_cq_sp_cb']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJobAddPaddockP2;

	@FindBy(xpath = "//div[@class='k-button dashboarddeletebtn popup-button-left'][contains(text(),'Cancel')]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJobAddPaddockALertCancel;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button popup-button-right'][contains(text(),'Add')]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJobAddPaddockALertAdd;

	@FindBy(xpath = "//div[@id='paddocksSpreadingDiv1']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingPeddockNotes;

	@FindBy(xpath = "//div[@id='completeJob1']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJob;

	@FindBy(xpath = "//div[@id='returnToDepot']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobReturntodepot;

	@FindBy(xpath = "//div[@id='navigateToOtherJob']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobNavigateToanotherJob;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button popup-button-right'][contains(text(),'Yes')]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobRetrunTodeporoutedDepotLocationYes;

	@FindBy(xpath = "//div[@class='k-button dashboarddeletebtn popup-button-left'][contains(text(),'No')]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobRetrunTodeporoutedDepotLocationNo;

	@FindBy(xpath = "//div[@id='onArrivedOnDepot']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobRetrunTodepoArrDEpo;

	@FindBy(xpath = "//div[@class='gb-panel-border']/div[@class='gb-clearBoth gb-panel-small-border']/button[2]")
	private WebElement OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobRetrunTodepoArrDEpoBack;

	@FindBy(xpath = "//span[@id='distanceDriven']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobCaptureDistanceDrivenKm;

	@FindBy(xpath = "//span[@id='hoursSpread']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobCaptureHrSpent;

	@FindBy(xpath = "//span[@id='tonnesSpread']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobCapturetonspread;

	@FindBy(xpath = "//span[@id='areaSpread']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobCaptureCoverdArea;

	@FindBy(xpath = "//div[@class='text-right']//button[@class='k-button dashboarddeletebtn']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageBack;

	@FindBy(xpath = "(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[3]/span")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobEnterfuel;

	@FindBy(xpath = "(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[4]/span")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobEnterKm;

	@FindBy(xpath = "//a[@class='btn btn-primary k-button']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDay;

	@FindBy(xpath = "//input[@id='finishDayHours']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDayHr;

	@FindBy(xpath = "//input[@id='finishDayKM']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDayKm;

	@FindBy(xpath = "//textarea[@id='finishDayNotes']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDayNotes;

	@FindBy(xpath = "//div[@id='btnFinishDay']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDayFinish;

	@FindBy(xpath = "//div[@id='btnFinishDayCancle']")
	private WebElement OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDayBack;

	public void trukieComplete1stJobGroundspreadorder() {

		generic.ExplicitWait(8);
		OrderPageGroundspraedorderTrukietruckdropdown.click();

		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukietruck1stdropdownSelect.click();
		generic.ExplicitWait(5);

		OrderPageGroundspraedorderTrukieStartYourDay.click();
		generic.ExplicitWait(5);

		int startHr = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 14, 3);
		System.out.println(startHr);
		WebElement e = driver.findElement(
				By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[1]"));
		Actions a = new Actions(driver);
		a.doubleClick(e);
		a.sendKeys("" + startHr).build().perform();

		int startkm = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 15, 3);
		System.out.println(startkm);
		WebElement e1 = driver.findElement(
				By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[2]"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1);
		a1.sendKeys("" + startkm).build().perform();

		OrderPageGroundspraedorderTrukieVehicleBrakesSteeringOperatingYes.click();

		OrderPageGroundspraedorderTrukieVehicleGaugesLightsYes.click();

		OrderPageGroundspraedorderTrukieVehicleWindscreenMirrorsWindowsYes.click();

		OrderPageGroundspraedorderTrukieVehicleAccessEgressYes.click();

		OrderPageGroundspraedorderTrukieVehicleSeatSeatbeltYes.click();

		OrderPageGroundspraedorderTrukieVehicleWheelsTyresNutsDamageWearYes.click();

		OrderPageGroundspraedorderTrukieVehicleHydraulics_RamsHosesDamageWearYes.click();

		OrderPageGroundspraedorderTrukieVehicleOil_CoolantLevelsYes.click();

		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleCompleteCHecklistNext.click();

		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieVehicleJob.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleNavigateToPickUp.click();

		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobstartYes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobArivedOnSite.click();
		generic.ExplicitWait(1);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq1Yes.click();
		generic.ExplicitWait(1);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq2Yes.click();
		generic.ExplicitWait(1);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq3Yes.click();
		generic.ExplicitWait(1);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq4Yes.click();
		generic.ExplicitWait(1);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq5Yes.click();
		generic.ExplicitWait(1);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq6Yes.click();
		generic.ExplicitWait(1);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq7Yes.click();
		generic.ExplicitWait(1);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJob.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJob.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobReturntodepot.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobRetrunTodeporoutedDepotLocationYes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobRetrunTodepoArrDEpo.click();
		generic.ExplicitWait(3);
		generic.WebPageScrollDown(driver);
		String drivenkm = OrderPageGroundspraedorderTrukieVehicleCompletejobCaptureDistanceDrivenKm.getText();
		System.out.println(drivenkm);
		generic.ExplicitWait(3);
		String hrspent = OrderPageGroundspraedorderTrukieVehicleCompletejobCaptureHrSpent.getText();
		System.out.println(hrspent);
		generic.ExplicitWait(3);
		String tonspread = OrderPageGroundspraedorderTrukieVehicleCompletejobCapturetonspread.getText();
		System.out.println(tonspread);
		generic.ExplicitWait(3);
		String areaCoverd = OrderPageGroundspraedorderTrukieVehicleCompletejobCaptureCoverdArea.getText();
		System.out.println(areaCoverd);
		generic.ExplicitWait(3);

		generic.ExplicitWait(5);
		int enterfuel = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 16, 3);
		System.out.println(enterfuel);
		WebElement fuel = driver.findElement(
				By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[3]/span"));
		Actions ac = new Actions(driver);
		ac.doubleClick(fuel);
		ac.sendKeys("" + enterfuel).build().perform();

		generic.ExplicitWait(5);
		int enteradblue = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 16, 3);
		System.out.println(enterfuel);
		WebElement adbuel = driver.findElement(
				By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[4]/span"));
		Actions action = new Actions(driver);
		action.doubleClick(adbuel);
		action.sendKeys("" + enteradblue).build().perform();

		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDay.click();

		int finishdayhr = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 20, 3);
		System.out.println(finishdayhr);
		generic.ExplicitWait(5);
		WebElement finishr = driver
				.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox k-input'])[1]/span"));
		Actions as1 = new Actions(driver);
		as1.doubleClick(finishr);
		as1.sendKeys("" + finishdayhr).build().perform();

		generic.ExplicitWait(3);
		int finishdaykm = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 19, 3);
		System.out.println(finishdaykm);
		generic.ExplicitWait(5);
		WebElement finishkm = driver
				.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox k-input'])[2]/span"));
		Actions as = new Actions(driver);
		as.doubleClick(finishkm);
		as.sendKeys("" + finishdaykm).build().perform();

		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDayFinish.click();
		generic.ExplicitWait(8);

	}

	public void trukieComplete2ndJobGroundspreadorder() {

		generic.ExplicitWait(8);
		OrderPageGroundspraedorderTrukietruckdropdown.click();

		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukietruck2nddropdownSelect.click();
		generic.ExplicitWait(5);

		OrderPageGroundspraedorderTrukieStartYourDay.click();
		generic.ExplicitWait(5);

		int startHr = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 14, 3);
		System.out.println(startHr);
		WebElement e = driver.findElement(
				By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[1]"));
		Actions a = new Actions(driver);
		a.doubleClick(e);
		a.sendKeys("" + startHr).build().perform();

		int startkm = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 15, 3);
		System.out.println(startkm);
		WebElement e1 = driver.findElement(
				By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[2]"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1);
		a1.sendKeys("" + startkm).build().perform();

		OrderPageGroundspraedorderTrukieVehicleBrakesSteeringOperatingYes.click();

		OrderPageGroundspraedorderTrukieVehicleGaugesLightsYes.click();

		OrderPageGroundspraedorderTrukieVehicleWindscreenMirrorsWindowsYes.click();

		OrderPageGroundspraedorderTrukieVehicleAccessEgressYes.click();

		OrderPageGroundspraedorderTrukieVehicleSeatSeatbeltYes.click();

		OrderPageGroundspraedorderTrukieVehicleWheelsTyresNutsDamageWearYes.click();

		OrderPageGroundspraedorderTrukieVehicleHydraulics_RamsHosesDamageWearYes.click();

		OrderPageGroundspraedorderTrukieVehicleOil_CoolantLevelsYes.click();

		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleCompleteCHecklistNext.click();

		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieVehicleJob.click();

		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleNavigateToPickUp.click();

		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobstartYes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobArivedOnSite.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq1Yes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq2Yes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq3Yes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq4Yes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq5Yes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq6Yes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingChecklistq7Yes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingStartJob.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJob.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobReturntodepot.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobRetrunTodeporoutedDepotLocationYes.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleRoutedtoJobUnloadingFinishJobRetrunTodepoArrDEpo.click();
		generic.ExplicitWait(3);
		generic.WebPageScrollDown(driver);
		String drivenkm = OrderPageGroundspraedorderTrukieVehicleCompletejobCaptureDistanceDrivenKm.getText();
		System.out.println(drivenkm);
		generic.ExplicitWait(3);
		String hrspent = OrderPageGroundspraedorderTrukieVehicleCompletejobCaptureHrSpent.getText();
		System.out.println(hrspent);
		generic.ExplicitWait(3);
		String tonspread = OrderPageGroundspraedorderTrukieVehicleCompletejobCapturetonspread.getText();
		System.out.println(tonspread);
		generic.ExplicitWait(3);
		String areaCoverd = OrderPageGroundspraedorderTrukieVehicleCompletejobCaptureCoverdArea.getText();
		System.out.println(areaCoverd);
		generic.ExplicitWait(3);

		generic.ExplicitWait(5);
		int enterfuel = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 16, 3);
		System.out.println(enterfuel);
		WebElement fuel = driver.findElement(
				By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[3]/span"));
		Actions ac = new Actions(driver);
		ac.doubleClick(fuel);
		ac.sendKeys("" + enterfuel).build().perform();

		generic.ExplicitWait(5);
		int enteradblue = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 16, 3);
		System.out.println(enterfuel);
		WebElement adbuel = driver.findElement(
				By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[4]/span"));
		Actions action = new Actions(driver);
		action.doubleClick(adbuel);
		action.sendKeys("" + enteradblue).build().perform();

		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDay.click();

		int finishdayhr = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 20, 3);
		System.out.println(finishdayhr);
		generic.ExplicitWait(5);
		WebElement finishr = driver
				.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox k-input'])[1]/span"));
		Actions as1 = new Actions(driver);
		as1.doubleClick(finishr);
		as1.sendKeys("" + finishdayhr).build().perform();

		generic.ExplicitWait(3);
		int finishdaykm = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 19, 3);
		System.out.println(finishdaykm);
		generic.ExplicitWait(5);
		WebElement finishkm = driver
				.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox k-input'])[2]/span"));
		Actions as = new Actions(driver);
		as.doubleClick(finishkm);
		as.sendKeys("" + finishdaykm).build().perform();

		generic.ExplicitWait(3);
		OrderPageGroundspraedorderTrukieVehicleCompletejobMainPageFinishYourDayFinish.click();
		generic.ExplicitWait(8);

	}

	@FindBy(xpath = "//div[@class='btn btn-primary center-block k-button']")
	private WebElement OrderPageGroundspraedorderPageFarmhistoryCloseButton;

	@FindBy(xpath = "//div[@id='farmHistoryWindow']")
	private WebElement OrderPageGroundspraedorderPageFarmhistoryWindow;

	public void ValidationForFramhistory() throws IOException {

		generic.ExplicitWait(5);
		OrderPageCreateNewOrder.click();
		generic.ExplicitWait(5);
		OrderPageGroundspreadIcon.click();
		generic.ExplicitWait(7);
		OrderPageCreateGroundspreadSearchBar.sendKeys("ace");
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadSearchBarAce3.click();
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadGobutton.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageFarmAndLocationBar.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageFarmAndLocationSelectFarmLocation.click();
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadCreatePageFarmAndLocationSelectFarmLocationAce3.click();

		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadCreatePageFarmAndLocationFarmHistorytab.click();

		generic.ExplicitWait(5);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//div[@id='farmHistoryWindow']")));
		OrderPageGroundspraedorderPageFarmhistoryCloseButton.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageFarmAndLocationFramMap.click();
		generic.ExplicitWait(5);

		driver.navigate().back();

		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		BufferedImage image = screenshot.getImage();

		ImageIO.write(image, "PNG", new File("./Screenshots/" + "Orderpage.png"));
		generic.ExplicitWait(5);

	}

	public void CreatenewGroundSpreadOrderWithAdditionalFee()
			throws AWTException, InvalidFormatException, IOException, InterruptedException 
	{

		generic.ExplicitWait(5);
		OrderPageCreateNewOrder.click();
		generic.ExplicitWait(5);
		OrderPageGroundspreadIcon.click();
		generic.ExplicitWait(7);
		OrderPageCreateGroundspreadSearchBar.sendKeys("ace");
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadSearchBarAce3.click();
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadGobutton.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageDeliveryBar.click();

		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		act.clickAndHold(OrderPageCreateGroundspreadDeliveryCalenderFullIcon);
		generic.ExplicitWait(10);
		OrderPageCreateGroundspreadDeliveryCalenderFullIconTodaysfocausdate.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageFarmAndLocationBar.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageFarmAndLocationSelectFarmLocation.click();
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadCreatePageFarmAndLocationSelectFarmLocationAce3.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageSelectPaddocks.click();
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(5);

		String comment = generic.GetExcelSheetStringCellValue(filepath, sheetname, 6, 3);
		System.out.println(comment);
		OrderPageCreateGroundspreadCreatePagePaddockComments.sendKeys(comment);
		generic.ExplicitWait(5);

		String totalarea = OrderPageCreateGroundspreadCreatePageCaptureTotalAreaPaddock.getText();
		System.out.println("Peddocks :" + totalarea);
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageProductbar.click();
		generic.ExplicitWait(3);
		OrderPageCreateGroundspreadCreatePageProductAddbutton.click();
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadCreatePageProductSearchAProductByName.sendKeys("1-1");
		generic.ExplicitWait(7);
		OrderPageCreateGroundspreadCreatePageProductSearchAProductFocuslist.click();
		generic.ExplicitWait(7);
		OrderPageCreateGroundspreadCreatePageProductApplicationDropdown.click();
		generic.ExplicitWait(6);

		OrderPageCreateGroundspreadCreatePageProductApplication100.click();
		generic.ExplicitWait(7);

		OrderPageCreateGroundspreadCreatePageProductAdditionalCostAdd.click();
		generic.ExplicitWait(7);
		OrderPageCreateGroundspreadCreatePageProductAdditionalCostType.click();
		generic.ExplicitWait(7);

		OrderPageCreateGroundspreadCreatePageProductAdditionalCostTypeSelect.click();
		generic.ExplicitWait(7);

		OrderPageCreateGroundspreadCreatePageProductAdditionalCostRate.click();
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageProductAdditionalCostRateSelect.click();
		generic.ExplicitWait(5);

		int unitforaddcost = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 10, 3);
		System.out.println(unitforaddcost);
		OrderPageCreateGroundspreadCreatePageProductAdditionalCostUnits.sendKeys(unitforaddcost + "");
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageProductAdditionalCostPaymentTerms.click();
		generic.ExplicitWait(5);
		OrderPageCreateGroundspreadCreatePageProductAdditionalPaymentTermSelect.click();
		generic.ExplicitWait(5);
		
		
		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 4, 3);
		System.out.println(weight);
		OrderPageCreateGroundspreadCreatePageProductWeight.sendKeys(weight + "");
		generic.ExplicitWait(5);
		

		String Price = OrderPageCreateGroundspreadCreatePageCaptureTotalPrice.getText();
		System.out.println("Total Price is " + Price);
		generic.ExplicitWait(5);

		OrderPageCreateGroundspreadCreatePageNotesBar.click();
		generic.ExplicitWait(3);
		OrderPageCreateGroundspreadCreatePageAddNotes.click();
		generic.ExplicitWait(3);

		String ordernotes = generic.GetExcelSheetStringCellValue(filepath, sheetname, 7, 3);
		System.out.println(ordernotes);
		OrderPageCreateGroundspreadCreatePageAddNotesTextArea.sendKeys(ordernotes);
		generic.ExplicitWait(3);

		OrderPageCreateGroundspreadCreatePageAddNotesSave.click();
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);

		OrderPageCreateGroundspreadCreatePageCreateOrderButton.click();
		generic.ExplicitWait(5);

		System.out.println("Ground spread Order created with additional fee successfully");

	}

}
