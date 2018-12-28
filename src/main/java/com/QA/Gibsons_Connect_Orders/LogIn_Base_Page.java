package com.QA.Gibsons_Connect_Orders;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Gibsons_Connect.Config.Constant;
import com.QA.Gibsons_Connect.Generic_Library.Generic_Service;




public class LogIn_Base_Page extends Generic_Service
{
     
	 @FindBy(xpath="//div[@class='header-content']")
	 private WebElement LogInLogo ;
	
	@FindBy(xpath="//input[@name='username']")
	 private WebElement UserNameField ;
	

	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElement NextbuttonField;
	
	@FindBy(xpath="//input[@name='password']")
	 WebElement PasswordField ;
	
	
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	 private WebElement LogInButton ;
	
	@FindBy(xpath="//div[@class='forget-password']")
	 private WebElement ForgotyourpasswordLogo ;
	
	@FindBy(xpath="//a[@class='btn-forgot-pwd']")
	 private WebElement ClickheretoresetPasswordLogo ; 
	
	@FindBy(xpath="(//div[@class='modal-header']/button)[3]")
	 private WebElement HomepageWhatsnewclosebutton ; 
	
	
	
	Generic_Service generic=new Generic_Service();
	
	public LogIn_Base_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void UrlOfGibsonsConnect()
	
	{
		driver.get(Constant.GibsonConnect_url);
		
		
}
	
public void UrlOfGibsonsKendra()
	
	{
		driver.get(Constant.Gibsons_Kendra_Url);
		
		
}
	
	public void GibsonsConnectLogInToApp(String Username,String Password)
	{
		
		
		//generic.selectBrowser();
		UserNameField.sendKeys(Constant.username_gibsonConnect);
		generic.ExplicitWait(2);
		NextbuttonField.click();
		generic.ExplicitWait(2);
		PasswordField.sendKeys(Constant.password_gibsonConnect);
		generic.ExplicitWait(2);
		
		
		
		
		
			
	}
	
	

	public void GibsonsConnectLogInToTrukieApp(String Username,String Password)
	{
		
		UserNameField.sendKeys(Constant.username_truckie);
		
		PasswordField.sendKeys(Constant.password_truckie);
		
		
		
		
		
		
			
	}
	public void GibsonsConnectLogInKendra(String Username,String Password)
	{
		
		UserNameField.sendKeys(Constant.username_Kendra);
		
		PasswordField.sendKeys(Constant.password_Kendra);
			
	}
	
	@FindBy(xpath="//div[@id='whatsNewModal']/div/div/div[1]/button[@class='close']")
	 private WebElement HomepageKendraWhatsnewclosebutton ; 
	
	
	public  void loginButton()
	{
		LogInButton.click();
		generic.ExplicitWait(5);
		
		if(HomepageWhatsnewclosebutton.isDisplayed())
		{
			
			System.out.println("Whts new section displayed");
			generic.ExplicitWait(5);
			HomepageWhatsnewclosebutton.click();	
			
		}
		else{
			
			System.out.println("Whts new section not displayed");
		}
		
		generic.ExplicitWait(6);
		
	}
	
	
	
	@FindBy(xpath="(//div[@class='modal-header']/button)[2]")
	 private WebElement TrukieHomepageWhatsnewclosebuttontruckie ; 
	
	public  void loginButtonTrukie()
	{
		LogInButton.click();
		generic.ExplicitWait(5);
		
		if(TrukieHomepageWhatsnewclosebuttontruckie.isDisplayed())
		{
			
			System.out.println("Whts new section displayed");
			TrukieHomepageWhatsnewclosebuttontruckie.click();	
			
		}
		else{
			
			System.out.println("Whts new section not displayed");
		}
		
		generic.ExplicitWait(6);
		
	}
	
	
	public  void loginButtonKendra()
	{
		LogInButton.click();
		generic.ExplicitWait(5);

		if(HomepageKendraWhatsnewclosebutton.isDisplayed())
		{
			System.out.println("Whts new section displayed");
			generic.ExplicitWait(5);
			HomepageKendraWhatsnewclosebutton.click();	
			
		}
		else{
			
			System.out.println("Whts new section not displayed");
		}
	
		
		generic.ExplicitWait(6);
		
	 
	}

	
	
	
	
}
