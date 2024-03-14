package nc.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleSelect {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),'Configuration')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),'Settings')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),' Customer settings')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[contains(text(),'Common')]")).click();
		Thread.sleep(3000);

		WebElement customersetting = driver.findElement(By.xpath("//select[@id='CustomerSettings_UserRegistrationType']"));
		Select selection = new Select(customersetting);

		selection.selectByVisibleText("Standard account creation");
		Thread.sleep(3000);

		selection.selectByVisibleText("Email validation is required after registration");
		Thread.sleep(3000);

		selection.selectByVisibleText("A customer should be approved by administrator");
		Thread.sleep(3000);

		selection.selectByVisibleText("Registration is disabled");
		Thread.sleep(3000);

		driver.quit();

	}

}
