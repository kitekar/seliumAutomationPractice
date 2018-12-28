package com.QA.Gibsons_Connect_Finance;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Finanace_Statements_Base_Page extends Generic_Service
{
	@FindBy(xpath="//a[@id='menu-toggle']/i")
	private WebElement ToggleMenuBar;
	
	@FindBy(xpath="//a[@id='ledgerEntryId']/span")
	private WebElement FinanaceMenuBar;
	

	Generic_Service generic=new Generic_Service();
	

	public Finanace_Statements_Base_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateToFinance()


	{  
		
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
		FinanaceMenuBar.click();
		generic.ExplicitWait(5);
		ToggleMenuBar.click();
		generic.ExplicitWait(5);
	
	}
	
	@FindBy(xpath="//input[@id='part1AAC']")
	private WebElement FinanaceStatements_SelectACustomerFileld;
	
	
	
	
	
	@FindBy(xpath="//ul[@id='part1AAC_listbox']/li[1]")
	private WebElement FinanaceStatements_SelectACustomerSelect;
	
	
	@FindBy(xpath="(//span[@class='k-widget k-dropdown k-header'])[2]")
	private WebElement FinanaceStatements_EntityDropdown;
	
	
	@FindBy(xpath="//ul[@id='entityList_listbox']/li[2]")
	private WebElement FinanaceStatements_EntitySelect;
	
	
	
	@FindBy(xpath="(//span[@class='k-icon k-i-calendar'][contains(text(),'select')])[1]")
	private WebElement FinanaceStatements_StartDateCalendarIcon;
	
	
	@FindBy(xpath="(//span[@class='k-icon k-i-calendar'][contains(text(),'select')])[2]")
	private WebElement FinanaceStatements_EndDateCalendarIcon;
	
	
	@FindBy(xpath="//div[@class='k-button dashboarddeletebtn btn-gray']")
	private WebElement FinanaceStatements_ClearButton;
	
	
	
	@FindBy(xpath="//div[@id='buttonsDiv']/div[2]")
	private WebElement FinanaceStatements_GetReportsButton;
	
	@FindBy(xpath="//div[contains(text(),'Back')]")
	private WebElement FinanaceStatements_GetReportsafterBack;
	
	
	
	public void createStatement() throws IOException
	{
		
		generic.ExplicitWait(5);
		
		FinanaceStatements_SelectACustomerFileld.sendKeys("ace");
		generic.ExplicitWait(5);
		
		FinanaceStatements_SelectACustomerSelect.click();
		
		generic.ExplicitWait(5);
		
		FinanaceStatements_EntityDropdown.click();
		
		generic.ExplicitWait(5);
		
		FinanaceStatements_EntitySelect.click();
		generic.ExplicitWait(5);
		
		FinanaceStatements_GetReportsButton.click();
		generic.ExplicitWait(8);
		
		
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	    BufferedImage image = screenshot.getImage();
	 
	    ImageIO.write(image,"PNG", new File("./Screenshots/"+"Statement.png"));
	    generic.ExplicitWait(6);
	    
		System.out.println("Statement Screenshot has taken");
		
		generic.ExplicitWait(6);
		
		generic.WebPageScrollUp(driver);
		generic.WebPageScrollUp(driver);
		
		generic.ExplicitWait(6);
		FinanaceStatements_GetReportsafterBack.click();
		
		generic.ExplicitWait(4);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
