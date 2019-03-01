package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class JenkinsHomePage {

	@FindBy(xpath = "//*[@id=\"tasks\"]/div[1]/a[2]")
	private WebElement newtask;
	
	@FindBy(xpath = "//*[@id=\"job_SeleniumTest\"]/td[3]")
	private WebElement testlocation;

	@FindBy(xpath = "//*[@id=\"tasks\"]/div[4]/a[2]")
	private WebElement managejenkins;
	
	
	public void newtask(){
		newtask.click();
	}
	
	public void managejenkins(){
		managejenkins.click();
	}
	
	public boolean madetest()
	{
		try {
			testlocation.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
}
