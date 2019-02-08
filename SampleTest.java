package Sample.code.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SampleTest {

	@Test
	void testFail() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SU20047815\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
		Thread.sleep(50000);
		System.out.println("Finding Element");
		driver.findElement(By.xpath("//*[@name='login-email']")).sendKeys("test");
		System.out.println("Element not found");
		driver.close();
	}
	

}
