package com.firstbox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateshipmentPage {

	WebDriver driver;
	
	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[1]")
	private WebElement ShopviaDropdown;
	
	@FindBy(xpath = "//span[text( )='Road Freight']")
	private WebElement RoadFreight;
	
	@FindBy(xpath = "(//span[@class='p-dropdown-trigger-icon pi pi-chevron-down'])[2]")
	private WebElement ShippingfromDropdown;
	
	@FindBy(xpath ="(//li[@aria-label='Self drop off at FirstBox Terminal'])[1]")
	private WebElement FirstboxterminalOption;
	
	@FindBy(xpath = "(//input[@id=\"float-input\"])[1]")
	private WebElement firstnameField;
	
	@FindBy(xpath = "(//input[@id=\"float-input\"])[2]")
	private WebElement secondnameField;
	
	@FindBy(xpath = "(//input[@id=\"float-input\"])[3]")
	private WebElement companynamefield;
	
	@FindBy(xpath = "(//input[@id=\"float-input\"])[4]")
	private WebElement emailField;
	
	@FindBy(xpath = "(//input[@id=\"float-input\"])[5]")
	private WebElement phoneField;
	
	@FindBy(xpath = "(//div[@class=\"p-dropdown-trigger\"])[3]")
	private WebElement cityDropdown;
	
	@FindBy(xpath = "//span[text()='Surathkal']")
	private WebElement surathkal;
	
	@FindBy(xpath = "//div[@class='p-dropdown p-component p-dropdown-clearable']//div[@aria-label='dropdown trigger']")
	private WebElement selfdropBranchDropdown;
	
	@FindBy(xpath = "//span[text()='Mangalore']")
	private WebElement mangaloreoption;
	
	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[5]")
	private WebElement shippingToDropdown;
	
	@FindBy(xpath = "//span[text()=\"Self collection from FirstBox Terminal\"]")
	private WebElement selfCollectionfromfirstbox;
	
	@FindBy(xpath = "(//button[text()=\" Address Book \"])[2]")
	private WebElement addressBook;
	
	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[9]")
	private WebElement SelectContactdropdown;
	
	@FindBy(xpath = "//span[text()=\"Mark in\"]")
	private WebElement markOption;
	
	@FindBy(xpath = "//button[text()=\" Prefill \"]")
	private WebElement prefillButton;
	
	@FindBy(xpath = "(//span[@class='p-dropdown-trigger-icon pi pi-chevron-down'])[6]")
	private WebElement selfCollectiondropdown;
	
	@FindBy(xpath = "//li[@aria-label='Bangalore']")
	private WebElement Bangaloreoption;
	
	@FindBy(className = "p-radiobutton-box")
	private WebElement shippingHandlingRequiremrntbutton;
	
	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[7]")
	private WebElement CargoTypedropdown;	
	
	public CreateshipmentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void CreateFullContainerShipment() {
		ShopviaDropdown.click();
		RoadFreight.click();
		ShippingfromDropdown.click();
		FirstboxterminalOption.click();
	}
	
	
	
	public void clickShopviaDropdown() {
		ShopviaDropdown.click();
	}
	
	public void clickRoadFreightoption() {
		RoadFreight.click();
	}
	
	public void clickShippingfromDropdown() {
		ShippingfromDropdown.click();
	}
	
	public void clickFirstboxterminalOption() {
		FirstboxterminalOption.click();
	}
	
	public void Enterfirstname(String Fname) {
		firstnameField.sendKeys(Fname);
	}
	
	public void enterSecondName(String Sname) {
		secondnameField.sendKeys(Sname);
	}
	
	public void Entercompanyname(String Cname) {
		companynamefield.sendKeys(Cname);
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterphoneField(String phone) {
		phoneField.sendKeys(phone);
	}
	
	public void clickcityDropdown() {
		cityDropdown.click();
	}
	
	public void clicksurathkalinthecityDropdown() {
		surathkal.click();
	}
	
	public void clickselfdropBranchDropdown() {
		selfdropBranchDropdown.click();
	}
	
	public void clickmangaloreoption() {
		mangaloreoption.click();
	}
	
	public void clickshippingToDropdown() {
		shippingToDropdown.click();
	}
	
	public void clickonselfCollectionfromfirstbox() {
		selfCollectionfromfirstbox.click();
	}
	
	public void clickonaddressBook() {
		addressBook.click();
	}
	
	public void ClickonSelectContactdropdown() {
		SelectContactdropdown.click();
	}
	
	public void clickonMark() {
		markOption.click();
	}
	
	public void ClickonprefillButton() {
		prefillButton.click();
	}
	
	public void clickonselfCollectiondropdown() {
		selfCollectiondropdown.click();
	}
	
	public void SelectBangaloreinselfcollection() {
		Bangaloreoption.click();
	}
	
	public void clickonshippingHandlingRequiremrntbutton() {
		shippingHandlingRequiremrntbutton.click();
	}
	
	public void clickonCargoTypedropdown() {
		CargoTypedropdown.click();
	}
	
	@FindBy(xpath = "//span[text()= \"Full Container Load\"]" )
	private WebElement fullcontainerOption;
	
	@FindBy(xpath = "(//textarea[contains(@class,'p-inputtextarea p-inputtext')])[1]")
	private WebElement Commodities;
	
	@FindBy(xpath ="(//div[@aria-label='dropdown trigger'])[8]" )
	private WebElement ContainerTypedropdown;
	
	@FindBy(xpath ="//span[text()=\"20' Standard Dry Container\"]" )
	private WebElement containerType;
	
	@FindBy(xpath = "(//div[@class ='col-md-2 mb-3']//input)[1]")
	private WebElement containercount;
	
	@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[2]")
	private WebElement netWeightbutton;
	
	@FindBy(xpath = "//p-inputnumber[@formcontrolname='weight']//input[@class='p-inputtext p-component p-element p-inputnumber-input p-filled']")
	private WebElement weightfield;
	
	@FindBy(xpath = "//input[@class='p-inputtext p-component p-element p-inputnumber-input']")
	private WebElement weightfield2;
	
	@FindBy(xpath = "(//div[@aria-label='dropdown trigger'])[9]" )
	private WebElement weightunit;
	
	@FindBy(xpath = "//span[text()=\"kg\"]")
	private WebElement KGunit;
	
	@FindBy(xpath = "(//span[@class=\"p-inputnumber p-component\"])[2]//input")
	private WebElement Price;
	
	@FindBy(xpath = "(//textarea[contains(@class,'p-inputtextarea')])[2]")
	private WebElement additionalnote;
	
	@FindBy(xpath = "//span[text()=\"Select Payment Option\"]/following-sibling::div[1]" )
	private WebElement paymentoptiondropdown;
	
	@FindBy(xpath = "//span[text()=\"Cash\"]" )
	private WebElement cashoption;
	
	@FindBy(xpath = "//span[text()=\"Select Payment Option\"]/following-sibling::div")
	private WebElement paymentStatusdropdown;
	
	@FindBy(xpath ="//span[text()=\"Paid\"]" )
	private WebElement paidOption;
	
	@FindBy(xpath = "//button[text()=\" Ready for shipment \"]")
	private WebElement ReadyforShipmentbutton;
	
	public void Clickonfullcontainer() {
		fullcontainerOption.click();
	}
	public void enterCommodities(String commodities) {
		Commodities.sendKeys(commodities);	
	}
	
	public void clickonContainerTypedropdown() {
		ContainerTypedropdown.click();
	}
	
	public void selectcontainerType() {
		containerType.click();
	}
	
	public void entercontainercount(String count) {
		containercount.clear();
		containercount.sendKeys(count);
	}
	
	public void clickonNetWeightbutton() {
		 netWeightbutton.click();
	}
	
	public void enterthetotalweight(String weight) {
		weightfield.clear();
		String totalWeight= weight;
		weightfield2.sendKeys(totalWeight);
	}
	
	public void clickonweightunit() {
		weightunit.click();
	}

	public void  clickonKG() {
		KGunit.click();
	}
	
	public void enterPrice(String prices) {
		Price.clear();
		Price.sendKeys(prices);
	}
	
	public void enteradditionalnote( String note) {
		additionalnote.sendKeys(note);
	}
	
	public void clickonpaymentoptiondropdown() {
		paymentoptiondropdown.click();
	}
	
	public void clickcashoption() {
		cashoption.click();
	}
	
	public void clickonpaymentStatusdropdown() {
		paymentStatusdropdown.click();
	}
	
	public void clickonpaidOption() {
		paidOption.click();
	}
	
	public void clickonReadyforShipmentbutton() {
		ReadyforShipmentbutton.click();
	}
	
	//Loose Cargo Shipment
	
	@FindBy(xpath = "//span[text()=\"Loose Cargo\"]" )
	private WebElement looseCargoOption;
	
	@FindBy(xpath ="//label[text()=\"Type\"]/following-sibling::p-dropdown")
	private WebElement Type1Dropdown;
	
	@FindBy(xpath = "//span[text()=\"Bags\"]")
	private WebElement Bagsoption;
	
	@FindBy(xpath ="//label[text()=\"Count\"]/following-sibling::input")
	private WebElement CountField;
	
	@FindBy(xpath = "(//div[@class='p-radiobutton-box'])[2]")
	private WebElement KgButton;
	
	@FindBy(xpath = "(//input[@class='p-inputtext p-component p-element p-inputnumber-input p-filled'])[1]")
	private WebElement Netweightfield;
	
	@FindBy(xpath = "(//span[@class=\"p-inputnumber p-component\"]//input)[1]")
	private WebElement netfield;
	
	@FindBy(xpath ="(//input[@id='float-input'])[13]" )
	private WebElement lenghtfield;
	
	@FindBy(xpath = "//label[text()=\"Width\"]/following-sibling::input")
	private WebElement widthfield;
	
	@FindBy(xpath = "//label[text()=\"Height\"]/following-sibling::input")
	private WebElement Heightfield;
	
	@FindBy(xpath = "(//span[@class=\"p-inputnumber p-component\"])[3]/input")
	private WebElement Pricefield2;
	
	public void selectloosecargoShipment() {
		looseCargoOption.click();
	}
	
	public void clickonTypedropdown() {
		Type1Dropdown.click();
	}
	
	public void clickonBagsoption() {
		Bagsoption.click();
	}
	
	public void entertheCount(String count) {
		CountField.clear();
		CountField.sendKeys(count);
	}
	
	public void clickonKgButton() {
		KgButton.click();
	}	
		
	public void enterNetweight(String netweightt) {
		Netweightfield.clear();
		netfield.sendKeys(netweightt);	
	}
	
	public void enterlenght(String length) {
		lenghtfield.clear();
		lenghtfield.sendKeys(length);
	}
	
	public void enterwidth(String width) {
		widthfield.clear();
		widthfield.sendKeys(width);
	}
	
	public void enterheight(String height) {
		Heightfield.clear();
		Heightfield.sendKeys(height);
	}
	public void enterpricefield(String price) {
		Pricefield2.clear();
		Pricefield2.sendKeys(price);
	}
}
