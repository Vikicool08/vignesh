package org.fb;
import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Assert extends Base{
	@Test
public void test1() throws InterruptedException, IOException, AWTException {
	SoftAssert soft = new SoftAssert();
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Base.launchUrl("http://demo.automationtesting.in/Register.html");
	WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	Base.enterText(firstname,Base.sheetLocation(1, 0));
	String attribute = firstname.getAttribute("value");
	soft.assertEquals(attribute, "Vignesh");
	WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	Base.enterText(lastname, Base.sheetLocation(1, 1));
	String last = firstname.getAttribute("value");
	soft.assertEquals(last, "v");
	WebElement add = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	Base.enterText(add, Base.sheetLocation(1, 2));
	String ad = firstname.getAttribute("value");
	soft.assertEquals(ad, "chennai");
	WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
	Base.enterText(mail, Base.sheetLocation(1, 3));
	String mai = firstname.getAttribute("value");
	soft.assertEquals(mai, "vikicool08@gmail.com");
	WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
	Base.enterText(phone,Base.sheetLocation(1, 4));
	String no = firstname.getAttribute("value");
	soft.assertEquals(no, "9876543210");
	WebElement click = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	Base.btnClick(click);
	boolean male = click.isSelected();
	soft.assertTrue(male);
	WebElement check = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	Base.btnClick(check);
	boolean c = check.isSelected();
	soft.assertTrue(c);
	WebElement count = driver.findElement(By.id("msdd"));
	Base.btnClick(count);
	WebElement newco = driver.findElement(By.xpath("//a[text()='Icelandic']"));
	Base.btnClick(newco);
	WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	Base.enterText(pass, Base.sheetLocation(1,5 ));
	String pas = firstname.getAttribute("value");
	soft.assertEquals(pas, "vikiii");
	WebElement current = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	Base.enterText(current, Base.sheetLocation(1,6 ));
	String cur = firstname.getAttribute("value");
	soft.assertEquals(cur, "vikiii");
	Base.visibleText(driver.findElement(By.xpath("//select[@id='Skills']")), "Java");
	Base.visibleText(driver.findElement(By.id("countries")), "Iceland");
	Base.index(driver.findElement(By.id("yearbox")), 30);
	Base.visibleText(driver.findElement(By.xpath("//select[@placeholder='Month']")), "August");
	Base.index(driver.findElement(By.id("daybox")), 13);
	WebElement sel = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
	Base.btnClick(sel);
	Base.down();
	Base.enter();
}

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
