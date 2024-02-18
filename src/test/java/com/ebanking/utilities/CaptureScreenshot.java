package com.ebanking.utilities;
import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.ebanking.testcases.BaseClass;

public class CaptureScreenshot extends BaseClass{
	
	public void getscreenShot()
	{
		Date date = new Date();
		String filename = date.toString().replace(":", "-").replace(" ", "-");
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotfile, new File(".//screenshots//" + filename + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
