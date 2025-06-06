package testNGAnnotation2;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGAnnotation2.MyListener.class)
public class BuyProductTC extends BaseTest {

	@Test
	public  void buyProductTC_002() throws IOException, InterruptedException 
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
		
		scp.getCheckboxForSmartPhone().click();
		
		scp.getTermsOfServicecheckbox().click();
		
		scp.getCheckoutButton().click();
		
		FLib flib = new FLib();
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
