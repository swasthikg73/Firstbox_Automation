package com.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.firstbox.Base.Base;
import com.firstbox.Pages.HomePage;
import com.firstbox.Pages.Onboard_Employe_Page;

	public class AddDriverTest extends Base {
		public WebDriver driver;
	Onboard_Employe_Page oep;
	public AddDriverTest(){
		super();
	}
	
	@BeforeMethod
	public void Setup() {
	driver = initilaliseBrowserAndOpenApplication(prop.getProperty("Browser"));

	HomePage homepage=new HomePage(driver);
	homepage.NavigateToOnboardEmployeePage();
	oep= new Onboard_Employe_Page(driver);
	}
	
	@AfterMethod
	public void setdown() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
	}
	
	@Test (priority=1)
	public void AddaDriver()throws InterruptedException, AWTException {
	
	oep.entername(dataProp.getProperty("driverName"));
	 
	oep.enteremail(dataProp.getProperty("email"));
	 
	oep.enterphonenumber(dataProp.getProperty("phone"));
	 
	oep.entersecondarynum(dataProp.getProperty("secondaryPhone"));
	
	oep.enteraddressline1(dataProp.getProperty("addressLine1"));
	
	oep.enteraddressline2(dataProp.getProperty("addressline2"));
	
	oep.clickcountrydropdown();
	Thread.sleep(1000);
	
	oep.selectindia();
	
	oep.clickstatedropdown();
	
	oep.selectkarnataka();
	
	oep.entercity(dataProp.getProperty("city"));
	
	oep.enterzipcode(dataProp.getProperty("zipcode"));
	
	oep.clickbranchdropdown();
	
	oep.selectmangalore();
	
	oep.clickroledropdown();
	
	oep.selectdeleveryagent();
	 
	oep.clickreporterdropdown();
	Thread.sleep(1000);
	 
	oep.selectmangalorereportes();
	 
	oep.clickemplyementtypedropdown();
	 
	Thread.sleep(1000);
	 
	oep.selectcontractoption();
	
	oep.clickOnDateOfJoinCalender();
	
	oep.selectthejoindate();
	 
	oep.clickonDocumentTypedropdown();
	 
	oep.selectdrivingLiscense();
	 
	oep.uploadFile();
	Thread.sleep(2000);
	
	StringSelection path= new StringSelection(dataProp.getProperty("uploadFile"));
	
	Robot rb= new Robot();
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	oep.clickonexpiredatecalender();
	oep.clickonpresentYear();
	oep.clickonexpireYear();
	oep.clickonexpireMonth();
	oep.clickonexpiredatecalender();
	
	//click on submit
	//oep.clickOnSavebutton();
	}
	
	@Test(priority=2)
	void AddUserwithoutfillingtheDetails() throws AWTException, InterruptedException
	{	
		
	oep.clickOnSavebutton();
	
	//String actualWarning=oep.getNameError();
	Assert.assertTrue(oep.getNameError().contains(dataProp.getProperty("driverNameError")));
	
	Assert.assertTrue(oep.getEmailError().contains(dataProp.getProperty("emailError")));
	
	Assert.assertTrue(oep.getphoneError().contains(dataProp.getProperty("phoneError")));
		
	Assert.assertTrue(oep.getSeconderyphoneError().contains(dataProp.getProperty("secondaryPhoneError")));
		
	Assert.assertTrue(oep.getAddressline1().contains(dataProp.getProperty("addressLine1Error")));
		
	Assert.assertTrue(oep.getAddressline2().contains(dataProp.getProperty("addressline2Error")));
		
	Assert.assertTrue( oep.getcountryError().contains(dataProp.getProperty("countryError")));
		
	Assert.assertTrue(oep.getstateError().contains(dataProp.getProperty("stateError")));
		
	Assert.assertTrue(oep.getcityError().contains(dataProp.getProperty("cityError")));
		
	Assert.assertTrue(oep.getzipcodeError().contains(dataProp.getProperty("zipcodeError")));
		
	Assert.assertTrue(oep.getbrancErrorError().contains(dataProp.getProperty("branchError")));

	Assert.assertTrue(oep.getroleError().contains(dataProp.getProperty("roleError")));
		
	Assert.assertTrue(oep.getreportingtoError().contains(dataProp.getProperty("reportingtoError")));
		
	Assert.assertTrue(oep.getemployementtypeError().contains(dataProp.getProperty("employementtypeError")));
		
	Assert.assertTrue(oep.getdateOfJoinError().contains(dataProp.getProperty("dateofJoinError")));
		
	Assert.assertTrue(oep.getdocumentTypeError1().contains(dataProp.getProperty("documenttypeError1")));
		
	Assert.assertTrue(oep.getdocumentTypeError2().contains(dataProp.getProperty("documenttypeerror2")));
		
	Assert.assertTrue(oep.getexpireTypeError().contains(dataProp.getProperty("expirydateerror")));
			}
}
