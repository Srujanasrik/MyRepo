package nc.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Conditional {

	public static void main(String[] args) throws Exception {

ChromeDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

			driver.findElement(By.xpath("//input[@id='Email']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='Password']")).clear();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[@href='#'])[10]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[@href='#'])[11]")).click();
			Thread.sleep(1000);
			int count = 8;
			int a = 1;
			while (a<=count) {
				
				a = 1;
				driver.findElement(By.xpath("//p[text()=' General settings']")).click();
				System.out.println("genaralsetting loaded sucessfully");
				a++;
				Thread.sleep(1000);
				
				a = 2;
				driver.findElement(By.xpath("//p[text()=' Customer settings']")).click();
				System.out.println("customersetting loaded sucessfully");
			    Thread.sleep(3000);
			

			

		
		}

	}

}
