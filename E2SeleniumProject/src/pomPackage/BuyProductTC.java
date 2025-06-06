package pomPackage;

import java.io.IOException;

public class BuyProductTC extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// 20/5/25
		
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
		
		scp.getCheckboxForSmartPhone().click();
		
		scp.getTermsOfServicecheckbox().click();
		
		scp.getCheckoutButton().click();
		
		String city = flib.readExcelData(EXCEL_PATH, BPD, 1, 0);
		String address1 = flib.readExcelData(EXCEL_PATH, BPD, 1, 1);
		
		//call overloadMethod  readExcelData(String sheetName,int rowNo,int cellNo,String excelPath)
		String pincode = flib.readExcelData(BPD, 1, 2,EXCEL_PATH);
		String phone = flib.readExcelData(BPD, 1, 3, EXCEL_PATH);
		
		WorkLib wl = new WorkLib();
		int randomNo = wl.randomNumber();
		
		String phoneNo = phone + randomNo;
		
		CheckoutPage cop = new CheckoutPage(driver);
		cop.buyProductMethod(city, address1, pincode, phoneNo);
		
		
		

	}

}
