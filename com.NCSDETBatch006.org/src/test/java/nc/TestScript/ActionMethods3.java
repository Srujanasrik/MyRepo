package nc.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMethods3 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		String val = driver.findElement(By.tagName("button")).getText();
		System.out.println(val);

		String val1 = driver.findElement(By.id("Email")).getAttribute("tagName");
		System.out.println(val1);

		String val2 = driver.findElement(By.id("Email")).getTagName();
		System.out.println(val2);

		driver.findElement(By.id("Email")).clear();

		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		driver.findElement(By.name("password")).clear();

		driver.findElement(By.id("password")).sendKeys("admin", Keys.TAB, Keys.ENTER);

	}

}
