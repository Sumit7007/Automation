package com.ebanking.utilities;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{
	
public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		CaptureScreenshot cp = new CaptureScreenshot();
		cp.getscreenShot();
	}

}
