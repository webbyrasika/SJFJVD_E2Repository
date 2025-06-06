package testNGAnnotation2;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGAnnotation2.MyListener.class)
public class RemoveProductFromCartTC extends BaseTest {

	@Test
	public  void removeProductFromCartTC_003() throws IOException, InterruptedException 
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
		
		// To remove items from cart 
		// click on smartPhone checkbox
		scp.getCheckboxForSmartPhone().click();
		
		// click on update shopping cart button
		scp.getUpdateShoppingCartButton().click();

	}

}
