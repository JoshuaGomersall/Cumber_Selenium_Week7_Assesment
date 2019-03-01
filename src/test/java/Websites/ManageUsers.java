package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ManageUsers {

	@FindBy(xpath = "//*[@id=\"tasks\"]/div[3]/a[2]")
	private WebElement manageuserlink;

	@FindBy(xpath = "//*[@id=\"people\"]/tbody/tr[3]/td[2]")
	private WebElement newlycreateduser;
	
	//*[@id="people"]/tbody/tr[2]/td[2]/a
	//*[@id="people"]/tbody/tr[2]/td[2]/a
	
	
	
	public void clicklink()
	{
		manageuserlink.click();
	}
	
	public boolean usermade()
	{
		try {
			newlycreateduser.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
