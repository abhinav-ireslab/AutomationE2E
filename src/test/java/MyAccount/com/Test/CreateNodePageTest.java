package MyAccount.com.Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;
import MyAccount.com.pages.CreateNodePage;



public class CreateNodePageTest extends TestBaseNew {
	LoginPage lp;// login page variable
	//DashboardPage Dashboard;
	CreateNodePage CreateNodePage;

	public CreateNodePageTest() throws IOException {
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
	public void NodeTextVerify() {
		CreateNodePage.NodeTextVerify();
	}
	
	
	@Test(priority=2)
	public void NodeSection() throws InterruptedException {
		CreateNodePage.NodeSection();
		

	}
	
	
	@Test(priority=3)
	public void BrowserBackVerify() throws InterruptedException {
		CreateNodePage.BrowserBack();
	}
	
	
	
	@Test(priority=4)
	public void Add_Button_Functionality() throws InterruptedException {
		
		CreateNodePage.CreateNode_AddButton();
		
	}
	
	@Test(priority=5)
	public void ComputeNodeTab() {
		CreateNodePage.HeaderTabs();
	}
	
	@Test(priority=6)
	public void CreateNode() throws InterruptedException {
		CreateNodePage.CreateNode();
	}
	
	@Test(priority=7)
	public void SelectSshKey() throws InterruptedException, IOException {
		
		CreateNodePage.SshKeyCheckbox();
	}
	
	@Test(priority=8)
	public void PasswrdSection() throws InterruptedException {
		CreateNodePage.PasswordDisable_Enabled();
	}
	
	
	@Test(priority=9, enabled=false)
	public void EnterInvalidNodeName() throws InterruptedException {
		CreateNodePage.InvalidNodeName();
	}
	
	@Test(priority=10)
	public void EnterValidNodeName() throws InterruptedException {
		CreateNodePage.ValidNodeName();
	}
	
	@Test(priority=11)
	public void EnterGroupName() throws InterruptedException {
		CreateNodePage.GroupName();
	}
	
	@Test(priority=12)
	public void TestToCheckGroupFilter() throws InterruptedException {
		
		CreateNodePage.GroupFilter();
	}
	
}
