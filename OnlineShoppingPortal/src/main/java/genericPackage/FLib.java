package genericPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FLib 
{

	public String readExcelData(String excelPath,String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath); // To specify the path of ExcelFile
		
		Workbook wb = WorkbookFactory.create(fis); // To make the file to read
		
		Sheet sheet = wb.getSheet(sheetName); // To get into the sheet
		
		Row row = sheet.getRow(rowNo); // To get into the Row
		
		Cell cell = row.getCell(cellNo); // To get into the Cell
		
		String data = cell.toString(); // To Fetch the data from the cell
		
		return data; // to return fetch data back to the calling method

	}
	
	// for Numeric value we perform method overload
	public String readExcelData(String sheetName,int rowNo,int cellNo,String excelPath) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNo);
		
		Cell cell = row.getCell(cellNo);
		
		double numValue = cell.getNumericCellValue();
		 
		long numValue1 = (long)numValue;
		 
		String data = String.valueOf(numValue1);
		
		return data;

	}
	
	
	// To read data from properties file
	public String readPropertiesData(String propertiesPath,String key) throws IOException 
	{
        FileInputStream fis = new FileInputStream(propertiesPath); // To specify the path of Properties File
		 
		 Properties prop = new Properties(); // Creating Object of Properties class to access NSMs 
		 
		 prop.load(fis); // To make the File Ready to read
		 
		 String data = prop.getProperty(key); //To Fetch the data assigned to the key
		
		return data; // to return fetch data back to the calling method
	}
	
	// To return last row number
		public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis1 = new FileInputStream(excelPath);
			
			Workbook wb1 = WorkbookFactory.create(fis1); // create means to load file
			
			Sheet sheet1 = wb1.getSheet(sheetName);
			
			// getLastRowNum gives last row count and it counts from 0 .
			int rc = sheet1.getLastRowNum();
			
			return rc;
		}
}
