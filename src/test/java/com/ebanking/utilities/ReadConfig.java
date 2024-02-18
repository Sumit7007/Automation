package com.ebanking.utilities;
import java.io.*;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public String path = ".//Configuration//config.properties";
	
	public ReadConfig()
	{
		File src = new File(path);
		try {
			FileInputStream input = new FileInputStream(src);
			pro = new Properties();
			pro.load(input);
		}
		catch(Exception e)
		{
			System.out.println("Exception is:"+e.getMessage());
		}
	}
	
	public String getBaseUrl()
	{
		String value = pro.getProperty("URL");
		return value;
		
	}
	
	public String getUsername()
	{
		String value = pro.getProperty("Username");
		return value;
	}
	
	public String getPassword()
	{
		String value = pro.getProperty("Password");
		return value;
	}
	
	public String getBrowser()
	{
		String value = pro.getProperty("Browser");
		return value;
	}
	
}
