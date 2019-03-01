package Websites;

import javax.management.remote.TargetedNotification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage {

	@FindBy(xpath = "//*[@id=\"j_username\"]")
	private WebElement username;

	@FindBy(xpath = "/html/body/div/div/form/div[2]/input")
	private WebElement password;

	@FindBy(xpath = "/html/body/div/div/form/div[3]/input")
	private WebElement submitbutton;

	public void login(String usernametxt, String passwordtxt){
		username.sendKeys(usernametxt);
		password.sendKeys(passwordtxt);
		submitbutton.click();
	}
}
