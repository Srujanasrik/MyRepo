package nc.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationMethods {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("//p[contains(text(), 'Help')]")).click();
		boolean Val1 = driver.findElement(By.xpath("//p[contains(text(), 'Help')]")).isDisplayed();
		System.out.println("Is Help appearing? " + Val1);

		driver.findElement(By.xpath("//p[contains(text(), 'Solution partners')]")).click();
		boolean Val2 = driver.findElement(By.xpath("//p[contains(text(), 'Solution partners')]]")).isEnabled();
		System.out.println("Is Solution partners is enabled? " + Val2);

		driver.findElement(By.xpath("//*[@class='filters-title active']")).click();
		boolean Val3 = driver.findElement(By.xpath("//*[@for='skill-integrations']")).isSelected();

		boolean Val4 = driver.findElement(By.tagName("Button")).isEnabled();

		System.out.println("Is Third-party integrations checkbox is Seleceted? " + Val3);
		System.out.println("Apply button is Enabled? " + Val4);
		driver.quit();

	}

}
