package testnginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hierachyintestng {
	  ChromeDriver driver;
	  @BeforeSuite
	  public void first() { 
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver(); 
      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	 
	  }
@Test
public void login() {
	WebElement name=driver.findElement(By.id("txtUsername"));
	name.sendKeys("Admin");
	WebElement pwd=driver.findElement(By.id("txtPassword"));
	pwd.sendKeys("admin123");
	WebElement login=driver.findElement(By.id("btnLogin"));
    login.click();
		
}
@Test
public void form() {
	WebElement name=driver.findElement(By.id("txtUsername"));
	name.sendKeys("Admin");
	WebElement pwd=driver.findElement(By.id("txtPassword"));
	pwd.sendKeys("admin123");
	WebElement login=driver.findElement(By.id("btnLogin"));
    login.click();
	WebElement n=driver.findElement(By.id("menu_pim_viewMyDetails"));
    n.click();
}


  @AfterSuite public void closewindow() { 
	  driver.close(); }
 
 
}
