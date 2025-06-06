package pomPackage;

import java.io.IOException;

public class AddToCartTC extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		// 19/5/25
		
		BaseTest bt = new BaseTest();
		bt.browserSetup();

		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		FLib flib = new FLib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		String pwd = flib.readExcelData(VALIDCREDS, 1, 1,EXCEL_PATH);
		
		// Create the object of LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(email, pwd);
		
		
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
			System.out.println("Product Is Added To Cart.");
		}
		else
		{
			System.out.println("Product Is Not Added To Cart.s");
		}
		
		


	}

}
