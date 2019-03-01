package qa.com.ExcelTests;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Websites.Constants;
import Websites.JenkinsHomePage;
import Websites.LoginPage;
import Websites.MakeUsers;
import Websites.MakingFreestylepage;
import Websites.ManageJenkins;
import Websites.ManageUsers;
import Websites.NewTaskPage;
import Websites.PostSavePage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExcelUserTest {

	
	public String username = "test";
	
	public static WebDriver driver;

	// @Parameters
	// public static Collection<Object[]> data() throws IOException {
	//
	// FileInputStream file = new
	// FileInputStream("C:\\Users\\Admin\\Desktop\\AssessmentFriday.xlsx");
	// XSSFWorkbook workbook = new XSSFWorkbook(file);
	// XSSFSheet sheet = workbook.getSheetAt(0);
	//
	// for (int rowNum = 1; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
	// for (int colNum = 0; colNum < 2; colNum++) {
	// XSSFCell cell = sheet.getRow(rowNum).getCell(colNum);
	// String userCell = cell.getStringCellValue();
	// }
	// }
	//
	// Object[][] ob = new Object[sheet.getPhysicalNumberOfRows() - 1][2];
	//
	// for (int row = 1; row < sheet.getPhysicalNumberOfRows(); row++) {
	// for (int col = 0; col < 2; col++) {
	// ob[row - 1][col] = sheet.getRow(row).getCell(col).getStringCellValue();
	// }
	// }
	// return Arrays.asList(ob);
	// }
	//
	// private String x;
	// private String y;
	//
	// public Para(String x, String y) {
	// this.x = username;
	// this.y = fullname;
	// }

	@Before
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@org.junit.Before
	public void startupJunit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
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
		home.managejenkins();
		
		ManageJenkins managejenk = PageFactory.initElements(driver, ManageJenkins.class);
		managejenk.newtask();
		
		ManageUsers manageuser = PageFactory.initElements(driver, ManageUsers.class);
		manageuser.clicklink();
		
		MakeUsers mankeuser = PageFactory.initElements(driver, MakeUsers.class);
		mankeuser.clicklink(username, "Test", "Test", "Test", "test@test.test");
		
		
		assertEquals(true, usermadecheck());
		
		Thread.sleep(1000);
	}

	public boolean usermadecheck() throws InterruptedException
	{
		try {
			driver.get("http://35.189.113.118:8080/user/"+ username + "/");
			Thread.sleep(1000);
			return true;
		}
		catch (Exception e) {
			Thread.sleep(1000);
			return false;
		}
	}
}
