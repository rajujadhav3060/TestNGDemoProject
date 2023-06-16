package clm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test

public class TestNGDemo 
{

	
	@BeforeClass
	public void setup_the_chrome_browser()
	{
		System.out.println("Method in class");
	}
	
	@Test
	
	@AfterMethod
	public void open_chrome()
	{
		System.out.println("Chrome is open");
	}
	@BeforeMethod
	
	public void open_url()
	{
		System.out.println("The url is opened");
	}
	
	
	
}
