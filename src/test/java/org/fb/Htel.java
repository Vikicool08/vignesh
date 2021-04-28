package org.fb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Htel {
	@Test(dataProvider="res",dataProviderClass=Adact.class)
	public void fb(String s3, String s4) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\BrowserLogin\\\\src\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/Register.php");
		WebElement txtRe = driver.findElement(By.id("re_password"));
		txtRe.sendKeys(s3);
		WebElement txtFull = driver.findElement(By.id("full_name"));
		txtFull.sendKeys(s4);
	}
}
