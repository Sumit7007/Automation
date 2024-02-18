package com.ebanking.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebanking.pageobjects.*;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void LoginTest()
	{
		driver.get(BaseUrl);
		logger.info("Url Opened");
		IndexPage ip = new IndexPage(driver);
		
		ip.getUsername(usernameDefault);
		ip.getPassword(passwordDefault);
		ip.clkLoginBtn();
		logger.info("Clicked on login button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Successful");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Failed");
		}
	}

}
