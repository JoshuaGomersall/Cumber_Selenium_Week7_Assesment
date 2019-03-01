package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class MakingFreestylepage {

	@FindBy(xpath = "//*[@id=\"yui-gen38-button\"]")
	private WebElement savebutton;
	

	
	

	public void donetask(){
		savebutton.click();
	}
}
