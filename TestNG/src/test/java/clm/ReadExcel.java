package clm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\URLS\\pagelinks.xlsx"); // create object class to open .xlsx file

		FileInputStream inputstream = new FileInputStream(file); // create an object to read the excel file

		XSSFWorkbook workbook = new XSSFWorkbook("inputstream");// creating workbook instance that refers to .xls file

		XSSFSheet sheet = workbook.getSheet("pagelinks"); // creating an sheet object

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum(); // get all rows into the sheet

		for (int i = 0; i <= rowCount; i++) // iterate all rows which is present in each cell
		{

			int cellcount = sheet.getRow(i).getLastCellNum(); // get cell count in row

			System.out.println("Row " + i + "is:"); // iterate over each cell to print its value

			for (int j = 0; j < cellcount; j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue() + ",");
			}
			System.out.println();

		}

	}

}
