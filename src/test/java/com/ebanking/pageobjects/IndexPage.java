package com.ebanking.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	
	WebDriver ldriver;
	
	public IndexPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	
	@FindBy(name="uid")
	WebElement txtusename;
	
	@FindBy(name="password")
	WebElement txtpwd;
	
	@FindBy(name="btnLogin")
	WebElement clklogin;
	
	public void getUsername(String uname)
	{
		txtusename.sendKeys(uname);
	}
	
	public void getPassword(String pass)
	{
		txtpwd.sendKeys(pass);
	}
	
	public void clkLoginBtn()
	{
		clklogin.click();;
	}
}
