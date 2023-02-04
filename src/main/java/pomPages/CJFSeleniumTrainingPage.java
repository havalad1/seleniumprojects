package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CJFSeleniumTrainingPage {
	@FindBy(xpath = "//div[@class='play-icon']")
	private WebElement playicon;
	
	@FindBy(xpath = "//div[@class='pause-icon']")
	private WebElement pauseicon;
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookie;
	
	public CJFSeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void cookiemethod() {
		cookie.click();
	}
	
	public void playiconmethod() {
		playicon.click();
	}
	
	public void pauseiconmethod() {
		pauseicon.click();
	}

}
