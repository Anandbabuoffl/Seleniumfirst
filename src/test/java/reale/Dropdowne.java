package reale;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowne {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
	    dropdown.click();
	
		Select s=new Select(dropdown);
		s.selectByIndex(5);
		s.selectByValue("red");
		s.selectByVisibleText("Yellow");
		
		List <WebElement> options=s.getOptions();
		int size=options.size();
		System.out.println(size);
		List <WebElement> alloption=driver.findElements(By.tagName("select"));
		alloption.size();
		
		for(int i=0;i<=alloption.size();i++) {
			System.out.println(alloption.get(i).getText());
		}
		
		
		
		
	
		/*WebElement multidropdown=driver.findElement(By.xpath("//*[@id=\"cars\"]"));
		Select s1=new Select(multidropdown);
		s1.selectByIndex(0);
		s1.selectByValue("saab");
		s1.selectByVisibleText("Audi");*/
		
		

	}

}
