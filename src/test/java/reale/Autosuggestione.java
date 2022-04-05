package reale;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestione {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement fromlayer=driver.findElement(By.name("q"));
		fromlayer.click();
		fromlayer.sendKeys("match");
		Thread.sleep(2000);
		fromlayer.sendKeys(Keys.ARROW_DOWN);
		fromlayer.sendKeys(Keys.ENTER);
		
		//List <WebElement> select=driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li"));
		//int size=select.size();
		//System.out.println(size);
		
		
		
		/*for (WebElement allchoice : select) {
			if(allchoice.getText().equals("manali weather")) {
				allchoice.click();
				//System.out.println(allchoice.getText());
			}
			
		}*/
		
	}

}
