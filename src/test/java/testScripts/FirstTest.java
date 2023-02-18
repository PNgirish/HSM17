package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FirstTest extends BaseClass{
	@Test
	public void firstTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		soft.assertTrue(skillrarydemo.getPageHaeder().isDisplayed());
		skillrarydemo.mousehoverToCourse(web);
		skillrarydemo.clickseleniumTraining();
		
		soft.assertEquals(selenium.getpageHeader(), "Selenium Training");
		selenium.doubleclickonPlusButton(web);
		selenium.clickAddToCart();
		web.handlealert();
		web.explicitWait(time, selenium.getitemAddedMessage());
		web.takescreenshot();
		soft.assertTrue(selenium.getitemAddedMessage().isDisplayed());
		
		soft.assertAll();
	}

}
