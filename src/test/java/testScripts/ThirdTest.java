package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class ThirdTest extends BaseClass 
{
	@Test
      public void thirdTrst() throws InterruptedException
      {
    	 SoftAssert soft=new SoftAssert();
    	 
    	 home.searchFor("core java for selenium");
    	 soft.assertEquals(corejava.getPageHeader(), "CORE JAVA FOR SELENIUM");
    	 
    	 corejava.clickcorejavaforSeleniumTrainingLink();
    	 soft.assertEquals(javavideo.getpageHeader(), "Core Java For Selenium Training");
    	 
    	 javavideo.clickcookiesT();
    	 web.switchToFrame();
    	 javavideo.clickPlayButton();
    	 Thread.sleep(2000);
    	 javavideo.clickPauseButton();
    	 
    	 web.switchbackToFrame();
    	 javavideo.clickaddToWishList();
    	 soft.assertAll();
      }
}
