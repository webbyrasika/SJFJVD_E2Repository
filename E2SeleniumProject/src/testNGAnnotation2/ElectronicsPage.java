package testNGAnnotation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage
{
	//19/5/25
	
	@FindBy(xpath = "//img[@alt ='Picture for category Camera, photo']") private WebElement camera;
	@FindBy(xpath = "//img[@alt ='Picture for category Cell phones']") private WebElement cellPhone;
	
	//@FindBy(xpath = "//img[@alt='Picture of Smartphone']") private WebElement smartPhone;
	
	public ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCamera() {
		return camera;
	}

	public WebElement getCellPhone() {
		return cellPhone;
	}

//	public WebElement getSmartPhone() {
//		return smartPhone;
//	}
	
	

}
