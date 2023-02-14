package com.PageObjectManagerSDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//private Datatype variable;
//private Webelement refname;
//private clssname obj;

import com.Pom.BookHotelPage;
import com.Pom.BookingConfirm_LogOutPage;
import com.Pom.LogInPage;
import com.Pom.SearchHotelPage;
import com.Pom.SelectHotelPage;

public class PageObjectManager {
	public static WebDriver driver;
	
	private LogInPage lp;
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public LogInPage getInstanceLogIn() {
		 lp = new LogInPage(driver);
		return lp;
	}  
	private SearchHotelPage sh;
	public SearchHotelPage getInstancesh() {
		 sh = new SearchHotelPage(driver);
		return sh;
	}
private SelectHotelPage shp;
	public SelectHotelPage getInstanceshp() {
		 shp = new SelectHotelPage(driver);
		return shp;
	}
private BookHotelPage bhp;
	public BookHotelPage getInstancebhp() {
		 bhp = new BookHotelPage(driver);
		return bhp;
	}
private BookingConfirm_LogOutPage bc;
	public BookingConfirm_LogOutPage getInstancebc() {
		 bc = new BookingConfirm_LogOutPage(driver);
		return bc;
	}

}
