package pomPages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	//declaration
	@FindBy(xpath = "//div[@class=\"navbar-header\"]")
	private WebElement pageheader;
	@FindBy(id = "course")
	private WebElement courseTab;
	@FindBy(xpath = "//span[@class=\"wrappers\"]/a[text()=\"Selenium Training\"]")
	private WebElement seleniumtrainingLink;
	@FindBy(name = "addresstype")
	private WebElement categoryDropdown;
	@FindBy(xpath = "//a[text()=\"Contact Us\"]")
	private WebElement contactusLink;
	
	//initialization
	public  SkillraryDemoAppPage(SearchContext driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getPageHaeder()
	{
		return pageheader;
	}
	
	public void mousehoverToCourse(WebDriverUtility web)
	{
		web.mousehover(courseTab);
	}
	
	public void clickseleniumTraining()
	{
		seleniumtrainingLink.click();
	}
	
	public void selectcategory(WebDriverUtility web, int index)
	{
		web.dropdown(categoryDropdown, index);
	}
	public WebElement getcontactUs()
	{
		return contactusLink;
	}
	
	public void clickcontactUs()
	{
		contactusLink.click();
	}
	

}
