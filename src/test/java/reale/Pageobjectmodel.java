package reale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class Pageobjectmodel {
	WebDriver driver;
	
	@FindBy(name="firstName") WebElement firstname;
	
	@FindBy(name="lastName") WebElement lastname;
	
	@FindBy(name="phone")  WebElement phoneno;
	
	@FindBy(name="userName")  WebElement email;
	
	
	public Pageobjectmodel (WebDriver d) {
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	public void setfirstname(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void setlastname(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void setphoneno(String phone) {
		phoneno.sendKeys(phone);
	}
	
	public void setemail(String email1) {
		email.sendKeys(email1);
	}

	
		
	}

