package nc.TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exampletest {

	public static void main(String[] args) throws Exception {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(3000);

		driver.findElement(By.tagName("button")).click();

		driver.findElement(By.xpath("//p[contains(text(),'Configuration')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),'Settings')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[contains(text(),' Customer settings')]")).click();
		Thread.sleep(3000);

		WebElement customersetting = driver
				.findElement(By.xpath("//select[@id='CustomerSettings_UserRegistrationType']"));
		Select selection = new Select(customersetting);

		List<WebElement> allOptions = selection.getOptions();
		for (WebElement singleOption : allOptions) {
			String text = singleOption.getText();
			System.out.println(text);
		}

	}

}
