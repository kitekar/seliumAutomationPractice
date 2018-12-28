package com.QA.Gibsons_Connect_Orders;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


public class DarrimanLimeBasePage extends Generic_Service
{
	@FindBy(xpath = "//div[@class='panel-heading']")
	private WebElement OrderPageTextcatch;

	@FindBy(xpath = "//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;

	@FindBy(xpath = "//a[@id='Orders']")
	private WebElement OrdersMenuBar;

	@FindBy(xpath = "//ul[@id='side-menu']/li[4]/ul/li[1]/a/span")
	private WebElement OrdersMenuBarOrders;

	@FindBy(xpath = "//div[@srname='ORDERS_WRITE'][contains(text(),'Create a New Order')]")
	private WebElement OrderPageCreateNewOrder;

	@FindBy(xpath = "//div[@id='5610_Division_RoleDiv']")
	private WebElement OrderPageDarrimanLimeIcon;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement OrderPageCreateDarrimanOrderSearchBar;

	@FindBy(xpath = "//ul[@id='part1AAC_listbox']/li[1]")
	private WebElement OrderPageCreateDarrimanOrderSearchBarAce3;

	@FindBy(xpath = "//div[@id='part1A']//div[contains(@style,'float: left;')]//div[@style='clear: both; text-align: right;']//div[@class='btn btn-primary k-button']")
	private WebElement OrderPageCreateDarrimanOrderGobutton;


	String filepath = "./ExcelFile/Gibsons_Connect_TestData.xlsx";
	String sheetname = "Orders";

	Generic_Service generic = new Generic_Service();

	public DarrimanLimeBasePage() 
	{
		PageFactory.initElements(driver, this);
	}

	public void NavigateToOrders()

	{
		generic.ExplicitWait(5);
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		OrdersMenuBar.click();
		generic.ExplicitWait(5);
		OrdersMenuBarOrders.click();
		generic.ExplicitWait(5);
		System.out.println("\nNavigated to Orders main page");
		generic.ExplicitWait(3);
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
	
	}

	@FindBy(xpath = "//div[@id='section4']")
	private WebElement OrderPageCreateDarrimanOrderCreatePageDeliveryBar;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement OrderPageCreateDarrimanOrderDeliveryCalenderIcon;

	@FindBy(xpath = "//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
	private WebElement OrderPageCreateDarrimanOrderDeliveryCalenderFullIcon;

	@FindBy(xpath = "//td[@class='k-today k-state-focused']/a")
	private WebElement OrderPageCreateDarrimanOrderDeliveryCalenderFullIconTodaysfocausdate;

	@FindBy(xpath = "//div[@id='section2']")
	private WebElement OrderPageCreateDarrimanOrderCreatePageFarmAndLocationBar;

	@FindBy(xpath = "//div[@id='fDIV']/span/span/span[2]/span")
	private WebElement OrderPageCreateDarrimanOrderCreatePageFarmAndLocationSelectFarmLocation;

	@FindBy(xpath = "//ul[@id='farmsDD_listbox']/li[2]")
	private WebElement OrderPageCreateDarrimanOrderCreatePageFarmAndLocationSelectFarmLocationDutson;

	@FindBy(xpath = "//div[@id='section3']")
	private WebElement OrderPageCreateDarrimanOrderCreatePageProductbar;

	@FindBy(xpath = "//div[@id='productHeaderDiv']/div[@class='gb-panel-small-border']/div[2]")
	private WebElement OrderPageCreateDarrimanOrderCreatePageProductAddbutton;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement DrrimanLimeCreateOrderProductDropdown;

	@FindBy(xpath = "//ul[@id='op_1_1_listbox']/li[4]")
	private WebElement DrrimanLimeCreateOrderProductSelect;

	@FindBy(xpath = "//input[@id='op_1_1']")
	private WebElement OrderPageCreateDarrimanOrderCreatePageProductSearchAProductByName;

	@FindBy(xpath = "//li[@tabindex='-1'][contains(text(),'0-0-0-2 Mg5.5 Grit Lime')]")
	private WebElement OrderPageDarrimanOrderCreatePageProductSearchAProductByNameMg;

	@FindBy(xpath = "//tr[@id='op_row_1']/td[2]/span[1]/span/span[2]")
	private WebElement OrderPageDarrimanOrderCreatePageProductApplication;

	@FindBy(xpath = "//html//div[@id='op_1_2-list']//li[2]")
	private WebElement OrderPageDarrimanOrderCreatePageProductApplication100;

	@FindBy(xpath = "//html//div[@id='op_1_2-list']//li[3]")
	private WebElement OrderPageDarrimanOrderCreatePageProductApplication1000;

	@FindBy(xpath = "//input[@id='op_1_3']")
	private WebElement OrderPageDarrimanOrderCreatePageProductWeight;

	@FindBy(xpath = "//tr[@id='op_row_1']/td[4]")
	private WebElement OrderPageDarrimanOrderCreatePageCaptureTotalPrice;

	@FindBy(xpath = "//div[@id='section5']")
	private WebElement OrderPageDarrimanOrderCreatePageNotesBar;

	@FindBy(xpath = "//div[@id='notesContentDiv']/a")
	private WebElement OrderPageDarrimanOrderCreatePageAddNotes;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/textarea")
	private WebElement OrderPageDarrimanOrderCreatePageAddNotesTextArea;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[2]")
	private WebElement OrderPageDarrimanOrderCreatePageAddNotesCancel;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement OrderPageDarrimanOrderCreatePageAddNotesSave;

	@FindBy(xpath = "//div[@id='createOrderBtn']")
	private WebElement OrderPageDarrimanOrderCreatePageCreateOrderButton;

	public void CreateDarrimanLimeOrder() throws InvalidFormatException, IOException
	{
		OrderPageCreateNewOrder.click();
		generic.ExplicitWait(3);
		OrderPageDarrimanLimeIcon.click();
		generic.ExplicitWait(3);
		OrderPageCreateDarrimanOrderSearchBar.sendKeys("du");
		generic.ExplicitWait(5);
		OrderPageCreateDarrimanOrderSearchBarAce3.click();
		generic.ExplicitWait(3);
		OrderPageCreateDarrimanOrderGobutton.click();
		generic.ExplicitWait(3);

		OrderPageCreateDarrimanOrderCreatePageDeliveryBar.click();

		generic.ExplicitWait(5);
		OrderPageCreateDarrimanOrderDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		act.clickAndHold(OrderPageCreateDarrimanOrderDeliveryCalenderFullIcon);
		generic.ExplicitWait(10);
		OrderPageCreateDarrimanOrderDeliveryCalenderFullIconTodaysfocausdate.click();

		OrderPageCreateDarrimanOrderCreatePageFarmAndLocationBar.click();
		generic.ExplicitWait(3);
		OrderPageCreateDarrimanOrderCreatePageFarmAndLocationSelectFarmLocation.click();
		generic.ExplicitWait(3);
		OrderPageCreateDarrimanOrderCreatePageFarmAndLocationSelectFarmLocationDutson.click();
		generic.ExplicitWait(3);
		OrderPageCreateDarrimanOrderCreatePageProductbar.click();
		generic.ExplicitWait(3);

		int bookingnumber = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 21, 6);
		OrderPageOrderTypeDropdownDarrimanBookingOrderNumber.sendKeys(bookingnumber + "");

		generic.ExplicitWait(4);
		OrderPageCreateDarrimanOrderCreatePageProductAddbutton.click();
		generic.ExplicitWait(3);
		OrderPageCreateDarrimanOrderCreatePageProductSearchAProductByName.sendKeys("0-0-0-2 Mg5.5 Grit Lime");
		generic.ExplicitWait(10);
		OrderPageDarrimanOrderCreatePageProductSearchAProductByNameMg.sendKeys(Keys.ARROW_DOWN);
		generic.ExplicitWait(5);
		OrderPageDarrimanOrderCreatePageProductSearchAProductByNameMg.click();
		generic.ExplicitWait(10);

		OrderPageDarrimanOrderCreatePageProductApplication.click();
		generic.ExplicitWait(3);
		OrderPageDarrimanOrderCreatePageProductApplication100.click();
		generic.ExplicitWait(3);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 21, 3);
		System.out.println(weight);
		OrderPageDarrimanOrderCreatePageProductWeight.sendKeys(weight + "");
		generic.ExplicitWait(5);

		String Price = OrderPageDarrimanOrderCreatePageCaptureTotalPrice.getText();
		System.out.println("Total Price is " + Price);
		generic.ExplicitWait(5);

		OrderPageDarrimanOrderCreatePageNotesBar.click();
		generic.ExplicitWait(3);
		OrderPageDarrimanOrderCreatePageAddNotes.click();
		generic.ExplicitWait(3);

		String ordernotes = generic.GetExcelSheetStringCellValue(filepath, sheetname, 22, 3);
		System.out.println(ordernotes);
		OrderPageDarrimanOrderCreatePageAddNotesTextArea.sendKeys(ordernotes);
		generic.ExplicitWait(3);

		OrderPageDarrimanOrderCreatePageAddNotesSave.click();
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);

		try {
			OrderPageDarrimanOrderCreatePageCreateOrderButton.click();
			generic.ExplicitWait(40);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Page is not loaded");
		}
        generic.ExplicitWait(5);
        System.out.println("\nDarriman Lime Order created successfully");

	}

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[1]")
	private WebElement OrderPageOrderTypeDropdown;

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[1]")
	private WebElement OrderPageOrderTypeDropdownDarriman;

	@FindBy(xpath = "(//button[@class='fa-edit fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
	private WebElement OrderPageOrderTypeDropdownDarrimanEditbutton;

	@FindBy(xpath = "//input[@id='bookingNumber']")
	private WebElement OrderPageOrderTypeDropdownDarrimanBookingOrderNumber;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Update Order')]")
	private WebElement OrderPageOrderTypeDropdownDarrimanEditUpdateOrder;

	public void EditDarrimanLimeOrder() throws InvalidFormatException, IOException

	{

		generic.ExplicitWait(20);
		OrderPageOrderTypeDropdown.click();
		generic.ExplicitWait(3);
		OrderPageOrderTypeDropdownDarriman.click();
		generic.ExplicitWait(3);
		OrderPageOrderTypeDropdownDarrimanEditbutton.click();
		generic.ExplicitWait(5);

		OrderPageCreateDarrimanOrderCreatePageProductbar.click();
		generic.ExplicitWait(5);

		OrderPageDarrimanOrderCreatePageProductApplication.click();
		generic.ExplicitWait(3);
		OrderPageDarrimanOrderCreatePageProductApplication1000.click();
		generic.ExplicitWait(3);

		try {

			OrderPageOrderTypeDropdownDarrimanEditUpdateOrder.click();
			generic.ExplicitWait(45);
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Page is not loaded");

		}
		
		generic.ExplicitWait(10);
		System.out.println("\nDarriman Lime Order Edited successfully");


	}

	@FindBy(xpath = "(//button[@class='fa-clipboard fa g-icon grid-button-style gb-or-ass-btn'])[1]")
	private WebElement OrderPageDarrimanAssignbutton;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[5]")
	private WebElement OrderPageODarrimanAssignAddBooking;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[8]")
	private WebElement assigndarrimanorderBookOrderEquipmentdropdown;

	@FindBy(xpath = "//ul[@id='equipmentName_listbox']/li[2]")
	private WebElement assigndarrimanorderBookOrderEquipmentdropdown1stDarLoader;

	@FindBy(xpath = "//ul[@id='equipmentName_listbox']/li[3]")
	private WebElement assigndarrimanorderBookOrderEquipmentdropdown2ndDarLoader;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[9]")
	private WebElement assigndarrimansorderBookOrderDriverdropdown;

	@FindBy(xpath = "//ul[@id='driverName_listbox']/li[4]")
	private WebElement assigndarrimanorderBookOrderDriverdropdown1StSelect;

	@FindBy(xpath = "//ul[@id='driverName_listbox']/li[5]")
	private WebElement assigndarrimanorderBookOrderDriverdropdown2ndSelect;

	@FindBy(xpath = "//html//div[@id='limeAssignmentWindow']//div[3]")
	private WebElement assigndarrimanorderBookOrderClickOutside;

	@FindBy(xpath = "//input[@id='tonsRemaining']")
	private WebElement assigndarrimansorderBookOrderRemainingWeight;

	@FindBy(xpath = "//input[@id='sysEstimatedTime']")
	private WebElement assigndarrimanorderBookOrderSystemEstimatedTime;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement assignDarrimanorderBookOrderConfirmWithCustomer;

	@FindBy(xpath = "//textarea[@id='bookingNote']")
	private WebElement assignDarrimanorderBookingNotes;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[8]")
	private WebElement assignDarrimanorderBookOrderDONE;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Assign Order')]")
	private WebElement assignDarrimanorderAssignOrder;

	public void assignDarrimanLimeOrder() throws InvalidFormatException, IOException

	{
		
		generic.ExplicitWait(8);
		OrderPageDarrimanAssignbutton.click();
		generic.ExplicitWait(8);
		
		OrderPageODarrimanAssignAddBooking.click();
		generic.ExplicitWait(5);

		assigndarrimanorderBookOrderEquipmentdropdown.click();
		generic.ExplicitWait(5);
		assigndarrimanorderBookOrderEquipmentdropdown2ndDarLoader.click();
		generic.ExplicitWait(5);
		assigndarrimansorderBookOrderDriverdropdown.click();
		generic.ExplicitWait(5);
		assigndarrimanorderBookOrderDriverdropdown2ndSelect.click();
		generic.ExplicitWait(8);
		int TotalweightofOrder = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 21, 3);
		System.out.println(TotalweightofOrder);

		int orderdivide = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 23, 3);
		System.out.println(orderdivide);

		int order1 = TotalweightofOrder / orderdivide;
		System.out.println(order1);
		generic.ExplicitWait(10);
	
		WebElement ele = driver.findElement(By.xpath("(//span[@class='k-numeric-wrap k-state-default k-expand-padding'])[2]"));
		Actions act = new Actions(driver);
		act.doubleClick(ele);
		generic.ExplicitWait(5);
		act.click().sendKeys(Keys.BACK_SPACE);
		act.sendKeys("" + order1).build().perform();
		generic.ExplicitWait(3);
		
		assigndarrimanorderBookOrderClickOutside.click();
		generic.ExplicitWait(5);
		
		String remainingweight = assigndarrimansorderBookOrderRemainingWeight.getAttribute("value");
		System.out.println("Remaining weight is " + remainingweight);
  
		generic.ExplicitWait(5);
		
		String systemestimatedtime = assigndarrimanorderBookOrderSystemEstimatedTime.getAttribute("value");
		System.out.println("System estimated time is " + systemestimatedtime);

		generic.ExplicitWait(8);
		WebElement managertime = driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[3]"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(managertime);
		generic.ExplicitWait(5);
		act1.sendKeys("" + systemestimatedtime).build().perform();
		generic.ExplicitWait(5);

		assignDarrimanorderBookOrderConfirmWithCustomer.click();
		generic.ExplicitWait(5);
		String bokingnotes = generic.GetExcelSheetStringCellValue(filepath, sheetname, 24, 3);
		System.out.println(bokingnotes);
		generic.ExplicitWait(3);
		assignDarrimanorderBookingNotes.sendKeys(bokingnotes);
		generic.ExplicitWait(3);

		assignDarrimanorderBookOrderDONE.click();
		generic.ExplicitWait(5);

		OrderPageODarrimanAssignAddBooking.click();
		generic.ExplicitWait(3);

		assigndarrimanorderBookOrderEquipmentdropdown.click();
		generic.ExplicitWait(5);
		assigndarrimanorderBookOrderEquipmentdropdown1stDarLoader.click();
		generic.ExplicitWait(5);
		assigndarrimansorderBookOrderDriverdropdown.click();
		generic.ExplicitWait(5);
		assigndarrimanorderBookOrderDriverdropdown1StSelect.click();

		generic.ExplicitWait(8);
		WebElement ele1 = driver.findElement(By.xpath("(//span[@class='k-numeric-wrap k-state-default k-expand-padding'])[2]"));
		Actions act12 = new Actions(driver);
		act12.doubleClick(ele1);
		generic.ExplicitWait(5);
		act12.click().sendKeys(Keys.BACK_SPACE);
		act12.sendKeys("" + remainingweight).build().perform();
		generic.ExplicitWait(3);
		
		assigndarrimanorderBookOrderClickOutside.click();
		generic.ExplicitWait(3);
		
		
		String remainingweight1 = assigndarrimansorderBookOrderRemainingWeight.getAttribute("value");
		System.out.println("Remaining weight is " + remainingweight1);
		generic.ExplicitWait(3);
		String systemestimatedtime1 = assigndarrimanorderBookOrderSystemEstimatedTime.getAttribute("value");
		System.out.println("System estimated time is " + systemestimatedtime1);

		generic.ExplicitWait(8);
		WebElement managertime1 = driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[3]"));
		Actions act2 = new Actions(driver);
		act2.doubleClick(managertime1);
		generic.ExplicitWait(5);
		act2.sendKeys("" + systemestimatedtime1).build().perform();
		generic.ExplicitWait(5);

		generic.ExplicitWait(3);
		assignDarrimanorderBookOrderConfirmWithCustomer.click();
		generic.ExplicitWait(3);

		String bokingnotes2 = generic.GetExcelSheetStringCellValue(filepath, sheetname, 24, 3);
		System.out.println(bokingnotes2);
		generic.ExplicitWait(3);
		assignDarrimanorderBookingNotes.sendKeys(bokingnotes2);
		generic.ExplicitWait(3);
		assignDarrimanorderBookOrderDONE.click();
		generic.ExplicitWait(3);

		assignDarrimanorderAssignOrder.click();
		generic.ExplicitWait(5);
		
		System.out.println("\nDarriman Lime Order assign successfully");


	}

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement assignDarrimanorderMainPageOrderStatusDropdown;

	@FindBy(xpath = "//ul[@id='ReadyForAssignment_listbox']/li[3]")
	private WebElement assignDarrimanorderMainPageOrderStatusDropdownReadyfordelievry;

	@FindBy(xpath = "(//button[@class='fa-truck fa g-icon grid-button-style gb-or-dis-btn'])[1]")
	private WebElement assignDarrimanorderMainPageOrderDispathchIcon;

	@FindBy(xpath = "(//th[@class='k-header k-with-icon k-filterable'])[10]")
	private WebElement assignDarrimanorderMainPageOrderrefresh;

	@FindBy(xpath = "(//button[@class='btn btn-primary k-button'])[2]")
	private WebElement OrderPageDarrimanorderReadyfordelievryDispatchCreate1stticket;

	@FindBy(xpath = "(//span[@class='k-widget k-timepicker k-header']//span[1])[1]/span")
	private WebElement OrderPageDarrimanorderReadyfordelievryDispatchStarttimeclick;

	@FindBy(xpath = "//ul[@id='dispatchTm_timeview']/li[5]")
	private WebElement OrderPageDarrimanorderReadyfordelievryDispatchStarttimeSelect;

	@FindBy(xpath = "//input[@name='docket']")
	private WebElement OrderPageDarrimanorderReadyfordelievryDocketsnumber;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Enter Ticket')]")
	private WebElement OrderPageDarrimanorderReadyfordelievryEnterTicket;

	@FindBy(xpath = "//div[@class='k-button dashboarddeletebtn'][contains(text(),'Back')]")
	private WebElement OrderPageDarrimanorderReadyfordelievryBackTicket;

	@FindBy(xpath = "//tr[@class='k-alt']//button[2]")
	private WebElement OrderPageDarrimanordereadyfordelievryDispatchCreate2ndtticket;

	public void CreateMixTicketsDarrimanLimeOrder() 
	{
		
		
		generic.ExplicitWait(20);
		OrderPageOrderTypeDropdown.click();
		generic.ExplicitWait(3);
		OrderPageOrderTypeDropdownDarriman.click();
        generic.ExplicitWait(3);
		assignDarrimanorderMainPageOrderStatusDropdown.click();
		generic.ExplicitWait(3);
		assignDarrimanorderMainPageOrderStatusDropdownReadyfordelievry.click();
		generic.ExplicitWait(5);
	
		assignDarrimanorderMainPageOrderDispathchIcon.click();
		generic.ExplicitWait(10);

		OrderPageDarrimanorderReadyfordelievryDispatchCreate1stticket.click();
		generic.ExplicitWait(5);
		
		int Docketsnumber = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 25, 3);
		System.out.println(Docketsnumber);
		generic.ExplicitWait(5);
		
		OrderPageDarrimanorderReadyfordelievryDocketsnumber.sendKeys(Docketsnumber+"");
		generic.ExplicitWait(5);
		
		OrderPageDarrimanorderReadyfordelievryEnterTicket.click();
		generic.ExplicitWait(5);
		
		OrderPageDarrimanorderReadyfordelievryBackTicket.click();
		generic.ExplicitWait(5);
		
		OrderPageDarrimanordereadyfordelievryDispatchCreate2ndtticket.click();
		generic.ExplicitWait(5);

		OrderPageDarrimanorderReadyfordelievryEnterTicket.click();
		generic.ExplicitWait(5);
		OrderPageDarrimanorderReadyfordelievryBackTicket.click();
		generic.ExplicitWait(5);
		
		System.out.println("\nFor Darriman Lime Order Mix Tickets successfully");


	}

}
