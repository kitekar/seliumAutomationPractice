package com.facebook.Page;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Masterpage  {
	
	WebDriver driver;
	public Properties prop;
	
	
	public Masterpage() throws IOException //Constructor
	{
		FileInputStream ip= new FileInputStream
("D:\gibson_selenium\gibsonsautomationscript\seliumAutomationPractice\POMTest\src\com\facebook\Property\OR.properties");
		
		prop=new Properties();
		prop.load(ip);
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
	System.setProperty("webdriver.chrome.driver", System.setProperty("user.dir")+"\\src\\com\\facebook\\thirdPartyDrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("IE"))
		{
			System.out.println("Open IE");
		}
		else
		{
			driver= new FirefoxDriver();
			
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
}
