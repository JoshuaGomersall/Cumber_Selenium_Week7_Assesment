package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ManageJenkins {

	@FindBy(xpath = "//*[@id=\"main-panel\"]/div[16]/a")
	private WebElement newtask;
	
	
	public void newtask(){
		newtask.click();
	}
	
}
