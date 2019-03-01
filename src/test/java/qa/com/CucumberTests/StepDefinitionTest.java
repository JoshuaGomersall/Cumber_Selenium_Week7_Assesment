package qa.com.CucumberTests;

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
import Websites.UserConfigPage;
import Websites.UserPAGE;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionTest {

	WebDriver driver;
	public String username;

	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) {
		driver.get(arg1);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.login("admin", "admin");
		driver.get(arg1);
	}

	@Given("^the username is present \"([^\"]*)\"$")
	public void the_username_is_present(String arg1) throws InterruptedException {
		username = arg1;
		assertEquals(true, usermadecheck());
	}

	@When("^I click on username \"([^\"]*)\"$")
	public void i_click_on_username(String arg1) {
		username = arg1;
		driver.get("http://35.189.113.118:8080/user/" + username + "/");
	}

	@When("^I click on configure link$")
	public void i_click_on_configure_link() throws InterruptedException {
		UserPAGE user = PageFactory.initElements(driver, UserPAGE.class);
		user.configurebutton();
	}

	@When("^change the current fullname to new a new fullname \"([^\"]*)\"$")
	public void change_the_current_fullname_to_new_a_new_fullname(String arg1) throws InterruptedException {
		UserConfigPage userconfig = PageFactory.initElements(driver, UserConfigPage.class);
		userconfig.changename(arg1);
	}

	@When("^I click save button$")
	public void i_click_save_button() throws Throwable {
		UserConfigPage userconfig = PageFactory.initElements(driver, UserConfigPage.class);
		userconfig.clicksave();
	}

	@When("^I click on People link$")
	public void i_click_on_People_link() {
		driver.get("http://35.189.113.118:8080/user/" + username + "/");
	}

	@Then("^the new fullname \"([^\"]*)\" should be visible for the username \"([^\"]*)\"$")
	public void the_new_fullname_should_be_visible_for_the_username(String arg1, String arg2) {
		// Write code here that turns the phrase above into concrete actions
	}

	public boolean usermadecheck() throws InterruptedException {
		try {
			driver.get("http://35.189.113.118:8080/user/" + username + "/");
			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
			Thread.sleep(1000);
			return false;
		}
	}
}
