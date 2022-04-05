package testnginselenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
   
	@DataProvider
	public Object[][] launch()
	{
		
		Object[][] a=new Object[3][2];
		
		a[0][0]="username1";
		a[0][1]="password1";
				
		a[1][0]="username2";
		a[1][1]="password2";
		
		a[2][0]="username3";
		a[2][1]="password3";
		
		 return a;
	}
	
	@DataProvider(name="create")
	public Object[][] set() {
		
		return new Object[][] {{"username","password"},
		                       {"username","password"},
		                       {"username","password"}};
	}
	
	@Test(dataProvider="create")
	public void test2(String username,String password) {
		System.out.println(username+"====="+password);
	}
	
	
	@Test(dataProvider="launch")
	public void test(String username,String password) {
		
		System.out.println(username+"====="+password);
	}
}
