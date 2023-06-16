import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test

public class AssertionTest {
	WebDriver driver;

	@Test

	public void searchContent() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://mayuresh.gunjal:MG%23CLM%40135@clmvs3.clmmatrix.com");

		driver.manage().window().maximize();

		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//span[text()='Contract Ops'])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Admin']")).click();

		Thread.sleep(3000);
		
		
		
		
		
		
		driver.quit();
		

	}

	
	
	
}

