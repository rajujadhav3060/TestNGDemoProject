package endtoend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class AdhocAlert extends BaseClass {

	@FindBy(xpath = "//span[normalize-space()='Contracts']")
	WebElement contract;

	@FindBy(xpath = "//div[text ()=' Calendar ']")
	WebElement selectCalendar;

	@FindBy(xpath = "//button[text ()='More']")
	WebElement More;

	@FindBy(xpath = "//span[text ()='Adhoc Alerts']")
	WebElement adhocAlert;

	@FindBy(xpath = "//select[@class='form-control ng-pristine ng-valid ng-touched']")
	WebElement selectAlert;

	public AdhocAlert() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	@Test
	public void createNewAdhocAlert()
	{
	  contract.click();
	  selectCalendar.click();
	  More.click();
	  adhocAlert.click();
	  
	  Select sl = new Select(selectAlert);
	  sl.selectByValue("0");
	}
	

}
