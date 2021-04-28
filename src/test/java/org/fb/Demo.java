package org.fb;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Demo {
	@Test
	@Parameters({"First Name","Last Name","Address","Email address","Phone","Password","Confirm Password"})
	public void test1(String name,String last, String add, String email,String phone,String pass,String con) throws AWTException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\BrowserLogin\\src\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(last);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(add);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phone);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pass);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(con);
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='Icelandic']")).click();
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);		
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		sel.selectByVisibleText("Java");
		Select select = new Select(driver.findElement(By.id("countries")));
		select.selectByVisibleText("Iceland");
		Select se = new Select(driver.findElement(By.id("yearbox")));
		se.selectByIndex(35);
		Select sele = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		sele.selectByVisibleText("August");
		Select s = new Select(driver.findElement(By.id("daybox")));
		s.selectByIndex(9);		
}	
}
