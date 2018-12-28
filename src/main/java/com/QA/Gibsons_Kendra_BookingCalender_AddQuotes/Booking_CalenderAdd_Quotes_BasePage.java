package com.QA.Gibsons_Kendra_BookingCalender_AddQuotes;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


public class Booking_CalenderAdd_Quotes_BasePage extends Generic_Service {
	@FindBy(xpath = "//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;

	@FindBy(xpath = "//a[@id='Booking']/span[1]")
	private WebElement BookingsMenuBar;

	@FindBy(xpath = "//ul[@id='side-menu']/li[6]/ul/li[1]/a/span")
	private WebElement BookingsMenuBarBookings;

	@FindBy(xpath = "//div[@srname='ORDERS_WRITE'][contains(text(),'Add Quote')]")
	private WebElement BookingCalendarMainPageAddQuotes;

	@FindBy(xpath = "//div[@class='btn btn-motif k-button']")
	private WebElement BookingCalendarMainPageAddQuotesTypesCancel;

	Generic_Service generic = new Generic_Service();

	public Booking_CalenderAdd_Quotes_BasePage() {
		PageFactory.initElements(driver, this);
	}

	String filepath = "./ExcelFile/Gibsons_Connect_TestData.xlsx";
	String sheetname = "GroundSpreadorder";

	@FindBy(xpath = "//div[@id='5612_Division_RoleDiv']")
	private WebElement BookingCalendarMainPageAddQuotesTypesPageGroundspreadIcon;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement BookingCalenderPageCreateQuotesGroundspreadSearchBar;

	@FindBy(xpath = "//ul[@id='part1AAC_listbox']/li[4]")
	private WebElement BookingCalenderPageCreateGroundspreadQuotesSearchBarAce3;

	@FindBy(xpath = "(//div[@id='part1A']/div/div/div)[2]")
	private WebElement BookingCalenderPageCreateGroundspreadQuotesGobutton;

	@FindBy(xpath = "//div[@id='section4']")
	private WebElement BookingCalendarGroundspreadQuotesPageDeliveryBar;

	@FindBy(xpath = "//input[@id='deliveryDtPicker']")
	private WebElement BookingCalenderCreateGroundspreadQuotesPageDeliverySelectDate;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']//span[@unselectable='on']//span[@unselectable='on']")
	private WebElement BookingCalenderCreateGroundspreadQuotesPageDeliveryCalender;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement BookingCalenderCreateGroundspreadQuotesDeliveryCalenderIcon;

	@FindBy(xpath = "//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
	private WebElement BookingCalenderCreateGroundspreadQuotesDeliveryCalenderFullIcon;

	@FindBy(xpath = "//td[@class='k-today k-state-focused']/a")
	private WebElement BookingCalenderGroundspreadDeliveryQuotesCalenderFullIconTodaysfocausdate;

	@FindBy(xpath = "//div[@id='section2']")
	private WebElement BookingCalenderCreateGroundspreadQuotesFarmAndLocationBar;

	@FindBy(xpath = "//div[@id='fDIV']/span/span/span[2]/span")
	private WebElement BookingCalenderCreateGroundspreadQuotesFarmAndLocationSelectFarmLocation;

	@FindBy(xpath = "//ul[@id='farmsDD_listbox']/li[1]")
	private WebElement BookingCalenderCreateGroundspreadQuotesFarmAndLocationSelectFarmLocationAce3;

	@FindBy(xpath = "//input[@id='selectAllPaddockCB']")
	private WebElement BookingCalenderCreateGroundspreadQuotesSelectPaddocks;

	@FindBy(xpath = "//div[@id='pCDIV']/textarea")
	private WebElement BookingCalenderCreateGroundspreadQuotesPaddockComments;

	@FindBy(xpath = "//div[@id='farmsAndLocationContentDiv']/div[5]")
	private WebElement BookingCalenderCreateGroundspreadQuotesCaptureTotalAreaPaddock;

	@FindBy(xpath = "//div[@id='section3']")
	private WebElement BookingCalenderCreateGroundspreadQuotesPageProductbar;

	@FindBy(xpath = "//div[@id='productHeaderDiv']/div[2]/div[2]")
	private WebElement BookingCalenderCreateGroundspreadQuotesProductAddbutton;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement BookingCalenderCreateGroundspreadQuotesProductSearchAProducTdropDown;

	@FindBy(xpath = "//ul[@id='op_1_1_listbox']/li[4]")
	private WebElement BookingCalenderCreateGroundspreadQuotesProductSearchAProducTdropDownSelect;

	@FindBy(xpath = "//li[@tabindex='-1'][contains(text(),'0-0-25-10 Mg7.5')]")
	private WebElement BookingCalenderOrderPageCreateGroundspreadQuotesProductSearchAProductByName10;

	@FindBy(xpath = "//tr[@id='op_row_1']/td[2]/span[1]/span")
	private WebElement BookingCalenderCreateGroundspreadQuotesProductApplication;

	@FindBy(xpath = "//html//div[@id='op_1_2-list']//li[2]")
	private WebElement BookingCalenderCreateGroundspreadQuotesProductApplication100;

	@FindBy(xpath = "//input[@id='op_1_3']")
	private WebElement BookingCalenderCreateGroundspreadQuotesProductWeight;

	@FindBy(xpath = "//tr[@id='op_row_1']/td[4]")
	private WebElement BookingCalenderCreateGroundspreadQuotesCaptureTotalPrice;

	@FindBy(xpath = "//div[@id='section5']")
	private WebElement BookingCalenderGroundspreadQuotesNotesBar;

	@FindBy(xpath = "//div[@id='notesContentDiv']/a")
	private WebElement BookingCalenderCreateGroundspreadQuotesAddNotes;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/textarea")
	private WebElement BookingCalenderCreateGroundspreadQuotesAddNotesTextArea;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[2]")
	private WebElement BookingCalenderCreateGroundspreadQuotesAddNotesCancel;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement BookingCalenderCreateGroundspreadQuotesAddNotesSave;

	@FindBy(xpath = "//div[@id='btnCreateQuote']")
	private WebElement BookingCalenderCreateGroundspreadQuotesCreateQuotesButton;

	@FindBy(xpath = "//div[@id='5612_Division_RoleDiv']")
	private WebElement BookingCalenderCreateGroundspreadIcon;

	public void NavigateToBookings() {

		generic.ExplicitWait(6);
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		BookingsMenuBar.click();
		generic.ExplicitWait(5);
		BookingsMenuBarBookings.click();
		System.out.println("Navigate to Bookings Mainpage");
		generic.ExplicitWait(6);
		ToggleMenuBar.click();
		generic.ExplicitWait(6);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		generic.ExplicitWait(5);
	}

	public void createGroundspreadQuotesFromBookingCalender() throws InvalidFormatException, IOException {

		generic.ExplicitWait(3);
		BookingCalendarMainPageAddQuotes.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateGroundspreadIcon.click();
		generic.ExplicitWait(7);
		BookingCalenderPageCreateQuotesGroundspreadSearchBar.sendKeys("ace");
		generic.ExplicitWait(5);
		BookingCalenderPageCreateGroundspreadQuotesSearchBarAce3.click();
		generic.ExplicitWait(5);
		BookingCalenderPageCreateGroundspreadQuotesGobutton.click();
		generic.ExplicitWait(5);

		BookingCalendarGroundspreadQuotesPageDeliveryBar.click();

		generic.ExplicitWait(5);
		BookingCalenderCreateGroundspreadQuotesDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		act.clickAndHold(BookingCalenderCreateGroundspreadQuotesDeliveryCalenderFullIcon);
		generic.ExplicitWait(10);
		BookingCalenderGroundspreadDeliveryQuotesCalenderFullIconTodaysfocausdate.click();

		BookingCalenderCreateGroundspreadQuotesFarmAndLocationBar.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateGroundspreadQuotesFarmAndLocationSelectFarmLocation.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateGroundspreadQuotesFarmAndLocationSelectFarmLocationAce3.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateGroundspreadQuotesSelectPaddocks.click();
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(5);

		String comment = generic.GetExcelSheetStringCellValue(filepath, sheetname, 6, 3);
		System.out.println(comment);
		BookingCalenderCreateGroundspreadQuotesPaddockComments.sendKeys(comment);
		generic.ExplicitWait(5);

		String totalarea = BookingCalenderCreateGroundspreadQuotesCaptureTotalAreaPaddock.getText();
		System.out.println("Peddocks :" + totalarea);
		generic.ExplicitWait(5);

		BookingCalenderCreateGroundspreadQuotesPageProductbar.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateGroundspreadQuotesProductAddbutton.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateGroundspreadQuotesProductSearchAProducTdropDown.click();
		generic.ExplicitWait(4);
		BookingCalenderCreateGroundspreadQuotesProductSearchAProducTdropDownSelect.click();

		BookingCalenderCreateGroundspreadQuotesProductApplication.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateGroundspreadQuotesProductApplication100.click();
		generic.ExplicitWait(10);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 4, 3);
		System.out.println(weight);
		BookingCalenderCreateGroundspreadQuotesProductWeight.sendKeys(weight + "");
		generic.ExplicitWait(5);

		String Price = BookingCalenderCreateGroundspreadQuotesCaptureTotalPrice.getText();
		System.out.println("Total Price is " + Price);
		generic.ExplicitWait(5);

		BookingCalenderGroundspreadQuotesNotesBar.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateGroundspreadQuotesAddNotes.click();
		generic.ExplicitWait(3);

		String ordernotes = generic.GetExcelSheetStringCellValue(filepath, sheetname, 7, 3);
		System.out.println(ordernotes);
		BookingCalenderCreateGroundspreadQuotesAddNotesTextArea.sendKeys(ordernotes);
		generic.ExplicitWait(3);

		BookingCalenderCreateGroundspreadQuotesAddNotesSave.click();
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);

		BookingCalenderCreateGroundspreadQuotesCreateQuotesButton.click();
		generic.ExplicitWait(5);

		System.out.println("Groundspread quotes from Booking calender created successfully");
		generic.ExplicitWait(7);

	}
	
	@FindBy(xpath = "//div[@id='btnCancelQuote']")
	private WebElement BookingCalenderCreateGroundspreadQuotesCancelQuotesButton;
	
	public void CancelGroundspreadQuotesFromBookingCalender() throws InvalidFormatException, IOException {

		generic.ExplicitWait(3);
		BookingCalendarMainPageAddQuotes.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateGroundspreadIcon.click();
		generic.ExplicitWait(7);
		BookingCalenderPageCreateQuotesGroundspreadSearchBar.sendKeys("ace");
		generic.ExplicitWait(5);
		BookingCalenderPageCreateGroundspreadQuotesSearchBarAce3.click();
		generic.ExplicitWait(5);
		BookingCalenderPageCreateGroundspreadQuotesGobutton.click();
		generic.ExplicitWait(5);

		BookingCalendarGroundspreadQuotesPageDeliveryBar.click();

		generic.ExplicitWait(5);
		BookingCalenderCreateGroundspreadQuotesDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		act.clickAndHold(BookingCalenderCreateGroundspreadQuotesDeliveryCalenderFullIcon);
		generic.ExplicitWait(10);
		BookingCalenderGroundspreadDeliveryQuotesCalenderFullIconTodaysfocausdate.click();

		BookingCalenderCreateGroundspreadQuotesFarmAndLocationBar.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateGroundspreadQuotesFarmAndLocationSelectFarmLocation.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateGroundspreadQuotesFarmAndLocationSelectFarmLocationAce3.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateGroundspreadQuotesSelectPaddocks.click();
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(5);

		String comment = generic.GetExcelSheetStringCellValue(filepath, sheetname, 6, 3);
		System.out.println(comment);
		BookingCalenderCreateGroundspreadQuotesPaddockComments.sendKeys(comment);
		generic.ExplicitWait(5);

		String totalarea = BookingCalenderCreateGroundspreadQuotesCaptureTotalAreaPaddock.getText();
		System.out.println("Peddocks :" + totalarea);
		generic.ExplicitWait(5);

		BookingCalenderCreateGroundspreadQuotesPageProductbar.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateGroundspreadQuotesProductAddbutton.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateGroundspreadQuotesProductSearchAProducTdropDown.click();
		generic.ExplicitWait(4);
		BookingCalenderCreateGroundspreadQuotesProductSearchAProducTdropDownSelect.click();

		BookingCalenderCreateGroundspreadQuotesProductApplication.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateGroundspreadQuotesProductApplication100.click();
		generic.ExplicitWait(10);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 4, 3);
		System.out.println(weight);
		BookingCalenderCreateGroundspreadQuotesProductWeight.sendKeys(weight + "");
		generic.ExplicitWait(5);

		String Price = BookingCalenderCreateGroundspreadQuotesCaptureTotalPrice.getText();
		System.out.println("Total Price is " + Price);
		generic.ExplicitWait(5);

		BookingCalenderGroundspreadQuotesNotesBar.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateGroundspreadQuotesAddNotes.click();
		generic.ExplicitWait(3);

		String ordernotes = generic.GetExcelSheetStringCellValue(filepath, sheetname, 7, 3);
		System.out.println(ordernotes);
		BookingCalenderCreateGroundspreadQuotesAddNotesTextArea.sendKeys(ordernotes);
		generic.ExplicitWait(3);

		BookingCalenderCreateGroundspreadQuotesAddNotesSave.click();
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);

		BookingCalenderCreateGroundspreadQuotesCancelQuotesButton.click();
		generic.ExplicitWait(5);

		System.out.println("Groundspread quotes from Booking calender created successfully");
		generic.ExplicitWait(7);

	}
	
	
	
	// ====================Logistics Quotes=================================//

	@FindBy(xpath = "//div[@id='5611_Division']")
	private WebElement BookingCalenderQuotesQuotesLogisticsIcon;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement BookingCalenderCreateQuotesLogiscticsSearchBar;

	@FindBy(xpath = "//ul[@id='part1AAC_listbox']/li[1]")
	private WebElement BookingCalenderCreateQuotesLogiscticsSearchBarAce;

	@FindBy(xpath = "//div[@id='part1A']//div[contains(@style,'float: left;')]//div[@style='clear: both; text-align: right;']//div[@class='btn btn-primary k-button']")
	private WebElement BookingCalenderCreateQuoteLogisticssGobutton;

	@FindBy(xpath = "//div[@id='GibsonsDepotPickup']")
	private WebElement BookingCalenderCreateQuotesLogiscticsPickupLocationGibsonsDepotPickUp;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header']/span[1])[1]")
	private WebElement BookingCalenderCreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdown;

	@FindBy(xpath = "//ul[@id='depotPickupDD_listbox']/li[5]")
	private WebElement BookingCalenderCreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdownSelect;

	@FindBy(xpath = "//div[@id='CustomerAddressPickup']")
	private WebElement BookingCalenderCreateQuotesLogiscticsPickupLocationCustomerAddress;

	@FindBy(xpath = "(//span[@class='k-widget k-combobox k-header'])[1]/span/span")
	private WebElement BookingCalenderCreateQuotesLogiscticsPickupLocationCustomerAddressDropdownSelectFarmdropdown;

	@FindBy(xpath = "(//div[@id='pickupFarmDD-list'])[3]/ul/li[1]")
	private WebElement BookingCalenderCreateQuotesLogiscticsPickupLocationCustomerAddressDropdownSelectFarm;

	@FindBy(xpath = "//div[@id='NewLocationPickup']")
	private WebElement BookingCalenderCreateQuotesLogiscticsLogisticsPickupLocationOtherLocation;

	@FindBy(xpath = "//input[@id='pickupLocationNameAC']")
	private WebElement BookingCalenderCreateQuotesLogiscticsPickupLocationOtherLocationSearchLocationBar;

	@FindBy(xpath = "//ul[@id='pickupLocationNameAC_listbox']/li[5]")
	private WebElement BookingCalenderCreateQuotesLogiscticsPickupLocationOtherLocationSearchLocationSelect;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement BookingCalenderCreateQuotesLogiscticsPickupLocationOtherLocationRegistredwithcustomerCheckbox;

	@FindBy(xpath = "//div[@id='GibsonsDepotDelivery']")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUp;

	@FindBy(xpath = "(//span[@class='k-dropdown-wrap k-state-default'])[4]")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpDropdown;

	@FindBy(xpath = "//ul[@id='depotDeliveryDD_listbox']/li[3]")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpSelect;

	@FindBy(xpath = "//div[@id='CustomerAddressDelivery']")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryLocationCustomerAddress;

	@FindBy(xpath = "(//span[@class='k-widget k-combobox k-header'])[2]/span/span")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryLocationCustomerAddressDropdown;

	@FindBy(xpath = "(//ul[@id='deliveryFarmDD_listbox'])[2]/li[1]")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryLocationCustomerAddressSelect;

	@FindBy(xpath = "//div[@id='NewLocationDelivery']")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryLocationOtherLocation;

	@FindBy(xpath = "//input[@type='checkbox'])[2]")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryLocationOtherLocationcheckbox;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[3]")
	private WebElement BookingCalenderCreateQuotesLogiscticsOrderSelectbothlocationGo;

	@FindBy(xpath = "//div[@id='section4']")
	private WebElement BookingCalenderCreateQuotesLogiscticsOrderDelieveryBar;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryCalenderIcon;

	@FindBy(xpath = "//div[@id='ee9cb678-e330-4bef-a21c-6a120bc1176c']")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryCalenderFullIcon;

	@FindBy(xpath = "//td[@class='k-today k-state-focused']/a")
	private WebElement BookingCalenderCreateQuotesLogiscticsDeliveryCalenderFullIconTodaysfocausdate;

	@FindBy(xpath = "//div[@id='section3']")
	private WebElement BookingCalenderCreateQuotesLogiscticsOrderConsignmentBar;

	@FindBy(xpath = "(//div[@class='gb-panel-small-border']/div[2])[1]")
	private WebElement BookingCalenderCreateQuotesLogiscticsConsignmentProductAddButton;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[7]")
	private WebElement BookingCalenderCreateQuotesLogiscticsConsignmentProductDropdown;

	@FindBy(xpath = "//ul[@id='op_1_1_listbox']/li[5]")
	private WebElement BookingCalenderCreateQuotesLogiscticsConsignmentProductSelect;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[8]")
	private WebElement BookingCalenderCreateQuotesLogiscticsConsignmentProductApplicationDropdown;

	@FindBy(xpath = "//ul[@id='op_1_2_listbox']/li[2]")
	private WebElement BookingCalenderCreateQuotesLogiscticsConsignmentProductApplicationSelect;

	@FindBy(xpath = "//input[@id='op_1_3']")
	private WebElement BookingCalenderCreateQuotesLogiscticsConsignmentProductWeight;

	@FindBy(xpath = "//div[@id='btnCreateQuote']")
	private WebElement BookingCalenderCreateQuotesLogiscticsCreateQuotes;

	@FindBy(xpath = "//div[@id='section5']")
	private WebElement BookingCalenderCreateQuotesLogiscticsQuotesNotesBar;

	@FindBy(xpath = "//a[@class='k-button k-button-icontext k-add-button']")
	private WebElement BookingCalenderCreateQuotesLogiscticsQuotesAddNotes;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/textarea")
	private WebElement BookingCalenderCreateQuotesLogiscticsQuotesAddNotesTextArea;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement BookingCalenderCreateQuotesLogiscticsQuotesAddNotesSave;

	@FindBy(xpath = "//div[@class='k-toolbar k-grid-toolbar']/div[1]/span[1]")
	private WebElement BookingCalenderQuotesMainPageQoutesOderTypedropdown;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[2]")
	private WebElement BookingCalenderQuotesMainPageQoutesOderTypeSelect;

	@FindBy(xpath = "//div[@id='depotDropDown']/span")
	private WebElement BookingCalenderCreateQutesMainpageDepotdropdown;

	@FindBy(xpath = "//ul[@id='depotList_listbox']/li[1]")
	private WebElement BookingCalenderCreateQutesMainpageDepotAll;

	@FindBy(xpath = "(//th[@class='k-header k-with-icon k-filterable'])[2]")
	private WebElement BookingCalenderCreateQutesMainpageRefresh;

	@FindBy(xpath = "(//button[@class='fa-sign-in fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
	private WebElement BookingCalenderCreateQutesLogiscticsMainpageConvertToOrder;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement BookingCalenderCreateQutesLogiscticsConvertToOrderToBeInOrder;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Convert To Order')]")
	private WebElement BookingCalenderCreateQutesLogiscticsConvertToOrderConvertToOrderComplete;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button popup-button-right']")
	private WebElement BookingCalenderCreateQutesLogiscticsConvertToOrderConvertToOrderYes;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[3]")
	private WebElement BookingCalenderCreateQutesLogiscticsConvertToOrderConvertToOrderOk;

	@FindBy(xpath = "//div[@id='wrapper']//div[1]/span[1]/span[1]")
	private WebElement BookingCalenderOrderPageLogisticsOrderMainPageOrderTypeDropdown;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[2]")
	private WebElement BookingCalenderOrderPageLogisticsOrderMainPageOrderTypeDropdownLogistics;

	@FindBy(xpath = "//div[@id='depotDropDown']/span")
	private WebElement BookingCalenderOrderPageLogisticsMainpageDepotdropdown;

	@FindBy(xpath = "//ul[@id='depotList_listbox']/li[1]")
	private WebElement BookingCalenderOrderPageLogisticsMainpageDepotAll;

	@FindBy(xpath = "//div[@id='freightGrid']//th[3]/a[2]")
	private WebElement BookingCalenderOrderPageCreateLogisticsOrderCreateOrderTypeRefreshPage;

	@FindBy(xpath = "")
	private WebElement OrderPageCreateLogisticsMainPageCaptureOrderNumber;

	@FindBy(xpath = "//ul[@id='side-menu']/li[5]/ul/li[1]/a/span")
	private WebElement BookingCalenderQuotesMenuBarQuotes;

	@FindBy(xpath = "//div[@id='5611_Division']")
	private WebElement BookingCalenderBookingCalenderCreateLogisticsIcon;

	public void CreateLogiscticQuotesFromBookingClaendar() {
		generic.ExplicitWait(5);
		BookingCalendarMainPageAddQuotes.click();
		generic.ExplicitWait(5);

		BookingCalenderQuotesQuotesLogisticsIcon.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesLogiscticsSearchBar.sendKeys("ace");
		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesLogiscticsSearchBarAce.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuoteLogisticssGobutton.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesLogiscticsPickupLocationGibsonsDepotPickUp.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdown.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdownSelect.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUp.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpDropdown.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpSelect.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsOrderSelectbothlocationGo.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsOrderDelieveryBar.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesLogiscticsDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		act.clickAndHold(BookingCalenderCreateQuotesLogiscticsDeliveryCalenderFullIcon);
		generic.ExplicitWait(10);
		BookingCalenderCreateQuotesLogiscticsDeliveryCalenderFullIconTodaysfocausdate.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesLogiscticsOrderConsignmentBar.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductAddButton.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductDropdown.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductSelect.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductApplicationDropdown.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductApplicationSelect.click();
		generic.ExplicitWait(3);
		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 4, 3);
		System.out.println(weight);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductWeight.sendKeys(weight + "");
		generic.ExplicitWait(5);

		// Due to Bug this section is commented...//

		/*
		 * BookingCalenderCreateQuotesLogiscticsQuotesNotesBar.click();
		 * generic.ExplicitWait(3);
		 * 
		 * BookingCalenderCreateQuotesLogiscticsQuotesAddNotes.click();
		 * generic.ExplicitWait(3);
		 * 
		 * BookingCalenderCreateQuotesLogiscticsQuotesAddNotesTextArea.sendKeys(
		 * "mail to ab@gmial.com"); generic.ExplicitWait(3);
		 * BookingCalenderCreateQuotesLogiscticsQuotesAddNotesSave.click();
		 * generic.ExplicitWait(3);
		 */

		// =====================================================//

		BookingCalenderCreateQuotesLogiscticsCreateQuotes.click();
		generic.ExplicitWait(5);
		System.out.println("Logisctics quotes from calendar created successfully.plesae navigate to orders");
		generic.ExplicitWait(7);

	}
	
	public void CancelLogisticsQuotesFromBookingCalendar()
	{
		
		generic.ExplicitWait(5);
		BookingCalendarMainPageAddQuotes.click();
		generic.ExplicitWait(5);

		BookingCalenderQuotesQuotesLogisticsIcon.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesLogiscticsSearchBar.sendKeys("ace");
		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesLogiscticsSearchBarAce.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuoteLogisticssGobutton.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesLogiscticsPickupLocationGibsonsDepotPickUp.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdown.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsPickupLocationGibsonsDepotPickUpDropdownSelect.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUp.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpDropdown.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsDeliveryLocationGibsonsDepotPickUpSelect.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsOrderSelectbothlocationGo.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsOrderDelieveryBar.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesLogiscticsDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		act.clickAndHold(BookingCalenderCreateQuotesLogiscticsDeliveryCalenderFullIcon);
		generic.ExplicitWait(10);
		BookingCalenderCreateQuotesLogiscticsDeliveryCalenderFullIconTodaysfocausdate.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesLogiscticsOrderConsignmentBar.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductAddButton.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductDropdown.click();
		generic.ExplicitWait(3);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductSelect.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductApplicationDropdown.click();
		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductApplicationSelect.click();
		generic.ExplicitWait(3);
		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 4, 3);
		System.out.println(weight);
		BookingCalenderCreateQuotesLogiscticsConsignmentProductWeight.sendKeys(weight + "");
		generic.ExplicitWait(5);

		// Due to Bug this section is commented...//

		/*
		 * BookingCalenderCreateQuotesLogiscticsQuotesNotesBar.click();
		 * generic.ExplicitWait(3);
		 * 
		 * BookingCalenderCreateQuotesLogiscticsQuotesAddNotes.click();
		 * generic.ExplicitWait(3);
		 * 
		 * BookingCalenderCreateQuotesLogiscticsQuotesAddNotesTextArea.sendKeys(
		 * "mail to ab@gmial.com"); generic.ExplicitWait(3);
		 * BookingCalenderCreateQuotesLogiscticsQuotesAddNotesSave.click();
		 * generic.ExplicitWait(3);
		 */

		// =====================================================//

		BookingCalenderCreateGroundspreadQuotesCancelQuotesButton.click();
		generic.ExplicitWait(5);
		System.out.println("Logisctics quotes from calendar created successfully.plesae navigate to orders");
		generic.ExplicitWait(5);	
		
		
		
	}
	
	
	

	// ====================Darriman Quotes=================================//

	@FindBy(xpath = "//div[@id='5610_Division_RoleDiv']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeIcon;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeSeachbar;

	@FindBy(xpath = "//ul[@id='part1AAC_listbox']/li[1]") // du
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCustomerSelect;

	@FindBy(xpath = "//div[@id='part1A']//div[contains(@style,'float: left;')]//div[@style='clear: both; text-align: right;']//div[@class='btn btn-primary k-button']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCustomerSelectGOButton;

	@FindBy(xpath = "//div[@id='section2']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteFarmLocationBar;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[1]")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteFarmLocationDropdown;

	@FindBy(xpath = "//ul[@id='farmsDD_listbox']/li[2]")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteFarmLocationSelect;

	@FindBy(xpath = "//div[@id='section3']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductBar;

	@FindBy(xpath = "//div[@id='productHeaderDiv']/div[3]/div[2]")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductAdd;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductDropdown;

	@FindBy(xpath = "//ul[@id='op_1_1_listbox']/li[4]")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductSelect;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteApplicationDropdoown;

	@FindBy(xpath = "//ul[@id='op_1_2_listbox']/li[3]")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteApplicationSelect;

	@FindBy(xpath = "//input[@id='op_1_3']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteWeight;

	@FindBy(xpath = "//div[@id='section4']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryBar;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryCalender;

	@FindBy(xpath = "//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryCalenderFull;

	@FindBy(xpath = "//td[@class='k-today k-state-focused']/a")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryCalenderTodaysDate;

	@FindBy(xpath = "//div[@id='section5']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteQuoteNotesBar;

	@FindBy(xpath = "//a[@class='k-button k-button-icontext k-add-button']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteQuoteNotesAdd;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/textarea")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteQuoteNotesTextArea;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteQuoteNotesSave;

	@FindBy(xpath = "//div[@id='btnCreateQuote']")
	private WebElement BookingCalenderCreateQuotesDrrimanLimeCreateQouteCreateQuoteButton;

	@FindBy(xpath = "//div[@class='k-toolbar k-grid-toolbar']/div[1]/span[1]")
	private WebElement BookingCalenderCreateQuotesMainPageQoutesOderTypedropdown;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[1]")
	private WebElement BookingCalenderCreateQuotesMainPageQoutesOderTypeSelect;

	@FindBy(xpath = "//div[@id='depotDropDown']/span")
	private WebElement BookingCalenderCreateCreateQutesMainpageDepotdropdown;

	@FindBy(xpath = "//ul[@id='depotList_listbox']/li[1]")
	private WebElement BookingCalenderCreateCreateQutesMainpageDepotAll;

	@FindBy(xpath = "(//th[@class='k-header k-with-icon k-filterable'])[2]")
	private WebElement BookingCalenderCreateCreateQutesMainpageRefresh;

	@FindBy(xpath = "(//button[@class='fa-sign-in fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
	private WebElement BookingCalenderCreateCreateQutesDarrimanConverToOrderIcon;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement BookingCalenderCreateCreateQutesDarrimanConverToOrderToBeInOrder;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Convert To Order')]")
	private WebElement BookingCalenderCreateCreateQutesDarrimanConverToOrderConvertToOrderButton;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button popup-button-right']")
	private WebElement BookingCalenderCreateCreateQutesDarrimanConverToOrderConvertToOrderyes;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[2]")
	private WebElement BookingCalenderCreateCreateQutesDarrimanConverToOrderConvertToOrderOk;

	public void CreateDarrimanQuotesFromBookingClaendar() {

		generic.ExplicitWait(5);
		BookingCalendarMainPageAddQuotes.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesDrrimanLimeIcon.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeSeachbar.sendKeys("du");
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesDrrimanLimeCustomerSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCustomerSelectGOButton.click();

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryBar.click();
		generic.ExplicitWait(3);

		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryCalender.click();
		Actions act = new Actions(driver);
		act.clickAndHold(BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryCalenderFull);
		generic.ExplicitWait(10);
		BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryCalenderTodaysDate.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteFarmLocationBar.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteFarmLocationDropdown.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteFarmLocationSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductBar.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductAdd.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductDropdown.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteApplicationDropdoown.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteApplicationSelect.click();
		generic.ExplicitWait(3);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 4, 3);
		System.out.println(weight);
		BookingCalenderCreateQuotesDrrimanLimeCreateQouteWeight.sendKeys(weight + "");
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

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteCreateQuoteButton.click();
		generic.ExplicitWait(15);

	}
	public void CancelDarrimanQuotesFromBookingClaendar() {

		generic.ExplicitWait(5);
		BookingCalendarMainPageAddQuotes.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesDrrimanLimeIcon.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeSeachbar.sendKeys("du");
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesDrrimanLimeCustomerSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCustomerSelectGOButton.click();

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryBar.click();
		generic.ExplicitWait(3);

		generic.ExplicitWait(5);
		BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryCalender.click();
		Actions act = new Actions(driver);
		act.clickAndHold(BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryCalenderFull);
		generic.ExplicitWait(10);
		BookingCalenderCreateQuotesDrrimanLimeCreateQouteDelievryCalenderTodaysDate.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteFarmLocationBar.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteFarmLocationDropdown.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteFarmLocationSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductBar.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductAdd.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductDropdown.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteProductSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteApplicationDropdoown.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesDrrimanLimeCreateQouteApplicationSelect.click();
		generic.ExplicitWait(3);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 4, 3);
		System.out.println(weight);
		BookingCalenderCreateQuotesDrrimanLimeCreateQouteWeight.sendKeys(weight + "");
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

		BookingCalenderCreateGroundspreadQuotesCancelQuotesButton.click();
		generic.ExplicitWait(15);

	}

	
	
	
	
	

	// ====================Maryvale Quotes=================================//

	@FindBy(xpath = "//div[@id='5614_Division_RoleDiv']")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeIcon;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeSeachbar;

	@FindBy(xpath = "//ul[@id='part1AAC_listbox']/li[1]") // du
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCustomerSelect;

	@FindBy(xpath = "//div[@id='part1A']//div[contains(@style,'float: left;')]//div[@style='clear: both; text-align: right;']//div[@class='btn btn-primary k-button']")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCustomerSelectGOButton;

	@FindBy(xpath = "//div[@id='section2']")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteFarmLocationBar;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[1]")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteFarmLocationDropdown;

	@FindBy(xpath = "//ul[@id='farmsDD_listbox']/li[1]")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteFarmLocationSelect;

	@FindBy(xpath = "//div[@id='section3']")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteProductBar;

	@FindBy(xpath = "//div[@id='productHeaderDiv']/div[3]/div[2]")
	private WebElement BookingCalenderQuotesMaryvaleLimeCreateQouteProductAdd;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteProductDropdown;

	@FindBy(xpath = "//ul[@id='op_1_1_listbox']/li[4]")
	private WebElement BookingCalenderQuotesMaryvaleLimeCreateQouteProductSelect;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement BookingCalenderQuotesMaryvaleLimeCreateQouteApplicationDropdoown;

	@FindBy(xpath = "//ul[@id='op_1_2_listbox']/li[3]")
	private WebElement BookingCalenderQuotesMaryvaleLimeCreateQouteApplicationSelect;

	@FindBy(xpath = "//input[@id='op_1_3']")
	private WebElement BookingCalenderQuotesMaryvaleLimeCreateQouteWeight;

	@FindBy(xpath = "//div[@id='section4']")
	private WebElement QuotesMaryvaleLimeCreateQouteDelievryBar;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement BookingCalenderQuotesMaryvaleLimeCreateQouteDelievryCalender;

	@FindBy(xpath = "//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
	private WebElement BookingCalenderQuotesMaryvaleLimeCreateQouteDelievryCalenderFull;

	@FindBy(xpath = "//td[@class='k-today k-state-focused']/a")
	private WebElement BookingCalenderQuotesMaryvaleLimeCreateQouteDelievryCalenderTodaysDate;

	@FindBy(xpath = "//div[@id='section5']")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteQuoteNotesBar;

	@FindBy(xpath = "//a[@class='k-button k-button-icontext k-add-button']")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteQuoteNotesAdd;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/textarea")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteQuoteNotesTextArea;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteQuoteNotesSave;

	@FindBy(xpath = "//div[@id='btnCreateQuote']")
	private WebElement BookingCalenderCreateQuotesMaryvaleLimeCreateQouteCreateQuoteButton;

	@FindBy(xpath = "//div[@class='k-toolbar k-grid-toolbar']/div[1]/span[1]")
	private WebElement QuotesMainPageQoutesOderTypedropdown;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[4]")
	private WebElement QuotesMainPageQoutesOderTypeSelect;

	@FindBy(xpath = "//div[@id='depotDropDown']/span")
	private WebElement CreateQutesMainpageDepotdropdown;

	@FindBy(xpath = "//ul[@id='depotList_listbox']/li[4]")
	private WebElement CreateQutesMainpageDepotAll;

	@FindBy(xpath = "(//th[@class='k-header k-with-icon k-filterable'])[2]")
	private WebElement CreateQutesMainpageRefresh;

	@FindBy(xpath = "(//button[@class='fa-sign-in fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
	private WebElement CreateQutesConverToOrderIcon;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement CreateQutesMaryvaleConverToOrderToBeInOrder;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Convert To Order')]")
	private WebElement CreateQutesMaryvaleConverToOrderConvertToOrderButton;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button popup-button-right']")
	private WebElement CreateQutesMaryvaleConverToOrderConvertToOrderyes;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[2]")
	private WebElement CreateQutesMaryvaleConverToOrderConvertToOrderOk;

	public void CancelquotesMaryvaleLimeQuotesFromBookingCalendar()
	{
		generic.ExplicitWait(5);
		BookingCalendarMainPageAddQuotes.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesMaryvaleLimeIcon.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeSeachbar.sendKeys("ra");
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesMaryvaleLimeCustomerSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCustomerSelectGOButton.click();

		QuotesMaryvaleLimeCreateQouteDelievryBar.click();
		generic.ExplicitWait(3);

		generic.ExplicitWait(5);
		BookingCalenderQuotesMaryvaleLimeCreateQouteDelievryCalender.click();
		Actions act = new Actions(driver);
		act.clickAndHold(BookingCalenderQuotesMaryvaleLimeCreateQouteDelievryCalenderFull);
		generic.ExplicitWait(10);
		BookingCalenderQuotesMaryvaleLimeCreateQouteDelievryCalenderTodaysDate.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteFarmLocationBar.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteFarmLocationDropdown.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteFarmLocationSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteProductBar.click();
		generic.ExplicitWait(3);

		BookingCalenderQuotesMaryvaleLimeCreateQouteProductAdd.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteProductDropdown.click();
		generic.ExplicitWait(3);

		BookingCalenderQuotesMaryvaleLimeCreateQouteProductSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderQuotesMaryvaleLimeCreateQouteApplicationDropdoown.click();
		generic.ExplicitWait(3);

		BookingCalenderQuotesMaryvaleLimeCreateQouteApplicationSelect.click();
		generic.ExplicitWait(3);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 3, 3);
		System.out.println(weight);
		BookingCalenderQuotesMaryvaleLimeCreateQouteWeight.sendKeys(weight + "");
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

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteCreateQuoteButton.click();
		generic.ExplicitWait(15);

	}
	
	public void CreatequotesMaryvaleLimeQuotesFromBookingCalendar()
	{
		generic.ExplicitWait(5);
		BookingCalendarMainPageAddQuotes.click();
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesMaryvaleLimeIcon.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeSeachbar.sendKeys("ra");
		generic.ExplicitWait(5);

		BookingCalenderCreateQuotesMaryvaleLimeCustomerSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCustomerSelectGOButton.click();

		QuotesMaryvaleLimeCreateQouteDelievryBar.click();
		generic.ExplicitWait(3);

		generic.ExplicitWait(5);
		BookingCalenderQuotesMaryvaleLimeCreateQouteDelievryCalender.click();
		Actions act = new Actions(driver);
		act.clickAndHold(BookingCalenderQuotesMaryvaleLimeCreateQouteDelievryCalenderFull);
		generic.ExplicitWait(10);
		BookingCalenderQuotesMaryvaleLimeCreateQouteDelievryCalenderTodaysDate.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteFarmLocationBar.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteFarmLocationDropdown.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteFarmLocationSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteProductBar.click();
		generic.ExplicitWait(3);

		BookingCalenderQuotesMaryvaleLimeCreateQouteProductAdd.click();
		generic.ExplicitWait(3);

		BookingCalenderCreateQuotesMaryvaleLimeCreateQouteProductDropdown.click();
		generic.ExplicitWait(3);

		BookingCalenderQuotesMaryvaleLimeCreateQouteProductSelect.click();
		generic.ExplicitWait(3);

		BookingCalenderQuotesMaryvaleLimeCreateQouteApplicationDropdoown.click();
		generic.ExplicitWait(3);

		BookingCalenderQuotesMaryvaleLimeCreateQouteApplicationSelect.click();
		generic.ExplicitWait(3);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 3, 3);
		System.out.println(weight);
		BookingCalenderQuotesMaryvaleLimeCreateQouteWeight.sendKeys(weight + "");
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
		 * 
		 * 
		 */

		BookingCalenderCreateGroundspreadQuotesCancelQuotesButton.click();
		generic.ExplicitWait(15);

}
}