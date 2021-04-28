package org.fb;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Facebook {
	 WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\BrowserLogin\\src\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
}
	@AfterClass
	private void afterClass() {
		driver.quit();
	}
	@BeforeMethod
	private void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@AfterMethod
	private void afterMethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	private void test1 () throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='login_input'])[1]")).sendKeys("vikiiii");
		driver.findElement(By.id("password")).sendKeys("123456778");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();

	}
}
