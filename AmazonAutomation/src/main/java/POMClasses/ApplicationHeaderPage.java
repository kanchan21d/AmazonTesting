package POMClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


public class ApplicationHeaderPage {
	

	@FindBy (xpath="(//div[@class='nav-right'])[2]//div[1]//a[2]")
	private WebElement accountList;
	
	@FindBy (xpath="//a[@id='nav-item-signout']")
	private WebElement signout;
	
	@FindBy (xpath="(//a[@data-nav-role='signin'])[2]")
	private WebElement signInButton;
	
	@FindBy (xpath="//input[@data-action-type='DISMISS']")
	private WebElement DeliveryAddrPopup;
	
	@FindBy (xpath="//a[@id='nav-logo-sprites']")
	private WebElement amazonLogo;
	
	@FindBy (xpath="//a[@id='nav-global-location-popover-link']")
	private WebElement deliveryToIndia;
	
	
	@FindBy (xpath="//select[@id='searchDropdownBox']")
	private WebElement searchDropDownBox;
	
	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchTextBox;
	
	@FindBy (xpath="//input[@id='nav-search-submit-button']")
	private WebElement btnSearch;
	
	@FindBy (xpath="//a[@id='icp-nav-flyout']")
	private WebElement chooseLanguageForShopping;
	
	@FindBy (xpath="//a[@id='nav-orders']")
	private WebElement returnAndOrders;
	
	@FindBy (xpath="//a[@id='nav-cart']")
	private WebElement cartButton;
	//New
	@FindBy (xpath="//a[contains(text(),'Deals')]")
	private WebElement todaysDealMenu;
	
	@FindBy (xpath="//a[contains(text(),'Buy Again')]")
	private WebElement buyAgainMenu;
	
	@FindBy (xpath="//a[contains(text(),'Customer Service')]")
	private WebElement customerServiceMenu;
	
	@FindBy (xpath="//a[@id='nav-recently-viewed']")
	private WebElement browsingHistoryMenu;
	
	@FindBy (xpath="//a[contains(text(),'Gift Cards')]")
	private WebElement giftCardMenu;
	
	@FindBy (xpath="//a[contains(text(),'Registry')]")
	private WebElement registryMenu;
	
	@FindBy (xpath="(//a[contains(text(),'Sell')])[1]")
	private WebElement cellMenu;
	
	public ApplicationHeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
public void accountLists(WebDriver driver) throws InterruptedException
{
    Actions act=new Actions(driver);
	act.moveToElement(accountList).moveToElement(signout).click().build().perform();
	Thread.sleep(2000);
    accountList.click();
	
}

public void selectSignInButton()
{
	signInButton.click();
}

public void clickOnDeliveryAddrPopup()
{
	DeliveryAddrPopup.click();
	}


public void AmazonLogo()
{
	amazonLogo.click();
}

public void DeliveryToIndia()
{
	deliveryToIndia.click();
}

	
public void searchDropDown()
{
	//searchDropDownBox.click();
	Select sc=new Select(searchDropDownBox);
	sc.selectByValue("search-alias=baby-products-intl-ship");
	
	
}

public void searchTextBoxmain()
{
	searchTextBox.sendKeys("mobile");
}
public void clickOnSearchBtn()
{
	btnSearch.click();
}

public void selectChooseLanguageForShopping()
{
	chooseLanguageForShopping.click();
	
}

public void selectReturnAndOrders()
{
	returnAndOrders.click();
}

public void selectCartButton()
{
	cartButton.click();
}
//new
public void todaysDeal()
{
	todaysDealMenu.click();
	
}

public void buyAgain()
{
	buyAgainMenu.click();
}

public void customerService()
{
	customerServiceMenu.click();
}

public void browsingHistory()
{
	browsingHistoryMenu.click();
}

public void giftCard()
{
	giftCardMenu.click();
}

public void registry()
{
	registryMenu.click();
}

public void cellMenuee()
{
	cellMenu.click();
}


}
