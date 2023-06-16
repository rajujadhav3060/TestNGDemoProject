package clm;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class clm_regression
{
	WebDriver driver;
   @BeforeMethod
  public void login() throws IOException
  {
	  WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		URL url = new URL("https://Deepak.kabra:DK%40Aloha%23321@clmvs3.clmmatrix.com/");

		driver.get(url.toString());

		driver.manage().window().maximize();

		driver.navigate().refresh();
		
		System.out.println("The current Title is:  "+driver.getTitle());
		
  }
  @Test
  public void click_admin() throws InterruptedException
  
  {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	  Thread.sleep(10000);
	  
	  driver.findElement(By.id("divRoleSelector")).click();
  	
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		String title1 = driver.getTitle();
		
		System.out.println("The current title is: "+title1);
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
	  
		js.executeScript("window.scrollBy(0,350)", "");
			
			driver.findElement(By.xpath("//span[text()='Metadata']")).click();
			
			String title2 = driver.getTitle();
			
			System.out.println("The current title is: "+title2);
			
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("//button[@class='btn btn-sm medium-color exportButton newUI-add-button']")).click();
			
			js.executeScript("window.scrollBy(100,0)", "");
			
			driver.quit();
		
  }

  
	  
 
}

