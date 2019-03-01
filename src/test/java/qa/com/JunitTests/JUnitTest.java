package qa.com.JunitTests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Websites.Constants;
import Websites.JenkinsHomePage;
import Websites.LoginPage;
import Websites.MakingFreestylepage;
import Websites.NewTaskPage;
import Websites.PostSavePage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JUnitTest {

	WebDriver driver;

	@org.junit.Before
	public void startupJunit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@org.junit.After
	public void tearDownJunit() {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.manage().window().maximize();

		driver.get(Constants.JenkinsUrl);

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.login("admin", "admin");

		JenkinsHomePage home = PageFactory.initElements(driver, JenkinsHomePage.class);
		home.newtask();

		Thread.sleep(1000);

		NewTaskPage newtask = PageFactory.initElements(driver, NewTaskPage.class);
		newtask.newtask("SeleniumTest");

		Thread.sleep(1000);

		MakingFreestylepage makingpage = PageFactory.initElements(driver, MakingFreestylepage.class);
		makingpage.donetask();

		Thread.sleep(1000);

		PostSavePage postsave = PageFactory.initElements(driver, PostSavePage.class);
		postsave.newtask();

		assertEquals(true, home.madetest());
	}
}