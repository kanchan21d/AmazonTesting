package InitialTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Browsers.Base;
import POMClasses.SampleClass;
import Utils.Utility;

public class SampleTestClass {
	
	WebDriver driver;
	SampleClass search;
	
	@Parameters("browserName")
	@BeforeTest
	public void launchCrossBrowser(String browser)
	{
		if(browser.equals("Edge"))
		{
			
			driver=Base.openEdgeBrowser();
			System.out.print("Open Edge Browser");
		}
		if(browser.equals("Chrome"))
		{
			driver=Base.openCromeBrowser();
			System.out.print("Open Chrome Browser");
		}
		if(browser.equals("Firefox"))
		{
			driver=Base.openFireFoxBrowser();
			System.out.print("Open Firefox Browser");
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPOMClassObj() {
		search = new SampleClass(driver);
		
		System.out.println("Hii");
	}	
	@BeforeMethod
	public void loginToApplication(){
	driver.get("https://www.amazon.in/");
	}
	@Test(priority = 2)
	public void urlandtitleverfy() {
		System.out.println("Test2");
		String title = driver.getTitle();
		//System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", title);	
		//Assert.assertEquals("https://www.amazon.in/", url);	
		
	}
	@Test(priority = 1)
	public void search() throws InterruptedException {
	
	search.clicksearch();
	search.clicksearchsubmit();
	String url=driver.getCurrentUrl();
	System.out.println("Test1");
	Assert.assertEquals("https://www.amazon.in/s?k=Chairs&ref=nb_sb_noss", url);
	Thread.sleep(1000);
	}
	@Test(priority = 3)
	public void searchByAllCategory() throws InterruptedException {
	SampleClass search = new SampleClass(driver);
	search.clickAllCategories();
	Thread.sleep(2000);
	search.accountlist(driver);
	search.clicksearch();
	Thread.sleep(2000);
	search.clicksearchsubmit();
	Thread.sleep(2000);
	System.out.println("Test3");
	} 
	@AfterMethod
	public void logoutToApplication(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenshotAs(driver, result.getName());
		}
		
		
		System.out.println("We are tester");	
	}
	@AfterClass 
	public void clearObject()
	{
		search=null;
	}
	
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		System.out.println("------?????-----");
		driver=null;
		System.gc();
		}
	

}
