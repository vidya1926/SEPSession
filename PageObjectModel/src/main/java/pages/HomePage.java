package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.CommonClass;

public class HomePage extends CommonClass {
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public HomePage verifyPage() {
		System.out.println(driver.getTitle());
		return this;
	}
	
	
	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}

}
