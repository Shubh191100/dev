package Com.Cen.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Manageorder_Filter {
	WebDriver driver;

	public Manageorder_Filter(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\"select2-celebrity_name-ku-container\"]")
	@CacheLookup
	public WebElement CelebsList;
	@FindBy(xpath = "//*[@id=\"manage_order_filter_form\"]/div/div[2]/div/div/select")
	@CacheLookup
	public WebElement OrderStatus;
	@FindBy(xpath = "//*[@id=\"manage_order_filter_form\"]/div/div[3]/div/div/select")
	@CacheLookup
	public WebElement PaymentStatus;
	@FindBy(xpath = "//*[@id=\"filter_order_date\"]")
	@CacheLookup
	public WebElement orderDate;
	@FindBy(xpath = "//*[@id=\"filter_delivery_date\"]")
	@CacheLookup
	public WebElement DeliveryDate;
	@FindBy(xpath = "//*[@id=\"manage_order_filter_form\"]/div/div[6]/div/i/input")
	@CacheLookup
	public WebElement Search;

	@FindBy(xpath = "//*[@id=\"manage_order_filter_form\"]/div/div[6]/div/a")
	@CacheLookup
	public WebElement Reset;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div[1]/div/div[3]/div/div/div[1]/a[1]")
	@CacheLookup
	public WebElement today;

	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div[1]/div/div[3]/div/div/div[1]/a[2]")
	@CacheLookup
	public WebElement Last7Days;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div[1]/div/div[3]/div/div/div[1]/a[3]")
	@CacheLookup
	public WebElement Last30Days;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div[1]/div/div[3]/div/div/div[1]/a[4]")
	@CacheLookup
	public WebElement AllUncofirmed;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div[1]/div/div[3]/div/div/div[1]/a[5]")
	@CacheLookup
	public WebElement AllConfirmed;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[3]/div[1]/div/div[3]/div/div/div[1]/a[6]")
	@CacheLookup
	public WebElement PaymentDone;

	public void CelebsList() {
		Select Dropdown = new Select(CelebsList);
		Dropdown.deselectByIndex(3);
		Search.click();
	}

	public void OrderStatus() {
		Select drodpwn = new Select(OrderStatus);
		drodpwn.selectByVisibleText("Delivered");
		Search.click();
	}

	public void PaymentStatus() {
		Select dropdown = new Select(PaymentStatus);
		dropdown.selectByVisibleText("Done");
		Search.click();
	}

	public void orderDate() {
		orderDate.click();
		orderDate.sendKeys("18/05/2021 - 30/06/2021");
		Search.click();
	}

	public void DeliveryDate() {
		DeliveryDate.sendKeys("17/05/2021");
		Search.click();
	}

	public void TodaysFilter() {
		today.click();
	}

	public void Last7Days() {
		Last7Days.click();
	}

	public void Last30Days() {
		Last30Days.click();
	}

	public void AllUncofirmed() {
		AllUncofirmed.click();
	}

	public void PaymentDone() {
		PaymentDone.click();
	}
}
