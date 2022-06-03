package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver openCromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\ChromeBrowserNewVersion\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	
	public static WebDriver openFireFoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumFiles\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
		
	}
	public static WebDriver openEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver","C:\\SeleniumFiles\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
		
	}
}
	

