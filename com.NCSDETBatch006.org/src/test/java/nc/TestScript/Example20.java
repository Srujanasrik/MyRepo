package nc.TestScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example20 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(60));

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.tagName("button")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//p[contains(text(),'Products')])[1]")).click();

		Thread.sleep(5000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr"));

		int rowsCount = rows.size();

		System.out.println("All Rows Count is : " + rowsCount);

		List<WebElement> allColumns = driver.findElements(By.xpath("//table[@id='products-grid']/tbody/tr[1]/td"));

		int columnsCount = allColumns.size();

		System.out.println("All Columns Count is : " + columnsCount);

		Thread.sleep(5000);

		for (int r = 1; r <= rowsCount; r++) {

			for (int c = 1; c <= columnsCount; c++) {

				if (r == 7 && c == 1) {
					driver.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[7]/td[1]")).click();
					Thread.sleep(3000);
					driver.findElement(By.id("delete-selected")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//button[contains(text(), 'Yes')]")).click();
				}

				String val = driver
						.findElement(By.xpath("//table[@id='products-grid']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();

				System.out.print(val + "	");

			}

			System.out.println();

		}

		driver.quit();
	}

}
