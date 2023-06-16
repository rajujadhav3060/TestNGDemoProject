//package clm;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.net.URL;
//
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.google.common.collect.Table.Cell;
//
//import clm_automation_login.XSSFRow;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class XmlReadData {
//	
//		public static void main (String [] args) throws IOException
//		{
//		//Path of the excel file
//		FileInputStream fs = new FileInputStream("D:\\URLS\\pagelinks.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook("pagelinks.xlsx");
//		XSSFSheet sheet = workbook.getSheet("url1");
//		int lastRowNum = sheet.getLastRowNum();
//	    int columns = sheet.getRow(0).getPhysicalNumberOfCells();
//	    Object [][]urls=new Object[lastRowNum][columns];
//		//Creating a workbook
//		
//		Row row = sheet.getRow(0);
//		org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
//		System.out.println(sheet.getRow(0).getCell(0));
//		 for(int i=1;i<=lastRowNum;i++){
//			    XSSFRow row = sheet.getRow(i);
//			    for(int j=0;j<columns;j++){
//			        XSSFCell cell = row.getCell(j);
//			        urls[i-1][j]=cell.getStringCellValue();
//	//	Row row1 = sheet.getRow(1);
//	//	org.apache.poi.ss.usermodel.Cell cell1 = row1.getCell(1);
//		//System.out.println(sheet.getRow(0).getCell(1));
//	//	Row row2 = sheet.getRow(1);
//	//	org.apache.poi.ss.usermodel.Cell cell2 = row2.getCell(1);
//		//System.out.println(sheet.getRow(1).getCell(0));
//	//	Row row3 = sheet.getRow(1);
//	//	org.apache.poi.ss.usermodel.Cell cell3 = row3.getCell(1);
//		//System.out.println(sheet.getRow(1).getCell(1));
//		//String cellval = cell.getStringCellValue();
//		//System.out.println(cellval);
//		
//		//System.out.println(row);
//		//WebDriverManager.chromedriver().setup();
//		//WebDriver driver = new ChromeDriver();
//		
//		//driver.get(row.toString());
//		//driver.getCurrentUrl();\
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		XSSFCell url = sheet.getRow(0).getCell(0);
//		String url1 = sheet.getRow(0).getCell(0).getStringCellValue();
//	    driver.get(url1);
//	    System.out.println(url1);
//		
//
//	
//	
//	        
//	       
//	    
//	    
//	}
//		 }
//
//
