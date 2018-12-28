package com.QA.Gibsons_Connect_Bookings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Bookings_BasePage extends  Generic_Service
{

	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='Booking']/span[1]")
	private WebElement BookingsMenuBar;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[6]/ul/li[1]/a/span")
	private WebElement BookingsMenuBarBookings;
	
	@FindBy(xpath="//ul[@id='side-menu']/li[6]/ul/li[2]/a/span")
	private WebElement BookingsMenuBarEmployeeCalender;
	
	@FindBy(xpath="//div[@class='panel-heading']")
	private WebElement BookingsTextMainPage;	
	
	
	
	
    Generic_Service generic=new Generic_Service();
     
	public Bookings_BasePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToBookings()
	{
		
		
			
			ToggleMenuBar.click();
			generic.ExplicitWait(5);
			BookingsMenuBar.click();
			generic.ExplicitWait(5);
			BookingsMenuBarBookings.click();
			System.out.println("Navigate to Bookings Mainpage");
			ToggleMenuBar.click();
			generic.ExplicitWait(5);
		
	}

	
//----------------------------------Order type---------------//
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header']/span[1])[1]")
	private WebElement BookingsMainPageOrderTypedropdown;
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[1]")
	private WebElement BookingsMainPageOrderTypeAll;	
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[3]")
	private WebElement BookingsMainPageOrderTypeLogistics;
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[4]")
	private WebElement BookingsMainPageOrderTypeGroundSpread;
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[2]")
	private WebElement BookingsMainPageOrderTypeDarrimanLime;	
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[5]")
	private WebElement BookingsMainPageOrderTypeMaryvaleLime;	
//--------------------------------Depo----------------------------------//	

	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header']/span[1])[2]")
	private WebElement BookingsMainPageDepoDropdown;
	
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[1]")
	private WebElement BookingsMainPageDepoAll;
	
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[2]")
	private WebElement BookingsMainPageDepoBrainsDale;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[3]")
	private WebElement BookingsMainPageDepoBayles;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[4]")
	private WebElement BookingsMainPageDepoDarrimanLime;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[5]")
	private WebElement BookingsMainPageDepoDutson;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[6]")
	private WebElement BookingsMainPageDepoMaryvale;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[7]")
	private WebElement BookingsMainPageDepoRoseDell;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[8]")
	private WebElement BookingsMainPageDepoRoseTafalgar;
	
	@FindBy(xpath="//ul[@id='depotList_listbox']/li[9]")
	private WebElement BookingsMainPageDepoYarram;
	
	@FindBy(xpath="//li[@tabindex='-1'][contains(text(),'YARRAM')]")
	private WebElement BookingsMainPageDepoYarramselect;

	
	
//------------------Calender----------------------------//	
	
	@FindBy(xpath="//span[@class='k-picker-wrap k-state-default']/span/span")
	private WebElement BookingsMainPageCalenderIcon;	
	
	@FindBy(xpath="//div[@class='k-widget k-calendar']")
	private WebElement BookingsMainPageCalenderHighLight;	
	
	@FindBy(xpath="(//div[@class='k-header']/a/span)[1]")
	private WebElement BookingsMainPageCalenderPreviousMonth;	
	
	@FindBy(xpath="(//div[@class='k-header']/a/span)[2]")
	private WebElement BookingsMainPageCalenderNextMonth;	
	
	@FindBy(xpath="(//td[@role='gridcell'])[17]")
	private WebElement BookingsMainPageCalenderTodaysDate;	
	
//---------------------ViewCalender-------------//	
	
	
	@FindBy(xpath="//div[@id='viewCalendarReport']")
	private WebElement BookingsMainPageViewCalenderReport;	
	
	
	@FindBy(xpath="//div[@id='viewCalendar']")
	private WebElement BookingsMainPageViewCalender;	
	
	
	public void MainPageBookingsReportforStatusAsAll() throws IOException
	{
		
		/*
		generic.ExplicitWait(5);
		BookingsMainPageCalenderIcon .click();
		Actions act = new Actions(driver);
	    act.clickAndHold(BookingsMainPageCalenderHighLight);
	    generic.ExplicitWait(10);
		generic.ExplicitWait(3);
		BookingsMainPageCalenderPreviousMonth.click();
		generic.ExplicitWait(3);
		BookingsMainPageCalenderPreviousMonth.click();
		generic.ExplicitWait(3);
		BookingsMainPageCalenderTodaysDate.click();
		generic.ExplicitWait(5);
		BookingsTextMainPage.click();*/
		
		
		BookingsMainPageOrderTypedropdown.click();
		generic.ExplicitWait(3);
		BookingsMainPageOrderTypeAll.click();
		generic.ExplicitWait(3);
		
		BookingsMainPageDepoDropdown.click();
		generic.ExplicitWait(3);
		BookingsMainPageDepoAll.click();
		generic.ExplicitWait(5);
		
		
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	    BufferedImage image = screenshot.getImage();
	    
	
		ImageIO.write(image, "PNG", new File("./Screenshots/"+"CalenderstatusAllEntireMainPage.png"));
		
		
		System.out.println("Screenshot taken please naviagte to mentioned loaction");
}
		
	@FindBy(xpath="//ul[@id='depotList_listbox']")
	private WebElement BookingsMainPageDepoList;
	
	public void MainPageBookingsForyarramGroundspread() throws IOException
	{
		
		generic.ExplicitWait(3);
		BookingsMainPageOrderTypedropdown.click();
		generic.ExplicitWait(3);
		BookingsMainPageOrderTypeGroundSpread.click();
		
		
		generic.ExplicitWait(3);
		BookingsMainPageDepoDropdown.click();
		
		generic.ExplicitWait(3);
		BookingsMainPageDepoYarramselect.click();
		generic.ExplicitWait(5);
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image = screenshot.getImage();
	
		ImageIO.write(image, "PNG", new File("./Screenshots/"+"GroaundspreadYarramMainPage.png"));
		
		
	}
	
	@FindBy(xpath="(//div[@class='btn btn-primary  k-button'])[2]")
	private WebElement BookingsChildWindowNext;
	
	@FindBy(xpath="(//div[@class='btn btn-primary  k-button'])[1]")
	private WebElement BookingsChildWindowPrevious;
	
	@FindBy(xpath="//img[@class='btn btn-primary  k-button pull-right']")
	private WebElement BookingsChildWindowFullScreen;
	
	@FindBy(xpath="//div[@class='btn btn-primary  k-button'][contains(text(),'Exit Calendar')]")
	private WebElement BookingsChildWindowExit;
	
	public void ViewCalenderReportForyarramGroundspread() throws IOException, AWTException
	{
		
		generic.ExplicitWait(3);
		BookingsMainPageOrderTypedropdown.click();
		generic.ExplicitWait(3);
		BookingsMainPageOrderTypeGroundSpread.click();
		generic.ExplicitWait(3);
		BookingsMainPageDepoDropdown.click();
		generic.ExplicitWait(3);
		BookingsMainPageDepoYarramselect.click();
		generic.ExplicitWait(5);
		BookingsMainPageViewCalenderReport.click();
		generic.ExplicitWait(10);
		generic.ChildBrowserPopupHandle(driver);
		generic.ExplicitWait(10);
		BookingsChildWindowFullScreen.click();
		
		generic.ExplicitWait(8);
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image3 = screenshot.getImage();
		
	
		ImageIO.write(image3, "PNG", new File("./Screenshots/"+"GroaundspreadYarramOngoingWeekReport.png"));
		
		generic.ExplicitWait(7);
		BookingsChildWindowPrevious.click();
		generic.ExplicitWait(8);
		Screenshot screenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image = screenshot1.getImage();
		
	
		ImageIO.write(image, "PNG", new File("./Screenshots/"+"GroaundspreadYarramPrevoiusWeekReport.png"));
		generic.ExplicitWait(7);
		
		BookingsChildWindowNext.click();
		generic.ExplicitWait(3);
		BookingsChildWindowNext.click();
		generic.ExplicitWait(7);
		Screenshot screenshot2 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image1 = screenshot2.getImage();
		
	
		ImageIO.write(image1, "PNG", new File("./Screenshots/"+"GroaundspreadYarramNextWeekReport.png"));
		
	

		
	}
	public void ViewCalenderForAllStatus() throws IOException, AWTException
	{	
		
		
		generic.ExplicitWait(3);
		BookingsMainPageOrderTypedropdown.click();
		generic.ExplicitWait(3);
		BookingsMainPageOrderTypeAll.click();
		generic.ExplicitWait(3);
		BookingsMainPageDepoDropdown.click();
		generic.ExplicitWait(3);
		BookingsMainPageDepoAll.click();
		generic.ExplicitWait(5);
		BookingsMainPageViewCalender.click();
		generic.ExplicitWait(7);
		generic.ChildBrowserPopupHandle(driver);
		generic.ExplicitWait(5);
		BookingsChildWindowFullScreen.click();
		
		generic.ExplicitWait(7);
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image3 = screenshot.getImage();
	
		ImageIO.write(image3, "PNG", new File("./Screenshots/" + "AllOrderBookingsOngoingweek.png"));
		
		generic.ExplicitWait(7);
		BookingsChildWindowNext.click();
		generic.ExplicitWait(9);
		Screenshot screenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image1 = screenshot1.getImage();
		ImageIO.write(image1, "PNG", new File("./Screenshots/" + "AllOrderBookingsNextweek.png"));
		
		generic.ExplicitWait(7);
		BookingsChildWindowPrevious.click();
		generic.ExplicitWait(5);
		BookingsChildWindowPrevious.click();
		Screenshot screenshot2 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image = screenshot2.getImage();
		ImageIO.write(image, "PNG", new File("./Screenshots/"+ "AllOrderBookingsPreviousgweek.png"));
		
	
		generic.ExplicitWait(5);
		Robot robot=new Robot();
	    robot.keyPress(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_SPACE);
	    generic.ExplicitWait(3);
	    robot.keyPress(KeyEvent.VK_N);
	    robot.keyRelease(KeyEvent.VK_ALT);
	    robot.keyRelease(KeyEvent.VK_SPACE);
	    robot.keyRelease(KeyEvent.VK_N);
	    

		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> win1 = set1.iterator();
		String parent = win1.next();

		driver.switchTo().window(parent);
		
	    
		generic.ExplicitWait(5);
	    BookingsMainPageViewCalender.click();
		generic.ExplicitWait(5);
	    Robot robot1=new Robot();
	    robot1.keyPress(KeyEvent.VK_ALT);
	    robot1.keyPress(KeyEvent.VK_SPACE);
	    generic.ExplicitWait(3);
	    robot1.keyPress(KeyEvent.VK_N);
	    robot1.keyRelease(KeyEvent.VK_ALT);
	    robot1.keyRelease(KeyEvent.VK_SPACE);
	    robot1.keyRelease(KeyEvent.VK_N);
	    
		generic.ExplicitWait(5);
	    BookingsMainPageViewCalender.click();
		generic.ExplicitWait(5);
	    Robot robot2=new Robot();
	    robot2.keyPress(KeyEvent.VK_ALT);
	    robot2.keyPress(KeyEvent.VK_SPACE);
	    generic.ExplicitWait(3);
	    robot2.keyPress(KeyEvent.VK_N);
	    robot2.keyRelease(KeyEvent.VK_ALT);
	    robot2.keyRelease(KeyEvent.VK_SPACE);
	    robot2.keyRelease(KeyEvent.VK_N);
	    
		generic.ExplicitWait(5);
	    BookingsMainPageViewCalender.click();
		generic.ExplicitWait(5);
	    Robot robot3=new Robot();
	    robot3.keyPress(KeyEvent.VK_ALT);
	    robot3.keyPress(KeyEvent.VK_SPACE);
	    generic.ExplicitWait(3);
	    robot3.keyPress(KeyEvent.VK_N);
	    robot3.keyRelease(KeyEvent.VK_ALT);
	    robot3.keyRelease(KeyEvent.VK_SPACE);
	    robot3.keyRelease(KeyEvent.VK_N);
		
		System.out.println("4 windows open at a time for Booking_calender");
		generic.ExplicitWait(7);
	
		String actualDisplay=BookingsTextMainPage.getText();
		String expecteddisplay="BOOKINGS";
		Assert.assertEquals(actualDisplay,expecteddisplay);
	    System.out.println("Bookings showed successfully");


}
	
	
	
	
	@FindBy(xpath="//div[@id='viewEmployeeCalendar']")
	private WebElement EmployeeMainPageViewCalender;
	
	@FindBy(xpath="(//div[@class='btn btn-primary  k-button'])[2]")
	private WebElement BookingsEmployeeChildWindowNext;
	
	@FindBy(xpath="(//div[@class='btn btn-primary  k-button'])[1]")
	private WebElement BookingsEmployeeChildWindowPrevious;
	
	@FindBy(xpath="//img[@class='btn btn-primary  k-button pull-right']")
	private WebElement BookingsEmployeeChildWindowFullScreen;
	
	@FindBy(xpath="//div[@class='btn btn-primary  k-button'][contains(text(),'Exit Calendar')]")
	private WebElement BookingsEmployeeChildWindowExit;
	
	
	
	public void EmployeeBookingCalender() throws IOException, AWTException
	{
		

		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		BookingsMenuBar.click();
		generic.ExplicitWait(5);
		BookingsMenuBarEmployeeCalender.click();
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		System.out.println("Navigate to Bookings Mainpage");
		generic.ExplicitWait(3);
		BookingsMainPageOrderTypedropdown.click();
		generic.ExplicitWait(3);
		BookingsMainPageOrderTypeAll.click();
		generic.ExplicitWait(3);
		BookingsMainPageDepoDropdown.click();
		generic.ExplicitWait(3);
		BookingsMainPageDepoAll.click();
		generic.ExplicitWait(5);
		EmployeeMainPageViewCalender.click();
		generic.ExplicitWait(5);
		generic.ChildBrowserPopupHandle(driver);
		generic.ExplicitWait(7);
	
		BookingsChildWindowNext.click();
		generic.ExplicitWait(9);
		Screenshot screenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image1 = screenshot1.getImage();
		ImageIO.write(image1, "PNG", new File("./Screenshots/"+"AllEmployeeNextweek.png"));
		
		generic.ExplicitWait(7);
		BookingsChildWindowPrevious.click();
		Screenshot screenshot3 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image3 = screenshot3.getImage();
		ImageIO.write(image3, "PNG", new File("./Screenshots/"+"AllEmployeeOngoingweek.png"));
		
	
		generic.ExplicitWait(5);
		BookingsChildWindowPrevious.click();
		generic.ExplicitWait(8);
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		BufferedImage image = screenshot.getImage();
		ImageIO.write(image, "PNG", new File("./Screenshots/"+"AllEmployeePreviousgweek.png"));
		
		
		generic.ExplicitWait(5);
		Robot robot=new Robot();
	    robot.keyPress(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_SPACE);
	    generic.ExplicitWait(3);
	    robot.keyPress(KeyEvent.VK_N);
	    robot.keyRelease(KeyEvent.VK_ALT);
	    robot.keyRelease(KeyEvent.VK_SPACE);
	    robot.keyRelease(KeyEvent.VK_N);
	    

		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> win1 = set1.iterator();
		String parent = win1.next();

		driver.switchTo().window(parent);
		
	    
		generic.ExplicitWait(5);
		EmployeeMainPageViewCalender.click();
		generic.ExplicitWait(5);
	    Robot robot1=new Robot();
	    robot1.keyPress(KeyEvent.VK_ALT);
	    robot1.keyPress(KeyEvent.VK_SPACE);
	    generic.ExplicitWait(3);
	    robot1.keyPress(KeyEvent.VK_N);
	    robot1.keyRelease(KeyEvent.VK_ALT);
	    robot1.keyRelease(KeyEvent.VK_SPACE);
	    robot1.keyRelease(KeyEvent.VK_N);
	    
		generic.ExplicitWait(5);
		EmployeeMainPageViewCalender.click();
		generic.ExplicitWait(5);
	    Robot robot2=new Robot();
	    robot2.keyPress(KeyEvent.VK_ALT);
	    robot2.keyPress(KeyEvent.VK_SPACE);
	    generic.ExplicitWait(3);
	    robot2.keyPress(KeyEvent.VK_N);
	    robot2.keyRelease(KeyEvent.VK_ALT);
	    robot2.keyRelease(KeyEvent.VK_SPACE);
	    robot2.keyRelease(KeyEvent.VK_N);
	    
		generic.ExplicitWait(5);
		EmployeeMainPageViewCalender.click();
		generic.ExplicitWait(5);
	    Robot robot3=new Robot();
	    robot3.keyPress(KeyEvent.VK_ALT);
	    robot3.keyPress(KeyEvent.VK_SPACE);
	    generic.ExplicitWait(3);
	    robot3.keyPress(KeyEvent.VK_N);
	    robot3.keyRelease(KeyEvent.VK_ALT);
	    robot3.keyRelease(KeyEvent.VK_SPACE);
	    robot3.keyRelease(KeyEvent.VK_N);
		
		System.out.println("4 windows open at a time for Employee_calender");
		generic.ExplicitWait(7);
	
		
		
	}



}





















