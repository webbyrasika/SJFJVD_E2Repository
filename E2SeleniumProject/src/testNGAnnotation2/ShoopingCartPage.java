package testNGAnnotation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoopingCartPage 
{

	//19/5/25
	
	//Declaration
	@FindBy(xpath = "//input[@name='removefromcart']/../..//img[@alt='Picture of Smartphone']") private WebElement  smartPhoneCartItem;
	//20/5/25
	@FindBy(xpath = "//a[text()='Smartphone' and @class='product-name']/../..//input[@name='removefromcart']") private WebElement checkboxForSmartPhone;
	@FindBy(name = "updatecart") private WebElement updateShoppingCartButton;
	@FindBy(id = "termsofservice") private WebElement termsOfServicecheckbox;
	@FindBy(id =  "checkout") private WebElement checkoutButton;
	
	//Initialization
	public ShoopingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}

	public WebElement getCheckboxForSmartPhone() {
		return checkboxForSmartPhone;
	}

	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}

	public WebElement getTermsOfServicecheckbox() {
		return termsOfServicecheckbox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}
	
	
	
}
