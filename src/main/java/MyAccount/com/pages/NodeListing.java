package MyAccount.com.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import MyAcount.com.Base.TestBaseNew;

public class NodeListing extends TestBaseNew {

	// OR of Login Page>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	// click to node tab
	@FindBy(xpath = "/html/body/app-root/div/app-sidebar/div/nav/ul/li[2]/ul/li[1]/a")
	WebElement nodes;

	// click to lock node
	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/ng-component/div/tabset/div/tab[1]/div/div[3]/table/tbody/tr[3]/td/div/button")
	WebElement locknode;

	// open popoup and click lock button
	@FindBy(xpath = "/html/body/modal-container/div/div/node-confirm-dialog/div/div/div[3]/button")
	WebElement popup_locknode;

//click to unlock button
	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/ng-component/div/tabset/div/tab[1]/div/div[3]/table/tbody/tr[3]/td/button")
	WebElement unlock_node;

//click to unlock popup button
	@FindBy(xpath = "/html/body/modal-container/div/div/node-confirm-dialog/div/div/div[3]/button")
	WebElement popup_unlocknode;

//click to access console button
	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/ng-component/div/tabset/div/tab[1]/div/div[3]/table/tbody/tr[2]/td/button")
	WebElement access_console;

	// @FindBy(xpath="/html/body/app-dashboard/div/main/div/ng-component/div/ng-component/div/div[2]/table/tbody/tr[2]/td[1]/label/span")
	// WebElement checkbox;

//click to monitoring tab
	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/ng-component/div/tabset/ul/li[2]/a/span")
	WebElement monitoring;
//click to nodedetails tab
	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/ng-component/div/tabset/ul/li[1]/a/span")
	WebElement nodedetails;

// rename name
	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/ng-component/div/tabset/div/tab[1]/div/div[1]/table/tbody/tr[3]/td[2]/div/i")
	WebElement nodeclick;

// Clear name
	@FindBy(xpath = "//*[@id=\"new_name\"]")
	WebElement nameclear;

// enter name
	@FindBy(xpath = "//*[@id=\"new_name\"]")
	WebElement rename;

//click to right icon on rename node	
	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/ng-component/div/tabset/div/tab[1]/div/div[1]/table/tbody/tr[3]/td[2]/i[1]")
	WebElement chkrightclick;

//click to action drop down	
	// @FindBy(xpath = "//*[@id=\"1\"]/td[6]/div/button")
	@FindBy(xpath = "//button[contains(text(),' Actions')]")
	WebElement actions_btn;

//click to reboot button	
	// @FindBy(xpath = "/html/body/bs-dropdown-container/div/ul/li[4]")
	@FindBy(xpath = "//li[contains(text(),' Reboot')]")
	WebElement reboot;

//click to check reboot on popup	
	@FindBy(xpath = "//*[@id=\"confirmChk\"]")
	WebElement chk_reboot;

//click to reboot button on popup	
	@FindBy(xpath = "/html/body/modal-container/div/div/node-confirm-dialog/div/div/div[3]/button")
	WebElement btn_reboot;

//search node
	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/div/div[1]/div[1]/div/div[2]/input")
	WebElement searchnode;

	// clear node name
	@FindBy(xpath = "/html/body/app-root/div/main/div/ng-component/div/ng-component/div/div[1]/div[1]/div/div[2]/input")
	WebElement clearnodename;

// click to actions
	/*
	 * @FindBy(xpath = "//*[@id=\"1\"]/td[6]/div/button") WebElement
	 * actions_btn_again;
	 */

//click to power off button in drop down list	
	@FindBy(xpath = "//li[contains(text(),' Power Off')]")
	WebElement poweroffbtn;

//click to check on the power off button popup	
	@FindBy(xpath = "//*[@id=\"confirmChk\"]")
	WebElement chk_poweroff;

//click power off button	
	@FindBy(xpath = "/html/body/modal-container/div/div/node-confirm-dialog/div/div/div[3]/button")
	WebElement clicks_poweroffbtn;

	// Save Image

//click to actions drop down for save image
	/*
	 * @FindBy(xpath = "//*[@id=\"1\"]/td[6]/div/button") WebElement
	 * actions_buttonforsave;
	 */

//clicks to save button
	@FindBy(xpath = "/html/body/bs-dropdown-container/div/ul/li[5]")
	WebElement clicks_save;

//open popup and enter save image name
	@FindBy(xpath = "//*[@id=\"image_name\"]")
	WebElement enter_name;

//click to save image button
	@FindBy(xpath = "/html/body/modal-container/div/div/app-save-node-image/div/div[2]/form/fieldset/div[2]/button")
	WebElement click_saveimagebtn;

//clicks saved image
	@FindBy(xpath = "/html/body/app-dashboard/div/main/div/ng-component/div/ng-component/div/div[1]/div[2]/button[1]")
	WebElement savedimagebtn;

//click to pagination 2
	@FindBy(xpath = "/html/body/app-dashboard/div/main/div/ng-component/div/app-saved-images/div/div/div/pagination-controls/pagination-template/ul/li[4]/a/span[2]")
	WebElement pagination;

//click to actions
	@FindBy(xpath = "/html/body/app-dashboard/div/main/div/ng-component/div/app-saved-images/div/div/table/tbody/tr[1]/td[7]/div/button")
	WebElement actions_button;

//click add
	@FindBy(xpath = "/html/body/bs-dropdown-container/div/ul/li[2]")
	WebElement click_add;

	// addsave image-create
	@FindBy(xpath = "//*[@id=\"tbl\"]/table/tbody[1]/tr[1]/td[9]/button")
	WebElement create_saveimg;

	// click create node
	@FindBy(xpath = "//*[@id=\"register-node\"]/div[7]/div/div/button")
	WebElement createnode_save;

	@FindBy(xpath = "//tr//td[contains(text(),'Running')]")
	List<WebElement> RunningState;

	@FindBy(xpath = "//td[contains(text(),'Running ')]/following::td//div//button[text()=' Actions ']")
	List<WebElement> Actions;

	@FindBy(xpath= "//td[contains(text(),' PowerOff ')]/following::td//div//button[text()=' Actions ']")
	List<WebElement> poffAction;
	
//	//start
//	@FindBy(xpath="/html/body/bs-dropdown-container/div/ul/li[2]")
//	WebElement clicks_start;
//	
//	//open popup
//	@FindBy(xpath="/html/body/modal-container/div/div/node-confirm-dialog/div/div/div[3]/button")
//	WebElement clicks_startbtn;
//	

//	@FindBy(xpath="/html/body/app-dashboard/div/main/div/ng-component/div/ng-component/ng-component/div/tabset/div/tab[1]/div/div[3]/table/tbody/tr[4]/td/button")
//	WebElement reinstall_node;
//	
//	@FindBy(xpath="/html/body/modal-container/div/div/node-confirm-dialog/div/div/div[3]/button")
//	WebElement popup_reinstall;

	// initialising Pagefactory object
	public NodeListing() throws IOException

	{

		PageFactory.initElements(driver, this);
	}

	// Actions:
//	public String validateLoginPageTitle() {
//		return driver.getTitle();
//	}
//
//	public boolean validatee2elogo() {
//		return logo.isDisplayed();
//	}

	public void LockNode() throws IOException, InterruptedException {
		nodes.click();
		Thread.sleep(1000);

		// RunningState.click();

		for (int i = 0; i < RunningState.size(); i++) {
			if (RunningState.size() != 0) {
				RunningState.get(0).click();

				// tr//td[contains(text(),'Running ')]and//tr//
				break;

			}
			/*
			 * try { System.out.println("Test"); } finally {
			 * 
			 * AnyoneRunningState.get(0).click(); }
			 */

		}
		// clicks_checkbox.click();
		Thread.sleep(1000);

//		clicks_actions.click();
//		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,550)");
		Thread.sleep(2000);

		locknode.click();
		Thread.sleep(2000);

		popup_locknode.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollBy(0,-550)");
		Thread.sleep(2000);

	}

	public void unlocknode() throws IOException, InterruptedException {
		// clicks_actions_again.click();
		Thread.sleep(3000);
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollBy(0,550)");
		Thread.sleep(3000);
		unlock_node.click();
		Thread.sleep(3000);
		popup_unlocknode.click();
		Thread.sleep(5000);
	}
	// reinstall_node.click();
	// Thread.sleep(3000);

	// popup_reinstall.click();
	public void accessconsole() throws IOException, InterruptedException {

		Thread.sleep(2000);
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollBy(0,-550)");
		Thread.sleep(6000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("window.scrollBy(0,550)");
		Thread.sleep(3000);
		access_console.click();
		ArrayList<String> gettingstartedtab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(gettingstartedtab.get(1));
		Thread.sleep(5000);
		// verify the url of getting started page
		String gettingstartedURL = driver.getCurrentUrl();
		// Assert.assertEquals(gettingstartedURL,
		// "https://myaccount.e2enetworks.com/open_vnc?host=one.e2enetworks.com&port=29876&token=5428786711fb48f58cc59&title=C2-15GB-CentOS-8-0-832&password=c074df88922c5401a4391bdbaa919502fd0d6eaf&vnc_id=44933");
		System.out.println(gettingstartedURL);
		driver.switchTo().window(gettingstartedtab.get(0));
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		// driver.navigate().refresh();
	}

	public void monitoring() throws IOException, InterruptedException {

		// Thread.sleep(2000);
		Thread.sleep(4000);
		// checkbox.click();
		// Thread.sleep(3000);
		monitoring.click();
		Thread.sleep(3000);
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("window.scrollBy(0,450)");
		// scroll up
		Thread.sleep(2000);
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("window.scrollBy(0,-550)");
		Thread.sleep(4000);
		nodedetails.click();
		Thread.sleep(4000);
	}

	public void renamenode() throws IOException, InterruptedException {

		// Thread.sleep(2000);
		Thread.sleep(4000);
		// checkbox.click();
		// Thread.sleep(3000);
		nodeclick.click();
		Thread.sleep(2000);
		nameclear.clear();
		Thread.sleep(4000);
		rename.sendKeys("testnode121");
		Thread.sleep(3000);
		chkrightclick.click();
	}

	// Reboot
	public void rebootbtn() throws IOException, InterruptedException {
		nodes.click();
		Thread.sleep(3000);
//		for (int i = 0; i < RunningState.size(); i++) {
//			if (RunningState.size() != 0) {
//
//				RunningState.get(0).click();
//
//			}
//
//			try {
//				System.out.println();
//
//			}
//
//			finally {

				for (int j = 0; j < Actions.size(); j++) {

					if (Actions.size() != 0) {

						Actions.get(0).click();
						Thread.sleep(1000);
						reboot.click();
						Thread.sleep(2000);
						chk_reboot.click();
						Thread.sleep(2000);
						btn_reboot.click();
						Thread.sleep(13000);

						break;
					}
				}

//			}
//
//		}

		/*
		 * Thread.sleep(3000); //actions_btn.click(); Thread.sleep(3000);
		 * reboot.click(); Thread.sleep(2000); chk_reboot.click(); Thread.sleep(2000);
		 * btn_reboot.click(); Thread.sleep(13000);
		 */

	}

	public void nodesearching() throws IOException, InterruptedException {
		Thread.sleep(3000);
		searchnode.sendKeys("testnode121");
		Thread.sleep(3000);
		clearnodename.clear();
	}

	public void poweroffbtn() throws IOException, InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(10000);

		driver.navigate().refresh();
//		for (int i = 0; i < RunningState.size(); i++) {
//			if (RunningState.size() != 0) {
//
//				RunningState.get(0).click();
//
//			}
//
//			try {
//				System.out.println();
//
//			}
//
//			finally {

				for (int j = 0; j < Actions.size(); j++) {

					if (Actions.size() != 0) {

						Actions.get(0).click();
						Thread.sleep(1000);

						// actions_btn_again.click();
						Thread.sleep(4000);
						poweroffbtn.click();
						Thread.sleep(3000);
						chk_poweroff.click();
						Thread.sleep(2000);
						clicks_poweroffbtn.click();
						Thread.sleep(2000);
						// scrolldown
						JavascriptExecutor jse7 = (JavascriptExecutor) driver;
						jse7.executeScript("window.scrollBy(0,450)");

						break;
					}

				}
			}
//		}
//	}

	public void saveimagebutton() throws IOException, InterruptedException {
		for (int i = 0; i < poffAction.size(); i++) {
			if (poffAction.size() != 0) {

				poffAction.get(0).click();
		// scroll up
		Thread.sleep(2000);
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("window.scrollBy(0,-550)");
		Thread.sleep(2000);
		// actions_buttonforsave.click();
		Thread.sleep(2000);
		clicks_save.click();
		Thread.sleep(2000);
		enter_name.sendKeys("testsaved4");
		Thread.sleep(2000);
		click_saveimagebtn.click();
		Thread.sleep(7000);
	}}}

	public void savedimagebutton() throws IOException, InterruptedException {

		savedimagebtn.click();
		Thread.sleep(2000);
		pagination.click();
		Thread.sleep(2000);
		actions_button.click();
		Thread.sleep(2000);
		click_add.click();
		Thread.sleep(2000);
		create_saveimg.click();
		// clicks_start.click();
		// Thread.sleep(2000);
		Thread.sleep(3000);
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("window.scrollBy(0,450)");
		// clicks_startbtn.click();
		Thread.sleep(2000);
		createnode_save.click();
		Thread.sleep(2000);

		driver.navigate().refresh();
	}

	public void againrunnigstate() throws IOException, InterruptedException {

		// RunningState.click();

		for (int i = 0; i < RunningState.size(); i++) {
			if (RunningState.size() != 0) {
				RunningState.get(0).click();
			}
		}
	}
}
