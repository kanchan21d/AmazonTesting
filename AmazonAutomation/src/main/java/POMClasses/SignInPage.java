package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	

	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement emailOrMobile;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy (xpath="//a[text()='Conditions of Use']")
	private WebElement agreeToAmazonCondition;

	@FindBy (xpath="//i[@class='a-icon a-icon-expand']")
	private WebElement needHelp;
	
	@FindBy (xpath="//a[@id='createAccountSubmit']")
	private WebElement createYourAmazonAccount;
	
	@FindBy (xpath="//input[@id='ap_password']")
	private WebElement password;  
	
	@FindBy (xpath="//a[contains(text(),' Forgot your password?')]")
	private WebElement forgotYourPassword;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement signInButton;
	
	@FindBy (xpath="//input[@type='checkbox']")
	private WebElement keepMeSignedIn;
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmailorMobile()
	{
		emailOrMobile.sendKeys("kanchan21d@gmail.com");
	}
	
	
	public void selectContinueButton()
	{
		continueButton.click();
	}
	
	public void selectAgreeToAmazonCondition()
	{
		agreeToAmazonCondition.click();
	}
	
	public void selectNeedHelp()
	{
		needHelp.click();
	}
	
	public void sendPassword()
	{
		password.sendKeys("Spruha30");;
	}
	
	public void ForgotYourPassword()
	{
		forgotYourPassword.click();
	}
	
	public void selectSignInButton()
	{
		signInButton.click();
	}
	
	public void selectKeepMeSignedIn()
	{
		keepMeSignedIn.click();
	}
	
	
	
}
