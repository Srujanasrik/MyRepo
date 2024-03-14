package nc.TestScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMethods2 {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(), 'Help')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(), 'Community forums')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(), 'Premium support services')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(), 'Solution partners')]")).click();
		Thread.sleep(3000);

		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);

		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(3000);

		driver.close();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
