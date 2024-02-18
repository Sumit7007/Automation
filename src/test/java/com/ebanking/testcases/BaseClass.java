package com.ebanking.testcases;
import com.ebanking.utilities.*;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	ReadConfig con = new ReadConfig();
	
	public String BaseUrl = con.getBaseUrl();
	public String usernameDefault = con.getUsername();
	public String passwordDefault = con.getPassword();
	public String browser = con.getBrowser().toLowerCase();
	
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	public void setup()
	{
		switch(browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			driver = null;
			break;
		}
		
		
		logger = LogManager.getLogger("E-BankingV1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
		driver.quit();
	}

}
