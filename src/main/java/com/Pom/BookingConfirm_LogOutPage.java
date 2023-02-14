package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm_LogOutPage {
public static WebDriver driver;
@FindBy(xpath="//a[@href='Logout.php']")
private WebElement logout;
public BookingConfirm_LogOutPage(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getLogout() {
	return logout;
}	
	
}
