package com.firstbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	@FindBy(xpath ="//span[@class=\"p-float-label mb-2\"]/input")
	private WebElement emailField;
	
	@FindBy (xpath = "//span[@class=\"p-float-label\"]/input")
	private WebElement passwordField;
	
	@FindBy (xpath = "//button[text()='Submit']")
	private WebElement submitButton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String emailText, String passwordText) {
		emailField.sendKeys(emailText);
		passwordField.sendKeys(passwordText);
		submitButton.click();
	}
	
	public LoginPage Clickonsubmitbutton() {
		submitButton.click();
		return  new LoginPage(driver);
	}
	
} 
