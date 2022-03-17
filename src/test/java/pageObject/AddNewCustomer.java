package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomer {
	public WebDriver driver;
	
	
	public AddNewCustomer(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	By lnkcustomer_Menu=By.xpath("//a[@href='#']//i[contains(@class,'nav-icon far fa-user')]");
	By lnkcustomer_Item=By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
	By btnaddNew=By.xpath("//body/div[3]/div[1]/form[1]/div[1]/div[1]/a[1]");
	By txtemail=By.xpath("//input[@id='Email']");
	By txtpassword=By.xpath("//input[@id='Password']");
	By txtfirstName=By.xpath("//input[@id='FirstName']");
	By txtlastName=By.xpath("//input[@id='LastName']");
	By txtgenderM=By.id("Gender_Male");
	By txtgenderF=By.id("Gender_Female");
	By selectdateOfBirth=By.xpath("//input[@id='DateOfBirth']");
	By txtcompanyName=By.xpath("//input[@id='Company']");
	By taxExempt=By.xpath("//input[@id='IsTaxExempt']");
	//By lstnewsLetter=By.id("SelectedNewsletterSubscriptionStoreIds_taglist");
	//By lsttxtStore2=By.xpath("//span[contains(text(),'Test store 2')]");
	
	By lstcustomersRole=By.xpath("//input[@class='k-input k-readonly' and @aria-describedby='SelectedCustomerRoleIds_taglist']");
	By c_role_Regesterd=By.xpath("//*[@id='SelectedCustomerRoleIds_taglist']/li/span[1]");
	By c_role_guest=By.xpath("//li[contains(text(),'Guests')]");
	By c_role_adminstrator=By.xpath("//li[contains(text(),'Administrators')]");
	By c_role_vendor=By.xpath("//li[contains(text(),'Vendors')]");
	By c_role_Moderators=By.xpath("//li[contains(text(),'Forum Moderators')]");
	
	
	
	By lstmanagerOfVendor=By.xpath("//select[@id='VendorId']");
	By lstvendor2=By.xpath("//option[contains(text(),'Vendor 2')]");
	By checkactivebox=By.xpath("//input[@id='Active']");
	By txtadminComment=By.xpath("//textarea[@id='AdminComment']");
	By saveBtn=By.xpath("//button[@name='save']");
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void clickOnCustomerMenu() {
		driver.findElement(lnkcustomer_Menu).click();
	}
	public void clickOnCustomerItem() {
		driver.findElement(lnkcustomer_Item).click();
	}
	public void addNewCustomer() {
		driver.findElement(btnaddNew).click();
	}
	public void setemaiId(String mail) {
		driver.findElement(txtemail).sendKeys(mail);
	}
	public void setpassword(String pwd) {
		driver.findElement(txtpassword).sendKeys(pwd);
	}
	public void setFirstName(String FName) {
		driver.findElement(txtfirstName).sendKeys(FName);
	}
	public void setLastName(String LName) {
		driver.findElement(txtlastName).sendKeys(LName);		
	}
	
	public void setGender(String gender) {
		if(gender.equals("Male")) {
			driver.findElement(txtgenderM).click();			
		}
		else if(gender.equals("Female")) {
			driver.findElement(txtgenderM).click();	
		}
		else {
			driver.findElement(txtgenderM).click();	//default print
		}
			}
	
	public void setDateOfBirth(String dob) {
		driver.findElement(selectdateOfBirth).sendKeys(dob);
	}
	public void setcompanyName(String CompName) {
		driver.findElement(txtcompanyName).sendKeys(CompName);
	}
	public void clickExempt() {
	driver.findElement(taxExempt).click();
	}
	
	//Customer Roles
	public void setCustomer_Role(String role) throws InterruptedException {
		
		if(!role.equals("Vendors")) {
		driver.findElement(By.xpath("//*[@id='SelectedCustomerRoleIds_taglist']/li/span[2]")).click();
		}
		
		driver.findElement(lstcustomersRole).click();
		WebElement listitems;
		Thread.sleep(3000);
		
    if (role.equals("Guest")) {
		 listitems = driver.findElement(c_role_guest);
	}
	else if (role.equals("Adminstrator")) {
		 listitems = driver.findElement(c_role_adminstrator);
	}
	else if (role.equals("Forum Moderators")) {
		 listitems = driver.findElement(c_role_Moderators);
	}
	else {
		 listitems = driver.findElement(c_role_guest);
	}
	
    listitems.click();
}
	
	public void setMnagerOfVendor(String value) {
		Select drpdwn = new Select(driver.findElement(By.id("VendorId")));//creating a Object for Select class here
		//drpdwn.selectByVisualText(value);
		drpdwn.selectByIndex(2);
	}
	public void active() {
		driver.findElement(checkactivebox).click();
	}
	public void setAminComments(String comment) {
		driver.findElement(txtadminComment).sendKeys(comment);
	}
	public void clickOnSave() {
		driver.findElement(saveBtn).click();
	}
	
	
		
			


}
