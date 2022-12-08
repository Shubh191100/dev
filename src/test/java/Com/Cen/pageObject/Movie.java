package Com.Cen.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// class for User admin Login
public class Movie {
	// Default constructor for initialization of object at run time
	public static  WebDriver driver;

	public int delay = 5000;

	public Movie(WebDriver rdriver) {
		Movie.driver = rdriver;
		PageFactory.initElements(rdriver, this); // Web Driver Initialization
	}

	// Web Element for search movie name (IMDB)
	@FindBy(xpath = "//input[@id='suggestion-search']")
	@CacheLookup
	public WebElement searchIMDB; // WebElements

	// Web Element for search button (IMDB)
	@FindBy(xpath = "//button[@id='suggestion-search-button']//*[@id='iconContext-magnify']")
	@CacheLookup
	public WebElement searchButtonIMDB;

	// WebElement for selectmovie (IMDB)

	@FindBy(xpath = "//body/div[@id='__next']/main[1]/div[2]/div[3]/section[1]/div[1]/div[1]/section[2]/div[2]/ul[1]/li[1]/div[2]")
	@CacheLookup
	public WebElement selectMovieIMDB;

	// WebElement for release date of movie (IMDB)
	@FindBy(xpath = "//a[contains(text(),'December 17, 2021 (United States)')]")
	@CacheLookup
	public WebElement releaseDateIMDB;

	// WebElement for search movie name (WIKI)
	@FindBy(xpath = "//input[@id='searchInput']")
	@CacheLookup
	public WebElement searchWIKI;

	// Web Element for search button (WIKI)
	@FindBy(xpath = "//input[@id='searchButton']")
	@CacheLookup
	public WebElement searchButtonWIKI;

	// WebElement for release date of movie (WIKI)
	@FindBy(xpath = "//tbody/tr[12]/td[1]/div[1]")
	@CacheLookup
	public WebElement releaseDateWIKI;

}
