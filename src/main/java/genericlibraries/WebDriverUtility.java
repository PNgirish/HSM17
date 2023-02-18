package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This class contains all reusable methods of webDriver
 * @author admin
 *
 */
public class WebDriverUtility {
	WebDriver driver;
	/**
	 * This method is used to launch browser
	 * @param browser
	 * @param url
	 * @param time
	 * @return
	 */
	public WebDriver openApplication(String browser, String url, long time)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		switch (browser)
		{
		case "chrome":
		driver=new ChromeDriver();
			break;
			
		case "edge":
	    driver=new EdgeDriver();
		    break;
			default: System.out.println("inavlid browser data");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return driver;
	}
	
	/**
	 * This method is used to mouse hover on an element
	 * @param element
	 */
	
	public void mousehover(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	/**
	 * This method is used to double click on an element
	 * @param element
	 */
	public void doubleclick(WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	/**
	 * This method is used to drag and drop an element
	 * @param src
	 * @param dest
	 */
	public void draganddrop(WebElement src, WebElement dest)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	/**
	 * This method is used to select an element from drop down based on index
	 * @param element
	 * @param index
	 */
	public void dropdown(WebElement element, int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
		
		
	}
	
	/**
	 * This method is used to select an element from drop down based on value
	 * @param element
	 * @param value
	 */
	public void dropdown( String value, WebElement element)
	{
		Select s=new Select(element);
	     s.selectByValue(value);
		
		
	}
	
	/**
	 * This method is used to select an element from drop down based on text
	 * @param element
	 * @param text 
	 */
	public void dropdown(WebElement element, String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
		
		
	}
	
	/**
	 * This method is used to switch to frame based on index
	 */
	public void switchToFrame()
	{
		driver.switchTo().frame(0);
	}
	
	/**
	 * This method is used to switch back from frame
	 */
	public void switchbackToFrame()
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to handle alert
	 */
	public void handlealert()
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method is used to handle child browser pop-up
	 */
	public void handleChildBrowser()
	{
		Set<String> windowID=driver.getWindowHandles();
		for (String string : windowID) 
		{
		    driver.switchTo().window(string);	
		}
	}
	
	/**
	 * This method is used to get parent ID
	 */
	public void switchtoParentWindow()
	{
		driver.switchTo().window(driver.getWindowHandle());
	}
	
	/**
	 * This method is used to scroll the page till web element
	 * @param element
	 */
	public void scrollToElement(Object element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoview[true]", element);
	}
	
	/**
	 * This method is used to fetch the screenshot 
	 */
	public void takescreenshot()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/picture.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to wait the visibility of web element
	 * @param time
	 * @param element
	 */
	public void explicitWait(long time, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	/**
	 * This method is used to close current window
	 */
	public void closecurrentWindow()
	{
		driver.close();
	}
	
	/**
	 * This method is used to close all the windows and exit browser
	 */
     public void quitvrowser()
     {
    	 driver.quit();
     }
}
