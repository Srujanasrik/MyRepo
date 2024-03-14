package nc.TestScript;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathsyntax8{

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Password']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),' Catalog')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[contains(text(),' Product reviews')]")).click();
		Thread.sleep(3000);
		
		
	}
	}


