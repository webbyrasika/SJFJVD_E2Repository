package testNGAnnotation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CheckoutPage 
{
	//20/5/25
	
	//Declaration
	
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement BillingAddressCountryDD;
	@FindBy(id = "billing-address-select") private WebElement billingAddressOldAddressDD;
	@FindBy(id = "BillingNewAddress_City") private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1" ) private WebElement address1TB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement pincodeTB;
	@FindBy(id = "BillingNewAddress_PhoneNumber" ) private WebElement phoneNumberTB;
	@FindBy(xpath  = "//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton;
	@FindBy(xpath  = "//input[@onclick='Shipping.save()']") private WebElement shippingAddressContinueButton;
	@FindBy(xpath  = "//input[@onclick='ShippingMethod.save()']") private WebElement shippingMethodContinueButton;
	@FindBy(xpath  = "//input[@onclick='PaymentMethod.save()']") private WebElement paymentMethodContinueButton;
	@FindBy(xpath  = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoContinueButton;
	@FindBy(xpath  = "//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderContinueButton;
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']") private WebElement orderConfirmMessage;
	
	//Initialization
	
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
	
	public WebElement getBillingAddressCountryDD() {
		return BillingAddressCountryDD;
	}

	public WebElement getBillingAddressOldAddressDD() {
		return billingAddressOldAddressDD;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

	public WebElement getPhoneNumberTB() {
		return phoneNumberTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderContinueButton() {
		return confirmOrderContinueButton;
	}

	public WebElement getOrderConfirmMessage() {
		return orderConfirmMessage;
	}
	
	//Operational Method /Business Logic
	
	public void buyProductMethod(String city,String address1, String pincode,String phoneNo) throws InterruptedException 
	{
		WorkLib wl = new WorkLib();
		
		if(BillingAddressCountryDD.isDisplayed())
		{
			wl.selectByVisibleText(BillingAddressCountryDD, "India");
		}
		else
		{
			wl.selectByVisibleText(billingAddressOldAddressDD, "New Address");
			//wl.selectByVisibleText(BillingAddressCountryDD, "India");
		}
		
		wl.selectByVisibleText(BillingAddressCountryDD, "India");
		cityTB.sendKeys(city);
		address1TB.sendKeys(address1);
		pincodeTB.sendKeys(pincode);
		phoneNumberTB.sendKeys(phoneNo);
		
		billingAddressContinueButton.click();
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInfoContinueButton.click();
		confirmOrderContinueButton.click();
		
		Thread.sleep(1000);
		if(orderConfirmMessage.isDisplayed())
		{
			//System.out.println("Order is Placed Successfully !!! ");
			Reporter.log("Order is Placed Successfully !!!", true);
		}
		else
		{
			//System.out.println("Order is Not Placed Successfully !!!");
			Reporter.log("Order is Not Placed Successfully !!!", true);
		}
	}	
	
}
