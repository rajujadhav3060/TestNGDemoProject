package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class datepickerdemo 
{
		@Test
		public void datepicker()
		{
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			driver.manage().deleteAllCookies();
			
			driver.get("https://phptravels.net/");
			
			driver.findElement(By.xpath("//input[@id='checkin']")).click();

			driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-justify-content-space-between uitk-date-picker-menu-pagination-container']"));
			
			driver.close();
			
			
		}
	
	
	
	
	
	
	
}
