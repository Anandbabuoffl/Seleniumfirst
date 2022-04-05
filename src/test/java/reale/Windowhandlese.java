package reale;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandlese {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement nextwindow=driver.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[3]/a"));
		nextwindow.click();
		//String old=driver.getWindowHandle();
		
		Set <String> allwindows=driver.getWindowHandles();
		
		Iterator <String> iterate=allwindows.iterator();
		String parent=iterate.next();
		String child=iterate.next();
		
		driver.switchTo().window(child);
		WebElement select1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img"));
		select1.click();
		driver.switchTo().window(parent);
		
		
	}

}
