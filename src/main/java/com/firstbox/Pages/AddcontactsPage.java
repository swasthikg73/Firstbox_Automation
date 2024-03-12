package com.firstbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcontactsPage {

	public WebDriver driver;
	
	@FindBy(xpath = "//label[text()=\"First Name\"]/following-sibling::input")
	private WebElement Firstname;
	
	@FindBy(xpath = "//label[text()=\"Last Name\"]/following-sibling::input")
	private WebElement Lastname;
	
	@FindBy(xpath = "//label[text()=\"Phone\"]/following-sibling::input")
	private WebElement phone;
	
	@FindBy(xpath = "//label[text()=\"Company Name\"]/following-sibling::input")
	private WebElement companyName;
	
	@FindBy(xpath = "//label[text()=\"Email\"]/following-sibling::input")
	private WebElement emailfield;
	
	@FindBy(xpath = "//label[text()=\"Address Line 1\"]/following-sibling::input")
	private WebElement addressline1;
	
	@FindBy(xpath = "//label[text()=\"Address Line 2\"]/following-sibling::input")
	private WebElement addressline2;
	
	@FindBy(className = "p-dropdown-trigger")
	private WebElement citydropdown;
	
	@FindBy(xpath = "//span[text()=\"Mangalore\"]")
	private WebElement mangaloreoption;

	@FindBy(xpath = "//button[text()=\"Submit\"]")
	private WebElement submitbutton;
	
	@FindBy(xpath = "//button[text()=\" Cancel \"]")
	private WebElement cancelbutton;
	
public AddcontactsPage (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void enterFirstnamefield(String firstname) {
	Firstname.sendKeys(firstname);
}

public void enterlastnamefield(String lastname) {
	Lastname.sendKeys(lastname);
}

public void enterphone(String phonenum) {
	phone.sendKeys(phonenum);
}

public void entercompany(String comp) {
	companyName.sendKeys(comp);
}

public void enteremail(String email) {
	emailfield.sendKeys(email);
}

public void enteraddressline1(String add1) {
	addressline1.sendKeys(add1);
}

public void enteraddressline2(String add2) {
	addressline2.sendKeys(add2);
}

public void clickCitydropdown() {
	citydropdown.click();
}

public void clickMangalore() {
	mangaloreoption.click();
}

public void clickSubmitbutton() {
	submitbutton.click();
}

public void clickOnCancelButton() {
	cancelbutton.click();
}

@FindBy(xpath = "//div[text()=\" Firstname is required \"]")
private WebElement FirstNameError;

@FindBy(xpath = "//div[text()=\" Lastname is required \"]")
private WebElement SeconnameError;

@FindBy(xpath = "//div[text()=\" Phone is required \"]")
private WebElement phoneError;

@FindBy(xpath = "//div[text()=\" Company is required \"]")
private WebElement Companynameerror;

@FindBy(xpath = "//div[text()=\" Email is required \"]")
private WebElement emailError;

@FindBy(xpath = "//div[text()=\" Address is required \"]")
private WebElement addresserror;


public String getFirstnameerror() {
	String Fnerror=FirstNameError.getText();
	return  Fnerror;
}

public String getSecondnameerror() {
	String Snerror=SeconnameError.getText();
	return Snerror;
}

public String getPhoneError() {
	String PnError= phoneError.getText();
	return PnError;
}

public String getCompanynameerror() {
	String cError = Companynameerror.getText();
	return cError;
}

public String getemailError() {
	String eError=emailError.getText();
	return eError;
}

public String getaddresserror() {
	String addError = addresserror.getText();
	return addError;
}
}