package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseClass;

public class SkillraryLoginPage extends BaseClass {
	@FindBy(name="q")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchicon;


	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearsbutton() {
		gearsbtn.click();
	}
	
	public void skillrarydemoappbtn() {
		skillrarydemoapp.click();
	}
	
	public void seachiconmethod() {
		searchicon.click();
	}
	
	public void searchboxmethod(String name) {
		searchbox.sendKeys(name);
	}
}
