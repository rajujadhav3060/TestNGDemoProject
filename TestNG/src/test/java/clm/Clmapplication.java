//package clm;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//@Test
//
//public class Clmapplication 
//static WebDriver driver;
//{
//
//	public static void click_admin()
//	  {
//		
//			driver = new ChromeDriver();
//		  driver.findElement(By.xpath("//div[@class=\"dropdownrole\"]")).click();
//	  	
//			
//			driver.findElement(By.xpath("//span[text()='Admin']")).click();
//			
//			String title1 = driver.getTitle();
//			
//			System.out.println("The current title is: "+title1);
//			
//			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//		
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//		  
//			js.executeScript("window.scrollBy(0,350)", "");
//				
//				driver.findElement(By.xpath("//span[text()='Metadata']")).click();
//				String title2 = driver.getTitle();
//				
//				System.out.println("The current title is: "+title2);
//				
//				driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//				
//				
//				driver.findElement(By.xpath("//button[@class='btn btn-sm medium-color exportButton newUI-add-button']")).click();
//				
//				js.executeScript("window.scrollBy(100,0)", "");
//				driver.quit();
//			
//	  }
//}
