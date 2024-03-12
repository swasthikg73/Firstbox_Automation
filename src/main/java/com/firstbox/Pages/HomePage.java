package com.firstbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy (xpath ="//span[text()=\" Dashboard \"]")
	private WebElement dashboard;
	
	@FindBy(xpath = "//span[text()=\"Enterprise \"]")
	private WebElement enterpriseTab;
	
	@FindBy(linkText = "Contacts")
	private WebElement contacts;
	
	@FindBy(xpath = "//span[text()=\"Add Contact\"]")
	private WebElement Addcontacts;
	
	@FindBy(linkText = "Users" )
	private WebElement usersTab;
	
	@FindBy(xpath = "//span[text()=\"Add Users\"]")
	private WebElement addUser;
	
	@FindBy(xpath = "(//span[@class='dropbtn d-flex gap-2'])[5]")
	private  WebElement shipmentTab;
	
	@FindBy(xpath = "//a[normalize-space()='Manage Shipment']")
	private WebElement ManageShipment;
	
	@FindBy(xpath = "//span[normalize-space()='Create Shipment']")
	private WebElement Createshipment;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyDashboardTab() {
	boolean displaystatus = dashboard.isDisplayed();
	return displaystatus;
	}
	
	public void ClickEnterpriseTab() {
		enterpriseTab.click();
	}
	public void clickUsersTab() {
		usersTab.click();
	}
	
	public void clickAddUserTab() {
		addUser.click();
	}
	
	public void clickContacts() {
		contacts.click();
	}
	
	public void clickAddcontacts() {
		Addcontacts.click();
	}
	
	public void clickshipmentTab() {
		shipmentTab.click();
	}
	public void clickmanageshipment() {
		ManageShipment.click();
	}
	
	//Onboard Employee Page
	public void NavigateToOnboardEmployeePage() {
		enterpriseTab.click();
		usersTab.click();
		addUser.click();
	}
	
	// Add User Page
	public void NavigateToAddContactsPage() {
		enterpriseTab.click();
		enterpriseTab.click();
		Addcontacts.click();
	
	}
	
	//Create Shipment Page
	public CreateshipmentPage NavigateToCreateShipmentPage() {
		shipmentTab.click();
		ManageShipment.click();
		Createshipment.click();
		return new CreateshipmentPage(driver);
	}
}
