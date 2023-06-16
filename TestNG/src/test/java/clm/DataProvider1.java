package clm;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider1
{
	WebDriver driver;
	@DataProvider(name="URLS")
	    public Object[][] readFromExcel() throws IOException {

	        XSSFWorkbook workbook = new XSSFWorkbook("D:\\new\\ExcelFile.xlsx");

	        XSSFSheet sheet = workbook.getSheet("ExcelFile");

	        int lastRowNum = sheet.getLastRowNum();
	        int columns = sheet.getRow(0).getPhysicalNumberOfCells();
	        Object [][]urls=new Object[lastRowNum][columns];

	        for(int i=1;i<=lastRowNum;i++){
	            XSSFRow row = sheet.getRow(i);
	            for(int j=0;j<columns;j++){
	                XSSFCell cell = row.getCell(j);
	                urls[i-1][j]=cell.getStringCellValue();
	            }
	            String url = sheet.getRow(i).getCell(0).getStringCellValue();
	            System.out.println(url);
	        }

	return urls;
	    }
	@Test
	 public WebDriver initializedriver() {
	    // System.setProperty("webdriver.chrome.driver","C:\\Natesh\\Automation\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	      return driver;
	 }

	    @Test(dataProvider ="URLS")
	    public void logInMethod(String url) throws Exception{
	        
	        driver.get(url);
	        
	    }

}
