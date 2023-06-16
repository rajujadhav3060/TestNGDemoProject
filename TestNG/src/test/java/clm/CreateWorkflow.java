package clm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateWorkflow {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:test1:aloha@123@0887-sharepoint/Launch.aspx#/worktodo");
		
		driver.findElement(By.xpath("//div[@id='divRoleSelector']")).click();

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-sm medium-color exportButton newUI-add-button']")).click();
		
		
		
		driver.findElement(By.xpath("(//div[@class='pull-left'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
	}

}
