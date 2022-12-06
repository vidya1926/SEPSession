

import java.text.ParseException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class NewTask {

	public static void main(String[] args) throws ParseException, InterruptedException {		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		WebElement findElement = driver.findElement(By.xpath("//div[@class='headerTrigger  tooltip-trigger uiTooltip']//span[text()='Global Actions']"));
		
		driver.executeScript("arguments[0].click();", findElement);
		
		/*
		 * driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		 * driver.findElement(By.xpath("//button[text()='View All']")).click();
		 * driver.findElement(By.xpath("//p[text()='Sales']")).click(); WebElement opper
		 * = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		 * driver.executeScript("arguments[0].click();",opper );
		 * driver.findElement(By.xpath("//div[text()='New']")).click();
		 * driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Testing");
		 * //driver.findElement(By.
		 * xpath("(//input[@class='slds-combobox__input slds-input'])[1]")).sendKeys(
		 * "princila",Keys.ENTER);
		 * driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(
		 * "09/16/2022",Keys.ENTER); driver.findElement(By.xpath(
		 * "//button[contains(@class,'slds-combobox__input-value')]")).click();
		 * Thread.sleep(2000); WebElement stage =
		 * driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]/span"));
		 * driver.executeScript("arguments[0].click();",stage);
		 * driver.findElement(By.xpath("//button[text()='Save']")).click();
		 * 
		 * String text =
		 * driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).
		 * getText(); System.out.println(text);
		 */
	}

}
