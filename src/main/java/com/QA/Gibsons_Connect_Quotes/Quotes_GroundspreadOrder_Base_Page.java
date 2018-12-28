package com.QA.Gibsons_Connect_Quotes;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;

public class Quotes_GroundspreadOrder_Base_Page extends Generic_Service
{

@FindBy(xpath="//a[@id='quote']/span[1]")
private WebElement QuotesMenuBar;

@FindBy(xpath="//ul[@id='side-menu']/li[5]/ul/li[1]/a/span")
private WebElement QuotesMenuBarQuotes;


@FindBy(xpath="//ul[@id='side-menu']/li[5]/ul/li[2]/a/span")
private WebElement QuotesMenuBarSalesLog;


@FindBy(xpath="//div[@srname='ORDERS_WRITE'][contains(text(),'Delete Quote')]")
private WebElement QuotesMenuBarQuotesDeleteqoutes;

@FindBy(xpath="//div[@srname='ORDERS_WRITE'][contains(text(),'New Quote')]")
private WebElement QuotesMenuBarQuotesAddNewqoutes;

@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[2]")
private WebElement QuotesMenuBarQuotesAddNewqoutesProductNameDropdown;

@FindBy(xpath="//ul[@id='op_1_1_listbox']/li[5]")
private WebElement QuotesMenuBarQuotesAddNewqoutesProductNameDropdownSelect;


@FindBy(xpath="//ul[@id='op_1_1_listbox']")
private WebElement QuotesMenuBarQuotesAddNewqoutesProductNameDropdownFocus;


@FindBy(xpath="//div[@id='btnCreateQuote']")
private WebElement QuotesMenuBarQuotesAddNewqoutesCreateQuotes;

@FindBy(xpath="(//a[@class='k-link'])[2]")
private WebElement QuotesMenuBarQuotesAddNewqoutesMainPageReferesh;

@FindBy(xpath="(//button[@class='fa-sign-in fa g-icon grid-button-style-edit gb-or-edi-btn'])[1]")
private WebElement QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrder;

@FindBy(xpath="//input[@class='gb-div-list-del-cbp']")
private WebElement QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrderToBeInOrder;

@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Convert To Order')]")
private WebElement QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrderToBeInOrderAfter;

@FindBy(xpath="//div[@class='btn btn-primary k-button popup-button-right']")
private WebElement QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrderPopUpYes;

@FindBy(xpath="(//div[@class='btn btn-primary k-button'])[2]")
private WebElement QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrderPopUpOk;

//String filepath="C:\\Users\\riti raj\\Desktop\\Gibsons_Connect_TestData.xlsx";
String filepath="./ExcelFile/Gibsons_Connect_TestData.xlsx";
String sheetname="Quotes";

@FindBy(xpath="//div[@id='depotDropDown']/span")
private WebElement  OrderPageMainpageDepotdropdown;

@FindBy(xpath="//ul[@id='depotList_listbox']/li[1]")
private WebElement OrderPageMainpageDepotAll;

@FindBy(xpath="//input[@id='part1AAC']")
private WebElement CreateQuotesSearchBar;

@FindBy(xpath="//ul[@id='part1AAC_listbox']/li[4]")
private WebElement CreateQuotesSearchBarAce3;

@FindBy(xpath="//div[@id='5612_Division']")
private WebElement OrderPageGroundspreadIcon;

@FindBy(xpath="//div[@id='part1A']//div[contains(@style,'float: left;')]//div[@style='clear: both; text-align: right;']//div[@class='btn btn-primary k-button']")
private WebElement CreateQuotesGobutton;


@FindBy(xpath="//div[@id='section4']")
private WebElement CreatequotesPageDeliveryBar;


@FindBy(xpath="//input[@id='deliveryDtPicker']")
private WebElement CreatequotesDeliverySelectDate;

@FindBy(xpath="//span[@class='k-picker-wrap k-state-default']//span[@unselectable='on']//span[@unselectable='on']")
private WebElement CreatequotesDeliveryCalender;

@FindBy(xpath="//a[@tabindex='-1'][contains(text(),'27')]")
private WebElement CreatequotesDeliveryCalenderTodaydate;



@FindBy(xpath="//span[@class='k-picker-wrap k-state-default']/span/span")
private WebElement CreatequotesDeliveryCalenderIcon;

@FindBy(xpath="//div[@id='a069592d-ed01-450c-8fe0-821ea4385619']")
private WebElement CreatequotesDeliveryCalenderFullIcon;

@FindBy(xpath="//td[@class='k-today k-state-focused']/a")
private WebElement CreatequotesDeliveryCalenderFullIconTodaysfocausdate;

@FindBy(xpath="//div[@id='section2']")
private WebElement CreateQuotesPageFarmAndLocationBar;

@FindBy(xpath="//div[@id='fDIV']/span/span/span[2]/span")
private WebElement CreateQuotesFarmAndLocationSelectFarmLocation;

@FindBy(xpath="//ul[@id='farmsDD_listbox']/li[2]")
private WebElement CreateQuotesPageFarmAndLocationSelectFarmLocationAce3;

@FindBy(xpath="//input[@id='selectAllPaddockCB']")
private WebElement CreatQuotesPageSelectPaddocks;

@FindBy(xpath="//div[@id='pCDIV']/textarea")
private WebElement CreateQuotesPagePaddockComments;

@FindBy(xpath="//div[@id='farmsAndLocationContentDiv']/div[5]")
private WebElement CreateQuotesCaptureTotalAreaPaddock;

@FindBy(xpath="//div[@id='section3']")
private WebElement CreateQuotesPageProductbar;

@FindBy(xpath="//div[@id='productHeaderDiv']/div[2]/div[2]")
private WebElement CreateQuotesPageProductAddbutton;

@FindBy(xpath="//input[@id='op_1_1']")
private WebElement CreatePageQoutesProductSearchAProductByName;

@FindBy(xpath="//li[@tabindex='-1'][contains(text(),'0-0-25-10 Mg7.5')]")
private WebElement CreatePageQoutesPageProductSearchAProductByName10;

@FindBy(xpath="//tr[@id='op_row_1']/td[2]/span[1]/span/span[2]")
private WebElement CreatePageQoutesPageProductApplication;

@FindBy(xpath="//html//div[@id='op_1_2-list']//li[2]")
private WebElement CreatePageQoutesPageProductApplication100;

@FindBy(xpath="//input[@id='op_1_3']")
private WebElement CreatePageQoutesProductWeight;

@FindBy(xpath="//tr[@id='op_row_1']/td[4]")
private WebElement CreatePageQoutesPageCaptureTotalPrice;

@FindBy(xpath="//div[@id='section5']")
private WebElement CreatePageQoutesPageNotesBar;


@FindBy(xpath="//a[@class='k-button k-button-icontext k-add-button']")
private WebElement CreatePageQoutesPageAddNotes;


@FindBy(xpath="//div[@id='orderNotesList']/div/textarea")
private WebElement CreatePageQoutesPageAddNotesTextArea;

@FindBy(xpath="//div[@id='orderNotesList']/div/div/a[1]")
private WebElement CreatePageQoutesPageAddNotesSave;


@FindBy(xpath="//a[@id='menu-toggle']/i")
private WebElement ToggleMenuBar;

@FindBy(xpath="//div[@id='depotDropDown']/span")
private WebElement CreateQutesMainpageDepotdropdown;

@FindBy(xpath="//ul[@id='depotList_listbox']/li[1]")
private WebElement CreateQutesMainpageDepotAll;



Generic_Service generic=new Generic_Service();


public Quotes_GroundspreadOrder_Base_Page() 
{
	PageFactory.initElements(driver, this);
}

public void navigateToquotes()
{

	 generic.ExplicitWait(10);
	 ToggleMenuBar.click();
	 
	 generic.ExplicitWait(6);
	 QuotesMenuBar.click();
	

	 generic.ExplicitWait(5);
	 QuotesMenuBarQuotes.click();
	 
	 generic.ExplicitWait(5);
	 ToggleMenuBar.click();
	 generic.ExplicitWait(5);
}

public void createNewGroundSpreadQuotes() throws InvalidFormatException, IOException
{
	 generic.ExplicitWait(10);
	 ToggleMenuBar.click();
	 
	
	generic.ExplicitWait(3);
	QuotesMenuBarQuotesAddNewqoutes.click();
	generic.ExplicitWait(3);
	OrderPageGroundspreadIcon.click();
	generic.ExplicitWait(3);
	CreateQuotesSearchBar.sendKeys("ace");
	generic.ExplicitWait(3);
	CreateQuotesSearchBarAce3.click();
	generic.ExplicitWait(3);
	CreateQuotesGobutton.click();
	generic.ExplicitWait(3);
	
	
	CreatequotesPageDeliveryBar.click();
	generic.ExplicitWait(5);
	CreatequotesDeliveryCalenderIcon.click();
	Actions act = new Actions(driver);
    act.clickAndHold(CreatequotesDeliveryCalenderFullIcon);
    generic.ExplicitWait(10);
    CreatequotesDeliveryCalenderFullIconTodaysfocausdate.click();
	
	
	
    CreateQuotesPageFarmAndLocationBar.click();
	generic.ExplicitWait(5);
	
	
	
	CreateQuotesFarmAndLocationSelectFarmLocation.click();
	generic.ExplicitWait(5);
	CreateQuotesPageFarmAndLocationSelectFarmLocationAce3.click();
	generic.ExplicitWait(5);
	CreatQuotesPageSelectPaddocks.click();
	generic.WebPageScrollDown(driver);
	generic.ExplicitWait(5);
	
	
	String comment= generic.GetExcelSheetStringCellValue(filepath,sheetname,4,3);
	System.out.println(comment);
	CreateQuotesPagePaddockComments.sendKeys(comment);
	generic.ExplicitWait(5);
	
	
	
	String totalarea= CreateQuotesCaptureTotalAreaPaddock.getText();
	System.out.println("Paddocks :"+totalarea);
	generic.ExplicitWait(5);
	
	
	CreateQuotesPageProductbar.click();
	generic.ExplicitWait(3);	
	
	
	CreateQuotesPageProductAddbutton.click();
	generic.ExplicitWait(7);
	QuotesMenuBarQuotesAddNewqoutesProductNameDropdown.click();
	Actions act1=new Actions(driver);
	act1.clickAndHold(QuotesMenuBarQuotesAddNewqoutesProductNameDropdownFocus);
    generic.ExplicitWait(5);
	QuotesMenuBarQuotesAddNewqoutesProductNameDropdownSelect.click();
	generic.ExplicitWait(5);

	CreatePageQoutesPageProductApplication.click();
	generic.ExplicitWait(5);
	CreatePageQoutesPageProductApplication100.click();
	generic.ExplicitWait(10);

	
	int weight= generic.GetExcelSheetIntegerCellValue(filepath, sheetname,3,3);
	System.out.println(weight);
	CreatePageQoutesProductWeight.sendKeys(weight+"");
	generic.ExplicitWait(5);
	
	
    String Price=CreatePageQoutesPageCaptureTotalPrice.getText();
    System.out.println("Total Price is "+Price);
    generic.ExplicitWait(5);
    

	
	
	
	
    CreatePageQoutesPageNotesBar.click();
	generic.ExplicitWait(3);
	
	CreatePageQoutesPageAddNotes.click();
	generic.ExplicitWait(3);
	
	String Qoutesnotes= generic.GetExcelSheetStringCellValue(filepath,sheetname,2,3);
	System.out.println(Qoutesnotes);
	CreatePageQoutesPageAddNotesTextArea.sendKeys(Qoutesnotes);
	generic.ExplicitWait(3);
	CreatePageQoutesPageAddNotesSave.click();
	generic.ExplicitWait(3);
	generic.WebPageScrollUp(driver);
	generic.ExplicitWait(3);
	
	
	QuotesMenuBarQuotesAddNewqoutesCreateQuotes.click();
	generic.ExplicitWait(5);
	
	System.out.println("Quotes created successfully");
	generic.ExplicitWait(6);
	


}
@FindBy(xpath="//a[@id='Orders']")
private WebElement OrdersMenuBar;

@FindBy(xpath="//ul[@id='side-menu']/li[4]/ul/li[1]/a/span")
private WebElement OrdersMenuBarOrders;

@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[3]")
private WebElement OrderPageGroundspraedorderMainpageorderstatusdropdown;

@FindBy(xpath="//ul[@id='ReadyForAssignment_listbox']/li[1]")
private WebElement OrderPageGroundspraedorderMainpageorderstatusPendingAutorization;

@FindBy(xpath="//ul[@id='ReadyForAssignment_listbox']/li[2]")
private WebElement OrderPageGroundspraedorderMainpageorderstatusReadyForAssignment;


@FindBy(xpath="(//button[@class='fa-edit fa g-icon grid-button-style-approve gb-or-app-btn'])[1]")
private WebElement OrderPageGroundspraedorderMainpageorderApproveButton;

@FindBy(xpath="//div[@class='k-button btn-primary btn popup-button-left'][contains(text(),'Approve')]")
private WebElement OrderPageGroundspraedorderMainpageorderApprove;




public void covertGroundspreadQutesToOrder()
{
	CreateQutesMainpageDepotdropdown.click();
	generic.ExplicitWait(3);
	CreateQutesMainpageDepotAll.click();
	
	generic.ExplicitWait(3);
	QuotesMenuBarQuotesAddNewqoutesMainPageReferesh.click();
	generic.ExplicitWait(3);
	QuotesMenuBarQuotesAddNewqoutesMainPageReferesh.click();
	generic.ExplicitWait(3);

	QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrder.click();
	generic.ExplicitWait(3);

	QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrderToBeInOrder.click();
	generic.ExplicitWait(3);

	QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrderToBeInOrderAfter.click();
	generic.ExplicitWait(3);

		QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrderPopUpYes.click();
		generic.ExplicitWait(3);
		QuotesMenuBarQuotesAddNewqoutesQuotesMainPageConvertToOrderPopUpOk.click();
		generic.ExplicitWait(3);
		System.out.println("Qutes Successfully convert to order.Now navigate to order main page");
		generic.ExplicitWait(3);
		OrdersMenuBar.click();
		generic.ExplicitWait(5);
		OrdersMenuBarOrders.click();
		generic.ExplicitWait(5);

		OrderPageMainpageDepotdropdown.click();
		generic.ExplicitWait(3);
		OrderPageMainpageDepotAll.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderMainpageorderstatusdropdown.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderMainpageorderstatusPendingAutorization.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderMainpageorderApproveButton.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderMainpageorderApprove.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderMainpageorderstatusdropdown.click();
		generic.ExplicitWait(3);
		OrderPageGroundspraedorderMainpageorderstatusReadyForAssignment.click();
		generic.ExplicitWait(6);
	}





}















