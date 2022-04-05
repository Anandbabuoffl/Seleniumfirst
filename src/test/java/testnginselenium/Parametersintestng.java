package testnginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametersintestng {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void launch(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("invalid value");
			break;
		}
	}

	@Parameters("url")
	@Test(priority=2)
	public void url(String url) {
		driver.get(url);
		
	}
	
	  @Parameters("text")
	  @Test(priority=1)
	  public void edit() {
	  WebElement text1=driver.findElement(By.name("q")); 
	  text1.sendKeys("text");
	  }
	  
	  
	 
	 
}
