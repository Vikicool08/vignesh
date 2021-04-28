package org.fb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Adact {
	@Test(dataProvider="res")
public void hotel (String s1, String s2) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\BrowserLogin\\\\src\\\\driver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement txtUser = driver.findElement(By.id("username"));
	txtUser.sendKeys(s1);
	WebElement txtPass = driver.findElement(By.id("password"));
	txtPass.sendKeys(s2);	
	WebElement btnbox = driver.findElement(By.id("login"));
	btnbox.click();
	driver.quit();
}
	@DataProvider(name = "res")
	public Object[][] data() {
		return new Object[][] {{"Vikicool","1234"},{"Vignesh","5678"},{"vikicool08","csk"},{"viki","rcb"},{"Eswar","123"},{"Vineeth","345"},{"anvi","678"},{"aara","897"},{"vijay","358746"},{"anu","dgfhd"}};
	}
}
 