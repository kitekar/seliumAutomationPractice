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

public class Logisctics_Order_BasePage extends Generic_Service
{
	
	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='Orders']")
	private WebElement OrdersMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[4]/ul/li[1]/a/span")
	private WebElement OrdersMenuBarOrders;
	
	@FindBy(xpath="//div[@srname='ORDERS_WRITE'][contains(text(),'Create a New Order')]")
	private WebElement OrderPageCreateNewOrder;
	
	
	@FindBy(xpath="//div[@id='5611_Division']")
	private WebElement OrderPageCreateNewOrderLogisticsIcon;
	
	

	@FindBy(xpath="//input[@id='part1AAC']")
	private WebElement OrderPageCreateLogisticsOrderSearchBar;
	
	@FindBy(xpath="//ul[@id='part1AAC_listbox']/li[1]")
	private WebElement OrderPageCreateLogisticsOrderSearchBarAce7;
	
	
	@FindBy(xpath="(//div[@class='btn btn-primary k-button'])[1]")
	private WebElement OrderPageCreateLogisticsOrderGobutton;
	
	
	
	
	@FindBy(xpath="//div[@id='GibsonsDepotPickup']")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationGibsonsDepotPickUp;

	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header']/span[1])[1]")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationGibsonsDepotPickUpDropdown;
	
	@FindBy(xpath="//ul[@id='depotPickupDD_listbox']/li[5]")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationGibsonsDepotPickUpDropdownSelect;
	
	
	
	
	@FindBy(xpath="//div[@id='CustomerAddressPickup']")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationCustomerAddress;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-combobox k-header'])[1]/span/span")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationCustomerAddressDropdownSelectFarmdropdown;
	
	@FindBy(xpath="(//div[@id='pickupFarmDD-list'])[3]/ul/li[1]")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationCustomerAddressDropdownSelectFarm;
	
	
	
	
	
	
	
	@FindBy(xpath="//div[@id='NewLocationPickup']")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationOtherLocation;
	

	@FindBy(xpath="//input[@id='pickupLocationNameAC']")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationOtherLocationSearchLocationBar;
	
	
	@FindBy(xpath="//ul[@id='pickupLocationNameAC_listbox']/li[5]")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationOtherLocationSearchLocationSelect;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement OrderPageCreateLogisticsOrderLogisticsPickupLocationOtherLocationRegistredwithcustomerCheckbox;
	


	
	
	
	
	@FindBy(xpath="//div[@id='GibsonsDepotDelivery']")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationGibsonsDepotPickUp;


	@FindBy(xpath="(//span[@class='k-dropdown-wrap k-state-default'])[4]")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationGibsonsDepotPickUpDropdown;
	
	
	@FindBy(xpath="//ul[@id='depotDeliveryDD_listbox']/li[3]")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationGibsonsDepotPickUpSelect;
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//div[@id='CustomerAddressDelivery']")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationCustomerAddress;
	@FindBy(xpath="(//span[@class='k-widget k-combobox k-header'])[2]/span/span")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationCustomerAddressDropdown;
	
	@FindBy(xpath="(//ul[@id='deliveryFarmDD_listbox'])[2]/li[1]")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationCustomerAddressSelect;
	
	
	
	
	
	
	@FindBy(xpath="//div[@id='NewLocationDelivery']")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationOtherLocation;
	@FindBy(xpath="")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationOtherLocationSearchbar;
	
	@FindBy(xpath="")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationOtherLocationSearchSelect;
	
	@FindBy(xpath="//input[@type='checkbox'])[2]")
	private WebElement OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationOtherLocationcheckbox;
	
	
	@FindBy(xpath="(//div[@class='btn btn-primary k-button'])[3]")
	private WebElement OrderPageCreateLogisticsOrderSelectbothlocationGo;
	
	
	@FindBy(xpath="//div[@id='section3']")
	private WebElement OrderPageCreateLogisticsOrderConsignmentBar;
	
	@FindBy(xpath="(//div[@class='gb-panel-small-border']/div[2])[1]")
	private WebElement OrderPageCreateLogisticsOrderConsignmentProductAddButton;
	
	@FindBy(xpath="//input[@id='op_1_1']")
	private WebElement OrderPageCreateLogisticsOrderConsignmentProductSearchBar;
	
	@FindBy(xpath="//ul[@id='op_1_1_listbox']/li")
	private WebElement OrderPageCreateLogisticsOrderConsignmentProductSearchBarProductselect;
	
	

	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[5]")
	private WebElement OrderPageCreateLogisticsOrderConsignmentProductApplicationDropdown;
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[7]")
	private WebElement OrderPageCreateLogisticsOrderConsignmentProductApplicationDropdownedit;
	
	@FindBy(xpath="//ul[@id='op_1_2_listbox']/li[4]")
	private WebElement OrderPageCreateLogisticsOrderConsignmentProductApplicationDropdowneditSelect;
	
	@FindBy(xpath="//ul[@id='op_1_2_listbox']/li[2]")
	private WebElement OrderPageCreateLogisticsOrderConsignmentProductApplicationSelect;
	

	@FindBy(xpath="//ul[@id='op_1_2_listbox']/li[3]")
	private WebElement OrderPageCreateLogisticsOrderConsignmentProductApplicationrate;
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Update Order')]")
	private WebElement OrderPageCreateLogisticsOrderUpdateOrder;
	
	
	@FindBy(xpath="//input[@id='op_1_3']")
	private WebElement OrderPageCreateLogisticsOrderConsignmentProductWeight;
	
	
	@FindBy(xpath="//div[@id='section4']")
	private WebElement OrderPageCreateLogisticsOrderDelieveryBar;
	
	@FindBy(xpath="//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement OrderPageCreateLogisticsDeliveryCalenderIcon;
	
	@FindBy(xpath="//div[@id='ee9cb678-e330-4bef-a21c-6a120bc1176c']")
	private WebElement OrderPageCreateLogisticsDeliveryCalenderFullIcon;
	
	@FindBy(xpath="//td[@class='k-today k-state-focused']/a")
	private WebElement OrderPageCreateLogisticsDeliveryCalenderFullIconTodaysfocausdate;
	
	
	
	@FindBy(xpath="//input[@name='deliveryDtPicker']")
	private WebElement OrderPageCreateLogisticsDeliverySelectDate;
	

	@FindBy(xpath="//td[@id='ea24c214-6f41-4543-b2f6-c396792d322d_cell_selected']")
	private WebElement OrderPageCreateLogisticsDeliverySelectTodaysDate;
	
	
	@FindBy(xpath="//div[@id='section5']")
	private WebElement OrderPageCreateLogisticsOrderNotesBar;
	
	@FindBy(xpath="//div[@id='createOrderBtn']")
	private WebElement OrderPageCreateLogisticsOrderCreateOrder;
	
	
	@FindBy(xpath="(//span[@class='k-dropdown-wrap k-state-default'])[3]")
	private WebElement OrderPageCreateLogisticsMainpageOrderStatusdropdown;
	
	
	
	@FindBy(xpath="//div[@class='k-toolbar k-grid-toolbar']/div[1]/span[1]")
	private WebElement OrderPageCreateLogisticsOrderCreateOrderTypeDropdown;
	
	@FindBy(xpath="//div[@id='wrapper']//div[1]/span[1]/span[1]")
	private WebElement OrderPageLogisticsOrderMainPageOrderTypeDropdown;
	
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[2]")
	private WebElement OrderPageLogisticsOrderMainPageOrderTypeDropdownLogistics;
	
	
	
	@FindBy(xpath="//div[@id='depotDropDown']/span")
	private WebElement OrderPageLogisticsMainpageDepotdropdown;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[1]")
	private WebElement OrderPageLogisticsMainpageDepotAll;
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[2]")
	private WebElement OrderPageCreateLogisticsOrderCreateOrderTypeDropdownSelect;
	
	@FindBy(xpath="//div[@id='freightGrid']//th[3]/a[2]")
	private WebElement OrderPageCreateLogisticsOrderCreateOrderTypeDropdownNumber;
	
	@FindBy(xpath="(//button[@class='fa-edit fa g-icon grid-button-style-edit gb-or-edi-btn'])[13]")
	private WebElement OrderPageCreateLogisticsOrderEditOrder;
	
	
	
	@FindBy(xpath="(//button[@class='fa-clipboard fa g-icon grid-button-style gb-or-ass-btn'])[11]")
	private WebElement OrderPageCreateLogisticsOrderCreateOrderTypeMainPageAssign;
	
	
	@FindBy(xpath="//div[@id='panel:0:42365']")
	private WebElement OrderPageCreateLogisticsOrderCreateOrderTypeAddBooking;
	
	
	
	
	
	
	
	
     Generic_Service generic=new Generic_Service();
     
   
    String filepath="./ExcelFile/Gibsons_Connect_TestData.xlsx";
    
 	String sheetname="GroundSpreadorder";
 	
	
	
	public Logisctics_Order_BasePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToLogoisticsOrder()
	{
		
		
		  generic.ExplicitWait(5);
		
			ToggleMenuBar.click();
			generic.ExplicitWait(5);
			OrdersMenuBar.click();
			generic.ExplicitWait(5);
			OrdersMenuBarOrders.click();
			generic.ExplicitWait(5);
			ToggleMenuBar.click();
			generic.ExplicitWait(5);
		
	}
	
	
	public void createNewLogoisticsOrder() throws InvalidFormatException, IOException
	{
	
		generic.ExplicitWait(5);
		OrderPageCreateNewOrder.click();
		generic.ExplicitWait(5);
		OrderPageCreateNewOrderLogisticsIcon.click();
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderSearchBar.sendKeys("ace");
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderSearchBarAce7.click();
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderGobutton.click();
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderLogisticsPickupLocationGibsonsDepotPickUp.click();
		generic.ExplicitWait(3);
		OrderPageCreateLogisticsOrderLogisticsPickupLocationGibsonsDepotPickUpDropdown.click();
		generic.ExplicitWait(3);
		OrderPageCreateLogisticsOrderLogisticsPickupLocationGibsonsDepotPickUpDropdownSelect.click();
		generic.ExplicitWait(3);

		OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationGibsonsDepotPickUp.click();
		generic.ExplicitWait(3);

		OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationGibsonsDepotPickUpDropdown.click();
		generic.ExplicitWait(3);

		OrderPageCreateLogisticsOrderLogisticsLogisticsDeliveryLocationGibsonsDepotPickUpSelect.click();
		generic.ExplicitWait(3);

		OrderPageCreateLogisticsOrderSelectbothlocationGo.click();
		generic.ExplicitWait(3);
		
		
		
		OrderPageCreateLogisticsOrderDelieveryBar.click();
		generic.ExplicitWait(5);
	    OrderPageCreateLogisticsDeliveryCalenderIcon.click();
		Actions act = new Actions(driver);
		
	    act.clickAndHold(OrderPageCreateLogisticsDeliveryCalenderFullIcon);
	    generic.ExplicitWait(10);
		
	    OrderPageCreateLogisticsDeliveryCalenderFullIconTodaysfocausdate.click();
	    generic.ExplicitWait(5);
		
		OrderPageCreateLogisticsOrderConsignmentBar.click();
		generic.ExplicitWait(3);
		
		
		
		OrderPageCreateLogisticsOrderConsignmentProductAddButton.click();
		OrderPageCreateLogisticsOrderConsignmentProductSearchBar.sendKeys("0-0-0-2 Mg5.5 Grit Lime");
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderConsignmentProductSearchBarProductselect.sendKeys(Keys.ARROW_DOWN);
		OrderPageCreateLogisticsOrderConsignmentProductSearchBarProductselect.click();
		
		OrderPageCreateLogisticsOrderConsignmentProductApplicationDropdown.click();
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderConsignmentProductApplicationSelect.click();
		

		int weight= generic.GetExcelSheetIntegerCellValue(filepath,sheetname,23,3);
		System.out.println(weight);
		OrderPageCreateLogisticsOrderConsignmentProductWeight.sendKeys(weight+"");
		generic.ExplicitWait(5);

		OrderPageCreateLogisticsOrderCreateOrder.click();
		generic.ExplicitWait(30);
		
	/*	
		OrderPageCreateLogisticsOrderCreateOrderTypeDropdown.click();
		
		
		OrderPageCreateLogisticsOrderCreateOrderTypeDropdownSelect.click();
		
		OrderPageLogisticsMainpageDepotdropdown.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsMainpageDepotAll.click();
		generic.ExplicitWait(7);
		

		OrderPageCreateLogisticsOrderCreateOrderTypeDropdownNumber.click();
		generic.ExplicitWait(5);
		
		OrderPageCreateLogisticsOrderCreateOrderTypeDropdownNumber.click();
		generic.ExplicitWait(5);
		 */
		 
		 
		
	
	}
	
	
	@FindBy(xpath="//input[@id='bookingNumber']")
	public WebElement BookingNumber;
	
	public void editLogiscticsOrder()
	{
		
		
		generic.ExplicitWait(5);
		OrderPageLogisticsOrderMainPageOrderTypeDropdown.click();
		generic.ExplicitWait(8);

		OrderPageLogisticsOrderMainPageOrderTypeDropdownLogistics.click();
		generic.ExplicitWait(5);

		OrderPageLogisticsMainpageDepotdropdown.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsMainpageDepotAll.click();
		generic.ExplicitWait(7);

		OrderPageCreateLogisticsOrderCreateOrderTypeDropdownNumber.click();
		generic.ExplicitWait(5);
		
		OrderPageCreateLogisticsOrderCreateOrderTypeDropdownNumber.click();
		generic.ExplicitWait(5);
		
		OrderPageCreateLogisticsOrderEditOrder.click();

		generic.ExplicitWait(7);
		OrderPageCreateLogisticsOrderConsignmentBar.click();
		generic.ExplicitWait(5);
		BookingNumber.sendKeys("12121");//Newlyadded
		generic.ExplicitWait(3);
		OrderPageCreateLogisticsOrderConsignmentProductApplicationDropdownedit.click();
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderConsignmentProductApplicationDropdowneditSelect.click();
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderUpdateOrder.click();
		generic.ExplicitWait(30);
		
		
	}
	
	
	@FindBy(xpath="(//button[@class='fa-clipboard fa g-icon grid-button-style gb-or-ass-btn'])[11]")
	private WebElement assignlogisticsorder;
	
	@FindBy(xpath="//div[@id='product_1']/div")
	private WebElement assignlogisticsorderBookOrder;
	
	
	@FindBy(xpath="//td[@style='padding-top:10px']/span[@class='k-widget k-dropdown k-header']/span[@unselectable='on']/span[1]")
	private WebElement assignlogisticsorderBookOrderEquipmentdropdown;
	
	@FindBy(xpath="//ul[@id='equipmentName_listbox']/li[2]")
	private WebElement assignlogisticsorderBookOrderEquipmentdropdownFert38;
	
	
	@FindBy(xpath="//ul[@id='equipmentName_listbox']/li[3]")
	private WebElement assignlogisticsorderBookOrderEquipmentdropdownFert39;
	
	@FindBy(xpath="//input[@id='sysEstimatedTime']")
	private WebElement assignlogisticsorderBookOrderSystemEstimatedTime;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox'])[3]")
	private WebElement assignlogisticsorderBookOrderManagerEstimatedTime;
	
	
	@FindBy(xpath="//div[@id='freightAssignmentWindow']//div[3]")
	private WebElement assignlogisticsorderBookOrderClickOutside;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement assignlogisticsorderBookOrderConfirmWithCustomer;
	
	@FindBy(xpath="//input[@id='tonsRemaining']")
	private WebElement assignlogisticsorderBookOrderRemainingWeight;
	
	@FindBy(xpath="(//div[@class='btn btn-primary k-button'])[7]")
	private WebElement assignlogisticsorderBookOrderDONE;
	
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Assign Order')]")
	private WebElement assignlogisticsorderASSIGNOrder;
	
	
	
	
	
	
	
	
	
	public void assignLogiscticsOrder()
	{ 
		
		int TotalweightofOrder = generic.GetExcelSheetIntegerCellValue(filepath, sheetname,23, 3);
		System.out.println(TotalweightofOrder);

		int orderdivide = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 9, 3);
		System.out.println(orderdivide);
		
		int order1=TotalweightofOrder/orderdivide ;
		System.out.println(order1);

		
		
		generic.ExplicitWait(5);
		OrderPageLogisticsOrderMainPageOrderTypeDropdown.click();
		generic.ExplicitWait(8);

		OrderPageLogisticsOrderMainPageOrderTypeDropdownLogistics.click();
		generic.ExplicitWait(5);

		OrderPageLogisticsMainpageDepotdropdown.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsMainpageDepotAll.click();
		generic.ExplicitWait(7);
		
		
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderCreateOrderTypeDropdownNumber.click();
		
		
		generic.ExplicitWait(5);
		OrderPageCreateLogisticsOrderCreateOrderTypeDropdownNumber.click();
		
		generic.ExplicitWait(5);
		assignlogisticsorder.click();
		
		generic.ExplicitWait(5);
		assignlogisticsorderBookOrder.click();
		
		generic.ExplicitWait(5);
		assignlogisticsorderBookOrderEquipmentdropdown.click();
		
		generic.ExplicitWait(5);
		assignlogisticsorderBookOrderEquipmentdropdownFert38.click();
		
		
		generic.ExplicitWait(8);
		WebElement ele=driver.findElement(By.xpath("//div[@id='freightAssignmentWindow']//td[4]/span[1]/span[1]/input[1]"));
		Actions act = new Actions(driver);
		act.doubleClick(ele);
		generic.ExplicitWait(5);
		act.click().sendKeys(Keys.BACK_SPACE);
		act.sendKeys(""+order1).build().perform();
		
		
		assignlogisticsorderBookOrderClickOutside.click();
		generic.ExplicitWait(5);
		
		String remainingweight=assignlogisticsorderBookOrderRemainingWeight.getAttribute("value");
		System.out.println("Remaining weight is "+remainingweight);
		
		String systemestimatedtime=assignlogisticsorderBookOrderSystemEstimatedTime.getAttribute("value");
		System.out.println("System estimated time is "+systemestimatedtime);
		
		
		generic.ExplicitWait(8);
		WebElement managertime=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[3]"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(managertime);
		generic.ExplicitWait(5);
		act1.sendKeys(""+systemestimatedtime).build().perform();
		generic.ExplicitWait(5);
		
		assignlogisticsorderBookOrderConfirmWithCustomer.click();
		
		assignlogisticsorderBookOrderDONE.click();
		generic.ExplicitWait(6);
		
	//---------------------------2nd order----------------------------//	
		
		generic.ExplicitWait(5);
		assignlogisticsorderBookOrder.click();
		
		generic.ExplicitWait(5);
		assignlogisticsorderBookOrderEquipmentdropdown.click();
		
		generic.ExplicitWait(5);
		assignlogisticsorderBookOrderEquipmentdropdownFert39.click();
		generic.ExplicitWait(3);
		
	
		WebElement weightbox=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[2]"));
		Actions act3 = new Actions(driver);
		act3.doubleClick(weightbox);
		generic.ExplicitWait(3);
		act3.click().sendKeys(Keys.BACK_SPACE);
		generic.ExplicitWait(3);
		act3.sendKeys(""+remainingweight).build().perform();
		
		
		assignlogisticsorderBookOrderClickOutside.click();
		generic.ExplicitWait(5);
		
		String systemestimatedtime2=assignlogisticsorderBookOrderSystemEstimatedTime.getAttribute("value");
		System.out.println(""+systemestimatedtime2);
		
		
		generic.ExplicitWait(3);
		WebElement managertime2=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[3]"));
		Actions act2 = new Actions(driver);
		act2.doubleClick(managertime2);
		generic.ExplicitWait(5);
		act2.sendKeys(systemestimatedtime2+"").build().perform();
		generic.ExplicitWait(3);
		
		assignlogisticsorderBookOrderConfirmWithCustomer.click();
		
		generic.ExplicitWait(3);
		assignlogisticsorderBookOrderDONE.click();
		generic.ExplicitWait(3);
		
		
		assignlogisticsorderASSIGNOrder.click();
		generic.ExplicitWait(5);

	}
	
	
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[3]")
	private WebElement OrderPageLogisticsorderMainpageorderstatusdropdown;
	
	@FindBy(xpath="//ul[@id='ReadyForAssignment_listbox']/li[3]")
	private WebElement OrderPageLogisticsorderMainpageorderstatusreadyfordelievrySelect;
	
	@FindBy(xpath="(//button[@class='fa-truck fa g-icon grid-button-style gb-or-dis-btn'])[8]")
	private WebElement OrderPageLogisticsorderReadyfordelievryDispatch;
	
	
	@FindBy(xpath="(//button[@class='btn btn-primary k-button'])[1]")
	private WebElement OrderPageLogisticsorderReadyfordelievryDispatchCreate1stticket;
	
	@FindBy(xpath="(//span[@class='k-widget k-timepicker k-header']//span[1])[1]/span")
	private WebElement OrderPageLogisticsorderReadyfordelievryDispatchStarttimeclick;
	
	
	@FindBy(xpath="//ul[@id='dispatchTm_timeview']/li[5]")
	private WebElement OrderPageLogisticsorderReadyfordelievryDispatchStarttimeSelect;
	
	
	@FindBy(xpath="//input[@name='docket']")
	private WebElement OrderPageLogisticsorderReadyfordelievryDocketsnumber;
	
	
	@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Enter Ticket')]")
	private WebElement OrderPageLogisticsorderReadyfordelievryEnterTicket;
	
	
	@FindBy(xpath="//div[@class='k-button dashboarddeletebtn'][contains(text(),'Back')]")
	private WebElement OrderPageLogisticsorderReadyfordelievryBackTicket;
	
	
	
	
	
	@FindBy(xpath="//html//tr[@class='k-alt']//button[1]")
	private WebElement OrderPageLogisticsorderReadyfordelievryDispatchCreate2ndtticket;
	
	
	
	
	public void createLogisticsOrderMixTickets()
	{
		
		generic.ExplicitWait(5);
		OrderPageLogisticsOrderMainPageOrderTypeDropdown.click();
		generic.ExplicitWait(8);

		OrderPageLogisticsOrderMainPageOrderTypeDropdownLogistics.click();
		generic.ExplicitWait(5);

		OrderPageLogisticsMainpageDepotdropdown.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsMainpageDepotAll.click();
		generic.ExplicitWait(5);
	    
		OrderPageLogisticsorderMainpageorderstatusdropdown.click();
		generic.ExplicitWait(3);
		OrderPageLogisticsorderMainpageorderstatusreadyfordelievrySelect.click();
		generic.ExplicitWait(5);
		
		
	
		 OrderPageLogisticsorderReadyfordelievryDispatch.click();
		 generic.ExplicitWait(3);

		 
		 
		 OrderPageLogisticsorderReadyfordelievryDispatchCreate1stticket.click();
		 generic.ExplicitWait(3);
		 OrderPageLogisticsorderReadyfordelievryDispatchStarttimeclick.click();
		 generic.ExplicitWait(3);
		 OrderPageLogisticsorderReadyfordelievryDispatchStarttimeSelect.click();
		 generic.ExplicitWait(3);
		 int Docketsnumber=generic.GetExcelSheetIntegerCellValue(filepath, sheetname,25, 3);
		 System.out.println(Docketsnumber);
		 generic.ExplicitWait(3);
		 OrderPageLogisticsorderReadyfordelievryDocketsnumber.sendKeys(Docketsnumber+"");
		 generic.ExplicitWait(3);
		 OrderPageLogisticsorderReadyfordelievryEnterTicket.click();
		 generic.ExplicitWait(3);
		 OrderPageLogisticsorderReadyfordelievryBackTicket.click();
		 generic.ExplicitWait(3); 
		 OrderPageLogisticsorderReadyfordelievryDispatchCreate2ndtticket.click();
		 generic.ExplicitWait(3);
		
		 OrderPageLogisticsorderReadyfordelievryEnterTicket.click();
		 generic.ExplicitWait(3);
		 OrderPageLogisticsorderReadyfordelievryBackTicket.click();
		 generic.ExplicitWait(5);
		 
}
	
	@FindBy(xpath="//span[@class='k-widget k-dropdown k-header']/span[1]")
	private WebElement OrderPageLogiscticsorderTrukietruckdropdown;
	
	@FindBy(xpath="//ul[@id='truckSelector_listbox']/li[19]")
	private WebElement OrderPageLogiscticsorderTrukietruck1stdropdownSelect;
	
	@FindBy(xpath="//ul[@id='truckSelector_listbox']/li[20]")
	private WebElement OrderPageLogiscticsorderTrukietruck2nddropdownSelect;
	
	
	
	
	@FindBy(xpath="//input[@id='rdBtnYesAssignAdditionalEquipment']")
	private WebElement OrderPageLogiscticsorderTrukietrailerloaderfloateryesbutton;
	
	

	@FindBy(xpath="//select[@id='loaderSelector_0']")
	private WebElement OrderPageLogiscticsorderTrukieifyesforloaderfloterdropdown;
	
	
	@FindBy(xpath="//select[@id='loaderSelector_0']//option[@value='1186']")
	private WebElement OrderPageLogiscticsorderTrukieifyesforloaderfloterSelect;
	
	@FindBy(xpath="//div[@class='btn btn-primary button-size k-button'][contains(text(),'Start Your Day')]")
	private WebElement OrderPageLogiscticsorderTrukieStartYourDay;
	
	
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[1]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleStartHour;
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[2]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleStartKm;
	
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[3]/button[1]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleBrakesSteeringOperatingYes;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[3]/button[2]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleBrakesSteeringOperatingNo;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[4]/button[1]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleGaugesLightsYes;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[4]/button[2]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleGaugesLightsNo;
	
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[5]/button[1]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleWindscreenMirrorsWindowsYes;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[5]/button[2]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleWindscreenMirrorsWindowsNo;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[6]/button[1]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleAccessEgressYes;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[6]/button[2]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleAccessEgressNo;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[7]/button[1]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleSeatSeatbeltYes;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[7]/button[2]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleSeatSeatbeltNo;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[8]/button[1]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleWheelsTyresNutsDamageWearYes;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[8]/button[2]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleWheelsTyresNutsDamageWearNo;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[9]/button[1]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleHydraulics_RamsHosesDamageWearYes;
	
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[9]/button[2]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleHydraulics_RamsHosesDamageWearNo;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[10]/button[1]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleOil_CoolantLevelsYes;
	
	@FindBy(xpath="(//td[@class='checklist-style-td'])[10]/button[2]")
	private WebElement OrderPageLogiscticsorderTrukieVehicleOil_CoolantLevelsNo;
	
	@FindBy(xpath="//div[@id='btnCompleteChecklist']")
	private WebElement OrderPageLogiscticsorderTrukieVehicleCompleteCHecklistNext;
	
	@FindBy(xpath="//button[@id='12_cq_yes']")
	private WebElement OrderPageLogiscticsorderTrukieVehicleCompleteCHecklistNextLoaderprestartchceklistq1Yes;
	
	@FindBy(xpath="//button[@id='12_cq_no']")
	private WebElement OrderPageLogiscticsorderTrukieVehicleCompleteCHecklistNextLoaderprestartchceklistq1No;
	
	@FindBy(xpath="//a[@type='button']")
	private WebElement OrderPageLogiscticsorderTrukieVehicleCompleteCHecklistNextLoaderprestartchceklistqBack;
	
	@FindBy(xpath="//div[@id='btnCompleteChecklist']")
	private WebElement OrderPageLogiscticsorderTrukieVehicleCompleteCHecklistNextLoaderprestartchceklistComplete;
	
	
	@FindBy(xpath="//a[@type='button']")
	private WebElement OrderPageLogiscticsorderTrukieVehicleCompleteCHeckLIstNext;	
	
	
	@FindBy(xpath="(//div[@id='jobsDiv']//td[2])[1]")
	private WebElement OrderPageLogisticsorderTrukieVehicleJob;
	
	
	@FindBy(xpath="//button[@id='btnArrivedOnSiteJobDetails']")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobarrivedatpickuplocation;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox'])[1]")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobarrivedatpickuplocationActuaalyloadedtons;
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox'])[2]")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobAxleweightsSteer;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox'])[3]")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobAxleweightsSteerDrive;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox'])[4]")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobAxleweightsSteerGroupA;
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox'])[5]")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobAxleweightsSteerGroupB;
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox'])[6]")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobAxleweightsSteerGroupC;
	
	@FindBy(xpath="//form[@id='freightWeightLoadedForm']//table[@style='margin-left: 20px; font-size: 13px !important;']//tbody//tr[@style='height: 20px;vertical-align:top']//td//span[@data-bind='text: productQuatity']")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobTonsTobeLoaded;
	
	
	@FindBy(xpath="//div[@id='completeJob']")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobLoadingComplete;
	
	@FindBy(xpath="(//div[@class='panel-body']//div[@class='btn btn-primary k-button'])[6]")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobLoadingroutedtotheDropoffYes ;
	
	
	@FindBy(xpath="//div[@id='onArrivedOnDepot']")
	private WebElement OrderPageLogisticsorderTrukieVehicleJobLoadingArrivedatdropOff ;
	
	
	@FindBy(xpath="//button[@id='221_cq_yes']")
	private WebElement OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq1Yes;
	

	@FindBy(xpath="//button[@id='222_cq_yes']")
	private WebElement OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq2Yes;
	
	
	
	@FindBy(xpath="//button[@id='223_cq_yes']")
	private WebElement OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq3Yes;
	

	
	
	@FindBy(xpath="//button[@id='224_cq_yes']")
	private WebElement OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq4Yes;
	

	
	
	@FindBy(xpath="//button[@id='225_cq_yes']")
	private WebElement OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq5Yes;
	

	
	@FindBy(xpath="//button[@id='226_cq_yes']")
	private WebElement OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq6Yes;

	
	@FindBy(xpath="//div[@id='startJob']")
	private WebElement OrderPageGroundspraedorderTrukieStartUnloading;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-numerictextbox'])[7]")
	private WebElement OrderPageGroundspraedorderTrukieStartUnloadingActualUnloadedtons;
	
	
	@FindBy(xpath="//div[@id='completeJob']")
	private WebElement OrderPageGroundspraedorderTrukieStartUnloadingComplete;
	
	@FindBy(xpath="//span[@id='distanceDrivenFreight']")
	private WebElement OrderPageGroundspraedorderTrukieStartUnloadingCompleteMainPageDistancedriven;
	

	@FindBy(xpath="//span[@id='hoursSpreadFreight']")
	private WebElement OrderPageGroundspraedorderTrukieStartUnloadingCompleteMainPageHourSpent;
	
	@FindBy(xpath="//span[@id='tonnesSpreadFreight']")
	private WebElement OrderPageGroundspraedorderTrukieStartUnloadingCompleteMainPageTonssSpread;
	
	
	@FindBy(xpath="//a[@class='btn btn-primary k-button']")
	private WebElement OrderPageLogisticsorderTrukieVehicleCompletejobMainPageFinishYourDay;
	
	
	@FindBy(xpath="//div[@id='btnFinishDay']")
	private WebElement OrderPageLogisticsorderTrukieVehicleCompletejobMainPageFinishYourDayFinish;
	
	
	
	public void Do1stLogiscticsJobinTrukie()
	{
		
		generic.ExplicitWait(8);
		OrderPageLogiscticsorderTrukietruckdropdown.click();
		
		generic.ExplicitWait(5);
		OrderPageLogiscticsorderTrukietruck1stdropdownSelect.click();
		generic.ExplicitWait(5);
		
		
		OrderPageLogiscticsorderTrukieStartYourDay.click();
		generic.ExplicitWait(5);

		int startHr = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 14, 3);	
		System.out.println( startHr);
		WebElement e=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[1]"));
		Actions a=new Actions(driver);
		a.doubleClick(e);
		a.sendKeys(""+startHr).build().perform();
		
	

		
		int startkm = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 15, 3);
		System.out.println(startkm);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[2]"));
		Actions a1=new Actions(driver);
		a1.doubleClick(e1);
		a1.sendKeys(""+startkm).build().perform();
		
		
		OrderPageLogiscticsorderTrukieVehicleBrakesSteeringOperatingYes.click();

		OrderPageLogiscticsorderTrukieVehicleGaugesLightsYes.click();

		OrderPageLogiscticsorderTrukieVehicleWindscreenMirrorsWindowsYes.click();

		OrderPageLogiscticsorderTrukieVehicleAccessEgressYes.click();

		OrderPageLogiscticsorderTrukieVehicleSeatSeatbeltYes.click();

		OrderPageLogiscticsorderTrukieVehicleWheelsTyresNutsDamageWearYes.click();

		OrderPageLogiscticsorderTrukieVehicleHydraulics_RamsHosesDamageWearYes.click();

		OrderPageLogiscticsorderTrukieVehicleOil_CoolantLevelsYes.click();

		OrderPageLogiscticsorderTrukieVehicleCompleteCHecklistNext.click();

        generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleJob.click();
		generic.ExplicitWait(5);

		OrderPageLogisticsorderTrukieVehicleJobarrivedatpickuplocation.click();
		generic.ExplicitWait(5);

		generic.ExplicitWait(5);
		int actualloadedtonn1= generic.GetExcelSheetIntegerCellValue(filepath, sheetname,27,3);
		System.out.println(actualloadedtonn1);
		generic.ExplicitWait(5);
		WebElement loadedtonn1=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[1]"));
		Actions as1=new Actions(driver);
		as1.doubleClick(loadedtonn1);
		as1.sendKeys(""+actualloadedtonn1).build().perform();
	    generic.ExplicitWait(5);
		
		
	
		
		OrderPageLogisticsorderTrukieVehicleJobLoadingComplete.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleJobLoadingroutedtotheDropoffYes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleJobLoadingArrivedatdropOff.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq1Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq2Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq3Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq4Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq5Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq6Yes.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieStartUnloading.click();
		
		
		
		generic.ExplicitWait(5);
		int actualunloadedtonn1= generic.GetExcelSheetIntegerCellValue(filepath, sheetname,27,3);
		System.out.println(actualloadedtonn1);
		generic.ExplicitWait(5);
		WebElement unloadedtonn1=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[7]"));
		Actions ns=new Actions(driver);
		ns.doubleClick(unloadedtonn1);
		ns.sendKeys(""+actualunloadedtonn1).build().perform();
	    generic.ExplicitWait(5);
				
		
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieStartUnloadingComplete.click();
		generic.ExplicitWait(5);
		String distancedriven = OrderPageGroundspraedorderTrukieStartUnloadingCompleteMainPageDistancedriven.getText();
		System.out.println(distancedriven);

		String HourSpent = OrderPageGroundspraedorderTrukieStartUnloadingCompleteMainPageHourSpent.getText();
		System.out.println(HourSpent);

		String tonSpread = OrderPageGroundspraedorderTrukieStartUnloadingCompleteMainPageTonssSpread.getText();
		System.out.println(tonSpread);
		
		
		
		
		    generic.ExplicitWait(5);
			int enterfuel = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 16, 3);
			System.out.println(enterfuel);
			WebElement fuel=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[3]/span"));
			Actions ac=new Actions(driver);
			ac.doubleClick(fuel);
			ac.sendKeys(""+enterfuel).build().perform();
			
			
			generic.ExplicitWait(5);
			int enteradblue = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 16, 3);
			System.out.println(enterfuel);
			WebElement adbuel=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[4]/span"));
			Actions action=new Actions(driver);
			action.doubleClick(adbuel);
			action.sendKeys(""+enteradblue).build().perform();
			
			generic.ExplicitWait(5);
			OrderPageLogisticsorderTrukieVehicleCompletejobMainPageFinishYourDay.click();
		
			int finishdayhr= generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 20, 3);
			System.out.println(finishdayhr);
			generic.ExplicitWait(5);
			WebElement finishr=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox k-input'])[1]/span"));
			Actions n=new Actions(driver);
			n.doubleClick(finishr);
			n.sendKeys(""+finishdayhr).build().perform();
			
			
			generic.ExplicitWait(3);
			int finishdaykm= generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 19, 3);
			System.out.println(finishdaykm);
			generic.ExplicitWait(5);
			WebElement finishkm=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox k-input'])[2]/span"));
			Actions as=new Actions(driver);
			as.doubleClick(finishkm);
			as.sendKeys(""+ finishdaykm).build().perform();
			
			generic.ExplicitWait(3);
			OrderPageLogisticsorderTrukieVehicleCompletejobMainPageFinishYourDayFinish.click();
			generic.ExplicitWait(8);
			
			
			 
			
	}
	

	
	
	
	public void Do2ndtLogiscticsJobinTrukie()
	{
		
		
		generic.ExplicitWait(8);
		OrderPageLogiscticsorderTrukietruckdropdown.click();
		
		generic.ExplicitWait(5);
		OrderPageLogiscticsorderTrukietruck2nddropdownSelect.click();
		generic.ExplicitWait(5);
		
		
		OrderPageLogiscticsorderTrukieStartYourDay.click();
		generic.ExplicitWait(5);

		int startHr = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 14, 3);	
		System.out.println( startHr);
		WebElement e=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[1]"));
		Actions a=new Actions(driver);
		a.doubleClick(e);
		a.sendKeys(""+startHr).build().perform();
		
	

		
		int startkm = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 15, 3);
		System.out.println(startkm);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number']/span)[2]"));
		Actions a1=new Actions(driver);
		a1.doubleClick(e1);
		a1.sendKeys(""+startkm).build().perform();
		
		
		OrderPageLogiscticsorderTrukieVehicleBrakesSteeringOperatingYes.click();

		OrderPageLogiscticsorderTrukieVehicleGaugesLightsYes.click();

		OrderPageLogiscticsorderTrukieVehicleWindscreenMirrorsWindowsYes.click();

		OrderPageLogiscticsorderTrukieVehicleAccessEgressYes.click();

		OrderPageLogiscticsorderTrukieVehicleSeatSeatbeltYes.click();

		OrderPageLogiscticsorderTrukieVehicleWheelsTyresNutsDamageWearYes.click();

		OrderPageLogiscticsorderTrukieVehicleHydraulics_RamsHosesDamageWearYes.click();

		OrderPageLogiscticsorderTrukieVehicleOil_CoolantLevelsYes.click();

		OrderPageLogiscticsorderTrukieVehicleCompleteCHecklistNext.click();

        generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleJob.click();
		generic.ExplicitWait(5);

		OrderPageLogisticsorderTrukieVehicleJobarrivedatpickuplocation.click();
		generic.ExplicitWait(5);

		generic.ExplicitWait(5);
		int actualloadedtonn1= generic.GetExcelSheetIntegerCellValue(filepath, sheetname,27,3);
		System.out.println(actualloadedtonn1);
		generic.ExplicitWait(5);
		WebElement loadedtonn1=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[1]"));
		Actions as1=new Actions(driver);
		as1.doubleClick(loadedtonn1);
		as1.sendKeys(""+actualloadedtonn1).build().perform();
	    generic.ExplicitWait(5);
		
		
	
		
		OrderPageLogisticsorderTrukieVehicleJobLoadingComplete.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleJobLoadingroutedtotheDropoffYes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleJobLoadingArrivedatdropOff.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq1Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq2Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq3Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq4Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq5Yes.click();
		generic.ExplicitWait(5);
		OrderPageLogisticsorderTrukieVehicleRoutedtoJobUnloadingChecklistq6Yes.click();
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieStartUnloading.click();
		
		
		
		generic.ExplicitWait(5);
		int actualunloadedtonn1= generic.GetExcelSheetIntegerCellValue(filepath, sheetname,27,3);
		System.out.println(actualloadedtonn1);
		generic.ExplicitWait(5);
		WebElement unloadedtonn1=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox'])[7]"));
		Actions ns=new Actions(driver);
		ns.doubleClick(unloadedtonn1);
		ns.sendKeys(""+actualunloadedtonn1).build().perform();
	    generic.ExplicitWait(5);
				
		
		generic.ExplicitWait(5);
		OrderPageGroundspraedorderTrukieStartUnloadingComplete.click();
		generic.ExplicitWait(5);
		String distancedriven = OrderPageGroundspraedorderTrukieStartUnloadingCompleteMainPageDistancedriven.getText();
		System.out.println(distancedriven);

		String HourSpent = OrderPageGroundspraedorderTrukieStartUnloadingCompleteMainPageHourSpent.getText();
		System.out.println(HourSpent);

		String tonSpread = OrderPageGroundspraedorderTrukieStartUnloadingCompleteMainPageTonssSpread.getText();
		System.out.println(tonSpread);
		
		
		
		
		    generic.ExplicitWait(5);
			int enterfuel = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 16, 3);
			System.out.println(enterfuel);
			WebElement fuel=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[3]/span"));
			Actions ac=new Actions(driver);
			ac.doubleClick(fuel);
			ac.sendKeys(""+enterfuel).build().perform();
			
			
			generic.ExplicitWait(5);
			int enteradblue = generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 16, 3);
			System.out.println(enterfuel);
			WebElement adbuel=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox checklist-style-control-number'])[4]/span"));
			Actions action=new Actions(driver);
			action.doubleClick(adbuel);
			action.sendKeys(""+enteradblue).build().perform();
			
			generic.ExplicitWait(5);
			OrderPageLogisticsorderTrukieVehicleCompletejobMainPageFinishYourDay.click();
		
			int finishdayhr= generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 20, 3);
			System.out.println(finishdayhr);
			generic.ExplicitWait(5);
			WebElement finishr=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox k-input'])[1]/span"));
			Actions n=new Actions(driver);
			n.doubleClick(finishr);
			n.sendKeys(""+finishdayhr).build().perform();
			
			
			generic.ExplicitWait(3);
			int finishdaykm= generic.GetExcelSheetIntegerCellValue(filepath, sheetname, 19, 3);
			System.out.println(finishdaykm);
			generic.ExplicitWait(5);
			WebElement finishkm=driver.findElement(By.xpath("(//span[@class='k-widget k-numerictextbox k-input'])[2]/span"));
			Actions as=new Actions(driver);
			as.doubleClick(finishkm);
			as.sendKeys(""+ finishdaykm).build().perform();
			
			generic.ExplicitWait(3);
			OrderPageLogisticsorderTrukieVehicleCompletejobMainPageFinishYourDayFinish.click();
			generic.ExplicitWait(8);
			
			
			 
			
		
	}


}
