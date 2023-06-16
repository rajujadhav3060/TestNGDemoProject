package clm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://Deepak.kabra:%40Aloha%23DK123@clmvs2.clmmatrix.com/");
		
		Select  drpdwn = new Select(driver.findElement(By.xpath("//button[text()='More']")));
		
		drpdwn.selectByIndex(1);

	}

}
