package com.QA.Gibsons_Connect_Orders;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class HomePage_Base_Page extends Generic_Service

{
//...................Xpath for home page menu bar......................//	
	
	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	
	
//--------------------Customers------------------------------------//
	
	@FindBy(xpath="//a[@id='Customers']")
	private WebElement CustomersMenuBar;
	
	
	
	
//----------------------------------------------------------------//	
	
	
//-------------------------Orders-----------------------//
	
	@FindBy(xpath="//a[@id='Orders']/span[1]")
	private WebElement OrdersMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[4]/ul/li[1]/a/span")
	private WebElement OrdersMenuBarOrders;
	
	
	@FindBy(xpath="//ul[@id='side-menu']/li[4]/ul/li[2]/a/span")
	private WebElement OrdersMenuBarLogistics;
	
//---------------------------------------------------------//	
	
	
	
//--------------------Quotes-------------------//	
	
	
	@FindBy(xpath="//a[@id='quote']/span[1]")
	private WebElement QuotesMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[5]/ul/li[1]/a/span")
	private WebElement QuotesMenuBarQuotes;
	
	
	@FindBy(xpath="//ul[@id='side-menu']/li[5]/ul/li[2]/a/span")
	private WebElement QuotesMenuBarSalesLog;
	

	
//--------------------------------------------------//	
	
	
//------------------Bookings--------------------------//	
	
	@FindBy(xpath="//a[@id='Booking']/span[1]")
	private WebElement BookingsMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[6]/ul/li[1]/a/span")
	private WebElement BookingsMenuBarBookings;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[6]/ul/li[2]/a/span")
	private WebElement BookingsMenuBarEmployeeCalender;
	
	
//--------------------------------------------------------//	
	
	
	//---------------Finance----------------------//
	
	
	@FindBy(xpath="//a[@id='ledgerEntryId']/span")
	private WebElement FinanaceMenuBar;

	
	
	//-----------------------------------------//
	
	
//--------------------Maintenance----------------------//
	
	@FindBy(xpath="//a[@id='orderMaintainanceId']/span[1]")
	private WebElement MentenaceMenuBar;
	
	@FindBy(xpath="//a[@id='orderMaintainance']/span")
	private WebElement MentenaceMenuBarOrders;
	
	@FindBy(xpath="(//a[@id='jobChechOff']/span)[1]")
	private WebElement MentenaceMenuBarJobCheckOff;
	
	@FindBy(xpath="//a[@id='maintainanceProduct']/span")
	private WebElement MentenaceMenuBarProducts;
	
	@FindBy(xpath="//a[@id='servicePack']/span")
	private WebElement MentenaceMenuBarServicePack;

	
	@FindBy(xpath="(//a[@id='jobDetails']/span)[1]")
	private WebElement MentenaceMenuBarJobDetails;
	
	@FindBy(xpath="//a[@id='maintenanceStock']/span")
	private WebElement MentenaceMenuBarStockAndInventrory;
	
	
	@FindBy(xpath="(//a[@id='jobDetails']/span)[2]")
	private WebElement MentenaceMenuBarpricing;
	
	
	@FindBy(xpath="//a[@id='maintenanceSupplier']/span")
	private WebElement MentenaceMenuBarSuplierDetails;
	
	
	@FindBy(xpath="//a[@id='maintenancePurchase']/span")
	private WebElement MentenaceMenuBarPurchaseOrder;
	
	@FindBy(xpath="//a[@id='maintenanceEquipment']/span")
	private WebElement MentenaceMenuBarEquipmentmanagement;
	
	
	
//---------------------------------------------------------//
	
	
	//================GrounSpreading===================//
	
	
	@FindBy(xpath="//a[@id='Groundspreading']/span[1]")
	private WebElement GroundSpreadingMenuBar;
	
	@FindBy(xpath="(//a[@id='jobChechOff']/span)[2]")
	private WebElement GroundSpreadingMenuBarJobCeckOff;
	
	@FindBy(xpath="//a[@id='editPaddock']/span")
	private WebElement GroundSpreadingMenuBarEditPeddock;
	
	@FindBy(xpath="//a[@id='Products']/span")
	private WebElement GroundSpreadingMenuBarproducts;
	
	@FindBy(xpath="//a[@id='seasonalPrice']/span")
	private WebElement GroundSpreadingMenuBarProductsSeaosnalPrice;
	
	@FindBy(xpath="//a[@id='Pricelist']/span")
	private WebElement GroundSpreadingMenuBarpricing;
	
	@FindBy(xpath="//a[@id='stock']/span")
	private WebElement GroundSpreadingMenuBarStockAndInventory;
	
	@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Bin')]")
	private WebElement GroundSpreadingMenuBarBin;
	
	
	
//=======================================================//	
	
	
//-----------------	WorkForceManagement--------------//
	
	
	@FindBy(xpath="//a[@id='Workforce']/span[1]")
	private WebElement WorkForceManagementBar;
	
	@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Employees')]")
	private WebElement WorkForceManagementBarTimeSheets;
	
	@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Timesheets')]")
	private WebElement WorkForceManagementBarEmployees;
	
	
	
//---------------------------------------------------//
	
	
//------------------Reports--------------//	
	
	@FindBy(xpath="//a[@id='Reports']/span[1]")
	private WebElement ReportsMenuBar;
	
	@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Reports Center')]")
	private WebElement ReportsMenuBarReportsCenter;
	
	@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Time Sheet')]")
	private WebElement ReportsMenuBarTimeSheets;
	
	@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Truck Report')]")
	private WebElement ReportsMenuBarTruckReport;
	
	
//------------------------------------------------//
	
	
//-------------------Administration----------//	


@FindBy(xpath="//a[@id='Administration']/span[1]")
private WebElement AdministrationMenuBar;

@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'System Configuration')]")
private WebElement AdministrationMenuBarSystemConfiguration;

@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'System Parameters')]")
private WebElement AdministrationMenuBarSystemParametrs;

@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Additional Charges')]")
private WebElement AdministrationMenuBarAdditionalCharges;

@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Additional Services')]")
private WebElement AdministrationMenuBarAdditionalServices;

@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Service Fees')]")
private WebElement AdministrationMenuBarServiceFee;

@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Depots')]")
private WebElement AdministrationMenuBarDeport;

@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'Entities')]")
private WebElement AdministrationMenuBarEntities;

@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'User Management')]")
private WebElement AdministrationMenuBarUserManagement;

@FindBy(xpath="//span[@class='submenu-title'][contains(text(),'System Release')]")
private WebElement AdministrationMenuBarSystemRelease;



//=============================================================//


//-------------EquipmentManagemnet---------------------//



@FindBy(xpath="//a[@id='Equipments']/span")
private WebElement EquIpmentManagementMenuBar;


//----------------------------------------------------//


//---------------WorkProcedure-------------------//

@FindBy(xpath="//a[@id='homeWorkProcedure']/span")
private WebElement WorkProcedureMenuBar;



//---------------------------------------/



//---------------------Receipts---------------//

@FindBy(xpath="//a[@id='Receipts']/span")
private WebElement ReceiptsMenuBar;


//------------------------------------------//

//..........................Methods For Navigation.....................//


public void TogglMenuBar()
{
	
	ToggleMenuBar.click();
}


//........Customers..........................//


public void navigateToCustomer()
{
	CustomersMenuBar.click();

}

//.............................................//


//......................orders....................//

public void navigateToOrdersMenuBar()
{
OrdersMenuBar.click();

}
public void navigateToOrdersMenuBarOrders()
{
	
OrdersMenuBar.click();
OrdersMenuBarOrders.click();
}

public void navigateToOrdersMenuLogistics()
{
OrdersMenuBar.click();
OrdersMenuBarLogistics.click();

}

//................................................//


//................Quotes....................//

public void navigateToQuotesMenuBar()
{

QuotesMenuBar.click();
}


public void navigateToQuotesMenuBarQuotes()
{
QuotesMenuBar.click();
QuotesMenuBarQuotes.click();

}
	

public void navigateToQuotesMenuBarSalesLog()
{
QuotesMenuBar.click();
QuotesMenuBarSalesLog.click();
}


//........................................................//




//..........................Bookings..........................//

public void navigateToBookingsMenuBar()
{
BookingsMenuBar.click();
}

public void navigateToBookingsMenuBarBookings()
{
BookingsMenuBar.click();
BookingsMenuBarBookings.click();
}
	
public void BookingsMenuBarEmployeeCalender()
{
BookingsMenuBar.click();
BookingsMenuBarEmployeeCalender.click();
}


//....................................................................//



//.........................Finance................//

public void navigateToFinanaceMenuBar()
{
FinanaceMenuBar.click();
}

//........................................................//




//.........................Mentenance.................//

public void navigateToMentenaceMenuBar()
{
 MentenaceMenuBar.click();
	
}
	
public void navigateToMentenaceMenuBarOrders()
{
MentenaceMenuBar.click();	
MentenaceMenuBarOrders.click();
}

public void navigateToMentenaceMenuBarJobCheckOff()
{
MentenaceMenuBar.click();	
MentenaceMenuBarJobCheckOff.click();
}
public void navigateToMentenaceMenuBarProducts()
{
	
MentenaceMenuBar.click();	
MentenaceMenuBarProducts.click();
}

public void navigateToMentenaceMenuBarServicePack()
	
{
MentenaceMenuBar.click();
MentenaceMenuBarServicePack.click();
	
}

public void navigateToMentenaceMenuBarJobDetails()
{
MentenaceMenuBar.click();	
MentenaceMenuBarJobDetails.click();
}


public void navigateToMentenaceMenuBarStockAndInventrory()
{
MentenaceMenuBar.click();	
MentenaceMenuBarStockAndInventrory.click();
	
}	

public void navigateToMentenaceMenuBarpricing()
{
	MentenaceMenuBar.click();
	MentenaceMenuBarpricing.click();
}	
	

public void navigateToMentenaceMenuBarSuplierDetails()
{
	MentenaceMenuBar.click();
	 MentenaceMenuBarSuplierDetails.click();
	
}

public void navigateToMentenaceMenuBarPurchaseOrder()
{
	MentenaceMenuBar.click();
	MentenaceMenuBarPurchaseOrder.click();
}

//....................................................................................//



//.........................Groundspreading............................//


public void navigateToGroundSpreadingMenuBar()

{
GroundSpreadingMenuBar.click();
}


public void navigateToGroundSpreadingMenuBarJobCeckOff()
{
	GroundSpreadingMenuBar.click();
	GroundSpreadingMenuBarJobCeckOff.click();
}
	

public void navigateToGroundSpreadingMenuBarEditPeddock()
{
	GroundSpreadingMenuBar.click();
	 GroundSpreadingMenuBarEditPeddock.click();
	 
}

public void navihgateToGroundSpreadingMenuBarproducts()
{
	
	GroundSpreadingMenuBar.click();
	 GroundSpreadingMenuBarproducts.click();
}
	public void navigateToGroundSpreadingMenuBarProductsSeaosnalPrice()
	{
		GroundSpreadingMenuBar.click();
	 GroundSpreadingMenuBarProductsSeaosnalPrice.click();
	 
	}
	
	public void navigateToGroundSpreadingMenuBarpricing()
	{
		GroundSpreadingMenuBar.click();
	 GroundSpreadingMenuBarpricing.click();
	}
	
	public void navigateToGroundSpreadingMenuBarStockAndInventory()
	{

	GroundSpreadingMenuBar.click();
	GroundSpreadingMenuBarStockAndInventory.click();

	}
//.................................................................//
	
	
	
	
//.............WorkForceMnagemnet.........................//	
	
	public void navigateToWorkForceManagementBar()
	{
 WorkForceManagementBar.click();
 
	}
	
	public void navigateToWorkForceManagementBarTimeSheets()
	{
		 WorkForceManagementBar.click();
	 WorkForceManagementBarTimeSheets.click();
	}
	
	public void navigateToWorkForceManagementBarEmployees()
	{
	WorkForceManagementBar.click();	
   WorkForceManagementBarEmployees.click();
	
	}
	
//..............................................................................//
	
	
	
//......................ReportsMenuBar........................//	
	
	
	
	public void navigateToReportsMenuBar()
	{
	 ReportsMenuBar.click();
	}
	
	public void navigateToReportsMenuBarReportsCenter()
	{
		ReportsMenuBar.click();
	 ReportsMenuBarReportsCenter.click();
	 
	}
	
	public void navigateToReportsMenuBarTruckReport()
	{
		ReportsMenuBar.click();
	 ReportsMenuBarTruckReport.click();
	}
	
public void navigateToReportsMenuBarTimeSheets()
{
	ReportsMenuBar.click();
	 ReportsMenuBarTimeSheets.click();
	
}

//............................................................//


//..................Administrations.....................//


public void navigateToAdministrationMenuBar()
{

AdministrationMenuBar.click();
}

public void navigateToAdministrationMenuBarSystemConfiguration()
{
	AdministrationMenuBar.click();
AdministrationMenuBarSystemConfiguration.click();
}
public void navigateToAdministrationMenuBarSystemParametrs()
{
	AdministrationMenuBar.click();
AdministrationMenuBarSystemParametrs.click();
}
public void navigateToAdministrationMenuBarAdditionalCharges()
{
	AdministrationMenuBar.click();
AdministrationMenuBarAdditionalCharges.click();
}

public void navigateToAdministrationMenuBarAdditionalServices()
{
	AdministrationMenuBar.click();
AdministrationMenuBarAdditionalServices.click();
}

public void navigateToAdministrationMenuBarServiceFee()
{
	AdministrationMenuBar.click();
AdministrationMenuBarServiceFee.click();
}

public void navigateToAdministrationMenuBarDeport()
{
	AdministrationMenuBar.click();
AdministrationMenuBarDeport.click();
}

public void navigateToAdministrationMenuBarEntities()
{
	AdministrationMenuBar.click();
AdministrationMenuBarEntities.click();
}

public void navigateToAdministrationMenuBarUserManagement()
{
	
	AdministrationMenuBar.click();
AdministrationMenuBarUserManagement.click();


}
//.....................................................................//


//..........EquipmentManagemnet......................//

public void navigateToEquIpmentManagementMenuBar()
{
EquIpmentManagementMenuBar.click();
}
//...........................................................//



//...........WorkProcedure..................//

public void navigateToWorkProcedureMenuBar()
{

	
WorkProcedureMenuBar.click();
}

//............................................//

//...................Receipt ..........................//



public void navigateToReceiptsMenuBar()
{
	

ReceiptsMenuBar.click();


}

Generic_Service generic=new Generic_Service();

public HomePage_Base_Page() 
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//span[@class='logo-text']")
private WebElement ApplicationName;


public void testAllentityareDisplaying()
{
	
generic.ExplicitWait(5);

System.out.println("Application name is:"+ApplicationName.getText());
System.out.println("Display  name is:"+CustomersMenuBar.getText());
generic.ExplicitWait(3);

System.out.println("Display name is:"+OrdersMenuBar.getText());
OrdersMenuBar.click();
generic.ExplicitWait(7);
System.out.println("Display name is:"+OrdersMenuBarOrders.getText());
System.out.println("Display name is:"+OrdersMenuBarLogistics.getText());
generic.ExplicitWait(7);

System.out.println("Diplay name is:"+QuotesMenuBar.getText());
QuotesMenuBar.click();
generic.ExplicitWait(7);
System.out.println("Display name is:"+QuotesMenuBarQuotes.getText());
System.out.println("Display name is:"+QuotesMenuBarSalesLog.getText());

generic.ExplicitWait(7);

System.out.println("Display name is:"+BookingsMenuBar.getText());
BookingsMenuBar.click();
generic.ExplicitWait(7);
System.out.println("Display name is:"+BookingsMenuBarBookings.getText());
System.out.println("Display name is:"+BookingsMenuBarEmployeeCalender.getText());


generic.ExplicitWait(7);
System.out.println("Display name is:"+FinanaceMenuBar.getText());


//generic.WebPageScrollDown(driver);
generic.ExplicitWait(7);
System.out.println("Display name is:"+MentenaceMenuBar.getText());
MentenaceMenuBar.click();
generic.ExplicitWait(15);
System.out.println("Display name is:"+MentenaceMenuBarOrders.getText());
System.out.println("Display name is:"+MentenaceMenuBarJobCheckOff.getText());
System.out.println("Display name is:"+MentenaceMenuBarProducts.getText());
System.out.println("Display name is:"+MentenaceMenuBarServicePack.getText());
System.out.println("Display name is:"+MentenaceMenuBarJobDetails.getText());
System.out.println("Display name is:"+MentenaceMenuBarStockAndInventrory.getText());
System.out.println("Display name is:"+MentenaceMenuBarpricing.getText());
System.out.println("Display name is:"+MentenaceMenuBarSuplierDetails.getText());
System.out.println("Display name is:"+MentenaceMenuBarPurchaseOrder.getText());
System.out.println("Display name is:"+MentenaceMenuBarEquipmentmanagement.getText());


//generic.WebPageScrollDown(driver);
System.out.println("Display name is:"+GroundSpreadingMenuBar.getText());
GroundSpreadingMenuBar.click();
generic.ExplicitWait(15);
System.out.println("Display name is:"+GroundSpreadingMenuBarJobCeckOff.getText());
System.out.println("Display name is:"+GroundSpreadingMenuBarEditPeddock.getText());
System.out.println("Display name is:"+GroundSpreadingMenuBarproducts.getText());
System.out.println("Display name is:"+GroundSpreadingMenuBarProductsSeaosnalPrice.getText());
System.out.println("Display name is:"+GroundSpreadingMenuBarpricing.getText());
System.out.println("Display name is:"+GroundSpreadingMenuBarStockAndInventory.getText());


generic.ExplicitWait(7);
System.out.println("Display name is:"+WorkForceManagementBar.getText());
WorkForceManagementBar.click();
generic.ExplicitWait(7);
System.out.println("Display name is:"+WorkForceManagementBarTimeSheets.getText());
System.out.println("Display name is:"+WorkForceManagementBarEmployees.getText());
generic.ExplicitWait(7);


 System.out.println("Display name is:"+ReportsMenuBar.getText());
 ReportsMenuBar.click();
 generic.ExplicitWait(7);
 System.out.println("Display name is:"+ReportsMenuBarReportsCenter.getText());
 System.out.println("Display name is:"+ReportsMenuBarTruckReport.getText());
 System.out.println("Display name is:"+ReportsMenuBarTimeSheets.getText());

 
generic.ExplicitWait(7);
System.out.println("Display name is:"+AdministrationMenuBar.getText());
AdministrationMenuBar.click();

generic.ExplicitWait(10);
System.out.println("Display name is:"+AdministrationMenuBarSystemConfiguration.getText());
System.out.println("Display name is:"+AdministrationMenuBarSystemParametrs.getText());
System.out.println("Display name is:"+AdministrationMenuBarAdditionalCharges.getText());
System.out.println("Display name is:"+AdministrationMenuBarAdditionalServices.getText());
System.out.println("Display name is:"+AdministrationMenuBarServiceFee.getText());
System.out.println("Display name is:"+AdministrationMenuBarDeport.getText());
System.out.println("Display name is:"+AdministrationMenuBarEntities.getText());
System.out.println("Display name is:"+AdministrationMenuBarUserManagement.getText());
generic.ExplicitWait(7);

System.out.println("Display name is:"+EquIpmentManagementMenuBar.getText());
System.out.println("Display name is:"+WorkProcedureMenuBar.getText());
System.out.println("Display name is:"+ReceiptsMenuBar.getText());


System.out.println("Display name is:"+UsenameOnHomePage.getText());








}
@FindBy(xpath="//li[@class='dropdown topbar-user']")
private WebElement UsenameOnHomePage;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-user pull-right']/li[5]")
private WebElement LogOut;

	
	public void takeEntireHomePageScreenShot() throws IOException
	{
		generic.ExplicitWait(5);
		ToggleMenuBar.click();
		Screenshot screenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	    BufferedImage image = screenshot1.getImage();
	 
	    ImageIO.write(image, "PNG", new File("./Screenshots/"+"HomePage.png"));
	    
		System.out.println("HomePage Screenshot has taken");
		
		
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
		generic.ExplicitWait(3);
		generic.WebPageScrollUp(driver);
}
	
	
	
	
public void Logout()
{
	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.xpath("//li[@class='dropdown topbar-user']"));
	action.moveToElement(we).build().perform();
	generic.ExplicitWait(5);
	LogOut.click();
	generic.ExplicitWait(5);
	System.out.println("Log out successfully");





}
	
	
	
	


}
	





