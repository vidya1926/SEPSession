package steps;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead {
		  public ChromeDriver driver;
	  
	  @Given("Open the Chrome browser-maximize the window and set the timeout")
	  public void open_the_chrome_browser_maximize_the_window_and_set_the_timeout()
	  { driver = new ChromeDriver(); driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); }
	  
	  @And("Load the application url {string}") public void getURL(String url) {
	  driver.get(url); }
	  
	  @Given("Enter username as {string}") 
	  public void enterUserName(String userID)
	  { driver.findElement(By.id("username")).sendKeys(userID); }
	  
	  @And("Enter password as {string}") public void enterPassword(String password)
	  { driver.findElement(By.id("password")).sendKeys(password); }
	  
	  @And("Click the Login Button") public void loginButton() { WebElement
	  elementLogin = driver.findElement(By.className("decorativeSubmit"));
	  elementLogin.click(); }
	  
	  @And("Click the CRMSFA Button")
	  
	  public void crmClick() {
	  
	  WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	  elementCRMSFA.click();
	  
	  }
	  
	  @And("Click the Create Lead") public void createLead() {
	  
	  WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	  elementLeads.click();
	  
	  WebElement elementCreateLead =
	  driver.findElement(By.linkText("Create Lead")); elementCreateLead.click();
	  
	  }
	  
	  @And("Enter the mandatorydata")
	  
	  @DataTableType
	  public void passDetails(Map<String,String> entry) {
	       ExcelConfiguration config=new ExcelConfiguration.ExcelConfigurationBuilder()
	    		   .setFileLocation(entry)
	    		   .setFileName(null)
	    		   .setIndex(0)
	    		   .setSheetName(null);
	    		   
	  System.out.println();
	  }
	  
	  @When("Submit button is Clicked")
	  
	  public void clickSubmit() {
	  
	  driver.findElement(By.name("submitButton")).click();
	  
	  }
	  
	  @Then("Verify the lead is created successfully")
	  
	  public void verifySubmit() {
	  
	  String cname1 =
	  driver.findElement(By.id("viewLead_companyName_sp")).getText();
	  System.out.println(cname1);
	  
	  String fname1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	  System.out.println(fname1);
	  
	  String lname1 = driver.findElement(By.id("viewLead_lastName_sp")).getText();
	  System.out.println(lname1);
	  
	  }
	 
}
