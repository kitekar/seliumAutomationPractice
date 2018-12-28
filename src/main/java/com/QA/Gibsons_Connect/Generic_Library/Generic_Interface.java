
package com.QA.Gibsons_Connect.Generic_Library;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public interface Generic_Interface

{
	
	
	//Library Function to open browser in new tab
	public void OpenUrlInNewTab(WebDriver driver, String url);
	
	
    //Library Function to close browser in new tab
	public void CloseUrlOpenedInNewTab(WebDriver driver);
	
	

	// -----------------File Download and upload Pop up-----------//

	// Library Function to Handling file download pop up
	public void HandlingFileDownloadPopUp();

	// Library Function to Handling file Upload pop up
	public void HandlingFileUploadPopUp(WebElement clickOnElement, String filePath);
	
	
	
	//---------------------------------------------------------------------//
	

	// ----------------------Wait methods-----------------------//

	  //Library Function for Explicit wait
	  public void ExplicitWait(int timeInSec);

    	// Library Function for Explicit Wait Until Page to Load
	  public void WaitForPageToLoad(WebDriver driver, WebElement element);
	  
	  
	//------------------------------------------------------------------//  
	  

	// -----------Data Fetching from Text Box and cloumns------------------//

	// Library Function to Fecth Data from particulars Columns
	public void GetTableColumnData(WebDriver driver, List<WebElement> rows, List<WebElement> cols);

	// Library Function to Fecth Data from all Columns
	public void GetTableData(WebDriver driver, List<WebElement> rows, List<WebElement> cols);

	// Library Function to Fecth Data from TextBox Field
	public void GetTextBoxData(List<WebElement> rows, List<WebElement> cols);

	//Library Function to Fetch default value present in Coloum
	public int GetTableColumnsDefaultValue(List<WebElement> rows, List<WebElement> cols);

	//Library Function to Fetch  value present in Coloum
	public int GetTableColumnsValue(List<WebElement> rows, List<WebElement> cols);
	
	
	//---------------------------------------------------------------------------//
	
	

	// --------------Alert PopUP handeling methods---------------//

	// Library Function to Accept Alert & Confirmation Dialog
	public void AcceptAlert(WebDriver driver);

	// Library Function to Dismiss Alert & Confirmation Dialog
	public void DismissAlert(WebDriver driver);

	// Library function to Scrolling the Page Up
	public void WebPageScrollUp(WebDriver driver);

	// Library Function to Scrolling the Page Down
	public void WebPageScrollDown(WebDriver driver);
	
//-----------------------------------------------------------------//	
	

	// -------------Action Class Methods------------------------//

	// Library Function to Perform Double Click Operation
	public void ActionDoubleClick(WebDriver driver, WebElement onElement);

	// Library Function to Perform MouseOver Operation
	public void ActionMoveToElement(WebDriver driver, WebElement element);

	//Library Function to drag and drop Elements and Files
	public void ActionsDragAndDrop(WebDriver driver, WebElement source, WebElement target);

	// ----------------------Assert Method ------------------------//

	// Library Function to Verify the Actual result with Expected result
	public void SoftAssertMethod(String actualMsg, String expectedMsg);

	// Library Function to Verify the Actual result with Expected result
	public boolean AssertMethod(String actualMsg, String expectedMsg);

	// Library Function to Verify the Actual result with Expected result
	public boolean AssertIntegerMethod(int actualMsg, int expectedMsg);

	// Library Function to Verify the Result and Print the Message
	public void AssertTrueMethod(boolean condition, String message);

	// Library Function to Verify the Result and Print the Message
	public void AssertFalseMethod(boolean condition, String message);

	// Library Function to display string TestData
	public void DisplayStringTestData(String str);

	// Library Function to display integer TestData
	public void DisplayNumericTestData(int val);

	// ----------Excel sheet data read and write---------------//

	public String GetXlStringValue(String xlPath, String sheetName, int rowNum, int cellNum);

	//Library function to count the Number of Rows present in the Excel Sheet
	public int GetExcelSheetRowCount(String xlPath, String sheetName);

	// Library Function to Get the Integer Data present in the Excel Sheet
	public int GetExcelSheetIntegerCellValue(String xlPath, String sheetName, int rowNum, int cellNum);

	// Library Function to Get the Long Integer Data present in the Excel Sheet
	public long GetExcelSheetLongIntCellValue(String xlPath, String sheetName, int rowNum, int cellNum);

	// Library Function to Get the string Data present in the Excel Sheet
	public String GetExcelSheetStringCellValue(String xlPath, String sheetName, int rowNum, int cellNum) throws InvalidFormatException, IOException;

	// ----Verification for button,element and string value---------//

	// Library Function to Check String Element is Enabled or Not
	public boolean VerifyStringValue(WebElement element, String str);

	// Library Function to Check int Element is Enabled or Not
	public boolean VerifyIntegerValue(WebElement element, int val);

	// Library Function to Check Long Element is Enabled or Not
	public boolean VerifyLongIntegerValue(WebElement element, long val);

	// Library Function to Check Element is Selected or Not
	public boolean VerifyElementIsSelected(WebElement element, String str);

	// Library Function to Verify CheckBox is Checked or Not
	public boolean VerifyCheckBoxIsChecked(WebElement checkBox, String str);

	// Library Function to Check Element is Displayed or Not
	public boolean VerifyIsButtonDisplayed(WebElement element);

	// Library Function to Check Element is Displayed or Not
	public boolean VerifyElementIsDisplayed(WebElement element, String str);

	// Library Function to Check Button is Enabled or Not
	public void VerifyIsButtonEnabled(WebElement element);

	// Library Function to Check Element is Present or Not
	public boolean VerifyIsElementPresent(List<WebElement> elements);

	// Library Function to Check String Element is Enabled or Not
	public void VerifyIsElementEnabled(WebElement element, String str);

	// Library Function to Check String Element is Enabled or Not
	public boolean VerifyStringValueEnabled(WebElement element, String str);

	// Library Function to Check String Element is Enabled or Not
	public boolean VerifyIntegerValueEnabled(WebElement element, int value);
	
	// Library Function to Check String Element is Ungrayed or Not
	public void VerifyIsElementUngrayed(WebElement element, String str);
	
	//Library Function for check element is clickable or Not
	public void IsElementClickable(WebDriver driver, WebElement element);
	
	//Library Function to compare Actual with expected value
	public boolean CompareActualWithExpected(String aElement, WebElement eElement);

	//Library Function to compare String value
	public boolean StringCompareActualWithExpected(String aElement, String eElement);

	// -----Drop Down Operations----------//

	// Library Function to select the Option in DropDownList by Visible Text
	public void SelectClassByVisibleText(WebElement element, String text);

	// Library Function to select the Option in DropDownList by Index
	public void SelectClassByIndex(WebElement element, int index);

	// Library Function to select the Option in DropDownList by Value
	public void SelectClassByValue(WebElement element, String value);

	// Library Function to select particular option in ComboBox
	public void SelectDropDownListOption(WebElement element, String optionName);

	//Library Function to select all options present in ComboBox
	public void PrintAllComboboxOptions(WebElement element);

	// Library Function to Display the Selected Option in DropdownList
	public void PrintSelectedComboboxOption(WebElement element, String optionName);

	//Library Function to Display First selected option in DropdownList
	public String getFirstSelectedOption(WebElement element);

	// ----------------------------------------------------------//

	// -------------Getwindow Handle methods--------------//

	//Library function give control to child Browser----//
	public void ChildBrowserPopup(WebDriver driver, WebElement clickOnElement);

	// -------------------------Screen shot capture--------------//
	
     //Library Function to Capture ScreenShot
	public void GetScreenShot(WebDriver driver, String imgPath);
	
	
	//------------------Data Base Connection--------------//
	
	//Library Function to Connect with DataBase
	public void ConncetWithDataBase(String dburl,String username,String password,String query);
	
	public void GetScreenShotwithmethodname(WebDriver driver,ITestResult result) ;
	
	

}
