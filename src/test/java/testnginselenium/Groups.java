package testnginselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groups {
	EdgeDriver driver;
	
@BeforeTest(groups= {"link"})
public void launch() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
}
@Test(groups= {"link"})
public void geturl() {
	driver.get("http://www.leafground.com/pages/Link.html");
	WebElement url=driver.findElement(By.partialLinkText("without clicking me?"));
	String s=url.getAttribute("href");
	System.out.println(s);
}
@Test(groups= {"link"})
public void verifybroken() {
	//driver.get("http://www.leafground.com/pages/Link.html");
	WebElement broken=driver.findElement(By.linkText("Verify am I broken?"));
	broken.click();
	String s1=driver.getTitle();
	System.out.println(s1);
}
@Test(groups= {"link"})
public void printalllinks() {
	List <WebElement> link=driver.findElements(By.tagName("a"));
	int size=link.size();
	
	for (WebElement alllinks : link) {
		String s2=alllinks.getAttribute("href");
		System.out.println(s2);
		String s3=alllinks.getText();
		System.out.println(s3);	
	}
}
	
	@AfterTest(groups= {"link"})
		public void quit() {
		driver.quit();
		
	}
	
}


