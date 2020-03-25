package MyAccount.com.Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MyAccount.com.pages.CreateNodePage;
import MyAccount.com.pages.LoginPage;
import MyAccount.com.pages.NodeListing;
import MyAcount.com.Base.TestBaseNew;

public class NodeListingTest extends TestBaseNew {

	LoginPage lp;// login page variable
	// DashboardPage Dashboard;
	CreateNodePage CreateNodePage;
	NodeListing list;

	public NodeListingTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	// public CreateNodePageTest() throws IOException {
	// super();
	// }

	@BeforeClass
	public void setUp() throws IOException {
		// inititalization();
		lp = new LoginPage();
		CreateNodePage = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		// CreateNode = new CreateNodePage();// login page constructor for creating
		// object
	}

	@Test(priority=1)
	public void nodelisttesting() throws InterruptedException, IOException {
		NodeListing list= new NodeListing();

		list.LockNode();
		

	}
	
	@Test(priority=2)
	public void unlocktest() throws InterruptedException, IOException {
		NodeListing unlocktest= new NodeListing();

		unlocktest.unlocknode();
		

	}
	
	@Test(priority=3)
	public void accessconsolelink() throws InterruptedException, IOException {
		NodeListing access= new NodeListing();

		access.accessconsole();
		

	}
	

	@Test(priority=4,enabled=false)
	public void monitortab() throws InterruptedException, IOException {
		NodeListing monitor= new NodeListing();

		monitor.monitoring();
		

	}
	@Test(priority=5,enabled=false)
	public void renamenodedetail() throws InterruptedException, IOException {
		NodeListing noderename= new NodeListing();

		noderename.renamenode();
		

	}
	

	@Test(priority=6)
	public void rebootnode() throws InterruptedException, IOException {
		NodeListing reboot= new NodeListing();

		reboot.rebootbtn();
		

	}
//	@Test(priority=6,enabled=false)
//	public void rebootbutton() throws InterruptedException, IOException {
//		NodeListing rebootnode= new NodeListing();
//
//		rebootnode.rebootbtn();
//		
//
//	}
	
	
	@Test(priority=7)
	public void poweroffbutton() throws InterruptedException, IOException {
		NodeListing poweroffnode= new NodeListing();

		poweroffnode.poweroffbtn();
		

	}
	
	@Test(priority=8,enabled=false)
	public void saveimg() throws InterruptedException, IOException {
		NodeListing savedimage= new NodeListing();

		savedimage.saveimagebutton();
		

	}
	@Test(priority=9,enabled=false)
	public void saveimgbtn() throws InterruptedException, IOException {
		NodeListing imagesaving= new NodeListing();

		imagesaving.savedimagebutton();
		

	}
	
	@Test(priority=10,enabled=false)
	public void testnodesearch() throws InterruptedException, IOException {
		NodeListing search= new NodeListing();

		search.nodesearching();
		

	}
	
	@Test(priority=11,enabled=false)
	public void runningstatechk() throws InterruptedException, IOException {
		NodeListing running= new NodeListing();

		running.againrunnigstate();
		

	}

	
}
