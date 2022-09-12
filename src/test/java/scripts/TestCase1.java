package scripts;


import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoAppPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {

	@Test
	public void tc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoappbtn();
		
		utilities.switchingTabs(driver);
		
		SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
		utilities.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingtab();
		
		AddToCartPage d=new AddToCartPage(driver);
		utilities.doubleClick(driver,d.getAddbtn());
		d.carttocartbtn();
		utilities.alertPopup(driver);
	}
}
