package org.date;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.fb.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class Test1  extends Base{
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;
	@BeforeClass 
	private void beforeClass() {
		reports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("Adactin E2E.html");
		reports.attachReporter(htmlReporter);
		getDriver();
		launchUrl("https://adactinhotelapp.com/index.php");
	}
	@BeforeMethod
	private void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@AfterMethod
	private void afterMethod(Method method) {
		takesScreenshot(method.getName());
	}
	@Test
	private void tc0() throws IOException {
		test = reports.createTest("Validating home page of adactin");
		test.log(Status.INFO, "Verifying Url of Adactin page");
		if (driver.getCurrentUrl().contains("index")) {
			test.log(Status.PASS, "Valid Url");
		}else {
			test.log(Status.FAIL, "Invalid Url");
		}
		WebElement logo = driver.findElement(By.className("logo"));
		if (logo.isDisplayed()) {
			test.log(Status.PASS, "Adacting logo is present on homepage");
			File screenshotAs = logo.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("logo.png"));
			test.addScreenCaptureFromPath("logo.png");
		}else {
			test.log(Status.FAIL, "Adacting logo is not present on home page");
		}
	}
	@Test
	private void tc1() {
		 test = reports.createTest("Entering Username,Password& Login");
		 WebElement txtUserName = driver.findElement(By.id("username"));
		 txtUserName.sendKeys("karthi007");
		 test.log(Status.INFO, "Validating UserName field");
		 if (txtUserName.isEnabled()&&txtUserName.isDisplayed()) {
			test.log(Status.PASS, "Username field box is enabled and displayed");
		}else {
			test.log(Status.FAIL, "Username field box is not enabled and not displayed");
		}
		 WebElement txtPassword = driver.findElement(By.id("password"));
		 txtPassword.sendKeys("Karthi@1989");
		 test.log(Status.INFO, "Validating Password field");
		 if (txtPassword.isEnabled()&&txtPassword.isDisplayed()) {
			 test.log(Status.PASS, "Password field box is enabled and displayed");
		 }else {
			 test.log(Status.FAIL, "Password field box is not enabled and not displayed");
		 }
		 WebElement btnLogin = driver.findElement(By.id("login"));
		 btnClick(btnLogin);
		 test.log(Status.INFO, "Validating login field");
		 if (btnLogin.isEnabled()&&btnLogin.isSelected()) {
			test.log(Status.PASS, "Login field box is selected and enabled");
		} else {
			test.log(Status.FAIL, "Login field box is not selected and not enabled");
		}
	}
	
		 @Test
		 private void tc2() {
			 test = reports.createTest("Clicking Location, Hotels, Room Type & Search");
			 WebElement btnUser = driver.findElement(By.id("location"));
			 btnClick(btnUser);
			 visibleText(btnUser, "Sydney");
			 test.log(Status.INFO, "Validating Location field");
			 if (btnUser.isEnabled()&&btnUser.isDisplayed()) {
				test.log(Status.PASS, "Location field box is enabled and displayed");
			}else {
				test.log(Status.FAIL, "Location field box is not enabled and not displayed");
			}
			 WebElement btnHotel = driver.findElement(By.id("hotels"));
			 btnClick(btnHotel);
			 visibleText(btnHotel, "Hotel Creek");
			 test.log(Status.INFO, "Validating Hotel field");
			 if (btnHotel.isEnabled()&&btnHotel.isDisplayed()) {
				 test.log(Status.PASS, "Hotel field box is enabled and displayed");
			 }else {
				 test.log(Status.FAIL, "Hotel field box is not enabled and not displayed");
			 }
			 WebElement btnRoom = driver.findElement(By.id("room_type"));
			 btnClick(btnRoom);
			 visibleText(btnRoom, "Standard");
			 test.log(Status.INFO, "Validating Room field");
			 if (btnRoom.isEnabled()&&btnRoom.isDisplayed()) {
				test.log(Status.PASS, "Room field box is enabled and displayed");
			} else {
				test.log(Status.FAIL, "Room field box is not enabled and not displayed");
			}
			 WebElement btnSubmit = driver.findElement(By.id("Submit"));
			 btnClick(btnSubmit);
			 test.log(Status.INFO, "Validating Submit field");
			 if (btnSubmit.isEnabled()&&btnSubmit.isSelected()) {
				test.log(Status.PASS, "Submit field box is selected and enabled");
			} else {
				test.log(Status.FAIL, "Submit field box is not selected and not enabled");
			}
		}
		 @Test
		private void tc3() {
			 test = reports.createTest("Clicking Radio & Search");
			 WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
			 btnClick(btnRadio);
			 test.log(Status.INFO, "Validating Radio field");
			 if (btnRadio.isEnabled()&&btnRadio.isSelected()) {
				test.log(Status.PASS, "Radio field box is selected and enabled");
			} else {
				test.log(Status.FAIL, "Radio field box is not selected and not enabled");
			}
			 WebElement btnCont= driver.findElement(By.id("continue"));
			 btnClick(btnCont);
			 test.log(Status.INFO, "Validating Continue field");
			 if (btnCont.isEnabled()&&btnCont.isSelected()) {
				test.log(Status.PASS, "Continue field box is selected and enabled");
			} else {
				test.log(Status.FAIL, "Continue field box is not selected and not enabled");
			}
		}
		 @Test
		 private void tc4(){
			 test = reports.createTest("Entering First Name,Last Name,Address,Card no.,Card Type,Expiry Date,CVV");
			 WebElement txtFirst = driver.findElement(By.id("first_name"));
			 txtFirst.sendKeys("Vignesh");
			 test.log(Status.INFO, "Validating UserName field");
			 if (txtFirst.isEnabled()&&txtFirst.isDisplayed()) {
				test.log(Status.PASS, "FirstName field box is enabled and displayed");
			}else {
				test.log(Status.FAIL, "FirstName field box is not enabled and not displayed");
			}
			 WebElement txtLast = driver.findElement(By.id("last_name"));
			 txtLast.sendKeys("Viki1234");
			 test.log(Status.INFO, "Validating Password field");
			 if (txtLast.isEnabled()&&txtLast.isDisplayed()) {
				 test.log(Status.PASS, "LastName field box is enabled and displayed");
			 }else {
				 test.log(Status.FAIL, "LastName field box is not enabled and not displayed");
			 }
			 WebElement txtAdd = driver.findElement(By.id("address"));
			 txtAdd.sendKeys("Chennai");
			 test.log(Status.INFO, "Validating Address field");
			 if (txtAdd.isEnabled()&&txtAdd.isDisplayed()) {
				 test.log(Status.PASS, "Address field box is enabled and displayed");
			 }else {
				 test.log(Status.FAIL, "Address field box is not enabled and not displayed");
			 }
			 WebElement txtCard = driver.findElement(By.id("cc_num"));
			 txtCard.sendKeys("9812345678909876");
			 test.log(Status.INFO, "Validating Card field");
			 if (txtCard.isEnabled()&&txtCard.isDisplayed()) {
				 test.log(Status.PASS, "Card field box is enabled and displayed");
			 }else {
				 test.log(Status.FAIL, "Card field box is not enabled and not displayed");
			 }
			 WebElement btnCard = driver.findElement(By.id("cc_type"));
			 btnClick(btnCard);
			 visibleText(btnCard, "American Express");
			 test.log(Status.INFO, "Validating CreditCard field");
			 if (btnCard.isEnabled()&&btnCard.isDisplayed()) {
				test.log(Status.PASS, "CreditCard field box is enabled and displayed");
			} else {
				test.log(Status.FAIL, "CreditCard field box is not enabled and not displayed");
			}
			 WebElement btnMon = driver.findElement(By.id("cc_exp_month"));
			 btnClick(btnMon);
			 visibleText(btnMon, "April");
			 test.log(Status.INFO, "Validating Month field");
			 if (btnMon.isEnabled()&&btnMon.isDisplayed()) {
				test.log(Status.PASS, "Month field box is enabled and displayed");
			} else {
				test.log(Status.FAIL, "Month field box is not enabled and not displayed");
			}
			 WebElement btnYear = driver.findElement(By.id("cc_exp_year"));
			 btnClick(btnYear);
			 visibleText(btnYear, "2021");
			 test.log(Status.INFO, "Validating Year field");
			 if (btnYear.isEnabled()&&btnYear.isDisplayed()) {
				test.log(Status.PASS, "Year field box is enabled and displayed");
			} else {
				test.log(Status.FAIL, "Year field box is not enabled and not displayed");
			}
			 WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
			 txtCvv.sendKeys("467");
			 test.log(Status.INFO, "Validating Cvv field");
			 if (txtCvv.isEnabled()&&txtCvv.isDisplayed()) {
				 test.log(Status.PASS, "Cvv field box is enabled and displayed");
			 }else {
				 test.log(Status.FAIL, "Cvv field box is not enabled and not displayed");
			 }
			 WebElement btnBook = driver.findElement(By.id("book_now"));
			 btnClick(btnBook);
			 test.log(Status.INFO, "Validating Book field");
			 if (btnBook.isEnabled()&&btnBook.isDisplayed()) {
				 test.log(Status.PASS, "Book field box is enabled and displayed");
			 }else {
				 test.log(Status.FAIL, "Book field box is not enabled and not displayed");
			 }
		}
	@AfterClass
	private void afterClass() {
		reports.flush();
	}
}	

