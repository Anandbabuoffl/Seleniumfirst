package testnginselenium;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Dataproviderclassfist {

	@DataProvider(name="create")
	public Object[][] getdata(Method m) {
		Object[][] testdata=null;
		
		if(m.getName().equals("login1")) {
			testdata =new Object[][]
					{
				{"standard_user","secret_sauce"},
					{"locked_out_user","secret_sauce"},
					{"performance_glitch_user","secret_sauce"}};
					return testdata;
					}
		return testdata;
		
					/*
					 * else if (m.getName().equals()) { testdata =new Object[][] {
					 * {"standard_user","secret_sauce"}, {"locked_out_user","secret_sauce"},
					 * {"performance_glitch_user","secret_sauce"}}; }
					 */
		}
			
		}
	

