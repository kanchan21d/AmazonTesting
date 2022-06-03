package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath="//a[@class='a-carousel-goto-prevpage']")
	private WebElement imgGoToPreviousPage;
	
	@FindBy (xpath="//a[@class='a-carousel-goto-nextpage']")
	private WebElement imgGoToNextPage;
	
	@FindBy (xpath="//a[contains(text(),'Click here to go to amazon.in')]")
	private WebElement clickheregotoAmazonDotIn;
	
	@FindBy (xpath="(//span[contains(text(),'Keep shopping for')])[1]")
	private WebElement keepShoppingFor;
	
	@FindBy (xpath="(//div[@id='b-mlLQJ6zExF1XUMUekhlw']//div)[3]//a[1]//img")
	private WebElement imgNintendoSwitchSports;
	
	@FindBy (xpath="(//div[@id='b-mlLQJ6zExF1XUMUekhlw']//div)[3]//a[2]//img")
	private WebElement imgTwopackLegStrap;
	
	@FindBy (xpath="(//div[@id='b-mlLQJ6zExF1XUMUekhlw']//div)[3]//a[3]//img")
	private WebElement imgSwitchSportsAccessoriesBundle;
	

	@FindBy (xpath="(//div[@id='b-mlLQJ6zExF1XUMUekhlw']//div)[3]//a[4]//img")
	private WebElement instantSports;

	@FindBy (xpath="//div[@id='YExWtcm16c90jwUfNctPGg']//div[1]//h2")
	private WebElement shopByCategory;
	
	@FindBy (xpath="(//div[@id='YExWtcm16c90jwUfNctPGg']//div)[4]//a")
	private WebElement computersAndAccessories;
	
	@FindBy (xpath="(//div[@id='YExWtcm16c90jwUfNctPGg']//div)[7]//a")
	private WebElement videoGames;
	
	@FindBy (xpath="(//div[@id='YExWtcm16c90jwUfNctPGg']//div)[11]//a")
	private WebElement baby;
	
	@FindBy (xpath="(//div[@id='YExWtcm16c90jwUfNctPGg']//div)[14]//a")
	private WebElement toysAndGames;
	
	@FindBy (xpath="(//div[@id='YExWtcm16c90jwUfNctPGg']//div)[17]//a")
	private WebElement shopNowtoysAndGames;
	
	@FindBy (xpath="//div[@id='wij0cvElLJRE2C6rXQpepA']//h2")
	private WebElement healthAndPersonalcare;
	
	@FindBy (xpath="//div[@id='wij0cvElLJRE2C6rXQpepA']//div[2]//img")
	private WebElement imghealthAndPersonalcare;
	
    @FindBy (xpath="//div[@id='wij0cvElLJRE2C6rXQpepA']//div[3]//a")
	private WebElement shopNowhealthAndPersonalcare;
    
    @FindBy (xpath="//div[@id='-VBwCsTsFPWNVrvzj5GYCw']//div[1]//h2")
	private WebElement getFitAtHome;
    
    @FindBy (xpath="//div[@id='-VBwCsTsFPWNVrvzj5GYCw']//div[2]//img")
	private WebElement imgGetFitAtHome;
    
    @FindBy (xpath="//div[@id='-VBwCsTsFPWNVrvzj5GYCw']//div[3]//a")
	private WebElement exploreNowGetFitAtHome;
    
    @FindBy (xpath="//div[@id='48_Ifly406MWpmVtUN4B3A']//div[1]//h2")
	private WebElement beautyPicks;
    
    @FindBy (xpath="//div[@id='48_Ifly406MWpmVtUN4B3A']//div[2]//img")
	private WebElement imgbeautyPicks;
    
    @FindBy (xpath="//div[@id='48_Ifly406MWpmVtUN4B3A']//div[3]//a")
	private WebElement shopNowBeautyPicks;
    
    @FindBy (xpath="//div[@id='SGd8yKNHANYgMV5VHkehbA']//h2")
	private WebElement dealOftheDay;
    
    @FindBy (xpath="//div[@id='SGd8yKNHANYgMV5VHkehbA']//div[2]//img")
	private WebElement imgDealOftheDay;
    
    @FindBy (xpath="//div[@id='SGd8yKNHANYgMV5VHkehbA']//div[3]//a")
   	private WebElement seeAllDeals;
    
    @FindBy (xpath="//div[@id='19TjUlKXFyB9afN4xR9T5w']//h2")
   	private WebElement compAndAccessories;
    
    @FindBy (xpath="//div[@id='19TjUlKXFyB9afN4xR9T5w']//div[2]//img")
   	private WebElement imgcompAndAccessories;
    
    @FindBy (xpath="//div[@id='19TjUlKXFyB9afN4xR9T5w']//div[3]//a")
   	private WebElement shopNowcompAndAccessories;
    
    @FindBy (xpath="//div[@id='sFYTi0eOBQuwGQ2U5pw7HQ']//h2")
   	private WebElement dealsAndPromotions;
    
    @FindBy (xpath="//div[@id='sFYTi0eOBQuwGQ2U5pw7HQ']//div[2]//img")
   	private WebElement imgDealsAndPromotions;
    
    @FindBy (xpath="//div[@id='sFYTi0eOBQuwGQ2U5pw7HQ']//div[3]//a")
   	private WebElement shopNowDealsAndPromotions;
    
    @FindBy (xpath="//div[@id='yiJF-vzP9r0ul-SpITKifQ']//h2")
   	private WebElement electronics;
    
    @FindBy (xpath="//div[@id='yiJF-vzP9r0ul-SpITKifQ']//div[2]//img")
   	private WebElement imgelectronics;
    
    @FindBy (xpath="//div[@id='yiJF-vzP9r0ul-SpITKifQ']//div[3]//a")
   	private WebElement seeMoreElectronics;
   
    public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonimgGoToPreviousPage()
	{
		imgGoToPreviousPage.click();
	}
	
	public void imggotoNextPage()
	{
		imgGoToNextPage.click();
	}
	
	public void clickongotoAmazonDotIn()
	{
		clickheregotoAmazonDotIn.click();
	}
	
	public void clickonkeepShoppingFor()
	{
		keepShoppingFor.getText();
	}
	
	public void clickonimgNintendoSwitchSports()
	{
		imgNintendoSwitchSports.click();
	}
	
	public void clickOnimgTwopackLegStrap()
	{
		imgTwopackLegStrap.click();
	}
	
	public void clickOnimgSwitchSportsAccessoriesBundle()
	{
		imgSwitchSportsAccessoriesBundle.click();
	}
	
	public void clickOninstantSports()
	{
		instantSports.click();
	}
	
	public void clickOnshopByCategory()
	{
		shopByCategory.click();
	}
	
	public void clickOncomputersAndAccessories()
	{
		computersAndAccessories.click();
	}
	
	public void ClickOnvideoGames()
	{
		videoGames.click();
	}
	
	public void clickOnbaby()
	{
		baby.click();
	}
	
	public void clickOntoysAndGames()
	{
		toysAndGames.click();
	}
	
	public void clickOnshopNowtoysAndGames()
	{
		shopNowtoysAndGames.click();
	}
	
	public void clickOnhealthAndPersonalcare()
	{
		healthAndPersonalcare.click();
	}
	
	public void clickOnimghealthAndPersonalcare()
	{
		imghealthAndPersonalcare.click();
	}
	
	public void clickOnshopNowhealthAndPersonalcare()
	{
		shopNowhealthAndPersonalcare.click();
	}
	
	public void clickOngetFitAtHome()
	{
		getFitAtHome.click();
	}
	
	public void clickOnimgGetFitAtHome()
	{
		imgGetFitAtHome.click();
	}
	
	public void clickOnexploreNowGetFitAtHome()
	{
		exploreNowGetFitAtHome.click();
	}
	
	public void clickOnbeautyPicks()
	{
		beautyPicks.click();
	}
	
	public void clickOnimgbeautyPicks()
	{
		imgbeautyPicks.click();
	}
	
	public void clickOnshopNowBeautyPicks()
	{
		shopNowBeautyPicks.click();
	}
	
	public void clickOndealOftheDay()
	{
		dealOftheDay.click();
	}
	
	public void clickOnimgDealOftheDay()
	{
		imgDealOftheDay.click();
	}
	
	public void clickOnseeAllDeals()
	{
		seeAllDeals.click();
	}
	
	public void clickOncompAndAccessories()
	{
		compAndAccessories.click();
	}
	
	public void clickOnimgcompAndAccessories()
	{
		imgcompAndAccessories.click();
	}
	
	public void clickOnshopNowcompAndAccessories()
	{
		shopNowcompAndAccessories.click();
	}
	
	public void clickOndealsAndPromotions()
	{
		dealsAndPromotions.click();
	}
	
	public void clickOnimgDealsAndPromotions()
	{
		imgDealsAndPromotions.click();
	}
	
	public void clickOnshopNowDealsAndPromotions()
	{
		shopNowDealsAndPromotions.click();
	}
	
	public void clickNoshopNowDealsAndPromotions()
	{
		shopNowDealsAndPromotions.click();
	}
	
	public void clickOnelectronics()
	{
		electronics.click();
	}
	
	public void clickOnimgelectronics()
	{
		imgelectronics.click();
	}
	
	public void clickOnseeMoreElectronics()
	{
		seeMoreElectronics.click();
	}
	
	
	
	



	
	
	

}
