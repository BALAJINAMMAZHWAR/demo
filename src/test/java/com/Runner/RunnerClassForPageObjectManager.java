package com.Runner;
import org.openqa.selenium.WebDriver;
import com.PageObjectManagerSDP.PageObjectManager;
public class RunnerClassForPageObjectManager extends com.Baseclass.BaseClass{
public static WebDriver driver=launchBrowser("chrome");
public static  PageObjectManager pom = new PageObjectManager(driver);

public static void main(String[] args) {
	
	launchUrl("https://adactinhotelapp.com/");
//Login
	passInput(pom.getInstanceLogIn().getUsername(), "balajinammazhwar");
	passInput(pom.getInstanceLogIn().getPassword(), "priyabala89");
	clickOnElement(pom.getInstanceLogIn().getLogin());
//Search Hotel
	dropDown(pom.getInstancesh().getSearch(), "value", "Sydney", 0);
	dropDown(pom.getInstancesh().getHotels(), "value", "Hotel Creek", 0);
	dropDown(pom.getInstancesh().getRoomtype(), "value", "Deluxe", 2);
	dropDown(pom.getInstancesh().getRoomnos(), "value", "1", 0);
	dropDown(pom.getInstancesh().getAdultroom(), "value", "2", 1);
	dropDown(pom.getInstancesh().getChildroom(), "value", "2", 1);
	clickOnElement(pom.getInstancesh().getSubmit());
//Select Hotel	
	radioButton(pom.getInstanceshp().getRadiobtn());
	clickOnElement(pom.getInstanceshp().getContinuee());
//Book Hotel
	passInput(pom.getInstancebhp().getFn(), "Balaji");
	passInput(pom.getInstancebhp().getLn(), "Nammazhwar");
	passInput(pom.getInstancebhp().getAddr(), "Sikkarayapuram, Kovur EB, Chennai-128");
	passInput(pom.getInstancebhp().getCcnum(), "1234567887456123");
	dropDown(pom.getInstancebhp().getCctype(), "value", "AMEX", 0);
	dropDown(pom.getInstancebhp().getExpmonth(), "value", "2", 1);
	dropDown(pom.getInstancebhp().getExpyear(), "value", "2022", 11);
	passInput(pom.getInstancebhp().getCvv(), "023");
	clickOnElement(pom.getInstancebhp().getBooknow());
//Booking Confirm_LogOUT
	clickOnElement(pom.getInstancebc().getLogout());
}	
	
}
