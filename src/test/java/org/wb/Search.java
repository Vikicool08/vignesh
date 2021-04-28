package org.wb;
import org.fb.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Search extends Base {
public Search() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_0")
private WebElement btnRadio;
@FindBy(id="continue")
private WebElement btnClk;
public WebElement getBtnRadio() {
	return btnRadio;
}
public WebElement getBtnClk() {
	return btnClk;
}
}
