package automationFramework;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.ArrayList;

public class DoubleTab {
	
	public static WebDriver driver;
	@Test
	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver","C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.Google.com");
		// wait of 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Keys.Chord string
		//String clickl = Keys.chord(Keys.CONTROL, Keys.ENTER);
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		// open the link in new tab, Keys.Chord string passed to sendKeys
		driver.findElement(By.linkText("https://www.yahoo.com/")).sendKeys(selectLinkOpeninNewTab);
		Thread.sleep(1000);
		// hold all window handles in array list
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		// switch to new tab
		driver.switchTo().window(newTb.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
		// switch to parent window
		driver.switchTo().window(newTb.get(0));
		System.out.println("Page title of parent window: " + driver.getTitle());
		driver.quit();
	}

	@Test
	public void singleTab() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://www.Google.com");

		String clickl = Keys.chord(Keys.CONTROL, Keys.ENTER);

		//driver.sendKeys(clickl);
		Thread.sleep(1000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		// switch to new tab
		driver.switchTo().window(newTb.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
		// switch to parent window
		driver.switchTo().window(newTb.get(0));
		System.out.println("Page title of parent window: " + driver.getTitle());
		driver.quit();

	}
	
	@Test
	public void testDemo()
	{
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	            
	    String baseUrl = "http://www.google.co.uk/";
	    driver.get(baseUrl);
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    driver.get("https://www.facebook.com");
	    
	    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
	    driver.get("https://www.news.google.com");
	}
	@Test
	public void testDemo1()
	{
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);

		driver.get("www.Url1.com");     
		//  below code will open Tab for you as well as switch the control to new Tab
		((SafariDriver) driver.switchTo()).newWindow(WindowType.TAB);

		// below code will navigate you to your desirable Url 
		driver.get("www.Url2.com");
	}
	@Test
	public void testDemoPractice()
	{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.Google.com");
	
	driver.findElement(By.xpath(""));
	
	WebDriver driver1 = new ChromeDriver();
	
	driver1.get("https://www.yahoo.com");
	
	driver1.quit();
	
	driver1.close();
	
	}
}
































