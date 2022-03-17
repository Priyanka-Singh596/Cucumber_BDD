package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement btnlogin;
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement btnlogout;
	
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
			}
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	public void loginBtn() {
		btnlogin.click();
	}
	public void logoutBtn() {
		btnlogout.click();
	}
	
}
