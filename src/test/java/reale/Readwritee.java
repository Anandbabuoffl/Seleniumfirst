package reale;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Readwritee {

	public static void main(String[] args) throws IOException {
		Properties pro=new Properties();
		FileInputStream input=new FileInputStream("/Seleniumreale/src/test/resources/supportfile/test.supportfile");
		pro.load(input);
		String s=pro.getProperty("Browser");
		System.out.println(s);

	}

}
