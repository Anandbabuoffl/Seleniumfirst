package testnginselenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alretintestng {
     WebDriver driver;
    SoftAssert s=new SoftAssert();
	@BeforeSuite
	public void browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	 @Test(priority=1,enabled=true)
	 public void url() {
	 driver.get("http://www.leafground.com/pages/Alert.html");
	 driver.manage().window().maximize(); }
	 
	@Test(priority=2,groups="local",dependsOnMethods = "url")
	public void alert1() {
		WebElement al=driver.findElement(By.xpath("//button[text()='Alert Box']"));
		al.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	
	}
	  @Test(priority=3)
	  public void alert2()
	  { 
      WebElement  al=driver.findElement(By.xpath("//button[text()='Confirm Box']"));
      al.click();
	  Alert alert=driver.switchTo().alert(); 
	  alert.dismiss(); 
	  s.assertTrue(false);
	 }
	  
	 @Test(priority=4,dataProvider ="create")
	 //@Parameters("text")
	 public void alert3(String text)
	  { 
     WebElement  al=driver.findElement(By.xpath("//button[text()='Prompt Box']"));
     al.click();
	 Alert alert=driver.switchTo().alert(); 
	 alert.sendKeys(text);
	 alert.accept();
	 }
	 
	 @DataProvider(name="create")
	 public Object[] getdata() {
		 return new Object[] {"test"};

	 }
	 @AfterSuite(groups="local")
	 public void close() {
		 driver.quit();
	 }
	
}
