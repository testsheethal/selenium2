package Sample.code.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Sample {

	@Test
	void test() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SU20047815\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
