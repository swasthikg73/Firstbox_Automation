package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.firstbox.Base.Base;
import com.firstbox.Pages.CreateshipmentPage;
import com.firstbox.Pages.HomePage;


public class CreateshipmentTest extends Base{
	
	public WebDriver driver;
	CreateshipmentPage createshipmentpage;
	
	public CreateshipmentTest(){
		 super();
	 }
	public static void scrollUp(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	@AfterMethod
	void Setdown() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException 
	{	
		driver=initilaliseBrowserAndOpenApplication(prop.getProperty("Browser"));
		
		HomePage homepage = new HomePage(driver);
		createshipmentpage = homepage.NavigateToCreateShipmentPage();
	
		createshipmentpage.clickShopviaDropdown();
		createshipmentpage.clickRoadFreightoption();
		createshipmentpage.clickShippingfromDropdown();
		createshipmentpage.clickFirstboxterminalOption();
		
		createshipmentpage.Enterfirstname(dataProp.getProperty("name"));
		createshipmentpage.enterSecondName(dataProp.getProperty("secondname"));
		createshipmentpage.Entercompanyname(dataProp.getProperty("companyname"));
		createshipmentpage.enterEmail(dataProp.getProperty("email"));
		createshipmentpage.enterphoneField(dataProp.getProperty("phonenum"));
		createshipmentpage.clickcityDropdown();
		createshipmentpage.clicksurathkalinthecityDropdown();
		createshipmentpage.clickselfdropBranchDropdown();
		createshipmentpage.clickmangaloreoption();
		createshipmentpage.clickshippingToDropdown();
		Thread.sleep(1000);
		createshipmentpage.clickonselfCollectionfromfirstbox();
		createshipmentpage.clickonaddressBook();
		createshipmentpage.ClickonSelectContactdropdown();
		WebElement searchfield = driver.findElement(By.xpath("//input[@class='p-dropdown-filter p-inputtext p-component']"));
		searchfield.sendKeys("mark");
		createshipmentpage.clickonMark();
		createshipmentpage.ClickonprefillButton();
		scrollUp(driver);
		Thread.sleep(1000);
		createshipmentpage.clickonselfCollectiondropdown();
		//selecting the data from the dropdown
		createshipmentpage.SelectBangaloreinselfcollection();
		createshipmentpage.clickonshippingHandlingRequiremrntbutton();
		createshipmentpage.clickonCargoTypedropdown();
	}
	
	@Test(priority=1)
	public void CreateFullContainerShipment() throws InterruptedException {
			
		createshipmentpage.Clickonfullcontainer();
		createshipmentpage.enterCommodities(shipmentdata.getProperty("commodities"));
		scrollUp(driver);
		Thread.sleep(1000);
		
		createshipmentpage.clickonContainerTypedropdown();
		Thread.sleep(1000);
		//selecting the container value
		createshipmentpage.selectcontainerType();
		createshipmentpage.entercontainercount(shipmentdata.getProperty("containerCount"));
		
		createshipmentpage.clickonNetWeightbutton();
		
		createshipmentpage.enterthetotalweight(shipmentdata.getProperty("Totalweight"));
		createshipmentpage.clickonweightunit();
		createshipmentpage.clickonKG();
		createshipmentpage.enterPrice(shipmentdata.getProperty("price"));
		createshipmentpage.enteradditionalnote(shipmentdata.getProperty("AdditionalNote"));
		createshipmentpage.clickonpaymentoptiondropdown();
		createshipmentpage.clickcashoption();
		createshipmentpage.clickonpaymentStatusdropdown();
		Thread.sleep(1000);
		createshipmentpage.clickonpaidOption();
		//createshipmentpage.clickonReadyforShipmentbutton();
		 }	
	
	@Test(priority=2)
	public void LooseCargoShipment() throws InterruptedException {
		
		createshipmentpage.selectloosecargoShipment();
		
		createshipmentpage.enterCommodities(shipmentdata.getProperty("commodities"));
		scrollUp(driver);
		Thread.sleep(1000);
		createshipmentpage.clickonTypedropdown();
		createshipmentpage.clickonBagsoption();
		
		createshipmentpage.entertheCount(shipmentdata.getProperty("Count"));
		createshipmentpage.clickonKgButton();
		createshipmentpage.enterNetweight(shipmentdata.getProperty("Netweight"));
		createshipmentpage.enterlenght(shipmentdata.getProperty("Lenght"));
		createshipmentpage.enterwidth(shipmentdata.getProperty("Width"));
		createshipmentpage.enterheight(shipmentdata.getProperty("Height"));
		
		scrollUp(driver);
		createshipmentpage.enterpricefield(shipmentdata.getProperty("price"));
		createshipmentpage.enteradditionalnote(shipmentdata.getProperty("AdditionalNote"));
		createshipmentpage.clickonpaymentoptiondropdown();
		createshipmentpage.clickcashoption();
		createshipmentpage.clickonpaymentStatusdropdown();
		Thread.sleep(1000);
		createshipmentpage.clickonpaidOption();
		//createshipmentpage.clickonReadyforShipmentbutton();
	}
}

	
