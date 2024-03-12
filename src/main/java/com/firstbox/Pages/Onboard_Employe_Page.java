package com.firstbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Onboard_Employe_Page {

	WebDriver driver;
	
	@FindBy(xpath = "//label[text()=\"Name\"]/following-sibling::input")
	private WebElement namefield;
	
	@FindBy(xpath = "//label[text()=\"Email\"]/following-sibling::input")
	private WebElement emailfield;
	
	@FindBy(xpath = "//input[@placeholder='081234 56789']")
	private WebElement phonefield;
	
	@FindBy(xpath = "//label[text()=\"Secondary Contact\"]/following-sibling::input")
	private WebElement secodaryphonefield;
	
	@FindBy(xpath = "//label[text()=\"Address Line 1\"]/following-sibling::input")
	private WebElement addressline1;
	
	@FindBy(xpath = "//label[text()=\"Address Line 2\"]/following-sibling::input")
	private WebElement addressline2;
	
	@FindBy(xpath = "//p-dropdown[@placeholder='Select Country']//div[@aria-label='dropdown trigger']")
	private WebElement countrydropdown;
	
	@FindBy(xpath = "//span[text()=\"India\"]")
	private WebElement india;
	
	@FindBy(xpath="//span[text()=\"Select State\"]")
	private WebElement statedropdown;
	
	@FindBy(xpath = "//span[text()=\"Karnataka\"]")
	private WebElement karnataka;
	
	@FindBy(xpath = "//label[text()=\"City\"]/following-sibling::input")
	private WebElement cityfield;
	
	@FindBy(xpath = "//label[text()=\"Zip Code\"]/following-sibling::input")
	private WebElement zipcodefield;
	
	@FindBy(xpath = "//span[text()=\"Select Branch\"]")
	private WebElement branchdropdown;
	
	@FindBy(xpath = "//span[text()=\"Mangalore\"]")
	private WebElement mangalore;
	
	@FindBy(xpath = "//span[text()=\"Select Role\"]")
	private WebElement roleDropdown;
	
	@FindBy(xpath = "//span[text()=\"Delivery Agents\"]")
	private WebElement delieveryAgent;
	
	@FindBy(xpath = "//span[text()=\"Select Reporter\"]")
	private WebElement reporteddropdown;
	
	@FindBy(xpath = "//span[text()=\"Manglore swasthik\"]")
	private WebElement mangaloreswasthikoption;
	
	@FindBy(xpath ="//span[text()=\"Select Employment Type\"]" )
	private	WebElement employementtypedropdown;
	
	@FindBy(xpath = "//span[text()=\"Contract\"]")
	private	WebElement contractoption;
	
	@FindBy(id = "single")
	private	WebElement calender;
	
	@FindBy(xpath = "//span[text()=\"20\"]")
	private WebElement date;
	
	@FindBy(xpath = "//span[text()=\"Select Document\"]")
	private WebElement document;
	
	@FindBy(xpath = "//span[text()=\"Driver Liscense\"]")
	private WebElement drivingLicense;
	
	@FindBy(xpath = "//div[@class='col-md-3 mb-3']//input[@id='float-input']")
	private WebElement choosefail;
	
	@FindBy(id = "range")
	private WebElement expirydate;
	
	@FindBy(xpath = "//button[text()=\" 2024 \"]")
	private WebElement presentyear;
	
	@FindBy(xpath = "//span[text()=\" 2028 \"]")
	private WebElement expireyear;
	
	@FindBy(xpath = "//span[text()=\" Oct \"]")
	private WebElement expiremonth;
	
	@FindBy(xpath = "//span[text()=\"30\"]")
	private WebElement expiredate;
	
	@FindBy(xpath = "//button[text()=\" Save \"]")
	private WebElement saveButton;
	

	public Onboard_Employe_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entername(String name) {
		namefield.sendKeys(name);
	}
	
	public void enteremail(String email) {
		emailfield.sendKeys(email);
	}
	
	public void enterphonenumber(String num) {
		phonefield.sendKeys(num);
	}
	
	public void entersecondarynum(String num) {
		secodaryphonefield.sendKeys(num);
	}
	
	public void enteraddressline1(String add1) {
		addressline1.sendKeys(add1);
	}
	
	public void enteraddressline2(String add2) {
		addressline2.sendKeys(add2);
	}
	
	public void clickcountrydropdown() {
		countrydropdown.click();
	}
	
	public void selectindia() {
		india.click();
	}
	
	public void clickstatedropdown() {
		statedropdown.click();
	}
		
	public void selectkarnataka() {
		Actions action=new Actions(driver);
	    action.click(karnataka).perform();
	}
	
	public void entercity(String city) {
		cityfield.sendKeys(city);
	}
	
	public void enterzipcode(String zip) {
		zipcodefield.sendKeys(zip);
	}
	
	public void clickbranchdropdown() {
		branchdropdown.click();
	}
	
	public void selectmangalore() {
		Actions action = new Actions(driver);
		action.click(mangalore).perform();
	}
	
	public void clickroledropdown() {
		roleDropdown.click();
	}
	
	public void selectdeleveryagent() {
		delieveryAgent.click();
	}
	
	public void clickreporterdropdown() {
		reporteddropdown.click();
	}
	
	public void selectmangalorereportes() {
	mangaloreswasthikoption.click();
	}
	
	public void clickemplyementtypedropdown() {
		employementtypedropdown.click();
	}
	
	public void selectcontractoption() {
		contractoption.click();
	}
	
	public void clickOnDateOfJoinCalender() {
		calender.click();
	}
	
	public void selectthejoindate() {
		date.click();
	}
	
	public void clickonDocumentTypedropdown() {
		document.click();
	}
	
	public void selectdrivingLiscense() {
		drivingLicense.click();
	}
	
	public void uploadFile() {
		Actions action= new Actions(driver);
		 action.click(choosefail).perform();
	}
	
	public  void clickonexpiredatecalender() {
		expirydate.click();
	}
	
	public void clickonpresentYear() {
		presentyear.click();
	}
	
	public void clickonexpireYear() {
		expireyear.click();
	}
	
	public void clickonexpireMonth() {
		expiremonth.click();
	}
	
	public void clickonExpireDate() {
		expiredate.click();
	}
	
	public void clickOnSavebutton() {
		saveButton.click();
	}
	
	
	@FindBy(xpath = "//div[text()=\" Name is required \"]")
	private WebElement nameError;
	
	@FindBy(xpath = "//div[text()=\" Email is required \"]")
	private WebElement emailError;
	
	@FindBy(xpath = "//div[text()=\" Contact is required \"]")
	private WebElement phoneError;
	
	@FindBy(xpath = "//div[text()=\" Secondary Contact is required \"]")
	private WebElement secondaryContactError;
	
	@FindBy(xpath = "//div[text()=\" Address Line 1 is required \"]")
	private WebElement Addressline1;
	
	@FindBy(xpath = "//div[text()=\" Address Line 2 is required \"]")
	private WebElement Addressline2;
	
	@FindBy(xpath = "//div[text()=\" Country is required \"]")
	private WebElement countryError;
	
	@FindBy(xpath = "//div[text()=\" State is required \"]")
	private WebElement stateError;
	
	@FindBy(xpath = "//div[text()=\" City is required \"]")
	private WebElement cityError;
	
	@FindBy(xpath ="//div[text()=\" Zip Code is required \"]")
	private WebElement zipcodeError;
	
	@FindBy(xpath = "//div[text()=\" Branch is required \"]")
	private WebElement brancError;
	
	@FindBy(xpath = "//div[text()=\" Role is required \"]")
	private WebElement roleError;
	
	@FindBy(xpath = "//div[text()=\" Reporting To is required \"]")
	private	WebElement reportingtoError;
	
	@FindBy(xpath = "//div[text()=\" Employment Type is required \"]")
	private	WebElement employementtypeError;
	
	@FindBy(xpath = "//div[text()=\" Date Of Join is required \"]")
	private	WebElement dateOfJoinError;
	
	@FindBy(xpath = "(//div[text()=\" Document Type is required \"])[1]")
	private	WebElement documentTypeError;
	
	@FindBy(xpath = "(//div[text()=\" Document Type is required \"])[2]")
	private	WebElement documentTypeError2;
	
	@FindBy(xpath = "//div[text()=\" Expiry Date is required \"]")
	private	WebElement expireTypeError;
	
	public String getNameError() {
		String namewarning = nameError.getText();
		return namewarning;
	}
	
	public String getEmailError() {
		String emailwarning = emailError.getText();
		return emailwarning;
	}
	
	public String getphoneError() {
		String phonewarning=phoneError.getText();
		return phonewarning;
	}
	
	public String getSeconderyphoneError() {
		String seconderyphoneError = secondaryContactError.getText();
		return seconderyphoneError;
	}
	
	public String getAddressline1() {
		String Addressline1Warning = Addressline1.getText();
		return Addressline1Warning;
	}
	
	public String getAddressline2() {
		String Addressline2Warning= Addressline2.getText();
		return Addressline2Warning;
	}
	
	public String getcountryError() {
		String countryErrorwarning = countryError.getText();
		return countryErrorwarning;
	}
	
	public String getstateError() {
		String stateErrorwarning = stateError.getText();
		return stateErrorwarning;
	}
	
	public String getcityError() {
		String cityErrorWarning = cityError.getText();
		return cityErrorWarning;
	}
	
	public String getzipcodeError() {
		String zipcodeErrorwarning = zipcodeError.getText();
		return zipcodeErrorwarning;
	}
	
	public String getbrancErrorError() {
		String brancErrorwarning = brancError.getText();
		return brancErrorwarning;
	}
	
	public String getroleError() {
		String roleErrorwarning = roleError.getText();
		return roleErrorwarning;
	}
	
	public String getreportingtoError() {
		String reportingtoErrorwarning = reportingtoError.getText();
		return reportingtoErrorwarning;
	}
	
	public String getemployementtypeError() {
		String employementtypeErrorwarning = employementtypeError.getText();
		return employementtypeErrorwarning;
	}

	public String getdateOfJoinError() {
		String dateOfJoinErrorwarning = dateOfJoinError.getText();
		return dateOfJoinErrorwarning;
	}
	
	public String getdocumentTypeError1() {
		String documentTypeErrorwarning = documentTypeError.getText();
		return documentTypeErrorwarning;
	}
	
	public String getdocumentTypeError2() {
		String documentTypeError2warning = documentTypeError2.getText();
		return documentTypeError2warning;
	}
	
	public String getexpireTypeError() {
		String expireTypeErrorwarning = expireTypeError.getText();
		return expireTypeErrorwarning;
	}

}
