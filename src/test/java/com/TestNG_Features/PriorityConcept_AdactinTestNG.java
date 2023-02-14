package com.TestNG_Features;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PageObjectManagerSDP.PageObjectManager;

public class PriorityConcept_AdactinTestNG extends com.Baseclass.BaseClass{
	public static WebDriver driver=launchBrowser("chrome");
	PageObjectManager pom = new PageObjectManager(driver);
	@Test(priority = -1)
private void login() {
	launchUrl("https://adactinhotelapp.com/");
	passInput(pom.getInstanceLogIn().getUsername(), "balajinammazhwar");
	passInput(pom.getInstanceLogIn().getPassword(), "priyabala89");
	clickOnElement(pom.getInstanceLogIn().getLogin());
}
	@Test(priority = 0)
	private void searchHotel() {
		dropDown(pom.getInstancesh().getSearch(), "value", "Sydney", 0);
		dropDown(pom.getInstancesh().getHotels(), "value", "Hotel Creek", 0);
		dropDown(pom.getInstancesh().getRoomtype(), "value", "Deluxe", 2);
		dropDown(pom.getInstancesh().getRoomnos(), "value", "1", 0);
		dropDown(pom.getInstancesh().getAdultroom(), "value", "2", 1);
		dropDown(pom.getInstancesh().getChildroom(), "value", "2", 1);
		clickOnElement(pom.getInstancesh().getSubmit());
	}
	@Test(priority = 1)
	private void selectHotel() {
		radioButton(pom.getInstanceshp().getRadiobtn());
		clickOnElement(pom.getInstanceshp().getContinuee());
	}
	@Test(priority = 2)
	private void bookHotel() {
		passInput(pom.getInstancebhp().getFn(), "Balaji");
		passInput(pom.getInstancebhp().getLn(), "Nammazhwar");
		passInput(pom.getInstancebhp().getAddr(), "Plot.no.85, 1st floor, Mahatma Gandhi Nagar, Sikkarayapuram, Kovur EB, Chennai-128");
		passInput(pom.getInstancebhp().getCcnum(), "1234567887456123");
		dropDown(pom.getInstancebhp().getCctype(), "value", "AMEX", 0);
		dropDown(pom.getInstancebhp().getExpmonth(), "value", "2", 1);
		dropDown(pom.getInstancebhp().getExpyear(), "value", "2022", 11);
		passInput(pom.getInstancebhp().getCvv(), "023");
		clickOnElement(pom.getInstancebhp().getBooknow());
		
	}
	
	@Test(priority = 3)
	private void logOut() {
		clickOnElement(pom.getInstancebc().getLogout());
	}
	
}
