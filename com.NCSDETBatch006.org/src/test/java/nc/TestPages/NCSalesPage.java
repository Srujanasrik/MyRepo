package nc.TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Rule-1 Create a class for a Web Page
public class NCSalesPage {
	WebDriver driver;

	// Rule-2 Provide the web elements information
	By productName = By.id("search-product-name");
	By SearchBtn = By.id("search-orders");

	// Rule-3 Create the methods for each web elements
	public void EnterProductName() {
		driver.findElement(productName).sendKeys("Refrigerators");

	}

	public void clickOnSearch() {
		driver.findElement(SearchBtn).click();
	}

	// Rule-4 Create the constructor for each page class with WebDriver object as
	// argument
	public NCSalesPage(WebDriver d) {
		this.driver = d;
	}

}
