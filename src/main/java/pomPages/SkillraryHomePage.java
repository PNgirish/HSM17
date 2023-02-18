package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	//declaration
	@FindBy(xpath = "//img[@alt=\"SkillRary\"]")
	private WebElement logo;
	@FindBy(name = "q")
	private WebElement searchTF;
	@FindBy(xpath = "//input[@value=\"go\"]")
	private WebElement searchButton;
	@FindBy(xpath = " //a[text()=\" GEARS \"]")
	private WebElement gearTab;
	@FindBy(xpath = "//ul[contains(@class,\"dropdown-menu \")]/descendant::a[text()=\" SkillRary Demo APP\"]")
	private WebElement demoApplink;
	
	//initialization
	
	public  SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//uitilization
	public WebElement getLogo()
	{
		return logo;
	}
	
	public void searchFor(String data)
	{
		searchTF.sendKeys(data);
		searchButton.click();
	}
	
	public void clickGears()
	{
		gearTab.click();
	}
	public void clickSkillrarydemoApp()
	{
		demoApplink.click();
	}

}
