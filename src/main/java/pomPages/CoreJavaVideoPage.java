package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideoPage {
	//Declaration
	@FindBy(xpath ="//h1")
	private WebElement pageHeader;
	@FindBy(xpath = "//button[@aria-label=\"Play\"]")
	private WebElement playButton;
	@FindBy(xpath = "//button[@aria-label=\"Pause\"]")
	private WebElement pauseButton;
	@FindBy(xpath = "//span[text()=\"Add To Wishlist\"]")
	private WebElement addToWishListTab;
	@FindBy(xpath = "//a[@class=\"close_cookies\"]")
	private WebElement closecookies;
	
	//initialization
	public CoreJavaVideoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public String getpageHeader()
	{
		return pageHeader.getText();
	}
	public void clickPlayButton()
	{
		playButton.getText();
	}
	public void clickPauseButton()
	{
		pauseButton.getText();
	}
	public void clickaddToWishList()
	{
		addToWishListTab.click();
	}
	public void clickcookiesT()
	{
		closecookies.click();
	}
	

}
