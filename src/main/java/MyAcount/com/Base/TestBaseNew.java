   package MyAcount.com.Base;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import MyAccount.com.Util.TestUtil;

import java.util.*;

public class TestBaseNew {

	public static WebDriver driver;
	public static Properties prop;

	public TestBaseNew() throws IOException {
		try {
			prop = new Properties();

			try {
				FileInputStream ip = new FileInputStream(".\\Config\\config.properties");
				prop.load(ip);

			} catch (Exception e) {
				FileInputStream ip = new FileInputStream("src/main/java/MyAccount/com/Config/config.properties");
				prop.load(ip);

			}

			String browserName = prop.getProperty("browser");
			System.out.println("Browser Name: " + browserName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@BeforeTest
	public static void inititalization() throws Exception {
		// System.out.println("Intialization");
		String browser = prop.getProperty("browser");

		/* String os = System.getProperty("os.name").toLowerCase(); */

		if (browser.equalsIgnoreCase("Firefox")) {
			// create firefox instance
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
		}
		// Check if parameter passed as 'Edge'
		else if (browser.equalsIgnoreCase("Edge")) {
			// set path to Edge.exe
			System.setProperty("webdriver.edge.driver", ".\\Drivers\\IEDriverServer.exe");
			// create Edge instance
			driver = new InternetExplorerDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.manage().window().maximize();
		Dimension d = new Dimension(1550, 800);
		// Resize the current window to the given dimension
		driver.manage().window().setSize(d);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

	@AfterMethod(enabled=false)
	public void screenShot(ITestResult result) {
		Date date = new Date();
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		if (ITestResult.FAILURE == result.getStatus()) {
			try {

				// TakesScreenshot screenshot=(TakesScreenshot)driver;
				File scrFile = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
				FileUtils.copyFile(scrFile, new File(".\\Pictures\\Screen\\Images" + result.getName()+ " " +timestamp+ ".png"));

				System.out.println("Successfully captured a screenshot");

			} catch (Exception e) {

				System.out.println("Exception while taking screenshot " + e.getMessage());

			}
		}

/*	@Test
	public void startTests() {

		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");

		test = report.startTest("ExtentDemo");
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/learn_automation2.html");
		
	    extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);

	}*/
}

}
