package nc.TestPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule-1 create a class for a web page
public class NCUtilities {
	WebDriver driver;

	// Rule-2 provide web elements information
	By sales = By.xpath("//p[contains(text(),'Sales')][1]");
	By orders = By.xpath("//p[contains(text(),'Orders')]");
	By logout = By.linkText("Logout");

	// Rule-3 create the methods for each web elements
	public void clickOnSales() {
		driver.findElement(sales).click();
	}

	public void clickOnOrders() {
		driver.findElement(orders).click();
	}

	public void doLogout() {
		driver.findElement(logout).click();
	}

	public void setUp() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void tearDown() {
		driver.quit();
	}

	// Rule-4 Create the constructor for each page class with WebDriver object as
	// argument
	public NCUtilities(WebDriver d) {
		this.driver = d;
	}

}
