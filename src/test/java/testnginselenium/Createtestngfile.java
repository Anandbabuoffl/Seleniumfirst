package testnginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createtestngfile {
	FirefoxDriver driver;
@BeforeSuite
public void Launch(){
	WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();
	driver.get("http://www.leafground.com/pages/radio.html");
}
	@Test(priority=1,enabled = true)
	public void radio()
	{
		//driver.get("http://www.leafground.com/pages/radio.html");
		WebElement radio=driver.findElement(By.xpath("//div[@id='first']/descendant::input[1]"));
		radio.click();
	}
	@Test(priority=2,dependsOnMethods ="radio")
	public void text() {
		WebElement text=driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/child::label"));
		String s=text.getText();
		System.out.println(s);
	}
	@Test(priority=3)
	public void check() {
		WebElement check=driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/child::label"));
		boolean c=check.isSelected();
		System.out.println(c);
		WebElement check1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean c1=check1.isSelected();
		System.out.println(c1);	
	}
	
	@Test(priority=4)
	public void box() {
		driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		box1.click();
	}
	@AfterSuite
	public void close() {
		driver.quit();
	}
	}

