package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class UserConfigPage {


	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/table/tbody/tr[1]/td[3]/input")
	private WebElement fullname;
	
	@FindBy(xpath = "//*[@id=\"yui-gen2-button\"]")
	private WebElement donebutton;
	
	

	public void changename(String arg0){
		fullname.click();
		fullname.clear();
		fullname.sendKeys(arg0);
	}
	
	public void clicksave(){
		donebutton.click();
	}
}
