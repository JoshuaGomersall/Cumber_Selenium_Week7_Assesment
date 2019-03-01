package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class NewTaskPage {

	@FindBy(xpath = "//*[@id=\"name\"]")
	private WebElement textfeild;
	
	@FindBy(xpath = "//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]")
	private WebElement freestyleproject;
	
	@FindBy(xpath = "//*[@id=\"ok-button\"]")
	private WebElement donebutton;
	
	

	public void newtask(String arg0) throws InterruptedException{
		textfeild.sendKeys(arg0);
		freestyleproject.click();
		Thread.sleep(500);
		donebutton.click();
	}
}
