package MyAccount.com.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ImeNotAvailableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import MyAcount.com.Base.TestBaseNew;

public class WordPressPage extends TestBaseNew {

	@FindBy(xpath = "//a[@href='/wordpress/dashboard'][contains(text(),'Dashboard')]")
	WebElement WordPressDashboard;

	@FindBy(xpath = "//a[@href='/wordpress/site'][contains(text(),'View All')]")
	WebElement ViewAllSites;
	
	@FindBy(xpath="//a[contains(text(),' Spikecloud WP ')]")
	WebElement Word_PressDashboard; 

	public WordPressPage() throws IOException {

		PageFactory.initElements(driver, this);

	}

	@Test
	public void Dashboard() throws IOException, InterruptedException {
		Word_PressDashboard.click();
		Thread.sleep(2000);
		WordPressDashboard.click();
	}

	@Test
	public void verify_text() throws InterruptedException {

		Thread.sleep(2000);
		String str = driver.findElement(By.xpath("//a[@href='/wordpress/site'][contains(text(),'View All')]"))
				.getText();
		Assert.assertEquals(str, "View All");
		System.out.println("Your Sites: " + str);
	}

	@Test
	public void Sites_data() {

		List<WebElement> allRows = driver.findElements(
				By.xpath("/html/body/app-root/div/main/div/app-dashboard/div/div[2]/div[1]/div/div/div[2]/table"));

		// And iterate over them and get all the cells
		for (WebElement row : allRows) {
			List<WebElement> cells = row.findElements(By.tagName("td"));

			// Print the contents of each cell
			for (WebElement cell : cells) {

				System.out.println("Active or delete sites with visits counts: " + cell.getText());

			}
		}
	}

	@Test
	public void Resource_usage() {

		String Resources = driver.findElement(By.xpath("//div/h5[contains(text(),'Resource usage')]")).getText();
		Assert.assertEquals(Resources, "Resource usage");
		System.out.println("ResourcesUsageText: " + Resources);

		String Date = driver
				.findElement(
						By.xpath("/html/body/app-root/div/main/div/app-dashboard/div/div[2]/div[2]/div/div/h5/span"))
				.getText();
		System.out.println("Plan validation date: " + Date);

	}

	@Test
	public void PlanVerify() {

		String Plan = driver.findElement(By.xpath("//div/h5[contains(text(),'Plans')]")).getText();
		Assert.assertEquals(Plan, "Plans");
		//System.out.println(Plan);
		String Plans = driver
				.findElement(By.xpath("//a[@href='/wordpress/pricing-table'][contains(text(),'View All')]")).getText();
		Assert.assertEquals(Plans, "View All");
		System.out.println("Available Text: " + Plan + " " + Plans);
	}

	
	@Test
	public void plandata() {
		List <WebElement> rows = driver.findElements(By.xpath("/html/body/app-root/div/main/div/app-dashboard/div/div[2]/div[3]/div/div/div[2]"));
		
		for(WebElement row : rows) {
			
			List<WebElement> cells = row.findElements(By.tagName("td"));
			
			for(WebElement cell : cells) {
				
				System.out.println("Available plan with Name, End at and status: " + cell.getText());
			}
	}
		
		
	}
	
	@Test
	public void sitevisit() {
		
		String Sites = driver.findElement(By.xpath("//div/h5[contains(text(),'Total Visits Accross Site')]")).getText();
		String strs= driver.getPageSource();
		String text= "Total Visits Accross Site";
		Boolean b = strs.contains(text);
		System.out.println(b);
		
		//String SiteDates = driver.findElement(By.xpath("/html/body/app-root/div/main/div/app-dashboard/div/div[3]/div/div/div/h5/span")).getText();
		System.out.println(Sites);
	}
	
}
