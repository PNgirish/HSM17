package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class SecondTest extends BaseClass {
	@Test
	public void secondTest()
	{
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillrarydemo.getPageHaeder().isDisplayed());
		
		skillrarydemo.selectcategory(web, 1);
		soft.assertEquals(Test.getPageHeader(), "Testing");
		
		web.draganddrop(Test.getSeleniumImage(), Test.getCartArea());
		
		web.scrollToElement(Test.getFacebookIcon());//scrolling Operation
		Test.clickFacebookIcon();
		
		soft.assertAll();
		
	}
	
	

}
