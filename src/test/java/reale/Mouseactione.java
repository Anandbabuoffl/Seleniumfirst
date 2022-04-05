package reale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseactione {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement TO=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		//action.clickAndHold(from).moveToElement(TO).release().build().perform();
		action.dragAndDrop(from, TO).release().build().perform();
	}

}
