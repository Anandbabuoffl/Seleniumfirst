package testnginselenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	//WebDriver chromedriver;

	@Test(priority=2)
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement d=driver.findElement(By.id("email"));
		d.click();
		d.sendKeys("text");
		
		SoftAssert softassert=new SoftAssert();
		
		String actual=d.getAttribute("value");
		String excepted="text";
		softassert.assertEquals(actual, excepted,"text mismatch");
		
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		WebElement position=driver.findElement(By.id("position"));
		Point xy=position.getLocation();
		int x=xy.getX();
		int expected=240;
		softassert.assertEquals(x, expected);
		int y=xy.getY();
		int expected1=304;
		softassert.assertEquals(y, expected1);
		

		driver.quit();
		//softassert.assertAll();
	}
	@Test(priority=0,enabled=true)
	public void getsize() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement size=driver.findElement(By.id("size"));
		Dimension hw=size.getSize();
		SoftAssert s=new SoftAssert();
		int h=hw.getHeight();
		int expected=20;
		s.assertEquals(h, expected);
		int w=hw.getWidth();
		int expected1=20;
		s.assertEquals(h, expected1);
		
		s.assertAll();
	}
}
