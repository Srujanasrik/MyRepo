package nc.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathsyntax4 {

	public static void main(String[] args) throws Exception{
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='Password']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='Password']")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='RememberMe' and @name='RememberMe']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
