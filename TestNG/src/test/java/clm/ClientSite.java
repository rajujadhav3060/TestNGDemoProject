package clm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClientSite {
  @Test
	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		URL url = new URL("https://mayuresh.gunjal:MG%23CLM%40135@clmvs3.clmmatrix.com");

		driver.get(url.toString());

		driver.manage().window().maximize();

		driver.navigate().refresh();
		
		System.out.println("The current Title is:  "+driver.getTitle());
		
    	driver.findElement(By.xpath("//div[@class=\"dropdownrole\"]")).click();
    	
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("//svg-icon[@ng-reflect-name=\"Metadata\"]")).click();
		String title2 = driver.getTitle();
		
		System.out.println("The current title is: "+title2);
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-sm medium-color exportButton newUI-add-button']")).click();
		
		js.executeScript("window.scrollBy(100,0)", "");
		
		
		
		
		}

}




