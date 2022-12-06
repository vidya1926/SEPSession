package exceptionhandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnThrows {	

	public static void main(String[] args) throws IOException, InterruptedException {

	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	File destn=new File("./snap/shot.png");
	FileUtils.copyFile(screenshotAs,destn);	
	Thread.sleep(5000);
	
	System.out.println(driver.getTitle());
		
	}

}
