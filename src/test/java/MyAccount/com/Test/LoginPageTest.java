package MyAccount.com.Test;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;
import MyAccount.com.pages.CreateNodePage;


public class LoginPageTest extends TestBaseNew{
	LoginPage lp;//login page variable
	//DashboardPage Dashboard;
	CreateNodePage CreateNodePage;

	
	public LoginPageTest() throws IOException {
		super();
	}
	@BeforeClass
	public void setUp() throws IOException{
		//inititalization();
		
	lp=new LoginPage();//login page constructor for creating object
	}
	/*@Test(priority=1)
	public void loginPageTitleTest(){
		String title = MyAccount.com.pages.LoginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "");
	}*/
	
	 /*@Test()
	public boolean validatee2elogotest(){
		 Reporter.log("\n Verify to create node on CentOS server with existing user"+"\n", true);
		boolean flag = lp.validatee2elogo();
		Assert.assertTrue(flag);
		return flag;
	}
	
	/*@Test(priority=2)
	public void loginTest(){
		homePage = MyAccount.com.pages.LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}*/
	

	@Test(priority=1)
    public void login() throws IOException, InterruptedException{
		CreateNodePage=lp.login(prop.getProperty("username"),prop.getProperty("password"));
         
		 	Thread.sleep(5000);
			//WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/a/div/div[1]/div[2]/span[1]"));
			String pageSrc = driver.getPageSource();
			String Text_to_check = "Nodes";
			
			boolean istextpresent = pageSrc.contains(Text_to_check);
			System.out.println("Result: "+ istextpresent );
	
	}
	
	@Test(priority=2, enabled=false)
	public void textverification (){
		
		WebElement text = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/a/div/div[1]/div[2]/span[1]"));
		String pageSrc = driver.getPageSource();
		String Text_to_check = "Nodes";
		
		boolean istextpresent = pageSrc.contains(Text_to_check);
		System.out.println("Result = "+ istextpresent );
		
		
		
	}
	
	@Test(priority=2, enabled=false)
	public void Close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	/*@AfterMethod
	public void tearDown(){
		driver.quit();
	}*/

}
