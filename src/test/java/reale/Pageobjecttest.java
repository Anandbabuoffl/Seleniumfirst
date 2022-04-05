package reale;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pageobjecttest {

   @Test
	public void launchbroswer() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Logger logger=Logger.getLogger("Pageobjecttest");
		Pageobjectmodel pm=new Pageobjectmodel(driver);
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		pm.setfirstname("Anand");
		pm.setlastname("Babu");
		pm.setphoneno("9080412202");
		pm.setemail("anand");
		
	}
	
	
	
}
