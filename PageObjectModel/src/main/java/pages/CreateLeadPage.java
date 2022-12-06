package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.CommonClass;

public class CreateLeadPage extends CommonClass {

	public CreateLeadPage(RemoteWebDriver driver) {		
		this.driver=driver;
			}
	
	
	public CreateLeadPage enterCompanyname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}

	public CreateLeadPage enterfirstName(String fname) {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}

	public CreateLeadPage enterLastname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}

	public ViewLeadPage clickCreate() {

		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
