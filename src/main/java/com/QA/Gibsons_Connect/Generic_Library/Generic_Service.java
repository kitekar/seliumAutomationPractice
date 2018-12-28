package com.QA.Gibsons_Connect.Generic_Library;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.QA.Gibsons_Connect.Config.Constant;

public  class Generic_Service implements Generic_Interface 

{
	//..............................properties File data reading........//
	
	
	
	public static WebDriver driver;
//........................Implementation for new browser .................//
	
	public void OpenUrlInNewTab(WebDriver driver, String url)
	
	{
		try 
		{
			WebElement urlField;
			urlField = driver.findElement(By.cssSelector("body"));
			urlField.sendKeys(Keys.CONTROL + "t");
			driver.navigate().to(url);
		} 
		catch (Exception e) 
		{	
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
	}

	public void CloseUrlOpenedInNewTab(WebDriver driver)
	{
		try 
		{
			WebElement urlField;
			urlField = driver.findElement(By.cssSelector("body"));
			urlField.sendKeys(Keys.CONTROL + "w");
			driver.switchTo().defaultContent();
		} 
		catch (Exception e) 
		{	
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
	}

//......................Implementation of File upload and download................//
	
	public void HandlingFileDownloadPopUp() 
	
	{
		try 
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		System.out.println("Select Save As Option");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Enter Key is pressed");

	}
	catch (Exception e)
	{
		System.out.println("Enter key press is not performed");
	}
}
	public  void setClipboardData(String string) 
	{
		
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	
	
	public void HandlingFileUploadPopUp(WebElement clickOnElement, String filePath) 
	
	{
		
	
		
		try
		{
			
			Generic_Service generic=new Generic_Service();
		    generic.setClipboardData(filePath);
			Robot robot = new Robot();
			robot.setAutoDelay(1000);
				
	    	robot.keyPress(KeyEvent.VK_ENTER);
	    	System.out.println("ENTER Key Pressed");
	    	
	    	robot.keyRelease(KeyEvent.VK_ENTER);
	    	System.out.println("ENTER Key Released");
	    	robot.setAutoDelay(1000);
	    	
	    	robot.keyPress(KeyEvent.VK_CONTROL);
	    	System.out.println("CONTROL Key Pressed");
	    	
	    	robot.keyPress(KeyEvent.VK_V);
	    	System.out.println("V Key Pressed");
	    	robot.setAutoDelay(1000);
	    	
	    	robot.keyRelease(KeyEvent.VK_CONTROL);
	    	System.out.println("CONTROL Key Released");
	    	
	    	robot.keyRelease(KeyEvent.VK_V);
	    	System.out.println("V Key Released");
	    	robot.setAutoDelay(2000);
	    	
	    	robot.keyPress(KeyEvent.VK_ENTER);
	    	System.out.println("ENTER Key Pressed");
	    	
	    	robot.keyRelease(KeyEvent.VK_ENTER);
	    	System.out.println("ENTER Key Released");
		}
		catch (AWTException e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	

//.................Implementation for different wait methods...........//
	
	
	
	public void ExplicitWait(int timeInSec)
	
	{
		try 
		{
			Thread.sleep(1000 * timeInSec);
		} 
		catch (InterruptedException e) 
		{	
			Reporter.log("\nInterrupted Exception occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
	}


	public void WaitForPageToLoad(WebDriver driver, WebElement element)
	{
	
		
	}

//..............Implementation to get table data...............//
	
	public void GetTableColumnData(WebDriver driver, List<WebElement> rows, List<WebElement> cols)
	{
	
	}

	
	public void GetTableData(WebDriver driver, List<WebElement> rows, List<WebElement> cols) {
	
		
	}

	
	public void GetTextBoxData(List<WebElement> rows, List<WebElement> cols) {
		
		
	}

	
	public int GetTableColumnsDefaultValue(List<WebElement> rows, List<WebElement> cols) {
		
		return 0;
	}

	
	public int GetTableColumnsValue(List<WebElement> rows, List<WebElement> cols) {
		
		return 0;
	}
	
	
	
//........................Alert Method Implementation......................//
	
	
	public void AcceptAlert(WebDriver driver)
	{
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		
	}
	}
	
	public void DismissAlert(WebDriver driver)
	{
		
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
	}}

	
	public void WebPageScrollUp(WebDriver driver)
	{
		try
		{
			JavascriptExecutor jsx = (JavascriptExecutor)driver;
			jsx.executeScript("window.scrollBy(0,-250)", "");
		}
		catch(Exception e)
		{
			Reporter.log("\n Exception occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
	}


	public void WebPageScrollDown(WebDriver driver)
	{
		try
		{
			JavascriptExecutor jsx = (JavascriptExecutor)driver;
			jsx.executeScript("window.scrollBy(0,1000)", "");
			
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		
	}}
//............Implementation for Keyboard  and mouse Operation............//
	
	public void ActionDoubleClick(WebDriver driver, WebElement onElement) 
	{

		try
		{
			Actions action = new Actions(driver);
			action.doubleClick(onElement).perform();
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
	}

	
	public void ActionMoveToElement(WebDriver driver, WebElement element)
	{
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
	}}


	public void ActionsDragAndDrop(WebDriver driver, WebElement source, WebElement target)
	{

		Generic_Service generic = new Generic_Service();
		
		try
		{
			Actions action = new Actions(driver);
			generic.ExplicitWait(3);
			Action dragAndDrop = action.dragAndDrop(source, target).build();
			dragAndDrop.perform();
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
	}

	//.....................Assert method Implementation.........//
	
	public void SoftAssertMethod(String actualMsg, String expectedMsg)
	{
	
	}


	public boolean AssertMethod(String actualMsg, String expectedMsg)
	{
		
		return false;
	}

	
	public boolean AssertIntegerMethod(int actualMsg, int expectedMsg)
	{
	
		return false;
	}

	
	public void AssertTrueMethod(boolean condition, String message) {
		
		
	}


	public void AssertFalseMethod(boolean condition, String message)
	{
	
	}


	public void DisplayStringTestData(String str) {
		
		
	}


	public void DisplayNumericTestData(int val) {
		
		
	}

//...............Implementation for Excel sheet operation ..........//	
	
	
	
	public String GetXlStringValue(String xlPath, String sheetName, int rowNum, int cellNum)
{
		
		return null;
	}

	
	public int GetExcelSheetRowCount(String xlPath, String sheetName)
	{
		
		return 0;
	}


	public int GetExcelSheetIntegerCellValue(String xlPath, String sheetName, int rowNum, int cellNum)
	{
	
		int v;
		try 
		{
			FileInputStream fis	 = new FileInputStream(xlPath);
			
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet s = wb.getSheet(sheetName);
			
			v=(int) s.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		} 
		catch (Exception e) 
		{
			v=0;
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		return v;
	}


	public long GetExcelSheetLongIntCellValue(String xlPath, String sheetName, int rowNum, int cellNum)
	{
		long v;
		try 
		{
			FileInputStream fis	 = new FileInputStream(xlPath);
			
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet s = wb.getSheet(sheetName);
			
			v=(long) s.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		} 
		catch (Exception e) 
		{
			v=0;
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		return v;
		
		
	}


	public String GetExcelSheetStringCellValue( String filepath, String sheetName, int rowNum, int cellNum) throws InvalidFormatException, IOException 
	{
		
			String v;
			
			{
				FileInputStream fis	 = new FileInputStream(filepath);
				
				Workbook wb = WorkbookFactory.create(fis);
				
				Sheet s = wb.getSheet(sheetName);
				
				v=s.getRow(rowNum).getCell(cellNum).getStringCellValue();
			} 
			return v;
		
	}

	
	public boolean VerifyStringValue(WebElement element, String str)
	{
	
		return false;
	}

	
	public boolean VerifyIntegerValue(WebElement element, int val) 
	{
		
		return false;
	}

	
	public boolean VerifyLongIntegerValue(WebElement element, long val)
	{
		
		return false;
	}


	public boolean VerifyElementIsSelected(WebElement element, String str)
	{
	
		return false;
	}


	public boolean VerifyCheckBoxIsChecked(WebElement checkBox, String str) 
	{
		
		return false;
	}


	public boolean VerifyIsButtonDisplayed(WebElement element)
	{
	
		return false;
	}


	public boolean VerifyElementIsDisplayed(WebElement element, String str)
	{
		
		return false;
	}

	
	public void VerifyIsButtonEnabled(WebElement element)
	{
		
	}


	public boolean VerifyIsElementPresent(List<WebElement> elements)
	{
		
		return false;
	}


	public void VerifyIsElementEnabled(WebElement element, String str)
	{
	
		
	}

	
	public boolean VerifyStringValueEnabled(WebElement element, String str)
	{
	
		return false;
	}


	public boolean VerifyIntegerValueEnabled(WebElement element, int value)
	{
	
		return false;
	}


	public void VerifyIsElementUngrayed(WebElement element, String str)
	{
		
		
	}


	public void IsElementClickable(WebDriver driver, WebElement element)
	{
		
		
	}


	public boolean CompareActualWithExpected(String aElement, WebElement eElement)
	{
	
		return false;
	}


	public boolean StringCompareActualWithExpected(String aElement, String eElement)
	{
		
		return false;
	}


	public void SelectClassByVisibleText(WebElement element, String text) 
	{
		try
		{
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
	}
	
	
	public void SelectTextWithoutSelectclass(WebDriver driver,WebElement element)
	{
		
		try
		{
			Actions act = new Actions(driver);
	        act.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN)).perform(); 
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
		
		
		
	}

	public void SelectClassByIndex(WebElement element, int index)
	{
	
		try
		{
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
	}

	
	public void SelectClassByValue(WebElement element, String value)
	{
		try
		{
			Select select = new Select(element);
			select.selectByValue(value);
		}
		catch(Exception e)
		{
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
	}


	public void SelectDropDownListOption(WebElement element, String optionName)
	{
     Generic_Service generic = new Generic_Service();
		
		try
		{
			List<WebElement> options = element.findElements(By.tagName("option"));

			for (WebElement option : options)
			{
				if(optionName.equals(option.getText()))
				{
					option.click();
					generic.ExplicitWait(2);
					Reporter.log("\n" + option.getText() + " option is selected" , true);
					break;
				}
			}
		}
		catch (NoSuchElementException e)
	    {
	    	Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
	    }
		
	}

	public void PrintAllComboboxOptions(WebElement element)
	{
		
		try
	    {
			Select select = new Select(element);
			
			List<WebElement> allOptions = select.getOptions();
			int count=allOptions.size();
			
			Reporter.log("\nAll options present in Combo box listed below:", true);
			for(int i=0; i<count; i++)	
			{								    
				String name= allOptions.get(i).getText();
				Reporter.log("\n" + name, true);
			}
	    } 
	    catch (org.openqa.selenium.NoSuchElementException e)
	    {
	    	Reporter.log("\nNoSuchElementException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
	}
	}

	public void PrintSelectedComboboxOption(WebElement element, String optionName)
	{
    Generic_Service generic = new Generic_Service();
		
		try
		{
			List<WebElement> options = element.findElements(By.tagName("option"));

			for(WebElement option : options)
			{
				if(optionName.equals(option.getText()))
				{
					option.click();
										
					if(option.isSelected())
					{
						String textVal = option.getText();
						Reporter.log("\nDisplayed option in ComboBox is: " + textVal, true);
						generic.ExplicitWait(2);
						break;
					}
		
					else
					{
						Reporter.log("\nInvalid Option is Selected", true);
					}
					 }
				      } 
			           }
					
					catch(Exception e)
					{
						Reporter.log("\nException occurred", true);
						Reporter.log(e.getMessage(), true);
						e.printStackTrace();
					}
					
		}
				
	


	public String getFirstSelectedOption(WebElement element)
	{
		
		return null;
	}

	
	public void ChildBrowserPopup(WebDriver driver, WebElement clickOnElement) 
	{
Generic_Service generic = new Generic_Service();
		
		try
		{
			Set<String> winSet = driver.getWindowHandles();
			
			Iterator<String> allWins = winSet.iterator();
			
			clickOnElement.click();
			generic.ExplicitWait(2);

			String parentWindows = allWins.next();
			driver.switchTo().window(parentWindows);
			
			String childWindows = allWins.next();
			driver.switchTo().window(childWindows);
		}
		catch (Exception e)
	    {
			Reporter.log("\nException occurred", true);
			Reporter.log(e.getMessage(), true);
			e.printStackTrace();
		}
		
	}
	public void ChildBrowserPopupHandle(WebDriver driver)
	{
		
		
		Set <String> set1=driver.getWindowHandles();
		Iterator <String> win1=set1.iterator();
		String parent=win1.next();
		String child=win1.next();
		driver.switchTo().window(child);
	//	driver.switchTo().window(parent);

		
		
	}
	
	
	
	public void GetScreenShot(WebDriver driver, String imgPath)
	{
		
			EventFiringWebDriver efDriver = new EventFiringWebDriver(driver);

			File srcFile = efDriver.getScreenshotAs(OutputType.FILE);

			File destFile = new File(imgPath);
			try 
			{
				FileUtils.copyFile(srcFile, destFile);
			} 
			catch (IOException e) 
			{	
				Reporter.log("\nFailed to capture screenshot: ", true);
				Reporter.log(e.getMessage(), true);
				e.printStackTrace();
			}
		}
	
	public void GetScreenShotwithmethodname(WebDriver driver,ITestResult result) 
	{
		    String location = "D:\\Project_Related_Downloads\\"; 
		    String methodname = result.getName(); 
		    try {
		        File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(screenshots, new File(location + methodname + "_" + ".png"));
		    } 
			catch (IOException e) 
			{	
				Reporter.log("\nFailed to capture screenshot: ", true);
				Reporter.log(e.getMessage(), true);
				e.printStackTrace();
			}
		}
	
	public void ConncetWithDataBase(String dburl, String username, String password, String query)
	{
	
		
	}


	public void selectBrowser()
	{
	
	
	if(Constant.browser.equals("firefox"))
		
		{
		   	System.out.println("Firefox browser");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		
		}
		else if(Constant.browser.equals("chrome"))
		{
			System.out.println("chrome browser");
			System.setProperty("webdriver.chrome.driver","./DriverServers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			driver=new ChromeDriver(options);
			driver.navigate().refresh();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		} 
		else if(Constant.browser.equals("ie"))
		{
		System.out.println("ie browser");
		System.setProperty("webdriver.ie.driver","./DriverServers/IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability("requireWindowFocus", true);
		driver = new InternetExplorerDriver(capabilities);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		}
		else if(Constant.browser.equals("safari"))
		{
			System.out.println("safari browser");
			driver = new SafariDriver();
			driver.navigate().refresh();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			
		
		} 
		
	
	
	
	
	}}

	


