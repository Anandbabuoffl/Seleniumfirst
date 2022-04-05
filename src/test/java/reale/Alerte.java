package reale;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerte {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*WebElement alert1=driver.findElement(By.id("alertButton"));
		alert1.click();
		
		Alert A=driver.switchTo().alert();
		A.accept();
		
		WebElement alert2=driver.findElement(By.id("confirmButton"));
		alert2.click();
		
		Alert A1=driver.switchTo().alert();
		A1.dismiss();*/
		
		WebElement alert3=driver.findElement(By.id("promtButton"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('promtButton').click()");

		Alert A3=driver.switchTo().alert();
		Thread.sleep(3000);
		A3.sendKeys("Test");
		A3.accept();
		

}
}