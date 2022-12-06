package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testcase.ReadExcelData;

public class CommonClass {

	// public static ChromeDriver driver;-->seq execution
	public RemoteWebDriver driver;
	public String filename;
	public int sheetindex;

	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test, createNode;
	public String testName, testDesc, author, category;

	@Parameters({ "browser", "url" })
	@BeforeMethod()
	public void preCondition(String browser, String url) {

		createNode = test.createNode(testName);

		// WebDriverManager.chromedriver().setup();
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./reports/results.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);

	}

	@BeforeClass
	public void testDetails() {
		test = extent.createTest(testName, testDesc);
		test.assignAuthor(author);
		test.assignCategory(category);
	}

	public void reportStep(String status, String message) throws IOException {

		// if status is passed-->test.pass
		// else status is failed -->test.fail

		if (status.equalsIgnoreCase("pass")) {
			createNode.pass(message,
					MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img" + takeSnap() + ".jpg").build());

		} else if (status.equalsIgnoreCase("fail")) {
			createNode.fail(message,
					MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img" + takeSnap() + ".jpg").build());
			//throw new RuntimeException("Check the inputs");
		}

	}

	public int takeSnap() throws IOException {
		int random = (int) (Math.random() * 999999);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File destn = new File("./snap/img" + random + ".jpg");
		FileUtils.copyFile(screenshotAs, destn);
		return random;

	}

	@AfterSuite
	public void endReport() {
		extent.flush();
	}

	@AfterMethod()
	public void postCondition() {
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return ReadExcelData.readData(filename, sheetindex);
	}

}
