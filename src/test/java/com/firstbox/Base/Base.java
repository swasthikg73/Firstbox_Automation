package com.firstbox.Base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.firstbox.Pages.LoginPage;
import com.firstbox.Utilities.Utilities;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public Properties dataProp;
	public Properties shipmentdata;
	
	public Base() {
		 prop= new Properties();
		 dataProp = new Properties();
		 shipmentdata= new Properties();
		 
		 try
		 {
		 FileInputStream datafs= new FileInputStream("C:\\Users\\hsalm\\Downloads\\automation\\Firstbox_Project\\src\\main\\java\\com\\firstbox\\TestData\\com.TestData.properties");
		 dataProp.load(datafs);
		 }
		 
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 
		try
		{
		FileInputStream fs=new FileInputStream("C:\\Users\\hsalm\\Downloads\\automation\\Firstbox_Project\\src\\main\\java\\com\\firstbox\\Configuration\\Configuration.properties");
		prop.load(fs);
	}
		
	catch (Throwable e) {
		e.printStackTrace();
	}
		
		try
		{	
		FileInputStream Sdata = new FileInputStream("C:\\Users\\hsalm\\Downloads\\automation\\Firstbox_Project\\src\\main\\java\\com\\firstbox\\TestData\\com.CreateShipmentDatas.properties");
		shipmentdata.load(Sdata);
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
	public WebDriver initilaliseBrowserAndOpenApplication(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")){
	driver= new ChromeDriver();
	}
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.Implicit_Wait_Time));
	driver.get(prop.getProperty("url"));
	LoginPage login = new LoginPage(driver);
	login.Login(prop.getProperty("validEmail"),prop.getProperty("validPassword"));
	return driver;
	}
	
	public static String invalidEmailAddress() {
		String Iemail= "swasthikg32+5"+GenerateTimeStamp()+"@gmail.com";
		return Iemail;
	}
	
	
	public static String GenerateTimeStamp() {
		Date date=new Date();
		return (date.toString().replace(" ", "_").replace(":", "_"));
	}
	
}
