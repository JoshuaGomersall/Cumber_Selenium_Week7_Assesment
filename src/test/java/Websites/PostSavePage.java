package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class PostSavePage {

	@FindBy(xpath = "//*[@id=\"tasks\"]/div[1]/a[2]")
	private WebElement dashboardbutton;
	

	public void newtask(){
		dashboardbutton.click();
	}
}
