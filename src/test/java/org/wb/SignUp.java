package org.wb;
import org.fb.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignUp extends Base {
public SignUp() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
private WebElement txtFirstUser;
@FindBy(id="last_name")
private WebElement txtLastUser;
@FindBy(id="address")
private WebElement txtAdd;
@FindBy(id="cc_num")
private WebElement txtCard;
@FindBy(id="cc_type")
private WebElement btnCard;
@FindBy(id="cc_exp_month")
private WebElement btnmon;
@FindBy(id="cc_exp_year")
private WebElement btnYear;
@FindBy(id="cc_cvv")
private WebElement btnCv;
@FindBy(id="book_now")
private WebElement btnBook;
public WebElement getTxtFirstUser() {
	return txtFirstUser;
}
public WebElement getTxtLastUser() {
	return txtLastUser;
}
public WebElement getTxtAdd() {
	return txtAdd;
}
public WebElement getTxtCard() {
	return txtCard;
}
public WebElement getBtnCard() {
	return btnCard;
}
public WebElement getBtnmon() {
	return btnmon;
}
public WebElement getBtnYear() {
	return btnYear;
}
public WebElement getBtnCv() {
	return btnCv;
}
public WebElement getBtnBook() {
	return btnBook;
}
}
