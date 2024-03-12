package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.firstbox.Base.Base;
import com.firstbox.Pages.AddcontactsPage;
import com.firstbox.Pages.HomePage;

public class CreateContactsTest extends Base {

	public WebDriver driver;
	AddcontactsPage addcontactspage;
	
	@BeforeMethod
	void setup() {
		driver=initilaliseBrowserAndOpenApplication(prop.getProperty("Browser"));
		HomePage homepage=new HomePage(driver);
		addcontactspage = new AddcontactsPage(driver);
		homepage.ClickEnterpriseTab();
		homepage.clickContacts();
		homepage.clickAddcontacts();
	}
	
	@AfterMethod
	public void SetDown() throws InterruptedException {
		//Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(priority=1)
	public void AddContact() {
		
		addcontactspage.enterFirstnamefield(dataProp.getProperty("name"));
		addcontactspage.enterlastnamefield(dataProp.getProperty("secondname"));
		addcontactspage.enterphone(dataProp.getProperty("phonenum"));
		addcontactspage.entercompany(dataProp.getProperty("companyname"));
		addcontactspage.enteremail(dataProp.getProperty("email"));
		addcontactspage.enteraddressline1("Add1");
		addcontactspage.enteraddressline2("Add2");
		addcontactspage.clickCitydropdown();
		addcontactspage.clickMangalore();
		//Submitting the button
		//addcontactspage.clickSubmitbutton();
		addcontactspage.clickOnCancelButton();
	}
	
	@Test(priority=2)
	public void AddContactwithoutFillingtheDetails() {
		
		addcontactspage.clickSubmitbutton();
		Assert.assertTrue(addcontactspage.getFirstnameerror().contains(dataProp.getProperty("CustomerFirstNameError")));
		
		Assert.assertTrue(addcontactspage.getSecondnameerror().contains(dataProp.getProperty("CustomerSecondNameError")));
		
		Assert.assertTrue(addcontactspage.getPhoneError().contains(dataProp.getProperty("CustomerPhoneNumberError")));
		
		Assert.assertTrue(addcontactspage.getCompanynameerror().contains(dataProp.getProperty("CustomerCompanyNameError")));
		
		Assert.assertTrue(addcontactspage.getemailError().contains(dataProp.getProperty("CustomerEmailError")));
		
		Assert.assertTrue(addcontactspage.getaddresserror().contains(dataProp.getProperty("CustomerAddress1Error")));
}
}