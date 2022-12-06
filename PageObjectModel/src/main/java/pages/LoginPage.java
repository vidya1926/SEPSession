package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseclass.CommonClass;

public class LoginPage extends CommonClass {

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUsername() throws IOException {
		try {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		reportStep("pass","Entered the username Successfully");
		}catch(Exception e){
		reportStep("fail","Username is unsuccessfully" +e);
		}
		return this;
	}
	public LoginPage enterinUsername() throws IOException {
		try {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager12");
		reportStep("pass","Entered the username Successfully");
		}catch(Exception e){
		reportStep("fail","Username is unsuccessfully" +e);
		}
		return this;
	}

	public LoginPage enterPassword() throws IOException {
		try {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		reportStep("pass","Entered the password Successfully");

		}catch(Exception e) {
			reportStep("fail","Entered password is not Successfully");

		}
		return this;
	}

	public WelcomePage clickLogin() throws IOException {
		try {
		driver.findElement(By.className("decorativeSubmit")).click();
		reportStep("pass","Login is clicked Successfully");

		}catch(Exception e) {
			reportStep("fail","Login is not clicked Successfully");
		}
		return new WelcomePage(driver);
	}

	public LoginPage clickinLogin() throws IOException {
		try {
		driver.findElement(By.className("decorativeSubmit")).click();
		reportStep("pass","Login is clicked Successfully");

		}catch(Exception e) {
			reportStep("fail","Login is not clicked Successfully");
		}
		return this;
	}
	
	
	public LoginPage verifyError() {
		System.out.println(driver.findElement(By.id("errorDiv")).getText());
		return this;
	}
	
	
}
