package clm;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcel1 {
	WebDriver driver;

	public static void main(String[] args) throws IOException, Exception {
		WebDriver driver;
//Path of the excel file
		FileInputStream fs = new FileInputStream("D:\\URLS\\pagelinks.xlsx");
//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Row row1 = sheet.getRow(1);
		org.apache.poi.ss.usermodel.Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		Row row2 = sheet.getRow(1);
		org.apache.poi.ss.usermodel.Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(2).getCell(0));
		Row row3 = sheet.getRow(1);
		org.apache.poi.ss.usermodel.Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(3).getCell(0));

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum(); // get all rows into the sheet
      
			for (int i = 0; i <= rowCount; i++) // iterate all rows which is present in each cell
		{

			int cellcount = sheet.getRow(i).getLastCellNum(); // get cell count in row
			 
			for (int j = 0; j < cellcount; j++)
			{
				
			//	System.out.println(sheet.getRow(i).getCell(j).getStringCellValue() + ",");
				
				String href = sheet.getRow(i).getCell(j).getStringCellValue();
				
				
				
				ArrayList<String> al = new ArrayList();
				
				al.add(href);
				
				System.out.println(al);
				
				for(String a:al)
				{
					driver.get(a);
				
				
//				driver.get(href.toString());
				
				driver.navigate().refresh();
				
				driver.manage().window().maximize();
				
		//		driver.findElement(By.xpath("(//span[text()='Contract Ops'])[1]")).click();
//				
//				Thread.sleep(250);
//
//				driver.findElement(By.xpath("//span[text()='Admin']")).click();
//
//				String title1 = driver.getTitle();
//
//				System.out.println("The current title is: " + title1);
//
//				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//
//				js.executeScript("window.scrollBy(0,500)", "");
//
//				driver.findElement(By.xpath("//span[text()='Metadata']")).click();
//				
//				String title2 = driver.getTitle();
//
//				System.out.println("The current title is: " + title2);
//
//				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//
//				js.executeScript("window.scrollBy(100,0)", "");
//				
//				driver.findElement(By.xpath("//button[@class='btn btn-sm medium-color exportButton newUI-add-button']")).click();
//						
			//	driver.quit();
						
			}
		}
	}
	}
}

		

	
	
	
	
	
	
	
	
	
	
	
	
	
//			public static void click_admin()
//		  {
//			WebDriver driver;
//				
//			  driver.findElement(By.xpath("//div[@class=\"dropdownrole\"]")).click();
//		  	
//				
//				driver.findElement(By.xpath("//span[text()='Admin']")).click();
//				
//				String title1 = driver.getTitle();
//				
//				System.out.println("The current title is: "+title1);
//				
//				driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//			
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//			  
//				js.executeScript("window.scrollBy(0,350)", "");
//					
//					driver.findElement(By.xpath("//span[text()='Metadata']")).click();
//					String title2 = driver.getTitle();
//					
//					System.out.println("The current title is: "+title2);
//					
//					driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//					
//					
//					driver.findElement(By.xpath("//button[@class='btn btn-sm medium-color exportButton newUI-add-button']")).click();
//					
//					js.executeScript("window.scrollBy(100,0)", "");
//					driver.quit();
//		  }

