package MyAccount.com.pages;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import MyAccount.com.pages.LoginPage;
import MyAcount.com.Base.TestBaseNew;

public class CreateNodePage extends TestBaseNew {

	@FindBy(xpath = "/html/body/app-root/div/app-sidebar/div/nav/ul/li[2]/ul/li[1]/a")
	
	WebElement NodeSection;

	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement AddButton;

	// @FindBy(xpath="/html/body/app-dashboard/div/main/div/ng-component/div/div[1]/nav/a")
	@FindBy(xpath = "//a[contains(text(),' Back ')]")
	WebElement Back;

	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/div/h4")
	WebElement ManageNode;

	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement Create_Button;

	@FindBy(xpath = "//button[contains(text(),' Create My Node ')]")
	WebElement CreateMyNode;

	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/div[2]/div/tabset/div/tab[1]/node-list/div/div[2]/div/div[2]/table/tbody[1]/tr[2]/td/div/div[2]/div/select")
	WebElement DropDown;

	@FindBy(xpath = "/html/body/app-root/div/main/div/register-node/div/form/div[2]/div/div[2]/div[1]/input")
	WebElement NodeName;

	@FindBy(id = "toast-container")
	WebElement Alert;

	@FindBy(xpath = "//*[@id=\"group\"]")
	WebElement GroupFilter;

	@FindBy(xpath = "/html/body/app-root/div/main/div/register-node/div/form/div[3]/div/div[2]/div[1]/input")
	WebElement GroupName;

	@FindBy(xpath = "//label[@class='label-text custom-ellipses']")
	List<WebElement> SshkeyCheckbox;

	@FindBy(xpath = "//label[@class='label-text']")
	WebElement DisablePassword;

	@FindBy(xpath = "//ul[@class='nav nav-tabs']/li")
	List<WebElement> HeaderTab;

	public CreateNodePage() throws IOException

	{
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validatetitle() {
		return driver.getTitle();
	}

	@Test
	public void NodeTextVerify() {
		String str = NodeSection.getText();
		Assert.assertEquals(str, " Nodes");
		System.out.println("Verify Node Section Text: " + str);
	}

	@Test
	public void NodeSection() {
		NodeSection.click();
	}

	@Test
	public void BrowserBack() throws InterruptedException {

		AddButton.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		String str1 = ManageNode.getText();
		Assert.assertEquals(str1, "Manage Nodes");
		System.out.println("Verify back: " + str1);

	}

	@Test
	public void CreateNode_AddButton() throws InterruptedException {

		Thread.sleep(3000);
		Back.click();
		Thread.sleep(3000);
		AddButton.click();
		Thread.sleep(3000);
		// driver.navigate().back();
		Back.click();
		Thread.sleep(3000);
		AddButton.click();
	}

	@Test
	public void HeaderTabs() {

		for (int i = 0; i < HeaderTab.size(); i++) {

			if (HeaderTab.size() != 0) {
				HeaderTab.get(i).click();

			}
			try {
				HeaderTab.get(0).click();
				// System.out.println("Linux Virtual Node Selected");
			} finally {

				// System.out.println("Linux Virtual Node Selected");
			}
		}

	}

	@Test
	public void CreateNode() throws InterruptedException {
		Thread.sleep(5000);
		Create_Button.click();
		Thread.sleep(3000);

		Select Select = new Select(DropDown);
		// Select.selectByIndex(0);
		Select.selectByValue("1");
		System.out.println(DropDown.getAttribute("value"));
		Thread.sleep(2000);
		Create_Button.click();
	}

	@Test
	public void InvalidNodeName() throws InterruptedException {

		NodeName.click();
		NodeName.clear();
		NodeName.sendKeys("Testtochecknodenamemorethan50characterIfMore");
		CreateMyNode.click();

		Thread.sleep(1000);
		String text = "Ensure this field has no more than 25 characters.";
		String pgscr = driver.getPageSource();
		Boolean textVerify = pgscr.contains(text);

		System.out.println("Invalid Node Name: " + textVerify);
	}

	@Test
	public void SshKeyCheckbox() throws IOException, InterruptedException {

		// List<WebElement> SshkeyCHeckbox =
		// driver.findElements(By.xpath("/html/body/app-dashboard/div/main/div/register-node/div/form/div[4]/div[1]/ul/li[1]/span"));
		Thread.sleep(5000);

		for (int i = 0; i < SshkeyCheckbox.size(); i++) {

			if (SshkeyCheckbox.size() != 0) {

				SshkeyCheckbox.get(i).click();
				Thread.sleep(5000);
			}
		}
	}

	@Test
	public void PasswordDisable_Enabled() throws InterruptedException {

		Thread.sleep(3000);
		try {
			DisablePassword.click();
			System.out.println("Selected Successfully");
		} finally {

			// DisablePassword.click();
			// System.out.println("Deselect Successfully");
		}

	}

	@Test
	public void ValidNodeName() throws InterruptedException {

		NodeName.click();
		NodeName.clear();
		NodeName.sendKeys("Testdata");

	}

	@Test
	public void GroupName() throws InterruptedException {
		GroupName.click();
		GroupName.clear();
		GroupName.sendKeys("TestGroup");

		CreateMyNode.click();
		Thread.sleep(1000);
		System.out.println("Node Created Successfully");
	}

	@Test
	public void GroupFilter() throws InterruptedException {
		Thread.sleep(3000);
		GroupFilter.click();
		Select selects = new Select(GroupFilter);
		selects.selectByValue("TestGroup");
	}

}
