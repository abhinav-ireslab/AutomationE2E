package MyAccount.com.Test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MyAccount.com.pages.LoginPage;
import MyAccount.com.pages.WordPressPage;
import MyAcount.com.Base.TestBaseNew;
import MyAccount.com.pages.CreateNodePage;

public class WordPressPageTest extends TestBaseNew{
	LoginPage lp;
	CreateNodePage CreateNodePage;
	//WordPressPage WordPressPage;
	
	
	public WordPressPageTest() throws IOException {
		
		super();
	}
	
	
	@BeforeClass
	public void setUp() throws IOException {
		//inititalization();
		lp=new LoginPage();
		CreateNodePage=lp.login(prop.getProperty("username"),prop.getProperty("password"));
		//CreateNode = new CreateNodePage();// login page constructor for creating object
		
	}

	@Test(priority=1)
	public void Dashboard() throws InterruptedException, IOException {
		WordPressPage WordPressPage= new WordPressPage();
		WordPressPage.Dashboard();
	}
	
	@Test(priority=2)
	public void text() throws IOException, InterruptedException {
		WordPressPage WordPressPage= new WordPressPage();
		WordPressPage.verify_text();
	}
	
	@Test(priority=3)

	public void Available_Site() throws IOException {
		
		WordPressPage WordPressPage = new WordPressPage();
		WordPressPage.Sites_data();
		
	}
	
	@Test(priority=4)
	public void Resource_usage() throws IOException {
		
		WordPressPage WordPressPage = new WordPressPage();
		WordPressPage.Resource_usage();
	}
	
	@Test(priority=5)
	public void plans_text() throws IOException {
		
		WordPressPage WordPressPage = new WordPressPage();
		WordPressPage.PlanVerify();
	}
	
	@Test(priority=6)
	public void Plans_details() throws IOException {
		
		WordPressPage WordPressPage = new WordPressPage();
		WordPressPage.plandata();
	}
	
	@Test(priority=7)
	public void Total_Visits_Accross_Site () throws IOException{
		
		
		WordPressPage WordPressPage = new WordPressPage();
		WordPressPage.sitevisit();
	}
}
