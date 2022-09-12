package scripts;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CJFSeleniumTrainingPage;
import pomPages.CoreJavaForSeleniumPage;
import pomPages.SkillraryLoginPage;

public class TestCase3 extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchboxmethod(pdata.getPropertydata("coursedata"));
		s.seachiconmethod();
		
		utilities.switchingTabs(driver);
		CJFSeleniumTrainingPage cj=new CJFSeleniumTrainingPage(driver);
		cj.cookiemethod();
		CoreJavaForSeleniumPage c=new CoreJavaForSeleniumPage(driver);
		c.corejavaforseleniummethod();
		
		utilities.switchingTabs(driver);
		cj.cookiemethod();
		Thread.sleep(5000);
		utilities.switchFrame(driver);
		cj.playiconmethod();
		Thread.sleep(3000);
		cj.pauseiconmethod();
		utilities.switchbackFrame(driver);
	}
}
