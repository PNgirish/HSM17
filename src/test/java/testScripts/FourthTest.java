package testScripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;
import pomPages.TestingPage;

public class FourthTest extends BaseClass {
	@Test
	public void fourthTest()
	{
       SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillrarydemo.getPageHaeder().isDisplayed());
		
		web.scrollToElement(skillrarydemo.getcontactUs());
         skillrarydemo.clickcontactUs();
		
		soft.assertTrue(contact.getpageHeader().isDisplayed());
		
		List< String> data=excel.fetchDatafromExcel("sheet1");
		contact.submitDataList(data.get(0), data.get(1), data.get(2), data.get(3));
		
		soft.assertAll();
		
		
	}

}
