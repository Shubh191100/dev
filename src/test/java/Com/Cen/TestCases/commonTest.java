package Com.Cen.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.Cen.pageObject.Movie;

public class commonTest {

	public static WebDriver driver;
	public String imdbReleaseDate, wikiReleaseDate, imdbReleaseCountry, wikiReleaseCountry;
	public int delay = 5000;

	@BeforeClass // TestNG Notations
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\Movie_Details_Verification\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Movie mname = new Movie(driver);

		// Navigate to IMDB website
		driver.get("https://www.imdb.com");
		mname.searchIMDB.sendKeys("Pushpa: The Rise");
		Thread.sleep(delay);
		mname.searchButtonIMDB.click();
		Thread.sleep(delay);
		mname.selectMovieIMDB.click();
		Thread.sleep(delay);

		// scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6500)", "");
		Thread.sleep(delay);
		imdbReleaseDate = mname.releaseDateIMDB.getText();
		imdbReleaseCountry = mname.countryIMDB.getText();
		System.out.println(
				"IMDB - Pushpa movie Release date = " + imdbReleaseDate + " and Release Country = " + imdbReleaseCountry);

		// Navigate to wikipedia website
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		mname.searchWIKI.sendKeys("Pushpa: The Rise");
		Thread.sleep(delay);
		mname.searchButtonWIKI.click();
		Thread.sleep(delay);

		// scroll

		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(delay);
		wikiReleaseDate = mname.releaseDateWIKI.getText();
		wikiReleaseCountry = mname.countryWIKI.getText();
		System.out.println("Wikipedia - Pushpa movie Release date = " + wikiReleaseDate + " and Release Country = " + wikiReleaseCountry);

	}

	// @BeforeClass
	@Test(priority = 1)
	public void imdb_Wiki_Compare_Date() throws InterruptedException {

		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(imdbReleaseDate, wikiReleaseDate);
		assertion.assertAll();
		
	}

	// @BeforeClass
	@Test(priority = 2)
	public void imdb_Wiki_Compare_Country() throws InterruptedException {

		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(imdbReleaseCountry, wikiReleaseCountry);
		assertion.assertAll();
		driver.quit();
	}

}