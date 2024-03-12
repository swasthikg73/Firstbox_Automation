package com.Firtbox.Listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.firstbox.Utilities.ExtentReporter;
import com.firstbox.Utilities.Utilities;

public class MyListeners implements ITestListener {

	ExtentReports extentReport;
	ExtentTest extentTest;
	String testname ;
	
	@Override
	public void onStart(ITestContext context) {
		extentReport = ExtentReporter.generateExtentReport();
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		 testname = result.getName();
		extentTest = extentReport.createTest(testname);
	    extentTest.log(Status.INFO,testname+"Started Executing");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, testname+"got Successfully Executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		WebDriver driver = null;
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		String DestinationscreenshotPath= Utilities.Capturescreenshot(driver, result.getName());
		extentTest.addScreenCaptureFromPath(DestinationscreenshotPath);
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.FAIL,testname+" got failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.SKIP,testname+"is skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
		
		String pathofExtentreport = System.getProperty("user.dir")+"\\test-output\\Extentreport\\extentReport.html";
		File extentreport = new File(pathofExtentreport);
		
		try {
			Desktop.getDesktop().browse(extentreport.toURI());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
