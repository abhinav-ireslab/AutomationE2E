package MyAccount.com.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import MyAcount.com.Base.TestBaseNew;

public class UserManagementPage extends TestBaseNew {
	//@FindBy(xpath="//a[@class='nav-link font-weight-bold nav-dropdown-toggle'][contains(text(),'Security Settings')]")
	@FindBy(xpath="//a[contains(text(),'Security Settings')]")
	WebElement SecuritySetting;
	
	@FindBy(xpath="//a[contains(text(),'User Management')]")
	WebElement ManagementSection;
	
	
	@FindBy(xpath="//a[contains(@id,'create-contact')]")
	WebElement Possitive;
	
	@FindBy(xpath="//select[contains(@name,'salutation')]")
	WebElement Prefix;


	@FindBy(xpath="//input[contains(@name,'first_name')]")
	WebElement FirstName;
	
	@FindBy(xpath="//input[contains(@name,'last_name')]")
	WebElement LastName;
	
	@FindBy(xpath="//input[contains(@name,'email')]")
	WebElement Email;
	
	@FindBy(xpath="//input[contains(@name,'phone')]")
	WebElement Phone;
	
	@FindBy(xpath="//input[contains(@id,'allow_login')]")
	WebElement AllowLogin;
	
	@FindBy(xpath="//button[contains(@value,'Update')]")
	WebElement update;
	
	@FindBy(xpath="//input[contains(@id,'password-input')]")
	WebElement Password;
	
	@FindBy(xpath="//button[contains(@id,'verify')]")
	WebElement VerifyOTP;
	
	
	@FindBy(xpath="//button[contains(@value,'Delete')]")
	WebElement Delete;
	
	

	public UserManagementPage() throws IOException {

		PageFactory.initElements(driver,this);
	}
	
	
	@Test
	public void ManagementSection() throws InterruptedException {
		Thread.sleep(5000);
		SecuritySetting.click();
		Thread.sleep(5000);
		ManagementSection.click();
		
	}
	
	@Test
	public void symbol(){
		
		Possitive.click();
		
	}
	
	@Test
	public void Prefix() {
		
		Select se = new Select(Prefix);
		se.selectByVisibleText("Mr.");
		
	}
	
	@Test
	public void First_Name() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();",update);
		
		
		update.click();
		FirstName.clear();
		FirstName.sendKeys("Akash");
		
	}
	
	@Test
	public void Last_Name() {
		
		update.click();
		LastName.clear();
		LastName.sendKeys("Singhal");
		
	}
	
	
	@Test
	public void EmailField() {
		
		update.click();
		Email.clear();
		Email.sendKeys("abhinav.garg+test12@e2enetworks.com");
		
	}
	
	
	@Test
	public void PhoneNumber() {
		
		update.click();
		Phone.clear();
		Phone.sendKeys("9897095008");
		
	}
	

	@Test
	public void AllowLogin() throws InterruptedException {
		
		AllowLogin.click();
		Thread.sleep(2000);
		AllowLogin.click();
		Thread.sleep(2000);
		AllowLogin.click();		
		
	}
	
	@Test
	public void password() {
		
		Password.sendKeys("Abhi@123");
	}
	
	@Test
	public void updateButton() {
		
		update.click();
	}
	
	@Test
	public void VerifyOTP() throws InterruptedException {
		
		Thread.sleep(10000);
		VerifyOTP.click();

		
	}
	
	@Test
	public void DeleteButton() {
		
		Delete.click();
		
	}
	
	
	
}
