package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.CommonClass;

public class LeadsPage extends CommonClass {
	
	public LeadsPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	

	public CreateLeadPage clickCreaLeadform() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}

	public FindLeadsPage clickFindLead() {

		return new FindLeadsPage();

	}

	public void clickMergeLead() {

	}

}
