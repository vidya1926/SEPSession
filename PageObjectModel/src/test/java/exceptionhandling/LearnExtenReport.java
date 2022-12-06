package exceptionhandling;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtenReport {

	public static void main(String[] args) throws IOException {

		// Step:1-->Set up the path for the reporter
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/results.html");
		// to have the history of reports
		reporter.setAppendExisting(true);
		// step:2 -->to capture the results at runtime
		ExtentReports extent = new ExtentReports();

		// Step:3 -->attach the reports to the phiysical file
		extent.attachReporter(reporter);

		// Step:4 -->add the testcase details

		ExtentTest test = extent.createTest("LoginLogout", "Functionality of the Positive Creadentials");
		test.assignAuthor("Balaji");
		test.assignCategory("Funtional");

		// step:5 -->status of the tc

		test.pass("Login is successful");
		test.fail("Login is unsuccessful");

		// to add the screenshot of the testcase
		test.pass("Username name is entered Successfully",
				MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/pic.jpg").build());
		// Mandatory step
		extent.flush();

	}

}
