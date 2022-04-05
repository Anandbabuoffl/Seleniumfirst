package reale;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttonse {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		
		Dimension s=driver.manage().window().getSize();
		System.out.println(s);
		s.getHeight();
		s.getWidth();
		driver.manage().window().setSize(new Dimension(1000,500));
		
		WebElement postion=driver.findElement(By.id("position"));
		Point xy=postion.getLocation();
		int x=xy.getX();
		int y=xy.getY();
		System.out.println(x);
		System.out.println(y);
		
		Dimension s1=postion.getSize();
		int h1=s1.getHeight();
		int w1=s1.getWidth();
		System.out.println(h1);
		System.out.println(w1);
		
		
		
		
	}

}
