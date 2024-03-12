package com.testcases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.firstbox.Base.Base;
import com.firstbox.Pages.HomePage;
import com.firstbox.Pages.LoginPage;
import com.firstbox.Utilities.Utilities;

public class LoginfunctionalityTest extends Base {
	
public WebDriver driver;
LoginPage login;

public LoginfunctionalityTest() {
	super();
}
@BeforeMethod
public void setup()
{
String BrowserName= prop.getProperty("Browser");
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
	 login = new LoginPage(driver);

	}

	@AfterMethod
	public void Teardown() {
	 driver.quit();
	}

	@Test(priority=1,dataProvider ="ValidCredentialsProvider")
	public void loginwithvalidCredentials(String email, String Password) 
	{
		login.Login(email, Password);
		HomePage homepage= new HomePage(driver);
		Assert.assertTrue(homepage.verifyDashboardTab(),"Home Page is not redirected");
	}
	
	@DataProvider(name="ValidCredentialsProvider")
	public Object[][] DataSupply(){
		Object[][] data=Utilities.ExcelData("Login");
		return data;
		}
	
	@Test(priority=2)
	public void loginwithinvalidCredentials() 
	{
		String invalidEmail=Base.invalidEmailAddress();
		login.Login(invalidEmail,dataProp.getProperty("InvalidPassword"));
		}
	
	@Test(priority=3,dependsOnMethods = {"loginwithvalidCredentials","loginwithinvalidCredentials"})
	public void loginwithInnvalidEmailandvalidPassword()
	{
		login.Login(Base.invalidEmailAddress(),prop.getProperty("validPassword"));
	}
	
	@Test(priority=4)
	public void loginwithValidEmailandInvalidPassword() 
	{
		login.Login(prop.getProperty("validEmail"),dataProp.getProperty("InvalidPassword"));
	}
	}

