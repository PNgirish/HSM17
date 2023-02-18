package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import pomPages.ContactUs;
import pomPages.CoreJavaForSelenium;
import pomPages.CoreJavaVideoPage;
import pomPages.SeleniumTrainingPage;
import pomPages.SkillraryDemoAppPage;
import pomPages.SkillraryHomePage;
import pomPages.TestingPage;

public class BaseClass

{
	protected PropertyFileUtility property;
	protected Excelutility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected SkillraryHomePage home;
	protected SkillraryDemoAppPage skillrarydemo;
	protected SeleniumTrainingPage selenium;
	protected TestingPage Test;
	protected CoreJavaForSelenium corejava ;
	protected CoreJavaVideoPage javavideo ;
	protected ContactUs contact;
	protected long time;
	
	
	
   // @BeforeSuite
   //  @BeforeTest
    @BeforeClass
    public void classconfiguration()
    {
    	 property=new PropertyFileUtility();
    	 excel=new Excelutility();
    	 web=new WebDriverUtility();
    	 
    	 property.propertyFileInitialization(Iconstatntpath.PROPERTIES_FILE_PATH);
    	 excel.excelinitialization(Iconstatntpath.EXCEL_FILE_PATH);
  	 
    }
    
    @BeforeMethod
    public void methodConfiguration()
    {
    	 time=Long.parseLong(property.fetchproperty("timeout"));
    	driver= web.openApplication(property.fetchproperty("browser"), property.fetchproperty("url"), time);
    	
    	home=new SkillraryHomePage(driver);
    	Assert.assertTrue(home.getLogo().isDisplayed());
    	
       skillrarydemo =new SkillraryDemoAppPage(driver);
       selenium=new SeleniumTrainingPage(driver);
       Test=new TestingPage(driver);
       corejava=new CoreJavaForSelenium(driver);
       javavideo=new CoreJavaVideoPage(driver);
       contact=new ContactUs(driver);
       
    	
    }
   
    @AfterMethod
    public void methodteardown()
    {
    	web.quitvrowser();
    }
    @AfterClass
    public void classTeardown()
    {
    	excel.closeexcel();
    }
    
    // @AfterTest
   // @AfterSuite
    
}
