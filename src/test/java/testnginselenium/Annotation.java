package testnginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {

	WebDriver driver;
	@Test
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test(priority=2)
	public void url() {
		driver.get("http://www.leafground.com/home.html");
	}
	@Test(priority=3)
	public void url1() {
		driver.get("http://www.leafground.com/pages/Edit.html");
	}
	@Parameters("first")
	@Test(priority=4)
	public void text(String first) {
		WebElement t1=driver.findElement(By.id("email"));
		t1.sendKeys(first);
		
	}
}
