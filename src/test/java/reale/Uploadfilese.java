package reale;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfilese {

	public static void main(String[] args) throws IOException  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://www.leafground.com/pages/upload.html");
		WebElement upload=driver.findElement(By.xpath("//*[@id=\"mydiv\"]/input"));
		//upload.sendKeys("C:/Users/bbuanan/Downloads/3p_appcompat_q12022_bd_gmc_p2_apps (1).csv");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(upload));
        Actions action=new Actions(driver);
        action.moveToElement(upload).click().build().perform();

		Runtime.getRuntime().exec("C:/Users/bbuanan/Documents/test1.exe");
	}

}
