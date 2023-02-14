package com.Runner;

import org.openqa.selenium.WebDriver;

import com.Pom.BookHotelPage;
import com.Pom.BookingConfirm_LogOutPage;
import com.Pom.LogInPage;
import com.Pom.SearchHotelPage;
import com.Pom.SelectHotelPage;

public class RunnerClassForPom extends com.Baseclass.BaseClass {
	public static WebDriver driver = launchBrowser("chrome");
	public static LogInPage lp = new LogInPage(driver);
	public static SearchHotelPage sh = new SearchHotelPage(driver);
	public static SelectHotelPage shp = new SelectHotelPage(driver);
	public static BookHotelPage bhp = new BookHotelPage(driver);
	public static BookingConfirm_LogOutPage bc = new BookingConfirm_LogOutPage(driver);

	public static void main(String[] args) {
		launchUrl("https://adactinhotelapp.com/");
		LogInPage lp = new LogInPage(driver);
		passInput(lp.getUsername(), "balajinammazhwar");
		passInput(lp.getPassword(), "priyabala89");
		clickOnElement(lp.getLogin());

		SearchHotelPage sh = new SearchHotelPage(driver);
		dropDown(sh.getSearch(), "value", "Sydney", 0);
		dropDown(sh.getHotels(), "value", "Hotel Creek", 0);
		dropDown(sh.getRoomtype(), "value", "Deluxe", 2);
		dropDown(sh.getRoomnos(), "value", "1", 0);
		dropDown(sh.getAdultroom(), "value", "2", 1);
		dropDown(sh.getChildroom(), "value", "2", 1);
		clickOnElement(sh.getSubmit());

		SelectHotelPage shp = new SelectHotelPage(driver);
		radioButton(shp.getRadiobtn());
		clickOnElement(shp.getContinuee());

		BookHotelPage bhp = new BookHotelPage(driver);
		passInput(bhp.getFn(), "Balaji");
		passInput(bhp.getLn(), "Nammazhwar");
		passInput(bhp.getAddr(), "Plot.no.85, 1st floor, Mahatma Gandhi Nagar, Sikkarayapuram, Kovur EB, Chennai-128");
		passInput(bhp.getCcnum(), "1234567887456123");
		dropDown(bhp.getCctype(), "value", "AMEX", 0);
		dropDown(bhp.getExpmonth(), "value", "2", 1);
		dropDown(bhp.getExpyear(), "value", "2022", 11);
		passInput(bhp.getCvv(), "023");
		clickOnElement(bhp.getBooknow());

		BookingConfirm_LogOutPage bc = new BookingConfirm_LogOutPage(driver);
		clickOnElement(bc.getLogout());
	}

}
