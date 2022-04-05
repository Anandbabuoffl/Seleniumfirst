package testnginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider1 {
    WebDriver driver;
    
	@DataProvider(name="create")
	public Object[][] getdata() {
		return new Object[][] {{"standard_user","secret_sauce"},
		{"locked_out_user","secret_sauce"},
		{"performance_glitch_user","secret_sauce"}};
	}
	
	@BeforeTest
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test(dataProvider="create",dataProviderClass = Dataproviderclassfist.class)
	public void login1(String username,String password) {
		WebElement user=driver.findElement(By.id("user-name"));
		user.sendKeys(username);
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(password);
		WebElement log=driver.findElement(By.id("login-button"));
		log.click();
		driver.navigate().to("https://www.saucedemo.com/");
	}
	
}
