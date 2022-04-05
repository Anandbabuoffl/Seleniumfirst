package testnginselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Cell;
import jxl.Range;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.read.biff.PasswordException;

public class Datadrivenusingjxl {
	
	  //Object[][] data=null;
		/*
		 * WebDriver driver;
		 * 
		 * @DataProvider(name="login") public Object[][] data() throws BiffException,
		 * IOException { data=getdata(); return data; }
		 */
	 
	    public static Object[][] getdata() throws BiffException, IOException   {
		File file=new File("C:/Users/bbuanan/Music/Test2.xls");
		FileInputStream excel= new FileInputStream(file);
		Workbook wb=Workbook.getWorkbook(excel);
		Sheet sheet=wb.getSheet(0);
		int rowcount=sheet.getRows();
		int columncount=sheet.getColumns();
		
		Object[][] testdata=new Object[rowcount][columncount];
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				System.out.println(sheet.getCell(j,i).getContents());
				//System.out.println(testdata[i][j]);
				
			}
		}
		return testdata;
	    }
		public static void main(String[] args) throws BiffException, IOException {
			Datadrivenusingjxl d=new Datadrivenusingjxl();
			d.getdata();
		}
	
}
/*
 * @BeforeTest public void launch() { WebDriverManager.chromedriver().setup();
 * driver=new ChromeDriver(); driver.get("https://www.saucedemo.com/");
 * 
 * }
 * 
 * @Test(dataProvider="login") public void login1(String username,String
 * password) { WebElement user=driver.findElement(By.id("user-name"));
 * user.sendKeys(username); WebElement
 * pass=driver.findElement(By.id("password")); pass.sendKeys(password);
 * WebElement log=driver.findElement(By.id("login-button")); log.click();
 * driver.navigate().to("https://www.saucedemo.com/"); }
 */
		
	
 
