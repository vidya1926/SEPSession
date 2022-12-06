package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.CommonClass;

public class ViewLeadPage extends CommonClass {

	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	

	public ViewLeadPage verifyFirstName() {
		System.out.println("Verified FirstName");
		return this;

	}

	// edit
	// duplicate/
	// delete
}
