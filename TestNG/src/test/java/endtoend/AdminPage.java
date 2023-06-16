package endtoend;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Test
public class AdminPage extends BaseClass{
	
    @Test	
    public void adminPage()
	{
		driver.findElement(By.xpath("//span[@id='ctl00_spnRoleSelector']")).click();
		
		driver.findElement(By.xpath("//span[@onclick=\"RoleSelectorChange('Admin');\"]")).click();
		
		
		
		
	}
		
	
	
}
