package nc.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterProductNameInOrdersPage {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		NCLoginPage nlp = new NCLoginPage(driver);
		NCDashboardPage ndp = new NCDashboardPage(driver);
		NCUtilities ncu = new NCUtilities(driver);
		NCSalesPage nsp = new NCSalesPage(driver);
		ncu.setUp();
		nlp.enterEmail();
		nlp.enterPassword();
		nlp.clickOnLoginBtn();
		Thread.sleep(5000);
		ndp.verifyDashboard();
		ncu.clickOnSales();
		Thread.sleep(3000);
		ncu.clickOnOrders();
		Thread.sleep(3000);
		nsp.EnterProductName();
		Thread.sleep(3000);
		nsp.clickOnSearch();
		Thread.sleep(3000);
		ncu.doLogout();
		Thread.sleep(5000);
		ncu.tearDown();

	}

}
