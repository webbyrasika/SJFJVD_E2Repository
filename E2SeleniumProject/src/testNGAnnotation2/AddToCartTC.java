package testNGAnnotation2;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNGAnnotation2.MyListener.class)
public class AddToCartTC extends BaseTest {

	@Test
	public void addToCartTC_001() throws IOException, InterruptedException
	{	
		
		WelcomePage wp = new WelcomePage(driver);
			
		wp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhone().click();
		
		CellPhonesPage cp = new CellPhonesPage(driver);
		cp.getSmartPhoneAddtoCart().click();
		
		Thread.sleep(1000);
		
		wp.getShoppingCartLink().click();
		
		ShoopingCartPage scp = new ShoopingCartPage(driver);
		
		if(scp.getSmartPhoneCartItem().isDisplayed())
		{
			//System.out.println("Product Is Added To Cart.");
			Reporter.log("Product Is Added To Cart.", true);
		}
		else
		{
			//System.out.println("Product Is Not Added To Cart.s");
			Reporter.log("Product Is Not Added To Cart.", true);
		}

	}

}

