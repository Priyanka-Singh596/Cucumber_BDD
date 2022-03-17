package stepDefination;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObject.AddNewCustomer;
import pageObject.LoginPage;

public class BaseClass {

	
	public WebDriver driver;
	public LoginPage lp;
	public AddNewCustomer addcust;
	
	
	public static String randomstring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);//This is for email Id
		return(generatedString1);
	}
}
