package MyAccount.com.Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;
import MyAccount.com.pages.UserManagementPage;
import MyAccount.com.pages.CreateNodePage;

public class UserManagementTest extends TestBaseNew {

	public UserManagementTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	LoginPage lp;
	CreateNodePage CreateNodePage;
	// UserManagementPage UserManagementPage;

	@BeforeClass
	public void setUp() throws Exception {
		// inititalization();
		lp = new LoginPage();
		CreateNodePage = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		// CreateNode = new CreateNodePage();// login page constructor for creating
		// object
	}

	@Test(priority = 1)
	public void UserManagement_section() throws InterruptedException, IOException {
		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.ManagementSection();

	}

	@Test(priority = 2)
	public void Verify_symbol() throws IOException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.symbol();

	}

	@Test(priority = 3)
	public void Verify_Prefix() throws IOException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.Prefix();

	}

	@Test(priority = 4)
	public void Verify_FirstName() throws IOException, InterruptedException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.First_Name();

	}

	@Test(priority = 5)
	public void Verify_LastName() throws IOException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.Last_Name();

	}

	@Test(priority = 6)
	public void Verify_Email() throws IOException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.EmailField();

	}

	@Test(priority = 6)
	public void Verify_PhoneNumber() throws IOException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.PhoneNumber();

	}

	@Test(priority = 7)
	public void AllowLgin() throws IOException, InterruptedException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.AllowLogin();
	}

	@Test(priority = 8)
	public void Verify_Password() throws IOException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.password();

	}

	
	@Test(priority = 9)
	public void Verify_DeleteButton() throws IOException, InterruptedException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.DeleteButton();

	}
	
	@Test(priority = 10)
	public void Verify_updatebutton() throws IOException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.updateButton();

	}

	@Test(priority = 11)
	public void Verify_OTP() throws IOException, InterruptedException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.VerifyOTP();

	}

	@Test(priority = 12,enabled=false)
	public void Verify_DeleteButton_Again() throws IOException, InterruptedException {

		UserManagementPage UserManagement_section = new UserManagementPage();
		UserManagement_section.DeleteButton();

	}

}
