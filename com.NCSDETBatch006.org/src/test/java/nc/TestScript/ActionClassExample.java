package nc.TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).clear();

		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("9618942948");

		Thread.sleep(3000);

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).perform();

		Thread.sleep(5000);

		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Samsung')]"))).perform();

		action.click().perform();

		Thread.sleep(4000);

		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Women')]"))).perform();

		Thread.sleep(5000);

		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Gowns')]"))).perform();

		action.click().perform();

		Thread.sleep(4000);

		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Women')]"))).perform();

		Thread.sleep(5000);

		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Dupattas')]"))).perform();

		Thread.sleep(4000);

		action.click().perform();

		Thread.sleep(3000);

		driver.quit();

	}

}
