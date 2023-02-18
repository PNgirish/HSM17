package pomPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class SeleniumTrainingPage {
	//Declaration
	@FindBy(xpath = "//h1[@class=\"page-header\"]")
	private WebElement pageHeader;
	@FindBy(id = "add")
	private WebElement plusButton;
	@FindBy(xpath = "//button[text()=\" Add to Cart\"]")
	private WebElement addtoCartButton;
	@FindBy(xpath = "//div[@id=\"callout\"]/span")
	private WebElement itemAddedMessage;
	
	//initialization
	public SeleniumTrainingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public String getpageHeader()
	{
		return pageHeader.getText();
	}
	
	public void doubleclickonPlusButton(WebDriverUtility web)
	{
		web.doubleclick(plusButton);
	}
	
	public void clickAddToCart()
	{
		addtoCartButton.click();
	}
	public WebElement getitemAddedMessage()
	{
		return itemAddedMessage;
	}
	

}
