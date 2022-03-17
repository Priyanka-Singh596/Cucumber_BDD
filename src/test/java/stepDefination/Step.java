package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObject.AddNewCustomer;
import pageObject.LoginPage;

public class Step extends BaseClass {

	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
	    
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver/chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		
	}

	@Then("User open URL {string}")
	public void user_open_url(String Url) {
		driver.get(Url);	
	    
	}

	@Then("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String Email, String password) {
		lp.setUserName(Email);
		lp.setPassword(password);
	   
	}

	@Then("User click on Login")
	public void user_click_on_login() {
		lp.loginBtn();
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String exptitle) throws InterruptedException {
	
		if(driver.getPageSource().contains("Login was unsucessful"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(exptitle, driver.getTitle());
			
		}
		Thread.sleep(2000);
	}

	@When("User click on Logout link")
	public void user_click_on_logout_link() {
	    lp.logoutBtn();
	}
	@Then("Close the Browser")
	public void close_the_browser() {
		driver.close();
	    
	}

	//Add Customer

@Then("Page Title should be Dashboard")
public void page_Title_should_be_Dashboard() {
    addcust=new AddNewCustomer(driver);
    Assert.assertEquals("Dashboard / nopCommerce administration",addcust.getPageTitle());
}

	
	@When("User click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {
     addcust.clickOnCustomerMenu();
	}

	@When("User click on customers item")
	public void user_click_on_customers_item() throws InterruptedException {
	    Thread.sleep(2000);
	    addcust.clickOnCustomerItem();
	}

	@Then("User click on Add New button")
	public void user_click_on_Add_New_button() throws InterruptedException {
		addcust.addNewCustomer();
		Thread.sleep(3000);
	}

	@Then("User can view Add a new customer page")
	public void user_can_view_Add_a_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getPageTitle());
	}

	@Then("User enters customer info")
	public void user_enters_customer_info() throws InterruptedException {
	    String email = randomstring()+"@gmail.com";
	    addcust.setemaiId(email);
	    addcust.setpassword("demo123");
	    addcust.setFirstName("Priyanka");
	    addcust.setLastName("Singh");
	    addcust.setGender("Female");
	    addcust.setDateOfBirth("5/10/2021");
	    addcust.setcompanyName("XYZ Private Ltd.");
	    addcust.clickExempt();
	    Thread.sleep(5000);
	    addcust.setCustomer_Role("Guest");
	    addcust.setMnagerOfVendor("Vendor2");
	    addcust.setAminComments("This is for add customer");
	        
	}

	@Then("User click on save button")
	public void user_click_on_save_button() {
	    addcust.clickOnSave();
	}

	@Then("User can view configration message {string}")
	public void user_can_view_configration_message(String string) {
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
	}
	@And("User close browser")
	public void User_close_browser() {
	    driver.close();
	}

	
}
