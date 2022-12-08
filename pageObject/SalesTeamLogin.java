package Com.Cen.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesTeamLogin {
WebDriver driver;
public SalesTeamLogin(WebDriver rdriver) {
	driver = rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(xpath = "//input[@placeholder='Email']")
@CacheLookup
WebElement Userid;

@FindBy(xpath = "//input[@placeholder='Password']")
@CacheLookup
WebElement password;

@FindBy(xpath = "//*[@id=\"login_form\"]/div[3]/div/button")
@CacheLookup
WebElement LoginClick;

public void setUserName(String UsrName) {
	Userid.sendKeys(UsrName);
}
public void SetPassword(String Password) {
	password.sendKeys(Password);
}
public void LoginBttnClick() {
	LoginClick.click();
}
}
