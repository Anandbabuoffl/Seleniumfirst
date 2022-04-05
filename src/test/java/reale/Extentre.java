package reale;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentre {

	public static void main(String[] args) {
		ExtentSparkReporter spark=new ExtentSparkReporter(".\testreprot.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Login the app");
		test.info("nativated to login");
		System.out.println("test");
		test.pass("login successfully");

	}

}
