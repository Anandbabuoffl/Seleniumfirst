package reale;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloadfilese {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		
		HashMap<String,Object> prefs=new HashMap<String,Object> ();
		prefs.put("plaugins.always_open_pdf_externally",true );
		prefs.put("downlaod.default_directory","C:/Users/bbuanan/Music/downloadfiles" );
		
		options.setExperimentalOption("prefs", prefs);
		
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://file-examples.com/");
		WebElement b=driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a"));
		b.click();
		WebElement c=driver.findElement(By.xpath("//td[text()='DOC, DOCX']/following-sibling::td[2]/a"));
		c.click();
		Thread.sleep(2000);
		WebElement d=driver.findElement(By.xpath("//td[@class='file-ext']/following-sibling::td[4]/a"));
		d.click();

	}

}
