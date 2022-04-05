package testnginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basictestngpro {
	@Test
	public void firefox() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/");
		WebElement text=driver.findElement(By.xpath("//ul[@class='wp-categories-list']/descendant::img"));
		text.click();	
	}
	/*
	 * @Test public void add() { WebDriverManager.firefoxdriver().setup();
	 * FirefoxDriver driver=new FirefoxDriver();
	 * driver.get("http://www.leafground.com/"); WebElement
	 * text1=driver.findElement(By.
	 * xpath("//a[@class='wp-categories-link maxheight']/following::img[4]"));
	 * text1.click(); }
	 */

}
