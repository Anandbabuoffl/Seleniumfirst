package testnginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	FirefoxDriver driver;
	//@BeforeSuite
	@Test(priority=1)
	public void launch() 
			 {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		 driver.get("http://www.leafground.com/pages/Edit.html");
	}
//	@Test(priority=1)
//	public void url() {
//		driver.get("http://www.leafground.com/pages/Edit.html");
//		WebElement text=driver.findElement(By.id("email"));
//		text.sendKeys("friends");
//	}
//	@Test(priority=2)
//	public void app() {
//		driver.navigate().to("http://www.leafground.com/home.html");
//		WebElement button=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
//		button.click();
//	}
	//@AfterSuite
	@Test(priority=2)
	public void close() {
		driver.close();
	}
}
