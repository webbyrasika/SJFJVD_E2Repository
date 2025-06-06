package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage 
{
	
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']") private WebElement smartPhoneAddtoCart;
	
	public CellPhonesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSmartPhoneAddtoCart() {
		return smartPhoneAddtoCart;
	}
	
	
	

}
