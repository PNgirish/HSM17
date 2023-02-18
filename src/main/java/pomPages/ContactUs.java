package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	//Declaration
	@FindBy(xpath = "//img[contains(@src,\"contactus\")]")
	private WebElement pageHeader;
	@FindBy(name = "name")
	private WebElement fullName;
	@FindBy(name = "sender")
	private WebElement emailTF;
	@FindBy(name = "subject")
	private WebElement subjectTF;
	@FindBy(name = "message")
	private WebElement messageTextArea;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement sendUsmailButton;
	
	//initialization
	public ContactUs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getpageHeader()
	{
		return pageHeader;
	}
	public void submitDataList(String name, String email, String subject, String message)
	{
		fullName.sendKeys(name);
		emailTF.sendKeys(email);
		subjectTF.sendKeys(subject);
		messageTextArea.sendKeys(message);
		sendUsmailButton.click();
	}
	

}
