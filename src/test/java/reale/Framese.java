package reale;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framese {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/dropdown-in-selenium/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement frame=driver.findElement(By.id("google_ads_iframe_/21849154601,22343295815/Ad.Plus-300x600_0"));
		//driver.switchTo().frame("google_ads_iframe_/21849154601,22343295815/Ad.Plus-300x600_0");
		driver.switchTo().frame(frame);
		WebElement removeads=driver.findElement(By.xpath("//*[@id=\"cbb\"]/svg/path[2]"));
		removeads.click();
		driver.switchTo().parentFrame();
		WebElement home=driver.findElement(By.linkText("HOME"));
		home.click();
		
	}

}
