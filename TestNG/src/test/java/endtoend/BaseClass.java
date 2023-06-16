package endtoend;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class BaseClass 
{
	public static WebDriver driver;
	public static Properties prop;
	@Test
	public void openBrowser() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(15,  TimeUnit.SECONDS);
		
		driver.get("https://Deepak.kabra:DK%40Aloha%23321@clmvs14.clmmatrix.com/");
		
		Thread.sleep(10000);
		
		driver.navigate().refresh();
		
		driver.navigate().refresh();
		
		Thread.sleep(30000);	

		driver.findElement(By.xpath("//span[@id='ctl00_spnRoleSelector']")).click();
		
		driver.findElement(By.xpath("//span[@onclick=\"RoleSelectorChange('Admin');\"]")).click();
	}
	
 
	
  
	
	
	

}
