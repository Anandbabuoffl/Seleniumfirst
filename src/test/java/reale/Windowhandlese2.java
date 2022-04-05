package reale;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandlese2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		WebElement select=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		select.click();
		
		Set <String> windows=driver.getWindowHandles();
		Iterator <String> changewindow=windows.iterator();
		String praent=changewindow.next();
		String child=changewindow.next();
		String child1=changewindow.next();
		
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		//WebElement select1=driver.findElement(By.xpath("//*[@id=\"home\"]"));
		//select1.click();
		//driver.switchTo().window(praent);
	}

}
