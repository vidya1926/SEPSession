package week2day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {		
	
		//Step:1 Set up the driver/Connect the webdriver
		/*
		 * WebDriverManager.chromedriver().setup(); //Step 2 Create an instance to
		 * launch the browser ChromeDriver driver= new ChromeDriver();
		 */
		//
		//WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver =new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);
		
		List<WebElement> pp = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> num=new ArrayList<Integer>();
		
		for (WebElement webElement : pp) {
			String text = webElement.getText();
			if(!text.isBlank()) {
			String replace = text.replace(",", "");
			System.out.println(replace);
			int price=Integer.parseInt(replace);
			num.add(price);
			}
		}		
		Collections.sort(num);
		Integer min = Collections.min(num);
		System.out.println("Min value is: "+min);

	}

}
