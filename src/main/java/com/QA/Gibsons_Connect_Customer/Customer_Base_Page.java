package com.QA.Gibsons_Connect_Customer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.QA.Gibsons_Connect.Config.Constant;
import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


public class Customer_Base_Page extends Generic_Service {

	// ...................Xpath for Customer Homepage......................//

	// --------------------Customers Search section---------------------------//

	@FindBy(xpath = "//div[@class='panel-heading' AND text()='CUSTOMER']")
	private WebElement CustomerHomePageTitle;

	@FindBy(xpath = "//input[@id='part1AAC']")
	private WebElement SelectaCustomerTextBox;

	@FindBy(xpath = "//div[@id='searchCustomerForInvoiceByDisplayNameButton']/i")
	private WebElement SearchaCustomerForInvoiceBybutton;

	@FindBy(xpath = "//div[@id='searchCustomerForInvoiceByCompanyNameButton']/i")
	private WebElement SearchaCustomerForInvoiceByCompanyname;

	@FindBy(xpath = "//button[@class='fa-rotate-left fa g-icon grid-button-style']")
	private WebElement ClearSeacrchbutton;

	@FindBy(xpath = "//a[@id='totop']/i")
	private WebElement NavigateToUpbutton;

	@FindBy(xpath = "//div[@class='btn btn-primary k-button']")
	private WebElement AddnewCustomerbutton;

	@FindBy(xpath = "//div[@class='k-button dashboarddeletebtn']")
	private WebElement DeleteCustomerButton;

	@FindBy(xpath = "//div[@id='custGrid']/div[4]/a[3]/span")
	private WebElement MoveTonextPageCustomerButton;

	@FindBy(xpath = "//div[@id='custGrid']/div[4]/a[4]/span")
	private WebElement MoveToLastPageCustomerButton;

	@FindBy(xpath = "//div[@id='custGrid']/div[3]/table/tbody/tr/td[6]/button")
	private WebElement EditExistingCustomerButton;

	// ........................Add Modify Page.............................//

	@FindBy(xpath = "//div[@class='panel-heading clearfix' AND text()='ADD OR MODIFY CUSTOMER']")
	private WebElement AddModifyCustomersText;

	@FindBy(xpath = "//div[@id='content']/div/div[1]/div[2]/a[1]")
	private WebElement AddModifyCustomersBackbutton;

	@FindBy(xpath = "//div[@id='content']/div/div[1]/div[2]/a[2]")
	private WebElement AddModifyCustomersCancelbutton;

	@FindBy(xpath = "//div[@id='content']/div/div[1]/div[2]/div[1]")
	private WebElement AddModifyCustomersSavebutton;

	// ...........Add modify Fill details.............//

	@FindBy(xpath = "(//div[@class='k-multiselect-wrap k-floatwrap'])[1]")
	private WebElement AddModyfySectionCustomerEntities;

	@FindBy(xpath = "(//div[@class='k-widget k-multiselect k-header'])[1]")
	private WebElement AddModyfySectionCustomerEntitiesTextBox;

	@FindBy(xpath = "//ul[@id='custDivisionsMultiSelect_listbox']/li[3]")
	private WebElement AddModyfySectionCustomerEntitiesGibson;

	@FindBy(xpath = "//input[@id='txtCompanyName']")
	private WebElement AddModyfySectionCompanyName;

	@FindBy(xpath = "//input[@id='txtDisplayName']")
	private WebElement AddModyfySectionDisplayName;

	@FindBy(xpath = "//input[@id='txtInvoiceContactName']")
	private WebElement AddModyfySectionInvoiceLine2;

	@FindBy(xpath = "//input[@id='txtBizNumber']")
	private WebElement AddModyfySectionABNACN;

	@FindBy(xpath = "(//div[@class='k-multiselect-wrap k-floatwrap'])[2]")
	private WebElement AddModyfySectionServices;

	@FindBy(xpath = "//ul[@id='custServicesMultiSelect_listbox']/li[2]")
	private WebElement AddModyfySectionServicesSelect;

	@FindBy(xpath = "//form[@id='addCustForm']/div[7]/span[1]")
	private WebElement AddModyfySectionDepot;

	@FindBy(xpath = "//ul[@id='drpDepot_listbox']/li[3]")
	private WebElement AddModyfySectionDepotSelect;

	@FindBy(xpath = "//input[@id='txtAddressL1']")
	private WebElement AddModyfySectionAddressLine1;

	@FindBy(xpath = "//input[@id='txtTown']")
	private WebElement AddModyfySectionTown;

	@FindBy(xpath = "//span[@unselectable='on'][contains(text(),'VIC')]")
	private WebElement AddModyfySectionState;

	@FindBy(xpath = "//input[@id='txtPCode']")
	private WebElement AddModyfySectionPostcode;

	@FindBy(xpath = "//input[@id='txtPhone']")
	private WebElement AddModyfySectionPhone;

	@FindBy(xpath = "//input[@id='txtWebsite']")
	private WebElement AddModyfySectionEmail;

	// ...................Contact Section...................................//

	@FindBy(xpath = "(//a[@class='btn btn-primary k-button k-grid-add'])[1]")
	private WebElement ContactSectionAddButton;

	@FindBy(xpath = "(//div[@class='k-button dashboarddeletebtn'])[1]")
	private WebElement ContactSectionDeleteButton;

	@FindBy(xpath = "//div[@id='contactGrid']")
	private WebElement ContactSectionTextcatch;

	@FindBy(xpath = "(//span[@class='k-icon k-i-arrow-s'])[11]")
	private WebElement ContactSectionPopUpTitle;

	@FindBy(xpath = "((//div[@class='form-group'])[23]/span)[1]")
	private WebElement ContactSectionTitleSelect;

	@FindBy(xpath = "//ul[@id='drpTitle_listbox']/li[4]")
	private WebElement ContactSectionTitleSelectoption;

	@FindBy(xpath = "//input[@id='txtFirstName']")
	private WebElement ContactSectionFirstName;

	@FindBy(xpath = "//input[@id='txtlastName']")
	private WebElement ContactSectionLastName;

	@FindBy(xpath = "//input[@id='txtMobile']")
	private WebElement ContactSectionMobile;

	@FindBy(xpath = "//input[@id='txtEmail']")
	private WebElement ContactSectionEmail;

	@FindBy(xpath = "//input[@id='txtPosition']")
	private WebElement ContactSectionPostion;

	@FindBy(xpath = "//input[@id='cbPrimary']")
	private WebElement ContactSectionPrimaryButton;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement ContactSectionUploadImage;

	@FindBy(xpath = "//div[@class='k-edit-buttons k-state-default']/a[1]")
	private WebElement ContactSectionCreateTab;

	@FindBy(xpath = "//div[@class='k-edit-buttons k-state-default']/a[2]")
	private WebElement ContactSectionCancelTab;

	// ...........................Farm......................................//

	@FindBy(xpath = "(//a[@class='btn btn-primary k-button k-grid-add'])[2]")
	private WebElement FarmSection_AddTab;

	@FindBy(xpath = "//div[@id='farmPadGrid']//div[@class='k-toolbar k-grid-toolbar']//div[@srname='CUSTOMERS_WRITE']")
	private WebElement FarmSection_DeleteTab;

	@FindBy(xpath = "//input[@id='Text1']")
	private WebElement FarmSectionAddTabPopup_FarmName;

	@FindBy(xpath = "//html//div[@class='k-widget k-window']//span[@class='k-widget k-numerictextbox']//input[1]")
	private WebElement FarmSectionAddTabPopup_Area_ha;

	@FindBy(xpath = "(//div[@class='col-md-3'])[5]/span")
	private WebElement FarmSectionAddTabPopup_Contact_Name;

	@FindBy(xpath = "//ul[@id='cntNameDD_listbox']/li[2]")
	private WebElement FarmSectionAddTabPopup_Contact_Nameselect;

	@FindBy(xpath = "//input[@id='cntNum']")
	private WebElement FarmSectionAddPopup_TabContact_Number;

	@FindBy(xpath = "//input[@id='sameAddress']")
	private WebElement FarmSectionAddPopup_TabSame_as_Customer_Address;

	@FindBy(xpath = "//input[@id='Text2']")
	private WebElement FarmSectionAddTabPopup_Address_Line1;

	@FindBy(xpath = "//input[@id='txtTown1']")
	private WebElement FarmSectionAddTabPopup_Town;

	@FindBy(xpath = "//input[@id='txtPostCode']")
	private WebElement FarmSectionAddTabPopup_Postcode;

	@FindBy(xpath = "//html//div[6]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]")
	private WebElement FarmSectionAddTabPopup_State;

	@FindBy(xpath = "//button[@id='btnLocationGeocode']")
	private WebElement FarmSectionAddTabPopup_CaptureFromaddresstab;

	@FindBy(xpath = "//input[@id='address']")
	private WebElement FarmSectionAddTabPopupCaptureFromaddresstab_SearchBox;

	@FindBy(xpath = "//input[@id='searchAdd']")
	private WebElement FarmSectionAddTabPopupCaptureFromaddresstab_SearchTab;

	@FindBy(xpath = "//input[@id='capture']")
	private WebElement FarmSectionAddTabPopupCaptureFromaddresstab_Capturefromlogandlat;

	@FindBy(xpath = "//span[@role='presentation'][contains(text(),'refresh')]")
	private WebElement FarmSectionAddTabPopupCaptureFromaddresstab_Refreshbar;

	@FindBy(xpath = "//html//div[@class='k-window-titlebar k-header']//a[2]/span[1]")
	private WebElement FarmSectionAddTabPopupCaptureFromaddresstab_Close;

	@FindBy(xpath = "//input[@id='txtLatitude']")
	private WebElement FarmSectionAddTabPopup_Longitude;

	@FindBy(xpath = "//input[@id='txtLongitude']")
	private WebElement FarmSectionAddTabPopup_Lattitude;

	@FindBy(xpath = "((//div[@class='col-md-3'])[13]/span)[1]")
	private WebElement FarmSectionAddTabPopupZoneTab;

	@FindBy(xpath = "//ul[@id='drpZone_listbox']/li[6]")
	private WebElement FarmSectionAddTabPopupZoneTabSelect;

	@FindBy(xpath = "//html//div[@class='col-md-8']//span[@class='k-widget k-dropdown k-header']/span[@unselectable='on']/span[1]")
	private WebElement FarmSectionAddTabPopupZoneSelectDropDownlist;

	@FindBy(xpath = "//input[@id='farmMapUpload']")
	private WebElement FarmSectionAddTabPopupUploadFrommaptab;

	@FindBy(xpath = "//input[@id='farmMapUploadBtn']")
	private WebElement FarmSectionAddTabPopup_Submit;

	@FindBy(xpath = "//div[@class='k-edit-buttons k-state-default']/a[1]")
	private WebElement FarmSectionAddTabPopup_UpdateFarm;

	@FindBy(xpath = "//a[@class='k-button k-button-icontext k-primary k-grid-update']")
	private WebElement FarmSectionAddTabPopup_Cancel;

	// ...................................Office Use ......................//

	@FindBy(xpath = "(//div[@class='col-md-9'])[1]/span")
	private WebElement OfficeUseSectionSalesPersonType;

	@FindBy(xpath = "//ul[@id='drpSalesP_listbox']/li[2]")
	private WebElement OfficeUseSectionSalesPersonTypeSelect;

	@FindBy(xpath = "(//div[@class='col-md-9'])[3]/span")
	private WebElement OfficeUseSectionPriceType;
	@FindBy(xpath = "//div[@id='drpPriceType-list']/ul/li[4]")
	private WebElement OfficeUseSectionPriceTypeSelect;

	@FindBy(xpath = "(//div[@class='col-md-9'])[5]/span")
	private WebElement OfficeUseSectionCustomerSize;
	@FindBy(xpath = "//ul[@id='drpCustomerSize_listbox']/li[2]")
	private WebElement OfficeUseSectionCustomerSizeSelect;

	@FindBy(xpath = "(//div[@class='col-md-9'])[7]/span")
	private WebElement OfficeUseSectionCustomerType;
	@FindBy(xpath = "//ul[@id='drpCustomerType_listbox']/li[3]")
	private WebElement OfficeUseSectionCustomerTypeSelect;

	@FindBy(xpath = "(//div[@class='col-md-9'])[2]/span")
	private WebElement OfficeUseSectionCreaditStatus;
	@FindBy(xpath = "//ul[@id='drpCrdtS_listbox']/li[3]")
	private WebElement OfficeUseSectionCreaditStatusSelect;

	@FindBy(xpath = "//textarea[@id='txtComments']")
	private WebElement OfficeUseSectionComments;

	@FindBy(xpath = "//select[@id='drpCustomerStatus']")
	private WebElement OfficeUseSectionCustomerStatus;

	@FindBy(xpath = "//span[@class='k-numeric-wrap k-state-default k-expand-padding']")
	private WebElement OfficeUseSectionCreditLimit;

	// .................................Lastsavebackcancel....................//

	@FindBy(xpath = "//html//form[@id='addCustForm']/a[1]")
	private WebElement LastBackButton;

	@FindBy(xpath = "(//div[@class='btn btn-primary k-button'])[3]")
	private WebElement LastSaveButton;

	@FindBy(xpath = "//html//div[23]")
	private WebElement LastCancelButton;

	@FindBy(xpath = "//a[@id='Customers']")
	private WebElement CustomersMenuBar;

	@FindBy(xpath = "//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;

	Generic_Service generic = new Generic_Service();

	public Customer_Base_Page() {
		PageFactory.initElements(driver, this);
	}

	public void clickoncustomer()

	{

		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		CustomersMenuBar.click();
		generic.ExplicitWait(5);
		ToggleMenuBar.click();

	}

	

	public void addmodifycustomerdetailsFill() throws InvalidFormatException, IOException
	{

		generic.ExplicitWait(5);
		AddnewCustomerbutton.click();
		generic.ExplicitWait(5);
		
		AddModyfySectionCustomerEntities.click();
		generic.ExplicitWait(3);

		generic.ExplicitWait(5);
		AddModyfySectionCustomerEntitiesGibson.click();
		generic.ExplicitWait(5);

		generic.ExplicitWait(5);
		String Compnyname = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 10, 2);
		System.out.println(Compnyname);
		AddModyfySectionCompanyName.sendKeys(Compnyname);

		String Displayname = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 11, 2);
		System.out.println(Displayname);
		AddModyfySectionDisplayName.sendKeys(Displayname);
		generic.ExplicitWait(5);

		String InvoiceLine2 = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 12, 2);
		System.out.println(InvoiceLine2);
		AddModyfySectionInvoiceLine2.sendKeys(InvoiceLine2);
		generic.ExplicitWait(5);
		
		Long ABNACN = generic.GetExcelSheetLongIntCellValue(Constant.filepath, Constant.sheetname, 13, 2);
		System.out.println(ABNACN);
		AddModyfySectionPhone.sendKeys(ABNACN+ " ");
		generic.ExplicitWait(5);

		AddModyfySectionServices.click();
		generic.ExplicitWait(5);
		AddModyfySectionServicesSelect.click();

		generic.ExplicitWait(5);
		AddModyfySectionDepot.click();
		generic.ExplicitWait(5);
		AddModyfySectionDepotSelect.click();

		String Adddressline1 = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 14, 2);
		System.out.println(Adddressline1);
		AddModyfySectionAddressLine1.sendKeys(Adddressline1);
		generic.ExplicitWait(5);

		String TownName = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 15, 2);
		AddModyfySectionTown.sendKeys(TownName);
		System.out.println(TownName);
		generic.ExplicitWait(5);

		int PostCode = generic.GetExcelSheetIntegerCellValue(Constant.filepath, Constant.sheetname, 16, 2);
		System.out.println(PostCode);
		AddModyfySectionPostcode.sendKeys(PostCode + " ");
		generic.ExplicitWait(5);

		Long PhoneNumber = generic.GetExcelSheetLongIntCellValue(Constant.filepath, Constant.sheetname, 17, 2);
		System.out.println(PhoneNumber);
		AddModyfySectionPhone.sendKeys(PhoneNumber + " ");
		generic.ExplicitWait(5);

		String EmailId = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 18, 2);
		System.out.println(EmailId);
		AddModyfySectionEmail.sendKeys(EmailId);
		generic.ExplicitWait(5);

	}

	public void addContactdetalis() throws InvalidFormatException, IOException, AWTException {

		ContactSectionAddButton.click();
		generic.ExplicitWait(5);

		ContactSectionTitleSelect.click();
		generic.ExplicitWait(5);
		ContactSectionTitleSelectoption.click();

		generic.ExplicitWait(5);
		String FirstName = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 23, 2);
		System.out.println(FirstName);
		ContactSectionFirstName.sendKeys(FirstName);

		generic.ExplicitWait(5);
		String LastName = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 24, 2);
		System.out.println(LastName);
		ContactSectionLastName.sendKeys(LastName);

		generic.ExplicitWait(5);
		Long MobNumber = generic.GetExcelSheetLongIntCellValue(Constant.filepath, Constant.sheetname, 25, 2);
		System.out.println(MobNumber);
		ContactSectionMobile.sendKeys(MobNumber + " ");

		generic.ExplicitWait(5);
		String Email = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 26, 2);
		System.out.println(Email);
		ContactSectionEmail.sendKeys(Email);

		generic.ExplicitWait(5);
		String Position = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 27, 2);
		System.out.println(Position);
		ContactSectionPostion.sendKeys(Position);

		ContactSectionPrimaryButton.click();

		generic.ExplicitWait(5);
		driver.findElement(By.xpath("//div[@class='k-button k-upload-button']")).click();
		generic.ExplicitWait(3);
		String onefarmimagepath = "C:\\Users\\riti raj\\Desktop\\AutoIt\\OneFarm\\download2.jpg";
		StringSelection ss = new StringSelection(onefarmimagepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		generic.ExplicitWait(10);

		ContactSectionCreateTab.click();
		generic.ExplicitWait(5);
		generic.WebPageScrollDown(driver);

	}

	public void addFarmdetalis() throws InvalidFormatException, IOException, AWTException {

		generic.ExplicitWait(5);
		FarmSection_AddTab.click();

		String Farmname = generic.GetExcelSheetStringCellValue(Constant.filepath, Constant.sheetname, 33, 2);
		System.out.println(Farmname);
		FarmSectionAddTabPopup_FarmName.sendKeys(Farmname);

		int area = generic.GetExcelSheetIntegerCellValue(Constant.filepath, Constant.sheetname, 35, 2);
		System.out.println(area);
		FarmSectionAddTabPopup_Area_ha.sendKeys(area + "");

		FarmSectionAddTabPopup_Contact_Name.click();
		generic.ExplicitWait(5);
		FarmSectionAddTabPopup_Contact_Nameselect.click();

		Long TabContact_Number = generic.GetExcelSheetLongIntCellValue(Constant.filepath, Constant.sheetname, 36, 2);
		System.out.println(TabContact_Number);
		FarmSectionAddPopup_TabContact_Number.sendKeys(TabContact_Number + " ");

		FarmSectionAddPopup_TabSame_as_Customer_Address.click();

		FarmSectionAddTabPopupZoneTab.click();
		generic.ExplicitWait(5);
		FarmSectionAddTabPopupZoneTabSelect.click();

		generic.ExplicitWait(5);
		driver.findElement(By.xpath("//div[@class='k-button k-upload-button']")).click();
		generic.ExplicitWait(3);
		String onefarmimagepath = "C:\\Users\\riti raj\\Desktop\\AutoIt\\OneFarm\\download2.jpg";
		StringSelection ss = new StringSelection(onefarmimagepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		generic.ExplicitWait(10);

		FarmSectionAddTabPopup_UpdateFarm.click();
		generic.ExplicitWait(7);

		generic.WebPageScrollDown(driver);

	}

	@FindBy(xpath = "//textarea[@id='txtComments']")
	private WebElement OfficeuseComment;
	
	
	public void addOfficeuseDetails() 
	{
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(6);
		OfficeUseSectionSalesPersonType.click();
		generic.ExplicitWait(6);
		OfficeUseSectionSalesPersonTypeSelect.click();
		generic.ExplicitWait(6);
	

		OfficeUseSectionPriceType.click();
		generic.ExplicitWait(7);
		OfficeUseSectionPriceTypeSelect.click();

		generic.ExplicitWait(7);
		OfficeUseSectionCustomerSize.click();
		generic.ExplicitWait(7);
		OfficeUseSectionCustomerSizeSelect.click();

		generic.ExplicitWait(7);
		OfficeUseSectionCustomerType.click();
		generic.ExplicitWait(7);
		OfficeUseSectionCustomerTypeSelect.click();
		generic.ExplicitWait(6);
		OfficeUseSectionCreaditStatus.click();
		generic.ExplicitWait(7);
		OfficeUseSectionCreaditStatusSelect.click();
		generic.ExplicitWait(6);
		generic.ExplicitWait(8);
		WebElement ele=driver.findElement(By.xpath("//span[@class='k-numeric-wrap k-state-default k-expand-padding']"));
		Actions act = new Actions(driver);
		act.doubleClick(ele);
		generic.ExplicitWait(5);
		act.click().sendKeys(Keys.BACK_SPACE);
		act.sendKeys("120000").build().perform();
		generic.ExplicitWait(5);
		OfficeuseComment.sendKeys("comment");
		generic.ExplicitWait(5);
		LastSaveButton.click();
		generic.ExplicitWait(20);
		
		String actualDisplay=driver.findElement(By.xpath("//div[@class='panel-heading clearfix']")).getText();
		String expecteddisplay="CUSTOMER DETAILS";
		Assert.assertEquals(actualDisplay,expecteddisplay);
	    System.out.println("Customer created successfully");
	       
	}
	
	@FindBy(xpath = "//div[@class='btn btn-primary k-button'][contains(text(),'Back')]")
	private WebElement BackFramer;
	@FindBy(xpath = "(//div[@class='panel-body'] /a )[1]")
	private WebElement EditFramer;

	public void editCustmerAndSave() 
	{ 
		
		generic.ExplicitWait(5);
		EditFramer.click();
		generic.ExplicitWait(6);
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(3);
		AddModyfySectionDepot.click();
		generic.ExplicitWait(5);
		AddModyfySectionDepotSelect.click();
		generic.ExplicitWait(7);
		generic.WebPageScrollUp(driver);
		AddModifyCustomersSavebutton.click();
		generic.ExplicitWait(10);
	  
	    String actualDisplay=driver.findElement(By.xpath("//div[@class='panel-heading clearfix']")).getText();
		String expecteddisplay="CUSTOMER DETAILS";
		Assert.assertEquals(actualDisplay,expecteddisplay);
		System.out.println("Customer edited successfully");
	    
	       
	       
	}

}
