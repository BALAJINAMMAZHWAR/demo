package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	public static WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;
	@FindBy(id = "continue")
	private WebElement continuee;

	public SelectHotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuee() {
		return continuee;
	}

}
