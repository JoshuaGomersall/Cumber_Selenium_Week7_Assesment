package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class MakeUsers {

	
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
	private WebElement passwordconfim;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input")
	private WebElement fullname;
	
	@FindBy(xpath = "//*[@id=\"yui-gen1-button\"]")
	private WebElement donelink;

	
	
	public void clicklink(String usernametxt , String fullnametxt ,String passwordtxt ,String confimpasstxt,String emailtxt) throws InterruptedException
	{
		username.sendKeys(usernametxt);
		fullname.sendKeys(fullnametxt);
		password.sendKeys(passwordtxt);
		passwordconfim.sendKeys(confimpasstxt);
		email.sendKeys(emailtxt);
		donelink.click();
	}
	
}
