package com.firstbox.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports generateExtentReport() {
	ExtentReports extentreports = new ExtentReports();
	File Extentreport = new File(System.getProperty("user.dir")+"\\test-output\\Extentreport\\extentReport.html");
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter(Extentreport);
	sparkreporter.config().setTheme(Theme.DARK);
	sparkreporter.config().setReportName("Firstbox Test Automation Results");
	sparkreporter.config().setDocumentTitle("Firstbox Automation Reports");
	sparkreporter.config().setTimeStampFormat("dd/MM/YYYY hh:mm:ss");
	
	extentreports.attachReporter(sparkreporter);

	Properties prop= new Properties();
	try {
		FileInputStream fis = new FileInputStream("C:\\Users\\hsalm\\Downloads\\automation\\Firstbox_Project\\src\\main\\java\\com\\firstbox\\Configuration\\Configuration.properties");
	prop.load(fis);
	}
	catch (Throwable e) {
		e.printStackTrace();
	}
	extentreports.setSystemInfo("Application URL", prop.getProperty("url"));
	extentreports.setSystemInfo("Browser Name", prop.getProperty("Browser"));
	extentreports.setSystemInfo("Email", prop.getProperty("validEmail"));
	extentreports.setSystemInfo("Password", prop.getProperty("validPassword"));
	extentreports.setSystemInfo("Operating System",System.getProperty("os.name"));
	extentreports.setSystemInfo("User name",System.getProperty("user.name"));
	extentreports.setSystemInfo("Java Version",System.getProperty("java.version"));
	
	return extentreports;
	}
}