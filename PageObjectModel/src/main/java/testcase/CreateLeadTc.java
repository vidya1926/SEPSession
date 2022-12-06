package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.CommonClass;
import pages.LoginPage;

public class CreateLeadTc extends CommonClass{
	@BeforeTest
	public void setFile() {
		filename="CreateLeadxl"; 
		sheetindex=0;
		testName="CreteLead Testcase";
		testDesc="Lead with mantatory fields";
		author="Hema";
		category="Regression";
	}
	
	@Test(dataProvider="fetchData")
	public void runLead(String cname ,String fname,String lname) throws IOException {
		LoginPage lp =new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCrm()
		.verifyPage()
		.clickLeads()
		.clickCreaLeadform()
		.enterCompanyname(cname)
		.enterfirstName(fname)
		.enterLastname(lname)
		.clickCreate()
		.verifyFirstName();
		
		
		
		
	}
	

}
