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


public class MavyValeLime_BasePage extends Generic_Service
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

	@FindBy(xpath = "//div[@id='5614_Division_RoleDiv']")
	private WebElement OrderPageMaryvaleLimeIcon;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement OrderPageCreateMaryvaleOrderSearchBar;

	@FindBy(xpath = "//ul[@id='part1AAC_listbox']/li[1]")
	private WebElement OrderPageCreateMaryvaleOrderSearchBarAce3;

	@FindBy(xpath = "//div[@class='go_back']/div[2]")
	private WebElement OrderPageCreateMaryvaleOrderGobutton;

	//String filepath = "C:\\Users\\riti raj\\Desktop\\Gibsons_Connect_TestData.xlsx";
	String filepath = "./ExcelFile/Gibsons_Connect_TestData.xlsx";
	
	String sheetname = "Orders";

	Generic_Service generic = new Generic_Service();

	public MavyValeLime_BasePage()
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
		System.out.println("\nNavigated to order Main Page");
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
	}

	@FindBy(xpath = "//div[@id='section4']")
	private WebElement OrderPageCreateMaryvaleOrderCreatePageDeliveryBar;

	@FindBy(xpath = "//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement OrderPageCreateMaryvaleOrderDeliveryCalenderIcon;

	@FindBy(xpath = "//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
	private WebElement OrderPageCreateMaryvaleOrderDeliveryCalenderFullIcon;

	@FindBy(xpath = "//td[@class='k-today k-state-focused']/a")
	private WebElement OrderPageCreateMaryvaleOrderDeliveryCalenderFullIconTodaysfocausdate;

	@FindBy(xpath = "//div[@id='section2']")
	private WebElement OrderPageCreateMaryvaleOrderCreatePageFarmAndLocationBar;

	@FindBy(xpath = "//div[@id='fDIV']/span/span/span[2]/span")
	private WebElement OrderPageCreateMaryvaleOrderCreatePageFarmAndLocationSelectFarmLocation;

	@FindBy(xpath = "//ul[@id='farmsDD_listbox']/li[2]")
	private WebElement OrderPageCreateMaryvaleOrderCreatePageFarmAndLocationSelectFarmLocationDutson;

	@FindBy(xpath = "//div[@id='section3']")
	private WebElement OrderPageCreateMaryvaleOrderCreatePageProductbar;

	@FindBy(xpath = "//div[@id='productHeaderDiv']/div[@class='gb-panel-small-border']/div[2]")
	private WebElement OrderPageCreateMaryvaleOrderCreatePageProductAddbutton;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement MaryvaleCreateOrderProductDropdown;

	@FindBy(xpath = "//ul[@id='op_1_1_listbox']/li[4]")
	private WebElement MaryvaleLimeCreateOrderProductSelect;

	@FindBy(xpath = "//input[@id='op_1_1']")
	private WebElement OrderPageCreateMaryvaleOrderCreatePageProductSearchAProductByName;

	@FindBy(xpath = "//li[@tabindex='-1'][contains(text(),'0-0-0-2 Mg5.5 Grit Lime')]")
	private WebElement OrderPageMaryvaleOrderCreatePageProductSearchAProductByNameMg;

	@FindBy(xpath = "//tr[@id='op_row_1']/td[2]/span[1]/span/span[2]")
	private WebElement OrderPageMaryvaleOrderCreatePageProductApplication;

	@FindBy(xpath = "//html//div[@id='op_1_2-list']//li[2]")
	private WebElement OrderPageMaryvaleOrderCreatePageProductApplication100;

	@FindBy(xpath = "//html//div[@id='op_1_2-list']//li[3]")
	private WebElement OrderPageMaryvaleOrderCreatePageProductApplication1000;

	@FindBy(xpath = "//input[@id='op_1_3']")
	private WebElement OrderPageMaryvaleOrderCreatePageProductWeight;

	@FindBy(xpath = "//tr[@id='op_row_1']/td[4]")
	private WebElement OrderPageMaryvaleOrderCreatePageCaptureTotalPrice;

	@FindBy(xpath = "//div[@id='section5']")
	private WebElement OrderPageMaryvaleOrderCreatePageNotesBar;

	@FindBy(xpath = "//div[@id='notesContentDiv']/a")
	private WebElement OrderPageMaryvaleOrderCreatePageAddNotes;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/textarea")
	private WebElement OrderPageMaryvaleOrderCreatePageAddNotesTextArea;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[2]")
	private WebElement OrderPageMaryvaleOrderCreatePageAddNotesCancel;

	@FindBy(xpath = "//div[@id='orderNotesList']/div/div/a[1]")
	private WebElement OrderPageMaryvaleOrderCreatePageAddNotesSave;

	@FindBy(xpath = "//div[@id='createOrderBtn']")
	private WebElement OrderPageMaryvaleOrderCreatePageCreateOrderButton;
	
	
	@FindBy(xpath = "//input[@id='bookingNumber']")
	private WebElement OrderPageMaryvaleOrderCreatePageCreateOrderBookingNumber;


	public void CreateMaryvaleLimeOrder() throws InvalidFormatException, IOException
	{
		OrderPageCreateNewOrder.click();
		generic.ExplicitWait(3);
		OrderPageMaryvaleLimeIcon.click();
		generic.ExplicitWait(3);
		OrderPageCreateMaryvaleOrderSearchBar.sendKeys("du");
		generic.ExplicitWait(5);
		OrderPageCreateMaryvaleOrderSearchBarAce3.click();
		generic.ExplicitWait(3);
		OrderPageCreateMaryvaleOrderGobutton.click();
		generic.ExplicitWait(3);

		OrderPageCreateMaryvaleOrderCreatePageDeliveryBar.click();

		generic.ExplicitWait(5);
		OrderPageCreateMaryvaleOrderDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		act.clickAndHold(OrderPageCreateMaryvaleOrderDeliveryCalenderFullIcon);
		generic.ExplicitWait(10);
		OrderPageCreateMaryvaleOrderDeliveryCalenderFullIconTodaysfocausdate.click();

		OrderPageCreateMaryvaleOrderCreatePageFarmAndLocationBar.click();
		generic.ExplicitWait(3);
		OrderPageCreateMaryvaleOrderCreatePageFarmAndLocationSelectFarmLocation.click();
		generic.ExplicitWait(3);
		OrderPageCreateMaryvaleOrderCreatePageFarmAndLocationSelectFarmLocationDutson.click();
		generic.ExplicitWait(3);
		OrderPageCreateMaryvaleOrderCreatePageProductbar.click();
		generic.ExplicitWait(3);
		
		int bookingnumber=generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 33, 3);
		OrderPageMaryvaleOrderCreatePageCreateOrderBookingNumber.sendKeys(bookingnumber+"");
		
		OrderPageCreateMaryvaleOrderCreatePageProductAddbutton.click();
		generic.ExplicitWait(3);
		OrderPageCreateMaryvaleOrderCreatePageProductSearchAProductByName.sendKeys("0-0-0-2 Mg5.5 Grit Lime");
		generic.ExplicitWait(10);
		OrderPageMaryvaleOrderCreatePageProductSearchAProductByNameMg.sendKeys(Keys.ARROW_DOWN);
		generic.ExplicitWait(5);
		OrderPageMaryvaleOrderCreatePageProductSearchAProductByNameMg.click();
		generic.ExplicitWait(10);

		OrderPageMaryvaleOrderCreatePageProductApplication.click();
		generic.ExplicitWait(3);
		OrderPageMaryvaleOrderCreatePageProductApplication100.click();
		generic.ExplicitWait(3);

		int weight = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 28, 3);
		System.out.println(weight);
		OrderPageMaryvaleOrderCreatePageProductWeight.sendKeys(weight+ "");
		generic.ExplicitWait(5);

		String Price = OrderPageMaryvaleOrderCreatePageCaptureTotalPrice.getText();
		System.out.println("Total Price is " + Price);
		generic.ExplicitWait(5);
		
		
		

		OrderPageMaryvaleOrderCreatePageNotesBar.click();
		generic.ExplicitWait(3);
		OrderPageMaryvaleOrderCreatePageAddNotes.click();
		generic.ExplicitWait(3);

		String ordernotes = generic.GetExcelSheetStringCellValue(filepath, sheetname, 29, 3);
		System.out.println(ordernotes);
		OrderPageMaryvaleOrderCreatePageAddNotesTextArea.sendKeys(ordernotes);
		generic.ExplicitWait(3);

		OrderPageMaryvaleOrderCreatePageAddNotesSave.click();
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);

		try{
		OrderPageMaryvaleOrderCreatePageCreateOrderButton.click();
		generic.ExplicitWait(45);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		System.out.println("Page is not loaded in 20 sec");
		}
		
		System.out.println("Maryvale Lime Order created successfully");
    
	}

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[1]")
	private WebElement OrderPageOrderTypeDropdown;
	

	@FindBy(xpath = "//ul[@id='entityList_listbox']/li[4]")
	private WebElement OrderPageOrderTypeDropdownMaryvale;
	
	
	

	@FindBy(xpath = "(//button[@class='fa-edit fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
	private WebElement OrderPageOrderTypeDropdownMaryvaleEditbutton;

	@FindBy(xpath = "//input[@id='purchaseNumber']")
	private WebElement OrderPageOrderTypeDropdownMaryvalePurchaseOrderNumber;

	@FindBy(xpath = "//div[@id='limeGrid']//th[3]/a[2]")
	private WebElement OrderPageOrderTypeDropdownMaryvaleRefresh;
	
	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Update Order')]")
	private WebElement OrderPageOrderTypeDropdownMaryvaleEditUpdateOrder;

	public void EditMaryvaleLimeOrder() throws InvalidFormatException, IOException 
	{

		
		generic.ExplicitWait(35);
		OrderPageOrderTypeDropdown.click();
		generic.ExplicitWait(5);
		OrderPageOrderTypeDropdownMaryvale.click();
		generic.ExplicitWait(5);
		
		OrderPageOrderTypeDropdownMaryvaleEditbutton.click();
		generic.ExplicitWait(5);
		OrderPageCreateMaryvaleOrderCreatePageProductbar.click();
		generic.ExplicitWait(5);
		OrderPageMaryvaleOrderCreatePageProductApplication.click();
		generic.ExplicitWait(5);
		OrderPageMaryvaleOrderCreatePageProductApplication1000.click();
		generic.ExplicitWait(5);
		
		try{
		OrderPageOrderTypeDropdownMaryvaleEditUpdateOrder.click();
		generic.ExplicitWait(35);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Page not loaded");
		}
		generic.ExplicitWait(10);

	}

	@FindBy(xpath = "(//button[@class='fa-clipboard fa g-icon grid-button-style gb-or-ass-btn'])[1]")
	private WebElement OrderPageOrderTypeDropdownMaryvaleAssignbutton;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[5]")
	private WebElement OrderPageOrderTypeDropdownMaryvaleAssignAddBooking;

	@FindBy(xpath = "//td[@style='padding-top:10px']/span[@class='k-widget k-dropdown k-header']/span[@unselectable='on']/span[1]")
	private WebElement assignMaryvaleorderBookOrderEquipmentdropdown;

	@FindBy(xpath = "//ul[@id='equipmentName_listbox']/li[2]")
	private WebElement assignMaryvaleorderBookOrderEquipmentdropdownDarLoader;

	
	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[9]")
	private WebElement assignMaryvalesorderBookOrderDriverdropdown;

	@FindBy(xpath = "//ul[@id='driverName_listbox']/li[4]")
	private WebElement assignMaryvaleorderBookOrderDriverdropdown1StSelect;

	@FindBy(xpath = "//ul[@id='driverName_listbox']/li[5]")
	private WebElement assignMaryvaleorderBookOrderDriverdropdownSelect;

	@FindBy(xpath = "//html//div[@id='limeAssignmentWindow']//div[3]")
	private WebElement assignMaryvaleorderBookOrderClickOutside;

	@FindBy(xpath = "//input[@id='tonsRemaining']")
	private WebElement assignMaryvalesorderBookOrderRemainingWeight;

	@FindBy(xpath = "//input[@id='sysEstimatedTime']")
	private WebElement assignMaryvaleorderBookOrderSystemEstimatedTime;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement assignMaryvaleorderBookOrderConfirmWithCustomer;
	
	@FindBy(xpath = "//textarea[@id='bookingNote']")
	private WebElement assignMaryvaleorderBookingNotes;

	
	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[8]")
	private WebElement assignMaryvaleorderBookOrderDONE;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Assign Order')]")
	private WebElement assignMaryvaleorderAssignOrder;

	public void assignMaryvaleLimeOrder() throws InvalidFormatException, IOException 
	
	{
		
		generic.ExplicitWait(5);
		OrderPageOrderTypeDropdownMaryvaleAssignbutton.click();
		generic.ExplicitWait(5);
		
		OrderPageOrderTypeDropdownMaryvaleAssignAddBooking.click();
		generic.ExplicitWait(5);

		assignMaryvaleorderBookOrderEquipmentdropdown.click();
		generic.ExplicitWait(5);
		assignMaryvaleorderBookOrderEquipmentdropdownDarLoader.click();
		generic.ExplicitWait(5);
		assignMaryvalesorderBookOrderDriverdropdown.click();
		generic.ExplicitWait(5);
		assignMaryvaleorderBookOrderDriverdropdownSelect.click();
		
		int TotalweightofOrder = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 28, 3);
		System.out.println(TotalweightofOrder);

		int orderdivide = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 30, 3);
		System.out.println(orderdivide);

		int order1 = TotalweightofOrder / orderdivide;
		System.out.println(order1);
		

		generic.ExplicitWait(8);
		WebElement ele = driver.findElement(By.xpath("(//span[@class='k-numeric-wrap k-state-default k-expand-padding'])[2]"));
		Actions act = new Actions(driver);
		act.doubleClick(ele);
		generic.ExplicitWait(5);
		act.click().sendKeys(Keys.BACK_SPACE);
		act.sendKeys("" + order1).build().perform();
		generic.ExplicitWait(5);
		assignMaryvaleorderBookOrderClickOutside.click();
		generic.ExplicitWait(5);
		generic.ExplicitWait(7);
		String remainingweight = assignMaryvalesorderBookOrderRemainingWeight.getAttribute("value");
		System.out.println("Remaining weight is " + remainingweight);
		generic.ExplicitWait(7);

		String systemestimatedtime = assignMaryvaleorderBookOrderSystemEstimatedTime.getAttribute("value");
		System.out.println("System estimated time is " + systemestimatedtime);

		generic.ExplicitWait(8);
		WebElement managertime = driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[3]"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(managertime);
		generic.ExplicitWait(5);
		act1.sendKeys("" +systemestimatedtime).build().perform();
		generic.ExplicitWait(5);

		assignMaryvaleorderBookOrderConfirmWithCustomer.click();
		generic.ExplicitWait(5);
		String bokingnotes=generic.GetExcelSheetStringCellValue(filepath, sheetname, 31,3);
		System.out.println(bokingnotes);
		generic.ExplicitWait(3);
		assignMaryvaleorderBookingNotes.sendKeys(bokingnotes);
		generic.ExplicitWait(3);
		assignMaryvaleorderBookOrderDONE.click();
		
		
		generic.ExplicitWait(7);
		OrderPageOrderTypeDropdownMaryvaleAssignAddBooking.click();
		generic.ExplicitWait(3);

		assignMaryvaleorderBookOrderEquipmentdropdown.click();
		generic.ExplicitWait(5);
		assignMaryvaleorderBookOrderEquipmentdropdownDarLoader.click();

		assignMaryvalesorderBookOrderDriverdropdown.click();
		generic.ExplicitWait(5);
		assignMaryvaleorderBookOrderDriverdropdown1StSelect.click();

		generic.ExplicitWait(8);
		WebElement ele1 = driver.findElement(By.xpath("(//span[@class='k-numeric-wrap k-state-default k-expand-padding'])[2]"));
		Actions act12 = new Actions(driver);
		act12.doubleClick(ele1);
		generic.ExplicitWait(5);
		act12.click().sendKeys(Keys.BACK_SPACE);
		act12.sendKeys("" + remainingweight).build().perform();
		generic.ExplicitWait(7);
		
		assignMaryvaleorderBookOrderClickOutside.click();
        generic.ExplicitWait(7);
        
		String remainingweight1 = assignMaryvalesorderBookOrderRemainingWeight.getAttribute("value");
		System.out.println("Remaining weight is " + remainingweight1);
        generic.ExplicitWait(7);
        
		String systemestimatedtime1 = assignMaryvaleorderBookOrderSystemEstimatedTime.getAttribute("value");
		System.out.println("System estimated time is " + systemestimatedtime1);

		generic.ExplicitWait(8);
		
		WebElement managertime1 = driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[3]"));
		Actions act2 = new Actions(driver);
		act2.doubleClick(managertime1);
		generic.ExplicitWait(5);
		act2.sendKeys("" + systemestimatedtime1).build().perform();
		generic.ExplicitWait(5);

		generic.ExplicitWait(3);
		assignMaryvaleorderBookOrderConfirmWithCustomer.click();
		generic.ExplicitWait(3);
		

		
		String bokingnotes2=generic.GetExcelSheetStringCellValue(filepath, sheetname, 31,3);
		System.out.println(bokingnotes2);
		generic.ExplicitWait(5);
		assignMaryvaleorderBookingNotes.sendKeys(bokingnotes2);
		generic.ExplicitWait(5);
		assignMaryvaleorderBookOrderDONE.click();
		generic.ExplicitWait(5);
		
		assignMaryvaleorderAssignOrder.click();
		generic.ExplicitWait(5);
		
		System.out.println("\nMaryvale order assign successfully");

	}
	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement assignMaryvaleorderMainPageOrderStatusDropdown;
	
	@FindBy(xpath = "//ul[@id='ReadyForAssignment_listbox']/li[3]")
	private WebElement assignMaryvaleorderMainPageOrderStatusDropdownReadyfordelievry;
	
	
	@FindBy(xpath = "(//button[@class='fa-truck fa g-icon grid-button-style gb-or-dis-btn'])[1]")
	private WebElement assignMaryvaleorderMainPageOrderDispathchIcon;
	
	@FindBy(xpath = "(//th[@class='k-header k-with-icon k-filterable'])[10]")
	private WebElement assignMaryvaleorderMainPageOrderrefresh;
	

	@FindBy(xpath="(//button[@class='btn btn-primary k-button'])[2]")
	private WebElement OrderPageMaryvaleorderReadyfordelievryDispatchCreate1stticket;
	
	@FindBy(xpath="(//span[@class='k-widget k-timepicker k-header']//span[1])[1]/span")
	private WebElement OrderPageMaryvaleorderReadyfordelievryDispatchStarttimeclick;
	
	
	@FindBy(xpath="//ul[@id='dispatchTm_timeview']/li[5]")
	private WebElement OrderPageMaryvaleorderReadyfordelievryDispatchStarttimeSelect;
	
	
	@FindBy(xpath="//input[@name='docket']")
	private WebElement OrderPageMaryvaleorderReadyfordelievryDocketsnumber;
	
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Enter Ticket')]")
	private WebElement OrderPageMaryvaleorderReadyfordelievryEnterTicket;
	
	
	@FindBy(xpath="//div[@class='k-button dashboarddeletebtn'][contains(text(),'Back')]")
	private WebElement OrderPageMaryvaleorderReadyfordelievryBackTicket;
	
	
	
	
	
	@FindBy(xpath="//tr[@class='k-alt']//button[2]")
	private WebElement OrderPageMaryvaleordereadyfordelievryDispatchCreate2ndtticket;
	
	
	
	
	 public void CreateMixTicketsMaryvaleOrder() 
	{
		   generic.ExplicitWait(5);
			OrderPageOrderTypeDropdown.click();
			generic.ExplicitWait(5);
			OrderPageOrderTypeDropdownMaryvale.click();
			generic.ExplicitWait(5);
		 
		 
		generic.ExplicitWait(3);
		assignMaryvaleorderMainPageOrderStatusDropdown.click();
		generic.ExplicitWait(3);
		assignMaryvaleorderMainPageOrderStatusDropdownReadyfordelievry.click();
		generic.ExplicitWait(3);
		
		assignMaryvaleorderMainPageOrderDispathchIcon.click();
		generic.ExplicitWait(10);

		OrderPageMaryvaleorderReadyfordelievryDispatchCreate1stticket.click();
		generic.ExplicitWait(5);
		
		int Docketsnumber = generic.GetExcelSheetIntegerCellValue(filepath, sheetname,32, 3);
		System.out.println(Docketsnumber);
		generic.ExplicitWait(3);
		
		OrderPageMaryvaleorderReadyfordelievryDocketsnumber.sendKeys(Docketsnumber + "");
		generic.ExplicitWait(3);
		
		OrderPageMaryvaleorderReadyfordelievryEnterTicket.click();
		generic.ExplicitWait(3);
		
		OrderPageMaryvaleorderReadyfordelievryBackTicket.click();
		generic.ExplicitWait(3);
		
		OrderPageMaryvaleordereadyfordelievryDispatchCreate2ndtticket.click();
		generic.ExplicitWait(3);

		OrderPageMaryvaleorderReadyfordelievryEnterTicket.click();
		generic.ExplicitWait(3);
		
		OrderPageMaryvaleorderReadyfordelievryBackTicket.click();
		generic.ExplicitWait(5);
		
		System.out.println("\nMaryvale mix ticket created successfully");

}
	
	
	
  
}
