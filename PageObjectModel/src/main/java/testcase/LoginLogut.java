package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.CommonClass;
import pages.LoginPage;

public class LoginLogut extends CommonClass{
	
	@BeforeTest
	public void setFile() {
		
		testName="Login Testcase";
		testDesc="Login with neg Credentials";
		author="Jinduja";
		category="Regression";
	}
	
	@Test
	public void runLogout() throws IOException {
		//LoginPage lp =new LoginPage(driver);
	//	lp.enterUsername()
		new LoginPage(driver)
		.enterinUsername()
		.enterPassword()
		.clickinLogin()
		.verifyError();
		
		}
	
	

}
