package nc.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.id("Email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);

		driver.findElement(By.name("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("copyright")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
