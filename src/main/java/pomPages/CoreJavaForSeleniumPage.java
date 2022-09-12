package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	
	@FindBy(xpath="(//img[@class='thumb lazy'])[2]")
	private WebElement corejavaforselenium;
	
	public CoreJavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void corejavaforseleniummethod() {
		corejavaforselenium.click();
	}
}
