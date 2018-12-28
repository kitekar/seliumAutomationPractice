package com.QA.Gibsons_Connect_Customer;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;


public class Customer_AddFarm_OtherLocation_Base_Page extends Generic_Service

{
	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='Customers']")
	private WebElement CustomersMenuBar;
	
	
	
	
	
	Generic_Service generic=new Generic_Service();
	
	public Customer_AddFarm_OtherLocation_Base_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	

public void NavigateTocustomer()

{ 
	generic.ExplicitWait(5);
	ToggleMenuBar.click();
	generic.ExplicitWait(5);
	CustomersMenuBar.click();
	generic.ExplicitWait(6);
	ToggleMenuBar.click();
	generic.ExplicitWait(5);
	
	
	
}

@FindBy(xpath="//td[@role='gridcell'][contains(text(),'Dave Abernethy')]")
private WebElement CustomerName;

@FindBy(xpath="//td[@role='gridcell'][contains(text(),'2CONSTRUCT')]")
private WebElement CustomernewName;



@FindBy(xpath="//a[@class='k-link'][contains(text(),'Farms/Paddocks')]")
private WebElement FarmsandPeddocks;

@FindBy(xpath="//a[@class='k-link'][contains(text(),'Other Locations')]")
private WebElement OtherLocation;

@FindBy(xpath="//div[@id='locationsGrid']/div[1]/a")
private WebElement OtherLocationAddLocation;

@FindBy(xpath="//div[@id='locationsGrid']/div[1]/div")
private WebElement OtherLocationDeleteLocation;


@FindBy(xpath="//input[@id='Text1']")
private WebElement OtherLocationLoactionName;

@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[1]")
private WebElement OtherLocationLoactionContactNameDropdown;


@FindBy(xpath="//ul[@id='cntNameDD_listbox']/li[2]")
private WebElement OtherLocationLoactionContactNameSelect;

@FindBy(xpath="//input[@id='sameAddress']")
private WebElement OtherLocationLoactionSameasCustomerAddress;

@FindBy(xpath="//button[@id='btnLocationGeocode']")
private WebElement OtherLocationLoactionCaptureFromAddress;


@FindBy(xpath="//input[@id='searchAdd']")
private WebElement OtherLocationLoactionCaptureFromAddressSearch;


@FindBy(xpath="//input[@id='capture']")
private WebElement OtherLocationLoactionCaptureFromAddressCaptureLong_Lat;

@FindBy(xpath="//input[@id='txtLatitude']")
private WebElement OtherLocationLoactionCaptureFromAddressCaptureLong;

@FindBy(xpath="//input[@id='txtLongitude']")
private WebElement OtherLocationLoactionCaptureFromAddressCaptureLat;



@FindBy(xpath="//a[@class='k-button k-button-icontext k-primary k-grid-update']")
private WebElement OtherLocationLoactionCaptureFromAddressCreateButton;

String filepath="./ExcelFile/Gibsons_Connect_TestData.xlsx";


String sheetname="Customers";

public void addOtherLocation() throws InvalidFormatException, IOException
{
	    generic.ExplicitWait(3);
		CustomerName.click();
		generic.ExplicitWait(3);
		OtherLocation.click();
		generic.ExplicitWait(3);
		OtherLocationAddLocation.click();
		generic.ExplicitWait(3);
		String otherlocationFarmName = generic.GetExcelSheetStringCellValue(filepath, sheetname, 48, 2);
		System.out.println(otherlocationFarmName);
		OtherLocationLoactionName.sendKeys(otherlocationFarmName);
		generic.ExplicitWait(3);
		OtherLocationLoactionContactNameDropdown.click();
		generic.ExplicitWait(3);

		OtherLocationLoactionContactNameSelect.click();
		generic.ExplicitWait(3);
		OtherLocationLoactionSameasCustomerAddress.click();
		generic.ExplicitWait(3);
		OtherLocationLoactionCaptureFromAddress.click();
		generic.ExplicitWait(7);
		OtherLocationLoactionCaptureFromAddressSearch.click();
		generic.ExplicitWait(10);
		OtherLocationLoactionCaptureFromAddressCaptureLong_Lat.click();
		generic.ExplicitWait(10);
		String longitude = OtherLocationLoactionCaptureFromAddressCaptureLong.getAttribute("value");
		System.out.println("The value of longitude is  " + longitude);
		
		String latitude = OtherLocationLoactionCaptureFromAddressCaptureLat.getAttribute("value");
		System.out.println("The value of longitude is  " + latitude);

		generic.ExplicitWait(8);
		OtherLocationLoactionCaptureFromAddressCaptureLat.getAttribute("value");
		
		generic.ExplicitWait(3);
		OtherLocationLoactionCaptureFromAddressCreateButton.click();
		generic.ExplicitWait(5);

	
}

@FindBy(xpath="(//a[@class='k-button k-button-icontext k-grid-edit'])[1]")
private WebElement CustomerFarmsandPeddocksEdit1st;

@FindBy(xpath="(//a[@class='k-button k-button-icontext k-grid-edit'])[2]")
private WebElement CustomerFarmsandPeddocksEdit;

@FindBy(xpath="//input[@id='farmMapUpload']")
private WebElement CustomerFarmsandPeddocksUploadFarmMap;

@FindBy(xpath="//a[@class='k-button k-button-icontext k-primary k-grid-update']")
private WebElement CustomerFarmsandPeddocksUploadFarmMapUpdateButton;

File classpathRoot = new File(System.getProperty("user.dir"));
File picturesDir = new File(classpathRoot,"/Image");





public void uploadFarmMapValidScenarioOneFarm() throws IOException, InterruptedException, AWTException
{
	
	
	File picture = new File(picturesDir,"download2.jpg");
	String onefarmimagepath = picture.getAbsolutePath();
	
		FarmsandPeddocks.click();
		generic.ExplicitWait(5);
		CustomerFarmsandPeddocksEdit.click();
		generic.ExplicitWait(5);
		
	    driver.findElement(By.xpath("(//div[@class='k-button k-upload-button'])[2]")).click();
		generic.ExplicitWait(8);
		StringSelection ss = new StringSelection(onefarmimagepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		generic.ExplicitWait(20);
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(5);
		CustomerFarmsandPeddocksUploadFarmMapUpdateButton.click();
	    generic.ExplicitWait(6);
}

public void uploadFarmMapInValidScenarioLargeFile() throws IOException, InterruptedException, AWTException
{
	
	File picture = new File(picturesDir,"LargeFile.jpg");
	String onefarmLargeImage = picture.getAbsolutePath();
	
	CustomerFarmsandPeddocksEdit.click();
	generic.ExplicitWait(10);
	driver.findElement(By.xpath("(//div[@class='k-button k-upload-button'])[2]")).click();
	
		generic.ExplicitWait(8);
		StringSelection ss = new StringSelection(onefarmLargeImage);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	    generic.ExplicitWait(8);
	  	robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
	
	
	
	generic.ExplicitWait(10);
	CustomerFarmsandPeddocksUploadFarmMapUpdateButton.click();
    generic.ExplicitWait(7);
	
}


@FindBy(xpath="//div[@class='btn btn-primary k-button'][contains(text(),'Back')]")
private WebElement CustomerFarmsandPeddocksUploadFarmMapBack;

@FindBy(xpath="//td[@role='gridcell'][contains(text(),'Pat Sofra')]")
private WebElement NewCustomers;

@FindBy(xpath="(//a[@class='k-button k-button-icontext k-grid-edit'])[1]")
private WebElement NewCustomersEditPeddocks;






public void uploadFarmMapValidScenario10ImageToMultipleFarm() throws IOException, InterruptedException, AWTException
{
	
	
	File picture1 = new File(picturesDir,"download1.jpg");
	String onefarmimagepath1 = picture1.getAbsolutePath();
	
	    generic.ExplicitWait(3);
	    CustomerFarmsandPeddocksUploadFarmMapBack.click();
		generic.ExplicitWait(3);
		NewCustomers.click();
		generic.ExplicitWait(5);

		FarmsandPeddocks.click();
		generic.ExplicitWait(5);
		NewCustomersEditPeddocks.click();
		generic.ExplicitWait(10);
		
		
		driver.findElement(By.xpath("(//div[@class='k-button k-upload-button'])[2]")).click();
		generic.ExplicitWait(9);
		StringSelection ss = new StringSelection(onefarmimagepath1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		generic.ExplicitWait(4);
	    robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		generic.ExplicitWait(7);
	    generic.WebPageScrollDown(driver);
	    
	    File picture2 = new File(picturesDir,"download4.jpg");
		String onefarmimagepath2 = picture2.getAbsolutePath();
	  
	    driver.findElement(By.xpath("//div[@class='k-widget k-upload k-header']/div/div")).click();
		generic.ExplicitWait(9);
		StringSelection ss1 = new StringSelection(onefarmimagepath2);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		generic.ExplicitWait(4);
	    robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		
		generic.ExplicitWait(10);
		generic.WebPageScrollDown(driver);
		
	    File picture3 = new File(picturesDir,"download4.jpg");
		String onefarmimagepath3 = picture3.getAbsolutePath();
	    
	    driver.findElement(By.xpath("//div[@class='k-widget k-upload k-header']/div/div")).click();
		generic.ExplicitWait(9);
		StringSelection ss2 = new StringSelection(onefarmimagepath3);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		generic.ExplicitWait(4);
	    robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		
		generic.ExplicitWait(10);
	    generic.WebPageScrollDown(driver);
	    
	    File picture4 = new File(picturesDir,"giphy.gif");
		String onefarmimagepath4 = picture4.getAbsolutePath();
	    
	    
	    driver.findElement(By.xpath("//div[@class='k-widget k-upload k-header']/div/div")).click();
		generic.ExplicitWait(9);
		StringSelection ss3 = new StringSelection(onefarmimagepath4);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
		Robot robot3 = new Robot();
		robot3.keyPress(KeyEvent.VK_CONTROL);
		robot3.keyPress(KeyEvent.VK_V);
		robot3.keyRelease(KeyEvent.VK_V);
		robot3.keyRelease(KeyEvent.VK_CONTROL);
		generic.ExplicitWait(4);
	    robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);
	    
		generic.ExplicitWait(10);
		generic.WebPageScrollDown(driver);
		
		 File picture5 = new File(picturesDir,"GSC-547.png");
		String onefarmimagepath5 = picture5.getAbsolutePath();
		
	    driver.findElement(By.xpath("//div[@class='k-widget k-upload k-header']/div/div")).click();
		generic.ExplicitWait(9);
		StringSelection ss4 = new StringSelection(onefarmimagepath5);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);
		Robot robot4 = new Robot();
		robot4.keyPress(KeyEvent.VK_CONTROL);
		robot4.keyPress(KeyEvent.VK_V);
		robot4.keyRelease(KeyEvent.VK_V);
		robot4.keyRelease(KeyEvent.VK_CONTROL);
		generic.ExplicitWait(4);
	    robot4.keyPress(KeyEvent.VK_ENTER);
		robot4.keyRelease(KeyEvent.VK_ENTER);
	    
		generic.ExplicitWait(10); 
	    
		 File picture6 = new File(picturesDir,"download5.jpg");
		String onefarmimagepath6 = picture6.getAbsolutePath();
		
	    driver.findElement(By.xpath("//div[@class='k-widget k-upload k-header']/div/div")).click();
		generic.ExplicitWait(9);
		StringSelection ss5 = new StringSelection(onefarmimagepath6);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);
		Robot robot5 = new Robot();
		robot5.keyPress(KeyEvent.VK_CONTROL);
		robot5.keyPress(KeyEvent.VK_V);
		robot5.keyRelease(KeyEvent.VK_V);
		robot5.keyRelease(KeyEvent.VK_CONTROL);
		generic.ExplicitWait(4);
	    robot5.keyPress(KeyEvent.VK_ENTER);
		robot5.keyRelease(KeyEvent.VK_ENTER);
	    
		generic.ExplicitWait(10);
	    
		 File picture7 = new File(picturesDir,"lena_color.tiff");
		String onefarmimagepath7 = picture7.getAbsolutePath();
		
	    driver.findElement(By.xpath("//div[@class='k-widget k-upload k-header']/div/div")).click();
		generic.ExplicitWait(9);
		StringSelection ss6 = new StringSelection(onefarmimagepath7);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss6, null);
		Robot robot6 = new Robot();
		robot6.keyPress(KeyEvent.VK_CONTROL);
		robot6.keyPress(KeyEvent.VK_V);
		robot6.keyRelease(KeyEvent.VK_V);
		robot6.keyRelease(KeyEvent.VK_CONTROL);
		generic.ExplicitWait(4);
	    robot6.keyPress(KeyEvent.VK_ENTER);
		robot6.keyRelease(KeyEvent.VK_ENTER);
	    
		generic.ExplicitWait(10);
		File picture8 = new File(picturesDir,"lena_gray.bmp");
		String onefarmimagepath8 = picture8.getAbsolutePath();
	    driver.findElement(By.xpath("//div[@class='k-widget k-upload k-header']/div/div")).click();
		generic.ExplicitWait(9);
		StringSelection ss7 = new StringSelection(onefarmimagepath8);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss7, null);
		Robot robot7 = new Robot();
		robot7.keyPress(KeyEvent.VK_CONTROL);
		robot7.keyPress(KeyEvent.VK_V);
		robot7.keyRelease(KeyEvent.VK_V);
		robot7.keyRelease(KeyEvent.VK_CONTROL);
	    robot7.keyPress(KeyEvent.VK_ENTER);
		robot7.keyRelease(KeyEvent.VK_ENTER);
	   
		generic.ExplicitWait(10);
		 File picture9 = new File(picturesDir,"tenor.gif");
		String onefarmimagepath9 = picture9.getAbsolutePath();
	    driver.findElement(By.xpath("//div[@class='k-widget k-upload k-header']/div/div")).click();
		generic.ExplicitWait(5);
		StringSelection ss8 = new StringSelection(onefarmimagepath9);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss8, null);
		Robot robot8 = new Robot();
		robot8.keyPress(KeyEvent.VK_CONTROL);
		robot8.keyPress(KeyEvent.VK_V);
		robot8.keyRelease(KeyEvent.VK_V);
		robot8.keyRelease(KeyEvent.VK_CONTROL);
		generic.ExplicitWait(4);
	    robot8.keyPress(KeyEvent.VK_ENTER);
		robot8.keyRelease(KeyEvent.VK_ENTER);
	    
		generic.ExplicitWait(7);
		File picture10 = new File(picturesDir,"relax.jpeg");
		String onefarmimagepath10 = picture10.getAbsolutePath();
	    driver.findElement(By.xpath("//div[@class='k-widget k-upload k-header']/div/div")).click();
		generic.ExplicitWait(9);
		StringSelection ss9 = new StringSelection(onefarmimagepath10);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss9, null);
		Robot robot9 = new Robot();
		robot9.keyPress(KeyEvent.VK_CONTROL);
		robot9.keyPress(KeyEvent.VK_V);
		robot9.keyRelease(KeyEvent.VK_V);
		robot9.keyRelease(KeyEvent.VK_CONTROL);
		generic.ExplicitWait(4);
	    robot9.keyPress(KeyEvent.VK_ENTER);
		robot9.keyRelease(KeyEvent.VK_ENTER);
	    	
		generic.ExplicitWait(5);
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(6);
		CustomerFarmsandPeddocksUploadFarmMapUpdateButton.click();
		generic.ExplicitWait(6);
		
	    }


public void uploadFarmMapInValidScenario11ImageMultipleFile() throws IOException, InterruptedException, AWTException
{

	File picture1 = new File(picturesDir,"download1.jpg");
	String onefarmimagepath11 = picture1.getAbsolutePath();
	
		
		generic.ExplicitWait(5);
		NewCustomersEditPeddocks.click();
		generic.ExplicitWait(5);
		generic.WebPageScrollDown(driver);
		driver.findElement(By.xpath("(//div[@class='k-button k-upload-button'])[2]")).click();
		generic.ExplicitWait(5);
		StringSelection ss = new StringSelection(onefarmimagepath11);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			generic.ExplicitWait(4);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			generic.ExplicitWait(8);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
		
		generic.ExplicitWait(5);
		generic.WebPageScrollDown(driver);
		generic.ExplicitWait(6);
		CustomerFarmsandPeddocksUploadFarmMapUpdateButton.click();
		generic.ExplicitWait(6);
	
}











}