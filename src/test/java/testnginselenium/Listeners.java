package testnginselenium;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener{
	//TestListenerAdpater
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started");
	}
	/*
	 * public void onTestFailure(ITestResult result) {
	 * System.out.println("Test is failed"); //File
	 * screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try {
	 * //FileHandler.copy(screenshot,new File("./screenshoot.png")); } catch
	 * (IOException e) { e.printStackTrace(); } }
	 */
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is successed");
	}
	
}
