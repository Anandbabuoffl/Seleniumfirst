package reale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	WebDriver driver;
 @BeforeTest
 public void launch() {
	 WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	 driver.get("http://www.leafground.com/pages/Edit.html");
 }
 @Test(invocationCount=5)
 public void element() {
	 WebElement e=driver.findElement(By.id("email"));
	 e.sendKeys("Test");
 }
 @Test
 public void element1() {
	 WebElement e1=driver.findElement(By.name("username"));
	String gettext= e1.getText();
	 System.out.println("Text in "+gettext);
 }
}
