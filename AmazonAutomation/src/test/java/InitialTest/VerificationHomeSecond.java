package InitialTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.Base;
import POMClasses.ApplicationHeaderPage;
import POMClasses.SignInPage;

public class VerificationHomeSecond {
	WebDriver driver;
	SignInPage signin;
	ApplicationHeaderPage applicationHeader;
	
	@Parameters("browserName")
	@BeforeTest
	public void launchCrossBrowser1(String browser)
	{
		if(browser.equals("Chrome"))
		{
			driver=Base.openCromeBrowser();
			System.out.print("Open Crome Browser");
		}
		if(browser.equals("Firefox"))
		{
			driver=Base.openFireFoxBrowser();
			System.out.print("Open FireFox Browser");
		}
		if(browser.equals("Edge"))
		{
			driver=Base.openEdgeBrowser();
			System.out.print("Open Edge Browser");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPOMClassObj1() {
		signin=new SignInPage(driver);
		applicationHeader=new ApplicationHeaderPage(driver);
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginMethod() throws InterruptedException
	{
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        signin=new SignInPage(driver);
		signin.sendEmailorMobile();
		Thread.sleep(3000);
		signin.selectContinueButton();
		Thread.sleep(3000);
		signin.sendPassword();
		Thread.sleep(3000);
		signin.selectSignInButton();
		Thread.sleep(3000);
		applicationHeader=new ApplicationHeaderPage(driver);
	}
	@Test
	public void menuClickMethod() throws InterruptedException
	{
		applicationHeader.clickOnDeliveryAddrPopup();
		applicationHeader.todaysDeal();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		Thread.sleep(3000);
	}
	@Test
	public void srearchDropdownList() throws InterruptedException
	{
		    //applicationHeader=new ApplicationHeaderPage(driver);
		  // applicationHeader.clickOnDeliveryAddrPopup();
		    Thread.sleep(3000);
			applicationHeader.searchDropDown();
			Thread.sleep(3000);
			applicationHeader.clickOnSearchBtn();
			Thread.sleep(3000);
			String url=driver.getCurrentUrl();
			String title=driver.getTitle();
			System.out.println(url);
			System.out.println(title);
	}
	
	@AfterMethod(alwaysRun =true)
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(3000);
	    applicationHeader.accountLists(driver);
		//System.out.println("logouthere");
	}
	@AfterClass(alwaysRun = true)
	public void clearObj() 
	{
		signin=null;
		applicationHeader=null;
		
	}
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		System.out.println("------?????-----");
		driver=null;
		System.gc();
		}
	

}
