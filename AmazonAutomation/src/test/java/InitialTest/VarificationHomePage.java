package InitialTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMClasses.ApplicationHeaderPage;
import POMClasses.HomePage;
import POMClasses.SignInPage;

public class VarificationHomePage {
	WebDriver driver;
	SignInPage signin;
	HomePage home;
	ApplicationHeaderPage applicationHeader;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite TestClass");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test TestClass");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ChromeBrowserNewVersion\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    ////driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
	}
	
	@BeforeMethod
	public void signinIntoApplication()
	{
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		signin=new SignInPage(driver);
		signin.sendEmailorMobile();
		signin.selectContinueButton();
		signin.sendPassword();
		signin.selectSignInButton();
		
		//home=new HomePage(driver);
	}
	
	@Test
	public void verifySearchDropdown() throws InterruptedException 
	{
		applicationHeader=new ApplicationHeaderPage(driver);
	  // applicationHeader.clickOnDeliveryAddrPopup();
		applicationHeader.searchDropDown();
		applicationHeader.clickOnSearchBtn();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		Assert.assertEquals("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Dbaby-products-intl-ship&field-keywords=", url);
		Assert.assertEquals("International Shopping: Shop Baby products that ship Internationally", title);
   }
    @Test()
	public void verifyTodaysDeal() throws InterruptedException
	{
		applicationHeader=new ApplicationHeaderPage(driver);
		Thread.sleep(3000);
		applicationHeader.todaysDeal();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
	    Assert.assertEquals("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb", url);
	    Assert.assertEquals("Amazon.com - Today's Deals", title);

		  
		
	}
	@AfterMethod
	public void logoutApp() throws InterruptedException
	{
		Thread.sleep(5000);
		applicationHeader.accountLists(driver);
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Before Suite TestClass");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Before Test TestClass");
	}
	
	
	

}
