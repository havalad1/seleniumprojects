package scripts;



import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoAppPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoappbtn();
		
		utilities.switchingTabs(driver);
		
		SkillraryDemoAppPage sd=new SkillraryDemoAppPage(driver);
		utilities.dropDown(sd.getCoursedd(),pdata.getPropertydata("coursedd"));
		
		TestingPage tp=new TestingPage(driver);
		utilities.dragDrop(driver,tp.getSeleniumtraining(),tp.getCartarea());
		Point loc = tp.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		utilities.scrollBar(driver, x, y);
		tp.facebookmethod();	
	}
}
