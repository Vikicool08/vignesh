package org.wb;
import org.fb.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Sign extends Base {
public Sign() {
	PageFactory.initElements(driver, this);
}
	@FindBy(id="location")
	private WebElement btnUser;
	@FindBy(id="hotels")
	private WebElement btnHotel;
	@FindBy(id="room_type")
	private WebElement btnRoom;
	@FindBy(id="Submit")
	private WebElement btnSub;
	public WebElement getBtnUser() {
		return btnUser;
	}
	public WebElement getBtnHotel() {
		return btnHotel;
	}
	public WebElement getBtnRoom() {
		return btnRoom;
	}
	public WebElement getBtnSub() {
		return btnSub;
	}
}
